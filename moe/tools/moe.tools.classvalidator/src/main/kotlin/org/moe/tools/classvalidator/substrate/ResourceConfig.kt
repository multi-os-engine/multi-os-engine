package org.moe.tools.classvalidator.substrate

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.internal.Streams
import com.google.gson.stream.JsonWriter
import org.intellij.lang.annotations.Language
import java.io.File

class ResourceConfig {
    private val bundles: MutableSet<String> = mutableSetOf()
    private val includedResources: MutableSet<String> = mutableSetOf()

    fun includeResource(path: String) {
        includeResourceRegex(Regex.escape(path))
    }

    fun includeResourceRegex(@Language("regexp") regex: String) {
        includedResources.add(regex)
    }

    fun addBundle(name: String) {
        bundles.add(name)
    }

    fun save(filePath: File) {
        val out = JsonObject()

        if (includedResources.isNotEmpty()) {
            val res = JsonObject()
            out.add("resources", res)
            val inc = JsonArray()
            res.add("includes", inc)

            includedResources.forEach { pattern ->
                val p = JsonObject()
                inc.add(p)

                p.addProperty("pattern", pattern)
            }
        }

        if (bundles.isNotEmpty()) {
            val bud = JsonArray()
            out.add("bundles", bud)

            bundles.forEach { bundle ->
                val b = JsonObject()
                bud.add(b)

                b.addProperty("name", bundle)
            }
        }

        filePath.printWriter().use {
            val jsonWriter = JsonWriter(it)
            jsonWriter.setIndent("    ")
            Streams.write(out, jsonWriter)
        }
    }
}
