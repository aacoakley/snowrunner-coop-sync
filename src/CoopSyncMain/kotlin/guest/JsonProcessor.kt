package guest

import util.Json.json
import data.SaveFile
import extensions.infoln
import extensions.writeAllText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.*

class JsonProcessor {
    fun syncSaves(originalSave: SaveFile, preSessionSave: SaveFile, postSessionSave: SaveFile): String {
        val discoveredObjectives = "discoveredObjectives"
        val viewedUnactivatedObjectives = "viewedUnactivatedObjectives"
        val watchPointsData = "watchPointsData"
        val visitedLevels = "visitedLevels"
        val objectiveStates = "objectiveStates"
        val discoveredTrucks = "discoveredTrucks"
        val newTrucks = "newTrucks"
        val ownedTrucks = "ownedTrucks"

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
        saveData[watchPointsData] = originalSave.watchPointsData().diff(preSessionSave.watchPointsData(), postSessionSave.watchPointsData())
        saveData[visitedLevels] = originalSave.visitedLevels().diff(preSessionSave.visitedLevels(), postSessionSave.visitedLevels())
        saveData[objectiveStates] = originalSave.objectiveStates().diff(preSessionSave.objectiveStates(), postSessionSave.objectiveStates())
        saveData[discoveredTrucks] = originalSave.discoveredTrucks().diff(preSessionSave.objectiveStates(), postSessionSave.objectiveStates())
        saveData[newTrucks] = originalSave.newTrucks().diff(preSessionSave.newTrucks(), postSessionSave.newTrucks()).also {
            saveData[ownedTrucks] = originalSave.ownedTrucks().processOwnedTrucks(preSessionSave.ownedTrucks(), postSessionSave.ownedTrucks(), it)
        }

        val elementEntries = originalSave.fullJsonElement.readSave().toMap()

        val newSave = buildJsonObject {
            putJsonObject("CompleteSave") {
                putJsonObject("SslValue") {
                    elementEntries.forEach {
                        put(it.key, it.value)
                    }
                    saveData[discoveredObjectives]?.let { put(discoveredObjectives, it) }
                    saveData[viewedUnactivatedObjectives]?.let { put(viewedUnactivatedObjectives, it) }
                    saveData[watchPointsData]?.let {
                        putJsonObject(watchPointsData) {
                            put("data", it)
                        }
                    }
                    saveData[visitedLevels]?.let { put(visitedLevels, it) }
                    saveData[objectiveStates]?.let { put(objectiveStates, it) }
                    putJsonObject("persistentProfileData") {
                        saveData[discoveredTrucks]?.let { put(discoveredTrucks, it) }
                        saveData[newTrucks]?.let { put(newTrucks, it) }
                        saveData[ownedTrucks]?.let { put(ownedTrucks, it) }
                    }
                    put("SslType", originalSave.fullJsonElement.jsonObject["CompleteSave"]!!.jsonObject["SslType"]!!)
                }
                put("cfg_version", originalSave.fullJsonElement.jsonObject["cfg_version"]!!)
            }
        }

         return json.encodeToString(newSave)
    }

    fun JsonElement.readSave(vararg jsonPointer: String): JsonElement {
        var jsonElement = this.jsonObject["CompleteSave"]!!.jsonObject["SslValue"]!!
        jsonPointer.forEach { jsonElement = jsonElement.jsonObject[it]!! }
        return jsonElement
    }

    private fun JsonObject.processOwnedTrucks(preSessionOwned: JsonElement, postSessionOwned: JsonElement, newTrucks: JsonElement): JsonObject {
//    val diffNewTrucks = newTrucks.toList().minus(keys.toList())
        val diffOwnedTrucks = postSessionOwned.jsonObject.toMap().minus(preSessionOwned.jsonObject.toMap())

        return buildJsonObject {
            newTrucks.toList().forEach {
                if (diffOwnedTrucks.containsKey(it) && !this@processOwnedTrucks.containsKey(it)) put(it, 1)
            }
        }
    }

    fun List<String>.processViewedUnactivatedObjectives(preSessionSave: List<String>, postSessionSave: List<String>): JsonArray {
        var objs: List<String> = this
        var prunedPreSeshSave: List<String> = preSessionSave
        preSessionSave.forEach {
            if (!postSessionSave.contains(it)) {
                objs = minus(it)
                prunedPreSeshSave = preSessionSave.minus(it)
            }
        }
        return objs.diff(prunedPreSeshSave, postSessionSave)
    }

    fun List<String>.diff(preSessionSave: List<String>, postSessionSave: List<String>): JsonArray {
        val diff = postSessionSave.toSet().minus(preSessionSave.toSet())
        val set = diff.toMutableSet().also { it.addAll(this) }
        return buildJsonArray {
            set.forEach { add(it) }
        }
    }

    private fun JsonObject.diff(preSessionSave: JsonObject, postSessionSave: JsonObject): JsonElement {
        val preObjects = preSessionSave.toMap()
        val postObjects = postSessionSave.toMap()
        val diffs = mutableMapOf<String, JsonElement>()

        postObjects.forEach {
            if (it.value != preObjects[it.key]) {
                diffs[it.key] = it.value
            }
        }
        diffs.forEach { infoln("${it.key}: ${it.value}") }
        return buildJsonObject {
            diffs.forEach { put(it.key, it.value) }
        }
    }

    private inline fun JsonElement.toList() = json.decodeFromJsonElement<List<String>>(this)

    inline fun Map<String, JsonElement>.import(original: MutableMap<String, JsonElement>) {
        this.forEach {
            original[it.key] = it.value
        }
    }

    private inline fun JsonElement.toMap(): MutableMap<String, JsonElement> {
        return jsonObject.toMutableMap()
    }
}