# build-tools

Tiny Gradle convention-plugin layer (12 files), consumed via `includeBuild` from every other composite (`prebuilts`, `natj`, `moe-core`, `tools`). It is never the root build — it's always loaded by the others.

## What it ships

Two plugins:

- `org.moe.buildtools` — applied by every composite root. Auto-registers the extensions and configures every project to wire `BaseTask`/`Script`/`XcodeBuild` task instances with the right defaults. Idempotent — safe to apply on root *and* subprojects.
- `org.moe.java-conventions` — applies `java`, sets `sourceCompatibility`/`targetCompatibility` to Java 8 (override per-module by setting `javaConventions.release = N`).

Three task base types (`org.moe.prebuilts.*`):

- **`Script`** — `@CacheableTask` step-based exec DSL. Steps are serialized into the config cache via `rel(file)` — every absolute path is replaced by a `$ROOT`/`$SVM`/`$EXTERNAL` sentinel at config time and unwrapped at execution time. **`requirePortable()` is what enforces the sentinel discipline; do not bypass it** — leaking absolute paths into a `Script` step poisons the config cache.
- **`Prebuild`** — wraps a per-platform shell prebuild script (used for libffi). rsyncs the source tree into a build dir, applies any patch files, runs the shell script.
- **`XcodeBuild`** — `xcodebuild` driver with pretty output and a per-`.xcodeproj` lock service (so two iOS targets sharing a project don't race). Tasks are registered via `XcodeBuild.registerTask(project, target, platform, sdk, configuration, deps, configAction)`. Cross-project `deps` are expressed as `"projects": [":foo:bar@TargetName"]` strings.

Three project-scoped extensions, registered automatically by `org.moe.buildtools`:

- **`moeExternal`** (`MOEExternal`) — the typed registry of every cross-build artifact path. Every native task and the SDK assembler obtains paths from here; **don't hard-code paths anywhere else**. Field tree: `svm.{root,mx,graal,openjdk}`, `natJ.{root,sources,jnipath,ios,mac,win,linux,ndk}`, `llvm.{root,jnipath,macos}`, `moeCore.out.{moeCoreJar, moeIosJar, iphoneosLibmoe, iphoneosSvmjdwp, …}`. Auto-populated relative to the rootProject, so every absolute path resolves the same regardless of which composite is the build root.
- **`buildfilter`** (`BuildFilter`) — per-project narrowing of native config/sdk/archs. Reads `moe.buildfilter.ios.{config,sdk,archs}` and `moe.buildfilter.macos.config` Gradle properties. Read by every iOS `XcodeBuild.registerTask` call site in `moe-core` to skip configurations during dev builds.
- **`MOECoreNativeContext`** — registered on `moe.core.native` only. Holds the shared `bootJdkTask`/`graalDistTask` task handles + paths so the four sibling subprojects (`svm.graal`, `svm.openjdk`, `svm.jdwp`, `moe.sdk`) can depend on the boot JDK + graalDist without re-deriving them.

## Conventions when editing here

- **Don't manually register the extensions** in build scripts (`extensions.create("moeExternal", ...)`). The plugin already registers them with idempotency guards. Just consume.
- **Prefer generated accessors over name-based lookups.** `tasks.test { }`, `tasks.jar { }`, `moeExternal.svm.root`, `buildfilter.ios.archs`. Drop `import org.moe.prebuilts.MOEExternal` etc. when you only use the accessor.
- **All dep coords go through `gradle/libs.versions.toml`.** Never inline `"group:artifact:version"`, never interpolate `libs.versions.x.get()` into a string. Reuse an existing `version.ref` when the artifact is in a family that already has one (e.g. all `org.ow2.asm:asm-*` share `version.ref = "asm"`).
- This directory's source tree is small; if you find yourself adding more than a single file, ask whether it actually belongs here vs. being a `tools/`-side helper.
