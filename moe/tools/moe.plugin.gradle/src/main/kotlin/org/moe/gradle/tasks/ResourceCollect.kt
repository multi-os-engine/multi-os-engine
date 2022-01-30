package org.moe.gradle.tasks

import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.SourceSet
import org.gradle.api.tasks.bundling.Jar
import org.moe.gradle.MoePlugin
import org.moe.gradle.anns.IgnoreUnused
import org.moe.gradle.anns.NotNull
import org.moe.gradle.utils.FileUtils
import org.moe.gradle.utils.Mode
import org.moe.tools.classvalidator.substrate.ResourceCollector
import java.io.File
import java.nio.file.Paths

/**
 * Task that collects all resources from classpath and generates Native-Image resource config
 */
open class ResourceCollect : AbstractBaseTask() {

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

    private var outputFile: File? = null

    @OutputFile
    @NotNull
    fun getOutputFile(): File {
        return project.file(getOrConvention(outputFile, CONVENTION_OUTPUT_FILE))
    }

    @IgnoreUnused
    fun setOutputFile(outputFile: File) {
        this.outputFile = outputFile
    }

    override fun run() {
        // Delete output file
        FileUtils.deleteFileOrFolder(getOutputFile())

        ResourceCollector.process(
            inputFiles = getInputFiles().toSet(),
            outputFile = getOutputFile(),
        )
    }

    protected fun setupMoeTask(
        @NotNull sourceSet: SourceSet,
        @NotNull mode: Mode,
    ) {
        setSupportsRemoteBuild(false)

        // Construct default output path
        val out = Paths.get(MoePlugin.MOE, sourceSet.name, "resources", mode.name)

        description = "Collect resources config (sourceset: ${sourceSet.name}, mode: ${mode.name})."

        // Add dependencies
        val proGuardTask = moePlugin.getTaskBy(ProGuard::class.java, sourceSet, mode)
        dependsOn(proGuardTask)
        val resourceTask =
            moePlugin.getTaskByName<Jar>(MoePlugin.getTaskName(ResourcePackager::class.java, sourceSet, mode))
        dependsOn(resourceTask)

        addConvention(CONVENTION_INPUT_FILES) {
            listOfNotNull(
                proGuardTask.outJar,
                resourceTask.archiveFile.get(),
            ).toSet()
        }
        addConvention(CONVENTION_OUTPUT_FILE) { resolvePathInBuildDir(out, "resource-config.json") }
        addConvention(CONVENTION_LOG_FILE) { resolvePathInBuildDir(out, "ResourceCollect.log") }
    }

    companion object {
        private const val CONVENTION_INPUT_FILES = "inputFiles"
        private const val CONVENTION_OUTPUT_FILE = "outputFile"
    }
}
