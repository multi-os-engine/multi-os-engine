package org.moe.gradle.tasks

import org.gradle.api.GradleException
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.options.ReachabilityMetadataOptions
import org.moe.gradle.utils.FileUtils
import java.io.File
import java.io.IOException
import java.net.URI
import java.net.URL
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Downloads and extracts the GraalVM reachability-metadata repository into the build dir, where
 * [ReachabilityMetadataResolve] queries it. The repository source is always a zip URL: the
 * official release of the configured version, or `moe.metadataRepository.uri` (any URL scheme,
 * including local `file:` paths).
 */
abstract class ReachabilityMetadataDownload : AbstractBaseTask() {

    @Input
    fun isMetadataRepositoryEnabled(): Boolean = moeExtension.metadataRepository.isEnabled

    @Input
    fun getRepositoryKey(): String {
        val options = moeExtension.metadataRepository
        return options.uri?.toString()
            ?: options.version
            ?: ReachabilityMetadataOptions.DEFAULT_VERSION
    }

    private var repositoryDir: File? = null

    @OutputDirectory
    @NotNull
    fun getRepositoryDir(): File = project.file(getOrConvention(repositoryDir, CONVENTION_REPOSITORY_DIR))

    @IgnoreUnused
    fun setRepositoryDir(repositoryDir: File) {
        this.repositoryDir = repositoryDir
    }

    override fun run() {
        val repoDir = getRepositoryDir()
        FileUtils.deleteFileOrFolder(repoDir)
        repoDir.mkdirs()
        if (!isMetadataRepositoryEnabled()) {
            // An empty repository keeps the output resolvable with the feature off.
            return
        }

        val url = repositoryUrl()
        val zip = Files.createTempFile(repoDir.parentFile.toPath(), "repository-", ".zip")
        try {
            logger.lifecycle("Fetching reachability-metadata repository from {}", url)
            fetch(url, zip.toFile())
            extract(zip.toFile(), repoDir)
        } finally {
            Files.deleteIfExists(zip)
        }
    }

    private fun repositoryUrl(): URL {
        val options = moeExtension.metadataRepository
        options.uri?.let { return project.uri(it).toURL() }
        val version = options.version ?: ReachabilityMetadataOptions.DEFAULT_VERSION
        return URI.create(RELEASE_URL_TEMPLATE.format(version)).toURL()
    }

    private fun fetch(url: URL, dest: File) {
        try {
            val connection = url.openConnection()
            connection.connectTimeout = 30_000
            connection.readTimeout = 120_000
            connection.getInputStream().use { input ->
                dest.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
        } catch (e: IOException) {
            throw GradleException("Failed to fetch the reachability-metadata repository from $url (${e.message}). " +
                    "Set 'moe { metadataRepository { enabled = false } }' to opt out, or point " +
                    "'moe.metadataRepository.uri' at a local copy of the repository zip.", e)
        }
    }

    private fun extract(zip: File, repoDir: File) {
        project.copy { spec ->
            spec.from(project.zipTree(zip))
            spec.into(repoDir)
        }
    }

    protected fun setupMoeTask() {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, "graalvm-reachability-metadata")

        description = "Downloads and extracts the GraalVM reachability-metadata repository."

        // Update convention mapping
        addConvention(CONVENTION_REPOSITORY_DIR) { resolvePathInBuildDir(out, "repository") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "ReachabilityMetadataDownload.log") }
    }

    companion object {
        private const val CONVENTION_REPOSITORY_DIR = "repositoryDir"

        private const val RELEASE_URL_TEMPLATE =
            $$"https://github.com/oracle/graalvm-reachability-metadata/releases/download/%1$s/graalvm-reachability-metadata-%1$s.zip"
    }
}
