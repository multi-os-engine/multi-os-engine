package org.moe.tools.classvalidator.substrate

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.internal.Streams
import com.google.gson.stream.JsonWriter
import org.objectweb.asm.Type
import java.io.File

class ReflectionConfig {
    /**
     * Map of internal class name to the [ClassConf]
     */
    private val classes: MutableMap<String, ClassConf> = sortedMapOf()

    private fun ensureClass(className: String): ClassConf {
        return classes.getOrPut(className) { ClassConf(name = getBinaryClassName(className)) }
    }

    fun addClass(className: String) {
        ensureClass(className)
    }

    fun addMethod(declaringClass: String, methodName: String, methodDescriptor: String) {
        val c = ensureClass(declaringClass)

        c.methods.add(MethodConf(
            name = methodName,
            parameterTypes = Type
                .getArgumentTypes(methodDescriptor)
                .map { it.className },
        ))
    }

    fun addField(declaringClass: String, fieldName: String, allowWrite: Boolean = false) {
        val c = ensureClass(declaringClass)

        c.fields.add(FieldConf(
            name = fieldName,
            allowWrite = allowWrite,
        ))
    }

    fun save(filePath: File) {
        val arr = JsonArray()

        classes.values.forEach { clazz ->
            val co = JsonObject()

            co.addProperty("name", clazz.name)

            if (clazz.fields.isNotEmpty()) {
                val farr = JsonArray()

                clazz.fields.forEach { field ->
                    val fo = JsonObject()
                    fo.addProperty("name", field.name)

                    if (field.allowWrite) {
                        fo.addProperty("allowWrite", true)
                    }

                    farr.add(fo)
                }

                co.add("fields", farr)
            }

            if (clazz.methods.isNotEmpty()) {
                val marr = JsonArray()

                clazz.methods.forEach { method ->
                    val mo = JsonObject()
                    mo.addProperty("name", method.name)

                    val parr = JsonArray()
                    method.parameterTypes.forEach(parr::add)
                    mo.add("parameterTypes", parr)

                    marr.add(mo)
                }

                co.add("methods", marr)
            }

            arr.add(co)
        }

        filePath.printWriter().use {
            val jsonWriter = JsonWriter(it)
            jsonWriter.setIndent("    ")
            Streams.write(arr, jsonWriter)
        }
    }

    /**
     * @property name the binary name of this class
     */
    private data class ClassConf(
        val name: String,
        val fields: MutableSet<FieldConf> = linkedSetOf(),
        val methods: MutableSet<MethodConf> = linkedSetOf(),
    )

    private data class FieldConf(
        val name: String,
        val allowWrite: Boolean,
    )

    /**
     * @property parameterTypes list of binary name of parameter types
     */
    private data class MethodConf(
        val name: String,
        val parameterTypes: List<String>,
    )

    companion object {
        private fun getBinaryClassName(internalName: String): String = Type.getObjectType(internalName).className
    }
}
