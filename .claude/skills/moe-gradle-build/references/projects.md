# MOE Build System — Per-Project Reference

## Root: moe/

| File | Content |
|---|---|
| `settings.gradle` | `includeBuild "tools"` — single entry; the root is a shell |
| `build.gradle` | Empty — no tasks, no plugins |
| `gradle.properties` | `org.gradle.jvmargs=-Xmx2G`, `org.gradle.caching=true`, `org.gradle.configuration-cache=true`, `org.gradle.configuration-cache.problems=warn` |

The root exists solely to bootstrap `tools/` as a composite build. All user-facing Gradle commands target tasks inside `tools/` (e.g. `./gradlew :tools:moe-sdk:devsdk`).

---

## build-tools/

**Role**: Gradle plugin providing shared task types for native compilation.
**Plugin ID**: `org.moe.buildtools`
**settings.gradle**: standalone (empty)

| File | Content |
|---|---|
| `build.gradle` | `java-gradle-plugin`, registers plugin `org.moe.buildtools` → `BuildTools.java` |
| `src/main/java/org/moe/prebuilts/` | `BuildTools.java` (plugin), `BaseTask.java`, `Prebuild.java`, `Script.java`, `XcodeBuild.java`, `XcodeBuildLockService.java`, `NonClosingFileOutputStream.java`, `SplitOutputStream.java` |

Consumed via `includeBuild` by prebuilts, natj, and moe-core. See `references/build-tools-plugin.md` for full API.

---

## prebuilts/

**Role**: Bootstrap toolchains and build third-party native libraries.
**settings.gradle**: `includeBuild("../build-tools")`, `include ':external:libffi'`

### prebuilts/build.gradle
- Applies `org.moe.buildtools` and `idea`
- Defines `ext.isAppleSilicon` from `os.arch` system property
- `brewPath(suffix)`: resolves `/opt/homebrew/` vs `/usr/local/` based on arch
- `prebuildAll` / `cleanAll` umbrella tasks

#### linuxCrosscompiler (Script) — DORMANT
Downloads prebuilt `x86_64-unknown-linux-gnu` cross-toolchain from GitHub releases (arch-specific).
Outputs to `build/linux-crosscompiler`. Only needed for dormant Linux builds.

#### mingw (Script) — DORMANT
Builds a full MinGW-w64 cross-compiler targeting `x86_64-w64-mingw32`. Only needed for dormant Windows builds.
1. Checks brew deps: gmp, mpfr, libmpc, cloog, isl
2. Builds `binutils-2.33.1`
3. Builds `mingw-w64-v7.0.0` headers
4. Builds `gcc-13.2.0` (with 3 patches: xcode15 fix, libc fix, tzdb disable)
5. Builds mingw-w64 CRT
6. Completes gcc
7. Builds winpthreads

All built into `prebuilts/mingw/` directory.

#### llvm (Script)
CMake-builds libclang from `external/llvm/llvm`:
- MinSizeRel, Universal (arm64;x86_64), targets AArch64;ARM;X86
- `LLVM_ENABLE_PROJECTS=clang`, `LLVM_ENABLE_ZSTD=OFF`
- Installs to `prebuilts/llvm/macos/`
- Produces `llvm/macos/lib/libclang.dylib` + headers

#### mingwPresence / llvmPresence
Sanity-check tasks that throw if `mingw/` or `llvm/` directory is missing.

### prebuilts/external/build.gradle
Empty `prebuild`/`clean` stubs (lifecycle parent for `:external:libffi`).

### prebuilts/external/libffi/build.gradle
Five `Prebuild` tasks for each platform variant:

| Task | Target | Ramdisk | Build Script | Dependencies |
|---|---|---|---|---|
| `prebuild_ios` | ios | 128 MB | `moe-prebuild-ios.sh` | — |
| `prebuild_macos` | macos | 128 MB | `moe-prebuild-macos.sh` | — |
| `prebuild_windows` | windows | 128 MB | `moe-prebuild-windows.sh` | `:mingwPresence` |
| `prebuild_linux` | linux | 128 MB | `moe-prebuild-linux.sh` | `:linuxCrosscompiler` |
| `prebuild_ndk` | ndk | 256 MB | `moe-prebuild-ndk.sh` | — |

Each task rsyncs `external/libffi` to ramdisk, copies patches/scripts via `preBuildCopySpec`, runs build script. All roll up into `prebuild` umbrella task → `prebuildAll` at root.

---

## natj/

**Role**: NatJ (Native-Java) binding runtime — Java API JAR + native libraries for 5 platforms.
**settings.gradle**: `includeBuild("../build-tools")`, `includeBuild("../prebuilts")`, includes 10 subprojects.

### natj/build.gradle (root)
- Applies `org.moe.buildtools`, `maven-publish`, `java`
- Java 1.8 source/target
- Creates `prebuild_libffi_*` bridge tasks delegating to `prebuilts:external:libffi:prebuild_*`
- Root `build` depends on natj-ios, natj-mac, natj-win builds
- Root `test` depends on natj-mac TestClasses_Release build; loads native lib via `java.library.path`; optional AddressSanitizer support
- Publishes as `org.moe:natj-api` (MavenPublication with sources JAR)
- `buildAll` includes all platform builds

### natj-ios/build.gradle
- Applies `org.moe.buildtools`, `maven-publish`
- Uses `XcodeBuild` task type (registered via `tasks.register`)
- 4 builds: Release/Debug × iphoneos/iphonesimulator
- Each depends on `:prebuild_libffi_ios`; inputs include root `src/` and xcodeproj
- Produces `libnatj.a` static libraries
- Published as `natj-ios` with per-SDK classifiers

### natj-mac/build.gradle
- Same pattern as natj-ios but for macOS
- Builds `natj` target → `libnatj.dylib` (Release/Debug)
- Also builds test targets: `TestClasses`, `TestClassesC`, `TestClassesCxx`, `TestClassesObjC`
- Each depends on `:prebuild_libffi_macos`
- Published as `natj-mac`

### natj-win/build.gradle
- **DORMANT** — kept for completeness but not actively maintained or required for iOS SDK builds
- Uses `premake5` → `make` (not XcodeBuild)
- Cross-compiles with MinGW (`x86_64-w64-mingw32-g++`)
- `premake` task: generates Makefiles from `premake5.lua`; env `MOE_PREBUILTS` points to prebuilts dir
- Builds `NatJStatic` → `NatJ` → `TestClassesCxx` → `TestClassesC` for Debug/Release × Win64
- Win32 support commented out
- PATH includes `prebuilts/mingw/bin`
- Publishes `natj.dll` artifacts

### natj-ndk/build.gradle
- **DORMANT** — kept for completeness but not actively maintained or required for iOS SDK builds
- Applies `base`, `maven-publish`
- Requires `NDK_PATH` environment variable
- Runs `ndk-build` for Release and Debug
- Architectures: arm64-v8a, armeabi-v7a, mips, mips64, x86, x86_64
- Produces `libnatj.so` + `libc++_shared.so` per arch/config
- Depends on `:prebuild_libffi_ndk`

### natj-linux/build.gradle
- **DORMANT** — kept for completeness but not actively maintained or required for iOS SDK builds
- Runs `build_linux.sh` script
- Depends on `:prebuild_libffi_linux`
- Produces `libnatj.so` for Release/Debug

### natj-processor/build.gradle
- Java 1.8; fat JAR with `Main-Class: org.moe.natj.processor.Main`
- Dependencies: commons-cli, ASM 5.1 (file dep), commons-io
- Post-processes NatJ bytecode for C++ binding stubs

### natj-ctests/build.gradle
- JUnit tests for C bindings
- Tests depend on `natj-mac:build_TestClassesC_Release_macosx`
- `ansibleTestWin`: packages test bundle → runs on Windows via `ansible-playbook`

### natj-objctests/build.gradle
- JUnit tests for Objective-C bindings
- Tests depend on `natj-mac:build_TestClassesObjC_Release_macosx`

### natj-cxxtests/build.gradle
- JUnit tests for C++ bindings
- `processCxxTests` (JavaExec): runs natj-processor to generate C++ stubs from compiled test classes; outputs processed classes + generated `.cpp`/`.hpp`
- xcodebuild and premake tasks depend on `processCxxTests`
- Test class dirs use `processCxxTests.outputs.files`
- `ansibleTestWin`: similar to ctests

### natj-cxxtests/dyntype/build.gradle
- Java 1.8; depends on `:natj-processor`
- Provides test type resolver for C++ dynamic type resolution

### natj-api/
- Contains only tooling configs (`checkstyle.xml`, `android-formatting.xml`)
- No build.gradle — the root project IS the natj-api module

---

## moe-core/

**Role**: iOS platform — Java bindings, native runtime (libmoe.a), SVM/GraalVM integration.
**settings.gradle**: foojay-resolver-convention; `includeBuild("../build-tools")`, `includeBuild("../natj")`. Includes moe.apple hierarchy (8 subprojects).

### moe-core/build.gradle (root)
- Applies `org.moe.buildtools`, `base`; version `2.0.0-SNAPSHOT`
- Sets `external.svm.{root,mx,graal,openjdk}` pointing at `../../svm/`
- Creates `ext_natj_*` bridge tasks for ios/mac/win
- Iterates all subprojects to attach their `build` tasks to root `build`
- `check` task verifies brew/system tool presence (autogen, autoconf, automake, libtool, pkg-config, wget, cloog, cmake, gpg, ant, premake5) via Script-based `check_exec_*` tasks

### moe.apple/build.gradle
Applies `base` only. Lifecycle parent.

### moe.apple/moe.core.java/build.gradle
- Java 1.8 target, JDK 21 toolchain
- Sources include `../../external/javasqlite/src/main/java`
- Implementation dep: `org.moe:natj`; compileOnly: `org.graalvm.nativeimage:svm:23.0.7`
- Tests excluded entirely
- Produces `moe-core.jar` (with LICENSE/NOTICE/eula) at `build/libs/core/`
- Also produces sources and javadoc JARs

### moe.apple/moe.platform.ios/build.gradle
- Java 1.8; spotless plugin for Eclipse-style formatting of generated bindings
- `classes` depends on `:ext_natj_ios`
- `natJGen` configuration pulls `org.multi-os-engine:moe.generator.natjgen`
- `generateBindings` (JavaExec): runs NatJGen with platform.natjgen config; uses `java.library.path` for llvm + natj native libs
- `removeOutdatedBindings` / `applyManualBindingFixes`: post-processing scripts
- Produces `moe-ios.jar` (fat jar bundling natj runtime)
- Also produces javadoc + sources JARs

### moe.apple/moe.platform.ios.junit/build.gradle
- Java 1.8; depends on junit 4.12, natj, moe.platform.ios
- `included` configuration bundles junit into the JAR
- Produces `moe-ios-junit.jar`

### moe.apple/moe.core.native/build.gradle
This is the native build orchestrator.

#### Boot JDK Management
- `fetch_boot_jdk` (Script): invokes `mx fetch-jdk` to download `labsjdk-ce-latest ce-25.0.1+8-jvmci-b01`
- Stored at `build/bootJDK/jdk25/Contents/Home`

#### GraalVM Distribution
- `build_graal_dist` (Script): rsyncs `../../svm/graal` to work dir, runs `mx --env ce build`, rsyncs `graalvm-home` output to `build/graalDist`

#### Build Filters
Subprojects inherit `buildfilter.ios.{config,sdk,archs}` and `buildfilter.macos.config` from `-P` properties. These narrow the platform matrix during development.

### moe.apple/moe.core.native/external.javasqlite/build.gradle
4 `XcodeBuild.createTask` calls — `javasqlite` × iphoneos/iphonesimulator × Debug/Release. Respects `buildfilter.ios.archs`.

### moe.apple/moe.core.native/svm.graal/build.gradle
4 `XcodeBuild.createTask` calls — `libjvm` × iphoneos/iphonesimulator × Debug/Release.

### moe.apple/moe.core.native/svm.openjdk/build.gradle
- `jdk_gensrc` (Script): rsyncs labs-openjdk sources, applies 2 patches (`add_ios_build_support.patch`, `fix_memset_call.patch`), configures with `--with-conf-name=labsjdk --with-version-opt=jvmci-25.0.1-b01`, runs `make CONF_NAME=labsjdk graal-builder-image`
- 4 `XcodeBuild.createTask` for `libjava`, each dependsOn `jdk_gensrc`

### moe.apple/moe.core.native/svm.jdwp/build.gradle
- Creates `build_jdwp_${arch}_jar` Script tasks (arm64, x86_64)
  - Depends on `graalDistTask` (build_graal_dist)
  - Runs `native-image` from graalDist with `--shared`, `-H:+SharedLibrary`, `-H:CAPCacheDir=${cap_<arch>}` (from `tools/moe.tools.substrate/src/main/resources/`)
  - Copies resulting `svmjdwp.o` → `build/jdwpBuild/svmjdwp_<arch>.o`
- `build_jdwp_jar` umbrella task
- 4 `XcodeBuild.createTask` for `svmjdwp` framework, with `graalDeps` (svm.graal@libjvm + svm.openjdk@libjava), each dependsOn build_jdwp_jar
- Root `build` uses buildfilter to select configs/sdks

### moe.apple/moe.core.native/moe.sdk/build.gradle
- 4 `XcodeBuild.createTask` for `sdk` target
- `graalDeps`: javasqlite + svm.graal@libjvm + svm.openjdk@libjava
- Each depends on `:ext_natj_ios`
- Passes `GRADLE_BUILD_VERSION` via `cond_buildopt`
- Produces `libmoe.a` + headers + `svmjdwp.framework` per sdk/config

---

## tools/

**Role**: Primary Gradle project umbrella. Contains IDE plugins, SDK publisher, NatJGen, device launcher, and supporting libraries.
**settings.gradle**: includes ~15 subprojects; includeBuild natj, moe-core, prebuilts, javapymobiledevice3. Renames `:moe.plugin.gradle` → `moe-gradle`, `:moe.sdk.publisher` → `moe-sdk`.

### tools/build.gradle (root)
- Kotlin JVM 2.2.0 plugin loaded (not applied — for subprojects)
- `allprojects` group `org.multi-os-engine`, repositories mavenCentral
- Defines bridge tasks for all cross-build deps (see SKILL.md)
- Sets `external.prebuilts`, `external.natj.*`, `external.moe_core.out.*`, `external.llvm.*`

### moe.tools.common/build.gradle
- Kotlin + Java 1.8; slf4j, commons-io, dd-plist, gson
- Has `testCommon` source set at `src/test-common/java`
- Base utility library used by most tools subprojects

### moe.document.pbxproj/build.gradle
- Java 1.8; commons-codec
- Xcode `.pbxproj` file parser/writer
- Copies test resources pre-test

### moe.document.xib/build.gradle
- **DEAD PROJECT** — not included in tools/settings.gradle, not part of any build graph
- Java 1.6 source/target, uses removed `testCompile` configuration
- `.xib` file document model — kept in tree but unused

### moe.binding.clang/build.gradle
- Java 1.8; depends on `org.moe:natj`
- `classes` depends on `:ext_natj_mac` (needs libnatj.dylib at compile time); gated by `moe.tools.sdk.exclude_mac` (legacy flag, should be removed)
- Tests use `java.library.path` for llvm + natj native libs
- Java bindings for libclang C API

### moe.tools.natjgen/build.gradle
- Java 1.8; depends on tools.common, pbxproj, gson, slf4j, commons-io
- Tests run `pod install` in test resources (`installTestPod`)
- Lower-level NatJGen engine (no libclang dependency — that's in binding.clang)

### moe.generator.natjgen/build.gradle
- Java 1.8; fat jar with `Main-Class: org.moe.natjgen.Main`
- Depends on tools.common, binding.clang, tools.natjgen, natj
- Heavy Eclipse JDT deps for Java source formatting
- `classes` depends on `:ext_natj_mac`; gated by `moe.tools.sdk.win_only` (legacy flag, should be removed)
- Tests use `java.library.path` for llvm + natj

### moe.generator.project/build.gradle
- Java 1.8; `evaluationDependsOn ':moe.tools.common'`
- Depends on pbxproj, tools.common, gson
- Xcode project generation

### moe.protocol.gdbremote/build.gradle
- Java 1.8; slf4j
- GDB Remote protocol implementation (for iOS device debugging)

### moe.ios.device.launcher/build.gradle
- Java **11**; fat jar with `Main-Class: org.moe.ios.device.launcher.Main`
- Depends on javapymobiledevice3, jnigen-commons 3.1.1, tools.common, protocol.gdbremote
- iOS device deployment and debug launcher

### moe.plugin.common/build.gradle
- Java 1.8; depends on generator.project, tools.common, pbxproj
- Shared plugin infrastructure between Gradle and IDEA plugins

### moe.plugin.gradle/build.gradle (renamed moe-gradle)
- Kotlin + Java 1.8
- Reads version from `src/main/resources/org/moe/gradle/moe.properties` (`MOE-Plugin-Version`)
- `included` configuration bundles tools.common, pbxproj, generator.project, tools.substrate, tools.classvalidator into the JAR (via `included_no_transitive` config)
- Resolves transitive deps of `included` and adds them as `implementation` (for POM generation)
- `createClasspathManifest` task writes classpath for integration tests
- Tests depend on `:moe-sdk:devsdk` (needs fully-assembled SDK)
- Publishes to Maven Central (staging/snapshot); optional GPG signing
- This is the Gradle plugin applied by MOE app projects

### moe.plugin.idea/build.gradle
- IntelliJ Platform plugin 2.14.0; Java 17 toolchain; Kotlin
- IDE: IntelliJ Community 2023.3.8 with gradle + java bundled plugins
- Depends on tools.common, pbxproj, generator.project, tools.natjgen, plugin.common, javapymobiledevice3
- sinceBuild 233, no untilBuild
- Publishes plugin `.zip` via maven-publish

### moe.tools.classvalidator/build.gradle
- Kotlin + Java 1.8; ASM 9.8 + gson
- Depends on tools.common
- Validates class files for MOE compatibility and injects annotations/code required by the MOE runtime

### moe.tools.substrate/build.gradle
- Kotlin + Java 1.8; `de.undercouch.download` plugin
- Downloads GraalVM CE 25.0.1 for both arm64 and x86_64 (SHA-256 verified)
- Extracts, removes quarantine, generates dummy class
- `generateQueryCode*` runs native-image with `-H:+ExitAfterQueryCodeGeneration` and `-H:+JDWP`
- `runQueryCode*` compiles generated C source with clang, runs it, captures `.cap` output to `src/main/resources/cap_{arm64,x86_64}/`
- These `.cap` files are consumed by `moe-core:svm.jdwp` build (file-path reference, not a Gradle dependency)

### moe.sdk.publisher/build.gradle (renamed moe-sdk)
- `de.undercouch.download` plugin; `base`, `maven-publish`, `signing`
- Downloads and verifies R8 8.13.17 (SHA-256) to `build/r8/r8lib.jar`
- `buildDeps` depends on binding.clang, generator.natjgen, ios.device.launcher builds + `verifyR8` + `:ext_moe_core` + `:ext_natj_mac`
- `getSDKCopySpec()` assembles:
  - `sdk/`: moe-core.jar, moe-ios.jar, moe-ios-junit.jar (with javadoc + sources)
  - `sdk/iphoneos/`: libmoe.a, svmjdwp.framework, include/ (jni.h + MOE headers)
  - `sdk/iphonesimulator/`: same layout for simulator
  - `tools/`: ios-device.jar, wrapnatjgen.jar, r8.jar, gradlew.zip, proguard/jni/reflection configs
  - `tools/macosx/`: libclang.dylib, libnatj.dylib (unless exclude_mac)
- `sdk` task (Zip): produces SDK archive
- `devsdk` task (Copy): unpacks to `build/dev-sdk/` for local development
- Publishes to Maven Central
