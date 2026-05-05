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
    id("org.moe.java-conventions")
}

javaConventions.release = 11

dependencies {
    implementation("org.multi-os-engine:javapymobiledevice3")
    implementation(libs.jnigen.commons)
    implementation(libs.slf4j.api)
    implementation(libs.slf4j.simple)
    implementation(project(":moe.tools.common"))
    implementation(project(":moe.protocol.gdbremote"))
}

tasks.jar {
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    manifest { attributes(mapOf("Main-Class" to "org.moe.ios.device.launcher.Main")) }
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
