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

### Install the 'repo' Tool

```
mkdir ~/bin
PATH=~/bin:$PATH
curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
chmod a+x ~/bin/repo
```

You may also install the repo using brew:

```
brew install repo
```

### Get the Source Code

Mainline branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git -b moe-master
repo sync
```

Note: if you want to get the source code from development branch with initial support of Windows and bitcode, switch to "moe-windows-bitcode" branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git -b moe-windows-bitcode
repo sync
```

### Installing Homebrew & Dependencies

Install brew from [brew.sh](http://brew.sh), then you can install MOE's dependencies:

```sh
brew install autogen autoconf automake libtool pkg-config wget isl cloog cmake gpg ant maven mpfr libmpc repo premake texinfo
```

### Building MinGW & LLVM

Building the complete SDK and related tools requires LLVM and MinGW. To build these execute the following:

```sh
cd <repo>/moe
./gradlew :prebuilts:mingw :prebuilts:llvm
```

This step only needs to be done once (or until MinGW or LLVM components/requirements are changed).

### Setting a custom version

```sh
cd <repo>/moe/tools
sh set_version.sh <component> <version>  
```

### Building Multi-OS Engine

[SDK Publisher](https://github.com/multi-os-engine/moe-sdk-publisher): creating a developer SDK:

```sh
cd <repo>/moe
./gradlew :tools:moe-sdk:devsdk
```


[SDK Publisher](https://github.com/multi-os-engine/moe-sdk-publisher): building and publishing a SDK to Maven local:

```sh
cd <repo>/moe
./gradlew :tools:moe-sdk:publishToMavenLocal
```

[Gradle Plugin](https://github.com/multi-os-engine/moe-plugin-gradle): building and publishing the Gradle plugin to Maven local:

```sh
cd <repo>/moe
./gradlew :tools:moe-gradle:publishToMavenLocal
```

[IDEA Plugin](https://github.com/multi-os-engine/moe-ide-integration): building the IDEA plugin:

```sh
cd <repo>/moe/tools/master
./gradlew :moe.plugin.idea:build
```
