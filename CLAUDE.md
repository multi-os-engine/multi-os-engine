# Multi-OS Engine — moe-svm branch

This is the `moe-svm` branch of MOE. The user app's Java compiles to a native iOS binary via **GraalVM native-image** (Substrate VM). The legacy `moe-master` toolchain (dex2oat, ART, retrolambda, the proguard tool) is gone. R8 is still used as a JVM bytecode shrinker before native-image — the `proguard.cfg` files are kept because R8 reads ProGuard syntax (standard Android-ecosystem convention, not a mismatch).

## Repository shape

`moe/` is THE project root. Vendored dependencies live under `vendor/` as git submodules:

```
moe/                                  ← project root. Clone with --recurse-submodules.
├── .gitmodules
├── vendor/
│   ├── svm/{mx, graal, labs-openjdk}        ← submodules, branch-tracked
│   └── external/{libffi, llvm, javasqlite,
│                 javapymobiledevice3,
│                 ipcpymobiledevice3}        ← submodules, branch-tracked
├── .github/workflows/publish.yml     ← in-repo CI (also see ../moe-gha/ for moe-master legacy)
└── ... (composites below)
```

The legacy `repo`-tool layout (`<checkout>/{moe,svm,external}` siblings, pinned via `multi-os-engine/manifest`) is retired for moe-svm; the manifest repo is kept around only for the `moe-master` branch. `moe-gha/` (sibling, not pictured) still holds the moe-master publishing CI; new moe-svm work uses `moe/.github/workflows/publish.yml`.

Inside `moe/` is a Gradle composite-of-composites:

```
moe/                    ← root composite (just orchestrates `clean`)
├── settings.gradle.kts → includeBuild moe-core, natj, prebuilts, tools
│
├── build-tools/        ← convention-plugin layer; includeBuild'd by every other composite
├── prebuilts/          ← LLVM, MinGW, linuxCrosscompiler, libffi cross-builds
├── natj/               ← NatJ runtime jar + per-platform native libs (also a Java module itself)
├── moe-core/           ← (a) drives SVM/JDK/JDWP build, (b) hosts checked-in iOS bindings
└── tools/              ← user-facing Gradle plugin, IDEA plugin, SDK assembler, generators, CLIs
```

All build scripts on this branch are Kotlin DSL (`*.gradle.kts`). No Groovy hold-out. (`UPDATE_JAVA_VERSION.md` references `build.gradle` — that doc is dated; it's `.kts`.)

## The canonical lifecycle is four commands

```
./gradlew :prebuilts:llvm                    # one-time, manual, slow (cross-compile of libclang)
./gradlew :tools:moe-sdk:sdk                 # builds the entire SDK ZIP
./gradlew :tools:moe-gradle:build            # builds the user-facing Gradle plugin
./gradlew :tools:moe.plugin.idea:build       # builds the IDEA plugin
```

`:prebuilts:llvm` is the only prebuild that's manual — every other prebuild (libffi, mingw, linuxCrosscompiler, etc.) is wired in transitively. `:tools:moe-sdk:sdk` is the canonical SDK build; it transitively drives moe-core, natj, libffi, mx, native-image-for-svmjdwp, Xcode-link of `libmoe.a`, and assembly.

Anything else (`:moe.platform.ios:generateBindings`, `:tools:moe.tools.substrate:runQueryCode`, `:moe-sdk:devsdk`, mingw rebuilds, etc.) is a deliberate one-shot and is **not** part of the normal lifecycle.

## Three published artifacts

| artifact | published as | published via | from |
|---|---|---|---|
| **moe-sdk** | `org.multi-os-engine:moe-sdk` (Maven Central) | Vanniktech maven-publish | `tools/moe.sdk.publisher/` (renamed `:moe-sdk` in settings) |
| **moe-gradle** | `org.multi-os-engine:moe-gradle` (Maven Central) | Vanniktech maven-publish | `tools/moe.plugin.gradle/` (renamed `:moe-gradle` in settings) |
| **moe-intellij-plugin** | JetBrains Marketplace | `publishPlugin` task | `tools/moe.plugin.idea/` |

The IDEA plugin's build script also has a `maven-publish` block — that block is dead/incorrect and not the actual publishing path. Don't try to push the IDE plugin via `publishToMavenLocal` and expect it to be the canonical artifact.

## moe-core has two roles

1. **Build the SVM-ready JVM bits.** `moe-core/moe.apple/moe.core.native/` orchestrates: fetch a boot JDK from `vendor/svm/labs-openjdk`, run `mx ... build` against `vendor/svm/graal`, build `libjvm.a` + `libjava.a` + `libjavasqlite.a` per arch/sdk via Xcode, invoke `native-image` to produce `svmjdwp.framework` (a feature framework user apps link against for JDWP debug support), and finally Xcode-link everything plus `MOE.mm` shims into `libmoe.a`.
2. **Host the iOS bindings.** `moe-core/moe.apple/moe.platform.ios/src/main/java/apple/**` is **checked-in generated code with manual fixes layered on top**. The lifecycle build just `javac`'s those sources into `moe-ios.jar`. NatJGen (via the `generateBindings` task) only runs when bindings are intentionally regenerated; see `moe-core/moe.apple/moe.platform.ios/UPDATE_IOS_BINDING.md` for the workflow.

## GraalVM versions — two values, intentional

- `gradle/libs.versions.toml` pins `graalvm-svm = "23.0.7"`. This is the **API library** used `compileOnly` to compile SVM Features (e.g. `ReflectionCollectionFeature` in `moe-core/moe.apple/moe.core.java/src/main/java/org/moe/core/svm/`).
- The actual `native-image` binary is built from `vendor/svm/graal` at GraalVM **25**. That's what user apps and `svm.jdwp` invoke at build time.

Two distinct code paths. They are deliberately not the same number.

## Dead / orphaned things — ignore

- `tools/moe.document.xib/` — directory with a `build.gradle.kts` but **not** in `tools/settings.gradle.kts`. Long dead.
- `moe-core/android.py` — used to apply licenses; basically dead now.
- `cache_readiness_audit.md`, `gradle_tasks_inventory.md` at the repo root — irrelevant working files.
- The IDE plugin's `maven-publish` block — mentioned above; not load-bearing.
- The "remote build over SSH" path in `moe.plugin.gradle` for *Linux* users — `natj-linux` cross-compiles on macOS, so the README's prose about Linux remote builds is dated. The remote-build path is still real for Windows users who need a Mac for the Xcode/codesign step.

## Skills available for deeper work

`moe-gradle-build` for build-system mechanism · `moe-natjgen` for the binding generator engine · `moe-classvalidator` for the pre-/post-R8 ASM passes · `moe-app-build` for the user-side Gradle plugin · `moe-idea-plugin` for the IDE plugin · `moe-ios-device` for the device launcher and GDB Remote · `natj-runtime` for the NatJ Java↔ObjC binding runtime.
