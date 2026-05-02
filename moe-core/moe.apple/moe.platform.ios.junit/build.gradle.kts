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

plugins {
    id("org.moe.java-conventions")
}

base {
    archivesName = "moe-ios-junit"
}

java {
    disableAutoTargetJvm()
    withSourcesJar()
    withJavadocJar()
}

fun jvmVersionMeets(version: Int): Boolean {
    val currentJvm = Jvm.current()
    return version <= Integer.parseInt(currentJvm.javaVersion!!.majorVersion)
}

tasks.classes { dependsOn(":ext_natj_ios") }

val included by configurations.creating

dependencies {
    implementation(libs.junit)
    included(libs.junit)

    implementation("org.moe:natj")
    implementation(project(":moe.apple:moe.platform.ios"))
}

tasks.javadoc {
    if (jvmVersionMeets(8)) {
        (options as StandardJavadocDocletOptions).addStringOption("Xdoclint:none", "-quiet")
    }
}

tasks.jar {
    from({ included.map { if (it.isDirectory) it else zipTree(it) } })
    exclude("META-INF/*.SF")
}
