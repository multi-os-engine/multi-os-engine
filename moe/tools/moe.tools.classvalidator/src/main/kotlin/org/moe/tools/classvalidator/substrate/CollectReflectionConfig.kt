package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
import org.moe.tools.classvalidator.natj.NatJRuntime.getDescriptor
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ConstantDynamic
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.Handle
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

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

            if (Modifier.isPublic(access)
                && !Modifier.isAbstract(access)
                && !Modifier.isStatic(access)
                && name.startsWith("call_")) {
                // Check if this method is a Block/Function callback
                val supers = NatJRuntime.getParentImplementations(
                    superName, interfaces, this.name,
                    access, name, descriptor
                )

                val isBlockMethod = supers.any {
                    it.declaringClass.isBlockClass()
                }

                if (isBlockMethod) {
                    config.addMethod(this.name, name, descriptor)
                    return mv
                }
            }

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

        override fun visitLdcInsn(value: Any) {
            when(value) {
                is Type -> {
                    when (value.sort) {
                        Type.OBJECT -> {
                            // We are using reflection in our code, check if it's opaque ptr.
                            if (NatJRuntime.isOpaquePtrDescendant(value.internalName)) {
                                declaringClass.config.addOpaquePtrClass(value.internalName)
                            }
                        }
                        Type.METHOD -> {
                            // TODO: add this
                        }
                    }
                }
                is Handle -> {
                    // TODO: add this
                }
                is ConstantDynamic -> {
                    // TODO: add this
                }
            }

            super.visitLdcInsn(value)
        }

        override fun visitMethodInsn(opcode: Int, owner: String, name: String, descriptor: String, isInterface: Boolean) {
            // We are calling a method, check if the return type is an opaque ptr. If so, we need to export it to reflection
            // because the value might be returned from native via reflection.
            Type.getMethodType(methodDescriptor).returnType.let { type ->
                if (type.sort == Type.OBJECT && NatJRuntime.isOpaquePtrDescendant(type.internalName)) {
                    declaringClass.config.addOpaquePtrClass(type.internalName)
                }
            }

            super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
        }

        override fun visitEnd() {
            if (visit) {
                declaringClass.config.addMethod(declaringClass.name, name, methodDescriptor)

                // This method could be called from native, we inspect its parameters to see if opaque ptr
                // is used. If so, we need to export the opaque ptr impl class to reflection as well.
                Type.getMethodType(methodDescriptor).argumentTypes.forEach { type ->
                    if (type.sort == Type.OBJECT && NatJRuntime.isOpaquePtrDescendant(type.internalName)) {
                        declaringClass.config.addOpaquePtrClass(type.internalName)
                    }
                }
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

        private fun Class<*>.isBlockClass(): Boolean {
            if (!isInterface) {
                return false
            }

            val cname = name
            if ("\$Block_" !in cname && "\$Function_" !in cname) {
                return false
            }

            if (declaredMethods.size != 1) {
                return false
            }

            val hasRuntime = declaredAnnotations.any {
                val desc = it.annotationClass.java.getDescriptor()
                desc == NatJRuntime.Annotations.RUNTIME_DESC
            }

            return hasRuntime
        }

        private fun ReflectionConfig.addOpaquePtrClass(className: String) {
            // Add the outer class that contains the Impl class
            addClass(
                className,
                allDeclaredClasses = true
            )

            // Add the impl class
            val implClassName = "$className\$Impl"
            addClass(implClassName)
            // Add the constructor of the impl class
            addMethod(implClassName, "<init>", NatJRuntime.NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC)
        }
    }
}
