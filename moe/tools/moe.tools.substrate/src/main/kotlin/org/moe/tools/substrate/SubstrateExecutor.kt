package org.moe.tools.substrate

import org.apache.commons.io.FileUtils
import org.moe.common.exec.SimpleExec
import org.moe.tools.substrate.utils.collect
import org.moe.tools.substrate.utils.findOne
import org.slf4j.LoggerFactory
import java.io.File
import java.nio.file.Files
import java.nio.file.Path

data class CompileResult(
    val mainObj: Path,
    val llvmObj: Path?,
)

class SubstrateExecutor(
        val graalVM: GraalVM,
        val config: Config,
) {

    /**
     * Compile the java classes into native object, using
     * GraalVM native-image tool.
     */
    fun compile(): CompileResult {
        LOG.info("Native compile")

        // Because SVM will generate all object files inside a folder with random name (timestamp)
        // which is not controlled by us, we have to clear the output folder first then do a file
        // search to figure out the correct folder name.
        clearOutputDir()

        if (config.useLLVM) {
            graalVM.ensureLLVM()
        }

        //If there are no resource-config files defined, the old regex search pattern is used.
        //If there are resource-config files, only the config files are used.
        val resourceArguments = if (config.resourceConfigFile.isEmpty()) {
            setOf("-H:IncludeResources=.*", "-H:ExcludeResources=.*\\.class$")
        } else{
            config.resourceConfigFile.map { "-H:ResourceConfigurationFiles=${it.absolutePath}" }.toSet()
        }

        // Run the native-image command
        SimpleExec.getExec(
                graalVM.nativeImage,
                "-H:+SharedLibrary",

                // We don't need isolates
                "-H:-SpawnIsolates",

                // iOS specific flags
                "-H:PageSize=16384",

                // Common args
                "-Djdk.internal.lambda.eagerlyInitialize=false",
                "-H:-DeadlockWatchdogExitOnTimeout",
                "-H:DeadlockWatchdogInterval=0",
                "-H:+ExitAfterRelocatableImageWrite",
                "--features=org.graalvm.home.HomeFinderFeature",
                *argsIf(config.useLLVM, "-H:CompilerBackend=llvm"),
                "-Dsvm.targetName=iOS",
                "-Dsvm.targetArch=${config.target.arch}",
                "-Dsvm.platform=org.graalvm.nativeimage.Platform\$${config.target.toSVMPlatform()}",
                "-H:TempDirectory=${config.outputDir.toAbsolutePath()}",
                "-H:+UseCAPCache",
                "-H:CAPCacheDir=${ensureCapCacheDir()}",
                "--no-server",
                *config.customOptions.toTypedArray(),
                "-H:Log=registerResource:verbose",
                *resourceArguments.toTypedArray(),
                *config.jniConfigFiles.map {
                    "-H:JNIConfigurationFiles=${it.absolutePath}"
                }.toTypedArray(),
                *config.reflectionConfigFiles.map {
                    "-H:ReflectionConfigurationFiles=${it.absolutePath}"
                }.toTypedArray(),
                *config.proxyConfigFiles.map {
                    "-H:DynamicProxyConfigurationFiles=${it.absolutePath}"
                }.toTypedArray(),
                "-H:+AllowIncompleteClasspath",
                "-cp",
                config.classpath.joinToString(File.pathSeparator),
                config.mainClassName,
        ).apply {
            workingDir = config.outputDir.toFile()
        }.collect(logFile = config.logFile)

        // Now checking the result
        val mainObj = config.outputDir.findOne(
                fileName = "${config.mainClassName.toLowerCase()}.o",
                isDirectory = false,
                maxDepth = 5,
        )
        println("Main object file: $mainObj")

        val llvmObj: Path?
        if (config.useLLVM) {
            llvmObj = config.outputDir.findOne(
                fileName = "llvm.o",
                isDirectory = false,
                maxDepth = 5,
            )
            println("LLVM object file: $llvmObj")
        } else {
            llvmObj = null
        }

        return CompileResult(
            mainObj = mainObj,
            llvmObj = llvmObj,
        )
    }

    private fun clearOutputDir() {
        FileUtils.deleteDirectory(config.outputDir.toFile())
        Files.createDirectories(config.outputDir)
    }

    private fun ensureCapCacheDir(): Path {
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
                "LLVMDirectives.cap",
                "PosixDirectives.cap",
        )

        private fun Triplet.toSVMPlatform(): String = when (this) {
            Triplet.IPHONEOS_ARM64,
            Triplet.IPHONESIMULATOR_ARM64 -> "IOS_AARCH64"

            Triplet.IPHONESIMULATOR_AMD64 -> "IOS_AMD64"

            else -> throw IllegalArgumentException("Target not supported: $this")
        }

        private fun argsIf(condition: Boolean, vararg args: String): Array<out String> = if (condition) {
            args
        } else {
            emptyArray()
        }

    }
}
