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

plugins {
    id("org.moe.java-conventions")
}

tasks.classes { dependsOn(":ext_natj_mac") }

dependencies {
    implementation("org.moe:natj")
    testImplementation(libs.junit)
}

@Suppress("UNCHECKED_CAST")
val externalLlvm: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["llvm"] as Map<String, Any?>
val llvmJnipath = externalLlvm["jnipath"] as File

@Suppress("UNCHECKED_CAST")
val externalNatj: Map<String, Any?> =
    (rootProject.extra["external"] as Map<String, Any?>)["natj"] as Map<String, Any?>
val natjJnipath = externalNatj["jnipath"] as File

tasks.withType<Test>().configureEach {
    systemProperty("java.library.path", llvmJnipath.absolutePath + File.pathSeparator + natjJnipath.absolutePath)
}
