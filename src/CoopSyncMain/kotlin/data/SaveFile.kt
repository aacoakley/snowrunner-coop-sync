package data

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.jsonObject
import util.Serializer

@Serializable
data class SaveFile(val fullJsonElement: JsonElement) {
    var discoveredObjectives: List<String> = fullJsonElement.readSave().jsonObject["discoveredObjectives"]
        ?.let { Serializer.json.decodeFromJsonElement<List<String>>(it) }
        ?: listOf()

    var objectiveStates: JsonObject = fullJsonElement.readSave().jsonObject["objectiveStates"]!!.jsonObject

    var watchPointsData: JsonObject = fullJsonElement.readSave().jsonObject["watchPointsData"]!!.jsonObject["data"]!!.jsonObject

    var discoveredTrucks: JsonObject = fullJsonElement.readSave().jsonObject["persistentProfileData"]!!.jsonObject["discoveredTrucks"]!!.jsonObject

}

inline fun JsonElement.readSave() = this.jsonObject["CompleteSave"]!!.jsonObject["SslValue"]!!
