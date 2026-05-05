package org.moe.tools.classvalidator.testing

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.google.gson.internal.Streams
import com.google.gson.stream.JsonWriter
import java.io.File
import java.io.StringWriter

/**
 * Read JSON from [file], canonicalize (recursively sort object keys), and
 * pretty-print with a fixed 4-space indent so test diffs are stable across
 * map iteration order changes in the engine.
 */
fun canonicalJson(file: File): String =
    canonicalJson(file.reader().use { JsonParser().parse(it) })

fun canonicalJson(json: String): String =
    canonicalJson(JsonParser().parse(json))

fun canonicalJson(element: JsonElement): String {
    val sw = StringWriter()
    val jw = JsonWriter(sw)
    jw.setIndent("    ")
    Streams.write(sortKeys(element), jw)
    return sw.toString()
}

private fun sortKeys(element: JsonElement): JsonElement = when (element) {
    is JsonObject -> JsonObject().also { sorted ->
        element.entrySet()
            .sortedBy { it.key }
            .forEach { (k, v) -> sorted.add(k, sortKeys(v)) }
    }
    is JsonArray -> JsonArray().also { arr ->
        element.forEach { arr.add(sortKeys(it)) }
    }
    else -> element
}
