package org.moe.tools.classvalidator.substrate

import org.junit.Assert.assertEquals
import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.moe.tools.classvalidator.testing.canonicalJson
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Opcodes.RETURN

class CollectSimpleReflectionConfigTest : ASMTest() {

    @Test
    fun `class with RegisterOnStartup gets class plus all methods`() {
        val bytes = classBytes("com/example/Startup") {
            visitAnnotation("Lorg/moe/natj/general/ann/RegisterOnStartup;", true).visitEnd()
            visitMethod(ACC_PUBLIC or ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null).also {
                it.visitCode(); it.visitInsn(RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
            visitMethod(ACC_PUBLIC, "doIt", "()V", null, null).also {
                it.visitCode(); it.visitInsn(RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }

        val cfg = ReflectionConfig()
        ClassReader(bytes).accept(CollectSimpleReflectionConfig(cfg), 0)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        val expected = """
            [
                {
                    "name": "com.example.Startup",
                    "methods": [
                        { "name": "main", "parameterTypes": ["java.lang.String[]"] },
                        { "name": "doIt", "parameterTypes": [] }
                    ]
                }
            ]
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `class without RegisterOnStartup is skipped entirely`() {
        val bytes = classBytes("com/example/Plain") {
            visitMethod(ACC_PUBLIC, "doIt", "()V", null, null).also {
                it.visitCode(); it.visitInsn(RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }

        val cfg = ReflectionConfig()
        ClassReader(bytes).accept(CollectSimpleReflectionConfig(cfg), 0)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        assertEquals(canonicalJson("[]"), canonicalJson(out))
    }
}
