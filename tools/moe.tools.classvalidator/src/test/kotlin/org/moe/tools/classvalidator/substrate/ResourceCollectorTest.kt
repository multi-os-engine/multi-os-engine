package org.moe.tools.classvalidator.substrate

import org.junit.Assert.assertEquals
import org.junit.Test
import org.moe.tools.classvalidator.testing.ASMTest
import org.moe.tools.classvalidator.testing.canonicalJson
import java.io.File

class ResourceCollectorTest : ASMTest() {

    @Test
    fun `includes non-class resources and excludes class files`() {
        val input = tmp.newFolder("in")
        File(input, "META-INF/MANIFEST.MF").also { it.parentFile.mkdirs() }.writeText("Manifest-Version: 1.0\n")
        File(input, "messages.properties").writeText("k=v\n")
        File(input, "com/example/Foo.class").also { it.parentFile.mkdirs() }.writeBytes(byteArrayOf(0xCA.toByte(), 0xFE.toByte()))

        val config = ResourceCollector.collect(setOf(input), excludePatterns = emptySet())

        val out = tmp.newFile("resource-config.json")
        config.save(out)

        val expected = """
            {
                "resources": {
                    "includes": [
                        { "pattern": "\\QMETA-INF/MANIFEST.MF\\E" },
                        { "pattern": "\\Qmessages.properties\\E" }
                    ]
                }
            }
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `applies exclude patterns`() {
        val input = tmp.newFolder("in2")
        File(input, "include/keep.txt").also { it.parentFile.mkdirs() }.writeText("keep")
        File(input, "exclude/skip.txt").also { it.parentFile.mkdirs() }.writeText("skip")
        File(input, "META-INF/secret/secret.bin").also { it.parentFile.mkdirs() }.writeBytes(byteArrayOf(0))

        val config = ResourceCollector.collect(
            setOf(input),
            excludePatterns = setOf(".*exclude.*", "META-INF/secret/.*"),
        )

        val out = tmp.newFile("resource-config.json")
        config.save(out)

        val expected = """
            {
                "resources": {
                    "includes": [
                        { "pattern": "\\Qinclude/keep.txt\\E" }
                    ]
                }
            }
        """.trimIndent()

        assertEquals(canonicalJson(expected), canonicalJson(out))
    }

    @Test
    fun `empty input writes empty object`() {
        val input = tmp.newFolder("empty")
        val config = ResourceCollector.collect(setOf(input), excludePatterns = emptySet())

        val out = tmp.newFile("resource-config.json")
        config.save(out)

        assertEquals(canonicalJson("{}"), canonicalJson(out))
    }
}
