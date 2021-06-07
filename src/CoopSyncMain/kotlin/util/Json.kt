package util

import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject

object Json {
    val json = Json { prettyPrint = true }
}

fun JsonElement.readSave(vararg jsonPointer: String): JsonElement {
    var jsonElement = this.jsonObject["CompleteSave"]!!.jsonObject["SslValue"]!!
    jsonPointer.forEach { jsonElement = jsonElement.jsonObject[it]!! }
    return jsonElement
}
