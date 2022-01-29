package org.moe.tools.classvalidator.substrate

import com.google.gson.JsonArray
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

    fun save(filePath: File) {
        val arr = JsonArray()

        proxies.values.forEach { proxy ->
            val p = JsonArray()

            proxy.interfaces.forEach { p.add(it) }

            arr.add(p)
        }

        filePath.printWriter().use {
            val jsonWriter = JsonWriter(it)
            jsonWriter.setIndent("    ")
            Streams.write(arr, jsonWriter)
        }
    }

    private data class ProxyConf(
        // The order of the interfaces matters because of how JVM handles method duplication:
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/reflect/Proxy.html
        // > When two or more proxy interfaces contain a method with the same name and parameter signature,
        //   the order of the proxy class's interfaces becomes significant.
        val interfaces: List<String>,
    )
}
