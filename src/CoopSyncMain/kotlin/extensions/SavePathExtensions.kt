package extensions

import data.SavePath
import platform.posix.system
import util.Constants
import util.Time

inline fun SavePath.getSaveFiles(): List<String> = "dir $path /B".executeCommand()
    .lines()
    .filter {
        it.startsWith("fog".prepend(saveSlot))
                || it.startsWith("sts".prepend(saveSlot))
                || it == name.append(saveSlot)
    }

inline fun SavePath.backupSaveFiles() = getSaveFiles().forEach { copy(it) }

inline fun String.prepend(saveSlot: Int): String = if (saveSlot > 0) "${saveSlot}_$this" else this
inline fun String.append(saveSlot: Int): String = if (saveSlot > 0) "$this$saveSlot" else this

inline fun SavePath.copy(
    fileName: String,
    fileLocation: String = this.path,
    copiedFileName: String = fileName,
    copyLocation: String = this.backupLocation
) = system("copy $fileLocation\\$fileName $copyLocation\\$copiedFileName /Y")
//    .info("copy $fileLocation\\$fileName $copyLocation\\$copiedFileName")

inline fun String.makeDir(): String = system("mkdir $this")
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
    system("cd ${savePath.secondaryPath} && tar.exe -acf SnowRunnerSync.zip ${Constants.snowRunnerFolder}").info("Compressing Save Data. Exit code: ")
    //delete tmp folder
    system("rmdir /s /q SnowRunnerSync").info("Cleaning up temp folder. Exit code: ")
}