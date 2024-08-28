package org.moe.tools.classvalidator.substrate

import org.moe.tools.classvalidator.natj.NatJRuntime
import org.objectweb.asm.AnnotationVisitor
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes
import java.lang.reflect.Modifier

class CollectProxyConfig(
    private val config: ProxyConfig,
    next: ClassVisitor? = null,
) : ClassVisitor(Opcodes.ASM5, next) {

    private lateinit var name: String
    private var isInterface: Boolean = false
    private var collected: Boolean = false

    override fun visit(
        version: Int, access: Int, name: String, signature: String?,
        superName: String?, interfaces: Array<out String>?
    ) {
        this.name = name
        this.isInterface = Modifier.isInterface(access)
    }

    override fun visitAnnotation(descriptor: String, visible: Boolean): AnnotationVisitor? {
        if (isInterface && !collected) {
            if (NatJRuntime.Annotations.OBJC_PROTOCOL_NAME_DESC == descriptor) {
                config.addProxy(this.name)
                collected = true
            }
        }

        return super.visitAnnotation(descriptor, visible)
    }

    override fun visitNestHost(nestHost: String?) {
        // Do nothing
        // Fix error "NestHost requires ASM7" without the need of updating to ASM7
    }

    override fun visitNestMember(nestMember: String?) {
        // Do nothing
        // Fix error "NestMember requires ASM7" without the need of updating to ASM7
    }
}
