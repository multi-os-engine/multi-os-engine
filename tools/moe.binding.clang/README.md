# Multi-OS Engine Bindings for Clang

This library contains bindings for [clang](https://github.com/multi-os-engine/clang).

## Updating Bindings

This step requires you to check out the complete Multi-OS Engine repository and for safest operation, have a local built SDK.

You can find more info on checking out and building the repository [here](https://github.com/multi-os-engine/multi-os-engine).

If the above preparations are done, you can open Terminal and run:

```bash
cd <repo>/moe/tools/moe.sdk.publisher/build/dev-sdk/tools/
java -cp <repo>/moe/tools/moe.generator.natjgen/build/libs/moe.generator.natjgen.jar \
    org.moe.natjgen.Main \
    <repo>/moe/tools \
    moe.binding.clang \
    <repo>/moe/tools/moe.binding.clang/binding.natjgen
```

Before commiting changes, it is recommended that code formatting is applied. This project uses the same formatting rules/options as [moe-core's iOS bindings](https://github.com/multi-os-engine/moe-core/blob/master/moe.apple/moe.platform.ios/UPDATE_IOS_BINDING.md).

# Update std Headers
After updating clang, replace all files in `./src/main/resources/org/clang/util`
with the latest versions from `${repo_root}/prebuilts/llvm/macos/lib/clang/${clang_version}/include`,
then run the `update_std_headers.py` to update the header list.
