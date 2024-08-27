package org.moe.gradle.tasks

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSet
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.utils.FileUtils
import org.moe.gradle.utils.Mode
import org.moe.tools.classvalidator.ClassValidator
import java.io.File
import java.nio.file.Paths

open class ClassValidate : AbstractBaseTask() {

    private var inputFiles: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getInputFiles(): ConfigurableFileCollection {
        return project.files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES))
    }

    @IgnoreUnused
    fun setInputFiles(inputFiles: Collection<Any>?) {
        this.inputFiles = inputFiles?.toSet()
    }

    private var classpathFiles: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getClasspathFiles(): ConfigurableFileCollection {
        return project.files(getOrConvention(classpathFiles, CONVENTION_CLASSPATH_FILES))
    }

    @IgnoreUnused
    fun setClasspathFiles(classpathFiles: Collection<Any>?) {
        this.classpathFiles = classpathFiles?.toSet()
    }

    private var outputDir: File? = null

    @OutputDirectory
    @NotNull
    fun getOutputDir(): File {
        return project.file(getOrConvention(outputDir, CONVENTION_OUTPUT_DIR))
    }

    @IgnoreUnused
    fun setOutputDir(outputDir: File) {
        this.outputDir = outputDir
    }

    val classesOutputDir: File
        @Internal
        get() = getOutputDir().resolve(ClassValidator.OUTPUT_CLASSES)

    override fun run() {
        // Clean output dir
        FileUtils.deleteFileOrFolder(getOutputDir())

        // Run class validator
        ClassValidator.process(
            inputFiles = getInputFiles().toSet(),
            classpath = getClasspathFiles().toSet()
                // Add input to classpath
                + getInputFiles().toSet(),
            outputDir = getOutputDir().absoluteFile.toPath(),
        )
    }

    @get:Internal
    lateinit var desugarTaskDep: Desugar
        private set

    protected fun setupMoeTask(
        @NotNull sourceSet: SourceSet,
        @NotNull mode: Mode,
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "validate", mode.name)

        description = "Validate classes (sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val desugarTask = moePlugin.getTaskBy(Desugar::class.java, sourceSet, mode)
        desugarTaskDep = desugarTask
        dependsOn(desugarTask)

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES) { setOf(desugarTask.getAppOutJar()) }
        addConvention(CONVENTION_CLASSPATH_FILES) {
            (desugarTask.getLibraryJars() + desugarTask.getRuntimeOutJar()).toSet()
        }
        addConvention(CONVENTION_OUTPUT_DIR) { resolvePathInBuildDir(out, "output") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "ClassValidate.log") }
    }

    companion object {
        private const val CONVENTION_INPUT_FILES = "inputFiles"
        private const val CONVENTION_CLASSPATH_FILES = "classpathFiles"
        private const val CONVENTION_OUTPUT_DIR = "outputDir"
    }
}
