import kotlinx.cinterop.memScoped
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import platform.posix.*

fun main() {
    println(Path.get())
    println(Path.getBackup())
    backupSave()

    val result = "tasklist /FO CSV /FI \"ImageName eq SnowRunner.exe\" /NH".executeCommand()
    println("RESULT: $result")

    val json = Json.parseToJsonElement("${Path.get()}\\CompleteSave.cfg".readFile())
    val discoveredObjectives = json.jsonObject["CompleteSave"]!!
        .jsonObject["SslValue"]!!
        .jsonObject["discoveredObjectives"]

    println(discoveredObjectives.toString())

//    system("start steam://rungameid/1465360")

    waitForSessionEnd()

    println("Session closed")


}

fun waitForSessionEnd() = runBlocking {
        val imageName = "SnowRunner.exe"
        val notFound = "INFO:"
        val command = "tasklist /FO CSV /FI \"ImageName eq SnowRunner.exe\" /NH"

        waitForProcess(command, notFound)
        waitForProcess(command, imageName)
}

suspend fun waitForProcess(command: String, message: String) {
    while (command.executeCommand().contains(message)) {
        delay(2000L)
    }
}

object Path {
    fun get(): String {
        return "cd %PROGRAMFILES(X86)%\\steam\\userdata\\*0\\1465360\\remote && cd".executeCommand()
            .replace("Program Files (x86)", "\"Program Files (x86)\"")
            .filter { it != ('\n') }
    }

    fun getBackup(): String {
        return get() + "\\backupSaves"
    }
}