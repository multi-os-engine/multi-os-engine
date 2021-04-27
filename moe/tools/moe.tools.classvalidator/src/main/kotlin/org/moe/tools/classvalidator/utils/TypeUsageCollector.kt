package org.moe.tools.classvalidator.utils

import org.moe.common.utils.classAndJarInputIterator
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.FieldVisitor
import org.objectweb.asm.Label
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.TypePath
import java.io.File

/**
 * A simple util that collect all classes that has been used by the classes from given classpath.
 * The used types include external classes as well as the classes from the classpath.
 */
object TypeUsageCollector {
    fun process(
        classpath: Set<File>,
        visitor: (type: String, usages: Int, external: Boolean) -> Unit,
    ) {
        val internalClasses: MutableSet<String> = mutableSetOf()
        val allClasses: MutableMap<String, Int> = sortedMapOf()

        fun addUsage(name: String, usage: Int) {
            allClasses.compute(name) { _, oldVal ->
                oldVal?.or(usage) ?: usage
            }
        }

        fun addAnnotation(descriptor: String) {
            addUsage(Type.getType(descriptor).internalName, USAGE_ANNOTATION)
        }

        fun addMethodDesc(descriptor: String) {
            Type.getMethodType(descriptor).let { desc ->
                if (desc.returnType != Type.VOID_TYPE) {
                    addUsage(
                        desc.returnType.internalName,
                        USAGE_RETURN,
                    )
                }

                desc.argumentTypes.forEach { arg ->
                    addUsage(
                        arg.internalName,
                        USAGE_PARAM,
                    )
                }
            }
        }

        classpath.classAndJarInputIterator { input ->
            val cr = ClassReader(input)
            cr.accept(object : ClassVisitor(Opcodes.ASM5) {
                override fun visit(
                    version: Int,
                    access: Int,
                    name: String,
                    signature: String?,
                    superName: String?,
                    interfaces: Array<out String>?
                ) {
                    // This is an internal class
                    internalClasses.add(name)

                    // Track this class
                    addUsage(name, 0)

                    // TODO: track signature

                    superName?.let {
                        addUsage(it, USAGE_SUPER)
                    }

                    interfaces?.forEach {
                        addUsage(it, USAGE_SUPER)
                    }

                    super.visit(version, access, name, signature, superName, interfaces)
                }

                override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
                    addAnnotation(descriptor)
                    return super.visitAnnotation(descriptor, visible)
                }

                override fun visitField(
                    access: Int,
                    name: String,
                    descriptor: String,
                    signature: String?,
                    value: Any?
                ): FieldVisitor? {
                    // TODO: track signature

                    addUsage(
                        Type.getType(descriptor).internalName,
                        USAGE_VARIABLE,
                    )

                    return super.visitField(access, name, descriptor, signature, value)
                }

                override fun visitMethod(
                    access: Int,
                    name: String,
                    descriptor: String,
                    signature: String?,
                    exceptions: Array<out String>?
                ): MethodVisitor? {
                    addMethodDesc(descriptor)

                    // TODO: track signature

                    exceptions?.forEach {
                        addUsage(it, USAGE_EXCEPTION)
                    }

                    return object : MethodVisitor(
                        Opcodes.ASM5,
                        super.visitMethod(access, name, descriptor, signature, exceptions)
                    ) {
                        override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
                            addAnnotation(descriptor)
                            return super.visitAnnotation(descriptor, visible)
                        }

                        override fun visitParameterAnnotation(
                            parameter: Int,
                            descriptor: String,
                            visible: Boolean
                        ): AnnotationVisitor? {
                            addAnnotation(descriptor)
                            return super.visitParameterAnnotation(parameter, descriptor, visible)
                        }

                        override fun visitTypeAnnotation(
                            typeRef: Int,
                            typePath: TypePath?,
                            descriptor: String,
                            visible: Boolean
                        ): AnnotationVisitor? {
                            addAnnotation(descriptor)
                            return super.visitTypeAnnotation(typeRef, typePath, descriptor, visible)
                        }

                        override fun visitFieldInsn(opcode: Int, owner: String, name: String, descriptor: String) {
                            addUsage(owner, 0)
                            addUsage(descriptor, USAGE_VARIABLE)
                            super.visitFieldInsn(opcode, owner, name, descriptor)
                        }

                        override fun visitMethodInsn(
                            opcode: Int,
                            owner: String,
                            name: String,
                            descriptor: String,
                            isInterface: Boolean
                        ) {
                            addUsage(owner, 0)
                            addMethodDesc(descriptor)
                            super.visitMethodInsn(opcode, owner, name, descriptor, isInterface)
                        }

                        override fun visitTypeInsn(opcode: Int, type: String) {
                            addUsage(type, 0)
                            super.visitTypeInsn(opcode, type)
                        }

                        override fun visitLdcInsn(value: Any?) {
                            // TODO
                            super.visitLdcInsn(value)
                        }

                        override fun visitLocalVariable(
                            name: String,
                            descriptor: String,
                            signature: String?,
                            start: Label?,
                            end: Label?,
                            index: Int
                        ) {
                            addUsage(descriptor, USAGE_VARIABLE)
                            super.visitLocalVariable(name, descriptor, signature, start, end, index)
                        }

                        override fun visitLocalVariableAnnotation(
                            typeRef: Int,
                            typePath: TypePath?,
                            start: Array<out Label>?,
                            end: Array<out Label>?,
                            index: IntArray?,
                            descriptor: String,
                            visible: Boolean
                        ): AnnotationVisitor? {
                            addAnnotation(descriptor)

                            return super.visitLocalVariableAnnotation(
                                typeRef,
                                typePath,
                                start,
                                end,
                                index,
                                descriptor,
                                visible
                            )
                        }
                    }
                }
            }, 0)
        }

        allClasses.forEach { (name, usage) ->
            visitor(name, usage, name !in internalClasses)
        }
    }

    /** This type is used as a super type */
    const val USAGE_SUPER = 1 shl 0

    /** This type is used as a method parameter type */
    const val USAGE_PARAM = 1 shl 1

    /** This type is used as a method return type */
    const val USAGE_RETURN = 1 shl 2

    /** This type is used as a variable or field type */
    const val USAGE_VARIABLE = 1 shl 3

    /** This type is used as a variable type */
    const val USAGE_ANNOTATION = 1 shl 4

    /** This type is used as an exception type */
    const val USAGE_EXCEPTION = 1 shl 5
}