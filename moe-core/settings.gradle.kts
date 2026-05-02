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
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

includeBuild("../build-tools")
includeBuild("../natj")

// iOS bindings
include(":moe.apple:moe.platform.ios")
include(":moe.apple:moe.platform.ios.junit")

// Native projects for Apple platforms
include(":moe.apple")
include(":moe.apple:moe.core.native")
include(":moe.apple:moe.core.java")
include(":moe.apple:moe.core.native:external.javasqlite")
include(":moe.apple:moe.core.native:svm.graal")
include(":moe.apple:moe.core.native:svm.openjdk")
include(":moe.apple:moe.core.native:svm.jdwp")
include(":moe.apple:moe.core.native:moe.sdk")
