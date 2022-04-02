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
        return project.files(getOrConvention(inJars, CONVENTION_IN_JARS))
    }

    @IgnoreUnused
    fun setInJars(inJars: Collection<Any>?) {
        this.inJars = inJars?.toSet()
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

    private var outJar: Any? = null

    @OutputFile
    @NotNull
    fun getOutJar(): File {
        return project.file(getOrConvention(outJar, CONVENTION_OUT_JAR))
    }

    @IgnoreUnused
    fun setOutJar(outJar: Any?) {
        this.outJar = outJar
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
        FileUtils.deleteFileOrFolder(getOutJar())

        composeConfigurationFile()
        javaexec { spec ->
            spec.main = "-jar"
            spec.args(getProGuardJar().absolutePath, "@" + getComposedCfgFile().absolutePath)
        }
    }

    private fun composeConfigurationFile() {
        val conf = StringBuilder()

        // Add injars
        ProGuard.startSection(conf, "Generating -injars")
        getInJars().forEach {
            if (it.exists()) {
                conf.append("-injars ").append(it.absolutePath).append("\n")
            } else {
                LOG.debug("inJars file doesn't exist: " + it.absolutePath)
            }
        }

        // Add outjar
        ProGuard.startSection(conf, "Generating -outjars")
        conf.append("-outjars \"").append(getOutJar().absolutePath).append("\"\n")

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
        addConvention(CONVENTION_IN_JARS) {
            mutableSetOf<File>().apply {
                add(proGuardTask.outJar)

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
        addConvention(CONVENTION_OUT_JAR) { resolvePathInBuildDir(out, "output.jar") }
        addConvention(CONVENTION_COMPOSED_CFG_FILE) { resolvePathInBuildDir(out, "configuration.pro") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "Desugar.log") }
    }

    companion object {
        private val LOG = Logging.getLogger(Desugar::class.java)

        private const val CONVENTION_IN_JARS = "inJars"
        private const val CONVENTION_LIBRARY_JARS = "libraryJars"
        private const val CONVENTION_OUT_JAR = "outJar"
        private const val CONVENTION_COMPOSED_CFG_FILE = "composedCfgFile"
    }
}
