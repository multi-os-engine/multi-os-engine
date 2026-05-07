---
name: moe-gradle-build
description: How MOE *itself* is built — the composite-of-composites Gradle layout (root + `build-tools/`, `prebuilts/`, `natj/`, `moe-core/`, `tools/`), convention plugins (`org.moe.buildtools`, `org.moe.java-conventions`), task base types (`Script`, `Prebuild`, `XcodeBuild`), the `MOEExternal`/`MOECoreNativeContext`/`BuildFilter` extensions, cross-composite bridge tasks (`ext_natj_*`, `prebuild_libffi_*`, `ext_moe_core`), the `moe-sdk` ZIP assembler, and the `moe-svm`-branch 4-command lifecycle. TRIGGER when: editing any `settings.gradle.kts` / `build.gradle.kts` / `gradle/libs.versions.toml` / anything under `build-tools/src/`; questions like "how does the build work", "why does X depend on Y", "what does build-tools/prebuilts/natj/moe-core/tools do", "how is the SDK assembled", "how do I build natj-{ios,mac,win,linux,ndk}"; touching `XcodeBuild.registerTask` call sites or `Script`/`Prebuild` task definitions; updating GraalVM / JDK / labs-openjdk pins (per `moe-core/UPDATE_JAVA_VERSION.md`); CAP-cache regeneration via `:tools:moe.tools.substrate:runQueryCode`. SKIP: the user-side plugin a downstream app applies — that's `moe-app-build`; per-app native-image flags — also `moe-app-build`; the IDEA plugin's own `build.gradle` — that's `moe-idea-plugin`.
---

# MOE Gradle Build System

The repo is a Gradle composite-of-composites. The root `moe/` only owns a `clean` task; everything else lives in four sibling composites and a fifth (`build-tools/`) that hosts the convention plugins.

The root `CLAUDE.md` covers orientation: branch context, the 4-command lifecycle, the three published artifacts, and what's intentionally absent vs `moe-master`. This skill covers the *mechanism* — task base types, extension contracts, cross-build bridges, version-catalog discipline.

## Composite layout (verify against `settings.gradle.kts`)

```
moe/                 settings.gradle.kts → includeBuild moe-core, natj, prebuilts, tools
├── build-tools/     (no settings file — tiny standalone build, never the root)
├── prebuilts/       includeBuild ../build-tools
├── natj/            includeBuild ../build-tools, ../prebuilts
├── moe-core/        includeBuild ../build-tools, ../natj
└── tools/           includeBuild ../build-tools, ../natj, ../moe-core, ../prebuilts,
                                    ../../external/javapymobiledevice3
```

`build-tools` is *always* an included build — every other composite roots applies the `org.moe.buildtools` plugin from it.

Cross-composite task wiring goes through **bridge tasks**: `tools/build.gradle.kts` and `moe-core/build.gradle.kts` register `ext_natj_<plat>`, `ext_moe_core`, `prebuild_libffi_<plat>` etc. that delegate via `gradle.includedBuild("name").task(":path")`. Never reach into another composite's tasks directly — go through the bridge.

## build-tools — what every composite gets

Two plugins (the convention layer at `build-tools/src/main/java/org/moe/prebuilts/`):

- `org.moe.buildtools` — applied by every composite root. Wires defaults onto every `BaseTask`/`Script`/`XcodeBuild` in the project tree. Idempotent.
- `org.moe.java-conventions` — sets Java to release 8 by default. Override per-module with `javaConventions.release = 11` etc.

Three task base types:

| type | role |
|---|---|
| `Script` (`@CacheableTask`) | step-based exec DSL; portable-paths via `rel(file)`/`registerRoot()` ↔ `unwrap()`; `requirePortable()` is what enforces the discipline |
| `Prebuild` (`@CacheableTask`) | rsync source → apply patches → run a per-platform shell script. Used for libffi cross-builds. |
| `XcodeBuild` | `xcodebuild` driver with pretty output; per-`.xcodeproj` lock service to serialize same-project builds. Tasks registered via `XcodeBuild.registerTask(project, target, platform, sdk, configuration, deps, configAction)`; cross-project deps as `"projects": [":foo:bar@TargetName"]`. |

Three extensions auto-registered on every project:

- `moeExternal` (`MOEExternal`) — typed registry of every cross-build artifact path. Tree: `svm.{root,mx,graal,openjdk}`, `natJ.{root,sources,jnipath,ios,mac,win,ndk,linux}`, `llvm.{root,jnipath,macos}`, `moeCore.out.*`. Auto-populated relative to root. **All cross-build paths read from here; don't hard-code.**
- `buildfilter` (`BuildFilter`) — narrowing of native config/sdk/archs. Reads `moe.buildfilter.ios.{config,sdk,archs}` and `moe.buildfilter.macos.config` Gradle properties.
- `MOECoreNativeContext` — registered on `moe.core.native` only. Holds the boot-JDK + graalDist task handles shared between its four subprojects.

## The 4-command lifecycle

```
./gradlew :prebuilts:llvm                   # one-time, manual, slow
./gradlew :tools:moe-sdk:sdk                # builds the SDK ZIP (drives moe-core, natj, libffi, mx, native-image)
./gradlew :tools:moe-gradle:build           # builds the user-facing Gradle plugin
./gradlew :tools:moe.plugin.idea:build      # builds the IDEA plugin
```

`:prebuilts:llvm` is the only prebuild deliberately not wired transitively — the cross-compile of libclang is multi-minute and would dominate every clean build. Every other prebuild (libffi, mingw, linuxCrosscompiler) is on-demand from downstream tasks.

`:moe.platform.ios:generateBindings` and `:moe.tools.substrate:runQueryCode` are also manual one-shots. Their outputs are checked into git.

## SDK build flow (what `:tools:moe-sdk:sdk` triggers)

1. `prebuilts:external:libffi:prebuild_*` — libffi for each needed platform via `Prebuild` (depends on `:prebuilts:llvm` having been done; depends on `:prebuilts:mingw` for windows; on `:prebuilts:linuxCrosscompiler` for linux).
2. `natj:natj-{ios,mac,win,linux,ndk}:build` — per-platform NatJ native libs; `natj` root produces `natj-api.jar`.
3. `moe-core:moe.apple:moe.core.native:*:build` — boot-JDK fetch + mx graalDist build + `svm.{graal,openjdk,jdwp}` Xcode + `moe.sdk` Xcode link → `libmoe.a` + `svmjdwp.framework`.
4. `moe-core:moe.apple:moe.platform.ios:build` — `javac` of the checked-in `apple/**` tree → `moe-ios.jar`. (NatJGen does **not** run here unless you explicitly invoke `generateBindings`.)
5. `moe-core:moe.apple:moe.core.java:build` → `moe-core.jar`.
6. `tools:moe-sdk:sdk` — Zip with everything, plus a downloaded R8 jar.

`:tools:moe-sdk:devsdk` produces the same content as a directory under `build/dev-sdk/` — useful when iterating on an in-checkout copy.

## Two GraalVM versions, both intentional

`gradle/libs.versions.toml` pins `graalvm-svm = "23.0.7"`. That's the **API library** used `compileOnly` to compile SVM Features (`ReflectionCollectionFeature`, `JDWPSubstitutions`). The actual `native-image` built from `svm/graal` is GraalVM **25**. They are intentionally not the same number; do not "fix" one to match the other.

## Per-platform-build status

- `natj-ios`, `natj-mac` — active, Xcode-driven.
- `natj-win` — premake5 + MinGW cross-compile on macOS. Live but rarely exercised.
- `natj-linux` — cross-compiled on macOS. README's prose about "remote SSH/VM builds" is dated.
- `natj-ndk` — Android NDK build. Requires `NDK_PATH`; live but not part of normal lifecycle.

## Kotlin DSL conventions

All build scripts are `*.gradle.kts`. No Groovy hold-out. (`UPDATE_JAVA_VERSION.md` references `build.gradle` — that doc is dated.)

**Use generated accessors over name-based lookups.** Gradle Kotlin DSL generates type-safe accessors from the plugin classpath at script-compile time. For tasks contributed by applied plugins, prefer:

- `tasks.test { }`, `tasks.jar { }`, `tasks.classes { }`, `tasks.build { }`, `tasks.publish { }`, `tasks.shadowJar { }`, `tasks.runIde { }`, `tasks.processResources { }`, `tasks.javadoc { }`, `tasks.processTestResources { }` — over `tasks.named<Test>("test") { }` etc.
- Exception: `tasks.sourcesJar` / `tasks.javadocJar` — added at config time by `withSourcesJar()` / `withJavadocJar()`, not via plugin metadata. Use `tasks.named<Jar>("sourcesJar")` for those.

Same for extensions registered by plugins: `moeExternal.svm.root`, `buildfilter.ios.archs`, `spotless { }`, `intellijPlatform { }`, `mavenPublishing { }` — over `extensions.getByType<>()`, `the<>()`, `configure<SpotlessExtension> { }`. The accessor doesn't need a type import; drop `import org.moe.prebuilts.MOEExternal` etc. when only using `moeExternal.X`.

**Don't manually register the plugin's extensions** in build scripts (`extensions.create("moeExternal", ...)`). The build-tools plugin already registers them with idempotency guards. Just consume.

**All dependency coords go through the version catalog.** Add new artifacts to `gradle/libs.versions.toml` and reference them as `libs.<name>` (or `libs.versions.<key>` for a raw version string). This applies to `testImplementation` and other test-only configurations too. Never inline `"group:artifact:version"` strings in `build.gradle.kts`, and never construct coordinates by interpolating `libs.versions.foo.get()` into a string literal — that defeats the catalog. The one legitimate exception is composite-build substitution (e.g. `"org.moe:natj"`), where Gradle replaces the coord with the included project and there is no version. Reuse an existing `version.ref` when the artifact belongs to a family that already has one (e.g. all `org.ow2.asm:asm-*` artifacts share `version.ref = "asm"`).

## Additional Resources

- **`references/projects.md`** — every project + subproject with build.gradle analysis
- **`references/control-flow.md`** — dependency threads, cross-build bridges, platform matrix
- **`references/build-tools-plugin.md`** — `Prebuild`/`Script`/`XcodeBuild` task type API and usage detail
