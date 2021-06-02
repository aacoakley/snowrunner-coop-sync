package guest

import data.SaveFile
import kotlinx.serialization.json.*
import util.CompleteSave
import util.OldSave
import util.SaveFields
import util.Serializer
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class guestTest {

    @Test
    fun testJsonEncoding() {
        val originalSave = SaveFile(Serializer.json.parseToJsonElement(MattsSave.data))
        val preSessionSave = SaveFile(Serializer.json.parseToJsonElement(OldSave.data))
        val postSessionSave = SaveFile(Serializer.json.parseToJsonElement(CompleteSave.data))

        val discoveredObjectives = diff(
            preSessionSave.discoveredObjectives(),
            postSessionSave.discoveredObjectives()
        ).import(originalSave.discoveredObjectives())

        val newSave = buildJsonObject {
            originalSave.fullJsonElement.jsonObject.entries.forEach {
                if (it.value is JsonObject) it.value.jsonObject.entries.forEach {  }


                if (it.key == SaveFields.DISCOVERED_OBJECTIVES.fieldName) putJsonArray(it.key) {
                    addJsonArray {
                        discoveredObjectives.forEach { obj -> add(obj) }
                    }
                }
                else put(it.key, it.value)
            }
        }
//        for (i in 0..maxOf(originalSave.discoveredObjectives().size, discoveredObjectives.size))  {
//            println(originalSave.discoveredObjectives().sorted()[i] + "\t" + discoveredObjectives.sorted()[i])
//        }
        println(originalSave.discoveredObjectives().size)
        println(discoveredObjectives.size)
        assertNotEquals(discoveredObjectives, originalSave.discoveredObjectives())
        assertFalse { newSave.toString() == originalSave.fullJsonElement.toString() }
    }
}