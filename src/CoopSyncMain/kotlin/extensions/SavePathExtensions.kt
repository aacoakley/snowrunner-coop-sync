package extensions

import data.SavePath
import platform.posix.system
import util.Constants
import util.Time

fun SavePath.getSaveFiles(): List<String> = "dir $path /B".executeCommand()
    .lines()
    .filter {
        it.startsWith("fog".prepend(saveSlot))
                || it.startsWith("sts".prepend(saveSlot))
                || it == name
    }

fun SavePath.moveNewFiles(newSave: String) {
    val files = getSaveFiles()
    removeOldFiles(files)

    files.minus(name)
        .forEach { copy(fileName = it, fileLocation = secondaryPath, copyLocation = path, copiedFileName = it) }

    writeAllText("$path\\$name)", newSave)
}

inline fun SavePath.backupSaveFiles() = getSaveFiles().forEach { copy(it) }
inline fun SavePath.removeOldFiles(files: List<String>) = files.forEach { "del $path\\$it" }

inline fun String.prepend(saveSlot: Int): String = if (saveSlot > 0) "${saveSlot}_$this" else this
inline fun String.append(saveSlot: Int): String = if (saveSlot > 0) "$this$saveSlot" else this

inline fun SavePath.copy(
    fileName: String,
    fileLocation: String = path,
    copiedFileName: String = fileName,
    copyLocation: String = backupLocation
) = "copy $fileLocation\\$fileName $copyLocation\\$copiedFileName /Y".executeCommand()

inline fun String.makeDir(): String = "mkdir $this".executeCommand()
    .info("Successfully made directory $this")
    .let { this }

fun packageSaveState(savePath: SavePath) {
    val snowRunnerFolder = "${savePath.secondaryPath}\\${Constants.snowRunnerFolder}".makeDir()
    val tmpFolder = "${snowRunnerFolder}\\${Time.instant()}".makeDir()
    //copy save files to a temp directory for compression
    savePath.getSaveFiles().forEach { savePath.copy(fileName = it, copyLocation = tmpFolder) }
    //copying the pre-session save file for diffing when importing changes from the session
    savePath.copy(savePath.name, savePath.backupLocation, savePath.name.replaceAfter('.', "bak"), tmpFolder)
    //copy the guest .exe to the folder for ease of use
    savePath.copy(fileName = Constants.guestExeName, fileLocation = ".", copyLocation = snowRunnerFolder)
    //compress for easy transfer
    "cd ${savePath.secondaryPath} && tar.exe -acf SnowRunnerSync.zip ${Constants.snowRunnerFolder}".executeCommand()
        .info("Compressing Save Data")
    //delete tmp folder
    "rmdir /s /q ${savePath.secondaryPath}\\SnowRunnerSync".executeCommand().info("Cleaning up temp folder")
}