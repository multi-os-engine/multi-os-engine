# Registration pipelines

NatJ has two parallel mechanisms for ensuring an ObjC binding is wired up at the right time. They share infrastructure but answer different questions.

| Mechanism             | Question it answers                                                | Cost      |
|-----------------------|--------------------------------------------------------------------|-----------|
| `@RegisterOnStartup`  | "This class MUST be registered before main() runs" (e.g. hybrids that get called from native before any Java code touches them) | Eager class load at app launch |
| `objc-bindings.txt`   | "If an ObjC instance of class X arrives, here's the Java FQN to load on demand" | Lazy load on first occurrence |

Both pipelines flow through the same Gradle task and are bundled into the iOS `.app` together; they are read at startup by `MOE.mm`.

## Build-time pass

`tools/moe.plugin.gradle/src/main/java/org/moe/gradle/internal/RegisterOnStartupChecker.java`

ASM `ClassVisitor` that scans a single class file for three annotations:

| Annotation               | Recorded as                |
|--------------------------|----------------------------|
| `@RegisterOnStartup`     | `isRegisterOnStartup`      |
| `@ObjCClassBinding`      | `isObjCClassBinding`       |
| `@ObjCClassName(value)`  | The string                 |

`visitEnd()` computes:
- `objCClassName` (used for hybrid duplicate detection): only if `@RegisterOnStartup` is present **without** `@ObjCClassBinding`. Falls back to the dotted Java FQN if `@ObjCClassName` is absent.
- `objCBindingClassName` (used for the lazy-load mapping): set whenever `@ObjCClassBinding` is present. Uses `@ObjCClassName.value` if available, else the simple class name (last segment of the internal name). This matches the convention native code uses (`gGetClassNameMethod` fallback in `ObjCRuntime.mm:229-230`).

These two fields exist independently so the existing hybrid-duplicate semantics aren't broken when adding the binding map. **Don't merge them.**

## Build-time task

`tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/StartupProvider.java`

Runs **after** R8 (line 203 — `dependsOn(r8Task)`), iterates the post-R8 jar entries, runs `RegisterOnStartupChecker` on each `.class`, and emits two output files:

1. **`preregister.txt`** — one Java FQN per line for every `@RegisterOnStartup` class. Dotted, post-R8 (so already obfuscated if minification renamed it).
2. **`objc-bindings.txt`** — `objcName:javaFQN` per line for every `@ObjCClassBinding` class. `:` is unambiguous (it can't appear in either an ObjC class name or a Java FQN) and parses with a one-liner on either side. Dotted java name.

Both files land in `build/moe/{sourceSet}/startup-provider/{mode}/`. Two duplicate-detection passes:

- Hybrid duplicates: same `objCClassName` mapped from multiple `@RegisterOnStartup` classes — warned via `getLogger().warn` and logged to `StartupProvider.log`.
- Binding duplicates: same `objCBindingClassName` from multiple `@ObjCClassBinding` classes — warned the same way; only the **first** Java name (insertion order from the jar walk) is written to `objc-bindings.txt`. Two bindings for one ObjC name is a real configuration error and is rare, but not crash-worthy at runtime.

The convention names are `CONVENTION_PREREGISTER_FILE` and `CONVENTION_OBJC_BINDINGS_FILE`. Both are `@OutputFile`s.

## iOS bundle packaging

`tools/moe.generator.project/src/main/resources/org/moe/generator/project/moe.build.script.sh.in`

The Xcode project generated from this template includes a "Build with Gradle" run script phase whose body is this file. After Gradle finishes, it copies a handful of files into `${TARGET_BUILD_DIR}/${UNLOCALIZED_RESOURCES_FOLDER_PATH}/`:

```sh
cp .../startup-provider/${MOE_BUILD_MODE}/preregister.txt   .../Resources/
cp .../startup-provider/${MOE_BUILD_MODE}/objc-bindings.txt .../Resources/
# ... classlist.txt for test source set, jdwp metadata in Debug, etc.
```

Anything new that needs to land in the bundle gets a `cp` line here. **There is no Gradle `Sync` task for these resources** — Xcode is the packager.

## Runtime startup

`moe-core/moe.apple/moe.core.native/moe.sdk/src/MOE.mm`, function `Java_org_moe_core_MOE_handleStartup`. Called from `MOE.handleStartup()` which is called from `MOE.init()` (`moe-core/moe.apple/moe.core.java/src/main/java/org/moe/core/MOE.java:86-89`).

Order of operations:

1. **Load `objc-bindings.txt` first.** For each `objcName\tjavaFQN` line call `handleObjCBindingPreregister(env, objc, java)` — the helper in `natj/src/main/native/natj/ObjCRuntime.mm` that JNI-calls `ObjCRuntime.registerUnloadedObjCBinding(String, String)`. This populates `unloadedObjCBindings` on the ObjC runtime so it's ready before any subsequent `<clinit>` can call `resolveObjCClass`.
2. **Load `preregister.txt` second.** For each line call `handleStartup(env, name)` (defined in `natj/src/main/native/natj/NatJ.cpp`), which dispatches to `handleCStartup` / `handleObjCStartup` / `forceInitClass`. For `@RegisterOnStartup` ObjC classes this triggers `<clinit>` and the binding's `NatJ.register()` runs, populating `resolvedObjCClasses`.

Why the order matters: any `@RegisterOnStartup` class might, during its `<clinit>`, do something that calls `resolveObjCClass` (rare but possible — e.g. an `IFrameworkInitializer` that touches a binding). If `unloadedObjCBindings` isn't populated yet, that lookup falls back to the parent.

## doRegistration: the Java side of the wire

`natj/src/main/java/org/moe/natj/objc/ObjCRuntime.java`, `doRegistration(Class<?>)`. Called from `NatJ.register()` via the runtime stack. Two things happen:

1. `registerClass(type)` (native) → returns the ObjC class pointer (registers selectors, instance variables, hybrid `+initialize` swizzle on the native side; populates `gObjCAllocMap` / `gObjCHybridMap` / `gObjCTypeMap` as appropriate).
2. `resolvedObjCClasses.put(objcClass, type)` — the cache that drives all subsequent `resolveObjCClass` calls.

`unloadedObjCBindings` is intentionally **not** cleaned up here. It's a pure fallback map populated once at startup and read on cache miss; the cache hit on `resolvedObjCClasses` short-circuits before ever consulting it again, so the entry is dead weight but cheap.

If you're adding a new kind of ObjC class, step (1) is where you'd hook in — `registerObjCClass` in `ObjCRuntime.mm` is the dispatcher. Step (2) is the only thing keeping fast-path resolution working; do not skip it.

## NatJ.register itself

`natj/src/main/java/org/moe/natj/general/NatJ.java`, `register()` (line 288). Discovers the calling class via stack trace, finds its `@Library` annotation (if any), and dispatches to `runtime.doRegistration(type)` on the appropriate `NativeRuntime` (one of `ObjCRuntime`, `CRuntime`, `CxxRuntime`). Idempotent — re-registering an already-registered class is a no-op via the `runtimesUnderConstruction` set and the `resolvedObjCClasses` cache.

## Adding a new build-time scan

If you need a third bytecode-pass output (say, a list of classes with a new annotation):

1. Extend `RegisterOnStartupChecker` to track the new annotation. Add a parallel field/getter; do **not** overload the existing ones.
2. Add a new `@OutputFile` convention to `StartupProvider`. Use a separate `try-with-resources` block per output file so a failure in one doesn't half-write another.
3. Add a `cp` line to `moe.build.script.sh.in` if the file needs to ship with the app.
4. Add a load step in `MOE.mm` that runs **before** the `preregister.txt` loop if the data needs to be visible to `<clinit>`s.
5. Add `RuntimeReflection.register` / `RuntimeJNIAccess.register` calls in `ReflectionCollectionFeature` for any new Java surface called from native.

The order in step (4) is load-bearing. Don't shuffle it.
