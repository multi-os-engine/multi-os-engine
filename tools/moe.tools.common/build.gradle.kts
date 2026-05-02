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

import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    id("org.moe.java-conventions")
    id("org.jetbrains.kotlin.jvm")
}

sourceSets {
    create("testCommon") {
        java { srcDir("src/test-common/java") }
    }
}

dependencies {
    implementation(fileTree("lib") { include("*.jar") })
    api(libs.slf4j.api)
    api(libs.commons.io)
    api(libs.dd.plist)
    implementation(libs.gson)
    testImplementation(libs.junit)
    "testCommonImplementation"(sourceSets["main"].output)
    "testCommonImplementation"(libs.junit)
}

tasks.jar {
    exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_1_8
    }
}
