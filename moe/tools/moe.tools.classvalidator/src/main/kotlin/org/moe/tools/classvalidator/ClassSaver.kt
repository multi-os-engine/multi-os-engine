package org.moe.tools.classvalidator

import org.moe.common.utils.prepareDir
import org.objectweb.asm.ClassReader
import java.nio.file.Files
import java.nio.file.Path

internal class ClassSaver(
    private val outputDir: Path
) {
    fun save(bytecode: ByteArray?) {
        if (bytecode == null) {
            return
        }

        val cr = ClassReader(bytecode)
        val outputFile = outputDir.resolve(cr.className + ".class")
        outputFile.parent.prepareDir()
        Files.write(outputFile, bytecode)
    }
}
