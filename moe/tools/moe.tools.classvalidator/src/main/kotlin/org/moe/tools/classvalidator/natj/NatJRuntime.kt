package org.moe.tools.classvalidator.natj

import org.objectweb.asm.Type
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.LinkedList

object NatJRuntime {

    object Annotations {
        const val BY_VALUE_DESC = "Lorg/moe/natj/general/ann/ByValue;"
        const val MAPPED_DESC = "Lorg/moe/natj/general/ann/Mapped;"
        const val MAPPED_RETURN_DESC = "Lorg/moe/natj/general/ann/MappedReturn;"
        const val NFLOAT_DESC = "Lorg/moe/natj/general/ann/NFloat;"
        const val NINT_DESC = "Lorg/moe/natj/general/ann/NInt;"
        const val NUINT_DESC = "Lorg/moe/natj/general/ann/NUInt;"
        const val OWNED_DESC = "Lorg/moe/natj/general/ann/Owned;"
        const val REFERENCE_INFO_DESC = "Lorg/moe/natj/general/ann/ReferenceInfo;"

        const val FUNCTION_PTR_DESC = "Lorg/moe/natj/c/ann/FunctionPtr;"

        const val IBACTION_DESC = "Lorg/moe/natj/objc/ann/IBAction;"
        const val IBOUTLET_DESC = "Lorg/moe/natj/objc/ann/IBOutlet;"
        const val IBOUTLET_COLLECTION_DESC = "Lorg/moe/natj/objc/ann/IBOutletCollection;"
        const val NOT_IMPLEMENTED_DESC = "Lorg/moe/natj/objc/ann/NotImplemented;"
        const val OBJC_BLOCK_DESC = "Lorg/moe/natj/objc/ann/ObjCBlock;"
        const val SELECTOR_DESC = "Lorg/moe/natj/objc/ann/Selector;"
        const val PROTOCOL_CLASS_METHOD_DESC = "Lorg/moe/natj/objc/ann/ProtocolClassMethod;"

        const val RUNTIME_DESC = "Lorg/moe/natj/general/ann/Runtime;"
        const val OBJC_PROTOCOL_NAME_DESC = "Lorg/moe/natj/objc/ann/ObjCProtocolName;"
        const val OBJC_IS_OPTIONAL_DESC = "Lorg/moe/natj/objc/ann/IsOptional;"

        val OPTIONALS_DESC: List<String> = listOf(
            BY_VALUE_DESC,
            MAPPED_DESC, MAPPED_RETURN_DESC, NFLOAT_DESC, NINT_DESC, NUINT_DESC, OWNED_DESC,
            REFERENCE_INFO_DESC, FUNCTION_PTR_DESC, IBACTION_DESC, IBOUTLET_DESC,
            IBOUTLET_COLLECTION_DESC, NOT_IMPLEMENTED_DESC, OBJC_BLOCK_DESC,
            SELECTOR_DESC, PROTOCOL_CLASS_METHOD_DESC,
        )

        val NON_OPTIONALS_DESC: List<String> = listOf(
            BY_VALUE_DESC,
            MAPPED_DESC, MAPPED_RETURN_DESC, NFLOAT_DESC, NINT_DESC, NUINT_DESC, OWNED_DESC,
            REFERENCE_INFO_DESC, FUNCTION_PTR_DESC, IBACTION_DESC, IBOUTLET_DESC,
            IBOUTLET_COLLECTION_DESC, OBJC_BLOCK_DESC, SELECTOR_DESC, PROTOCOL_CLASS_METHOD_DESC,
        )

        val COLLIDING_ANNS_DESC: List<List<String>> = listOf(
            listOf(NFLOAT_DESC, NINT_DESC, NUINT_DESC),
            listOf(FUNCTION_PTR_DESC, OBJC_BLOCK_DESC),
            listOf(IBACTION_DESC, IBOUTLET_DESC, IBOUTLET_COLLECTION_DESC),
            listOf(MAPPED_DESC, MAPPED_RETURN_DESC),
        )

        val ALL_ANNS_DESC: List<String> = listOf(
            BY_VALUE_DESC,
            MAPPED_DESC, MAPPED_RETURN_DESC, NFLOAT_DESC, NINT_DESC, NUINT_DESC, OWNED_DESC,
            REFERENCE_INFO_DESC, FUNCTION_PTR_DESC, IBACTION_DESC, IBOUTLET_DESC,
            IBOUTLET_COLLECTION_DESC, NOT_IMPLEMENTED_DESC, OBJC_BLOCK_DESC,
            SELECTOR_DESC, PROTOCOL_CLASS_METHOD_DESC,
        )

        val RETURN_ANNS_DESC: List<String> = listOf(
            BY_VALUE_DESC,
            MAPPED_RETURN_DESC, NFLOAT_DESC, NINT_DESC, NUINT_DESC, OWNED_DESC,
            REFERENCE_INFO_DESC, FUNCTION_PTR_DESC, IBACTION_DESC, IBOUTLET_DESC,
            IBOUTLET_COLLECTION_DESC, NOT_IMPLEMENTED_DESC, OBJC_BLOCK_DESC,
            SELECTOR_DESC, PROTOCOL_CLASS_METHOD_DESC,
        )

        val PARAM_ANNS_DESC: List<String> = listOf(
            BY_VALUE_DESC,
            MAPPED_DESC, NFLOAT_DESC, NINT_DESC, NUINT_DESC, OWNED_DESC, REFERENCE_INFO_DESC,
            FUNCTION_PTR_DESC, OBJC_BLOCK_DESC,
        )
    }

    const val NATJ_CLASS_PREFIX = "org/moe/natj/"
    const val NATJ_NATIVE_OBJECT = "org.moe.natj.general.NativeObject"
    const val NATJ_NATIVE_OBJECT_CONSTRUCTOR_DESC = "(Lorg/moe/natj/general/Pointer;)V"
    const val NATJ_OPAQUE_PTR = "org.moe.natj.c.OpaquePtr"
    const val NATJ_OWNER = "org/moe/natj/general/NatJ"
    const val NATJ_REGISTER_DESC = "()V"
    const val NATJ_REGISTER_NAME = "register"
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
            while (cls != null) {
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

    fun isOpaquePtrDescendant(className: String?): Boolean {
        if (className == null) {
            return false
        }

        try {
            val cls: Class<*> = getClassFor(className)
            val itfs: LinkedList<Class<*>> = LinkedList()
            itfs.add(cls)
            itfs.addAll(cls.interfaces)
            while (itfs.isNotEmpty()) {
                val itf = itfs.pop()
                if (NATJ_OPAQUE_PTR == itf.name) {
                    return true
                }

                itfs.addAll(itf.interfaces)
            }
        } catch (_: Throwable) {
            println("Warning: failed to process class hierarchy, assuming class '$className' is not OpaquePtr descendant")
        }

        return false
    }

    fun getParentImplementations(
        superName: String?, interfaces: Array<out String>?,
        declaringClass: String, access: Int, name: String, desc: String,
        annotations: Set<String> = emptySet(),
        allowStatic: Boolean = false,
    ): List<Method> {
        val ps: MutableSet<Class<*>> = linkedSetOf()

        fun tryGetClassFor(cls: String): Class<*>? = try {
            getClassFor(cls)
        } catch (_: ClassNotFoundException) {
            println("Warning: failed to process class hierarchy, cannot find super class/interface $cls, ignored")
            null
        }

        var s: Class<*>? = superName?.let { tryGetClassFor(it) }
        while (s != null) {
            ps.add(s)

            s = s.superclass
        }

        val itfs: LinkedList<Class<*>> = LinkedList()
        interfaces?.mapNotNullTo(itfs, ::tryGetClassFor)
        while (itfs.isNotEmpty()) {
            val itf = itfs.pop()
            ps.add(itf)

            itfs.addAll(itf.interfaces)
        }

        val results: MutableList<Method> = mutableListOf()

        ps.forEach { c ->
            try {
                val m = c.getDeclaredMethod(name, *getParamClasses(desc))
                if (isOverride(
                        declaringClass = declaringClass, access = access, desc = desc,
                        parentMethod = m,
                        allowStatic = allowStatic,
                    )) {
                    // Check annotation
                    val hasAnnotation = annotations.isEmpty() || m.declaredAnnotations.any {
                        it.annotationClass.java.getDescriptor() in annotations
                    }
                    if (hasAnnotation) {
                        results.add(m)
                    }
                }
            } catch (e: NoSuchMethodException) {
                // Do nothing
            } catch (e: ClassNotFoundException) {
                // Do nothing
            } catch (e: LinkageError) {
                // Do nothing
            }
        }

        return results
    }

    fun getParentImplementation(
        superName: String?, interfaces: Array<out String>?,
        declaringClass: String, access: Int, name: String, desc: String,
        annotations: Set<String> = emptySet(),
        allowStatic: Boolean = false,
    ): Method? {
        return getParentImplementations(
            superName, interfaces, declaringClass, access, name, desc, annotations, allowStatic
        ).firstOrNull()
    }

    fun isOverride(
        declaringClass: String, access: Int, desc: String,
        parentMethod: Method,
        allowStatic: Boolean,
    ): Boolean {
        val parentClass = parentMethod.declaringClass
        if (Modifier.isPrivate(access) || Modifier.isPrivate(parentMethod.modifiers)) {
            return false
        }
        if (allowStatic) {
            if (Modifier.isStatic(access) != Modifier.isStatic(parentMethod.modifiers)) {
                return false
            }
        } else if (Modifier.isStatic(access) || Modifier.isStatic(parentMethod.modifiers)) {
            return false
        }
        if (!Modifier.isStatic(access) && Modifier.isFinal(parentMethod.modifiers)) {
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
