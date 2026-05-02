/*
Copyright 2014-2016 Intel Corporation

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

import org.moe.prebuilts.Script
import java.io.File

plugins {
    id("org.moe.buildtools")
    id("base")
}

version = "2.0.0"

allprojects {
    repositories {
        mavenCentral()
    }
}

// Build the same dynamic external.* map tree that the Groovy version exposed via
// `ext`. Subprojects read it as `rootProject.extra["external"]` and cast as needed.
val svmRoot = file("../../svm").absolutePath
val externalSvm: Map<String, Any?> = mapOf(
    "root" to svmRoot,
    "mx" to file("$svmRoot/mx").absolutePath,
    "graal" to file("$svmRoot/graal").absolutePath,
    "openjdk" to file("$svmRoot/labs-openjdk").absolutePath,
)

val natjRoot = file("../natj").absolutePath
val externalNatj: MutableMap<String, Any?> = mutableMapOf(
    "root" to natjRoot,
    "sources" to file("$natjRoot/src/main/java"),
    "jnipath" to file("$natjRoot/natj-mac/build/xcode/Release"),
)

data class NatjTargetSpec(val name: String, val outputs: List<String>)
val natjTargets = listOf(
    NatjTargetSpec("ios", listOf(
        "$natjRoot/natj-ios/build/xcode/Release-iphoneos/libnatj.a",
        "$natjRoot/natj-ios/build/xcode/Release-iphonesimulator/libnatj.a",
    )),
    NatjTargetSpec("mac", listOf("$natjRoot/natj-mac/build/xcode/Release/libnatj.dylib")),
    NatjTargetSpec("win", listOf("$natjRoot/natj-win/build/Release-Win64/natj.dll")),
)
for (target in natjTargets) {
    externalNatj[target.name] = target.outputs.map { file(it) }

    tasks.register("ext_natj_${target.name}") {
        dependsOn(gradle.includedBuild("natj").task(":natj-${target.name}:build"))
    }
}

val externalPrebuilts = file("../prebuilts").absolutePath
val llvmRoot = file("$externalPrebuilts/llvm/macos").absolutePath
val externalLlvm: Map<String, Any?> = mapOf(
    "root" to llvmRoot,
    "jnipath" to file("$llvmRoot/lib"),
    "macos" to file("$llvmRoot/lib/libclang.dylib"),
)
val llvmMacos = externalLlvm["macos"] as File
if (!llvmMacos.exists()) {
    logger.warn("WARNING: libclang is missing from ${llvmMacos.absolutePath}")
}

extra["external"] = mapOf(
    "prebuilts" to externalPrebuilts,
    "svm" to externalSvm,
    "natj" to externalNatj,
    "llvm" to externalLlvm,
)

val rootBuild = tasks.build
subprojects.forEach { subproject ->
    subproject.afterEvaluate {
        subproject.tasks.matching { it.name == "build" }.all {
            val buildTask = this
            rootBuild.configure { dependsOn(buildTask) }
        }
    }
}

fun createBrewCheckExecTask(execname: String): TaskProvider<Script> =
    tasks.register<Script>("check_exec_$execname") {
        setWorkDir(".")
        failureMessage = """
    Error: $execname is not installed, please run `brew install $execname` to install.
"""
        exec("which", execname)
    }

fun createCheckExecTask(execname: String, failmsg: String): TaskProvider<Script> =
    tasks.register<Script>("check_exec_$execname") {
        setWorkDir(".")
        failureMessage = failmsg
        exec("which", execname)
    }

val brewChecks = listOf("autogen", "autoconf", "automake", "libtool", "pkg-config", "wget", "cloog", "cmake", "gpg", "ant")
    .map { createBrewCheckExecTask(it) }
val premakeCheck = createCheckExecTask("premake5", """
    Error: premake5 is not installed, please run the following to install:

        brew install file://${file("dependencies/premake5.rb").absolutePath}
""")

tasks.check {
    brewChecks.forEach { dependsOn(it) }
    dependsOn(premakeCheck)
}
