package org.moe.tools.substrate

import org.apache.commons.io.FileUtils
import org.moe.common.exec.SimpleExec
import org.moe.tools.substrate.utils.collect
import org.moe.tools.substrate.utils.findOne
import org.slf4j.LoggerFactory
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardCopyOption

data class CompileResult(
    val mainObj: Path,
    val llvmObj: Path?,
    val jdwpMetadata: Path?
)

class SubstrateExecutor(
        val graalVM: GraalVM,
        val config: Config,
) {

    /** Maps a host absolute path to the path that should appear in the native-image command. */
    fun interface PathResolver {
        fun resolve(path: String): String
    }

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

        // Run the native-image command
        val args = buildArgs(
                capDir = ensureCapCacheDir().toString(),
                tmpDir = config.outputDir.toAbsolutePath().toString(),
                resolve = { it },
        )
        SimpleExec.getExec(graalVM.nativeImage, *args.toTypedArray())
                .apply { workingDir = config.outputDir.toFile() }
                .collect(logFile = config.logFile)

        return locateOutputs()
    }

    fun locateOutputs(): CompileResult {
        // Now checking the result
        val mainObj = config.outputDir.findOne(
            fileName = mainObjFileName(),
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

        val metadata: Path?
        if (config.enableJDWP) {
            metadata = config.outputDir.findOne(
                fileName = jdwpMetadataFileName(),
                isDirectory = false,
                maxDepth = 5,
            )
            println("Metadata file: $metadata")
        } else {
            metadata = null;
        }

        return CompileResult(
            mainObj = mainObj,
            llvmObj = llvmObj,
            jdwpMetadata = metadata,
        )
    }

    fun buildArgs(
            capDir: String,
            tmpDir: String,
            resolve: PathResolver,
    ): List<String> {
        val args = mutableListOf(
                "-H:+SharedLibrary",

                // iOS specific flags
                "-H:PageSize=16384",

                // Common args
                "-Djdk.internal.lambda.eagerlyInitialize=false",
                "-Djdk.internal.foreign.CABI=${config.target.toCABI()}",
                "-H:-DeadlockWatchdogExitOnTimeout",
                "-H:DeadlockWatchdogInterval=0",
                "-H:+ExitAfterRelocatableImageWrite",
                "-H:+IncludeAllLocales", // Make sure all locales are available at runtime
        )
        if (config.useLLVM) {
            args += "-H:CompilerBackend=llvm"
        }
        args += listOf(
                // Build info
                "--initialize-at-build-time=org.moe.core.MOE\$Build",
                "-Dsvm.targetName=iOS",
                "-Dsvm.targetArch=${config.target.arch}",
                "-Dsvm.platform=org.graalvm.nativeimage.Platform\$${config.target.toSVMPlatform()}",
                "-Dmoe.debug=${config.debug}",
                "-Dmoe.platform.name=${config.target.os}",

                "-H:TempDirectory=$tmpDir",
                "-H:+UseCAPCache",
                "-H:CAPCacheDir=$capDir",
                "--no-server",
        )

        // We don't need isolates
        if (!config.enableJDWP) {
            args += "-H:-SpawnIsolates"
        }
        if (config.enableJDWP) {
            args += listOf("-H:+JDWP", "-H:-CopyNativeJDWPLibrary", "-H:+SpawnIsolates", "-R:ReservedAddressSpaceSize=536870912")
        }

        args += config.customOptions

        // Resource configs
        args += config.resourceConfigFile.map { "-H:ResourceConfigurationFiles=${resolve.resolve(it.absolutePath)}" }

        // Reflection & JNI configs
        args += config.jniConfigFiles.map { "-H:JNIConfigurationFiles=${resolve.resolve(it.absolutePath)}" }
        args += config.reflectionConfigFiles.map { "-H:ReflectionConfigurationFiles=${resolve.resolve(it.absolutePath)}" }
        args += config.proxyConfigFiles.map { "-H:DynamicProxyConfigurationFiles=${resolve.resolve(it.absolutePath)}" }
        args += "-H:+AllowIncompleteClasspath"

        val classpath = config.classpath.joinToString(graalVM.host.pathSeparator) {
            resolve.resolve(it.absolutePath)
        }

        args += listOf("-cp", classpath, config.mainClassName)
        return args
    }

    /** Name of the SVM main object file (inside a timestamped sub-dir of the output dir). */
    fun mainObjFileName(): String = "${config.mainClassName.lowercase()}.o"

    /** Name of the SVM JDWP metadata file. */
    fun jdwpMetadataFileName(): String = "${config.mainClassName.lowercase()}.dylib.metadata"

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
            javaClass.classLoader.getResourceAsStream("cap_${config.target.arch}/$it").use { input ->
                Files.copy(input!!, capPath.resolve(it))
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
                "PosixDirectives.cap",
                "RISCV64LibCHelperDirectives.cap",
                "JNIHeaderDirectivesJDK19OrLater.cap",
                "JNIHeaderDirectivesJDK20OrLater.cap",
                "JNIHeaderDirectivesJDK21OrLater.cap",
                "LocaleDirectives.cap",
                "JNI_JNIHeaderDirectives.cap"
        )

        private fun Triplet.toSVMPlatform(): String = when (this) {
            Triplet.IPHONEOS_ARM64,
            Triplet.IPHONESIMULATOR_ARM64 -> "IOS_AARCH64"

            Triplet.IPHONESIMULATOR_AMD64 -> "IOS_AMD64"

            else -> throw IllegalArgumentException("Target not supported: $this")
        }

        private fun Triplet.toCABI(): String = when (this) {
            Triplet.IPHONEOS_ARM64,
            Triplet.IPHONESIMULATOR_ARM64 -> "MAC_OS_AARCH_64"

            Triplet.IPHONESIMULATOR_AMD64 -> "SYS_V"

            else -> throw IllegalArgumentException("Target not supported: $this")
        }

    }
}
