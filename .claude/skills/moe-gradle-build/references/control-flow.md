# MOE Build System — Control Flow, Dependency Threads & Cross-Build Bridges

## Composite Build Graph

Five Gradle builds compose into one graph via `includeBuild`:

```
root ────▶ tools ────▶ natj ────▶ build-tools
                  │         └────▶ prebuilts ──▶ build-tools
                  ├────▶ moe-core ──▶ build-tools
                  │            └────▶ natj (shared)
                  ├────▶ prebuilts (shared)
                  └────▶ external/javapymobiledevice3
```

When Gradle resolves a build, `includeBuild` entries are deduplicated — so `build-tools` is only configured once even though it appears as a transitive include from three paths.

## Cross-Build Bridge Tasks

Gradle composite builds cannot directly depend on tasks in other builds. Instead, bridge tasks are created that use `gradle.includedBuild("name").task(":path")`. These are defined in two places:

### tools/build.gradle bridges

| Bridge Task | Delegates To | Purpose |
|---|---|---|
| `prebuild_libffi_ios` | `prebuilts → :external/libffi:prebuild_ios` | libffi iOS |
| `prebuild_libffi_macos` | `prebuilts → :external/libffi:prebuild_macos` | libffi macOS |
| `prebuild_libffi_windows` | `prebuilts → :external/libffi:prebuild_windows` | libffi Windows |
| `ext_natj_ios` | `natj → :natj-ios:build` | NatJ iOS native |
| `ext_natj_mac` | `natj → :natj-mac:build` | NatJ macOS native |
| `ext_natj_win` | `natj → :natj-win:build` | NatJ Windows native |
| `ext_natj_linux` | `natj → :natj-linux:build` | NatJ Linux native |
| `build_ext_moe_core` / `ext_moe_core` | `moe-core → :build` | All moe-core outputs |

**Note**: The libffi bridges in tools/build.gradle use `/` path separator (`:external/libffi:prebuild_*`) while natj/build.gradle uses `:` separator (`:external:libffi:prebuild_*`). Both appear to work but are inconsistent.

### natj/build.gradle bridges

| Bridge Task | Delegates To |
|---|---|
| `prebuild_libffi_ios` | `prebuilts → :external:libffi:prebuild_ios` |
| `prebuild_libffi_macos` | `prebuilts → :external:libffi:prebuild_macos` |
| `prebuild_libffi_windows` | `prebuilts → :external:libffi:prebuild_windows` |
| `prebuild_libffi_ndk` | `prebuilts → :external:libffi:prebuild_ndk` |
| `prebuild_libffi_linux` | `prebuilts → :external:libffi:prebuild_linux` |

### moe-core/build.gradle bridges

| Bridge Task | Delegates To |
|---|---|
| `ext_natj_ios` | `natj → :natj-ios:build` |
| `ext_natj_mac` | `natj → :natj-mac:build` |
| `ext_natj_win` | `natj → :natj-win:build` |

## Dependency Artifact Mechanism

Cross-build artifacts are NOT exchanged via Gradle dependency resolution (no `implementation "group:artifact"` across builds). Instead:

1. `tools/build.gradle` defines `ext` properties like `external.natj.root`, `external.moe_core.out.moe_ios_jar`, `external.llvm.macos` that point at hardcoded file paths inside sibling builds
2. Subprojects reference these paths: `rootProject.external.moe_core.out.moe_ios_jar`
3. Bridge tasks guarantee the files exist before consumption

The one exception is `org.moe:natj` — the NatJ Java API JAR is consumed as a normal Gradle dependency substitution (composite builds automatically substitute `org.moe:natj` → the `:natj` root project's JAR output). Similarly `org.multi-os-engine:moe.generator.natjgen` resolves to `:moe.generator.natjgen` in tools.

## End-to-End Build Chain: SDK Assembly

Running `./gradlew :tools:moe-sdk:devsdk`:

```
devsdk
└─ buildDeps
   ├─ :moe.binding.clang:build
   │  └─ :ext_natj_mac → natj:natj-mac:build
   │     └─ prebuild_libffi_macos → prebuilts:external:libffi:prebuild_macos
   ├─ :moe.generator.natjgen:build
   │  └─ :ext_natj_mac (shared, already resolved)
   ├─ :moe.ios.device.launcher:build
   ├─ verifyR8 → downloadR8
   ├─ :ext_moe_core → moe-core:build
   │  ├─ :moe.apple:moe.core.java:build
   │  │  └─ org.moe:natj (resolved via composite build)
   │  ├─ :moe.apple:moe.platform.ios:build
   │  │  └─ :ext_natj_ios → natj:natj-ios:build
   │  │     └─ prebuild_libffi_ios
   │  ├─ :moe.apple:moe.platform.ios.junit:build
   │  ├─ :moe.apple:moe.core.native:external.javasqlite:build (4 XcodeBuild tasks)
   │  ├─ :moe.apple:moe.core.native:svm.graal:build (4 XcodeBuild tasks)
   │  ├─ :moe.apple:moe.core.native:svm.openjdk:build
   │  │  └─ jdk_gensrc → fetch_boot_jdk
   │  │     └─ 4 XcodeBuild tasks for libjava
   │  ├─ :moe.apple:moe.core.native:svm.jdwp:build
   │  │  └─ build_jdwp_jar
   │  │     ├─ build_jdwp_arm64_jar → graalDistTask
   │  │     └─ build_jdwp_x86_64_jar → graalDistTask
   │  │        └─ build_graal_dist → fetch_boot_jdk
   │  │  └─ 4 XcodeBuild tasks for svmjdwp (depend on svm.graal + svm.openjdk)
   │  └─ :moe.apple:moe.core.native:moe.sdk:build
   │     └─ 4 XcodeBuild tasks for sdk (depend on javasqlite + svm.graal + svm.openjdk + ext_natj_ios)
   └─ :ext_natj_mac (shared)

devsdk copies SDK to build/dev-sdk/:
  sdk/       → moe-core.jar, moe-ios.jar, moe-ios-junit.jar (+ sources + javadoc)
  sdk/iphoneos/     → libmoe.a, svmjdwp.framework, include/
  sdk/iphonesimulator/ → same for simulator
  tools/     → ios-device.jar, wrapnatjgen.jar, r8.jar, gradlew.zip, proguard configs
  tools/macosx/ → libclang.dylib, libnatj.dylib
```

## Bootstrap Prerequisites

These must be built once before the main SDK build:

| Command | What it produces | When to rebuild |
|---|---|---|
| `./gradlew :prebuilts:llvm` | `prebuilts/llvm/macos/lib/libclang.dylib` | LLVM source update |
| `./gradlew :prebuilts:mingw` | `prebuilts/mingw/` (full x86_64 mingw cross-compiler) | GCC/MinGW version bump |
| `./gradlew :tools:moe.tools.substrate:runQueryCode` | `tools/moe.tools.substrate/src/main/resources/cap_{arm64,x86_64}/*.cap` | GraalVM version bump |

These are committed or cached — they don't rebuild on every SDK assembly.

## Platform Build Matrix

### NatJ native libraries

| Subproject | Build Tool | Platforms | Outputs |
|---|---|---|---|
| `natj-ios` | XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `libnatj.a` |
| `natj-mac` | XcodeBuild | macosx × Debug, Release | `libnatj.dylib` |
| `natj-win` | premake5+make/mingw | Win64 × Debug, Release | `natj.dll` | **DORMANT** |
| `natj-ndk` | ndk-build | 6 arches × Debug, Release | `libnatj.so` | **DORMANT** |
| `natj-linux` | shell script | Release, Debug | `libnatj.so` | **DORMANT** |

### moe-core native libraries

| Subproject | Build Tool | Platforms | Outputs |
|---|---|---|---|
| `external.javasqlite` | XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `javasqlite.a` |
| `svm.graal` | XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `libjvm.a` |
| `svm.openjdk` | Script + XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `libjava.a` |
| `svm.jdwp` | Script + XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `svmjdwp.framework` |
| `moe.sdk` | XcodeBuild | iphoneos, iphonesimulator × Debug, Release | `libmoe.a` + headers |

### libffi prebuilts

| Task | Target | Build Method |
|---|---|---|
| `prebuild_ios` | iOS (arm64) | Ramdisk + bash script |
| `prebuild_macos` | macOS (universal) | Ramdisk + bash script |
| `prebuild_windows` | Windows (x86_64, via mingw) | Ramdisk + bash script |
| `prebuild_linux` | Linux (x86_64, via cross-compiler) | Ramdisk + bash script |
| `prebuild_ndk` | Android (multiple arches) | Ramdisk + bash script |

## XcodeBuild Cross-Project Dependencies

`XcodeBuild.createTask()` accepts a `deps` map with a `"projects"` key containing cross-project dependency paths. The format is:

```groovy
[projects: [':moe.apple:moe.core.native:svm.graal@libjvm']]
```

The `@target` suffix lets you specify a different xcodebuild target name than the last segment of the project path. Without `@`, the target is derived from the last `.`-separated segment. These resolve to task names like `build_libjvm_ios_iphoneos_release` on the referenced project.

## File-Level Cross-References (not Gradle deps)

Some artifacts are consumed by file path without formal Gradle task dependency:

1. `svm.jdwp` reads CAP cache from `tools/moe.tools.substrate/src/main/resources/cap_{arch}/`
2. `tools/build.gradle` reads `prebuilts/llvm/macos/lib/libclang.dylib` existence at configuration time
3. `moe.platform.ios` reads `rootProject.external.llvm.jnipath` and `rootProject.external.natj.jnipath` for `java.library.path`
4. SDK publisher reads all `external.moe_core.out.*` file paths to collect JARs and native libs

## Gradle Properties Affecting Build

| Property | Effect |
|---|---|
| `moe.verbose` | Tees build-tools task output to stdout |
| `moe.dontunmount` | Leaves ramdisk mounted after Prebuild (for debugging) |
| `moe.use.addresssanitizer` | Enables ASan in XcodeBuild and test tasks |
| `moe.moe_core.sdk.debug` | Switches ext.moe_core.out paths to Debug configuration |
| `moe.tools.sdk.exclude_mac` | **LEGACY — should be removed.** Skips macOS native dependencies in SDK |
| `moe.tools.sdk.win_only` | **LEGACY — should be removed.** Skips natj-mac dep in natjgen |
| `moe.buildfilter.ios.config` | Limits iOS builds to one config (Release or Debug) |
| `moe.buildfilter.ios.sdk` | Limits iOS builds to one SDK |
| `moe.buildfilter.ios.archs` | Limits iOS builds to specified architectures |
| `moe.buildfilter.macos.config` | Limits macOS builds to one config |
