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

import de.undercouch.gradle.tasks.download.Download
import de.undercouch.gradle.tasks.download.Verify
import org.gradle.process.ExecOperations
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.io.File
import java.io.FileOutputStream
import javax.inject.Inject

plugins {
    id("org.moe.java-conventions")
    alias(libs.plugins.download)
    id("org.jetbrains.kotlin.jvm")
}

interface InjectedExecOps {
    @get:Inject
    val execOps: ExecOperations
}

dependencies {
    implementation(project(":moe.tools.common"))
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
    }
}

// Base configuration
val graalvmVersion = "25.0.1"
val baseDownloadUrl = "https://github.com/graalvm/graalvm-ce-builds/releases/download/jdk-$graalvmVersion"

// Helper functions
fun getGraalVMArm64Home(): File =
    file("build/capCacheGeneration/arm64/graalvm/graalvm-arm64")

fun getGraalVMx86Home(): File =
    file("build/capCacheGeneration/x86_64/graalvm/graalvm-x86_64")

// ARM64 tasks
val downloadGraalVMArm64 = tasks.register<Download>("downloadGraalVMArm64") {
    src("$baseDownloadUrl/graalvm-community-jdk-${graalvmVersion}_macos-aarch64_bin.tar.gz")
    dest(file("build/capCacheGeneration/arm64/downloads/graalvm.tar.gz"))
    onlyIfModified(true)
}

val downloadGraalVMx86 = tasks.register<Download>("downloadGraalVMx86") {
    src("$baseDownloadUrl/graalvm-community-jdk-${graalvmVersion}_macos-x64_bin.tar.gz")
    dest(file("build/capCacheGeneration/x86_64/downloads/graalvm.tar.gz"))
    onlyIfModified(true)
}

val verifyGraalVMArm64 = tasks.register<Verify>("verifyGraalVMArm64") {
    dependsOn(downloadGraalVMArm64)
    src(file("build/capCacheGeneration/arm64/downloads/graalvm.tar.gz"))
    checksum("066339f24a8ab5c161548491a9400f7344e7761a1e46f8979e76c7ef11d5bc76")
    algorithm("SHA-256")
}

val verifyGraalVMx86 = tasks.register<Verify>("verifyGraalVMx86") {
    dependsOn(downloadGraalVMx86)
    src(file("build/capCacheGeneration/x86_64/downloads/graalvm.tar.gz"))
    checksum("a3d895b4cd1c783badbd277ec70409806bd4102fca0d2a60dbaeb0bab41aec30")
    algorithm("SHA-256")
}

val extractGraalVMArm64 = tasks.register<Exec>("extractGraalVMArm64") {
    dependsOn(verifyGraalVMArm64)

    val execOps = project.objects.newInstance<InjectedExecOps>().execOps

    workingDir = file("build/capCacheGeneration/arm64/graalvm")
    executable = "tar"
    args = listOf("-xzf", "../downloads/graalvm.tar.gz", "--strip-components=1")

    doFirst {
        file("build/capCacheGeneration/arm64/graalvm").mkdirs()
    }

    doLast {
        val extractedDir = file("build/capCacheGeneration/arm64/graalvm")
        val renamedDir = file("build/capCacheGeneration/arm64/graalvm/graalvm-arm64")

        renamedDir.mkdirs()
        extractedDir.listFiles()!!.filter { it.name != "graalvm-arm64" }.forEach { f ->
            f.renameTo(File(renamedDir, f.name))
        }

        execOps.exec {
            executable = "chmod"
            args = listOf("-R", "u+w", renamedDir.absolutePath)
            isIgnoreExitValue = true
        }

        execOps.exec {
            executable = "xattr"
            args = listOf("-dr", "com.apple.quarantine", renamedDir.absolutePath)
            isIgnoreExitValue = true
        }
    }
}

val extractGraalVMx86 = tasks.register<Exec>("extractGraalVMx86") {
    dependsOn(verifyGraalVMx86)

    val execOps = project.objects.newInstance<InjectedExecOps>().execOps

    workingDir = file("build/capCacheGeneration/x86_64/graalvm")
    executable = "tar"
    args = listOf("-xzf", "../downloads/graalvm.tar.gz", "--strip-components=1")

    doFirst {
        file("build/capCacheGeneration/x86_64/graalvm").mkdirs()
    }

    doLast {
        val extractedDir = file("build/capCacheGeneration/x86_64/graalvm")
        val renamedDir = file("build/capCacheGeneration/x86_64/graalvm/graalvm-x86_64")

        renamedDir.mkdirs()
        extractedDir.listFiles()!!.filter { it.name != "graalvm-x86_64" }.forEach { f ->
            f.renameTo(File(renamedDir, f.name))
        }

        execOps.exec {
            executable = "chmod"
            args = listOf("-R", "u+w", renamedDir.absolutePath)
            isIgnoreExitValue = true
        }

        execOps.exec {
            executable = "xattr"
            args = listOf("-dr", "com.apple.quarantine", renamedDir.absolutePath)
            isIgnoreExitValue = true
        }
    }
}

val generateDummyClass = tasks.register("generateDummyClass") {
    val execOps = project.objects.newInstance<InjectedExecOps>().execOps
    doLast {
        val tempDir = file("build/tmp/")
        tempDir.mkdirs()

        val dummyClass = file("$tempDir/Dummy.java")
        dummyClass.writeText("""
            public class Dummy {
                public static void main(String[] args) {}
            }
        """)

        val compiler = javaToolchains.compilerFor {
            languageVersion = JavaLanguageVersion.of(21)
        }

        execOps.exec {
            executable = compiler.get().executablePath.asFile.absolutePath
            args = listOf("-d", tempDir.absolutePath, dummyClass.absolutePath)
        }
    }
}

val generateQueryCodeArm64 = tasks.register<Exec>("generateQueryCodeArm64") {
    dependsOn(generateDummyClass, extractGraalVMArm64)
    val graalvmHome = getGraalVMArm64Home()

    executable = "$graalvmHome/Contents/Home/bin/native-image"

    args = listOf(
        "-H:+UnlockExperimentalVMOptions",
        "-H:QueryCodeDir=${file("build/capCacheGeneration/arm64/querySrc/")}",
        "-H:+ExitAfterQueryCodeGeneration",
        "-H:+JDWP",
        "-cp", file("build/tmp/").absolutePath,
        "Dummy",
    )
}

val generateQueryCodex86_64 = tasks.register<Exec>("generateQueryCodex86_64") {
    dependsOn(generateDummyClass, extractGraalVMx86)
    val graalvmHome = getGraalVMx86Home()

    executable = "$graalvmHome/Contents/Home/bin/native-image"

    args = listOf(
        "-H:+UnlockExperimentalVMOptions",
        "-H:QueryCodeDir=${file("build/capCacheGeneration/x86_64/querySrc/")}",
        "-H:+ExitAfterQueryCodeGeneration",
        "-H:+JDWP",
        "-cp", file("build/tmp/").absolutePath,
        "Dummy",
    )
}

val runQueryCodeArm64 = tasks.register("runQueryCodeArm64") {
    dependsOn(generateQueryCodeArm64)
    val graalvmArm64Home = getGraalVMArm64Home()
    val execOps = project.objects.newInstance<InjectedExecOps>().execOps

    doLast {
        val arm64QuerySource = file("build/capCacheGeneration/arm64/querySrc")
        val queryOut = file("build/capCacheGeneration/arm64/queryOut")
        val arm64Out = file("src/main/resources/cap_arm64")

        queryOut.mkdirs()
        arm64Out.mkdirs()

        if (arm64QuerySource.exists()) {
            for (f in arm64QuerySource.listFiles()!!) {
                val nameWithoutExt = f.name.substring(0, f.name.lastIndexOf('.'))
                execOps.exec {
                    workingDir = queryOut
                    executable = "clang"
                    args = listOf(
                        "-x", "objective-c",
                        "-I${graalvmArm64Home}/Contents/Home/include",
                        "-I${graalvmArm64Home}/Contents/Home/include/darwin",
                        f.absolutePath,
                        "-o", nameWithoutExt,
                    )
                }
                execOps.exec {
                    commandLine = listOf(file("${queryOut.absolutePath}/$nameWithoutExt").absolutePath)
                    standardOutput = FileOutputStream(file("src/main/resources/cap_arm64/${nameWithoutExt}.cap"))
                }
            }
        }
    }
}

val runQueryCodex86_64 = tasks.register("runQueryCodex86_64") {
    dependsOn(generateQueryCodex86_64)
    val graalvmx86Home = getGraalVMx86Home()
    val execOps = project.objects.newInstance<InjectedExecOps>().execOps

    doLast {
        val x86_64QuerySource = file("build/capCacheGeneration/x86_64/querySrc")
        val queryOut = file("build/capCacheGeneration/x86_64/queryOut")
        val x86_64Out = file("src/main/resources/cap_x86_64")

        queryOut.mkdirs()
        x86_64Out.mkdirs()

        if (x86_64QuerySource.exists()) {
            for (f in x86_64QuerySource.listFiles()!!) {
                val nameWithoutExt = f.name.substring(0, f.name.lastIndexOf('.'))
                execOps.exec {
                    workingDir = queryOut
                    executable = "clang"
                    args = listOf(
                        "-x", "objective-c", "-arch", "x86_64",
                        "-I${graalvmx86Home}/Contents/Home/include",
                        "-I${graalvmx86Home}/Contents/Home/include/darwin",
                        f.absolutePath,
                        "-o", nameWithoutExt,
                    )
                }
                execOps.exec {
                    executable = "arch"
                    args = listOf("-x86_64", file("${queryOut.absolutePath}/$nameWithoutExt").absolutePath)
                    standardOutput = FileOutputStream(file("src/main/resources/cap_x86_64/${nameWithoutExt}.cap"))
                }
            }
        }
    }
}

tasks.register("runQueryCode") {
    dependsOn(runQueryCodeArm64, runQueryCodex86_64)
}
