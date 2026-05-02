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

fun buildNativeTarget(
    xcodeproject: String,
    xcodeConfig: String,
    xcodeSdk: String,
    xcodeTarget: String,
): TaskProvider<XcodeBuild> {
    val productDest = layout.buildDirectory.dir("xcode/$xcodeConfig-$xcodeSdk").get().asFile.path
    val outputFile = "$productDest/libnatj.a"
    nativeOutputs.add(outputFile)
    return tasks.register<XcodeBuild>("build_${xcodeTarget}_${xcodeConfig}_$xcodeSdk") {
        xcodeProject.set(file(xcodeproject))
        setConfiguration(xcodeConfig)
        setTarget(xcodeTarget)
        setSdk(xcodeSdk)
        if (useAsan) {
            extraArgs("-enableAddressSanitizer", "YES")
        }
        dependsOn(":prebuild_libffi_ios")
        inputs.dir(rootProject.file("src"))
        inputs.dir(file(xcodeproject))
        outputs.file(outputFile)
        outputs.upToDateWhen { false }
    }
}

// Create build task
val nativeTasks = listOf(
    buildNativeTarget("natj.xcodeproj", "Release", "iphoneos", "natj"),
    buildNativeTarget("natj.xcodeproj", "Release", "iphonesimulator", "natj"),
    buildNativeTarget("natj.xcodeproj", "Debug", "iphoneos", "natj"),
    buildNativeTarget("natj.xcodeproj", "Debug", "iphonesimulator", "natj"),
)

val build = tasks.register("build") {
    dependsOn(nativeTasks)
}

tasks.register("buildAll") {
    dependsOn("build")
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
            artifactId = "natj-ios"

            for (o in nativeOutputs) {
                artifact(o) {
                    extension = "a"
                    classifier = java.io.File(o).parentFile.name
                }
            }
        }
    }
}
