package org.moe.tools.classvalidator.natj

import org.objectweb.asm.Type

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
}