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
import java.io.FileOutputStream

plugins {
    id("base")
    id("maven-publish")
}

val ndkPathProvider = providers.environmentVariable("NDK_PATH")

if (!ndkPathProvider.isPresent) {
    logger.warn("NDK_PATH env var is not set")
}

val nativeOutputs = mutableListOf<String>()
for (arch in listOf("arm64-v8a", "armeabi-v7a", "mips", "mips64", "x86", "x86_64")) {
    for (conf in listOf("Release", "Debug")) {
        for (targ in listOf("natj", "c++_shared")) {
            nativeOutputs.add("build/$conf/libs/$arch/lib$targ.so")
        }
    }
}

tasks.register<Exec>("buildNative") {
    doFirst {
        if (!ndkPathProvider.isPresent) {
            throw GradleException("NDK_PATH env var is not set")
        }
    }

    dependsOn(":prebuild_libffi_ndk")

    executable = "${ndkPathProvider.getOrElse("")}/ndk-build"
    args("NDK_OUT=build/Release/obj")
    args("NDK_APP_LIBS_OUT=build/Release/libs")

    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/aarch64/lib/libffi.a"))
    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/arm/lib/libffi.a"))
    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/mips64el/lib/libffi.a"))
    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/mipsel/lib/libffi.a"))
    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/x86/lib/libffi.a"))
    inputs.files(rootProject.file("../../prebuilts/external/libffi/build/ndk/x86_64/lib/libffi.a"))
    inputs.files(file("jni/Android.mk"))
    inputs.files(file("jni/Application.mk"))
    inputs.files(fileTree("../src/main/native").files.toTypedArray())
    outputs.files(nativeOutputs)

    val stdoutfile = file("build/ndk-build.log")
    doFirst {
        stdoutfile.parentFile.mkdirs()
        standardOutput = FileOutputStream(stdoutfile)
    }
}

tasks.register<Exec>("buildNativeDebug") {
    doFirst {
        if (!ndkPathProvider.isPresent) {
            throw GradleException("NDK_PATH env var is not set")
        }
    }

    dependsOn(":prebuild_libffi_ndk")

    executable = "${ndkPathProvider.getOrElse("")}/ndk-build"
    args("NDK_OUT=build/Debug/obj")
    args("NDK_APP_LIBS_OUT=build/Debug/libs")
    args("DEBUG=1")
    val stdoutfile = file("build/ndk-build-debug.log")
    doFirst {
        stdoutfile.parentFile.mkdirs()
        standardOutput = FileOutputStream(stdoutfile)
    }
}

tasks.build {
    dependsOn("buildNative")
    dependsOn("buildNativeDebug")
}

publishing {
    publications {
        create<MavenPublication>("mavenNative") {
            artifactId = "natj-ndk"

            for (o in nativeOutputs) {
                val f = File(o)
                val conf = f.parentFile.parentFile.parentFile.name
                val arch = f.parentFile.name

                var clser = "$conf-$arch"
                if (f.name != "libnatj.so") {
                    clser += "-c++"
                }

                artifact(o) {
                    extension = "so"
                    classifier = clser
                }
            }
        }
    }
}
