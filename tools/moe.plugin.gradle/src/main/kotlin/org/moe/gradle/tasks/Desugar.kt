package org.moe.gradle.tasks

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.logging.Logging
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Internal
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.SourceSet
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.options.ProGuardOptions
import org.moe.gradle.utils.FileUtils
import org.moe.gradle.utils.Mode
import java.io.File
import java.nio.file.Paths

open class Desugar : AbstractBaseTask() {

    @InputFile
    @NotNull
    fun getProGuardJar(): File {
        return proGuardTaskDep.proGuardJar
    }

    private var inJars: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getInJars(): ConfigurableFileCollection {
        return project.files(getOrConvention(inJars, CONVENTION_APP_IN_JARS))
    }

    @IgnoreUnused
    fun setInJars(inJars: Collection<Any>?) {
        this.inJars = inJars?.toSet()
    }

    private var rtInJars: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getRuntimeInJars(): ConfigurableFileCollection {
        return project.files(getOrConvention(rtInJars, CONVENTION_RUNTIME_IN_JARS))
    }

    @IgnoreUnused
    fun setRuntimeInJars(inJars: Collection<Any>?) {
        this.rtInJars = inJars?.toSet()
    }

    private var libraryJars: Set<Any>? = null

    @InputFiles
    @NotNull
    fun getLibraryJars(): ConfigurableFileCollection {
        return project.files(getOrConvention(libraryJars, CONVENTION_LIBRARY_JARS))
    }

    @IgnoreUnused
    fun setLibraryJars(libraryJars: Collection<Any>?) {
        this.libraryJars = libraryJars?.toSet()
    }

    private var appOutJar: Any? = null

    @OutputFile
    @NotNull
    fun getAppOutJar(): File {
        return project.file(getOrConvention(appOutJar, CONVENTION_APP_OUT_JAR))
    }

    @IgnoreUnused
    fun setAppOutJar(outJar: Any?) {
        this.appOutJar = outJar
    }

    private var rtOutJar: Any? = null

    @OutputFile
    @NotNull
    fun getRuntimeOutJar(): File {
        return project.file(getOrConvention(rtOutJar, CONVENTION_RUNTIME_OUT_JAR))
    }

    @IgnoreUnused
    fun setRuntimeOutJar(outJar: Any?) {
        this.rtOutJar = outJar
    }

    private var composedCfgFile: Any? = null

    @OutputFile
    @NotNull
    fun getComposedCfgFile(): File {
        return project.file(getOrConvention(composedCfgFile, CONVENTION_COMPOSED_CFG_FILE))
    }

    @IgnoreUnused
    fun setComposedCfgFile(composedCfgFile: Any?) {
        this.composedCfgFile = composedCfgFile
    }

    override fun run() {
        FileUtils.deleteFileOrFolder(getAppOutJar())
        FileUtils.deleteFileOrFolder(getRuntimeOutJar())

        composeConfigurationFile()
        javaexec { spec ->
            try {
                spec.mainClass.set("-jar")
            }
            catch (ex: NoSuchMethodError) {
                // old version of gradle, try the old method
                // spec.main = "-jar"
                try {
                    spec::class.members.firstOrNull { it.name == "main" }!!.call(spec, "-jar")
                }
                catch (ignored: Throwable) {
                    throw ex;
                }
            }
            spec.args(getProGuardJar().absolutePath, "@" + getComposedCfgFile().absolutePath)
        }
    }

    private fun composeConfigurationFile() {
        val conf = StringBuilder()

        // Backport App codes
        ProGuard.startSection(conf, "Processing app code & libraries")
        getInJars().forEach {
            if (it.exists()) {
                conf.append("-injars ").append(it.absolutePath).append("\n")
            } else {
                LOG.debug("inJars file doesn't exist: " + it.absolutePath)
            }
        }
        conf.append("-outjars \"").append(getAppOutJar().absolutePath).append("\"\n")

        // Then process Runtime libs
        ProGuard.startSection(conf, "Processing MOE runtimes")
        val rtInJars = getRuntimeInJars()
        if (!rtInJars.isEmpty) {
            rtInJars.forEach {
                if (it.exists()) {
                    conf.append("-injars ").append(it.absolutePath).append("\n")
                } else {
                    LOG.debug("inJars file doesn't exist: " + it.absolutePath)
                }
            }
            conf.append("-outjars \"").append(getRuntimeOutJar().absolutePath).append("\"\n")
        }

        // Add libraryjars
        ProGuard.startSection(conf, "Generating -libraryjars")
        getLibraryJars().forEach {
            if (it.exists()) {
                conf.append("-libraryjars ").append(it.absolutePath).append("\n")
            } else {
                LOG.debug("libraryJars file doesn't exist: " + it.absolutePath)
            }
        }

        // Add backport configuration
        ProGuard.startSection(conf, "Backport only")
        conf.append(
            """
            # Disable everything as we only want to backport
            -dontshrink
            -dontobfuscate
            -dontoptimize
            -dontwarn
            -dontnote
            
            # Backport to Java 7
            -target 7
            -allowaccessmodification
            """.trimIndent()
        )

        // Save
        FileUtils.write(getComposedCfgFile(), conf.toString())
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
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "desugar", mode.name)

        description = "Desugar classes (sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val proGuardTask = moePlugin.getTaskBy(ProGuard::class.java, sourceSet, mode)
        proGuardTaskDep = proGuardTask
        dependsOn(proGuardTask)

        // Update convention mapping
        addConvention(CONVENTION_APP_IN_JARS) { setOf(proGuardTask.outJar) }
        addConvention(CONVENTION_RUNTIME_IN_JARS) {
            mutableSetOf<File>().apply {
                when (moeExtension.proguard.levelRaw) {
                    ProGuardOptions.LEVEL_APP -> {
                        add(moeSDK.coreJar)
                        moeExtension.platformJar?.let(::add)
                    }
                    ProGuardOptions.LEVEL_PLATFORM -> {
                        add(moeSDK.coreJar)
                    }
                    ProGuardOptions.LEVEL_ALL -> {
                        // Do nothing
                    }
                    else -> throw IllegalStateException()
                }

                if (!project.hasProperty("moe.sdk.skip_java8support_jar")) {
                    add(moeSDK.java8SupportJar)
                }
            }
        }
        addConvention(CONVENTION_LIBRARY_JARS) {
            mutableSetOf<File>().apply {
                addAll(proGuardTask.libraryJars.files)
                remove(moeSDK.coreJar)
                remove(moeExtension.platformJar)
                remove(moeSDK.java8SupportJar)
            }
        }
        addConvention(CONVENTION_APP_OUT_JAR) { resolvePathInBuildDir(out, "output-app.jar") }
        addConvention(CONVENTION_RUNTIME_OUT_JAR) { resolvePathInBuildDir(out, "output-rt.jar") }
        addConvention(CONVENTION_COMPOSED_CFG_FILE) { resolvePathInBuildDir(out, "configuration.pro") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "Desugar.log") }
    }

    companion object {
        private val LOG = Logging.getLogger(Desugar::class.java)

        private const val CONVENTION_APP_IN_JARS = "appInJars"
        private const val CONVENTION_RUNTIME_IN_JARS = "runtimeInJars"
        private const val CONVENTION_LIBRARY_JARS = "libraryJars"
        private const val CONVENTION_APP_OUT_JAR = "appOutJar"
        private const val CONVENTION_RUNTIME_OUT_JAR = "runtimeOutJar"
        private const val CONVENTION_COMPOSED_CFG_FILE = "composedCfgFile"
    }
}
