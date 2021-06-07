package data

import extensions.*
import util.Time

class SavePath(rawPath: String, fileName: String, saveSlot: Int, secondaryPath: String) {
    val path = "cd $rawPath && cd".executeCommand()
        .replace("Program Files (x86)", "\"Program Files (x86)\"")
        .filter { it != ('\n') }
        .info("Path: ")

    val backupLocation = "$path\\backupSaves\\${Time.instant()}".info("Backup Path: ").also { it.makeDir() }

    val name = fileName.append(saveSlot).info("File name: ")

    val secondaryPath = "cd $secondaryPath && cd".executeCommand()
        .filter { it != ('\n') }

    //Save files start at 0
    val saveSlot = saveSlot - 1
}