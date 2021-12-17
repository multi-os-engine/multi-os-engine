package org.moe.tools.classvalidator

import org.moe.common.utils.classAndJarInputIterator
import org.moe.tools.classvalidator.natj.AddMissingAnnotations
import org.moe.tools.classvalidator.natj.AddMissingNatJRegister
import org.moe.tools.classvalidator.substrate.CollectReflectionConfig
import org.moe.tools.classvalidator.substrate.ReflectionConfig
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import java.io.File
import java.nio.file.Path

object ClassValidator {
    fun process(
        mainClassName: String?,
        inputFiles: Set<File>,
        outputDir: Path,
        classpath: Set<File>,
    ) {
        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            val classSaver = ClassSaver(outputDir.resolve(OUTPUT_CLASSES))
            val reflectionConfig = ReflectionConfig()

            inputFiles.classAndJarInputIterator { _, inputStream ->
                val cr = ClassReader(inputStream)

                val byteCode = processClass(cr) { next ->
                    next
                        .let { CollectReflectionConfig(config = reflectionConfig, next = it) }
                        .let(::AddMissingAnnotations)
                        .let(::AddMissingNatJRegister)
                }

                classSaver.save(byteCode)
            }

            // Add main class if necessary
            mainClassName?.let {
                reflectionConfig.addMethod(it.replace('.', '/'), METHOD_MAIN, METHOD_MAIN_DESC)
            }

            reflectionConfig.save(outputDir.resolve(OUTPUT_REFLECTION).toFile())
        }
    }

    private inline fun processClass(reader: ClassReader, chain: (ClassVisitor) -> ClassVisitor): ByteArray {
        val writer = ClassWriter(ClassWriter.COMPUTE_MAXS)

        val header = chain(writer)
        reader.accept(header, 0)

        return writer.toByteArray()
    }

    const val OUTPUT_CLASSES = "classes"
    const val OUTPUT_REFLECTION = "reflection-config.json"

    private const val METHOD_MAIN = "main"
    private const val METHOD_MAIN_DESC = "([Ljava/lang/String;)V"
}
