package org.moe.gradle.tasks

import org.gradle.api.GradleException
import org.gradle.api.Task
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.FileCollection
import org.gradle.api.plugins.JavaPlugin
import org.gradle.api.tasks.Classpath
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.compile.JavaCompile
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.options.ProGuardOptions
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
    lateinit var classesTaskDep: Task
        private set

    @get:Internal
    lateinit var javaCompileTaskDep: JavaCompile
        private set

    private val runtimeClasspath: MutableList<FileCollection> = ArrayList()

    /**
     * Declare as task runtime classpath so jar files will be generated.
     *
     * A hack that forces gradle to generate jars of dependency projects
     */
    @Classpath
    @Optional
    open fun getRuntimeClasspath(): List<FileCollection>? {
        return runtimeClasspath
    }

    protected fun setupMoeTask(
        @NotNull sourceSet: SourceSet,
        @NotNull mode: Mode,
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "validate", mode.name)

        description = "Validate classes (sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val classesTaskName: String
        val compileJavaTaskName: String
        if (SourceSet.MAIN_SOURCE_SET_NAME == sourceSet.name) {
            classesTaskName = JavaPlugin.CLASSES_TASK_NAME
            compileJavaTaskName = JavaPlugin.COMPILE_JAVA_TASK_NAME
        } else if (SourceSet.TEST_SOURCE_SET_NAME == sourceSet.name) {
            classesTaskName = JavaPlugin.TEST_CLASSES_TASK_NAME
            compileJavaTaskName = JavaPlugin.COMPILE_TEST_JAVA_TASK_NAME
        } else {
            throw GradleException("Unsupported SourceSet ${sourceSet.name}")
        }
        classesTaskDep = project.tasks.getByName(classesTaskName)
        dependsOn(classesTaskDep)

        javaCompileTaskDep = moePlugin.getTaskByName(compileJavaTaskName)
        // TODO: allow higher than 1.8
        javaCompileTaskDep.sourceCompatibility = "1.8"
        javaCompileTaskDep.targetCompatibility = "1.8"

        // A hack that forces gradle to generate jars of dependency projects
        runtimeClasspath.clear()
        runtimeClasspath.add(sourceSet.runtimeClasspath)

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES) {
            sourceSet.runtimeClasspath.files.toMutableSet().also { jars ->

                jars.remove(moeSDK.coreJar)
                jars.remove(moeExtension.platformJar)

                when (moeExtension.proguard.levelRaw) {
                    ProGuardOptions.LEVEL_APP -> {
                        jars.remove(moeSDK.coreJar)
                        moeExtension.platformJar?.let(jars::remove)
                    }
                    ProGuardOptions.LEVEL_PLATFORM -> {
                        jars.remove(moeSDK.coreJar)
                        moeExtension.platformJar?.let(jars::add)
                    }
                    ProGuardOptions.LEVEL_ALL -> {
                        jars.add(moeSDK.coreJar)
                        moeExtension.platformJar?.let(jars::add)
                    }
                    else -> throw IllegalStateException()
                }
            }
        }
        addConvention(CONVENTION_CLASSPATH_FILES) {
            mutableSetOf<Any>().also { jars ->
                when (moeExtension.proguard.levelRaw) {
                    ProGuardOptions.LEVEL_APP -> {
                        jars.add(moeSDK.coreJar)
                        moeExtension.platformJar?.let(jars::add)
                    }
                    ProGuardOptions.LEVEL_PLATFORM -> {
                        jars.add(moeSDK.coreJar)
                    }
                    ProGuardOptions.LEVEL_ALL -> {}
                    else -> throw IllegalStateException()
                }
            }
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
