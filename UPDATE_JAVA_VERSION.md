This guide describes the steps required to update the underlying native-image version.  

### Upgrading labsjdk
1. Every major java release has multiple minor releases. Find out the specific latest one for the most recent graalvm build (like `25.0.1+8`)
2. Go into the labsjdk project (under `../svm/labs-openjdk`) and find the tag specific to the found java version (like `jvmci-25.1-b08`).
3. Create a new branch like `moe-svm-25.1-b08` for this specific tag.
4. Apply the following patches:
   - `moe-core/moe.apple/moe.core.native/svm.openjdk/add_ios_build_support.patch`
5. Change the [manifest](https://github.com/multi-os-engine/manifest) to match this new branch.
6. Pull the latest upstream changes into `https://github.com/multi-os-engine/mx` `moe-svm` branch. No special care needs to be given.
7. Go to `moe-core/moe.apple/moe.core.native/svm.openjdk/build.gradle` and adjust the references to your target jdk. Make sure to also adjust the `JVMCI_VERSION` variable. Also make sure to correctly change the `fetch_boot_jdk` task.
8. Run `./gradlew :moe-core:moe.apple:moe.core.native:svm.openjdk:jdk_gensrc` and see how far you get. You might have to adjust/remove patches.
9. Now open the xcode project `moe-core/moe.apple/moe.core.native/svm.openjdk/svm.openjdk.xcodeproj`
10. Check for any outdated references (marked in red) and delete them
11. Go at project folder view Right-Click -> "Add files to 'svm.openjdk'" and go through all already existing folders, and add missing files (they are highlighted)
    - Make sure to add everything in the right sub-folder
    - Make sure to only add references, no copies
    - Don't add `java.base/unix/native/libnet/DefaultProxySelector.c`, it is already implemented in `java.base/macosx/native/libnet/DefaultProxySelector.c`
    - Missing JRE symbols at link time of the final application is probably a cause of an oversight here.
    - It is possible, that a java release adds a whole new sub-folder. You will notice when getting link-time errors. Only add new folders lazily.
12. Update the following variables in the `Build Phases` tab:
    - `ProcessImpl_md.c` needs `-DVERSION_STRING` adjusted
    - `System.c` needs `-DVERSION_SPECIFICATION` adjusted
13. Try to build the project
14. Once it builds, this step is done!

### Upgrading graal
1. Find the relevant tag for the targeted graalvm release (like `vm-25.0.1`)
2. Checkout a new branch with the tag (like `moe-svm-25.0.1`)
3. Apply the following patches:
    - `moe-core/moe.apple/moe.core.native/svm.graal/fix_undefined_symbol__clear_cache_apple_clang.patch`
4. Change the [manifest](https://github.com/multi-os-engine/manifest) to match this new branch.
5. Generate new JVM Fallback functions:
   - Go to `../svm/graal/substratevm/`
   - Run `../../mx --java-home moe/moe-core/moe.apple/moe.core.native/svm.openjdk/build/bootJDK/jdk25/Contents/Home build --projects svm-jvmfuncs-fallback-builder`
   - Copy the file `mxbuild/jdk25/svm-jvmfuncs-fallback-builder/gensrc/JvmFuncsFallbacks.c` to `moe-core/moe.apple/moe.core.native/svm.graal/src/main/native/JvmFuncsFallbacks.c`
6. Now open the XCode project `moe-core/moe.apple/moe.core.native/svm.graal/svm.graal.xcodeproj` and check if everything compiles
7. If yes, this step is done!

### Update CAP Cache
1. Adjust the `graalvmVersion` in `tools/moe.tools.substrate/build.gradle` and adjust the checksums
2. Run the `./gradlew :tools:moe.tools.substrate:runQueryCode` task. The new files will be generated into `tools/moe.tools.substrate/src/main/resources`
3. If new files got added/removed, add/remove them to/from the list in `tools/moe.tools.substrate/src/main/kotlin/org/moe/tools/substrate/SubstrateExecutor#CAP_CACHES` 

### Other adjustments
- Adjust the compatibility matrix in `tools/moe.tools.substrate/src/main/kotlin/org/moe/tools/substrate/GraalVM.kt`. Note, that there can be breaking changes in regard to linking in one major release.


### Troubleshoot
- Missing `JVM_` symbols probably means not properly generated `JvmFuncsFallbacks.c`
- Missing `svm_` symbols probably means, new files need to be added to `moe-core/moe.apple/moe.core.native/svm.graal/svm.graal.xcodeproj`.
  - Make sure to only add references, no copies
- Other missing symbols probably mean new files to be added to `moe-core/moe.apple/moe.core.native/svm.openjdk/svm.openjdk.xcodeproj`
  - Make sure to only add references, no copies