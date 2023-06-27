package org.moe.tools.substrate

import org.moe.common.exec.ExecOutputCollector
import org.moe.common.exec.SimpleExec
import org.moe.common.utils.OsUtils
import org.moe.tools.substrate.utils.findByExt
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
    val version: JDKVersion

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
            checkQuarantine()
        }

        version = parseVMVersion()
        println("Using GraalVM $version at $home")

        require (version.feature == 17) {
            "Support Java 17 based GraalVM only"
        }

        require (version >= MIN_GRAALVM_VERSION) {
            "Support GraalVM $MIN_GRAALVM_VERSION and later"
        }

        if (version > MAX_GRAALVM_VERSION) {
            LOG.warn("Using GraalVM version higher than $MAX_GRAALVM_VERSION. This version has not been tested and might not work")
        }

        ensureNativeImage()
    }

    private fun parseVMVersion(): JDKVersion {
        val versionOut = ExecOutputCollector.collect(
                SimpleExec
                        .getExec(bin.resolve("java"), "-version")
                        .runner
                        // Not sure why java output version in stderr...
                        .apply { builder.redirectErrorStream(true) }
        ).trim()

        val jdkVersion = "openjdk version \"([0-9._]+)\"".toPattern().matcher(versionOut).let {
            if (!it.find()) {
                throw IllegalStateException("Cannot determine the JDK version from $versionOut")
            }
            JDKVersion.parse(it.group(1))
        }

        return jdkVersion
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
    fun ensureLLVM() {
        val llvmPath = if (version.feature <= 8) {
            home.resolve(Paths.get("jre", "lib", "llvm", "bin", "llvm-config"))
        } else {
            home.resolve(Paths.get("lib", "llvm", "bin", "llvm-config"))
        }
        if (!Files.exists(llvmPath)) {
            println("Installing llvm-toolchain")
            ExecOutputCollector.collect(SimpleExec.getExec(gu, "--jvm", "install", "llvm-toolchain"), true)
        }
    }

    /**
     * Check if the GraalVM files have [MAC_ATTR_COM_APPLE_QUARANTINE] attr.
     */
    private fun checkQuarantine() {
        val root = if (home.endsWith(Paths.get("Contents", "Home"))) {
            home.parent.parent
        } else {
            home
        }.toAbsolutePath()

        LOG.debug("Checking quarantine of {}", root)

        val attrs = SimpleExec.exec("xattr", root.toString()).trim().lines()
        if (MAC_ATTR_COM_APPLE_QUARANTINE in attrs) {
            LOG.warn(
                "GraalVM home quarantined, run the following command to remove the quarantine attribute:\nsudo xattr -r -d {} {}",
                MAC_ATTR_COM_APPLE_QUARANTINE, root
            )
            throw IllegalArgumentException("GraalVM home quarantined")
        }
    }

    /**
     * Get all the runtime library paths of this GraalVM.
     */
    val runtimeLibraries: Set<Path>
        get() = if (version.feature <= 8) {
            val libDirs = setOf(
                home.resolve("lib"),
                home.resolve(Paths.get("jre", "lib")),
            )

            libDirs.flatMap { it.findByExt("jar") }.toSet()
        } else {
            val jmodDirs = setOf(
                home.resolve("jmods"),
            )

            jmodDirs.flatMap { it.findByExt("jmod") }.toSet()
        }.toSortedSet()

    data class JDKVersion(
        override val feature: Int,
        override val interim: Int,
        override val update: Int,
        override val patch: Int
    ): org.moe.gradle.model.JDKVersion, Comparable<JDKVersion>, java.io.Serializable {

        override fun compareTo(other: JDKVersion): Int = compareValuesBy(this, other,
            { it.feature },
            { it.interim },
            { it.update },
            { it.patch }
        )

        override fun toString(): String {
            return if (feature <= 8) {
                if (update == 0) {
                    "1.$feature.$interim".trimTrailingZero()
                } else {
                    "1.$feature.${interim}_$update"
                }
            } else {
                "$feature.$interim.$update.$patch".trimTrailingZero()
            }
        }

        companion object {
            private fun String.trimTrailingZero(): String {
                var v = this
                while (v.endsWith(".0")) {
                    v = v.substring(0, v.length - 2)
                }
                return v
            }

            fun parse(v: String): JDKVersion {
                return if (v.startsWith("1.")) {
                    // See https://www.oracle.com/java/technologies/javase/jdk8-naming.html
                    val tag: String
                    val update: Int
                    if ('_' in v) {
                        val components = v.split('_')
                        if (components.size != 2) {
                            throw IllegalArgumentException("Unsupported version format: $v")
                        }
                        tag = components[0]
                        update = components[1].toInt()
                    } else {
                        tag = v
                        update = 0
                    }

                    val tagComponents = tag.split('.')
                    if (tagComponents.size < 2 || tagComponents.size > 3) {
                        throw IllegalArgumentException("Unsupported version format: $v")
                    }

                    JDKVersion(
                            feature = tagComponents.parseComponent(1),
                            interim = tagComponents.parseComponent(2),
                            update = update,
                            patch = 0
                    )
                } else {
                    // See https://docs.oracle.com/en/java/javase/11/install/version-string-format.html
                    if ('_' in v) {
                        throw IllegalArgumentException("Unsupported version format: $v")
                    }

                    val components = v.split('.')
                    if (components.size > 4) {
                        throw IllegalArgumentException("Unsupported version format: $v")
                    }

                    JDKVersion(
                            feature = components.parseComponent(0),
                            interim = components.parseComponent(1),
                            update = components.parseComponent(2),
                            patch = components.parseComponent(3),
                    )
                }
            }
        }
    }

    companion object {
        private val LOG = LoggerFactory.getLogger(GraalVM::class.java)

        private const val MAC_ATTR_COM_APPLE_QUARANTINE = "com.apple.quarantine"

        private fun List<String>.parseComponent(index: Int): Int = getOrNull(index)?.toInt() ?: 0

        /** Minimum supported version, inclusive */
        private val MIN_GRAALVM_VERSION = JDKVersion(17, 0, 7, 0)

        /** Latest GraalVM version that has been tested with */
        private val MAX_GRAALVM_VERSION = JDKVersion(17, 0, 7, 0)
    }
}
