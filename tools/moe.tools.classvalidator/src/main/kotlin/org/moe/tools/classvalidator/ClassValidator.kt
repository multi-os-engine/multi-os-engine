package org.moe.tools.classvalidator

import org.moe.common.utils.classpathIterator
import org.moe.tools.classvalidator.natj.AddMissingAnnotations
import org.moe.tools.classvalidator.natj.AddMissingNatJRegister
import org.moe.tools.classvalidator.natj.RewriteChangedBindingClasses
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import java.io.File

object ClassValidator {
    fun process(
        inputFiles: Set<File>,
        classpath: Set<File>,
    ) {
        val classSavers = mutableListOf<ClassSaver>()
        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            inputFiles.forEach { inputFile ->
                val classSaver = ClassSaver(inputFile.toPath())
                classSavers.add(classSaver)

                inputFile.classpathIterator({ _, inputStream ->
                    val originalByteCode = inputStream.readBytes()
                    val cr = ClassReader(originalByteCode)
                    val processedByteCode = processClass(cr) { next ->
                        next
                            .let(::AddMissingAnnotations)
                            .let(::AddMissingNatJRegister)
                            .let(::RewriteChangedBindingClasses)
                    }

                    if (!originalByteCode.contentEquals(processedByteCode)) {
                        classSaver.add(processedByteCode)
                    }
                }, { it.endsWith(".class") })
            }
        }

        classSavers.forEach { classSaver -> classSaver.save() }
    }

    private inline fun processClass(reader: ClassReader, chain: (ClassVisitor) -> ClassVisitor): ByteArray {
        val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)

        if (reader.className.startsWith("java/")) {
            // We don't want to process classes from java.*
            reader.accept(writer, 0)
        } else {
            val header = chain(writer)
            reader.accept(header, 0)
        }

        return writer.toByteArray()
    }
}