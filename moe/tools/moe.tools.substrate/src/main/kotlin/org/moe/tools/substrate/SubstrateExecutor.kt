package org.moe.tools.substrate

import org.apache.commons.io.FileUtils
import org.moe.common.exec.SimpleExec
import org.moe.tools.substrate.utils.collect
import org.slf4j.LoggerFactory
import java.io.File
import java.nio.file.Files
import java.nio.file.Path

class SubstrateExecutor(
        val graalVM: GraalVM,
        val config: Config,
) {
    /**
     * Compile the java classes into native object, using
     * GraalVM native-image tool.
     */
    fun compile() {
        LOG.info("Native compile")

        clearOutputDir()

        SimpleExec.getExec(
                graalVM.nativeImage,
                "-H:+SharedLibrary",
                "-H:+ExitAfterRelocatableImageWrite",
                "--features=org.graalvm.home.HomeFinderFeature",
                "-H:CompilerBackend=llvm",
                "-Dsvm.targetName=iOS",
                "-Dsvm.targetArch=arm64",
                "-Dsvm.platform=org.graalvm.nativeimage.Platform\$IOS_AARCH64",
                "-H:TempDirectory=${config.outputDir.toAbsolutePath()}",
                "-H:+UseCAPCache",
                "-H:CAPCacheDir=${ensureCapCacheDir()}",
                "-cp",
                config.classpath.joinToString(File.pathSeparator),
                config.mainClassName,
        ).apply {
            workingDir = config.outputDir.toFile()
        }.collect(logFile = config.logFile)
    }

    fun clearOutputDir() {
        FileUtils.deleteDirectory(config.outputDir.toFile())
        Files.createDirectories(config.outputDir)
    }

    fun ensureCapCacheDir(): Path {
        val capPath = config.outputDir.resolve("capcache")
        if (!Files.exists(capPath)) {
            Files.createDirectories(capPath)
        }

        CAP_CACHES.forEach {
            javaClass.classLoader.getResourceAsStream("cap/$it").use { input ->
                Files.copy(input, capPath.resolve(it))
            }
        }

        return capPath
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(SubstrateExecutor::class.java)

        private val CAP_CACHES = arrayOf(
                "AArch64LibCHelperDirectives.cap",
                "AMD64LibCHelperDirectives.cap",
                "BuiltinDirectives.cap",
                "JNIHeaderDirectives.cap",
                "LibFFIHeaderDirectives.cap",
                "LLVMDirectives.cap",
                "PosixDirectives.cap",
        )
    }
}