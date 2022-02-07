package org.moe.tools.classvalidator.substrate

import org.moe.common.utils.classpathIterator
import java.io.File

object ResourceCollector {

    fun collect(
        inputFiles: Set<File>,
    ): ResourceConfig {
        val resourceConfig = ResourceConfig()

        inputFiles.classpathIterator { entry ->
            if (!entry.isDirectory && !entry.path.endsWith(".class")) {
                resourceConfig.includeResource(entry.path)
            }
        }

        return resourceConfig
    }

}
