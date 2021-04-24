package org.moe.tools.classvalidator.natj

import org.objectweb.asm.Type
import java.lang.reflect.Method
import java.lang.reflect.Modifier

object NatJRuntime {

    const val NATJ_CLASS_PREFIX = "org/moe/natj/"
    const val NATJ_NATIVE_OBJECT = "org.moe.natj.general.NativeObject"
    const val NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC = "(Lorg/moe/natj/general/Pointer;)V"
    const val NATJ_OWNER = "org/moe/natj/general/NatJ"
    const val NATJ_REGISTER_DESC = "()V"
    const val NATJ_REGISTER_NAME = "register"
    const val RUNTIME_ANNOTATION_DESC = "Lorg/moe/natj/general/ann/Runtime;"
    const val NATJ_STRUCT_OBJECT_CACHE_FIELD = "__natjCache"

    fun isNatJRegisterInsn(owner: String, name: String, desc: String): Boolean {
        return NATJ_OWNER == owner && NATJ_REGISTER_NAME == name
            && NATJ_REGISTER_DESC == desc
    }

    fun isNativeObjectDescendant(superName: String?): Boolean {
        if (superName == null) {
            return false
        }

        try {
            var cls: Class<*>? = getClassFor(superName)
            var depth = 0
            while (cls != null) {
                depth++

                if (NATJ_NATIVE_OBJECT == cls.name) {
                    return true
                }

                cls = cls.superclass
            }
        } catch (_: Throwable) {
            println("Warning: failed to process class hierarchy, assuming class '$superName' is not NativeObject descendant")
        }

        return false
    }

    fun getParentImplementation(
        superName: String?, interfaces: Array<out String>?,
        declaringClass: String, access: Int, name: String, desc: String,
        annotations: Set<String>,
    ): Method? {
        val parents = mutableListOf<String>()
        superName?.let {
            parents.add(it)
        }
        interfaces?.let {
            parents.addAll(it)
        }

        parents.forEach {
            checkParentMethod(
                c = getClassFor(it),
                declaringClass = declaringClass, access = access, name = name, desc = desc,
                annotations = annotations
            )?.let { m ->
                return m
            }
        }

        return null
    }

    private fun checkParentMethod(
        c: Class<*>?,
        declaringClass: String, access: Int, name: String, desc: String,
        annotations: Set<String>,
    ): Method? {
        if (c == null) {
            return null
        }

        try {
            val m = c.getDeclaredMethod(name, *getParamClasses(desc))
            if (isOverride(
                    declaringClass = declaringClass, access = access, desc = desc,
                    parentMethod = m
                )) {
                // Check annotation
                val hasAnnotation = m.declaredAnnotations.any {
                    it.annotationClass.java.getDescriptor() in annotations
                }
                if (hasAnnotation) {
                    return m
                }
            }
        } catch (e: NoSuchMethodException) {
            // Do nothing
        }

        checkParentMethod(
            c = c.superclass,
            declaringClass = declaringClass, access = access, name = name, desc = desc,
            annotations = annotations
        )?.let {
            return it
        }

        c.interfaces.forEach {
            checkParentMethod(
                c = it,
                declaringClass = declaringClass, access = access, name = name, desc = desc,
                annotations = annotations
            )?.let { m ->
                return m
            }
        }

        return null
    }

    private fun isOverride(
        declaringClass: String, access: Int, desc: String,
        parentMethod: Method,
    ): Boolean {
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
            && Type.getObjectType(declaringClass).getPackageName() != parentClass.`package`?.name) {
            return false
        }
        val methodDesc = Type.getMethodType(desc)
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


    fun Class<*>.getDescriptor(): String = Type.getDescriptor(this)

    private val classLoader: ClassLoader
        get() = Thread.currentThread().contextClassLoader!!

    fun getClassFor(cls: String): Class<*> = Class.forName(cls.replace("/", "."), false, classLoader)

    fun Type.getPackageName(): String {
        return className.split('.').dropLast(1).joinToString(".")
    }

    fun Type.toClass(): Class<*> {
        return when (this.sort) {
            Type.VOID -> java.lang.Void.TYPE
            Type.BOOLEAN -> java.lang.Boolean.TYPE
            Type.CHAR -> java.lang.Character.TYPE
            Type.BYTE -> java.lang.Byte.TYPE
            Type.SHORT -> java.lang.Short.TYPE
            Type.INT -> java.lang.Integer.TYPE
            Type.FLOAT -> java.lang.Float.TYPE
            Type.LONG -> java.lang.Long.TYPE
            Type.DOUBLE -> java.lang.Double.TYPE
            Type.ARRAY -> getClassFor(this.internalName)
            Type.OBJECT -> getClassFor(this.className)
            else -> throw IllegalArgumentException("$this")
        }
    }

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