package org.moe.tools.classvalidator.natj

import org.moe.tools.classvalidator.getClassFor
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
}
