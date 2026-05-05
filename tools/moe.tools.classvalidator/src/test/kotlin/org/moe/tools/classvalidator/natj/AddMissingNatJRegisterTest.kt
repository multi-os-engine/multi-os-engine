package org.moe.tools.classvalidator.natj

import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes.ACC_INTERFACE
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.ACC_STATIC
import org.objectweb.asm.Opcodes.ICONST_0
import org.objectweb.asm.Opcodes.INVOKESTATIC
import org.objectweb.asm.Opcodes.POP
import org.objectweb.asm.Opcodes.RETURN

class AddMissingNatJRegisterTest : ASMTest() {

    @Test
    fun `injects new clinit when class extends NativeObject and has none`() {
        val input = nativeObjectSubclass("com/example/Binding")

        val out = applyVisitor(input) { AddMissingNatJRegister(it) }

        assertMethodCount(out, "<clinit>", "()V", 1)
        assertMethodInvokes(
            out, "<clinit>", "()V",
            opcode = INVOKESTATIC,
            owner = "org/moe/natj/general/NatJ", name = "register", descriptor = "()V",
        )
    }

    @Test
    fun `inserts NatJ register at start of existing clinit without call`() {
        val input = nativeObjectSubclassWithClinit("com/example/BindingWithClinit") { mv ->
            // Existing <clinit>: ICONST_0; POP; RETURN
            mv.visitCode()
            mv.visitInsn(ICONST_0)
            mv.visitInsn(POP)
            mv.visitInsn(RETURN)
            mv.visitMaxs(1, 0)
            mv.visitEnd()
        }

        val out = applyVisitor(input) { AddMissingNatJRegister(it) }

        // The injected NatJ.register call must be the very first instruction
        // (before the original ICONST_0).
        assertFirstInstructionInvokes(
            out, "<clinit>", "()V",
            opcode = INVOKESTATIC,
            owner = "org/moe/natj/general/NatJ", name = "register", descriptor = "()V",
        )
        assertMethodCount(out, "<clinit>", "()V", 1)
    }

    @Test
    fun `leaves clinit alone when it already calls NatJ register`() {
        val input = nativeObjectSubclassWithClinit("com/example/AlreadyRegistered") { mv ->
            mv.visitCode()
            mv.visitMethodInsn(INVOKESTATIC, "org/moe/natj/general/NatJ", "register", "()V", false)
            mv.visitInsn(RETURN)
            mv.visitMaxs(0, 0)
            mv.visitEnd()
        }

        val out = applyVisitor(input) { AddMissingNatJRegister(it) }

        assertMethodCount(out, "<clinit>", "()V", 1)
        // The visitor must not duplicate the existing NatJ.register call.
        assertMethodInvocationCount(
            out, "<clinit>", "()V",
            opcode = INVOKESTATIC,
            owner = "org/moe/natj/general/NatJ", name = "register", descriptor = "()V",
            expected = 1,
        )
    }

    @Test
    fun `does not inject when class does not extend NativeObject`() {
        val input = classBytes("com/example/Plain")

        val out = applyVisitor(input) { AddMissingNatJRegister(it) }

        assertNoMethod(out, "<clinit>", "()V")
    }

    @Test
    fun `does not inject into interfaces`() {
        val input = classBytes("com/example/Itf", access = ACC_PUBLIC or ACC_INTERFACE)

        val out = applyVisitor(input) { AddMissingNatJRegister(it) }

        assertNoMethod(out, "<clinit>", "()V")
    }

    private fun nativeObjectSubclassWithClinit(
        internalName: String,
        clinitBody: (MethodVisitor) -> Unit,
    ): ByteArray = nativeObjectSubclass(internalName) {
        val mv = visitMethod(ACC_STATIC, "<clinit>", "()V", null, null)
        clinitBody(mv)
    }
}
