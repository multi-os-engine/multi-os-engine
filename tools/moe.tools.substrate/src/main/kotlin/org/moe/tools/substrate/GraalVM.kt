package org.moe.tools.substrate

import org.slf4j.LoggerFactory
import java.io.IOException
import java.nio.file.Path
import java.nio.file.Paths

class GraalVM(
        val base: String,
        val host: GraalVMHost,
) {
    val home = if (host.exists(host.resolve(base, "Contents", "Home"))) host.resolve(base, "Contents", "Home") else base
    val bin: String = host.resolve(home, "bin")
    val javaPath: String = host.resolve(bin, "java")
    val nativeImage: String = host.resolve(bin, if (host.isWindows) "native-image.cmd" else "native-image")
    val version: JDKVersion

    init {
        if (!host.exists(home)) {
            throw IOException("GraalVM home not exist: $home")
        }
        if (!host.exists(bin)) {
            throw IOException("GraalVM home doesn't contain the bin directory: $home")
        }
        if (!host.exists(javaPath)) {
            throw IOException("GraalVM bin/java does not exist: $javaPath")
        }

        if (host.isMac) {
            host.ensureUnquarantined(base)
        }

        version = parseVMVersion(host.exec(javaPath, "-version"))
        println("Using GraalVM $version at $home")

        require (version.feature == SUPPORTED_JAVA_MAJOR) {
            "Support Java $SUPPORTED_JAVA_MAJOR based GraalVM only"
        }

        require (version >= MIN_GRAALVM_VERSION) {
            "Support GraalVM $MIN_GRAALVM_VERSION and later"
        }

        if (version > MAX_GRAALVM_VERSION) {
            LOG.warn("Using GraalVM version higher than $MAX_GRAALVM_VERSION. This version has not been tested and might not work")
        }
    }

    fun parseVMVersion(versionOutput: String): JDKVersion =
        "openjdk version \"([0-9._]+)\"".toPattern().matcher(versionOutput).let {
            if (!it.find()) {
                throw IllegalStateException("Cannot determine the JDK version from $versionOutput")
            }
            JDKVersion.parse(it.group(1))
        }


    /**
     * Make sure the llvm-toolchain is installed
     */
    fun ensureLLVM() {
        throw IOException("The LLVM-Backend is currently unsupported")
    }

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

        const val MAC_ATTR_COM_APPLE_QUARANTINE = "com.apple.quarantine"

        const val SUPPORTED_JAVA_MAJOR = 25

        fun Path.rootJDK(): Path {
            if (endsWith(Paths.get("Contents", "Home")))
                return parent.parent

            return this
        }

        private fun List<String>.parseComponent(index: Int): Int = getOrNull(index)?.toInt() ?: 0

        /** Minimum supported version, inclusive */
        private val MIN_GRAALVM_VERSION = JDKVersion(SUPPORTED_JAVA_MAJOR, 0, 0, 0)

        /** Latest GraalVM version that has been tested with */
        private val MAX_GRAALVM_VERSION = JDKVersion(SUPPORTED_JAVA_MAJOR, 0, 1, 0)
    }
}
