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

import org.moe.prebuilts.XcodeBuild

plugins {
    id("org.moe.buildtools")
    id("maven-publish")
}

val nativeOutputs = mutableListOf<String>()

val useAsan = providers.gradleProperty("moe.use.addresssanitizer").isPresent

fun createXcodeTask(
    xcodeproject: String,
    xcodeConfig: String,
    xcodeSdk: String,
    xcodeTarget: String,
): TaskProvider<XcodeBuild> {
    val productDest = layout.buildDirectory.dir("xcode/$xcodeConfig").get().asFile.path
    if (xcodeTarget == "natj") {
        nativeOutputs.add("$productDest/libnatj.dylib")
    }
    return tasks.register<XcodeBuild>("build_${xcodeTarget}_${xcodeConfig}_$xcodeSdk") {
        xcodeProject.set(file(xcodeproject))
        setConfiguration(xcodeConfig)
        setTarget(xcodeTarget)
        setSdk(xcodeSdk)
        if (useAsan) {
            extraArgs("-enableAddressSanitizer", "YES")
        }
        dependsOn(":prebuild_libffi_macos")
        inputs.dir(rootProject.file("src"))
        inputs.dir(file(xcodeproject))
        outputs.upToDateWhen { false }
        if (xcodeTarget == "natj") {
            outputs.file("$productDest/libnatj.dylib")
        } else {
            dependsOn("build_natj_${xcodeConfig}_$xcodeSdk")
        }
        if (xcodeTarget == "TestClassesCxx") {
            dependsOn(":natj-cxxtests:processCxxTests")
        }
    }
}

// Register all XcodeBuild tasks at project evaluation time
fun xcodeTasks(target: String): List<TaskProvider<XcodeBuild>> = listOf(
    createXcodeTask("natj.xcodeproj", "Release", "macosx", target),
    createXcodeTask("natj.xcodeproj", "Debug", "macosx", target),
)

val buildNatj = xcodeTasks("natj")
val buildTestClasses = xcodeTasks("TestClasses")
val buildTestClassesC = xcodeTasks("TestClassesC")
val buildTestClassesCxx = xcodeTasks("TestClassesCxx")
val buildTestClassesObjC = xcodeTasks("TestClassesObjC")

// Create build task
val build = tasks.register("build") {
    dependsOn(buildNatj)
}

// Create test tasks
tasks.register("build_TestClasses_macosx") {
    dependsOn(buildTestClasses)
}

tasks.register("build_TestClassesC_macosx") {
    dependsOn(buildTestClassesC)
}

tasks.register("build_TestClassesCxx_macosx") {
    dependsOn(buildTestClassesCxx)
}

tasks.register("build_TestClassesObjC_macosx") {
    dependsOn(buildTestClassesObjC)
}

tasks.register("buildAll") {
    dependsOn("build", "build_TestClasses_macosx", "build_TestClassesC_macosx", "build_TestClassesCxx_macosx", "build_TestClassesObjC_macosx")
}

// Create clean task
tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}

// Setup publishing
tasks.publish {
    dependsOn(build)
}
publishing {
    publications {
        create<MavenPublication>("mavenNative") {
            artifactId = "natj-mac"

            for (o in nativeOutputs) {
                artifact(o) {
                    extension = "dylib"
                    classifier = java.io.File(o).parentFile.name
                }
            }
        }
    }
}
