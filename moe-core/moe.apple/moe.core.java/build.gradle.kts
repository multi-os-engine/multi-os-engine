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

plugins {
    id("org.moe.java-conventions")
}

base {
    archivesName = "moe-core"
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    withSourcesJar()
    withJavadocJar()
}

val externalJavaSources = listOf(
    "${moeExternal.javasqlite}/src/main/java",
)

sourceSets {
    named("main") {
        java {
            srcDirs(*externalJavaSources.toTypedArray())
        }
    }
}

dependencies {
    implementation("org.moe:natj")
    compileOnly(libs.graalvm.svm)
}

// Don't run tests with the built-in junit
tasks.test { exclude("**") }

tasks.jar {
    from(rootProject.file("LICENSE"))
    from(rootProject.file("NOTICE"))
    from(file("../eula/LICENSE.TXT")) { into("META-INF") }
    includeEmptyDirs = false
}

tasks.javadoc {
    title = "moe.ios.core API"
    setDestinationDir(file("build/docs/coreJavadoc"))
    include("**/*.java")
    (options as StandardJavadocDocletOptions).apply {
        addStringOption("Xdoclint:none", "-quiet")
        addStringOption("source", "1.8")
    }
}
