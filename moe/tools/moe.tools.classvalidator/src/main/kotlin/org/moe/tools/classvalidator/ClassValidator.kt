package org.moe.tools.classvalidator

import org.moe.common.utils.classAndJarInputIterator
import org.moe.tools.classvalidator.natj.AddMissingAnnotations
import org.moe.tools.classvalidator.natj.AddMissingNatJRegister
import org.moe.tools.classvalidator.natj.RewriteChangedBindingClasses

import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import java.io.File
import java.nio.file.Path

object ClassValidator {
    fun process(
        inputFiles: Set<File>,
        outputDir: Path,
        classpath: Set<File>,
    ) {
        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            val classSaver = ClassSaver(outputDir.resolve(OUTPUT_CLASSES))

            inputFiles.classAndJarInputIterator { _, inputStream ->
                val cr = ClassReader(inputStream)

                val byteCode = processClass(cr) { next ->
                    next
                        .let(::AddMissingAnnotations)
                        .let(::AddMissingNatJRegister)
                        .let(::RewriteChangedBindingClasses)
                }

                classSaver.save(byteCode)
            }
        }
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

    const val OUTPUT_CLASSES = "classes"
}
