# Multi-OS Engine

## Overview

[Multi-OS Engine](http://multi-os-engine.org/) provides a Java runtime and Java interfaces to iOS platform API to develop native iOS applications with native look and feel, native performance, and portability of common Java logic modules from your Android Apps. It comes fully integrated with Android Studio hosted on macOS or Windows and contains all the development tools needed to develop an iOS app and publish to the App Store.

## Getting Started

- [Install Multi-OS Engine](https://multi-os-engine.org/start/)
- Walk through our [Quick Start Tutorials](http://doc.multi-os-engine.org) to configure your development environment and learn how to develop applications using Multi-OS Engine.
- Ask questions on the [Multi-OS Engine Forum](https://discuss.multi-os-engine.org/)
- Submit issues to our [Issue Tracker](https://github.com/multi-os-engine/multi-os-engine/issues)

## Building from Source Code

### Requirements

- Apple macOS 10.14+
- Minimum 8GB RAM

### Get the Source Code

```
git clone --recurse-submodules https://github.com/multi-os-engine/multi-os-engine.git
```

If you already cloned without `--recurse-submodules`, populate them with:

```
git submodule update --init --recursive
```

Vendored dependencies (GraalVM/labs-openjdk fork, libffi, llvm, etc.) live under `vendor/svm/` and `vendor/external/` as git submodules. The legacy `repo` tool layout is no longer used on this branch.

### Installing Homebrew & Dependencies

Install brew from [brew.sh](http://brew.sh), then you can install MOE's dependencies:

```sh
brew install autogen autoconf automake libtool pkg-config wget isl cloog cmake gpg ant maven mpfr libmpc premake texinfo
```

### Building LLVM

Building the complete SDK and related tools requires LLVM. To build these execute the following:

```sh
./gradlew :prebuilts:llvm
```

This step only needs to be done once (or until MinGW or LLVM components/requirements are changed).

### Setting a custom version

```sh
sh set_version.sh <component> <version>
```

### Building Multi-OS Engine

Creating a developer SDK:

```sh
./gradlew :tools:moe-sdk:devsdk
```

Building and publishing the SDK to Maven local:

```sh
./gradlew :tools:moe-sdk:publishToMavenLocal
```

Building and publishing the Gradle plugin to Maven local:

```sh
./gradlew :tools:moe-gradle:publishToMavenLocal
```

Building the IDEA plugin:

```sh
./gradlew :tools:moe.plugin.idea:build
```
