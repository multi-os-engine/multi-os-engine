package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

class CollectSimpleReflectionConfig(
    private val config: ReflectionConfig,
    next: ClassVisitor? = null,
) : ClassVisitor(Opcodes.ASM9, next) {
    private lateinit var name: String
    private var registerOnStartup: Boolean = false

    override fun visit(
        version: Int,
        access: Int,
        name: String,
        signature: String?,
        superName: String?,
        interfaces: Array<out String>?
    ) {
        this.name = name
        if (NatJRuntime.isNativeObjectDescendant(superName))
            config.addClass(name)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
        if (NatJRuntime.Annotations.REGISTER_ON_STARTUP == descriptor) {
            config.addClass(name)
            registerOnStartup = true
        }

        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitMethod(
        access: Int,
        name: String,
        descriptor: String,
        signature: String?,
        exceptions: Array<out String>?
    ): MethodVisitor? {
        if (registerOnStartup)
            config.addMethod(this.name, name, descriptor)
        return super.visitMethod(access, name, descriptor, signature, exceptions)
    }
}