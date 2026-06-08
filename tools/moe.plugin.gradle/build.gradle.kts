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
    alias(libs.plugins.gradle.plugin.publish)
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

javaConventions.release = 17

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
    "shade"(libs.bcprov.jdk18on)
    "shade"(libs.asm)
    "shade"(libs.asm.tree)
    "shade"(libs.asm.commons)
    "shade"(libs.gson)
    "shade"(libs.dd.plist)
    "shade"(libs.commons.codec)

    testImplementation(libs.junit)
    testImplementation(gradleTestKit())
}

tasks.shadowJar {
    configurations = listOf(project.configurations["shade"])
    archiveClassifier = ""
    mergeServiceFiles()
    enableAutoRelocation = true
    relocationPrefix = "org.moe.gradle.shadow"
    relocate("org.moe", "org.moe")
    // BouncyCastle ships a signed jar; its signature files break once shaded.
    exclude("META-INF/*.SF")
    exclude("META-INF/*.DSA")
    exclude("META-INF/*.RSA")
    exclude("META-INF/*.EC")

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

gradlePlugin {
    website = POM_URL
    vcsUrl = POM_SCM_URL
    plugins {
        create("moe-gradle") {
            id = "org.multi-os-engine.moe-gradle"
            implementationClass = "org.moe.gradle.MoePlugin"
            displayName = "Multi-OS Engine Gradle Plugin"
            description = "Build, package, and launch iOS apps from a Gradle project."
            tags = listOf("multi-os-engine", "moe", "ios", "graalvm", "native-image")
        }
        create("moe-sdk") {
            id = "org.multi-os-engine.moe-sdk"
            implementationClass = "org.moe.gradle.MoeSDKPlugin"
            displayName = "Multi-OS Engine SDK Plugin"
            description = "Resolves and exposes the MOE SDK to a consuming build."
            tags = listOf("multi-os-engine", "moe", "ios", "sdk")
        }
    }
}

mavenPublishing {
    coordinates("org.multi-os-engine", "moe-gradle", version.toString())
    pom {
        name = "moe-gradle"
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
    publishToMavenCentral()
    if (project.hasProperty("signing.gnupg.keyId")) {
        signAllPublications()
    }
}

signing {
    setRequired({ project.hasProperty("signing.gnupg.keyId") })
    if (project.hasProperty("signing.gnupg.keyId")) {
        useGpgCmd()
    }
}

// Write the plugin's classpath to a file to share with the tests
val createClasspathManifest = tasks.register("createClasspathManifest") {
    val outputDir = layout.buildDirectory.dir(name).get().asFile
    val runtimeClasspath = sourceSets["main"].runtimeClasspath
    val shadeClasspath = configurations["shade"]
    val classpath = runtimeClasspath + shadeClasspath
    val sdkLocalBuildPath = project(":moe-sdk").file("build/dev-sdk").toString()
    val pluginVersion = project.version.toString()

    inputs.files(classpath)
    outputs.dir(outputDir)
    outputs.cacheIf { false }

    doLast {
        outputDir.mkdirs()
        File(outputDir, "plugin-classpath.txt").writeText(classpath.files.joinToString("\n"))
        File(outputDir, "plugin-sdk-localbuild.txt").writeText(sdkLocalBuildPath)
        File(outputDir, "plugin-version.txt").writeText(pluginVersion)
    }
}

// Add the classpath file to the test runtime classpath
dependencies {
    testRuntimeOnly(files(createClasspathManifest))
}

val launcher = javaToolchains.launcherFor {
    languageVersion = JavaLanguageVersion.of(javaConventions.release.get())
}

tasks.test {
    dependsOn(":moe-sdk:devsdk")
    systemProperty("moe.test.java_home", launcher.get().metadata.installationPath.asFile.absolutePath)
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}
