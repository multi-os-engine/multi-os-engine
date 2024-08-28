package org.moe.tools.classvalidator

import org.objectweb.asm.ClassVisitor

/**
 * A [ClassVisitor] that could modify a class
 */
abstract class ClassModifier(api: Int, classVisitor: ClassVisitor?) : ClassVisitor(api, classVisitor) {

    var modified: Boolean = false
        private set

    fun markAsModified() {
        modified = true
    }
}
