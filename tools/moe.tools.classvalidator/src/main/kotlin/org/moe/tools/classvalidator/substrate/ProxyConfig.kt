package org.moe.tools.classvalidator.substrate

import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.internal.Streams
import com.google.gson.stream.JsonWriter
import org.moe.tools.classvalidator.getBinaryClassName
import java.io.File

class ProxyConfig {
    private val proxies: MutableMap<List<String>, ProxyConf> = mutableMapOf()

    fun addProxy(vararg interfaces: String) {
        val key = interfaces.map { getBinaryClassName(it) }

        proxies.computeIfAbsent(key) { k ->
            ProxyConf(interfaces = k)
        }
    }

    fun save(
        filePath: File,
        version: FileVersion
    ) {

        val v = version.toJson(this)

        filePath.printWriter().use {
            val jsonWriter = JsonWriter(it)
            jsonWriter.setIndent("    ")
            Streams.write(v, jsonWriter)
        }
    }

    private data class ProxyConf(
        // The order of the interfaces matters because of how JVM handles method duplication:
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Proxy.html
        // > When two or more proxy interfaces contain a method with the same name and parameter signature,
        //   the order of the proxy class's interfaces becomes significant.
        val interfaces: List<String>,
    )

    /**
     * GraalVM changed proxy config file format.
     * https://github.com/multi-os-engine/multi-os-engine/issues/163
     */
    sealed class FileVersion {
        abstract fun toJson(f: ProxyConfig): JsonElement

        object Pre22 : FileVersion() {
            /**
             * ```json
             * [
             *     ["java.lang.AutoCloseable", "java.util.Comparator"],
             *     ["java.util.Comparator"],
             *     ["java.util.List"]
             * ]
             * ```
             */
            override fun toJson(f: ProxyConfig): JsonElement {
                val arr = JsonArray()

                f.proxies.values.forEach { proxy ->
                    val p = JsonArray()

                    proxy.interfaces.forEach { p.add(it) }

                    arr.add(p)
                }

                return arr
            }
        }

        object _22 : FileVersion() {

            /**
             * ```json
             * [
             *  { "interfaces": [ "java.lang.AutoCloseable", "java.util.Comparator" ] },
             *  { "interfaces": [ "java.util.Comparator" ] },
             *  { "interfaces": [ "java.util.List" ] }
             * ]
             * ```
             */
            override fun toJson(f: ProxyConfig): JsonElement {
                val arr = JsonArray()

                f.proxies.values.forEach { proxy ->
                    val p = JsonArray()

                    proxy.interfaces.forEach { p.add(it) }

                    val o = JsonObject()
                    o.add("interfaces", p)

                    arr.add(o)
                }

                return arr
            }
        }
    }
}
