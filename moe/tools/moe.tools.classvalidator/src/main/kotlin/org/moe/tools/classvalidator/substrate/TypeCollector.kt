package org.moe.tools.classvalidator.substrate

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
object TypeCollector {
    fun process(
        classpath: Set<File>,
        visitor: (type: String, external: Boolean) -> Unit,
    ) {
        val internalClasses: MutableSet<String> = mutableSetOf()
        val allClasses: MutableSet<String> = sortedSetOf()

        val remapper = object : Remapper() {
            override fun map(internalName: String): String {
                allClasses.add(internalName)
                return super.map(internalName)
            }
        }

        classpath.classAndJarInputIterator {
            val cr = ClassReader(it)
            internalClasses.add(cr.className)
            cr.accept(ClassRemapper(ClassWriter(0), remapper), 0)
        }

        allClasses.forEach {
            visitor(it, it !in internalClasses)
        }
    }
}