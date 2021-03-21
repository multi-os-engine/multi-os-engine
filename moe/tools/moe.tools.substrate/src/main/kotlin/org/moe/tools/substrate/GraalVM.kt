package org.moe.tools.substrate

import org.moe.common.exec.ExecOutputCollector
import org.moe.common.exec.SimpleExec
import org.moe.common.utils.OsUtils
import org.slf4j.LoggerFactory
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

/**
 * @property home path to the GraalVM home
 */
class GraalVM(
        val home: Path
) {

    val bin: Path
    val gu: Path
    val nativeImage: Path

    init {
        if (!Files.exists(home)) {
            throw IOException("GraalVM home not exist: $home")
        }
        bin = home.resolve("bin")
        if (!Files.exists(bin)) {
            throw IOException("GraalVM home doesn't contain the bin directory: $home")
        }

        if (OsUtils.isWindows()) {
            gu = bin.resolve("gu.cmd")
            nativeImage = bin.resolve("native-image.cmd")
        } else {
            gu = bin.resolve("gu")
            nativeImage = bin.resolve("native-image")
        }

        if (OsUtils.isMac()) {
            unquarantine()
        }

        ensureNativeImage()
        ensureLLVM()
    }

    /**
     * Make sure the native-image (substrateVM) command is installed
     */
    private fun ensureNativeImage() {
        if (!Files.exists(nativeImage)) {
            println("Installing native-image")
            ExecOutputCollector.collect(SimpleExec.getExec(gu, "--jvm", "install", "native-image"), true)
        }
    }


    /**
     * Make sure the llvm-toolchain is installed
     */
    private fun ensureLLVM() {
        if(!Files.exists(home.resolve(Paths.get("lib", "llvm", "bin", "llvm-config")))) {
            println("Installing llvm-toolchain")
            ExecOutputCollector.collect(SimpleExec.getExec(gu, "--jvm", "install", "llvm-toolchain"), true)
        }
    }

    /**
     * Remove the [MAC_ATTR_COM_APPLE_QUARANTINE] attr from the GraalVM files.
     */
    private fun unquarantine() {
        val root = if (home.endsWith(Paths.get("Contents", "Home"))) {
            home.parent.parent
        } else {
            home
        }.toAbsolutePath()

        LOG.debug("Checking quarantine of {}", root)

        val attrs = SimpleExec.exec("xattr", root.toString()).trim().lines()
        if (MAC_ATTR_COM_APPLE_QUARANTINE in attrs) {
            println("Removing attr \"$MAC_ATTR_COM_APPLE_QUARANTINE\" from GraalVM home: $root")
            try {
                SimpleExec.exec("xattr", "-r", "-d", MAC_ATTR_COM_APPLE_QUARANTINE, root.toString())
            } catch (e: IOException) {
                if (e.message != null && ("Permission denied" in e.message!!)) {
                    LOG.error("Unable to remove the quarantine attr for some files, try run the build with sudo")
                }
                throw e
            }
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(GraalVM::class.java)

        private const val MAC_ATTR_COM_APPLE_QUARANTINE = "com.apple.quarantine"
    }
}