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

// NOTE: This subproject is not included in tools/settings.gradle.kts and is
// never evaluated by Gradle. It uses APIs that were removed in Gradle 7
// (testCompile) and a Java source level (1.6) that the modern javac rejects;
// the file is preserved as documentation of the original Groovy form.

plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_6
    targetCompatibility = JavaVersion.VERSION_1_6
}

dependencies {
    "testCompile"("junit:junit:4.12")
}
