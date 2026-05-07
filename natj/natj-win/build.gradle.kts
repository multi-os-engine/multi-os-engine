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
    id("maven-publish")
}

val envPath = providers.environmentVariable("PATH")
val pm5Configs = listOf("Debug", "Release")
val pm5Platforms: List<Map<String, String>> = listOf(
    mapOf("name" to "Win64", "mingw" to "x86_64-w64-mingw32"),
)
val pm5AllOutputs = mutableListOf<String>()

fun createBuildTask(
    pmProj: String,
    gDeps: List<Any>,
    pmConf: String,
    pmPlat: Map<String, String>,
    @Suppress("UNUSED_PARAMETER") pmProducts: List<String>,
): String {
    val tName = "build_${pmProj}_${pmConf}_${pmPlat["name"]}"
    val tOutputs = listOf(
        "build/obj/${pmPlat["name"]}/$pmConf/$pmProj",
        "build/$pmConf-${pmPlat["name"]}",
    )
    pm5AllOutputs.addAll(tOutputs)

    tasks.register<Exec>(tName) {
        for (dep in gDeps) {
            if (dep is String) {
                dependsOn("build_${dep}_${pmConf}_${pmPlat["name"]}")
            } else {
                dependsOn(dep)
            }
        }
        dependsOn(":prebuild_libffi_windows")
        if (pmProj == "TestClassesCxx") {
            dependsOn(":natj-cxxtests:processCxxTests")
        }

        workingDir = file("build")
        executable = "make"
        args("CC=${pmPlat["mingw"]}-g++")
        args("CXX=${pmPlat["mingw"]}-g++")
        args("AR=${pmPlat["mingw"]}-ar")
        args("LD=${pmPlat["mingw"]}-ld")
        args("config=${"${pmConf}_${pmPlat["name"]}".lowercase()}")
        args(pmProj)
        args("verbose=1")
        inputs.property("fake-time", System.currentTimeMillis())
        val stdoutfile = file("build/native-logs/$tName.log")
        outputs.dirs(*tOutputs.toTypedArray())
        outputs.files(stdoutfile)
        doFirst {
            environment("PATH", "${envPath.get()}:${file("../../prebuilts/mingw/bin").absolutePath}")
            args("-j${Runtime.getRuntime().availableProcessors()}")
            stdoutfile.parentFile.mkdirs()
            standardOutput = FileOutputStream(stdoutfile)
        }
    }
    return tName
}

val premakeTask = tasks.register<Exec>("premake") {
    doFirst {
        delete(pm5AllOutputs)
    }
    executable = "premake5"
    environment("MOE_PREBUILTS", file("../../prebuilts").absolutePath)
    args("gmake", "--os=windows", "--verbose")
    inputs.files(files("premake5.lua"))
    outputs.files(files("build/Makefile", "build/NatJ.make", "build/NatJStatic.make", "build/TestClassesCxx.make"))
    val stdoutfile = file("build/native-logs/premake5.log")
    doFirst {
        stdoutfile.parentFile.mkdirs()
        standardOutput = FileOutputStream(stdoutfile)
    }
}

val pmNatJStaticTasks = mutableListOf<String>()
val pmNatJTasks = mutableListOf<String>()
val pmTestClassesCxxTasks = mutableListOf<String>()
val pmTestClassesCTasks = mutableListOf<String>()

for (conf in pm5Configs) {
    for (plat in pm5Platforms) {
        pmNatJStaticTasks += createBuildTask(
            "NatJStatic",
            listOf(premakeTask), conf, plat, listOf("natj-static.a"),
        )
        pmNatJTasks += createBuildTask(
            "NatJ",
            listOf("NatJStatic"), conf, plat, listOf("natj.lib", "natj.dll"),
        )
        pmTestClassesCxxTasks += createBuildTask(
            "TestClassesCxx",
            listOf("NatJStatic"), conf, plat, listOf("TestClassesCxx.lib", "TestClassesCxx.dll"),
        )
        pmTestClassesCTasks += createBuildTask(
            "TestClassesC",
            listOf("NatJStatic"), conf, plat, listOf("TestClassesC.lib", "TestClassesC.dll"),
        )
    }
}

tasks.register("buildStaticNative") {
    dependsOn(pmNatJStaticTasks)
}

tasks.register("buildNative") {
    dependsOn(pmNatJTasks)
}

tasks.register("buildTestClassesCxx") {
    dependsOn(pmTestClassesCxxTasks)
}

tasks.register("buildTestClassesC") {
    dependsOn(pmTestClassesCTasks)
}

tasks.register("build") {
    dependsOn("buildNative")
}

tasks.register("buildAll") {
    dependsOn("build", "buildStaticNative", "buildTestClassesCxx", "buildTestClassesC")
}

tasks.register<Delete>("clean") {
    delete(layout.buildDirectory)
}

// Configure publishing
tasks.publish {
    dependsOn("buildNative")
}
publishing {
    publications {
        create<MavenPublication>("mavenNative") {
            artifactId = "natj-win"

            for (conf in pm5Configs) {
                for (plat in pm5Platforms) {
                    val o = "build/$conf-${plat["name"]}/natj.dll"
                    artifact(o) {
                        extension = "dll"
                        classifier = File(o).parentFile.name
                    }
                }
            }
        }
    }
}
