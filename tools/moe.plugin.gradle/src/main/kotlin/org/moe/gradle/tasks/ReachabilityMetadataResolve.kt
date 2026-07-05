package org.moe.gradle.tasks

import org.graalvm.reachability.DirectoryConfiguration
import org.graalvm.reachability.internal.FileSystemRepository
import org.gradle.api.artifacts.component.ModuleComponentIdentifier
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.logging.Logger
import org.gradle.api.tasks.*
import org.moe.gradle.MoePlugin
import org.moe.gradle.MoeSDK
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.utils.FileUtils
import org.moe.gradle.utils.Mode
import java.io.File
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.absolutePathString

/**
 * Matches the dependencies on the source set's runtime classpath against the extracted GraalVM
 * reachability-metadata repository (see [ReachabilityMetadataDownload]) and records the matched
 * config directories, which [NativeImage] passes as `-H:ConfigurationFileDirectories`. The
 * repository lives in the build dir, so the matched directories are project-local and usable by
 * the remote build as-is.
 */
abstract class ReachabilityMetadataResolve : AbstractBaseTask() {

    private lateinit var sourceSet: SourceSet

    @Input
    fun isMetadataRepositoryEnabled(): Boolean = moeExtension.metadataRepository.isEnabled

    @Input
    fun getExcludedModules(): List<String> = moeExtension.metadataRepository.excludedModules.sorted()

    @Input
    fun getForcedConfigVersions(): Map<String, String> =
        moeExtension.metadataRepository.moduleToConfigVersion.toSortedMap()

    /**
     * Sorted "group:artifact:version" list of the external components on the source set's runtime
     * classpath. Resolved when task inputs are snapshotted, in the execution phase.
     */
    @Input
    fun getResolvedModules(): List<String> {
        if (!isMetadataRepositoryEnabled()) {
            return emptyList()
        }
        return project.configurations
            .getByName(sourceSet.runtimeClasspathConfigurationName)
            .incoming.resolutionResult.allComponents
            .asSequence()
            .mapNotNull { it.id as? ModuleComponentIdentifier }
            .filter { it.group != MoeSDK.MOE_GROUP_ID }
            .map { "${it.group}:${it.module}:${it.version}" }
            .sorted()
            .toList()
    }

    private var repositoryFiles: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getRepositoryFiles(): ConfigurableFileCollection {
        return project.files(getOrConvention(repositoryFiles, CONVENTION_REPOSITORY_FILES))
    }

    @IgnoreUnused
    fun setRepositoryFiles(repositoryFiles: Collection<Any>?) {
        this.repositoryFiles = repositoryFiles?.toSet()
    }

    private var matchedDirectoriesFile: File? = null

    @OutputFile
    @NotNull
    fun getMatchedDirectoriesFile(): File =
        project.file(getOrConvention(matchedDirectoriesFile, CONVENTION_MATCHED_DIRECTORIES_FILE))

    @IgnoreUnused
    fun setMatchedDirectoriesFile(matchedDirectoriesFile: File) {
        this.matchedDirectoriesFile = matchedDirectoriesFile
    }

    /** The matched config directories inside the extracted repository, consumed by [NativeImage]. */
    val configurationDirectories: Set<File>
        @Internal get() = getMatchedDirectoriesFile().readLines()
            .filter { it.isNotBlank() }
            .map { File(it) }
            .toSet()

    override fun run() {
        if (!isMetadataRepositoryEnabled()) {
            FileUtils.write(getMatchedDirectoriesFile(), "")
            return
        }

        val configurations = resolveReachabilityMetadata(
            repoRoot = downloadTaskDep.getRepositoryDir().toPath(),
            gavs = getResolvedModules(),
            excludedModules = getExcludedModules().toSet(),
            forcedConfigVersions = getForcedConfigVersions(),
            logger = logger,
        )

        configurations.forEach { logger.info("Using reachability metadata {} for {}:{} ({})",it.directory.toFile(), it.groupId, it.artifactId, it.version) }

        FileUtils.write(getMatchedDirectoriesFile(), configurations.joinToString("\n") { it.directory.absolutePathString() })
    }

    @get:Internal
    lateinit var downloadTaskDep: ReachabilityMetadataDownload
        private set

    protected fun setupMoeTask(
        @NotNull sourceSet: SourceSet,
        @NotNull mode: Mode,
    ) {
        setSupportsRemoteBuild(false)
        this.sourceSet = sourceSet

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "reachability-metadata", mode.name)

        description = "Resolves GraalVM reachability metadata for dependencies " + "(sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val downloadTask = moePlugin.getTaskBy(ReachabilityMetadataDownload::class.java)
        downloadTaskDep = downloadTask
        dependsOn(downloadTask)

        // Update convention mapping
        addConvention(CONVENTION_REPOSITORY_FILES) { setOf(downloadTask.getRepositoryDir()) }
        addConvention(CONVENTION_MATCHED_DIRECTORIES_FILE) { resolvePathInBuildDir(out, "matched-directories.txt") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "ReachabilityMetadataResolve.log") }
    }

    companion object {
        private const val CONVENTION_REPOSITORY_FILES = "repositoryFiles"
        private const val CONVENTION_MATCHED_DIRECTORIES_FILE = "matchedDirectoriesFile"
    }
}

/**
 * Queries the extracted metadata repository at [repoRoot] for [gavs] and returns the matched
 * config directories.
 */
internal fun resolveReachabilityMetadata(
    repoRoot: Path,
    gavs: List<String>,
    excludedModules: Set<String>,
    forcedConfigVersions: Map<String, String>,
    logger: Logger,
): Set<DirectoryConfiguration> {
    val repository = FileSystemRepository(repoRoot, object : FileSystemRepository.Logger {
        override fun log(groupId: String, artifactId: String, version: String, message: String) {
            logger.info("[reachability-metadata] {}:{}:{} - {}", groupId, artifactId, version, message)
        }
    })

    val configurations = repository.findConfigurationsFor { query ->
        query.useLatestConfigWhenVersionIsUntested()
        gavs.forEach { gav ->
            val module = gav.substringBeforeLast(':')
            if (module in excludedModules) {
                return@forEach
            }
            val forcedVersion = forcedConfigVersions[module]
            if (forcedVersion != null) {
                query.forArtifact { artifact ->
                    artifact.gav(gav)
                    artifact.forceConfigVersion(forcedVersion)
                }
            } else {
                query.forArtifacts(gav)
            }
        }
    }

    return configurations
}
