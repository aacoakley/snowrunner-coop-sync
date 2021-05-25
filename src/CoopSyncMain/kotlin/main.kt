import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import platform.posix.NULL
import platform.posix.close
import platform.posix.fclose
import platform.posix.fgets
import platform.posix.fopen
import platform.posix.fputs
import platform.posix.printf

fun main() {
    println("Hello, Kotlin/Native!")
//    val json = Json.decodeFromString<JsonElement>()
    val returnBuffer = StringBuilder()
    val file = fopen("/Users/acoakley/source/other/SnowRunnerCoopSync/src/CoopSyncMain/resources/CompleteSave.dat", "r") ?: throw IllegalArgumentException("Cannot open input file")

    try {
        memScoped {
            val readBufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(readBufferLength)
            var line = fgets(buffer, readBufferLength, file)?.toKString()
            while (line != null) {
                returnBuffer.append(line)
                line = fgets(buffer, readBufferLength, file)?.toKString()
            }
        }
    } finally {
        fclose(file)
    }
//    buildJsonObject {  }
    val wFile = fopen("/Users/acoakley/source/other/SnowRunnerCoopSync/src/CoopSyncMain/resources/NewFile.txt", "w")
        ?: throw IllegalArgumentException("Cannot open output file ")

    try {
        memScoped {
            fputs(returnBuffer.toString() + "\u0000", wFile)
        }
    } finally {
        fclose(wFile)
    }

    printf(returnBuffer.toString())
}