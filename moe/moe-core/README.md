# Multi-OS Engine Core

This repository contains:

- Binding code for iOS
- Projects to compile Android projects for iOS and macOS
- Build scripts to compile the MOE.framework and dex2oat executables

## Building

Building the release version of dex2oat and the frameworks is simple:

```sh
./gradlew build
```

## Limiting the Build

Even with high-end hardware building will take up a lot of time, so for development you might want to build for specific configurations or platforms.

We provide a few properties to control the build:

- `moe.buildfilter.ios.config`: sets the configuration for the iOS framework. Possible values: `Release` (default), `Debug`.
- `moe.buildfilter.ios.sdk`: sets the target SDK for the iOS framework. By default the iOS framework is built for devices and simulators, but with this property you can limit it to one. Possible values:
  - `iphoneos`: iOS devices
  - `iphonesimulator`: iOS simulators
- `moe.buildfilter.ios.archs`: set the target architectures for the iOS framework. By default the iOS framework build for all architectures of the SDKs, but you can limit this with this property. This property requires `moe.buildfilter.ios.sdk` to be specified. Possible values:
  - `armv7`, `arm64` for `iphoneos`
  - `i386`, `x86_64` for `iphonesimulator`
- `moe.buildfilter.macos.config`: set the configuration for the dex2oat executable. Possible values: `Release` (default), `Debug`.

For example, if you only want to build a debug framework for 64-bit iOS devices, then you would pass:

```sh
./gradlew build -Pmoe.buildfilter.ios.config=Debug \
                -Pmoe.buildfilter.ios.sdk=iphoneos \
                -Pmoe.buildfilter.ios.archs=arm64
```

This will build everything you need to use MOE. If you only need to build the framework and nothing else, then you can use the task specific build:

```sh
./gradlew :moe.apple:moe.core.native:moe.sdk:build
```

And if you only want to build dex2oat:

```sh
./gradlew :moe.apple:moe.core.native:android.art.dex2oat:build
```

Both of these tasks will accept the buildfilters mentioned above.
