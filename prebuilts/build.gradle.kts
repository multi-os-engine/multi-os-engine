/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

import org.gradle.api.tasks.PathSensitivity
import org.moe.prebuilts.Script

plugins {
    id("org.moe.buildtools")
    id("idea")
}

idea {
    module {
        excludeDirs = excludeDirs + file("llvm")
        excludeDirs = excludeDirs + file("mingw")
    }
}

tasks.register("prebuildAll") {
    dependsOn(":external:libffi:prebuild")
}

tasks.register<Delete>("cleanAll") {
    dependsOn(subprojects.map { it.tasks.named("clean") })
    delete("build")
    delete("llvm")
    delete("mingw")
}

val isAppleSilicon = providers.systemProperty("os.arch").get() == "aarch64"

fun brewPath(suffix: String): String =
    (if (isAppleSilicon) "/opt/homebrew/" else "/usr/local/") + suffix

// Baked into config cache — acceptable since CPU count rarely changes between cached runs
val cpuCount = Runtime.getRuntime().availableProcessors()

tasks.register<Script>("linuxCrosscompiler") {
    outputs.dir("build/linux-crosscompiler")
    progress("Downloading crosscompiler")
    setWorkDir("linux-crosscompiler")
    if (isAppleSilicon) {
        download("linux_crosscompiler.zip", "https://github.com/messense/homebrew-macos-cross-toolchains/releases/download/v1.1.0/x86_64-unknown-linux-gnu-aarch64-darwin.zip", "d5ff7b14d6a8820b8bba36e67e1551de51c2e35e069a97a1282f10f80db82bcb")
    } else {
        download("linux_crosscompiler.zip", "https://github.com/messense/homebrew-macos-cross-toolchains/releases/download/v1.1.0/x86_64-unknown-linux-gnu-x86_64-darwin.zip", "e93d8bfdd584db398c3b70007a41bc3e57b69511ce746375aaa9a3ea024e6116")
    }
    exec("rm", "-rf", "linux_crosscompiler")
    exec("unzip", "-o", "linux_crosscompiler.zip")
}

val binutilsVersion = "binutils-2.33.1"
val mingwVersion = "mingw-w64-v7.0.0"
val gccVersion = "gcc-13.2.0"

tasks.register<Script>("mingw") {
    progress("Checking system dependencies")
    try {
        val sdkPath = providers.exec {
            executable = "xcrun"
            args("--show-sdk-path")
        }.standardOutput.asText.get().trim()
        print("MacOSX SDK found at $sdkPath")
    } catch (ignored: Exception) {
        throw GradleException("Cannot find a valid MacOSX SDK! Please make sure the Command Line Tools is installed!")
    }

    progress("Checking brew dependencies")

    setWorkDir("mingw")

    val BREW_GMP = checkDir(brewPath("./opt/gmp"))
    val BREW_MPFR = checkDir(brewPath("./opt/mpfr"))
    val BREW_MPC = checkDir(brewPath("./opt/libmpc"))
    val BREW_CLOOG = checkDir(brewPath("./opt/cloog"))
    val BREW_ISL = checkDir(brewPath("./opt/isl"))

    progress("Downloading $binutilsVersion")
    setWorkDir("mingw")
    download("$binutilsVersion.tar.bz2", "http://ftp.gnu.org/gnu/binutils/$binutilsVersion.tar.bz2", "0cb4843da15a65a953907c96bad658283f3c4419d6bcc56bf2789db16306adb2")
    exec("rm", "-rf", binutilsVersion)
    exec("tar", "xjf", "$binutilsVersion.tar.bz2")

    progress("Building 64-bit $binutilsVersion")
    setWorkDir("mingw/$binutilsVersion/build64")
    exec("../configure", "--target=x86_64-w64-mingw32",
        "--disable-werror", "--disable-multilib",
        "--prefix=${rel("mingw")}",
        "--with-sysroot=${rel("mingw")}",
        "--enable-64-bit-bfd")
    exec("make")
    exec("make", "install-strip")

    progress("Downloading $mingwVersion")
    setWorkDir("mingw")
    download("$mingwVersion.tar.bz2", "http://downloads.sourceforge.net/project/mingw-w64/mingw-w64/mingw-w64-release/$mingwVersion.tar.bz2", "aa20dfff3596f08a7f427aab74315a6cb80c2b086b4a107ed35af02f9496b628")
    exec("rm", "-rf", mingwVersion)
    exec("tar", "xjf", "$mingwVersion.tar.bz2")

    progress("Building 64-bit $mingwVersion")
    setWorkDir("mingw/$mingwVersion/build-headers64")
    exec("../mingw-w64-headers/configure", "--host=x86_64-w64-mingw32",
        "--prefix=${rel("mingw")}/x86_64-w64-mingw32")
    exec("make")
    exec("make", "install-strip")
    setRawWorkDir("mingw/x86_64-w64-mingw32")
    exec("rm", "-f", "lib64")
    exec("ln", "-s", "lib", "lib64")

    progress("Downloading $gccVersion")
    setWorkDir("mingw")
    download("$gccVersion.tar.xz", "https://ftp.gnu.org/gnu/gcc/$gccVersion/$gccVersion.tar.xz", "e275e76442a6067341a27f04c5c6b83d8613144004c0413528863dc6b5c743da")
    exec("rm", "-rf", gccVersion)
    exec("tar", "xjf", "$gccVersion.tar.xz")

    env("PATH", "${rel("mingw")}/bin:${providers.environmentVariable("PATH").get()}")

    progress("Building 64-bit $gccVersion")
    setRawWorkDir("mingw")
    exec("rm", "-f", "mingw")
    exec("ln", "-s", "x86_64-w64-mingw32", "mingw")

    // https://gcc.gnu.org/bugzilla/show_bug.cgi?id=111632
    setWorkDir("mingw/$gccVersion")
    exec("git", "apply", "../../../mingw-xcode15-fix.patch")
    exec("git", "apply", "../../../mingw-fix-libc.patch")
    exec("git", "apply", "../../../mingw-disable-tzdb.patch")

    setWorkDir("mingw/$gccVersion/build64")
    exec("../configure", "--target=x86_64-w64-mingw32",
        "--disable-multilib", "--enable-languages=c,c++,objc,obj-c++",
        "--with-gmp=$BREW_GMP", "--with-mpfr=$BREW_MPFR", "--with-mpc=$BREW_MPC", "--with-cloog=$BREW_CLOOG", "--with-isl=$BREW_ISL",
        "--with-system-zlib", "--enable-version-specific-runtime-libs", "--enable-libstdcxx-time=yes", "--enable-stage1-checking",
        "--enable-checking=release", "--enable-lto", "--enable-threads=win32",
        "--prefix=${rel("mingw")}",
        "--with-sysroot=${rel("mingw")}")
    exec("make", "all-gcc", "-j$cpuCount")
    exec("make", "install-gcc")

    progress("Building 64-bit $mingwVersion runtime")
    setRawWorkDir("mingw")
    exec("rm", "mingw")
    exec("ln", "-s", "x86_64-w64-mingw32", "mingw")
    setWorkDir("mingw/$mingwVersion/build-crt64")
    exec("../mingw-w64-crt/configure", "--host=x86_64-w64-mingw32",
        "--prefix=${rel("mingw")}/x86_64-w64-mingw32",
        "--with-sysroot=${rel("mingw")}")
    exec("make")
    exec("make", "install-strip")

    progress("Completing 64-bit $gccVersion")
    setRawWorkDir("mingw")
    exec("rm", "mingw")
    exec("ln", "-s", "x86_64-w64-mingw32", "mingw")
    setWorkDir("mingw/$gccVersion/build64")
    exec("make")
    exec("make", "install-strip")

    setRawWorkDir("mingw")
    exec("rm", "mingw")

    setRawWorkDir("mingw/x86_64-w64-mingw32/lib")
    exec("ln", "-s", "../../lib/gcc/x86_64-w64-mingw32/lib/libgcc_s.a", "./")
    exec("ln", "-s", "../../lib/gcc/x86_64-w64-mingw32/lib/libgcc.a", "./")

    progress("Building 64-bit $mingwVersion winpthreads")
    setWorkDir("mingw/$mingwVersion/mingw-w64-libraries/winpthreads/build64")
    exec("../configure", "--host=x86_64-w64-mingw32",
        "--prefix=${rel("mingw")}/x86_64-w64-mingw32")
    exec("make")
    exec("make", "install-strip")
}

tasks.register("mingwPresence") {
    doLast {
        if (!file("mingw").exists()) {
            throw GradleException("MinGW is not built")
        }
    }
}

tasks.register<Script>("llvm") {
    inputs.dir(file("../../external/llvm/llvm")).withPathSensitivity(PathSensitivity.RELATIVE)
    inputs.property("hostArch", providers.systemProperty("os.arch"))
    outputs.dir("llvm/macos")
    localState.register("build/llvm/macos")

    progress("Checking brew dependencies")
    checkDir(brewPath("./opt/cmake"))

    progress("Creating LLVM makefiles")
    setWorkDir("llvm/macos")
    exec(brewPath("./bin/cmake"),
        "-DCMAKE_BUILD_TYPE=MinSizeRel",
        "-DCMAKE_INSTALL_PREFIX=" + rel("llvm/macos"),
        "-DCMAKE_OSX_ARCHITECTURES=arm64;x86_64",
        "-DLLVM_TARGETS_TO_BUILD=AArch64;ARM;X86",
        "-DLLVM_BUILD_TOOLS=OFF",
        "-DLLVM_BUILD_EXAMPLES=OFF",
        "-DLLVM_ENABLE_PROJECTS=clang",
        "-DLLVM_ENABLE_ZSTD=OFF",
        "-G", "Unix Makefiles",
        rel("../../external/llvm/llvm"))

    progress("Building LLVM")
    exec("make", "-j$cpuCount", "libclang", "libclang-headers")
    exec("make", "install-libclang", "install-libclang-headers")
}

tasks.register("llvmPresence") {
    doLast {
        if (!file("llvm").exists()) {
            throw GradleException("LLVM is not built")
        }
    }
}
