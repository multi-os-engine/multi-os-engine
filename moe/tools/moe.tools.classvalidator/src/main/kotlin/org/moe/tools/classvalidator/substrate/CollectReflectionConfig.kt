package org.moe.tools.classvalidator.substrate

import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes

/**
 * Collect all classes, methods & fields that will be used by NatJ via reflection & JNI,
 * and generate configure files used by SVM accordingly.
 */
class CollectReflectionConfig(
    private val config: ReflectionConfig,
    next: ClassVisitor?,
): ClassVisitor(Opcodes.ASM9, next) {

    private lateinit var name: String

    override fun visit(version: Int, access: Int, name: String, signature: String?,
                       superName: String?, interfaces: Array<out String>?) {
        this.name = name
        config.addClass(name)
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor {
        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitField(access: Int, name: String, descriptor: String,
                            signature: String?, value: Any?): FieldVisitor {
        config.addField(this.name, name)
        return super.visitField(access, name, descriptor, signature, value)
    }

    override fun visitMethod(access: Int, name: String, descriptor: String,
                             signature: String?, exceptions: Array<out String>?): MethodVisitor {
        config.addMethod(this.name, name, descriptor)
        return super.visitMethod(access, name, descriptor, signature, exceptions)
    }
}