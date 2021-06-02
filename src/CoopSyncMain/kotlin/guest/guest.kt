package guest

import MattsSave
import data.SaveFile
import data.SavePath
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
import util.Serializer.json

fun main(args: Array<String>) {
    infoln("Hello guest.guest")
    infoln(SaveFields.DISCOVERED_OBJECTIVES.fieldName)
    val savePath = parseArgs(args)
    savePath.backupSaveFiles()

    val originalSave = SaveFile(json.parseToJsonElement(MattsSave.data))
    val preSessionSave = SaveFile(json.parseToJsonElement(OldSave.data))
    val postSessionSave = SaveFile(json.parseToJsonElement(CompleteSave.data))

    val discoveredObjectives = "discoveredObjectives"
    val viewedUnactivatedObjectives = "viewedUnactivatedObjectives"

    val saveData = mutableMapOf<String, JsonElement>()
    saveData[discoveredObjectives] = originalSave.discoveredObjectives().diff(
        preSessionSave.discoveredObjectives(),
        postSessionSave.discoveredObjectives()
    )
    saveData[viewedUnactivatedObjectives] =
        originalSave.viewedUnactivatedObjectives().processViewedUnactivatedObjectives(
            preSessionSave.viewedUnactivatedObjectives(),
            postSessionSave.viewedUnactivatedObjectives()
        )


//    originalSave.ownedTrucks = diff(preSessionSave.ownedTrucks, postSessionSave.ownedTrucks).import(originalSave.ownedTrucks)
//    originalSave.newTrucks = diff(preSessionSave.newTrucks, postSessionSave.newTrucks).import(originalSave.newTrucks)
//    originalSave.objectiveStates = diff(preSessionSave.objectiveStates, postSessionSave.objectiveStates).import(originalSave.objectiveStates)
//    originalSave.watchPointsData = diff(preSessionSave.watchPointsData, postSessionSave.watchPointsData).import(originalSave.watchPointsData)
//    originalSave.discoveredTrucks = diff(preSessionSave.discoveredTrucks, postSessionSave.discoveredTrucks).import(originalSave.discoveredTrucks)
//    originalSave.visitedLevels = diff(preSessionSave.visitedLevels, postSessionSave.visitedLevels).import(originalSave.visitedLevels)

//    originalSave.discoveredObjectives().toList().forEach { infoln(it) }
//    val newSave: MutableMap<String, JsonElement> = originalSave.fullJsonElement.jsonObject.entries.toMap()

    val elementEntries = originalSave.fullJsonElement.readSave().toMap()

    val newSave = buildJsonObject {
        putJsonObject("CompleteSave") {
            putJsonObject("SslValue") {
                elementEntries.forEach {
                    put(it.key, it.value)
                }
                saveData[discoveredObjectives]?.let { put(discoveredObjectives, it) }
                saveData[viewedUnactivatedObjectives]?.let { put(viewedUnactivatedObjectives, it) }
                put("SslType", originalSave.fullJsonElement.jsonObject["CompleteSave"]!!.jsonObject["SslType"]!!)
            }
            put("cfg_version", originalSave.fullJsonElement.jsonObject["cfg_version"]!!)
        }

    }


    infoln(newSave.toString())

//    newSave["discoveredObjectives"] = json.encodeToJsonElement(discoveredObjectives)

//    writeAllText(".\\build\\out\\OriginalSave.json", json.encodeToString(originalSave))
    writeAllText(".\\NewSave.json", json.encodeToString(newSave))
}

fun JsonElement.readSave(vararg jsonPointer: String): JsonElement {
    var jsonElement = this.jsonObject["CompleteSave"]!!.jsonObject["SslValue"]!!
    jsonPointer.forEach { jsonElement = jsonElement.jsonObject[it]!! }
    return jsonElement
}


fun JsonObjectBuilder.traverse(element: JsonElement, saveData: Map<String, JsonElement>) {
    element.jsonObject.values.forEach { if (it is JsonObject) traverse(it, saveData) }
    val intersection = element.jsonObject.keys.intersect(SaveFields.values().map { it.fieldName })
    if (intersection.isNotEmpty()) {
        intersection.forEach {
            when (it) {
                SaveFields.DISCOVERED_OBJECTIVES.fieldName -> {
                    infoln(element.jsonObject.entries.toString())
                    saveData[it]?.let { array ->
                        put(it, array)
                    }
                }
            }
        }
    }
}

fun List<String>.processViewedUnactivatedObjectives(
    preSessionSave: List<String>,
    postSessionSave: List<String>
): JsonArray {
    var objs: List<String> = this
    var prunedPreSeshSave: List<String> = preSessionSave
    preSessionSave.forEach {
        infoln("DFASFAD $it")
        if (!postSessionSave.contains(it)) {
            objs = minus(it)
            prunedPreSeshSave = preSessionSave.minus(it)
        }
    }
    return objs.diff(prunedPreSeshSave, postSessionSave)
}

fun List<String>.diff(preSessionSave: List<String>, postSessionSave: List<String>): JsonArray {
    val diff = postSessionSave.toSet().minus(preSessionSave.toSet())

//    infoln("Original: ${preSessionSave.size}")
//    infoln("Import: ${postSessionSave.size}")
//    infoln("Diff: ${diff.size}")
//
//    diff.forEach { it.info() }
    val set = diff.toMutableSet().also { it.addAll(this) }
    set.forEach { println(it) }
    return buildJsonArray {
        set.forEach { add(it) }
    }
}

private fun diff(preSessionSave: JsonObject, postSessionSave: JsonObject): Map<String, JsonElement> {
    infoln("IN THE DIFF")
    val preObjects = preSessionSave.toMap()
    val postObjects = postSessionSave.toMap()
    val diffs = mutableMapOf<String, JsonElement>()

    postObjects.forEach {
        if (json.decodeFromJsonElement<JsonElement>(it.value) != preObjects[it.key]?.let { ti ->
                json.decodeFromJsonElement(
                    JsonElement.serializer(),
                    ti
                )
            }) {
            diffs[it.key] = it.value
        }
    }
    diffs.forEach { infoln("${it.key}: ${it.value}") }
    return diffs
}

inline fun JsonElement.toList() = json.decodeFromJsonElement<List<String>>(this)

inline fun Map<String, JsonElement>.import(original: MutableMap<String, JsonElement>) {
    this.forEach {
        original[it.key] = it.value
    }
}

inline fun JsonElement.toMap(): MutableMap<String, JsonElement> {
    return jsonObject.toMutableMap()
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