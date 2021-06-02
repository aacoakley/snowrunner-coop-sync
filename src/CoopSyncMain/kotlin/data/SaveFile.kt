package data

import util.Json.JsonBuilder.json
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject

@Serializable
data class SaveFile(val fullJsonElement: JsonElement) {
    inline fun discoveredObjectives(): List<String> = fullJsonElement.readSave("discoveredObjectives")
        .let { json.decodeFromJsonElement(it) }

    inline fun objectiveStates(): JsonObject = fullJsonElement.readSave("objectiveStates").jsonObject

    inline fun watchPointsData(): JsonObject = fullJsonElement.readSave("watchPointsData", "data").jsonObject

    inline fun discoveredTrucks(): JsonObject =
        fullJsonElement.readSave("persistentProfileData", "discoveredTrucks").jsonObject

    inline fun viewedUnactivatedObjectives(): List<String> = fullJsonElement.readSave("viewedUnactivatedObjectives")
        .let { json.decodeFromJsonElement(it) }

    inline fun visitedLevels(): List<String> = fullJsonElement.readSave("visitedLevels")
        .let { json.decodeFromJsonElement(it) }

    inline fun newTrucks(): List<String> = fullJsonElement.readSave("persistentProfileData", "newTrucks")
        .let { json.decodeFromJsonElement(it) }

    inline fun ownedTrucks(): JsonObject = fullJsonElement.readSave("persistentProfileData", "ownedTrucks").jsonObject
}

