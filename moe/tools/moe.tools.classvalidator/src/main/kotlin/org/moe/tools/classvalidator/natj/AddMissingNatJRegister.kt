package org.moe.tools.classvalidator.natj

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode

/**
 * Make sure all classes that extends [org.moe.natj.general.NativeObject] call
 * `NatJ.register()` in their own [clinit] methods.
 */
class AddMissingNatJRegister(
    next: ClassVisitor?
) : ClassVisitor(Opcodes.ASM9, next) {

    private var skip: Boolean = false
    private var visit: Boolean = false

    private var CLI: MethodNode? = null

    private lateinit var name: String

    override fun visit(version: Int, access: Int, name: String, signature: String?,
                       superName: String?, interfaces: Array<out String>?) {
        this.name = name
        skip = ((access and Opcodes.ACC_INTERFACE) != 0) || name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)
        if (!skip) {
            visit = NatJRuntime.isNativeObjectDescendant(superName)
        }

        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
        if (!skip && !visit) {
            visit = NatJRuntime.RUNTIME_ANNOTATION_DESC == descriptor
        }
        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitMethod(access: Int, name: String, descriptor: String,
                             signature: String?, exceptions: Array<out String>?): MethodVisitor? {
        if (skip || !visit || CLI != null) {
            return super.visitMethod(access, name, descriptor, signature, exceptions)
        }

        if ("<clinit>" == name) {
            CLI = MethodNode(access, name, descriptor, signature, exceptions)
            return CLI!!
        }

        return super.visitMethod(access, name, descriptor, signature, exceptions)
    }

    override fun visitEnd() {
        if (!visit) {
            super.visitEnd()
            return
        }

        val CLI = CLI
        if (CLI != null) {
            var action = NATJREG_UNKNOWN
            val insts = CLI.instructions
            val it = insts.iterator()
            var idx = 0
            while (it.hasNext()) {
                val n = it.next()
                if (n is MethodInsnNode) {
                    if (NatJRuntime.isNatJRegisterInsn(n.owner, n.name, n.desc)) {
                        action = NATJREG_LEAVE_ALONE
                        break
                    }
                }
                idx++
            }
            if (idx == insts.size()) {
                action = NATJREG_INSERT_FIRST
            }

            val mv = super.visitMethod(CLI.access, CLI.name, CLI.desc,
                CLI.signature, CLI.exceptions.toTypedArray())
            when (action) {
                NATJREG_INSERT_FIRST -> {
                    mv.visitCode()
                    mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                        NatJRuntime.NATJ_OWNER, NatJRuntime.NATJ_REGISTER_NAME,
                        NatJRuntime.NATJ_REGISTER_DESC, false)
                    CLI.accept(mv)
                    println("Injected NatJ.register() into $name")
                }
                NATJREG_LEAVE_ALONE -> {
                    mv.visitCode()
                    CLI.accept(mv)
                }
                else -> throw IllegalStateException("NATJREG_UNKNOWN")
            }
        } else {
            val mv = super.visitMethod(Opcodes.ACC_STATIC,
                "<clinit>", "()V", null, null)
            mv.visitCode()
            mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                NatJRuntime.NATJ_OWNER, NatJRuntime.NATJ_REGISTER_NAME,
                NatJRuntime.NATJ_REGISTER_DESC, false)
            mv.visitInsn(Opcodes.RETURN)
            mv.visitMaxs(-1, -1)
            mv.visitEnd()
            println("Injected NatJ.register() into $name")
        }

        super.visitEnd()
    }

    companion object {
        // No information
        private const val NATJREG_UNKNOWN: Int = -1

        // Has clinit, contains NatJ.register() and it is the first instruction
        private const val NATJREG_LEAVE_ALONE: Int = 2

        // Has clinit but doesn't contain NatJ.register()
        private const val NATJREG_INSERT_FIRST: Int = 3
    }
}
