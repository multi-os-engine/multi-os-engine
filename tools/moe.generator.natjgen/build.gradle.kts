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

import java.io.File

plugins {
    id("org.moe.java-conventions")
}

tasks.classes { dependsOn(":ext_natj_mac") }

dependencies {
    implementation(fileTree("lib") { include("*.jar") })

    implementation(libs.hamcrest.core)

    implementation(libs.slf4j.api)
    implementation(libs.slf4j.simple)

    implementation("org.moe:natj")

    implementation(project(":moe.tools.common"))
    implementation(project(":moe.binding.clang"))
    implementation(project(":moe.tools.natjgen"))

    implementation(libs.commons.lang3)
    implementation(libs.commons.compress)
    implementation(libs.commons.exec)
    implementation(libs.commons.cli)
    implementation(libs.ant)
    implementation(libs.gson)
    implementation(libs.sqlite.jdbc)

    implementation(libs.eclipse.jdt.core)
    implementation(libs.eclipse.jdt.annotation)

    implementation(libs.eclipse.contenttype)
    implementation(libs.eclipse.jobs)
    implementation(libs.eclipse.resources)
    implementation(libs.eclipse.runtime)

    implementation(libs.eclipse.equinox.app)
    implementation(libs.eclipse.equinox.preferences)

    testImplementation(libs.junit)
}

tasks.withType<Test>().configureEach {
    systemProperty("java.library.path", moeExternal.llvm.jnipath.absolutePath + File.pathSeparator + moeExternal.natJ.jnipath.absolutePath)
}

tasks.jar {
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    exclude("META-INF/*.SF")

    manifest {
        attributes(mapOf(
            "Class-Path" to ".",
            "Main-Class" to "org.moe.natjgen.Main",
        ))
    }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
