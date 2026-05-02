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

import org.gradle.external.javadoc.StandardJavadocDocletOptions
import org.gradle.internal.jvm.Jvm
import java.io.File
import java.io.FileOutputStream

plugins {
    alias(libs.plugins.spotless)
    id("org.moe.java-conventions")
}

base {
    archivesName = "moe-ios"
}

java {
    withSourcesJar()
    withJavadocJar()
}

fun jvmVersionMeets(version: Int): Boolean {
    val currentJvm = Jvm.current()
    return version <= Integer.parseInt(currentJvm.javaVersion!!.majorVersion)
}

tasks.withType<JavaCompile>().configureEach {
    options.isFork = true
    options.forkOptions.memoryMaximumSize = "6g"
}

tasks.classes { dependsOn(":ext_natj_ios") }

val natJGen by configurations.creating

dependencies {
    implementation("org.moe:natj")
    compileOnly(project(":moe.apple:moe.core.java"))
    compileOnly(libs.jetbrains.annotations)
    natJGen("org.multi-os-engine:moe.generator.natjgen")
}

tasks.register<Exec>("updateNatJGenConfig") {
    commandLine("python3", "platform_natjgen_updater.py")
}

@Suppress("UNCHECKED_CAST")
val externalLlvm: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["llvm"] as Map<String, Any?>
val llvmJnipath = externalLlvm["jnipath"] as File

@Suppress("UNCHECKED_CAST")
val externalNatj: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["natj"] as Map<String, Any?>
val natjJnipath = externalNatj["jnipath"] as File
val natjSources = externalNatj["sources"] as File

tasks.register<JavaExec>("generateBindings") {
    finalizedBy("spotlessApply")

    val tempFile = file("build/generate_bindings.log")
    tempFile.parentFile.mkdirs()

    classpath = natJGen
    mainClass = "org.moe.natjgen.Main"
    args = listOf(file("../").absolutePath, "moe.platform.ios", file("platform.natjgen").absolutePath)
    systemProperty("java.library.path", llvmJnipath.absolutePath + File.pathSeparator + natjJnipath.absolutePath)

    doFirst {
        standardOutput = FileOutputStream(tempFile)
    }
}

tasks.register<Exec>("removeOutdatedBindings") {
    commandLine("python3", "remove_deprecated_files.py", file("build/generate_bindings.log").absolutePath)
}

tasks.register<Exec>("applyManualBindingFixes") {
    commandLine("git", "apply", "fix_manual_binding_changes.patch")
}

tasks.javadoc {
    if (jvmVersionMeets(8)) {
        (options as StandardJavadocDocletOptions).apply {
            addStringOption("Xdoclint:none", "-quiet")
            addBooleanOption("-allow-script-in-comments", true)
        }
    }
}

tasks.named<Jar>("sourcesJar") {
    from(natjSources) {
        include("**/*.java")
    }
}

tasks.jar {
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}

spotless {
    java {
        target("src/main/java/apple/**")
        removeUnusedImports()
        eclipse().configFile("Eclipse_Adjusted_NatJGen.xml")
    }
}
