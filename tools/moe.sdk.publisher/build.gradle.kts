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

import de.undercouch.gradle.tasks.download.Download
import de.undercouch.gradle.tasks.download.Verify
import org.gradle.api.file.CopySpec
import org.gradle.api.file.FileTree
import java.io.File

plugins {
    alias(libs.plugins.download)
    id("base")
    id("signing")
    alias(libs.plugins.maven.publish.vanniktech)
}

group = "org.multi-os-engine"

val MOE_VERSION: String by project
val POM_URL: String by project
val POM_SCM_URL: String by project
val POM_LICENCE_NAME: String by project
val POM_LICENCE_URL: String by project
val POM_DEVELOPER_ID: String by project
val POM_DEVELOPER_NAME: String by project
val POM_DEVELOPER_ORGANISATION: String by project
val POM_DEVELOPER_ORGANISATION_URL: String by project

version = MOE_VERSION + (if (project.hasProperty("RELEASE")) "" else "-SNAPSHOT")

val projectDeps = listOf(
    ":moe.binding.clang",
    ":moe.generator.natjgen",
    ":moe.ios.device.launcher",
)

val r8Dest = layout.buildDirectory.file("r8/r8lib.jar").get().asFile

val downloadR8 = tasks.register<Download>("downloadR8") {
    src("https://storage.googleapis.com/r8-releases/raw/8.13.17/r8lib.jar")
    dest(r8Dest)
    onlyIfModified(true)
}

val verifyR8 = tasks.register<Verify>("verifyR8") {
    dependsOn(downloadR8)
    src(r8Dest)
    algorithm("SHA-256")
    checksum("d31fd0dc751d48740009cdd9a485126acb1d0d14c59b9f05579479940f4adf74")
}

val buildDeps = tasks.register("buildDeps") {
    projectDeps.forEach {
        dependsOn("$it:build")
    }
    dependsOn(verifyR8)
    dependsOn(":ext_moe_core")
    dependsOn(":ext_natj_mac")
}

@Suppress("UNCHECKED_CAST")
val external: Map<String, Any?> = rootProject.extra["external"] as Map<String, Any?>
@Suppress("UNCHECKED_CAST")
val moeCore: Map<String, Any?> = external["moe_core"] as Map<String, Any?>
@Suppress("UNCHECKED_CAST")
val out: Map<String, Any?> = moeCore["out"] as Map<String, Any?>
@Suppress("UNCHECKED_CAST")
val externalLlvm: Map<String, Any?> = external["llvm"] as Map<String, Any?>
@Suppress("UNCHECKED_CAST")
val externalNatj: Map<String, Any?> = external["natj"] as Map<String, Any?>

fun outFile(key: String): File = out[key] as File

fun buildfiles(proj: String, subpath: String): FileTree =
    fileTree("${project(proj).layout.buildDirectory.get().asFile.absolutePath}/$subpath")

fun getSDKCopySpec(): CopySpec = copySpec {
    into("sdk") {
        from(files(outFile("moe_core_jar"))) {
            rename(outFile("moe_core_jar").name, "moe-core.jar")
        }
        from(files(outFile("moe_core_sources_jar"))) {
            rename(outFile("moe_core_sources_jar").name, "moe-core-sources.jar")
        }
        from(files(outFile("moe_core_javadoc_jar"))) {
            rename(outFile("moe_core_javadoc_jar").name, "moe-core-javadoc.jar")
        }
        from(files(outFile("moe_ios_jar"))) {
            rename(outFile("moe_ios_jar").name, "moe-ios.jar")
        }
        from(files(outFile("moe_ios_sources_jar"))) {
            rename(outFile("moe_ios_sources_jar").name, "moe-ios-sources.jar")
        }
        from(files(outFile("moe_ios_javadoc_jar"))) {
            rename(outFile("moe_ios_javadoc_jar").name, "moe-ios-javadoc.jar")
        }
        from(files(outFile("moe_ios_junit_jar"))) {
            rename(outFile("moe_ios_junit_jar").name, "moe-ios-junit.jar")
        }
        from(files(outFile("moe_ios_junit_sources_jar"))) {
            rename(outFile("moe_ios_junit_sources_jar").name, "moe-ios-junit-sources.jar")
        }
        from(files(outFile("moe_ios_junit_javadoc_jar"))) {
            rename(outFile("moe_ios_junit_javadoc_jar").name, "moe-ios-junit-javadoc.jar")
        }
    }
    into("sdk/iphoneos") {
        from(files(outFile("iphoneos_libmoe"))) {
            rename(outFile("iphoneos_libmoe").name, "libmoe.a")
        }
        into("svmjdwp.framework") {
            from(files(outFile("iphoneos_svmjdwp"))) {
                exclude("_CodeSignature")
            }
        }
        into("include") {
            into(".") {
                from(files(outFile("iphoneos_libmoe_headers"))) {
                    include("jni.h")
                }
            }
            into("MOE") {
                from(files(outFile("iphoneos_libmoe_headers"))) {
                    exclude("jni.h")
                }
            }
        }
    }
    into("sdk/iphonesimulator") {
        from(files(outFile("iphonesimulator_libmoe"))) {
            rename(outFile("iphonesimulator_libmoe").name, "libmoe.a")
        }
        into("svmjdwp.framework") {
            from(files(outFile("iphonesimulator_svmjdwp"))) {
                exclude("_CodeSignature")
            }
        }
        into("include") {
            into(".") {
                from(files(outFile("iphonesimulator_libmoe_headers"))) {
                    include("jni.h")
                }
            }
            into("MOE") {
                from(files(outFile("iphonesimulator_libmoe_headers"))) {
                    exclude("jni.h")
                }
            }
        }
    }
    into("tools") {
        from(buildfiles(":moe.ios.device.launcher", "libs")) {
            include("moe.ios.device.launcher.jar")
            rename("moe.ios.device.launcher.jar", "ios-device.jar")
        }

        from(files(outFile("proguard_cfg").parentFile)) {
            include(outFile("jni_config_base_json").name)
            include(outFile("reflection_config_base_json").name)
            include(outFile("proguard_full_cfg").name)
            include(outFile("proguard_cfg").name)
        }

        from(buildfiles(":moe.generator.natjgen", "libs")) {
            include("moe.generator.natjgen.jar")
            rename("moe.generator.natjgen.jar", "wrapnatjgen.jar")
        }

        from(files("build/r8/")) {
            include("r8lib.jar")
            rename("r8lib.jar", "r8.jar")
        }

        from(files(".")) {
            include("gradlew.zip")
        }
    }

    into("tools/macosx") {
        from(files(externalLlvm["macos"] as File))
        @Suppress("UNCHECKED_CAST")
        from(files(externalNatj["mac"] as List<File>))
    }

    eachFile { println("$this") }
}

val sdk = tasks.register<Zip>("sdk") {
    dependsOn(buildDeps)
    with(getSDKCopySpec())
}

tasks.register<Copy>("devsdk") {
    dependsOn(buildDeps)
    destinationDir = layout.buildDirectory.dir("dev-sdk").get().asFile
    with(getSDKCopySpec())
}

mavenPublishing {
    publishToMavenCentral()
    if (project.hasProperty("signing.gnupg.keyId")) {
        signAllPublications()
    }
}

if (project.hasProperty("signing.gnupg.keyId")) {
    signing {
        useGpgCmd()
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifact(sdk)
            artifactId = "moe-sdk"

            pom {
                name = "moe-sdk"
                packaging = "zip"
                description = "MOE sdk"
                url = POM_URL

                scm {
                    url = POM_SCM_URL
                }

                licenses {
                    license {
                        name = POM_LICENCE_NAME
                        url = POM_LICENCE_URL
                    }
                }

                developers {
                    developer {
                        id = POM_DEVELOPER_ID
                        name = POM_DEVELOPER_NAME
                        organization = POM_DEVELOPER_ORGANISATION
                        organizationUrl = POM_DEVELOPER_ORGANISATION_URL
                    }
                }
            }
        }
    }
}
