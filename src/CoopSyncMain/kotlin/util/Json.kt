package util

import kotlinx.serialization.json.Json

object Serializer {
    val json = Json { prettyPrint = true }
}