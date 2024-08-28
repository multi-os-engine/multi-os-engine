package org.moe.tools.classvalidator.substrate

import org.moe.common.utils.classpathIterator
import java.io.File

object ResourceCollector {

    fun collect(
        inputFiles: Set<File>,
        excludePatterns: Set<String>,
    ): ResourceConfig {
        val resourceConfig = ResourceConfig()

        val excludes: Regex? = if (excludePatterns.isEmpty()) {
            null
        } else {
            excludePatterns.joinToString("|") { "($it)" }.toRegex()
        }

        inputFiles.classpathIterator { entry ->
            if (!entry.isDirectory && !entry.path.endsWith(".class")) {
                if (excludes == null || !excludes.containsMatchIn(entry.path)) {
                    resourceConfig.includeResource(entry.path)
                }
            }
        }

        return resourceConfig
    }
}
