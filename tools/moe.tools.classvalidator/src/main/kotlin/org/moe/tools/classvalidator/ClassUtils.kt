package org.moe.tools.classvalidator

import org.objectweb.asm.Type
import java.lang.reflect.Method
import java.lang.reflect.Modifier
import java.util.LinkedList

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

private val classLoader: ClassLoader
    get() = Thread.currentThread().contextClassLoader!!

fun Class<*>.getDescriptor(): String = Type.getDescriptor(this)

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

fun getBinaryClassName(internalName: String): String = Type.getObjectType(internalName).className
