package org.moe.gradle.tasks

import org.gradle.api.logging.Logging
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder
import java.io.File
import java.nio.file.Path

class ResolveReachabilityMetadataTest {

    @Rule
    @JvmField
    val tmp = TemporaryFolder()

    private lateinit var repoRoot: Path

    private val logger = Logging.getLogger(ResolveReachabilityMetadataTest::class.java)

    @Before
    fun createFixtureRepository() {
        repoRoot = tmp.newFolder("repo").toPath()

        // FileSystemRepository validates the repository by its packaged schema files.
        val schemasDir = repoRoot.resolve("schemas").toFile()
        schemasDir.mkdirs()
        File(schemasDir, "library-and-framework-list-schema-v1.0.0.json").writeText("{}")
        File(schemasDir, "metadata-library-index-schema-v2.1.0.json").writeText("{}")

        val artifactDir = repoRoot.resolve("com.example/lib").toFile()
        artifactDir.mkdirs()
        File(artifactDir, "index.json").writeText(
            """
            [
              {
                "latest": true,
                "metadata-version": "1.0.0",
                "tested-versions": ["1.0.0", "1.1.0"]
              }
            ]
            """.trimIndent()
        )
        val configDir = File(artifactDir, "1.0.0")
        configDir.mkdirs()
        File(configDir, "reachability-metadata.json")
            .writeText("""{"reflection":[{"type":"com.example.Foo"}]}""")
    }

    private fun resolve(
        gavs: List<String>,
        excludedModules: Set<String> = emptySet(),
        forcedConfigVersions: Map<String, String> = emptyMap(),
    ): Set<File> = resolveReachabilityMetadata(
        repoRoot = repoRoot,
        gavs = gavs,
        excludedModules = excludedModules,
        forcedConfigVersions = forcedConfigVersions,
        logger = logger,
    )

    private val configDir: File
        get() = repoRoot.resolve("com.example/lib/1.0.0").toFile()

    @Test
    fun testedVersionIsMatched() {
        val dirs = resolve(listOf("com.example:lib:1.0.0"))

        assertEquals(setOf(configDir), dirs)
    }

    @Test
    fun untestedVersionFallsBackToLatest() {
        val dirs = resolve(listOf("com.example:lib:2.0.0"))

        assertEquals(setOf(configDir), dirs)
    }

    @Test
    fun excludedModuleIsSkipped() {
        val dirs = resolve(
            gavs = listOf("com.example:lib:1.0.0"),
            excludedModules = setOf("com.example:lib"),
        )

        assertEquals(emptySet<File>(), dirs)
    }

    @Test
    fun forcedConfigVersionIsUsed() {
        val dirs = resolve(
            gavs = listOf("com.example:lib:9.9.9"),
            forcedConfigVersions = mapOf("com.example:lib" to "1.0.0"),
        )

        assertEquals(setOf(configDir), dirs)
    }

    @Test
    fun unknownArtifactHasNoMatch() {
        val dirs = resolve(listOf("com.example:unknown:1.0.0"))

        assertEquals(emptySet<File>(), dirs)
    }
}
