package guest

import data.SaveFile
import extensions.info
import extensions.infoln
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.add
import kotlinx.serialization.json.buildJsonArray
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.put
import kotlinx.serialization.json.putJsonObject
import util.Json.json
import util.readSave

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

        infoln("TESTING")
        val saveData = mutableMapOf<String, JsonElement>()
        infoln("TESTING")
//        infoln("$preSessionSave")
        saveData[discoveredObjectives] = originalSave.discoveredObjectives().diff(
            preSessionSave.discoveredObjectives(),
            postSessionSave.discoveredObjectives()
        )
        infoln("TESTING")

        saveData[viewedUnactivatedObjectives] =
            originalSave.viewedUnactivatedObjectives().processViewedUnactivatedObjectives(
                preSessionSave.viewedUnactivatedObjectives(),
                postSessionSave.viewedUnactivatedObjectives()
            )
        saveData[watchPointsData] = originalSave.watchPointsData().diff(preSessionSave.watchPointsData(), postSessionSave.watchPointsData())
        saveData[visitedLevels] = originalSave.visitedLevels().diff(preSessionSave.visitedLevels(), postSessionSave.visitedLevels())
        saveData[objectiveStates] = originalSave.objectiveStates().diff(preSessionSave.objectiveStates(), postSessionSave.objectiveStates())
        saveData[discoveredTrucks] = originalSave.discoveredTrucks().diff(preSessionSave.discoveredTrucks(), postSessionSave.discoveredTrucks())
        saveData[newTrucks] = originalSave.newTrucks().diff(preSessionSave.newTrucks(), postSessionSave.newTrucks()).also {
            saveData[ownedTrucks] = originalSave.ownedTrucks().processOwnedTrucks(preSessionSave.ownedTrucks(), postSessionSave.ownedTrucks(), it).info("processed: ")
        }


        val elementEntries = originalSave.fullJsonElement.readSave().toMap()

        val newSave = buildJsonObject {
            infoln("1")
            putJsonObject("CompleteSave") {
                infoln("2")
                putJsonObject("SslValue") {
                    infoln("3")
                    elementEntries.forEach { entry ->

                        if (entry.key == "persistentProfileData") {
                            putJsonObject(entry.key) {
                                entry.value.toMap().forEach { put(it.key, it.value) }
                                saveData[discoveredTrucks]?.let { put(discoveredTrucks, it) }
                                saveData[newTrucks]?.let { put(newTrucks, it) }
                                saveData[ownedTrucks]?.let { put(ownedTrucks, it) }
                            }
                        } else if (entry.key == watchPointsData) {
                            putJsonObject(entry.key) {
                                entry.value.toMap().forEach { put(it.key, it.value) }
                                saveData[watchPointsData]?.let {
                                    put("data", it)
                                }
                            }
                        }
                    }
                    infoln("4")

                    saveData[discoveredObjectives]?.let { put(discoveredObjectives, it) }
                    saveData[viewedUnactivatedObjectives]?.let { put(viewedUnactivatedObjectives, it) }

                    infoln("5")

                    saveData[visitedLevels]?.let { put(visitedLevels, it) }
                    saveData[objectiveStates]?.let { put(objectiveStates, it) }
                    infoln("6")

                    infoln("9")

                }
                put("SslType", originalSave.fullJsonElement.jsonObject["CompleteSave"]!!.jsonObject["SslType"]!!)

                infoln("11")

            }
            put("cfg_version", originalSave.fullJsonElement.jsonObject["cfg_version"]!!)

        }

        return json.encodeToString(newSave)
    }

    private fun JsonObject.processOwnedTrucks(preSessionOwned: JsonElement, postSessionOwned: JsonElement, newTrucks: JsonArray): JsonObject {
//    val diffNewTrucks = newTrucks.toList().minus(keys.toList())
        val diffOwnedTrucks = postSessionOwned.jsonObject.toMap().minus(preSessionOwned.jsonObject.toMap())
        return buildJsonObject {
            newTrucks.toList().forEach {
                this@processOwnedTrucks.forEach { put(it.key, it.value) }
                if (diffOwnedTrucks.containsKey(it) && !this@processOwnedTrucks.containsKey(it)) put(it, 1)
            }
        }
    }

    private fun List<String>.processViewedUnactivatedObjectives(preSessionSave: List<String>, postSessionSave: List<String>): JsonArray {
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

    private fun List<String>.diff(preSessionSave: List<String>, postSessionSave: List<String>): JsonArray {
        infoln("diff")
        val diff = postSessionSave.toMutableSet().minus(preSessionSave.toSet())
        val set = diff.toMutableSet().also { it.addAll(this) }
        return buildJsonArray {
            set.forEach { add(it) }
        }
    }

    private fun JsonObject.diff(preSessionSave: JsonObject, postSessionSave: JsonObject): JsonElement {

        val preObjects = preSessionSave.toMap()
        val postObjects = postSessionSave.toMap()
        val diffs = this.toMap()

        postObjects.forEach {
            if (it.value != preObjects[it.key]) {
                diffs[it.key] = it.value
            }
        }
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