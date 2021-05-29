import platform.posix.system

class SaveFile(rawPath: String, fileName: String, private val saveSlot: Int) {

    val path = "$rawPath && cd".executeCommand()
        .replace("Program Files (x86)", "\"Program Files (x86)\"")
        .filter { it != ('\n') }
        .info("Path: ")
    val backupLocation = "$path\\backupSaves\\${Time.instant()}".info("Backup Path: ").also { makeDir(it) }
    val name = fileName.prepend().info("File name: ")

    fun backupSaveFiles() {
        infoln("Backing up save files...")
        "dir $path /B".executeCommand()
            .lines()
            .filter { it.startsWith("fog".prepend()) || it.startsWith("sts".prepend()) || it == name.append() }
            .forEach { backup(it) }
    }

    private inline fun String.prepend(): String = if (saveSlot > 0) "${saveSlot}_$this" else this
    private inline fun String.append(): String = if (saveSlot > 0) "$this$saveSlot" else this

    private fun backup(fileName: String) {
        infoln("Copying $fileName...")
        system("copy $path\\$fileName $backupLocation\\$fileName /Y")
    }

    private fun makeDir(path: String) {
        system("mkdir $path").info("Successfully made directory $path")
    }
}