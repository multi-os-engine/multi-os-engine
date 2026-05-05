package org.moe.tools.classvalidator.testing

import org.junit.Assert.fail
import org.junit.Rule
import org.junit.rules.TemporaryFolder
import org.objectweb.asm.ClassReader
import org.objectweb.asm.ClassVisitor
import org.objectweb.asm.ClassWriter
import org.objectweb.asm.Opcodes.ACC_PUBLIC
import org.objectweb.asm.Opcodes.V1_8
import org.objectweb.asm.tree.AbstractInsnNode
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.FrameNode
import org.objectweb.asm.tree.LabelNode
import org.objectweb.asm.tree.LineNumberNode
import org.objectweb.asm.tree.MethodInsnNode
import org.objectweb.asm.tree.MethodNode
import org.objectweb.asm.util.Textifier
import org.objectweb.asm.util.TraceClassVisitor
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.net.URL

abstract class ASMTest {

    @get:Rule
    val tmp = TemporaryFolder()

    // ---- Class builders ----------------------------------------------------

    protected fun classBytes(
        internalName: String,
        superName: String = "java/lang/Object",
        interfaces: Array<String>? = null,
        access: Int = ACC_PUBLIC,
        version: Int = V1_8,
        body: ClassWriter.() -> Unit = {},
    ): ByteArray = ClassWriter(ClassWriter.COMPUTE_MAXS).apply {
        visit(version, access, internalName, null, superName, interfaces)
        body()
        visitEnd()
    }.toByteArray()

    protected fun nativeObjectSubclass(
        internalName: String,
        body: ClassWriter.() -> Unit = {},
    ): ByteArray = classBytes(
        internalName = internalName,
        superName = "org/moe/natj/general/NativeObject",
        body = body,
    )

    /** Write [bytes] to a fresh temp folder under the right package path; return that folder. */
    protected fun writeClassToFolder(internalName: String, bytes: ByteArray): File {
        val root = tmp.newFolder()
        val classFile = File(root, "$internalName.class")
        classFile.parentFile.mkdirs()
        classFile.writeBytes(bytes)
        return root
    }

    // ---- Visitor + parsing -------------------------------------------------

    protected fun applyVisitor(
        input: ByteArray,
        chain: (ClassVisitor) -> ClassVisitor,
    ): ByteArray = ClassWriter(ClassWriter.COMPUTE_MAXS).also { cw ->
        ClassReader(input).accept(chain(cw), 0)
    }.toByteArray()

    /** Textifier dump — used in assertion failure messages, not as the assertion itself. */
    protected fun dumpClass(bytes: ByteArray): String {
        val sw = StringWriter()
        ClassReader(bytes).accept(TraceClassVisitor(null, Textifier(), PrintWriter(sw)), 0)
        return sw.toString()
    }

    protected fun parseClass(bytes: ByteArray): ClassNode = ClassNode().also {
        ClassReader(bytes).accept(it, 0)
    }

    // ---- Structured assertions on class bytes -----------------------------

    protected fun assertHasMethod(bytes: ByteArray, name: String, descriptor: String) {
        val node = parseClass(bytes)
        if (node.methods.none { it.name == name && it.desc == descriptor }) {
            fail("expected method $name$descriptor on ${node.name}, but it was not present\n" + dumpClass(bytes))
        }
    }

    protected fun assertNoMethod(bytes: ByteArray, name: String, descriptor: String) {
        val node = parseClass(bytes)
        if (node.methods.any { it.name == name && it.desc == descriptor }) {
            fail("expected NO method $name$descriptor on ${node.name}, but it was present\n" + dumpClass(bytes))
        }
    }

    protected fun assertMethodCount(bytes: ByteArray, name: String, descriptor: String, expected: Int) {
        val node = parseClass(bytes)
        val actual = node.methods.count { it.name == name && it.desc == descriptor }
        if (actual != expected) {
            fail(
                "expected $expected occurrence(s) of method $name$descriptor on ${node.name}, but found $actual\n"
                    + dumpClass(bytes)
            )
        }
    }

    protected fun assertHasMethodAnnotation(
        bytes: ByteArray,
        methodName: String,
        methodDescriptor: String,
        annotationDescriptor: String,
        expectedValues: Map<String, Any?>? = null,
    ) {
        val node = parseClass(bytes)
        val method = node.methods.firstOrNull { it.name == methodName && it.desc == methodDescriptor }
            ?: throw AssertionError(
                "expected method $methodName$methodDescriptor on ${node.name} for annotation lookup, but it was not present\n"
                    + dumpClass(bytes)
            )
        val annotation = method.allAnnotations().firstOrNull { it.desc == annotationDescriptor }
            ?: throw AssertionError(
                "expected @$annotationDescriptor on $methodName$methodDescriptor of ${node.name}, but it was not present\n"
                    + dumpClass(bytes)
            )
        if (expectedValues != null) {
            val actualValues = annotation.valuesAsMap()
            for ((key, expected) in expectedValues) {
                val actual = actualValues[key]
                if (actual != expected) {
                    fail(
                        "expected @$annotationDescriptor on $methodName$methodDescriptor of ${node.name} to carry $key=$expected, but got $key=$actual\n"
                            + dumpClass(bytes)
                    )
                }
            }
        }
    }

    protected fun assertNoMethodAnnotation(
        bytes: ByteArray,
        methodName: String,
        methodDescriptor: String,
        annotationDescriptor: String,
    ) {
        val node = parseClass(bytes)
        val method = node.methods.firstOrNull { it.name == methodName && it.desc == methodDescriptor }
            ?: return // method absent => annotation absent
        if (method.allAnnotations().any { it.desc == annotationDescriptor }) {
            fail(
                "expected NO @$annotationDescriptor on $methodName$methodDescriptor of ${node.name}, but it was present\n"
                    + dumpClass(bytes)
            )
        }
    }

    /** Asserts no class/method/field on the parsed class carries [annotationDescriptor]. */
    protected fun assertNoAnnotationAnywhere(bytes: ByteArray, annotationDescriptor: String) {
        val node = parseClass(bytes)
        val carriers = mutableListOf<String>()
        if (node.allAnnotations().any { it.desc == annotationDescriptor }) {
            carriers.add("class ${node.name}")
        }
        for (m in node.methods) {
            if (m.allAnnotations().any { it.desc == annotationDescriptor }) {
                carriers.add("method ${m.name}${m.desc}")
            }
        }
        for (f in node.fields) {
            if (f.allAnnotations().any { it.desc == annotationDescriptor }) {
                carriers.add("field ${f.name}")
            }
        }
        if (carriers.isNotEmpty()) {
            fail(
                "expected NO @$annotationDescriptor anywhere on ${node.name}, but found it on: ${carriers.joinToString(", ")}\n"
                    + dumpClass(bytes)
            )
        }
    }

    /** Asserts [methodName]/[methodDescriptor] contains a matching method-invocation instruction. */
    protected fun assertMethodInvokes(
        bytes: ByteArray,
        methodName: String, methodDescriptor: String,
        opcode: Int,
        owner: String, name: String, descriptor: String,
    ) {
        val method = methodOrFail(bytes, methodName, methodDescriptor)
        val match = method.instructions.toArray().any { insn ->
            insn is MethodInsnNode
                && insn.opcode == opcode
                && insn.owner == owner
                && insn.name == name
                && insn.desc == descriptor
        }
        if (!match) {
            fail(
                "expected $methodName$methodDescriptor to invoke $owner.$name$descriptor (opcode=$opcode), but no such instruction was found\n"
                    + dumpClass(bytes)
            )
        }
    }

    /** Asserts [methodName]/[methodDescriptor] contains exactly [expected] invocations matching the call. */
    protected fun assertMethodInvocationCount(
        bytes: ByteArray,
        methodName: String, methodDescriptor: String,
        opcode: Int,
        owner: String, name: String, descriptor: String,
        expected: Int,
    ) {
        val method = methodOrFail(bytes, methodName, methodDescriptor)
        val actual = method.instructions.toArray().count { insn ->
            insn is MethodInsnNode
                && insn.opcode == opcode
                && insn.owner == owner
                && insn.name == name
                && insn.desc == descriptor
        }
        if (actual != expected) {
            fail(
                "expected $expected invocation(s) of $owner.$name$descriptor in $methodName$methodDescriptor, but found $actual\n"
                    + dumpClass(bytes)
            )
        }
    }

    /** Asserts the FIRST executable instruction of [methodName]/[methodDescriptor] is the matching invoke. */
    protected fun assertFirstInstructionInvokes(
        bytes: ByteArray,
        methodName: String, methodDescriptor: String,
        opcode: Int,
        owner: String, name: String, descriptor: String,
    ) {
        val method = methodOrFail(bytes, methodName, methodDescriptor)
        val firstReal = method.instructions.toArray().firstOrNull { it.isExecutable() }
            ?: throw AssertionError(
                "expected $methodName$methodDescriptor to begin with $owner.$name$descriptor, but the body has no executable instruction\n"
                    + dumpClass(bytes)
            )
        val ok = firstReal is MethodInsnNode
            && firstReal.opcode == opcode
            && firstReal.owner == owner
            && firstReal.name == name
            && firstReal.desc == descriptor
        if (!ok) {
            val describe = if (firstReal is MethodInsnNode)
                "${firstReal.javaClass.simpleName}(opcode=${firstReal.opcode}, ${firstReal.owner}.${firstReal.name}${firstReal.desc})"
            else "${firstReal.javaClass.simpleName}(opcode=${firstReal.opcode})"
            fail(
                "expected $methodName$methodDescriptor to begin with INVOKE opcode=$opcode $owner.$name$descriptor, but first executable was $describe\n"
                    + dumpClass(bytes)
            )
        }
    }

    protected fun assertFieldDescriptor(bytes: ByteArray, fieldName: String, descriptor: String) {
        val node = parseClass(bytes)
        val field = node.fields.firstOrNull { it.name == fieldName }
            ?: throw AssertionError(
                "expected field $fieldName on ${node.name}, but it was not present\n" + dumpClass(bytes)
            )
        if (field.desc != descriptor) {
            fail(
                "expected field $fieldName on ${node.name} to have descriptor $descriptor, but it was ${field.desc}\n"
                    + dumpClass(bytes)
            )
        }
    }

    protected fun assertNoFieldWithDescriptor(bytes: ByteArray, descriptor: String) {
        val node = parseClass(bytes)
        val match = node.fields.firstOrNull { it.desc == descriptor }
        if (match != null) {
            fail(
                "expected NO field on ${node.name} with descriptor $descriptor, but field ${match.name} has it\n"
                    + dumpClass(bytes)
            )
        }
    }

    // ---- Classpath helpers -------------------------------------------------

    protected fun jvmClasspath(): Set<File> = System.getProperty("java.class.path")
        .split(File.pathSeparator)
        .map { File(it) }
        .filter { it.exists() }
        .toSet()

    protected fun jvmClasspathUrls(): Array<URL> =
        jvmClasspath().map { it.toURI().toURL() }.toTypedArray()

    // ---- Internal helpers --------------------------------------------------

    private fun methodOrFail(bytes: ByteArray, name: String, descriptor: String): MethodNode {
        val node = parseClass(bytes)
        return node.methods.firstOrNull { it.name == name && it.desc == descriptor }
            ?: throw AssertionError(
                "expected method $name$descriptor on ${node.name} for assertion, but it was not present\n"
                    + dumpClass(bytes)
            )
    }

    private fun AbstractInsnNode.isExecutable(): Boolean =
        this !is LabelNode && this !is LineNumberNode && this !is FrameNode

    private fun MethodNode.allAnnotations(): List<AnnotationNode> =
        visibleAnnotations.orEmpty() + invisibleAnnotations.orEmpty()

    private fun ClassNode.allAnnotations(): List<AnnotationNode> =
        visibleAnnotations.orEmpty() + invisibleAnnotations.orEmpty()

    private fun org.objectweb.asm.tree.FieldNode.allAnnotations(): List<AnnotationNode> =
        visibleAnnotations.orEmpty() + invisibleAnnotations.orEmpty()

    private fun AnnotationNode.valuesAsMap(): Map<String, Any?> {
        val v = values ?: return emptyMap()
        val map = LinkedHashMap<String, Any?>()
        var i = 0
        while (i < v.size) {
            map[v[i] as String] = v[i + 1]
            i += 2
        }
        return map
    }
}
