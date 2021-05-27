import kotlinx.cinterop.*
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import platform.posix.*
import platform.windows.DATE

inline fun backupSave() = system("mkdir ${Path.get()} & copy ${Path.get()}\\CompleteSave.cfg " +
        "${Path.getBackup()}\\CompleteSave.${Clock.System.now().epochSeconds} /Y".also { println("DEBUG: $it") })

inline fun String.readFile(): String {
    val returnBuffer = StringBuilder()
    val fp = fopen(this@readFile, "r")
        ?: throw IllegalArgumentException("Cannot open input file with path: ${this@readFile}")

    try {
        memScoped {
            val readBufferLength = 64 * 1024
            val buffer = allocArray<ByteVar>(readBufferLength)
            var line = fgets(buffer, readBufferLength, fp)?.toKString()
            while (line != null) {
                returnBuffer.append(line)
                line = fgets(buffer, readBufferLength, fp)?.toKString()
            }
        }
    } finally {
        fp.close()
    }

    if (returnBuffer.isEmpty()) {
        throw IllegalArgumentException("Save file empty: $this")
    }

    return returnBuffer.toString()
}

inline fun openPipe(str: String): CPointer<FILE> = _popen(str, "r")
    ?: throw IllegalArgumentException("Unable to parse string: \"$str\".")

inline fun CPointer<FILE>.close() = _pclose(this)

inline fun String.executeCommand(): String = memScoped {
    val fp = openPipe(this@executeCommand)
    val length = 4096
    val buffer = allocArray<ByteVar>(length)
    fgets(buffer, length, fp)?.toKString().also {
        println(it)
        fp.close()
    } ?: throw NullPointerException("Unable to run command of: ${this@executeCommand}")

}
