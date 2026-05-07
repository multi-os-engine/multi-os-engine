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

plugins {
    id("org.moe.buildtools")
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.maven.publish.vanniktech) apply false
}

allprojects {
    group = "org.multi-os-engine"
    repositories {
        mavenCentral()
    }
}

for (target in listOf("ios", "macos", "windows")) {
    tasks.register("prebuild_libffi_$target") {
        dependsOn(gradle.includedBuild("prebuilts").task(":external:libffi:prebuild_$target"))
    }
}

for (target in listOf("ios", "mac", "win", "linux")) {
    tasks.register("ext_natj_$target") {
        dependsOn(gradle.includedBuild("natj").task(":natj-$target:build"))
    }
}

tasks.register("build_ext_moe_core") {
    dependsOn(gradle.includedBuild("moe-core").task(":build"))
}

tasks.register("ext_moe_core") {
    dependsOn("build_ext_moe_core")
}

tasks.register("cleanAll") {
    dependsOn(subprojects.map { it.tasks.named("clean") })
}