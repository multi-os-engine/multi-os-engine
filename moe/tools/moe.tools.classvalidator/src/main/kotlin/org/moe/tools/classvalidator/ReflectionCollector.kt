package org.moe.tools.classvalidator

import org.moe.common.utils.classAndJarInputIterator
import org.moe.tools.classvalidator.substrate.CollectReflectionConfig
import org.moe.tools.classvalidator.substrate.ReflectionConfig
import org.objectweb.asm.ClassReader
import java.io.File
import java.nio.file.Path

object ReflectionCollector {
    fun process(
        inputFiles: Set<File>,
        outputFile: Path,
        classpath: Set<File>,
    ) {

        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            val reflectionConfig = ReflectionConfig()

            inputFiles.classAndJarInputIterator {
                val cr = ClassReader(it)
                cr.accept(CollectReflectionConfig(
                    config = reflectionConfig,
                    collectAll = true,
                ), 0)
            }

            reflectionConfig.save(outputFile.toFile())
        }

    }
}