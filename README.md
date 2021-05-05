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
brew tap homebrew/versions
brew install autogen autoconf automake libtool pkg-config wget isl cloog cmake jasmin gpg ant maven

cd <repo>/moe/moe-core
brew install file://`pwd`/dependencies/premake5.rb
brew install file://`pwd`/dependencies/isl@0.14.rb
```

### Building MinGW & LLVM

Note: On MacOS Mojave the header files are not installed automatically. To install them, execute the following commands:

```
sudo rm -rf /Library/Developer/CommandLineTools # We remove the previously installed command line tools to make sure we have the latest one
xcode-select --install   # Install the latest one
open /Library/Developer/CommandLineTools/Packages/macOS_SDK_headers_for_macOS_10.14.pkg # Install the headers
sudo xcode-select --reset # To make sure that the default toolchain path points to Xcode (required by xcodebuild)
```

Building the complete SDK and related tools requires LLVM and MinGW. To build these execute the following:

```sh
cd <repo>/prebuilts
./gradlew mingw llvm
```

This step only needs to be done once (or until MinGW or LLVM components/requirements are changed).

### Building Multi-OS Engine Core

The `moe/moe-core` repo contains the runtime (and some compile time) components of MOE. To build the frameworks and build tools, execute the following:

```sh
cd <repo>/moe/moe-core
./gradlew build
```

### Building Multi-OS Engine Tools

The `moe/tools` repositories contain the tools required to build and run MOE applications.

[SDK Publisher](https://github.com/multi-os-engine/moe-sdk-publisher): creating a developer SDK:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-sdk:devsdk
```

[Gradle Plugin](https://github.com/multi-os-engine/moe-plugin-gradle): building and publishing the Gradle plugin to Maven local:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:publishToMavenLocal
```

[Maven Plugin](https://github.com/multi-os-engine/moe-plugin-maven): building and publishing the Maven plugin to Maven local:

```sh
cd <repo>/moe/tools/moe.plugin.maven
mvn clean install
```

[IDEA Plugin](https://github.com/multi-os-engine/moe-ide-integration): building the IDEA plugin:

```sh
cd <repo>/moe/tools/master
./gradlew :moe.plugin.idea:build
```

[Eclipse Plugin](https://github.com/multi-os-engine/moe-ide-integration-eclipse): building the Eclipse plugin:

```sh
cd <repo>/moe/tools/moe.plugin.eclipse
mvn clean install -DBUILD_NUMBER=1
```
