package util

import kotlinx.serialization.json.Json

object Json {
    val json = Json { prettyPrint = true }
}
