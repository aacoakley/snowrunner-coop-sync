package guest

import data.SaveFile
import data.SavePath
import extensions.backupSaveFiles
import extensions.moveNewFiles
import extensions.readFile
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import util.Constants
import util.Json.json

fun main(args: Array<String>) {
    val savePath = parseArgs(args)
    savePath.backupSaveFiles()

    val originalSave = SaveFile(json.parseToJsonElement(savePath.readFile()))
    val preSessionSave = SaveFile(json.parseToJsonElement(savePath.readFile(path = savePath.secondaryPath)))
    val postSessionSave = SaveFile(
        json.parseToJsonElement(
            savePath.readFile(
                path = savePath.secondaryPath,
                name = savePath.name.replaceAfter('.', "bak")
            )
        )
    )

    val newSave = JsonProcessor().syncSaves(originalSave, preSessionSave, postSessionSave)
    savePath.moveNewFiles(newSave)
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
    val importPath by parser.option(
        ArgType.String,
        shortName = "e",
        description = "Location where the import save data will be"
    ).default(Constants.defaultImportPath)

    parser.parse(args)
    return SavePath(dir, saveFile, saveSlot, importPath)
}