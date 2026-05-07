---
name: natj-runtime
description: NatJ's Java ↔ Objective-C/C/C++ binding runtime — `natj/src/main/{java,native}/` plus the post-R8 `RegisterOnStartupChecker`/`StartupProvider` that emit `preregister.txt`/`objc-bindings.txt`, plus `ReflectionCollectionFeature` and `JDWPSubstitutions` under `moe-core/moe.apple/moe.core.java/.../svm/`. Two pipelines feeding one resolution path: `@RegisterOnStartup` → eager `preregister.txt`, `@ObjCClassBinding` → lazy `objc-bindings.txt`; both consumed by `MOE.mm`'s `handleStartup`, then `ObjCObjectMapper.objectToJava` → `ObjCRuntime.resolveObjCClass` maps incoming ObjC pointers back to Java binding classes. TRIGGER when: editing under `natj/src/main/{java,native}/org/moe/natj/`; modifying `NatJ.register*`, `ObjCRuntime`, `ObjCObjectMapper`, the `*Mapper` family, the C++/ObjC++ JNI bridge (`NatJ.h`, `ObjCRuntime.mm`, `gObjCHybridMap`/`gObjCTypeMap`/`gObjCAllocMap`); annotations `@RegisterOnStartup`, `@ObjCClassBinding`, `@ObjCClassName`, `@Runtime`; build-time `RegisterOnStartupChecker` / `StartupProvider`; `ReflectionCollectionFeature` / `JDWPSubstitutions`; `MOE.mm`'s `handleStartup`; symptoms `objectToJava` returns wrong Java class, `NatJ.register` reentrancy, ObjC instance arriving as `NSObject` instead of binding subclass, hybrid `+initialize` swizzle problems. SKIP: pre-R8 ASM passes that fix up binding classes — `moe-classvalidator`; emitting bindings from headers — `moe-natjgen`.
---

# NatJ Runtime

The Java SDK shipped under `moe-core/moe.apple/...` is a tree of `@ObjCClassBinding`-annotated classes. NatJ's job at runtime is twofold: (a) make sure each binding is registered with the native side at the right moment, and (b) when an ObjC instance arrives from native code, hand the right Java binding class back. Most of the surface area is around the second job — the registration machinery exists primarily to keep the resolution path's caches and side-tables populated.

## Two registration pipelines, one resolution path

```
build time                                         runtime
──────────                                         ────────
R8-minified jar                                    iOS .app launches
       │                                                  │
       ▼                                                  ▼
RegisterOnStartupChecker (ASM bytecode pass)       MOE.mm reads:
       │                                              objc-bindings.txt   (lazy map)
       ▼                                              preregister.txt     (eager init)
StartupProvider task                                      │
       │                                                  ▼
       ├── preregister.txt   (one Java FQN per line)  for each line in bindings:
       └── objc-bindings.txt (objcName:javaFQN)         handleObjCBindingPreregister →
                                                           ObjCRuntime.registerUnloadedObjCBinding
                                                       for each line in preregister:
                                                         handleStartup → handleObjCStartup
                                                           or forceInitClass

       ObjC callback fires
              │
              ▼
ObjCObjectMapper.objectToJava(peer, info)
              │
              ├─ inherited / hybrid / proxy → direct lookup paths
              └─ binding → ObjCRuntime.resolveObjCClass(longClassPtr)
                              │
                              ├─ resolvedObjCClasses cache  ← populated by doRegistration
                              ├─ preferablePackages, sdkPackages, externalPackages
                              │     (Class.forName(pack + "." + objcName) — loads + registers)
                              ├─ unloadedObjCBindings side-table  ← from objc-bindings.txt
                              │     (Class.forName(javaFQN) — loads + registers)
                              └─ recursive parent fallback
```

Two pipelines exist because they answer different questions:

| Pipeline | Answers | Cost |
|---|---|---|
| `@RegisterOnStartup` → `preregister.txt` | "this class MUST be registered before `main()` runs" (e.g. hybrids, framework initializers) | eager class load at app launch |
| `@ObjCClassBinding` → `objc-bindings.txt` | "if an ObjC instance of class X arrives, here's the Java FQN to load" | lazy load on first occurrence |

Both files land in the iOS bundle under `Resources/`, copied by an Xcode shell-script phase (template in `moe.generator.project/.../moe.build.script.sh.in`) — there is no Gradle `Sync` task for them. Both are read by `MOE.mm`'s `Java_org_moe_core_MOE_handleStartup`, with `objc-bindings.txt` loaded **before** `preregister.txt` so any `<clinit>` triggered by the eager phase can already see the lazy side-table.

## Critical files

| Concern | File |
|---|---|
| ObjC pointer → Java class resolution | `natj/src/main/java/org/moe/natj/objc/ObjCRuntime.java` (`resolveObjCClass`, `doRegistration`) |
| ObjC pointer → Java instance | `natj/src/main/java/org/moe/natj/objc/map/ObjCObjectMapper.java` (`objectToJava`, `toJava`) |
| Static-init registration entry point | `natj/src/main/java/org/moe/natj/general/NatJ.java` (`register`, `registerRuntime`) |
| Annotations | `natj/src/main/java/org/moe/natj/general/ann/RegisterOnStartup.java`, `objc/ann/ObjCClassBinding.java`, `objc/ann/ObjCClassName.java` |
| Build-time bytecode scanner | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/internal/RegisterOnStartupChecker.java` |
| Build-time task | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/StartupProvider.java` |
| iOS bundle copy script template | `tools/moe.generator.project/src/main/resources/org/moe/generator/project/moe.build.script.sh.in` |
| Native JNI bridge (entry header) | `natj/src/main/native/natj/NatJ.h` (`handleStartup`, `handleObjCBindingPreregister`) |
| Native ObjC runtime | `natj/src/main/native/natj/ObjCRuntime.mm` (registration, `gObjCHybridMap`, `gObjCTypeMap`) |
| iOS startup hook | `moe-core/moe.apple/moe.core.native/moe.sdk/src/MOE.mm` (`Java_org_moe_core_MOE_handleStartup`) |
| GraalVM Feature | `moe-core/moe.apple/moe.core.java/src/main/java/org/moe/core/svm/ReflectionCollectionFeature.java` |

## Deeper references

- `references/class-resolution.md` — the four object kinds `ObjCObjectMapper` distinguishes, the five steps of `resolveObjCClass`, why `Class.forName` is load-bearing, and the `info.type` guard in the secondary fallback.
- `references/registration-pipeline.md` — `RegisterOnStartupChecker` (the ASM pass), `StartupProvider` (the Gradle task that consumes its output), and the order-of-operations in `MOE.mm`'s startup loop.
- `references/native-jni-layer.md` — the C++/ObjC++ side: globals (`gObjCHybridMap`, `gObjCTypeMap`, `gObjCAllocMap`), `jmethodID` conventions, `registerObjCClass`, the hybrid `+initialize` swizzle, and the cookbook for adding a new native helper that calls into Java.
- `references/native-image-feature.md` — what `ReflectionCollectionFeature` registers and why each entry exists; cookbook for adding new reflection/JNI surfaces.

## Conventions worth knowing without reading further

- **`NatJ.register()` is idempotent and reentrant.** Safe to call from a `<clinit>` while another thread is in `resolveObjCClass`; Java monitors on `resolvedObjCClasses` are reentrant. Don't add cross-monitor coordination on top.
- **`Class.forName` in `resolveObjCClass` is load-bearing.** It's not just a name lookup — it triggers the binding's static initializer, which calls `NatJ.register()`, which populates `resolvedObjCClasses`. Refactoring to a no-load lookup silently breaks registration for any class not previously initialized.
- **Post-R8 names matter.** Anything added to `preregister.txt` or `objc-bindings.txt` is consumed *after* R8 minification. Use `'/'`-separated internal names from ASM and convert to `'.'` only when writing the output file.
- **`@ObjCClassName` is optional.** When absent, the ObjC name defaults to the simple Java class name. Native side uses the Java reflection method name (`gGetClassNameMethod`); build-time passes use the same convention.
- **iOS bundle packaging happens via Xcode shell script, not Gradle.** New auxiliary files that need to ship in the `.app` get a `cp` line in `moe.build.script.sh.in`.
