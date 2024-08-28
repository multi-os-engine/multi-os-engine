# Multi-OS Engine Bindings for libimobiledevice

This library contains bindings for [libimobiledevice](https://github.com/multi-os-engine/libimobiledevice) and [libplist](https://github.com/multi-os-engine/libplist).

## Updating Bindings

This step requires you to check out the complete Multi-OS Engine repository and for safest operation, have a local built SDK.

You can find more info on checking out and building the repository [here](https://github.com/multi-os-engine/multi-os-engine).

If the above preparations are done, you can open Terminal and run:

```bash
cd <repo>/moe/tools/moe.sdk.publisher/build/dev-sdk/tools/
java -cp <repo>/moe/tools/moe.generator.natjgen/build/libs/moe.generator.natjgen.jar \
    org.moe.natjgen.Main \
    <repo>/moe/tools \
    moe.binding.libimobiledevice \
    <repo>/moe/tools/moe.binding.libimobiledevice/binding.natjgen
```

Before commiting changes, it is recommended that code formatting is applied. This project uses the same formatting rules/options as [moe-core's iOS bindings](https://github.com/multi-os-engine/moe-core/blob/master/moe.apple/moe.platform.ios/UPDATE_IOS_BINDING.md).
