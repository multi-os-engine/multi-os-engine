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

import org.moe.prebuilts.Script

plugins {
    id("org.moe.buildtools")
    id("base")
}

version = "2.0.0"

allprojects {
    repositories {
        mavenCentral()
    }
}

for (target in listOf("ios", "mac", "win")) {
    tasks.register("ext_natj_$target") {
        dependsOn(gradle.includedBuild("natj").task(":natj-$target:build"))
    }
}

val rootBuild = tasks.build
subprojects.forEach { subproject ->
    subproject.afterEvaluate {
        subproject.tasks.matching { it.name == "build" }.all {
            val buildTask = this
            rootBuild.configure { dependsOn(buildTask) }
        }
    }
}

fun createBrewCheckExecTask(execname: String): TaskProvider<Script> =
    tasks.register<Script>("check_exec_$execname") {
        setWorkDir(".")
        failureMessage = """
    Error: $execname is not installed, please run `brew install $execname` to install.
"""
        exec("which", execname)
    }

fun createCheckExecTask(execname: String, failmsg: String): TaskProvider<Script> =
    tasks.register<Script>("check_exec_$execname") {
        setWorkDir(".")
        failureMessage = failmsg
        exec("which", execname)
    }

val brewChecks = listOf("autogen", "autoconf", "automake", "libtool", "pkg-config", "wget", "cloog", "cmake", "gpg", "ant")
    .map { createBrewCheckExecTask(it) }
val premakeCheck = createCheckExecTask("premake5", """
    Error: premake5 is not installed, please run the following to install:

        brew install file://${file("dependencies/premake5.rb").absolutePath}
""")

tasks.check {
    brewChecks.forEach { dependsOn(it) }
    dependsOn(premakeCheck)
}

tasks.register("cleanAll") {
    dependsOn(allprojects.map { it.tasks.named("clean") })
}
