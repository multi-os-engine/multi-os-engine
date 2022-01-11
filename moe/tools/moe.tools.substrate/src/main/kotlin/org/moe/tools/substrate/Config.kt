package org.moe.tools.substrate

import java.io.File
import java.nio.file.Path

data class Triplet(
        val arch: String,
        val vendor: String,
        val os: String,
) {
    companion object {
        const val ARCH_AMD64 = "x86_64"
        const val ARCH_ARM64 = "arm64"

        const val VENDOR_APPLE = "apple"

        const val OS_IPHONEOS = "iphoneos"
        const val OS_IPHONESIMULATOR = "iphonesimulator"

        @JvmStatic
        val IPHONEOS_ARM64: Triplet = Triplet(arch = ARCH_ARM64, vendor = VENDOR_APPLE, os = OS_IPHONEOS)
        @JvmStatic
        val IPHONESIMULATOR_AMD64: Triplet = Triplet(arch = ARCH_AMD64, vendor = VENDOR_APPLE, os = OS_IPHONESIMULATOR)
        @JvmStatic
        val IPHONESIMULATOR_ARM64: Triplet = Triplet(arch = ARCH_ARM64, vendor = VENDOR_APPLE, os = OS_IPHONESIMULATOR)
    }
}

data class Config(
        val mainClassName: String,
        val classpath: Set<File>,

        val jniConfigFiles: Set<File> = emptySet(),
        val reflectionConfigFiles: Set<File> = emptySet(),
        val proxyConfigFiles: Set<File> = emptySet(),
        val resourceConfigFile: Set<File> = emptySet(),
        val useLLVM: Boolean = true,

        val customOptions: List<String> = emptyList(),
        // Platform & arch config
        val target: Triplet,

        // Whether it's a debug build
        val debug: Boolean,

        val outputDir: Path,

        val logFile: File? = null,
) {
    init {
        require(classpath.isNotEmpty()) {
            "Classpath cannot be empty"
        }
    }
}
