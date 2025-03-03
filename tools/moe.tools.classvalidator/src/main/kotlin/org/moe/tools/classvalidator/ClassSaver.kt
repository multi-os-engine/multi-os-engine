package org.moe.tools.classvalidator

import org.objectweb.asm.ClassReader
import java.nio.file.FileSystems
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption

internal class ClassSaver(
    private val outputJar: Path
) {

    private val classNameBytecodeMap = mutableMapOf<String, ByteArray>()
    fun add(bytecode: ByteArray?) {
        if (bytecode == null) {
            return
        }

        val cr = ClassReader(bytecode)
        classNameBytecodeMap[cr.className + ".class"] = bytecode
    }

    fun save() {
        // In jar replacement
        val fileSystem = FileSystems.newFileSystem(outputJar, null as ClassLoader?)
        fileSystem.use {
            classNameBytecodeMap.forEach { (fileName, bytecode) ->
                val outputFile = it.getPath(fileName)
                Files.write(outputFile, bytecode)
            }
        }
    }
}