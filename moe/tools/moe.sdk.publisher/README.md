# Multi-OS Engine SDK Publisher

This project creates a publishable SDK.

## Creating A Developer SDK

For development we recommend packing SDKs with the following method:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-sdk:devsdk
```

This will create the SDK structure under the `build` directory, which can be used with the [Gradle plugin](https://github.com/multi-os-engine/moe-plugin-gradle).

This task requires the `moe-core` project to be built.

### Packing Debug dex2oat and/or Frameworks

During development, you might want to pack debug versions of dex2oat and MOE.framework. To do this we provide two parameters:

- `moe.moe_core.dex2oat.debug`: pack the debug build of dex2oat instead of the release build.
- `moe.moe_core.sdk.debug`: pack the debug build of the frameworks instead of the release build.

For example, if you want to use a release dex2oat with debug frameworks:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-sdk:devsdk -Pmoe.moe_core.sdk.debug
```

This requires debug builds of the frameworks, for more information on how to create them, [visit here](https://github.com/multi-os-engine/moe-core).

## Notes

Custom SDKs require a customized [Gradle plugin](https://github.com/multi-os-engine/moe-plugin-gradle).
