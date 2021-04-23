package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
import org.moe.tools.classvalidator.natj.NatJRuntime.getPackageName
import org.moe.tools.classvalidator.natj.NatJRuntime.toClass
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.Method
import java.lang.reflect.Modifier

/**
 * Collect all classes, methods & fields that will be used by NatJ via reflection & JNI,
 * and generate configure files used by SVM accordingly.
 */
class CollectReflectionConfig(
    private val config: ReflectionConfig,
    private var collectAll: Boolean = false,
    next: ClassVisitor? = null,
) : ClassVisitor(Opcodes.ASM9, next) {

    private var skip: Boolean = false
    private var visit: Boolean = false

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
            visit = true
        } else {
            skip = name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)
            if (!skip) {
                visit = NatJRuntime.isNativeObjectDescendant(superName)
            }

            if (!skip && visit) {
                config.addClass(name)
            }
        }

        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
        if (!collectAll) {
            if (!skip && !visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
            }

            if (!skip && visit) {
                config.addClass(name)
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
            if (skip || !visit) {
                return super.visitField(access, name, descriptor, signature, value)
            }

            if (name == NatJRuntime.NATJ_STRUCT_OBJECT_CACHE_FIELD) {
                config.addField(this.name, name)
                return super.visitField(access, name, descriptor, signature, value)
            }

            val fv = super.visitField(access, name, descriptor, signature, value)

            return FieldInspector(
                declaringClass = this,
                name = name,
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
            if (skip || !visit) {
                return super.visitMethod(access, name, descriptor, signature, exceptions)
            }

            if (name == "<init>" && descriptor == NatJRuntime.NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC) {
                config.addMethod(this.name, name, descriptor)
                return super.visitMethod(access, name, descriptor, signature, exceptions)
            }

            val mv = super.visitMethod(access, name, descriptor, signature, exceptions)

            return MethodInspector(
                declaringClass = this,
                access = access,
                name = name,
                methodDescriptor = descriptor,
                next = mv
            )
        }
    }

    private class FieldInspector(
        private val declaringClass: CollectReflectionConfig,
        private val name: String,
        next: FieldVisitor?,
    ) : FieldVisitor(Opcodes.ASM9, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
            if (!visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
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
        private val access: Int,
        private val name: String,
        private val methodDescriptor: String,
        next: MethodVisitor?,
    ) : MethodVisitor(Opcodes.ASM9, next) {
        private var visit: Boolean = false

        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
            if (!visit) {
                visit = descriptor in EXPORTED_ANNOTATION_DESC
            }
            return super.visitAnnotation(descriptor, visible)
        }

        override fun visitEnd() {
            if (!visit) {
                // Check parent method for inherited annotations
                val parents = mutableListOf<String>()

                declaringClass.superName?.let {
                    parents.add(it)
                }
                declaringClass.interfaces?.let {
                    parents.addAll(it)
                }
                visit = parents.any {
                    checkParent(NatJRuntime.getClassFor(it))
                }
            }

            if (visit) {
                declaringClass.config.addMethod(declaringClass.name, name, methodDescriptor)
            }
            super.visitEnd()
        }

        private fun checkParent(c: Class<*>?): Boolean {
            if (c == null) {
                return false
            }

            try {
                val m = c.getDeclaredMethod(name, *getParamClasses(methodDescriptor))
                if (overrideByThis(m)) {
                    return true
                }
            } catch (e: NoSuchMethodException) {
                // Do nothing
            }

            if (checkParent(c.superclass)) {
                return true
            }

            return c.interfaces.any { checkParent(it) }
        }

        private fun overrideByThis(parentMethod: Method): Boolean {
            val parentClass = parentMethod.declaringClass
            if (Modifier.isPrivate(access) || Modifier.isPrivate(parentMethod.modifiers)) {
                return false
            }
            if (Modifier.isStatic(access) || Modifier.isStatic(parentMethod.modifiers)) {
                return false
            }
            if (Modifier.isFinal(parentMethod.modifiers)) {
                return false
            }
            if (compareAccess(access, parentMethod.modifiers) < 0) {
                return false
            }
            if ((isPackageAccess(access) || isPackageAccess(parentMethod.modifiers))
                && Type.getObjectType(declaringClass.name).getPackageName() != parentClass.`package`?.name) {
                return false
            }
            val methodDesc = Type.getMethodType(methodDescriptor)
            val retType = methodDesc.returnType.toClass()
            if (!parentMethod.returnType.isAssignableFrom(retType)) {
                return false
            }
            val paramsB = parentMethod.parameterTypes.map(Type::getType)
            if (methodDesc.argumentTypes.toList() != paramsB) {
                return false
            }
            return true
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

        private const val ACCESS_MODIFIERS = Modifier.PUBLIC or Modifier.PROTECTED or Modifier.PRIVATE

        private fun isPackageAccess(mods: Int): Boolean = (mods and ACCESS_MODIFIERS) == 0
        private val ACCESS_ORDER = listOf(
            Modifier.PRIVATE,
            0,
            Modifier.PROTECTED,
            Modifier.PUBLIC
        )

        private fun compareAccess(lhs: Int, rhs: Int): Int = ACCESS_ORDER.indexOf(lhs and ACCESS_MODIFIERS)
            .compareTo(ACCESS_ORDER.indexOf(rhs and ACCESS_MODIFIERS))

        private fun getParamClasses(desc: String): Array<Class<*>> {
            return Type.getMethodType(desc).argumentTypes.map { it.toClass() }.toTypedArray()
        }
    }
}