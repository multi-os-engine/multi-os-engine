package org.moe.tools.classvalidator.natj

import org.moe.tools.classvalidator.getParentImplementation
import org.moe.tools.classvalidator.toClass
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.lang.reflect.AnnotatedElement

class AddMissingAnnotations(
    next: ClassVisitor?
) : ClassVisitor(Opcodes.ASM5, next) {
    private var skip: Boolean = false
    private var superName: String? = null
    private var interfaces: Array<out String>? = null
    private lateinit var className: String

    override fun visit(version: Int, access: Int, name: String, signature: String?,
                       superName: String?, interfaces: Array<out String>?) {
        this.className = name
        this.superName = superName
        this.interfaces = interfaces
        this.skip = name.startsWith(NatJRuntime.NATJ_CLASS_PREFIX)
        super.visit(version, access, name, signature, superName, interfaces)
    }

    override fun visitMethod(access: Int, name: String, descriptor: String,
                             signature: String?, exceptions: Array<out String>?): MethodVisitor? {
        val visitor = super.visitMethod(access, name, descriptor, signature, exceptions)

        if (skip) {
            return visitor
        }

        val parent = getParentImplementation(
            superName, interfaces,
            className, access, name, descriptor,
            setOf(NatJRuntime.Annotations.SELECTOR_DESC),
            allowStatic = true,
        ) ?: return visitor

        // Create annotation helpers for method and parameters
        val methodHelper = AnnotationHelper(
            parentAnnotations = parent.declaredAnnotations, hasOptionals = true
        )
        val paramHelpers = parent.parameterAnnotations.map {
            AnnotationHelper(it, true)
        }

        return object : MethodVisitor(Opcodes.ASM5, visitor) {
            var isVisiting = true

            override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
                if (isVisiting) {
                    methodHelper.add(descriptor)
                }
                return super.visitAnnotation(descriptor, visible)
            }

            override fun visitParameterAnnotation(parameter: Int, descriptor: String, visible: Boolean): AnnotationVisitor? {
                if (isVisiting) {
                    paramHelpers[parameter].add(descriptor)
                }
                return super.visitParameterAnnotation(parameter, descriptor, visible)
            }

            override fun visitCode() {
                injectAnnotations()
                super.visitCode()
            }

            override fun visitEnd() {
                injectAnnotations()
                super.visitEnd()
            }

            private fun injectAnnotations() {
                if (isVisiting) {
                    isVisiting = false
                    if (!methodHelper.hasSelectorAnnotation()) {
                        doInjectAnnotations()
                    }
                }
            }

            private fun doInjectAnnotations() {
                methodHelper.validate("$className.$name", -1)
                methodHelper.getInjectList().forEach {
                    injectAnnotation(-1, parent, it)
                }

                if (paramHelpers.size != parent.parameterCount) {
                    throw IllegalStateException("Parameter count mismatch")
                }
                paramHelpers.forEachIndexed { i, paramHelper ->
                    paramHelper.validate("$className.$name", i)
                    paramHelper.getInjectList().forEach {
                        injectAnnotation(i, parent.parameters[i], it)
                    }
                }
            }

            private fun injectAnnotation(index: Int, parent: AnnotatedElement, annDesc: String) {
                @Suppress("UNCHECKED_CAST")
                val cls = Type.getType(annDesc).toClass() as Class<Annotation>
                val annotation = parent.getAnnotation(cls)
                if (annotation != null) {
                    val av: AnnotationVisitor?
                    if (index == -1) {
                        av = visitAnnotation(annDesc, true)
                    } else {
                        av = visitParameterAnnotation(index, annDesc, true)
                    }

                    cls.declaredMethods.forEach { field ->
                        field.isAccessible = true
                        val fldName = field.name
                        val fldValue = convertClassToType(field.invoke(annotation))
                        if (fldValue.javaClass.isArray) {
                            val arr = fldValue as Array<Any>
                            val av2 = av?.visitArray(fldName)
                            arr.forEach {
                                av2?.visit(null, it)
                            }
                            av2?.visitEnd()
                        } else {
                            av?.visit(fldName, fldValue)
                        }
                    }
                }
            }

            private fun convertClassToType(value: Any): Any {
                var v: Any = value
                if (v is Class<*>) {
                    v = Type.getType(v)
                }
                if (!v.javaClass.isArray) {
                    return v
                }
                val values = v as Array<Any>
                if (values.javaClass.componentType == Class::class.java) {
                    return values.map { convertClassToType(it) as Type }.toTypedArray()
                } else {
                    return values.map { convertClassToType(it) }.toTypedArray()
                }
            }
        }
    }
}
