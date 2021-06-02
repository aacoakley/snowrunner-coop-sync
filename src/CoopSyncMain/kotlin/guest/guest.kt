package guest

import MattsSave
import data.Json.JsonBuilder.json
import data.SaveFile
import data.SavePath
import data.syncSaves
import extensions.backupSaveFiles
import extensions.infoln
import extensions.writeAllText
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*
import util.CompleteSave
import util.Constants
import util.OldSave
import util.SaveFields

fun main(args: Array<String>) {
    val savePath = parseArgs(args)
    savePath.backupSaveFiles()

    val originalSave = SaveFile(json.parseToJsonElement(MattsSave.data))
    val preSessionSave = SaveFile(json.parseToJsonElement(OldSave.data))
    val postSessionSave = SaveFile(json.parseToJsonElement(CompleteSave.data))

    syncSaves(originalSave, preSessionSave, postSessionSave)

    TODO("Implement file movement")
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
    ).default(Constants.defaultPrefix)
    val importPath by parser.option(
        ArgType.String,
        shortName = "e",
        description = "Location where the exported saves data will go post-session"
    ).default(Constants.defaultExportPath)

    parser.parse(args)
    return SavePath(dir, saveFile, saveSlot, importPath)
}