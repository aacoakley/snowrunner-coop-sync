import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.jsonObject
import platform.posix.printf
import platform.posix.system

fun main(args: Array<String>) {
    infoln("Start: ")
    val saveFile = parseSaveGame(args)
    infoln("Path: ${saveFile.path}")
    infoln("Path for backup folder: ${saveFile.backupLocation}")
    infoln("Save game name: ${saveFile.name}")
    saveFile.backupSaveFiles()

    infoln("Reading original save file")
    val json = Json.parseToJsonElement(saveFile.readFile())
    val discoveredObjectives = json.jsonObject["CompleteSave"]!!
        .jsonObject["SslValue"]!!
        .jsonObject["discoveredObjectives"]?.info()

    system("start steam://rungameid/1465360")

    waitForSessionEnd()

    infoln("Session closed")
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

private fun parseSaveGame(args: Array<String>): SaveFile {
    val parser = ArgParser("CoopSync")
    val dir by parser.option(ArgType.String, shortName = "d", description = "Your current save file location").default(Constants.defaultPath)
    val saveFile by parser.option(ArgType.String, shortName = "f", description = "Save file name including extension. Should be something like CompleteSave.*").default(Constants.defaultName)
    val saveSlot by parser.option(ArgType.Int, shortName = "s", description = "Which save slot you are using. Should be 1, 2, 3, or 4").default(Constants.defaultPrefix)

    parser.parse(args).info("Parser result: ")
    dir.info()
    saveFile.info()
    saveSlot.info()
    return SaveFile(dir, saveFile, saveSlot)
}