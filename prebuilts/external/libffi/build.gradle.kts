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

import org.moe.prebuilts.Prebuild

tasks.register<Prebuild>("prebuild_ios") {
    sourcePath = "external/libffi"

    buildScript = "moe-prebuild-ios.sh"
    targetName = "ios"
    preBuildFiles.from(files("libffi-disable-armv7-ios.patch", "libffi-backport-cif-fix.patch", "moe-prebuild-ios.sh"))
}

tasks.register<Prebuild>("prebuild_macos") {
    sourcePath = "external/libffi"

    buildScript = "moe-prebuild-macos.sh"
    targetName = "macos"
    preBuildFiles.from(files("libffi-backport-cif-fix.patch", "moe-prebuild-macos.sh"))
}

tasks.register<Prebuild>("prebuild_windows") {
    sourcePath = "external/libffi"

    buildScript = "moe-prebuild-windows.sh"
    targetName = "windows"
    env("PATH", "${providers.environmentVariable("PATH").get()}:${rootProject.file("mingw/bin").absolutePath}")
    preBuildFiles.from(files("moe-prebuild-windows.sh"))
    dependsOn(":mingwPresence")
}

tasks.register<Prebuild>("prebuild_linux") {
    sourcePath = "external/libffi"

    buildScript = "moe-prebuild-linux.sh"
    targetName = "linux"
    env("PATH", providers.environmentVariable("PATH").get())
    preBuildFiles.from(files("moe-prebuild-linux.sh"))
    dependsOn(":linuxCrosscompiler")
}

tasks.register<Prebuild>("prebuild_ndk") {
    sourcePath = "external/libffi"

    buildScript = "moe-prebuild-ndk.sh"
    targetName = "ndk"
    preBuildFiles.from(files("moe-prebuild-ndk.sh"))
}

tasks.register("prebuild") {
    dependsOn("prebuild_ndk", "prebuild_linux", "prebuild_windows", "prebuild_macos", "prebuild_ios")
}

tasks.register<Delete>("clean") {
    delete("build")
}
