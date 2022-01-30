package org.moe.tools.classvalidator.substrate

import org.moe.common.utils.classpathIterator
import java.io.File
import java.nio.file.Path

object ResourceCollector {
    fun process(
        inputFiles: Set<File>,
        outputFile: File,
    ) {
        val resourceConfig = ResourceConfig()

        inputFiles.classpathIterator { entry ->
            if (!entry.isDirectory && !entry.path.endsWith(".class")) {
                resourceConfig.includeResource(entry.path)
            }
        }

        resourceConfig.save(outputFile)
    }
}
