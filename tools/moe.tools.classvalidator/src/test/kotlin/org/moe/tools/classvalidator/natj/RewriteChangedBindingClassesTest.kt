package org.moe.tools.classvalidator.natj

import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.objectweb.asm.Opcodes.ACC_PUBLIC

class RewriteChangedBindingClassesTest : ASMTest() {

    @Test
    fun `rewrites coregraphics struct references to corefoundation`() {
        val input = classBytes("com/example/UsesCG") {
            visitField(ACC_PUBLIC, "rect", "Lapple/coregraphics/struct/CGRect;", null, null).visitEnd()
            visitField(ACC_PUBLIC, "size", "Lapple/coregraphics/struct/CGSize;", null, null).visitEnd()
            visitField(ACC_PUBLIC, "transform", "Lapple/coregraphics/struct/CGAffineTransform;", null, null).visitEnd()
            visitField(ACC_PUBLIC, "edge", "Lapple/coregraphics/enums/CGRectEdge;", null, null).visitEnd()
        }

        val out = applyVisitor(input) { RewriteChangedBindingClasses(it) }

        // Mapped names appear in the rewritten output.
        assertFieldDescriptor(out, "rect", "Lapple/corefoundation/struct/CGRect;")
        assertFieldDescriptor(out, "size", "Lapple/corefoundation/struct/CGSize;")
        assertFieldDescriptor(out, "transform", "Lapple/corefoundation/struct/CGAffineTransform;")
        assertFieldDescriptor(out, "edge", "Lapple/corefoundation/enums/CGRectEdge;")

        // Old names are gone.
        assertNoFieldWithDescriptor(out, "Lapple/coregraphics/struct/CGRect;")
        assertNoFieldWithDescriptor(out, "Lapple/coregraphics/struct/CGSize;")
        assertNoFieldWithDescriptor(out, "Lapple/coregraphics/struct/CGAffineTransform;")
        assertNoFieldWithDescriptor(out, "Lapple/coregraphics/enums/CGRectEdge;")
    }

    @Test
    fun `leaves unrelated class references alone`() {
        val input = classBytes("com/example/X") {
            visitField(ACC_PUBLIC, "s", "Ljava/lang/String;", null, null).visitEnd()
            visitField(ACC_PUBLIC, "list", "Ljava/util/List;", null, null).visitEnd()
        }

        val out = applyVisitor(input) { RewriteChangedBindingClasses(it) }

        assertFieldDescriptor(out, "s", "Ljava/lang/String;")
        assertFieldDescriptor(out, "list", "Ljava/util/List;")
    }
}
