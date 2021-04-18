package org.moe.tools.classvalidator

import org.moe.common.utils.classAndJarInputIterator
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
            val saver = ClassSaver(outputDir.resolve(OUTPUT_CLASSES))

            inputFiles.classAndJarInputIterator {
                val cr = ClassReader(it)

                val byteCode = processClass(cr) { next ->
                    next
                }

                saver.save(byteCode)
            }
        }
    }

    private inline fun processClass(reader: ClassReader, chain: (ClassVisitor) -> ClassVisitor): ByteArray {
        val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)

        val header = chain(writer)
        reader.accept(header, 0)

        return writer.toByteArray()
    }

    const val OUTPUT_CLASSES = "classes"
}
