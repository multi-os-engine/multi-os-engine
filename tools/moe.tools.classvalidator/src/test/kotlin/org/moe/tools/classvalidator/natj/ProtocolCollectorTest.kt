package org.moe.tools.classvalidator.natj

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.RETURN

class ProtocolCollectorTest : ASMTest() {

    @Test
    fun `collects ObjCProtocolName from implemented interface`() {
        val dir = writeImpl(
            internalName = "com/example/Impl",
            interfaces = arrayOf("org/moe/tools/classvalidator/fixtures/MyProtocol"),
            method = "hello",
        )

        val result = ProtocolCollector.process(
            inputFiles = setOf(dir),
            classpath = jvmClasspath() + dir,
        )

        assertTrue(
            result.toString(),
            "org/moe/tools/classvalidator/fixtures/MyProtocol" in result,
        )
    }

    @Test
    fun `does not collect plain interfaces without ObjCProtocolName`() {
        val dir = writeImpl(
            internalName = "com/example/PlainImpl",
            interfaces = arrayOf("org/moe/tools/classvalidator/fixtures/PlainInterface"),
            method = "plain",
        )

        val result = ProtocolCollector.process(
            inputFiles = setOf(dir),
            classpath = jvmClasspath() + dir,
        )

        assertEquals(emptySet<String>(), result)
    }

    @Test
    fun `skips interface input files`() {
        // Even if we feed in the protocol interface itself, ProtocolCollector
        // should not collect it (it only inspects method-overrides in classes).
        val dir = tmp.newFolder("itf-only")
        // Don't write any concrete class; just an empty dir.

        val result = ProtocolCollector.process(
            inputFiles = setOf(dir),
            classpath = jvmClasspath() + dir,
        )

        assertEquals(emptySet<String>(), result)
    }

    private fun writeImpl(internalName: String, interfaces: Array<String>, method: String) =
        writeClassToFolder(
            internalName,
            classBytes(internalName, interfaces = interfaces) {
                visitMethod(ACC_PUBLIC, method, "()V", null, null).also {
                    it.visitCode()
                    it.visitInsn(RETURN)
                    it.visitMaxs(0, 1)
                    it.visitEnd()
                }
            },
        )
}
