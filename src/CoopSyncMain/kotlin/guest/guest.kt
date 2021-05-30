package guest

import data.SaveFile
import data.SavePath
import extensions.*
import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType
import kotlinx.cli.default
import kotlinx.serialization.PolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonObject
import util.CompleteSave
import util.Constants
import util.OldSave
import util.Serializer
import util.Serializer.json as json


fun main(args: Array<String>) {
    infoln("Hello guest.guest")
    val savePath = parseArgs(args)
    savePath.backupSaveFiles()

    val originalSave = SaveFile(json.parseToJsonElement(MattsSave.data))
    val preSessionSave = SaveFile(json.parseToJsonElement(OldSave.data))
    val postSessionSave = SaveFile(json.parseToJsonElement(CompleteSave.data))

//    infoln("Diffing")
//        val diff = jsonElement + jsonElement1
//        .groupBy { it }
//        .filter { it.value.size == 1 }
//        .flatMap { it.value }
//

    val diffDiscObj = diff(preSessionSave.discoveredObjectives, postSessionSave.discoveredObjectives)
    val diffObjState = diff(preSessionSave.objectiveStates, postSessionSave.objectiveStates)
    val diffWatchPoints = diff(preSessionSave.watchPointsData, postSessionSave.watchPointsData)
    val diffDiscoveredTrucks = diff(preSessionSave.discoveredTrucks, postSessionSave.discoveredTrucks)

}

private fun diff(preSessionSave: JsonObject, postSessionSave: JsonObject): MutableMap<String, JsonElement> {
    infoln("IN THE DIFF")
    val preObjects = preSessionSave.entries.toMap()
    val postObjects = postSessionSave.entries.toMap()
    val diffs = mutableMapOf<String, JsonElement>()

    postObjects.forEach {
        if (json.decodeFromJsonElement<JsonElement>(it.value) != preObjects[it.key]?.let { ti -> json.decodeFromJsonElement(JsonElement.serializer(), ti) }) {
            diffs[it.key] = it.value
        }
    }
    diffs.forEach { infoln("${it.key}: ${it.value}") }
    return diffs
}

private inline fun <reified T> Set<Map.Entry<String, T>>.toMap(): Map<String, T> {
    val map = mutableMapOf<String, T>()
    this.forEach { map[it.key] = it.value }
    return map
}

private fun diff(preSessionSave: List<String>, postSessionSave: List<String>): List<String> {
    val diff = postSessionSave.toSet().minus(preSessionSave.toSet())
    infoln("Original: ${preSessionSave.size}")
    infoln("Import: ${postSessionSave.size}")
    infoln("Diff: ${diff.size}")

    diff.forEach { it.info() }
    return diff.toList()
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