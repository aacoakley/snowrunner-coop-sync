package host

import data.SavePath
import extensions.backupSaveFiles
import extensions.executeCommand
import extensions.infoln
import extensions.packageSaveState
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import platform.posix.system
import util.Constants

fun main(args: Array<String>) {
    infoln("Start: ")
    val savePath = parseArgs(args)
    infoln("Path: ${savePath.path}")
    infoln("Path for backup folder: ${savePath.backupLocation}")
    infoln("Save game name: ${savePath.name}")
    savePath.backupSaveFiles()

    system("start steam://rungameid/1465360")

    waitForSessionEnd()
    packageSaveState(savePath)
    infoln("Session closed: ")
}

fun waitForSessionEnd() = runBlocking {
    //we are looking for this in the running tasks
    val imageName = "SnowRunner.exe"
    //INFO: will be returned if SnowRunner.exe is not found
    val notFound = "INFO:"
    val command = "tasklist /FO CSV /FI \"ImageName eq SnowRunner.exe\" /NH"

    waitForProcess(command, notFound)
    waitForProcess(command, imageName)
}

suspend fun waitForProcess(command: String, message: String) {
    while (command.executeCommand().contains(message)) {
        delay(3000L)
    }
}

private fun parseArgs(args: Array<String>): SavePath {
    val parser = ArgParser("CoopSync")
    val dir by parser.option(ArgType.String, shortName = "d", description = "Your current save file location")
        .default(Constants.defaultPath)
    val saveFile by parser.option(
        ArgType.String,
        shortName = "f",
        description = "Save file name including extension. Should be like CompleteSave.*"
    ).default(Constants.defaultName)
    val saveSlot by parser.option(
        ArgType.Int,
        shortName = "s",
        description = "Which save slot you are using. Should be 1, 2, 3, or 4"
    ).default(Constants.defaultSlot)
    val exportPath by parser.option(
        ArgType.String,
        shortName = "e",
        description = "Location where the exported saves data will go post-session"
    ).default(Constants.defaultExportPath)

    parser.parse(args)
    return SavePath(dir, saveFile, saveSlot, exportPath)
}