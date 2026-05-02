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

dependencies {
    implementation(libs.slf4j.api)
    implementation(libs.commons.io)
    implementation(libs.gson)
    implementation(project(":moe.tools.common"))
    implementation(project(":moe.document.pbxproj"))
    testImplementation(libs.junit)
}

tasks.jar {
    exclude("META-INF/*.RSA", "META-INF/*.SF", "META-INF/*.DSA")
}

tasks.register<Exec>("installTestPod") {
    dependsOn("processTestResources")
    workingDir = file("build/resources/test/MyApp")
    commandLine("/usr/local/bin/pod", "install", "--no-ansi", "--silent")
}
tasks.test {
    dependsOn("installTestPod")
    systemProperty("test.resources", file("build/resources/test").absolutePath)
}
