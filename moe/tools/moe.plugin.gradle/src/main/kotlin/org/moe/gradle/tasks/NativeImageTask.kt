package org.moe.gradle.tasks

import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSet
import org.moe.gradle.MoeExtension
import org.moe.gradle.MoePlatform
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.anns.Nullable
import org.moe.gradle.utils.Mode
import org.moe.tools.substrate.Config
import org.moe.tools.substrate.SubstrateExecutor
import java.io.File
import java.nio.file.Paths

open class NativeImageTask : AbstractBaseTask() {

    private var inputFiles: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getInputFiles(): ConfigurableFileCollection {
        return project.files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES))
    }

    fun setInputFiles(@NotNull inputFiles: Collection<Any>?) {
        this.inputFiles = inputFiles?.toHashSet()
    }

    private var mainClassName: String? = null

    @Input
    @NotNull
    fun getMainClassName(): String {
        return getOrConvention(mainClassName, CONVENTION_MAIN_CLASS_NAME)!!
    }

    @IgnoreUnused
    fun setMainClassName(@Nullable mainClassName: String?) {
        this.mainClassName = mainClassName
    }

    private var svmOutputDir: Any? = null

    @OutputDirectory
    @NotNull
    fun getSvmOutputDir(): File {
        return project.file(getOrConvention(svmOutputDir, CONVENTION_SVM_OUTPUT_DIR)!!)
    }

    @IgnoreUnused
    fun setSvmOutputDir(@Nullable svmOutputDir: Any?) {
        this.svmOutputDir = svmOutputDir
    }

    override fun run() {
        val svmConf = Config(
                mainClassName = getMainClassName(),
                classpath = getInputFiles().toSet(),
                outputDir = getSvmOutputDir().toPath(),
                logFile = logFile,
        )
        val executor = SubstrateExecutor(
                graalVM = moePlugin.graalVM,
                config = svmConf,
        )
        executor.compile()
    }

    lateinit var retrolambdaTaskDep: Retrolambda
        private set

    private lateinit var mode: Mode
    private lateinit var platform: MoePlatform

    protected fun setupMoeTask(
            @NotNull sourceSet: SourceSet,
            @NotNull mode: Mode,
            @NotNull platform: MoePlatform
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "native_image")

        description = "Compile the project using Native-Image (sourceset: ${sourceSet.name}, mode: ${mode.name}, platform: ${platform.platformName})."
        this.mode = mode
        this.platform = platform

        // Add dependencies
        val retroTask = moePlugin.getTaskBy(Retrolambda::class.java, sourceSet)
        retrolambdaTaskDep = retroTask
        dependsOn(retroTask)

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES) {
            val files = mutableSetOf(retroTask.outputDir)

            when (moeExtension.proguardLevelRaw) {
                MoeExtension.PROGUARD_LEVEL_APP -> {
                    // TODO: add core jar
                    moeExtension.platformJar?.let {
                        files.add(it)
                    }
                }
                MoeExtension.PROGUARD_LEVEL_PLATFORM -> {
                    // TODO: add core jar
                }
                MoeExtension.PROGUARD_LEVEL_ALL -> {
                }
                else -> throw IllegalStateException()
            }

            files
        }
        addConvention(CONVENTION_MAIN_CLASS_NAME) {
            when (sourceSet.name) {
                SourceSet.MAIN_SOURCE_SET_NAME -> moeExtension.mainClassName
                SourceSet.TEST_SOURCE_SET_NAME -> moeExtension.testMainClassName
                else -> throw GradleException("Unknown source set ${sourceSet.name}")
            }
        }
        addConvention(CONVENTION_SVM_OUTPUT_DIR) { resolvePathInBuildDir(out, "svmTmp") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "NativeImage.log") }
    }

    companion object {
        private const val CONVENTION_INPUT_FILES = "inputFiles"
        private const val CONVENTION_MAIN_CLASS_NAME = "mainClassName"
        private const val CONVENTION_SVM_OUTPUT_DIR = "svmOutputDir"
    }
}
