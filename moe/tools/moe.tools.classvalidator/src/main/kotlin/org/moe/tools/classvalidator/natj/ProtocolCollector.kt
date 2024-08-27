package org.moe.tools.classvalidator.natj

import org.moe.common.utils.classAndJarInputIterator
import org.moe.tools.classvalidator.ChildFirstClassLoader
import org.moe.tools.classvalidator.ContextClassLoaderHolder
import org.moe.tools.classvalidator.getDescriptor
import org.moe.tools.classvalidator.getParentImplementations
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.MethodVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import java.io.File

object ProtocolCollector {

    @JvmStatic
    fun process(
        inputFiles: Set<File>,
        classpath: Set<File>,
    ): Set<String> {

        val result: MutableSet<String> = linkedSetOf()

        ContextClassLoaderHolder(
            ChildFirstClassLoader(classpath.map { it.toURI().toURL() }.toTypedArray())
        ).use {
            inputFiles.classAndJarInputIterator { _, inputStream ->
                val cr = ClassReader(inputStream)

                cr.accept(object : ClassVisitor(Opcodes.ASM9) {

                    private var skip: Boolean = false
                    private lateinit var className: String
                    private var superName: String? = null
                    private var interfaces: Array<out String>? = null

                    override fun visit(
                        version: Int, access: Int, name: String,
                        signature: String?, superName: String?, interfaces: Array<out String>?
                    ) {
                        this.className = name
                        this.superName = superName
                        this.interfaces = interfaces
                        this.skip = access and Opcodes.ACC_INTERFACE > 0

                        super.visit(version, access, name, signature, superName, interfaces)
                    }

                    override fun visitMethod(
                        access: Int, name: String, descriptor: String,
                        signature: String?, exceptions: Array<out String>?
                    ): MethodVisitor? {
                        if (skip) {
                            return super.visitMethod(access, name, descriptor, signature, exceptions)
                        }

                        val superMethods = getParentImplementations(
                            superName, interfaces,
                            className, access, name, descriptor,
                            setOf(NatJRuntime.Annotations.SELECTOR_DESC),
                        )

                        val protocols = superMethods
                            .map { it.declaringClass }
                            .filter { it.isInterface }
                            .filter {
                                NatJRuntime.Annotations.OBJC_PROTOCOL_NAME_DESC in it
                                    .declaredAnnotations
                                    .map { it.annotationClass.java.getDescriptor() }
                            }
                            .map { Type.getType(it).internalName }

                        result.addAll(protocols)
                        // TODO: also collect used methods so we can refine the proguard rules

                        return super.visitMethod(access, name, descriptor, signature, exceptions)
                    }
                }, 0)
            }
        }

        return result
    }
}
