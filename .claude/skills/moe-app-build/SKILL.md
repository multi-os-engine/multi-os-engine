---
name: moe-app-build
description: User-side `moe.plugin.gradle` (`tools/moe.plugin.gradle/`, published as `org.multi-os-engine:moe-gradle`) — the plugin a downstream MOE app applies to compile, ClassValidate, R8, native-image, Xcode-build, IPA-package, install, launch, and debug. Plugin IDs: `moe`, `moe-sdk`. Wraps `moe.tools.substrate` (`SubstrateExecutor`/`GraalVM`/`Config`) for `native-image` invocation. TRIGGER when: editing under `tools/moe.plugin.gradle/src/main/{java,kotlin}/org/moe/gradle/`; modifying `MoePlugin`, `MoeSDKPlugin`, `MoeExtension`, `MoeSDK`, or any task in `tasks/` (`R8`, `NativeImage`, `XcodeBuild`, `XcodeProvider`, `XcodeInternal`, `IpaBuild`, `LaunchDevice`/`LaunchSimulator`, `ListDevices`/`ListSimulators`, `GenerateUIObjCInterfaces`, `NatJGen`, `UpdateXcodeSettings`, `StartupProvider`, `TestClassesProvider`, `ResourcePackager`); touching `tools/moe.tools.substrate/src/main/kotlin/`; changing remote-build-over-SSH (`Server.java`); changing `MoeExtension.proguard.level` semantics; user reports `./gradlew moeLaunch*` / `moe…IpaBuild` / `moeXcodeInternal*` failing; `-Pmoe.archs` / `-Pmoe.graalvm.home` / `-Pmoe.launcher.*` properties; GraalVM auto-provisioning failures; `xattr` quarantine errors. SKIP: building MOE itself — that's `moe-gradle-build`; pre-/post-R8 ASM passes themselves — that's `moe-classvalidator`; device-launcher CLI internals — that's `moe-ios-device`; IDE-side run-config / SDK-type wiring — that's `moe-idea-plugin`; NatJ runtime registration — that's `natj-runtime`.
---

# MOE App-Build Plugin (user-side Gradle pipeline)

`moe.plugin.gradle` (published as `org.multi-os-engine:moe-gradle`) is the Gradle plugin a MOE app project applies. Its job: take a user's Java/Kotlin sources and an Xcode project, produce a signed iOS `.app`/`.ipa`, and optionally install + launch + debug it on a device or simulator. Most tasks are thin wrappers that call into other modules (`moe.tools.classvalidator`, `moe.tools.substrate`, `moe.ios.device.launcher`); the plugin's main job is wiring + parameterization.

## Big picture: per-app build pipeline

```
compileJava ──► jar ──► ClassValidate ──► R8 ──► ReflectionCollect ──► NativeImage ──► XcodeProvider ──► XcodeBuild ──► IpaBuild
                            │             │     ResourceCollect           │              │                  │
                            │             │     StartupProvider           │              │                  │
                            │             ▼                               ▼              ▼                  ▼
                            │     post-R8 jar feeds                  main.o + llvm.o   .app             .ipa
                            │     all 4 collectors                   + jdwp.metadata
                            │                                              │
                            ▼                                              │
                  outputJars feed R8                                       │
                                                                           │
                                              symlinked into Xcode build dir
                                              + UpdateXcodeSettings rewrites .pbxproj
                                                                           │
                                                                           ▼
                                              XcodeBuild runs xcodebuild → .app
                                                                           │
                                                                           ▼
                                              LaunchDevice / LaunchSimulator
                                              (delegates to moe.ios.device.launcher jar)
```

For collectors and pre-AOT bytecode rewrites see `moe-classvalidator`. For startup-time NatJ wiring (`StartupProvider`, `preregister.txt`, `objc-bindings.txt`) see `natj-runtime`.

## Task parameterization

All major tasks are registered via `MoePlugin.registerTask(class, description, params)` with a parameter list drawn from `TaskParams.{SOURCE_SET, MODE, ARCH, PLATFORM}`. The plugin instantiates one task per combination — e.g. `NativeImage` is `(SourceSet × Mode × Arch × Platform)`, so for a typical iOS app you get `nativeImageMain*Release*Arm64*Iphoneos`, `…IphoneSimulator`, `…X86_64*…`, etc. Task names are produced by `MoePlugin.getTaskName(class, …)` and looked up by `getTaskBy(class, …)`.

| Task | Params | Source dir |
|---|---|---|
| `R8` | SOURCE_SET × MODE | `tasks/R8.java` |
| `ClassValidate` | SOURCE_SET × MODE | `tasks/ClassValidate.kt` |
| `ReflectionCollect` | SOURCE_SET × MODE | `tasks/ReflectionCollect.kt` |
| `ResourcePackager` | SOURCE_SET × MODE | `tasks/ResourcePackager.java` |
| `ResourceCollect` | SOURCE_SET × MODE | `tasks/ResourceCollect.kt` |
| `NativeImage` | SOURCE_SET × MODE × ARCH × PLATFORM | `tasks/NativeImage.kt` |
| `TestClassesProvider` | SOURCE_SET × MODE | `tasks/TestClassesProvider.java` |
| `StartupProvider` | SOURCE_SET × MODE | `tasks/StartupProvider.java` |
| `XcodeProvider` | SOURCE_SET × MODE × ARCH × PLATFORM | `tasks/XcodeProvider.java` |
| `XcodeBuild` | SOURCE_SET × MODE × PLATFORM | `tasks/XcodeBuild.java` |
| `XcodeInternal` | none, only when `XCODE_PRODUCT_BUILD_VERSION` env set | `tasks/XcodeInternal.java` |
| `IpaBuild` | none | `tasks/IpaBuild.java` |
| `GenerateUIObjCInterfaces` | MODE | `tasks/GenerateUIObjCInterfaces.java` |
| `NatJGen` | none | `tasks/NatJGen.java` (see `moe-natjgen` skill) |
| `UpdateXcodeSettings` | none | `tasks/UpdateXcodeSettings.java` |
| `LaunchDevice` / `LaunchSimulator` | SOURCE_SET | `tasks/LaunchDevice.java`, `LaunchSimulator.java` |

`-Pmoe.archs=arm64,x86_64` (read at apply-time) restricts which Arch values the plugin will instantiate.

## Native compile via SubstrateExecutor

`tasks/NativeImage.kt` builds a `Config` (from `tools/moe.tools.substrate/src/main/kotlin/.../Config.kt`) and calls `SubstrateExecutor(graalVM, config).compile()`. The executor is "could be inlined into the Gradle plugin" but is split for cleanness — it's a 1:1 wrapper around the `native-image` CLI:

- Hard-coded iOS flags: `-H:+SharedLibrary -H:PageSize=16384 -H:+ExitAfterRelocatableImageWrite -H:+IncludeAllLocales -H:+UseCAPCache -H:CAPCacheDir=...`
- Build-time init only for `org.moe.core.MOE$Build`
- Per-target system properties: `svm.targetName=iOS`, `svm.targetArch`, `svm.platform`, `moe.platform.name`, `moe.debug`
- `-H:+JDWP` only in Debug (`mode == Mode.DEBUG`); also enables `-H:+SpawnIsolates -R:ReservedAddressSpaceSize=536870912` then
- Output goes to `Config.outputDir`, which `NativeImage` then moves to deterministic file paths (`main.o`, `llvm.o`, `jdwp.metadata`)

`SubstrateExecutor.compile()` returns `CompileResult(mainObj, llvmObj?, jdwpMetadata?)`. The two optional outputs depend on `useLLVM` and `enableJDWP`. The CAP cache path resolves to `tools/moe.tools.substrate/src/main/resources/cap_{arm64,x86_64}/` shipped in the SDK (see `moe-gradle-build` skill for how those `.cap` files are built).

`GraalVM` (also in `moe.tools.substrate`) is resolved at apply-time by `MoePlugin.apply()`:
1. If `-Pmoe.graalvm.home=…` is set, use that path.
2. Otherwise, request a JDK via `JavaToolchainService` with `JavaLanguageVersion.of(GraalVM.SUPPORTED_JAVA_MAJOR)` (currently 25), `JvmVendorSpec.GRAAL_VM`, `JvmImplementation.VENDOR_SPECIFIC`. Gradle's auto-provisioning downloads if missing.

The version is checked against `MIN_GRAALVM_VERSION` / `MAX_GRAALVM_VERSION` and warned on if newer. macOS quarantine attribute on the GraalVM dir is detected and the user is told the `xattr -r -d` command to run.

## XcodeProvider, XcodeBuild, XcodeInternal — Xcode integration

The split exists because there are two ways an app build can be triggered:

1. **From Gradle** — user runs `./gradlew moeMainReleaseIpaBuild` or `moeLaunch`. Gradle drives the whole pipeline, eventually invokes `xcodebuild` via `XcodeBuild` to produce the `.app` bundle. `XcodeProvider` runs first to symlink the per-arch `main.o` / `llvm.o` / `jdwp.metadata` into the Xcode build dir at the paths Xcode expects, and to verify (`XcodeEditor.isUpToDate()`) that the `.pbxproj` is compatible with the current MOE version.

2. **From Xcode** — user hits ⌘B in Xcode. The "Build with Gradle" run script (template in `moe-generator-project/.../moe.build.script.sh.in`) invokes `./gradlew moeXcodeInternal*`. `XcodeInternal` is **only registered when the `XCODE_PRODUCT_BUILD_VERSION` env var is set** (i.e. when invoked from Xcode), to keep it out of users' tab-completion otherwise.

`XcodeBuild` produces a `.app`. `IpaBuild` is a separate task that takes the `.app`, archives + signs + exports it via `xcodebuild -exportArchive` to produce a `.ipa` (using the export options from `MoeExtension.ipaExport`).

`UpdateXcodeSettings` is **not** part of every build — it's a migration task users run when bumping MOE versions (or when they hit the `XcodeProvider` "not up to date" error). It rewrites MOE-managed sections of the `.pbxproj` to match the current MOE version. Outside of those MOE-managed sections, users are expected to edit the Xcode project freely.

## Remote build (over SSH)

`MoePlugin.apply()` initializes `Server.setup(this)` from `org/moe/gradle/remote/Server.java`. If a server is configured, all `XcodeProvider` and `XcodeBuild` tasks are routed through it: `setSupportsRemoteBuild(true)` on the task plus `checkRemoteServer` overrides. Tasks that can't run remotely (`R8`, `ClassValidate`, `*Collect`, `NativeImage`, `IpaBuild`, `LaunchDevice`) explicitly call `setSupportsRemoteBuild(false)`.

The remote path uses symlinks from `outDir/main_${arch}.o` → the per-iter `main.o` produced locally and then `rsync`'d (see `XcodeProvider.run()`'s `remoteServer != null` branch). Used by Linux/Windows users who need a Mac for the Xcode/codesign step.

## LaunchDevice / LaunchSimulator

Both `javaexec` the `ios-device.jar` (the fat JAR from `moe.ios.device.launcher`, shipped in the SDK at `tools/`). Args are built via `DeviceLauncherBuilder` (in `org/moe/gradle/utils/`). Key options:

- `-Pmoe.launcher.devices=<udid1,udid2>` selects target devices (else default device); empty UDID list just means "any device"
- `LaunchOptions.read(project)` parses `moe.launcher.*` properties (debug ports, install mode, env vars, raw vs JUnit output)
- For test source set, output is captured by `JUnitTestCollector` and a JUnit XML report is written per device under `build/moe/reports/`
- Debug attach uses `-XX:JDWPOptions=transport=dt_socket,server=y,suspend=y,address=…` injected into the launch args; the launcher then port-forwards through `pymobiledevice3`

For the launcher's internals (pymobiledevice3 daemon, GDB Remote protocol, USB hotplug, debugserver wiring) see the `moe-ios-device` skill.

## ProGuard levels

`MoeExtension.proguard.level` ∈ `app | platform | all`. Drives both the `ClassValidate`/`ReflectionCollect` classpath split (see `moe-classvalidator` skill) and the R8 base config selection in `R8.setupMoeTask`:

| Level | Base proguard cfg | Input jars to R8 |
|---|---|---|
| `app` | `proguard.cfg` (lighter) | app jars only — core/platform are library |
| `platform` | `proguard.cfg` | app jars + platform jar — core is library |
| `all` | `proguard-full.cfg` | everything |

The `ReflectionCollect.run()` currently throws on anything other than `all`. `moe-svm` runs `all`.

## Per-project override files

`NativeImage.setupMoeTask` checks `project.file("…")` for these and includes them only if present:

- `jni-config.json` — extra JNI registration
- `reflection-config.json` — extra reflection registration
- `dynamic-proxies.json` — proxies (always project-supplied; nothing collects it)
- `resource-config.json` — extra resource patterns
- `custom-config.cfg` — raw extra `native-image` flags, line-per-flag
- `proguard.cfg` — overrides the SDK base config (`R8.setupMoeTask` checks before falling back to SDK)
- `proguard.append.cfg` — appended to the composed proguard config

## Critical files

| Concern | File |
|---|---|
| Plugin entrypoint, task registration | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/MoePlugin.java` |
| DSL extension | `MoeExtension.java` + `options/*.java` |
| GraalVM resolution + version policy | `tools/moe.tools.substrate/src/main/kotlin/org/moe/tools/substrate/GraalVM.kt` |
| Native-image invocation | `tools/moe.tools.substrate/src/main/kotlin/org/moe/tools/substrate/SubstrateExecutor.kt` |
| Native-image config object | `.../moe/tools/substrate/Config.kt` |
| AOT task | `tools/moe.plugin.gradle/src/main/kotlin/org/moe/gradle/tasks/NativeImage.kt` |
| R8 invocation + proguard composition | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/R8.java` |
| Xcode object-file plumbing | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/XcodeProvider.java` |
| xcodebuild driver | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/XcodeBuild.java` |
| Xcode-driven build entrypoint | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/XcodeInternal.java` |
| .ipa export + signing | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/IpaBuild.java` |
| Device launch CLI builder | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/utils/DeviceLauncherBuilder.java` |
| Remote build over SSH | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/remote/Server.java` |
| Test class enumeration | `tasks/TestClassesProvider.java` (writes `classlist.txt`) |
| IB action/outlet generator | `tasks/GenerateUIObjCInterfaces.java` |

## Conventions worth knowing without reading further

- **Prefer `addConvention(...)` over assigning fields directly in `setupMoeTask`.** Conventions defer evaluation, which is what makes the plugin work with Gradle's configuration cache. Direct field writes happen at configuration time and force re-eval each build.
- **`XcodeInternal` only exists when invoked from Xcode.** Its registration is gated on the `XCODE_PRODUCT_BUILD_VERSION` env var, so it won't show up in tab-completion from a regular shell.
- **`R8`'s `--pg-compat` mode is intentional.** Real R8 mode is more aggressive than ProGuard and breaks NatJ binding patterns; compat mode is what makes the existing SDK proguard rules portable.
- **`UpdateXcodeSettings` is a version-migration task, not a per-build step.** Users only need to run it when MOE updates require new pbxproj settings; the rest of the time they edit their Xcode project normally.
