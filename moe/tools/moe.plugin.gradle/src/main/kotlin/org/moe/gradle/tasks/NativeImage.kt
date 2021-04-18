package org.moe.gradle.tasks

import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.bundling.Jar
import org.moe.gradle.MoeExtension
import org.moe.gradle.MoePlatform
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.anns.Nullable
import org.moe.gradle.utils.Arch
import org.moe.gradle.utils.Mode
import org.moe.tools.substrate.Config
import org.moe.tools.substrate.SubstrateExecutor
import org.moe.tools.substrate.Triplet
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

open class NativeImage : AbstractBaseTask() {

    private var inputFiles: Set<Any>? = null

    @Input
    @NotNull
    fun getGvmHomePath(): String {
        return moePlugin.graalVM.home.toString()
    }

    @InputFile
    @NotNull
    fun getJniConfigBaseFile(): Any {
        return moeSDK.jniConfigBaseFile
    }

    @InputFile
    @NotNull
    fun getReflectionConfigBaseFile(): Any {
        return moeSDK.reflectionConfigBaseFile
    }

    @InputFiles
    @NotNull
    fun getInputFiles(): ConfigurableFileCollection {
        return project.files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES))
    }

    fun setInputFiles(@NotNull inputFiles: Collection<Any>?) {
        this.inputFiles = inputFiles?.toHashSet()
    }

    private var resourceJar: Any? = null

    @InputFile
    @NotNull
    fun getResourceJar(): File {
        return project.file(getOrConvention(resourceJar, CONVENTION_RESOURCE_JAR)!!)
    }

    fun setResourceJar(@NotNull resourceJar: Any?) {
        this.resourceJar = resourceJar
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

    private var svmTmpDir: Any? = null

    @NotNull
    fun getSvmTmpDir(): File {
        return project.file(getOrConvention(svmTmpDir, CONVENTION_SVM_TMP_DIR)!!)
    }

    @IgnoreUnused
    fun setSvmTmpDir(@Nullable svmTmpDir: Any?) {
        this.svmTmpDir = svmTmpDir
    }

    private var mainObjFile: Any? = null

    @OutputFile
    @NotNull
    fun getMainObjFile(): File {
        return project.file(getOrConvention(mainObjFile, CONVENTION_MAIN_OBJ_FILE)!!)
    }

    fun setMainObjFile(mainObjFile: Any?) {
        this.mainObjFile = mainObjFile
    }

    private var llvmObjFile: Any? = null

    @OutputFile
    @NotNull
    fun getLlvmObjFile(): File {
        return project.file(getOrConvention(llvmObjFile, CONVENTION_LLVM_OBJ_FILE)!!)
    }

    fun setLlvmObjFile(llvmObjFile: Any?) {
        this.llvmObjFile = llvmObjFile
    }

    private var jniConfigFile: Any? = null

    @Optional
    @InputFile
    @Nullable
    fun getJniConfigFile(): File? {
        val o = nullableGetOrConvention<Any>(jniConfigFile, CONVENTION_JNI_CONFIG_FILE)
        return if (o == null) null else project.file(o)
    }

    @IgnoreUnused
    fun setJniConfigFile(jniConfigFile: Any?) {
        this.jniConfigFile = jniConfigFile
    }

    private var reflectionConfigFile: Any? = null

    @Optional
    @InputFile
    @Nullable
    fun getReflectionConfigFile(): File? {
        val o = nullableGetOrConvention<Any>(reflectionConfigFile, CONVENTION_REFLECTION_CONFIG_FILE)
        return if (o == null) null else project.file(o)
    }

    @IgnoreUnused
    fun setReflectionConfigFile(reflectionConfigFile: Any?) {
        this.reflectionConfigFile = reflectionConfigFile
    }

    override fun run() {
        val svmConf = Config(
                mainClassName = getMainClassName(),
                classpath = getInputFiles().toSet()
                        // Include the resource jar as part of the classpath
                        + getResourceJar(),
                target = Triplet(
                        arch = arch.name,
                        vendor = Triplet.VENDOR_APPLE,
                        os = platform.platformName,
                ),
                jniConfigFiles = listOfNotNull(
                        moeSDK.jniConfigBaseFile,
                        getJniConfigFile(),
                ).toSet(),
                reflectionConfigFiles = listOfNotNull(
                        moeSDK.reflectionConfigBaseFile,
                        getReflectionConfigFile(),
                ).toSet(),
                outputDir = getSvmTmpDir().toPath(),
                logFile = logFile,
        )
        val executor = SubstrateExecutor(
                graalVM = moePlugin.graalVM,
                config = svmConf,
        )
        executor.compile()

        // Move generated object files to a fixed position so they can be found by Xcode
        Files.move(executor.mainObj, getMainObjFile().toPath(), StandardCopyOption.REPLACE_EXISTING)
        Files.move(executor.llvmObj, getLlvmObjFile().toPath(), StandardCopyOption.REPLACE_EXISTING)
    }

    lateinit var retrolambdaTaskDep: Retrolambda
        private set

    private lateinit var mode: Mode
    private lateinit var arch: Arch
    private lateinit var platform: MoePlatform

    protected fun setupMoeTask(
            @NotNull sourceSet: SourceSet,
            @NotNull mode: Mode,
            @NotNull arch: Arch,
            @NotNull platform: MoePlatform
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val outRoot = Paths.get(MoePlugin.MOE, sourceSet.name, "native_image")
        val out = if (platform.mainPlatformsHasSimulatorPair()) {
            outRoot.resolve(mode.xcodeCompatibleName + "-" + platform.platformName + "-" + arch.name)
        } else {
            outRoot.resolve(mode.xcodeCompatibleName + "-" + arch.name)
        }

        description = "Compile the project using Native-Image (sourceset: ${sourceSet.name}, mode: ${mode.name}, arch: ${arch.name}, platform: ${platform.platformName})."
        this.mode = mode
        this.arch = arch
        this.platform = platform

        // Add dependencies
        val retroTask = moePlugin.getTaskBy(Retrolambda::class.java, sourceSet)
        retrolambdaTaskDep = retroTask
        dependsOn(retroTask)

        val resourceTask = moePlugin.getTaskByName<Jar>(MoePlugin.getTaskName(ResourcePackager::class.java, sourceSet))
        dependsOn(resourceTask)

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES) {
            val files = mutableSetOf(retroTask.outputDir)

            when (moeExtension.proguardLevelRaw) {
                MoeExtension.PROGUARD_LEVEL_APP -> {
                    files.add(moeSDK.coreJar)
                    moeExtension.platformJar?.let {
                        files.add(it)
                    }
                }
                MoeExtension.PROGUARD_LEVEL_PLATFORM -> {
                    files.add(moeSDK.coreJar)
                }
                MoeExtension.PROGUARD_LEVEL_ALL -> {
                }
                else -> throw IllegalStateException()
            }

            files
        }
        addConvention(CONVENTION_RESOURCE_JAR) { resourceTask.archiveFile.get() }
        addConvention(CONVENTION_MAIN_CLASS_NAME) { moeExtension.mainClassName }
        addConvention(CONVENTION_SVM_TMP_DIR) { resolvePathInBuildDir(out, "svmTmp") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "NativeImage.log") }
        addConvention(CONVENTION_MAIN_OBJ_FILE) { resolvePathInBuildDir(out, "main.o") }
        addConvention(CONVENTION_LLVM_OBJ_FILE) { resolvePathInBuildDir(out, "llvm.o") }
        addConvention(CONVENTION_JNI_CONFIG_FILE) {
            project.file("jni-config.json").takeIf { it.exists() && it.isFile }
        }
        addConvention(CONVENTION_REFLECTION_CONFIG_FILE) {
            project.file("reflection-config.json").takeIf { it.exists() && it.isFile }
        }
    }

    companion object {
        private const val CONVENTION_INPUT_FILES = "inputFiles"
        private const val CONVENTION_RESOURCE_JAR = "resourceJar"
        private const val CONVENTION_MAIN_CLASS_NAME = "mainClassName"
        private const val CONVENTION_SVM_TMP_DIR = "svmTmpDir"
        private const val CONVENTION_MAIN_OBJ_FILE = "mainObjFile"
        private const val CONVENTION_LLVM_OBJ_FILE = "LLVMObjFile"
        private const val CONVENTION_JNI_CONFIG_FILE = "jniConfigFile"
        private const val CONVENTION_REFLECTION_CONFIG_FILE = "reflectionConfigFile"
    }
}
