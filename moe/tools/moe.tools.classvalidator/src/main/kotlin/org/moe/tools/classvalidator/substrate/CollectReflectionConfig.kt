package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
import org.moe.tools.classvalidator.natj.NatJRuntime.NATJ_NATIVE_RUNTIME
import org.moe.tools.classvalidator.natj.NatJRuntime.isDescendantOf
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type

/**
 * Collect all classes, methods & fields that will be used by NatJ via reflection & JNI,
 * and generate configure files used by SVM accordingly.
 */
class CollectReflectionConfig(
    private val config: ReflectionConfig,
    next: ClassVisitor?,
) : ClassVisitor(Opcodes.ASM9, next) {

    private var skip: Boolean = false
    private var visit: Boolean = false

    private lateinit var name: String

    override fun visit(version: Int, access: Int, name: String, signature: String?,
                       superName: String?, interfaces: Array<out String>?) {
        this.name = name
        skip = name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)
        if (!skip) {
            visit = NatJRuntime.isNativeObjectDescendant(superName)
        }

        if (!skip && visit) {
            config.addClass(name)
        }
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor {
        if (!skip) {
            if (!visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
            }
            if (visit) {
                config.addClass(name)

                // Make sure the runtime class is available to reflection
                if (descriptor == NatJRuntime.RUNTIME_ANNOTATION_DESC) {
                    val av = super.visitAnnotation(descriptor, visible)
                    return RuntimeAnnotationVisitor(
                        config = config,
                        className = this.name,
                        next = av
                    )
                }
            }
        }

        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitField(access: Int, name: String, descriptor: String,
                            signature: String?, value: Any?): FieldVisitor {
        if (skip || !visit) {
            return super.visitField(access, name, descriptor, signature, value)
        }

        if (name == NatJRuntime.NATJ_STRUCT_OBJECT_CACHE_FIELD) {
            config.addField(this.name, name)
            return super.visitField(access, name, descriptor, signature, value)
        }

        val fv = super.visitField(access, name, descriptor, signature, value)

        return FieldInspector(
            config = config,
            declaringClass = this.name,
            name = name,
            next = fv
        )
    }

    override fun visitMethod(access: Int, name: String, descriptor: String,
                             signature: String?, exceptions: Array<out String>?): MethodVisitor {
        if (skip || !visit) {
            return super.visitMethod(access, name, descriptor, signature, exceptions)
        }

        if (name == "<init>" && descriptor == NatJRuntime.NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC) {
            config.addMethod(this.name, name, descriptor)
            return super.visitMethod(access, name, descriptor, signature, exceptions)
        }

        val mv = super.visitMethod(access, name, descriptor, signature, exceptions)

        return MethodInspector(
            config = config,
            declaringClass = this.name,
            name = name,
            methodDescriptor = descriptor,
            next = mv
        )
    }

    private class RuntimeAnnotationVisitor(
        private val config: ReflectionConfig,
        private val className: String,
        next: AnnotationVisitor?,
    ) : AnnotationVisitor(Opcodes.ASM9, next) {
        override fun visit(name: String, value: Any) {
            if (name == "value") {
                value as Type

                require(value.isDescendantOf(NATJ_NATIVE_RUNTIME)) {
                    "Value of Runtime annotation must be a $NATJ_NATIVE_RUNTIME"
                }

                println("Find runtime: ${value.className}")
                config.addMethod(value.className, "<init>", NatJRuntime.NATJ_RUNTIME_INIT_DESC)
            }
            super.visit(name, value)
        }
    }

    private class FieldInspector(
        private val config: ReflectionConfig,
        private val declaringClass: String,
        private val name: String,
        next: FieldVisitor?,
    ) : FieldVisitor(Opcodes.ASM9, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor {
            if (!visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
            }
            return super.visitAnnotation(descriptor, visible)
        }

        override fun visitEnd() {
            if (visit) {
                config.addField(declaringClass, name)
            }
            super.visitEnd()
        }
    }

    private class MethodInspector(
        private val config: ReflectionConfig,
        private val declaringClass: String,
        private val name: String,
        private val methodDescriptor: String,
        next: MethodVisitor?,
    ) : MethodVisitor(Opcodes.ASM9, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor {
            if (!visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
            }
            return super.visitAnnotation(descriptor, visible)
        }

        override fun visitEnd() {
            if (visit) {
                config.addMethod(declaringClass, name, methodDescriptor)
            }
            super.visitEnd()
        }
    }

    companion object {
        private val EXPORTED_ANNOTATION_DESC: Set<String> = setOf(
            "Lorg/moe/natj/general/ann/RegisterOnStartup;",
            NatJRuntime.RUNTIME_ANNOTATION_DESC,
            "Lorg/moe/natj/objc/ann/InstanceVariable;",
            "Lorg/moe/natj/objc/ann/ObjCBlock;",
            "Lorg/moe/natj/objc/ann/ProtocolClassMethod;",
            "Lorg/moe/natj/objc/ann/Selector;",
            "Lorg/moe/natj/c/ann/CFunction;",
            "Lorg/moe/natj/c/ann/CVariable;",
            "Lorg/moe/natj/c/ann/Structure;",
            "Lorg/moe/natj/c/ann/StructureField;",
            // TODO: add CXX annotations
        )
    }
}