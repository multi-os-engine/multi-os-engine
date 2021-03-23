package org.moe.tools.substrate

import java.io.File
import java.nio.file.Path

data class Config(
        val mainClassName: String,
        val classpath: Set<File>,

        val outputDir: Path,

        val logFile: File? = null,
) {
    init {
        require(classpath.isNotEmpty()) {
            "Classpath cannot be empty"
        }
    }
}