package data

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonObject
import util.Json.json
import util.readSave

@Serializable
data class SaveFile(val fullJsonElement: JsonElement) {
    fun discoveredObjectives(): List<String> = fullJsonElement.readSave("discoveredObjectives")
        .let { json.decodeFromJsonElement(it) }

    fun objectiveStates(): JsonObject = fullJsonElement.readSave("objectiveStates").jsonObject

    fun watchPointsData(): JsonObject = fullJsonElement.readSave("watchPointsData", "data").jsonObject

    fun discoveredTrucks(): JsonObject =
        fullJsonElement.readSave("persistentProfileData", "discoveredTrucks").jsonObject

    fun viewedUnactivatedObjectives(): List<String> = fullJsonElement.readSave("viewedUnactivatedObjectives")
        .let { json.decodeFromJsonElement(it) }

    fun visitedLevels(): List<String> = fullJsonElement.readSave("visitedLevels")
        .let { json.decodeFromJsonElement(it) }

    fun newTrucks(): List<String> = fullJsonElement.readSave("persistentProfileData", "newTrucks")
        .let { json.decodeFromJsonElement(it) }

    fun ownedTrucks(): JsonObject = fullJsonElement.readSave("persistentProfileData", "ownedTrucks").jsonObject
}

