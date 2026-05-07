---
name: moe-classvalidator
description: Pre- and post-R8 bytecode passes that prep a user app for native-image AOT — `ClassValidate` (pre-R8 ASM rewrites), `ReflectionCollect`, `ResourceCollect` Gradle tasks (`tools/moe.plugin.gradle/src/main/kotlin/org/moe/gradle/tasks/`) plus the engine in `tools/moe.tools.classvalidator/`. Pre-R8 ASM passes fix NatJ binding classes (annotation inheritance, `<clinit>` `NatJ.register` injection, package remap); post-R8 collectors emit `reflection-config.json` / `resource-config.json` for native-image. TRIGGER when: editing under `tools/moe.tools.classvalidator/src/main/kotlin/`; modifying `ClassValidator`, `AddMissingAnnotations`, `AddMissingNatJRegister`, `RewriteChangedBindingClasses`, `NatJRuntime`, `ProtocolCollector`, `CollectSimpleReflectionConfig`, `CollectReflectionConfig`, `ReflectionCollector`, `ResourceCollector`, `ReflectionConfig`, `ResourceConfig`; editing `ClassValidate.kt` / `ReflectionCollect.kt` / `ResourceCollect.kt` task wrappers; touching baselines `moe-core/moe.apple/tools/{jni,reflection}-config-base.json`; symptoms "missing reflection registration", "NatJ.register not called", "annotation lost across override", "Class not found in native-image", "wrong calling convention", "ProGuard kept/dropped wrong member"; `MoeExtension.proguard.level` (`app`/`platform`/`all`) branches. SKIP: runtime-side registration / `objc-bindings.txt` / `preregister.txt` / `ObjCObjectMapper` / `ObjCRuntime` — `natj-runtime`; the `NativeImage` task that consumes the JSON output — `moe-app-build`.
---

# MOE ClassValidator & SVM Config Collection

The user-side Gradle plugin (see `moe-app-build` skill) runs three bytecode passes per app build that together: (a) silently fix Java binding classes so they behave correctly at runtime, and (b) emit the JSON reflection/resource configs `native-image` needs to keep NatJ-touched members across AOT.

## Where it sits in the app pipeline

```
compileJava → jar
                │
                ▼
        ClassValidate ───────────► outputJars (per-jar copies, rewritten in place)
                │
                ▼
              R8 (minify + ProGuard) ───► outJar (post-R8, possibly renamed members)
                │
       ┌────────┴────────┐
       ▼                 ▼
ReflectionCollect    ResourceCollect            (also: StartupProvider — see natj-runtime skill)
       │                 │
       │                 │
       └────────┬────────┘
                ▼
            NativeImage  (consumes reflection-config.json + resource-config.json)
```

`ClassValidate` is **before** R8 — it must run on un-minified classes so it can read annotation/superclass info from the original symbols. `ReflectionCollect` and `ResourceCollect` are **after** R8 — they emit configs that reference the post-R8 names that will actually be looked up at runtime.

This is the opposite ordering from `RegisterOnStartupChecker` / `StartupProvider` (covered by `natj-runtime`), which also runs after R8 to emit `preregister.txt` and `objc-bindings.txt`. Don't conflate them: they read the same post-R8 jar but produce different artifacts for different runtime consumers.

## ClassValidate — bytecode rewrites (pre-R8)

`ClassValidator.process` chains three `ClassVisitor`s in this exact order:

```kotlin
next
    .let(::AddMissingAnnotations)
    .let(::AddMissingNatJRegister)
    .let(::RewriteChangedBindingClasses)
```

ASM visitor chains run **outermost first when reading, innermost first when writing**. So events flow: `AddMissingAnnotations` → `AddMissingNatJRegister` → `RewriteChangedBindingClasses` → `ClassWriter`. Reordering changes semantics — e.g. `AddMissingNatJRegister` reads `RUNTIME_DESC` from annotations that `AddMissingAnnotations` may have just synthesized.

Every class under `java/*` is copied through unchanged. Every class under `org/moe/natj/*` is skipped by all three passes (the runtime is its own ground truth). Everything else is fair game.

### AddMissingAnnotations
Per method: walks the parent classes/interfaces (via `getParentImplementation`) until it finds an override target. If the override target carries any annotation in `NatJRuntime.Annotations.OPTIONALS_DESC` (e.g. `@ByValue`, `@NFloat`, `@Selector`, `@MappedReturn`) on the method/return/parameter and the subclass method doesn't, it copies the annotation onto the subclass method. Skipped if the subclass method itself has `@Selector` (treated as authoritative).

This exists because Java's annotation inheritance only works for class-level `@Inherited` annotations — method-level NatJ annotations need explicit propagation, and binding authors / users overriding bindings always forget. Without this, the wrong calling convention is generated for the override.

### AddMissingNatJRegister
Triggers if the class either extends `NativeObject` (transitively, via reflective class loading) **or** carries `@Runtime`. If the class has no `<clinit>`, it generates one whose only instruction is `INVOKESTATIC org/moe/natj/general/NatJ.register()V`. If a `<clinit>` exists and already calls `NatJ.register()`, it is left alone. Otherwise the call is **inserted as the first instruction** of the existing `<clinit>`.

The first-instruction rule is load-bearing: any other static-initializer code might touch native methods or registered selectors, and those need the runtime metadata to exist before the access. Don't move the call later.

The pass uses `getClassFor` (i.e. `Class.forName` against the classpath) to walk the superclass chain. That means missing transitive superclasses on the classpath cause the check to silently return `false` and skip injection. The `ChildFirstClassLoader` + classpath assembly in `ClassValidate.run()` is what makes this work for app code; if you change classpath composition (the ProGuard-level branches in `ClassValidate.setupMoeTask`), test that this lookup still resolves.

### RewriteChangedBindingClasses
Pure `ClassRemapper` over a small `remappingConfig` map (currently 6 entries — `apple/coregraphics/{enums,struct}/CG*` → `apple/corefoundation/{enums,struct}/CG*`). This rewrites stale references when bindings get reorganized between iOS SDK versions. To handle a new SDK reorg: add a pair to `remappingConfig`. No other moving parts.

### ProGuard-level branches in ClassValidate.setupMoeTask
The convention closures decide which jars are *input* (rewritten) vs *library* (loaded into classpath but not rewritten):

| `proguardLevel` | Input includes core+platform jars? |
|---|---|
| `app` | No — both are library-only |
| `platform` | platform jar is rewritten, core is library |
| `all` | both rewritten |

The "all" branch is what `moe-svm` typically runs. `ReflectionCollect.run()` currently throws on anything other than `all`.

## ReflectionCollect — emit reflection-config.json (post-R8)

`ReflectionCollector.process` walks every class in the R8 output jar with **`CollectSimpleReflectionConfig`**. Note: there's also a `CollectReflectionConfig` class with much more sophisticated logic (FieldInspector, MethodInspector, opaque-ptr tracking, lambda metafactory inspection for blocks). It is **not currently wired in** — `ReflectionCollector.process` only uses the simple one. The complex one was likely the original implementation; the simple one is what the build actually depends on. Don't assume the complex one runs.

`CollectSimpleReflectionConfig` does one thing: for any class annotated `@RegisterOnStartup`, register the class itself plus every method defined on it. That's it. Everything else needed for reflection comes from `moeSDK.reflectionConfigBaseFile` (the static `reflection-config-base.json` shipped in the SDK at `moe.apple/tools/`).

The output goes to `${buildDir}/moe/{sourceSet}/reflection/{mode}/reflection-config.json`. The main class (from `Info.plist` `MOE.Main.Class`) is also added so its `main([Ljava/lang/String;)V` survives.

`NativeImage.setupMoeTask` then composes the final input:
```
JNI:        sdk/jni-config-base.json  + reflection-config.json  + project/jni-config.json (optional)
Reflection: sdk/reflection-config-base.json  + reflection-config.json  + project/reflection-config.json (optional)
            + (test) testClassesProvider.reflectionConfigFile
Resources:  resourceCollect output  + project/resource-config.json (optional)
Proxy:      project/dynamic-proxies.json (optional)
```

`reflection-config.json` is fed to **both** `-H:JNIConfigurationFiles` and `-H:ReflectionConfigurationFiles` — JNI registrations are a strict subset, and the simple collector's per-`@RegisterOnStartup`-class entries are valid for both.

## ResourceCollect — emit resource-config.json (post-R8)

`ResourceCollector.collect` (gated by `moeExtension.resources.detectionOptions.isEnabled`) walks the R8 jar and the `ResourcePackager` output, classifying entries:
- `.properties` filenames matching `*_<locale>.properties` → bundle entries (so SVM keeps `ResourceBundle.getBundle` working)
- Everything else not matching `excludePatterns` → resource regex include
If detection is disabled, an empty `ResourceConfig` is emitted; users supply their own `resource-config.json`.

`ResourceConfig.save` writes the SVM JSON shape: `{ resources: { includes: [{pattern: ...}] }, bundles: [{name: ...}] }`.

## ProtocolCollector — auxiliary (no Gradle task)

Standalone utility (`ProtocolCollector.process`). Walks classes and for each method, finds parent implementations carrying `@Selector` and reports any that come from an interface annotated `@ObjCProtocolName`. Result is a `Set<String>` of internal protocol names. Currently called from… nowhere on the active path — kept as a building block for future ProGuard rule refinement (see TODO in source). If you wire it up, the consumer needs to translate the internal names to ProGuard `-keep` rules.

## Critical files

| Concern | File |
|---|---|
| Pass orchestration | `tools/moe.tools.classvalidator/src/main/kotlin/org/moe/tools/classvalidator/ClassValidator.kt` |
| Annotation propagation | `.../classvalidator/natj/AddMissingAnnotations.kt` + `AnnotationHelper.kt` |
| `<clinit>` injection | `.../classvalidator/natj/AddMissingNatJRegister.kt` |
| Class-name remap | `.../classvalidator/natj/RewriteChangedBindingClasses.kt` |
| NatJ annotation/class constants | `.../classvalidator/natj/NatJRuntime.kt` |
| Reflection collector (active) | `.../classvalidator/substrate/CollectSimpleReflectionConfig.kt` + `ReflectionCollector.kt` |
| Reflection collector (defined but unused) | `.../classvalidator/substrate/CollectReflectionConfig.kt` |
| Reflection JSON model | `.../classvalidator/substrate/ReflectionConfig.kt` |
| Resource collector | `.../classvalidator/substrate/ResourceCollector.kt` + `ResourceConfig.kt` |
| Gradle task: pre-R8 rewrite | `tools/moe.plugin.gradle/src/main/kotlin/org/moe/gradle/tasks/ClassValidate.kt` |
| Gradle task: post-R8 reflection | `.../moe/gradle/tasks/ReflectionCollect.kt` |
| Gradle task: post-R8 resources | `.../moe/gradle/tasks/ResourceCollect.kt` |
| Static config baselines (shipped in SDK) | `moe-core/moe.apple/tools/{jni,reflection}-config-base.json` |

## Conventions worth knowing without reading further

- **Skip `org/moe/natj/*` and `java/*`.** All three rewrite passes already do this; if you add a new pass, do the same. The runtime classes are their own ground truth and rewriting them tends to break loading order.
- **Don't introduce annotations to `NatJRuntime.OPTIONALS_DESC` lightly.** `AddMissingAnnotations` propagates everything in that list; adding an annotation that is *not* safe to inherit silently breaks overrides across the entire SDK.
- **`CollectSimpleReflectionConfig` is intentionally minimal.** The reason most reflection works in MOE apps is the static base config in `moe-core/moe.apple/tools/reflection-config-base.json`. If you find yourself needing a new dynamically-detected entry, prefer adding to the base config first; only extend the collector if the entry is genuinely user-class-shape-dependent.
- **Don't activate `CollectReflectionConfig`** without verifying the SDK base config still works alongside it — it adds many entries the base already covers, and SVM warns on duplicates.
- **`ClassValidate` is not incremental.** It deletes its output dir and rewrites every input jar from scratch on every run. If you make it incremental, the R8 task's input fingerprint must still change when any input did.
