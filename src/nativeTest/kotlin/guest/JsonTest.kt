package guest

import data.CompleteSave
import data.PostSessionSave
import data.PreSessionSave
import data.SaveFile
import data.SavePath
import util.Json
import kotlin.test.BeforeTest
import kotlin.test.Test

internal class JsonTest {
    private lateinit var originalSave: SaveFile
    lateinit var preSessionSave: SaveFile
    private lateinit var postSessionSave: SaveFile

    @BeforeTest
    fun setup() {

        originalSave = SaveFile(Json.json.parseToJsonElement(CompleteSave.json))
        preSessionSave = SaveFile(Json.json.parseToJsonElement(PreSessionSave.json))
        postSessionSave = SaveFile(Json.json.parseToJsonElement(PostSessionSave.json))
    }

    @Test
    fun test() {
//        println(postSessionSave.fullJsonElement.toString())

        val json = JsonProcessor().syncSaves(originalSave, preSessionSave, postSessionSave)

        println(json)
    }
}