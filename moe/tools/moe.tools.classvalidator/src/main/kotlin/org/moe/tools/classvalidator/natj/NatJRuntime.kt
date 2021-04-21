package org.moe.tools.classvalidator.natj

import org.objectweb.asm.Type

object NatJRuntime {

    const val NATJ_CLASS_PREFIX = "org/moe/natj/"
    const val NATJ_NATIVE_OBJECT = "org.moe.natj.general.NativeObject"
    const val NATJ_NATIVE_RUNTIME = "org.moe.natj.general.NativeRuntime"
    const val NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC = "(Lorg/moe/natj/general/Pointer;)V"
    const val NATJ_OWNER = "org/moe/natj/general/NatJ"
    const val NATJ_REGISTER_DESC = "()V"
    const val NATJ_RUNTIME_INIT_DESC = "()V"
    const val NATJ_REGISTER_NAME = "register"
    const val RUNTIME_ANNOTATION_DESC = "Lorg/moe/natj/general/ann/Runtime;"
    const val NATJ_STRUCT_OBJECT_CACHE_FIELD = "__natjCache"

    fun isNatJRegisterInsn(owner: String, name: String, desc: String): Boolean {
        return NATJ_OWNER == owner && NATJ_REGISTER_NAME == name
            && NATJ_REGISTER_DESC == desc
    }

    fun isDescendant(thisName: String?, parentName: String): Boolean {
        if (thisName == null) {
            return false
        }

        try {
            var cls: Class<*>? = getClassFor(thisName)
            var depth = 0
            while (cls != null) {
                depth++

                if (parentName == cls.name) {
                    return true
                }

                cls = cls.superclass
            }
        } catch (_: Throwable) {
            println("Warning: failed to process class hierarchy, assuming class '$thisName' is not descendant of '$parentName'")
        }

        return false
    }

    fun isNativeObjectDescendant(superName: String?): Boolean = isDescendant(superName, NATJ_NATIVE_OBJECT)

    fun Type.isDescendantOf(parentName: String): Boolean = isDescendant(this.internalName, parentName)

    private val classLoader: ClassLoader
        get() = Thread.currentThread().contextClassLoader!!

    fun getClassFor(cls: String): Class<*> = classLoader.loadClass(cls.replace("/", "."))
}