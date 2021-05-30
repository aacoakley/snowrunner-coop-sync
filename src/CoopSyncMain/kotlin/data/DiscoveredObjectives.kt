package data

import kotlinx.serialization.Serializable

@Serializable
data class DiscoveredObjectives(val objectives: List<String>, val number: Int)
