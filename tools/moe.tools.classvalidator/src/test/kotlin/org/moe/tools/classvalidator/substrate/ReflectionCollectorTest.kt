package org.moe.tools.classvalidator.substrate

import org.junit.Assert.assertEquals
import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.moe.tools.classvalidator.testing.canonicalJson
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Opcodes.RETURN

class ReflectionCollectorTest : ASMTest() {

    @Test
    fun `process scans dir, applies main class, and writes JSON`() {
        val input = tmp.newFolder("in")
        writeClassUnder(input, "com/example/Startup", withRegisterOnStartup = true, extraMethod = "doIt")
        writeClassUnder(input, "com/example/Plain", withRegisterOnStartup = false, extraMethod = "ignored")

        val outDir = tmp.newFolder("out").toPath()

        ReflectionCollector.process(
            mainClassName = "com.example.MainApp",
            inputFiles = setOf(input),
            outputDir = outDir,
            classpath = setOf(input),
        )

        val out = outDir.resolve(ReflectionCollector.OUTPUT_REFLECTION).toFile()

        // Class entries are emitted in sorted order of internal class name
        // (ReflectionConfig.classes is a sortedMapOf).
        val expected = """
            [
                {
                    "name": "com.example.MainApp",
                    "methods": [
                        { "name": "main", "parameterTypes": ["java.lang.String[]"] }
                    ]
                },
                {
                    "name": "com.example.Startup",
                    "methods": [
                        { "name": "doIt", "parameterTypes": [] }
                    ]
                }
            ]
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    private fun writeClassUnder(
        root: java.io.File,
        internalName: String,
        withRegisterOnStartup: Boolean,
        extraMethod: String,
    ) {
        val bytes = classBytes(internalName) {
            if (withRegisterOnStartup) {
                visitAnnotation("Lorg/moe/natj/general/ann/RegisterOnStartup;", true).visitEnd()
            }
            visitMethod(ACC_PUBLIC or ACC_STATIC, extraMethod, "()V", null, null).also {
                it.visitCode(); it.visitInsn(RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }
        val classFile = java.io.File(root, "$internalName.class")
        classFile.parentFile.mkdirs()
        classFile.writeBytes(bytes)
    }
}
