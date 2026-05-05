package org.moe.tools.classvalidator.natj

import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.RETURN

class AddMissingAnnotationsTest : ASMTest() {

    private val parentInternal = "org/moe/tools/classvalidator/fixtures/SelectorParent"

    @Test
    fun `injects Selector annotation onto override that lacks it`() {
        val input = childWithMethod(name = "com/example/Child", method = "doIt", descriptor = "()V")

        val out = applyVisitor(input) { AddMissingAnnotations(it) }

        assertHasMethodAnnotation(
            out, "doIt", "()V",
            "Lorg/moe/natj/objc/ann/Selector;",
            expectedValues = mapOf("value" to "doIt"),
        )
    }

    @Test
    fun `injects multiple parent annotations - Selector plus IBOutlet`() {
        val input = childWithMethod(name = "com/example/Child2", method = "getView", descriptor = "()Ljava/lang/Object;")

        val out = applyVisitor(input) { AddMissingAnnotations(it) }

        assertHasMethodAnnotation(
            out, "getView", "()Ljava/lang/Object;",
            "Lorg/moe/natj/objc/ann/Selector;",
            expectedValues = mapOf("value" to "getView"),
        )
        assertHasMethodAnnotation(out, "getView", "()Ljava/lang/Object;", "Lorg/moe/natj/objc/ann/IBOutlet;")
    }

    @Test
    fun `injects Selector plus ByValue on return-type-annotated method`() {
        val input = childWithMethod(name = "com/example/Child3", method = "rect", descriptor = "()Ljava/lang/Object;")

        val out = applyVisitor(input) { AddMissingAnnotations(it) }

        assertHasMethodAnnotation(
            out, "rect", "()Ljava/lang/Object;",
            "Lorg/moe/natj/objc/ann/Selector;",
            expectedValues = mapOf("value" to "rect"),
        )
        assertHasMethodAnnotation(out, "rect", "()Ljava/lang/Object;", "Lorg/moe/natj/general/ann/ByValue;")
    }

    @Test
    fun `does not inject when child already has Selector annotation`() {
        val input = childWithMethod(
            name = "com/example/Child4",
            method = "getView",
            descriptor = "()Ljava/lang/Object;",
            preExisting = { mv ->
                val av = mv.visitAnnotation("Lorg/moe/natj/objc/ann/Selector;", true)
                av.visit("value", "getView")
                av.visitEnd()
            },
        )

        val out = applyVisitor(input) { AddMissingAnnotations(it) }

        // Existing Selector preserved.
        assertHasMethodAnnotation(out, "getView", "()Ljava/lang/Object;", "Lorg/moe/natj/objc/ann/Selector;")
        // IBOutlet is NOT injected because the child already had @Selector
        // (early-out short-circuits all parent-annotation injection).
        assertNoMethodAnnotation(out, "getView", "()Ljava/lang/Object;", "Lorg/moe/natj/objc/ann/IBOutlet;")
    }

    @Test
    fun `does not inject when override has no annotated parent method`() {
        val input = childWithMethod(name = "com/example/Child5", method = "noSuchMethod", descriptor = "()V")

        val out = applyVisitor(input) { AddMissingAnnotations(it) }

        assertNoAnnotationAnywhere(out, "Lorg/moe/natj/objc/ann/Selector;")
    }

    private fun childWithMethod(
        name: String,
        method: String,
        descriptor: String,
        preExisting: ((MethodVisitor) -> Unit)? = null,
    ): ByteArray = classBytes(internalName = name, superName = parentInternal) {
        val mv = visitMethod(ACC_PUBLIC, method, descriptor, null, null)
        preExisting?.invoke(mv)
        mv.visitCode()
        mv.visitInsn(RETURN)
        mv.visitMaxs(0, 1)
        mv.visitEnd()
    }
}
