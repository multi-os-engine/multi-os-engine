# moe.core.native — the SVM build pipeline

This is where the GraalVM toolchain is built from source and woven into iOS-shaped static archives. End-to-end:

```
svm/labs-openjdk  ──jdk_gensrc──►  build/labsjdk/         ← apply patches, configure, make graal-builder-image
        │                                  │
        │                                  ▼  (Xcode)
        │                          libjava.a per arch/sdk    [svm.openjdk]
        │
        │  (boot JDK exposed as MOECoreNativeContext.bootJdkTask)
        ▼
svm/graal  ──build_graal_dist──►  build/graalDist/         ← rsync svm/graal, mx --java-home <bootJDK> --env ce build, rsync graalvm-home
        │                                  │
        │                                  ▼  (Xcode)
        │                          libjvm.a per arch/sdk     [svm.graal]
        │
        │  (graalDist exposed as MOECoreNativeContext.graalDistTask)
        ▼
svm.jdwp/  ──build_jdwp_<arch>_jar──►   <graalDist>/bin/native-image -H:+SharedLibrary -H:PageSize=16384
                                         -H:+UseCAPCache -H:CAPCacheDir=<tools/moe.tools.substrate/.../cap_<arch>>
                                         --features=...ServerJDWPFeature
                                         --module-path <graalDist>/lib/graalvm/svm-jdwp-server.jar
                                                ─►  svmjdwp_<arch>.o
                                                          │
                                                          ▼  (Xcode)
                                                  svmjdwp.framework per arch/sdk

external/javasqlite ──Xcode──►   libjavasqlite.a per arch/sdk

                ┌──────────────────────────┐
                │   moe.sdk (Xcode link)   │
                │  + src/MOE.mm            │
                │  + src/ErrorDelegate.m   │
                │  + src/inline/*.m        │
                │  ← libjvm.a              │
                │  ← libjava.a             │
                │  ← libjavasqlite.a       │
                │  ← natj iOS JNI lib      │
                └──────────────────────────┘
                            │
                            ▼
                 libmoe.a per arch/sdk  +  include/jni.h, include/MOE/*.h
```

## What's special about each subproject

- **`svm.openjdk/`** — runs `jdk_gensrc` (rsync labs-openjdk → apply `add_ios_build_support.patch` + `fix_memset_call.patch` → `configure --with-conf-name=labsjdk` → `make graal-builder-image`). The resulting boot JDK at `build/labsjdk/` is what `mx` uses as `--java-home`. Then `svm.openjdk.xcodeproj` builds `libjava.a` per arch/sdk from labs-openjdk's java runtime sources. Xcode upgrade rituals (adding new source files when JDK upgrades) are in the top-level `UPDATE_JAVA_VERSION.md`.
- **`svm.graal/`** — runs `mx ... build` against `svm/graal/` (with `fix_undefined_symbol__clear_cache_apple_clang.patch` applied). Produces a self-contained GraalVM at `build/graalDist/` whose `bin/native-image` is what user-app builds and `svm.jdwp` invoke. `svm.graal.xcodeproj` then builds `libjvm.a`.
- **`svm.jdwp/`** — the **only place** in moe-core that invokes `native-image` directly during SDK build. Outputs a feature framework user apps link against when building Debug. The native-image flag set is intricate and tied to the CAP cache shipped at `tools/moe.tools.substrate/src/main/resources/cap_{arm64,x86_64}/`. JDWP-related substitutions on the Java side live at `moe-core/moe.apple/moe.core.java/src/main/java/org/moe/core/svm/JDWPSubstitutions.java`.
- **`external.javasqlite/`** — wraps the vendored `external/javasqlite` C source as an iOS static archive.
- **`moe.sdk/`** — Xcode-links everything plus the `MOE.mm` shim into `libmoe.a`. The shim provides `Java_org_moe_core_MOE_handleStartup` and the per-framework inline method bodies.

## Patches against vendored sources — they will rot

When the `repo` manifest pin moves, re-test:

| patch | against |
|---|---|
| `svm.openjdk/add_ios_build_support.patch` | `svm/labs-openjdk` |
| `svm.openjdk/fix_memset_call.patch` | `svm/labs-openjdk` |
| `svm.graal/fix_undefined_symbol__clear_cache_apple_clang.patch` | `svm/graal` |

`UPDATE_JAVA_VERSION.md` (one level up) is the upgrade runbook. Some line-level details are dated (it talks about `build.gradle` — files are `.kts` now) but the procedure is correct.

## Two GraalVM versions, both deliberate

- The runtime `native-image` invoked here (and in user-app builds) is from `svm/graal` at GraalVM **25**.
- Java code under `moe-core/moe.apple/moe.core.java/.../svm/` (`ReflectionCollectionFeature`, `JDWPSubstitutions`) is compiled `compileOnly` against `graalvm-svm = "23.0.7"` from `gradle/libs.versions.toml` — this is just the **API library** for SVM Features, not the runtime SVM.

## CAP cache — read-only in normal work

`tools/moe.tools.substrate/src/main/resources/cap_{arm64,x86_64}/` is checked-in pre-computed native-image query output that lets `svm.jdwp`'s native-image run skip reflective probing. **Do not hand-edit.** Regeneration procedure (when GraalVM revisions advance) is in `UPDATE_JAVA_VERSION.md` → "Update CAP Cache".

## Xcode project files

`svm.graal.xcodeproj`, `svm.openjdk.xcodeproj`, `svm.jdwp.xcodeproj`, `moe.sdk.xcodeproj`, `external.javasqlite/external.javasqlite.xcodeproj` are tracked in git. Diff noise is endemic — review pbxproj diffs at function-call-graph granularity, not line-by-line. When a JDK upgrade requires adding new source files, do it in Xcode (right-click → Add files → references only, no copies) per `UPDATE_JAVA_VERSION.md`.

## `XcodeBuild.registerTask` calling convention

Cross-target dependencies in this directory are written as `"projects": [":moe.apple:moe.core.native:svm.graal@libjvm", ":moe.apple:moe.core.native:svm.openjdk@libjava"]` — the `@TargetName` suffix selects an Xcode target inside the referenced project. `BuildFilter` (from build-tools, populated from `moe.buildfilter.ios.{config,sdk,archs}` Gradle properties) lets developers narrow which configs/sdks/archs each module builds during dev cycles.
