package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
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
    private var collectAll: Boolean = false,
    next: ClassVisitor? = null,
) : ClassVisitor(Opcodes.ASM5, next) {

    private var skip: Boolean = false
    private var isNatJBindingClass: Boolean = false

    private lateinit var name: String
    private var superName: String? = null
    private var interfaces: Array<out String>? = null

    override fun visit(version: Int, access: Int, name: String, signature: String?,
                       superName: String?, interfaces: Array<out String>?) {
        this.name = name
        this.superName = superName
        this.interfaces = interfaces

        collectAll = collectAll
            // Make sure everything from NatJ are available.
            // TODO: This is a quick hack, refine this
            || name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)

        if (collectAll) {
            config.addClass(name)
            skip = false
        } else {
            skip = name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)
            if (!skip) {
                isNatJBindingClass = NatJRuntime.isNativeObjectDescendant(superName)

                if (isNatJBindingClass) {
                    config.addClass(name)
                }
            }
        }

        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
        if (!collectAll) {
            if (!skip && !isNatJBindingClass) {
                isNatJBindingClass = descriptor in NATJ_EXPORTED_ANNOTATION_DESC

                if (isNatJBindingClass || descriptor in SVM_EXPORTED_ANNOTATION_DESC) {
                    config.addClass(name)
                }
            }
        }
        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitField(access: Int, name: String, descriptor: String,
                            signature: String?, value: Any?): FieldVisitor? {
        if (collectAll) {
            config.addField(this.name, name)
            return super.visitField(access, name, descriptor, signature, value)
        } else {
            if (skip) {
                return super.visitField(access, name, descriptor, signature, value)
            }

            if (isNatJBindingClass) {
                if (name == NatJRuntime.NATJ_STRUCT_OBJECT_CACHE_FIELD) {
                    config.addField(this.name, name)
                    return super.visitField(access, name, descriptor, signature, value)
                }
            }

            val fv = super.visitField(access, name, descriptor, signature, value)

            return FieldInspector(
                declaringClass = this,
                name = name,
                isNatJBindingClass = isNatJBindingClass,
                next = fv
            )
        }
    }

    override fun visitMethod(access: Int, name: String, descriptor: String,
                             signature: String?, exceptions: Array<out String>?): MethodVisitor? {
        if (collectAll) {
            config.addMethod(this.name, name, descriptor)
            return super.visitMethod(access, name, descriptor, signature, exceptions)
        } else {
            if (skip) {
                return super.visitMethod(access, name, descriptor, signature, exceptions)
            }

            if (isNatJBindingClass) {
                if (name == "<init>" && descriptor == NatJRuntime.NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC) {
                    config.addMethod(this.name, name, descriptor)
                    return super.visitMethod(access, name, descriptor, signature, exceptions)
                }
            }

            val mv = super.visitMethod(access, name, descriptor, signature, exceptions)

            return MethodInspector(
                declaringClass = this,
                name = name,
                methodDescriptor = descriptor,
                isNatJBindingClass = isNatJBindingClass,
                next = mv
            )
        }
    }

    private class FieldInspector(
        private val declaringClass: CollectReflectionConfig,
        private val name: String,
        private val isNatJBindingClass: Boolean,
        next: FieldVisitor?,
    ) : FieldVisitor(Opcodes.ASM5, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
            if (!visit) {
                visit = descriptor in SVM_EXPORTED_ANNOTATION_DESC

                if (isNatJBindingClass) {
                    visit = visit || descriptor in NATJ_EXPORTED_ANNOTATION_DESC
                }
            }
            return super.visitAnnotation(descriptor, visible)
        }

        override fun visitEnd() {
            if (visit) {
                declaringClass.config.addField(declaringClass.name, name)
            }
            super.visitEnd()
        }
    }

    private class MethodInspector(
        private val declaringClass: CollectReflectionConfig,
        private val name: String,
        private val methodDescriptor: String,
        private val isNatJBindingClass: Boolean,
        next: MethodVisitor?,
    ) : MethodVisitor(Opcodes.ASM5, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
            if (!visit) {
                visit = descriptor in SVM_EXPORTED_ANNOTATION_DESC

                if (isNatJBindingClass) {
                    visit = visit || descriptor in NATJ_EXPORTED_ANNOTATION_DESC
                }
            }
            return super.visitAnnotation(descriptor, visible)
        }

        override fun visitEnd() {
            if (visit) {
                declaringClass.config.addMethod(declaringClass.name, name, methodDescriptor)
            }
            super.visitEnd()
        }
    }

    companion object {
        private val NATJ_EXPORTED_ANNOTATION_DESC: Set<String> = setOf(
            "Lorg/moe/natj/general/ann/RegisterOnStartup;",
            NatJRuntime.Annotations.RUNTIME_DESC,
            "Lorg/moe/natj/objc/ann/InstanceVariable;",
            "Lorg/moe/natj/objc/ann/ObjCBlock;",
            "Lorg/moe/natj/objc/ann/ProtocolClassMethod;",
            NatJRuntime.Annotations.SELECTOR_DESC,
            "Lorg/moe/natj/c/ann/CFunction;",
            "Lorg/moe/natj/c/ann/CVariable;",
            "Lorg/moe/natj/c/ann/Structure;",
            "Lorg/moe/natj/c/ann/StructureField;",
            // TODO: add CXX annotations
        )

        private val SVM_EXPORTED_ANNOTATION_DESC = setOf(
            "Lorg/moe/svm/anns/JNI;",
            "Lorg/moe/svm/anns/Reflection;",
        )
    }
}