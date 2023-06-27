package org.moe.gradle.tasks

import com.dd.plist.NSDictionary
import com.dd.plist.NSString
import com.dd.plist.PropertyListParser
import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.SourceSet
import org.moe.generator.project.writer.XcodeEditor
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.anns.Nullable
import org.moe.gradle.options.ProGuardOptions
import org.moe.gradle.utils.FileUtils
import org.moe.gradle.utils.Mode
import org.moe.tools.classvalidator.substrate.ProxyConfig
import org.moe.tools.classvalidator.substrate.ReflectionCollector
import org.moe.tools.substrate.GraalVM
import java.io.File
import java.nio.file.Paths

open class ReflectionCollect : AbstractBaseTask() {

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

    private var appMainClassName: String? = null

    @Input
    @Nullable
    fun getAppMainClassName(): String? {
        return nullableGetOrConvention(appMainClassName, CONVENTION_APP_MAIN_CLASS_NAME)
    }

    @IgnoreUnused
    fun setAppMainClassName(appMainClassName: String?) {
        this.appMainClassName = appMainClassName
    }

    val reflectionConfigFile: File
        @OutputFile
        get() = getOutputDir().resolve(ReflectionCollector.OUTPUT_REFLECTION)

    val proxyConfigFile: File
        @OutputFile
        get() = getOutputDir().resolve(ReflectionCollector.OUTPUT_PROXY)

    val graalVMVersion: GraalVM.JDKVersion
        @Input
        get() = moePlugin.graalVM.version

    override fun run() {
        // Delete output file
        FileUtils.deleteFileOrFolder(reflectionConfigFile)
        FileUtils.deleteFileOrFolder(proxyConfigFile)

        // Collect platform reflection settings
//        val libraryJars: MutableSet<File> = linkedSetOf(moeSDK.coreJar)
//        moeExtension.platformJar?.let {
//            libraryJars.add(it)
//        }
        when (moeExtension.proguard.levelRaw) {
            ProGuardOptions.LEVEL_ALL -> {
                // Nothing to be done here, should be handled by [ClassValidator] above
            }
            else -> {
                throw GradleException("Only proguardLevel 'all' is supported atm.")
            }
        }
//        when (moeExtension.proguardLevelRaw) {
//            MoeExtension.PROGUARD_LEVEL_APP -> {
////                libraryJars.add(moeSDK.coreJar)
//                moeExtension.platformJar?.let {
//                    libraryJars.add(it)
//                }
//            }
//            MoeExtension.PROGUARD_LEVEL_PLATFORM -> {
////                libraryJars.add(moeSDK.coreJar)
//            }
//        }
        ReflectionCollector.process(
            mainClassName = getAppMainClassName(),
            inputFiles = getInputFiles().toSet(),
            outputDir = getOutputDir().absoluteFile.toPath(),
            classpath = getClasspathFiles().toSet()
                // Add input to classpath
                + getInputFiles().toSet(),
            proxyConfigVersion = ProxyConfig.FileVersion._22
        )
    }

    @get:Internal
    lateinit var proGuardTaskDep: ProGuard
    private set

    protected fun setupMoeTask(
        @NotNull sourceSet: SourceSet,
        @NotNull mode: Mode,
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "reflection", mode.name)

        description = "Collect reflection config (sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val proGuardTask = moePlugin.getTaskBy(ProGuard::class.java, sourceSet, mode)
        proGuardTaskDep = proGuardTask
        dependsOn(proGuardTask)

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES) { setOf(proGuardTask.outJar) }
        addConvention(CONVENTION_CLASSPATH_FILES) { setOf(proGuardTask.libraryJars) }
        addConvention(CONVENTION_OUTPUT_DIR) { resolvePathInBuildDir(out) }
        addConvention(CONVENTION_APP_MAIN_CLASS_NAME) {
            try {
                // Figure out the app main class from Info.plist
                val xcode = moeExtension.xcode
                val target = if (SourceSet.MAIN_SOURCE_SET_NAME == sourceSet.name) {
                    xcode.mainTarget
                } else {
                    xcode.testTarget
                }
                target?.let {
                    val xcodeFile = project.file(xcode.project)
                    val xcodeEditor = XcodeEditor(xcodeFile)
                    val infoPlistFile = xcodeEditor.getInfoPlist(target, mode.xcodeCompatibleName)

                    val rootDict = PropertyListParser.parse(infoPlistFile.readBytes()) as NSDictionary
                    val mainClass = rootDict["MOE.Main.Class"] as NSString

                    mainClass.content
                }
            } catch (e: Exception) {
                project.logger.warn("Unable to get the MOE.Main.Class from Info.plist, app may not work properly", e)
                null
            }
        }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "ReflectionCollect.log") }
    }

    companion object {
        private const val CONVENTION_INPUT_FILES = "inputFiles"
        private const val CONVENTION_CLASSPATH_FILES = "classpathFiles"
        private const val CONVENTION_OUTPUT_DIR = "outputDir"
        private const val CONVENTION_APP_MAIN_CLASS_NAME = "appMainClassName"
    }
}
