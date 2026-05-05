package org.moe.tools.classvalidator.substrate

import org.junit.Assert.assertEquals
import org.junit.Test
import org.moe.tools.classvalidator.ChildFirstClassLoader
import org.moe.tools.classvalidator.ContextClassLoaderHolder
import org.moe.tools.classvalidator.testing.ASMTest
import org.moe.tools.classvalidator.testing.canonicalJson
import org.objectweb.asm.ClassReader
import org.objectweb.asm.Opcodes.ACC_PUBLIC

class CollectReflectionConfigTest : ASMTest() {

    @Test
    fun `collectAll mode collects class plus all methods and fields`() {
        val bytes = classBytes("com/example/Plain") {
            visitField(ACC_PUBLIC, "field1", "Ljava/lang/String;", null, null).visitEnd()
            visitField(ACC_PUBLIC, "field2", "I", null, null).visitEnd()
            visitMethod(ACC_PUBLIC, "doIt", "()V", null, null).also {
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }

        val cfg = run(bytes, collectAll = true)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        val expected = """
            [
                {
                    "name": "com.example.Plain",
                    "fields": [
                        { "name": "field1" },
                        { "name": "field2" }
                    ],
                    "methods": [
                        { "name": "doIt", "parameterTypes": [] }
                    ]
                }
            ]
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `non-binding class without exported annotations collects nothing`() {
        val bytes = classBytes("com/example/Plain") {
            visitField(ACC_PUBLIC, "f", "I", null, null).visitEnd()
            visitMethod(ACC_PUBLIC, "doIt", "()V", null, null).also {
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }

        val cfg = run(bytes, collectAll = false)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        assertEquals(canonicalJson("[]"), canonicalJson(out))
    }

    @Test
    fun `class with RegisterOnStartup is collected via SVM-exported annotation`() {
        val bytes = classBytes("com/example/Startup") {
            visitAnnotation("Lorg/moe/natj/general/ann/RegisterOnStartup;", true).visitEnd()
        }

        val cfg = run(bytes, collectAll = false)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        val expected = """[ { "name": "com.example.Startup" } ]"""
        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `NativeObject descendant collects class plus init constructor and Selector methods`() {
        val bytes = classBytes(
            internalName = "com/example/Binding",
            superName = "org/moe/natj/general/NativeObject",
        ) {
            // The NatJ binding constructor — always collected for NatJ binding classes.
            visitMethod(0, "<init>", "(Lorg/moe/natj/general/Pointer;)V", null, null).also {
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
            // Method with @Selector — should be collected.
            visitMethod(ACC_PUBLIC, "doIt", "()V", null, null).also {
                val av = it.visitAnnotation("Lorg/moe/natj/objc/ann/Selector;", true)
                av.visit("value", "doIt")
                av.visitEnd()
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
            // Method without any NatJ-exported annotation — not collected.
            visitMethod(ACC_PUBLIC, "internal", "()V", null, null).also {
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
            // Field with @InstanceVariable — should be collected.
            visitField(ACC_PUBLIC, "ivar", "Ljava/lang/Object;", null, null).also {
                it.visitAnnotation("Lorg/moe/natj/objc/ann/InstanceVariable;", true).visitEnd()
                it.visitEnd()
            }
        }

        // Run inside a ContextClassLoaderHolder so NativeObject can be resolved
        // via classpath introspection (mirrors how production calls this).
        val cfg = ReflectionConfig()
        ContextClassLoaderHolder(ChildFirstClassLoader(jvmClasspathUrls())).use {
            ClassReader(bytes).accept(CollectReflectionConfig(config = cfg, collectAll = false), 0)
        }

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        val expected = """
            [
                {
                    "name": "com.example.Binding",
                    "fields": [ { "name": "ivar" } ],
                    "methods": [
                        { "name": "<init>", "parameterTypes": ["org.moe.natj.general.Pointer"] },
                        { "name": "doIt", "parameterTypes": [] }
                    ]
                }
            ]
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `static main method is collected when class has RegisterOnStartup`() {
        val bytes = classBytes("com/example/Startup") {
            visitAnnotation("Lorg/moe/natj/general/ann/RegisterOnStartup;", true).visitEnd()
            visitMethod(
                ACC_PUBLIC or org.objectweb.asm.Opcodes.ACC_STATIC,
                "main", "([Ljava/lang/String;)V", null, null
            ).also {
                it.visitCode(); it.visitInsn(org.objectweb.asm.Opcodes.RETURN); it.visitMaxs(0, 1); it.visitEnd()
            }
        }

        val cfg = run(bytes, collectAll = false)

        val out = tmp.newFile("reflection-config.json")
        cfg.save(out)

        // The Startup class entry exists from SVM-exported @RegisterOnStartup;
        // main() is NOT auto-collected by CollectReflectionConfig (the driver
        // ReflectionCollector adds it separately when it has a mainClassName).
        val expected = """[ { "name": "com.example.Startup" } ]"""
        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    private fun run(bytes: ByteArray, collectAll: Boolean): ReflectionConfig {
        val cfg = ReflectionConfig()
        ClassReader(bytes).accept(CollectReflectionConfig(config = cfg, collectAll = collectAll), 0)
        return cfg
    }
}
