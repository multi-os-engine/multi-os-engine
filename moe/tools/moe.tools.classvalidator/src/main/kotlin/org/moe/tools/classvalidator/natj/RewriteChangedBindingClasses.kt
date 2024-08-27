package org.moe.tools.classvalidator.natj

import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.Opcodes
import org.objectweb.asm.commons.ClassRemapper
import org.objectweb.asm.commons.SimpleRemapper

val remappingConfig = mapOf("apple/coregraphics/enums/CGRectEdge" to "apple/corefoundation/enums/CGRectEdge",
        "apple/coregraphics/struct/CGAffineTransform" to "apple/corefoundation/struct/CGAffineTransform",
        "apple/coregraphics/struct/CGPoint" to "apple/corefoundation/struct/CGPoint",
        "apple/coregraphics/struct/CGRect" to "apple/corefoundation/struct/CGRect",
        "apple/coregraphics/struct/CGSize" to "apple/corefoundation/struct/CGSize",
        "apple/coregraphics/struct/CGVector" to "apple/corefoundation/struct/CGVector")
class RewriteChangedBindingClasses(next: ClassVisitor?) : ClassRemapper(next, SimpleRemapper(remappingConfig)) {

}