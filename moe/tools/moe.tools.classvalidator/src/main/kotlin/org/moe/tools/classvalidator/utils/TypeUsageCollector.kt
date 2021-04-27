package org.moe.tools.classvalidator.utils

import org.moe.common.utils.classAndJarInputIterator
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.Remapper
import java.io.File

/**
 * A simple util that collect all classes that has been used by the classes from given classpath.
 * The used types include external classes as well as the classes from the classpath.
 */
object TypeUsageCollector {
    fun process(
        classpath: Set<File>,
        visitor: (type: String, usages: Int, external: Boolean) -> Unit,
    ) {
        val internalClasses: MutableSet<String> = mutableSetOf()
        val allClasses: MutableMap<String, Int> = sortedMapOf()

        val remapper = object : Remapper() {
            override fun map(internalName: String): String {
                allClasses[internalName] = 0 // TODO
                return super.map(internalName)
            }
        }

        classpath.classAndJarInputIterator {
            val cr = ClassReader(it)
            internalClasses.add(cr.className)
            cr.accept(ClassRemapper(ClassWriter(0), remapper), 0)
        }

        allClasses.forEach { (name, usage) ->
            visitor(name, usage, name !in internalClasses)
        }
    }

    /** This type is used as a super type */
    const val USAGE_SUPER = 1 shl 0

    /** This type is used as a method parameter type */
    const val USAGE_PARAM = 1 shl 1

    /** This type is used as a method return type */
    const val USAGE_RETURN = 1 shl 2

    /** This type is used as a variable type */
    const val USAGE_VARIABLE = 1 shl 3
}