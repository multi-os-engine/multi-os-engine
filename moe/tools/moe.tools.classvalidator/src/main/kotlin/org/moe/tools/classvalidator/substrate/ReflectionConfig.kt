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

    private fun ensureClass(
        className: String,
        allDeclaredConstructors: Boolean = false,
        allPublicConstructors: Boolean = false,
        allDeclaredMethods: Boolean = false,
        allPublicMethods: Boolean = false,
        allDeclaredClasses: Boolean = false,
        allPublicClasses: Boolean = false,
    ): ClassConf {
        return classes.getOrPut(className) {
            ClassConf(name = getBinaryClassName(className))
        }.apply {
            this.allDeclaredConstructors = this.allDeclaredConstructors || allDeclaredConstructors
            this.allPublicConstructors = this.allPublicConstructors || allPublicConstructors
            this.allDeclaredMethods = this.allDeclaredMethods || allDeclaredMethods
            this.allPublicMethods = this.allPublicMethods || allPublicMethods
            this.allDeclaredClasses = this.allDeclaredClasses || allDeclaredClasses
            this.allPublicClasses = this.allPublicClasses || allPublicClasses
        }
    }

    fun addClass(
        className: String,
        allDeclaredConstructors: Boolean = false,
        allPublicConstructors: Boolean = false,
        allDeclaredMethods: Boolean = false,
        allPublicMethods: Boolean = false,
        allDeclaredClasses: Boolean = false,
        allPublicClasses: Boolean = false,
    ) {
        ensureClass(
            className = className,
            allDeclaredConstructors = allDeclaredConstructors,
            allPublicConstructors = allPublicConstructors,
            allDeclaredMethods = allDeclaredMethods,
            allPublicMethods = allPublicMethods,
            allDeclaredClasses = allDeclaredClasses,
            allPublicClasses = allPublicClasses,
        )
    }

    fun addClass(className: String, exportAll: Boolean) {
        addClass(
            className = className,
            allDeclaredConstructors = exportAll,
            allPublicConstructors = exportAll,
            allDeclaredMethods = exportAll,
            allPublicMethods = exportAll,
            allDeclaredClasses = exportAll,
            allPublicClasses = exportAll
        )
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
            if (clazz.allDeclaredConstructors) {
                co.addProperty("allDeclaredConstructors", true)
            }
            if (clazz.allPublicConstructors) {
                co.addProperty("allPublicConstructors", true)
            }
            if (clazz.allDeclaredMethods) {
                co.addProperty("allDeclaredMethods", true)
            }
            if (clazz.allPublicMethods) {
                co.addProperty("allPublicMethods", true)
            }
            if (clazz.allDeclaredClasses) {
                co.addProperty("allDeclaredClasses", true)
            }
            if (clazz.allPublicClasses) {
                co.addProperty("allPublicClasses", true)
            }

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
        var allDeclaredConstructors: Boolean = false,
        var allPublicConstructors: Boolean = false,
        var allDeclaredMethods: Boolean = false,
        var allPublicMethods: Boolean = false,
        var allDeclaredClasses: Boolean = false,
        var allPublicClasses: Boolean = false,
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
