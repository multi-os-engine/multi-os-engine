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

import java.io.File

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.maven.publish.vanniktech) apply false
}

allprojects {
    group = "org.multi-os-engine"
    repositories {
        mavenCentral()
    }
}

val externalPrebuilts = file("../prebuilts").absolutePath

/*
 * PROJECT: external/libffi
 */
for (target in listOf("ios", "macos", "windows")) {
    tasks.register("prebuild_libffi_$target") {
        dependsOn(gradle.includedBuild("prebuilts").task(":external:libffi:prebuild_$target"))
    }
}

/*
 * PROJECT: moe/natj
 */
val natjRoot = file("../natj").absolutePath
val externalNatj: MutableMap<String, Any?> = mutableMapOf(
    "root" to natjRoot,
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
    NatjTargetSpec("linux", listOf("$natjRoot/natj-linux/build/Release/libnatj.so")),
)
for (target in natjTargets) {
    externalNatj[target.name] = target.outputs.map { file(it) }

    tasks.register("ext_natj_${target.name}") {
        dependsOn(gradle.includedBuild("natj").task(":natj-${target.name}:build"))
    }
}

/*
 * PROJECT: moe/moe-core
 */
val moeCoreRoot = file("../moe-core").absolutePath
val moeCoreOut: MutableMap<String, Any?> = mutableMapOf(
    "moe_ios_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios/build/libs/moe-ios.jar"),
    "moe_ios_javadoc_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios/build/libs/moe-ios-javadoc.jar"),
    "moe_ios_sources_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios/build/libs/moe-ios-sources.jar"),
    "moe_ios_junit_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit.jar"),
    "moe_ios_junit_javadoc_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit-javadoc.jar"),
    "moe_ios_junit_sources_jar" to file("$moeCoreRoot/moe.apple/moe.platform.ios.junit/build/libs/moe-ios-junit-sources.jar"),
    "moe_core_jar" to file("$moeCoreRoot/moe.apple/moe.core.java/build/libs/moe-core.jar"),
    "moe_core_javadoc_jar" to file("$moeCoreRoot/moe.apple/moe.core.java/build/libs/moe-core-javadoc.jar"),
    "moe_core_sources_jar" to file("$moeCoreRoot/moe.apple/moe.core.java/build/libs/moe-core-sources.jar"),
    "jni_config_base_json" to file("$moeCoreRoot/moe.apple/tools/jni-config-base.json"),
    "reflection_config_base_json" to file("$moeCoreRoot/moe.apple/tools/reflection-config-base.json"),
    "proguard_full_cfg" to file("$moeCoreRoot/moe.apple/tools/proguard-full.cfg"),
    "proguard_cfg" to file("$moeCoreRoot/moe.apple/tools/proguard.cfg"),
)

val sdkConfig = if (project.hasProperty("moe.moe_core.sdk.debug")) "Debug" else "Release"
moeCoreOut["iphoneos_libmoe"] = file("$moeCoreRoot/moe.apple/moe.core.native/moe.sdk/build/xcode/$sdkConfig-ios-iphoneos/libmoe.a")
moeCoreOut["iphoneos_libmoe_headers"] = file("$moeCoreRoot/moe.apple/moe.core.native/moe.sdk/build/xcode/$sdkConfig-ios-iphoneos/include")
moeCoreOut["iphonesimulator_libmoe"] = file("$moeCoreRoot/moe.apple/moe.core.native/moe.sdk/build/xcode/$sdkConfig-ios-iphonesimulator/libmoe.a")
moeCoreOut["iphonesimulator_libmoe_headers"] = file("$moeCoreRoot/moe.apple/moe.core.native/moe.sdk/build/xcode/$sdkConfig-ios-iphonesimulator/include")
moeCoreOut["iphoneos_svmjdwp"] = file("$moeCoreRoot/moe.apple/moe.core.native/svm.jdwp/build/xcode/$sdkConfig-ios-iphoneos/svmjdwp.framework")
moeCoreOut["iphonesimulator_svmjdwp"] = file("$moeCoreRoot/moe.apple/moe.core.native/svm.jdwp/build/xcode/$sdkConfig-ios-iphonesimulator/svmjdwp.framework")

val externalMoeCore: Map<String, Any?> = mapOf(
    "root" to moeCoreRoot,
    "out" to moeCoreOut,
)

tasks.register("build_ext_moe_core") {
    dependsOn(gradle.includedBuild("moe-core").task(":build"))
}

tasks.register("ext_moe_core") {
    dependsOn("build_ext_moe_core")
}

/*
 * PROJECT: external/llvm
 */
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
    "natj" to externalNatj,
    "moe_core" to externalMoeCore,
    "llvm" to externalLlvm,
)
