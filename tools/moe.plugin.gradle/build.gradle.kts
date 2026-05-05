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

import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import java.io.File

plugins {
    id("org.moe.java-conventions")
    id("org.jetbrains.kotlin.jvm")
    id("signing")
    alias(libs.plugins.shadow)
    alias(libs.plugins.maven.publish.vanniktech)
}

if (name != "moe-gradle") {
    throw GradleException("Incorrect name")
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

tasks.processResources {
    val moeVer = version
    inputs.property("version", moeVer)
    filesMatching("**/moe.properties") {
        expand(mapOf("MOE_VERSION" to moeVer))
    }
}

val shade by configurations.creating {
    isCanBeResolved = true
    isCanBeConsumed = false
    exclude(group = "org.jetbrains.kotlin")
    exclude(group = "org.jetbrains", module = "annotations")
}
configurations {
    compileOnly { extendsFrom(shade) }
    testImplementation { extendsFrom(shade) }
}

dependencies {
    compileOnly(gradleApi())

    "shade"(project(":moe.tools.common"))
    "shade"(project(":moe.document.pbxproj"))
    "shade"(project(":moe.generator.project"))
    "shade"(project(":moe.tools.substrate"))
    "shade"(project(":moe.tools.classvalidator"))

    "shade"(libs.commons.lang3)
    "shade"(libs.commons.io)
    "shade"(libs.jsch)
    "shade"(libs.asm)
    "shade"(libs.asm.tree)
    "shade"(libs.asm.commons)
    "shade"(libs.gson)
    "shade"(libs.dd.plist)
    "shade"(libs.commons.codec)

    testImplementation(libs.junit)
    testImplementation(gradleTestKit())
}

tasks.test { dependsOn(":moe-sdk:devsdk") }

tasks.shadowJar {
    configurations = listOf(project.configurations["shade"])
    archiveClassifier = ""
    mergeServiceFiles()
    enableAutoRelocation = true
    relocationPrefix = "org.moe.gradle.shadow"
    relocate("org.moe", "org.moe")

    dependencies {
        exclude(dependency("org.slf4j:slf4j-api:.*"))
    }
}

tasks.jar {
    archiveClassifier = "plain"
}

java {
    withSourcesJar()
    withJavadocJar()
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
            from(components["shadow"])
            artifact(tasks.named("sourcesJar"))
            artifact(tasks.named("javadocJar"))
            artifactId = "moe-gradle"

            pom {
                name = "moe-gradle"
                packaging = "jar"
                description = "MOE Gradle Plugin"
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

// Write the plugin's classpath to a file to share with the tests
val createClasspathManifest = tasks.register("createClasspathManifest") {
    val outputDir = layout.buildDirectory.dir(name).get().asFile
    val runtimeClasspath = sourceSets["main"].runtimeClasspath
    val shadeClasspath = configurations["shade"]
    val sdkLocalBuildPath = project(":moe-sdk").file("build/dev-sdk")
    val pluginVersion = project.version

    inputs.files(runtimeClasspath)
    outputs.dir(outputDir)

    doLast {
        outputDir.mkdirs()
        File(outputDir, "plugin-classpath.txt").writeText((runtimeClasspath.files + shadeClasspath.files).joinToString("\n"))
        File(outputDir, "plugin-sdk-localbuild.txt").writeText(sdkLocalBuildPath.toString())
        File(outputDir, "plugin-version.txt").writeText(pluginVersion.toString())
    }
}

// Add the classpath file to the test runtime classpath
dependencies {
    testRuntimeOnly(files(createClasspathManifest))
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
    }
}
