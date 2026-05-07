# tools

The user-facing-and-tooling composite. Holds the user's Gradle plugin, the IDEA plugin, the SDK assembler, the binding generator engine and config DSL, the iOS device launcher, and supporting libraries.

## Module list (14 + 1 orphan)

| dir | gradle name | what it is |
|---|---|---|
| `moe.binding.clang` | `:moe.binding.clang` | Java bindings to libclang (consumed by NatJGen) |
| `moe.document.pbxproj` | `:moe.document.pbxproj` | Parser/editor for `.pbxproj` |
| `moe.generator.natjgen` | `:moe.generator.natjgen` | NatJGen engine — uber-jar with `org.moe.natjgen.Main` |
| `moe.generator.project` | `:moe.generator.project` | Generates the user-app Xcode project from a template **and** keeps it in sync as the user's Gradle config changes (hooked into `moe-gradle`) |
| `moe.ios.device.launcher` | `:moe.ios.device.launcher` | Standalone CLI for install/launch/debug on physical devices |
| `moe.plugin.common` | `:moe.plugin.common` | Shared utilities for the Gradle + IDEA plugins |
| `moe.plugin.gradle` | `:moe-gradle` (renamed) | **User-facing Gradle plugin** — see `moe-app-build` skill |
| `moe.plugin.idea` | `:moe.plugin.idea` | **IDEA / Android Studio plugin** — see `moe-idea-plugin` skill |
| `moe.protocol.gdbremote` | `:moe.protocol.gdbremote` | GDB Remote Serial Protocol (talks to `debugserver`) |
| `moe.sdk.publisher` | `:moe-sdk` (renamed) | **SDK assembler** — bundles everything into the published ZIP |
| `moe.tools.common` | `:moe.tools.common` | Utility lib (file I/O, plist, exec) |
| `moe.tools.natjgen` | `:moe.tools.natjgen` | NatJ binding *config DSL* — data model NatJGen consumes |
| `moe.tools.classvalidator` | `:moe.tools.classvalidator` | ASM passes + reflection/resource collectors — see `moe-classvalidator` skill |
| `moe.tools.substrate` | `:moe.tools.substrate` | `native-image` wrapper (`SubstrateExecutor`, `GraalVM`, CAP cache) |
| `moe.document.xib` | **(not in settings.gradle.kts — long dead, ignore)** | Was an Xcode `.xib`/storyboard parser |

The two **renames** in `tools/settings.gradle.kts` change Gradle path but not directory:
- `:moe.plugin.gradle` → `:moe-gradle` — invoke as `:tools:moe-gradle:…`
- `:moe.sdk.publisher` → `:moe-sdk` — invoke as `:tools:moe-sdk:…`

## Three published artifacts, three different paths

The `tools/` composite produces all three of MOE's public artefacts. They publish via different mechanisms — don't mix them up:

| from | published as | how |
|---|---|---|
| `moe.sdk.publisher` (`:moe-sdk`) | `org.multi-os-engine:moe-sdk` on Maven Central | Vanniktech `mavenPublishing` |
| `moe.plugin.gradle` (`:moe-gradle`) | `org.multi-os-engine:moe-gradle` on Maven Central | Vanniktech `mavenPublishing` |
| `moe.plugin.idea` | JetBrains Marketplace | IntelliJ Platform plugin's `publishPlugin` task |

The IDEA plugin's `build.gradle` also has a leftover `maven-publish` block — that block is dead/incorrect and is not the actual publishing path. Don't try to push the IDE plugin via `publishToMavenLocal`.

## The SDK ZIP layout

`:tools:moe-sdk:sdk` produces `moe-sdk-${MOE_VERSION}.zip` containing:

```
sdk/
  moe-core.jar (+sources +javadoc)
  moe-ios.jar (+sources +javadoc)
  moe-ios-junit.jar (+sources +javadoc)
sdk/iphoneos/
  libmoe.a, svmjdwp.framework, include/jni.h, include/MOE/*.h
sdk/iphonesimulator/
  libmoe.a, svmjdwp.framework, include/jni.h, include/MOE/*.h
tools/
  ios-device.jar          ← renamed from moe.ios.device.launcher.jar
  wrapnatjgen.jar         ← renamed from moe.generator.natjgen.jar
  r8.jar                  ← downloaded from r8-releases (URL + sha pinned in moe.sdk.publisher/build.gradle.kts)
  jni-config-base.json
  reflection-config-base.json
  proguard.cfg, proguard-full.cfg
  gradlew.zip
tools/macosx/
  llvm/                   ← libclang.dylib
  libnatj.dylib
```

The base `*-config-base.json` files are hand-maintained at `moe-core/moe.apple/tools/`; user-app builds extend them via `ReflectionCollect`/`ResourceCollect` (see `moe-classvalidator` skill).

## moe-gradle's shaded deps

`moe.plugin.gradle/build.gradle` uses the shadow plugin to bundle `moe.tools.common`, `moe.document.pbxproj`, `moe.generator.project`, `moe.tools.substrate`, `moe.tools.classvalidator`, plus a number of third-party libs (commons-lang3/io, jsch, ASM family, gson, dd-plist, commons-codec) into the published `moe-gradle` jar. User apps applying the plugin get all of them transitively via the single coord.

## CAP cache lives here

`moe.tools.substrate/src/main/resources/cap_{arm64,x86_64}/` is the checked-in `native-image` CAP cache used by `svm.jdwp`'s SDK-build-time native-image run **and** by user-app builds. Regeneration tasks (`downloadGraalVM…`, `extractGraalVM`, `generateQueryCode`, `runQueryCode`) are deliberate one-shots — see `moe-core/UPDATE_JAVA_VERSION.md` "Update CAP Cache" for the procedure. Do not hand-edit.

## External composite include

`tools/settings.gradle.kts` includeBuilds `../../external/javapymobiledevice3` (the GPL `IPCPyMobileDevice3` sibling lives next to it and is intentionally separate — Apache-2.0 boundary). Both `moe.ios.device.launcher` and `moe.plugin.idea` consume it.
