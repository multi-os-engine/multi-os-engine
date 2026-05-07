# Native JNI layer

The native side of NatJ lives in `natj/src/main/native/natj/`. This is C++/Objective-C++ that brokers between Java and the ObjC runtime. The pieces:

| File                     | Responsibility                                                       |
|--------------------------|----------------------------------------------------------------------|
| `NatJ.cpp` / `NatJ.h`    | JNI initialization, runtime registration, exception bridging, the dispatcher `handleStartup` and the helper `handleObjCBindingPreregister` |
| `ObjCRuntime.mm` / `.h`  | ObjC-specific JNI implementation, ObjC class registration, `gObjCHybridMap` / `gObjCTypeMap` / `gObjCAllocMap`, hybrid `+initialize` swizzle |
| `ObjCHandlers.mm`        | Method dispatch (`objc_msgSend` wrappers, selector → IMP routing)    |
| `ObjCInstanceContainer.mm` | Storage of Java references inside ObjC objects (associated objects) |
| `CRuntime.cpp` / `.h`    | C binding support (`@CFunction`, `@CVariable`)                       |
| `CxxRuntime.cpp` / `.h`  | C++ binding support                                                  |

## Key globals (in ObjCRuntime.mm)

These are file-scope `static` and mostly accessed only within `ObjCRuntime.mm`:

- `gRuntime` (`jobject`) — global ref to the singleton `ObjCRuntime` Java instance. Set in `Java_org_moe_natj_objc_ObjCRuntime_initialize`. Use the accessor `getObjCRuntime()` (`ObjCRuntime.h`) from outside the file.
- `gObjCAllocMap` (`NSMutableDictionary*`) — maps ObjC class → `ObjCAllocInfo` (Java construction info). Populated when an inherited Java→ObjC class is registered.
- `gObjCHybridMap` (`NSMutableDictionary*`) — maps `[NSValue valueWithPointer:objcClass]` → Java FQN string (slash-form). Populated when a hybrid `@RegisterOnStartup` class registers via `handleObjCStartup`.
- `gObjCTypeMap` (`NSMutableDictionary*`) — maps `[NSValue valueWithPointer:objcClass]` → boxed `jclass` global ref. Populated during `registerObjCClass` for hybrid and inherited classes.

The `[NSValue valueWithPointer:]` boxing avoids invoking `+initialize` on the keys (using the bare `Class` as a dictionary key would `[obj hash]` it, which can trigger initialization).

## JNI method-ID conventions

Each `gFooMethod` (`jmethodID`) is:
1. **Declared** as a global `jmethodID` near the top of the .mm file (`gFooMethod = NULL;`).
2. **Initialized** in `Java_org_moe_natj_objc_ObjCRuntime_initialize` (or the corresponding initializer for non-ObjC runtimes) via `env->GetMethodID(...)`.
3. **Called** via `env->CallVoidMethod(gRuntime, gFooMethod, ...)` (or `CallBooleanMethod`, etc.).

Adding a new method-ID follows that pattern verbatim. See `gRegisterUnloadedObjCBindingMethod` for a recent example: declared at line ~146, initialized at line ~360, called from `handleObjCBindingPreregister` at line ~1287.

## Bridging from native back to Java

Two patterns:

1. **JNIEXPORT functions** for Java `native` methods. Named `Java_<package>_<class>_<method>`. These are called *from* Java; they're entry points, not exits.
2. **`extern "C"` helpers** for native code that wants to dispatch to Java. The convention is to declare them in `NatJ.h` (regardless of where they're implemented) so any consumer can include one header. `handleStartup` lives in `NatJ.cpp`; `handleObjCBindingPreregister` is declared in `NatJ.h` but implemented in `ObjCRuntime.mm` because it needs the `gRuntime` and `gRegisterUnloadedObjCBindingMethod` globals.

When implementing one, **always handle exceptions**: after a `Call*Method`, check `env->ExceptionOccurred()` and `env->ExceptionClear()` (or rethrow). The native-startup loop in `MOE.mm` checks for exceptions after each call and bails — failure to clear here means the next JNI call asserts.

## Class registration (`registerObjCClass`)

`ObjCRuntime.mm:1445+`. Called from `Java_org_moe_natj_objc_ObjCRuntime_registerClass` for every `@ObjCClassBinding` / inherited class. Two big branches:

- **Original binding** (`@ObjCClassBinding`): looks up the ObjC class by name (`objc_getClass(classCName)`), builds the Java construction info, and stores it in `gObjCAllocMap` keyed by the ObjC class.
- **Inherited / new** (Java subclass of an ObjC class): allocates a new ObjC class via `objc_allocateClassPair`, registers selectors, and stores the alloc info via `objc_setAssociatedObject`-style indexed ivars (`getAllocInfoForClass`).

If you're adding a new annotation that affects registration, this is the dispatcher. Avoid restructuring it — the order of operations matters (`+initialize` swizzle vs. selector registration vs. class pair finalisation).

## Hybrid `+initialize` swizzle

`handleObjCStartup` (`ObjCRuntime.mm:175+`) replaces the ObjC class's `+initialize` method with `initialize_hybrid` so the hybrid Java implementation gets called when the ObjC runtime first touches the class. The original `+initialize` is preserved under a custom selector and chained. **Don't swizzle it twice** — the duplicate-hybrid check at `ObjCRuntime.mm:249-264` throws `IllegalArgumentException` if `class_replaceMethod` returns the swizzled IMP itself (meaning we already swizzled this class). The Gradle-side warning in `StartupProvider:118-132` catches this earlier.

## Adding a new native helper that calls into Java

Cookbook based on `handleObjCBindingPreregister`:

1. **Declare** in `NatJ.h` next to `handleStartup`/`handleShutdown`:
   ```cpp
   extern "C" void myHelper(JNIEnv* env, ...);
   ```
2. **Add a `jmethodID`** for the Java method you'll call. Declare at top of `ObjCRuntime.mm` (`jmethodID gMyMethod = NULL;`); initialize in `Java_..._ObjCRuntime_initialize` via `env->GetMethodID(gObjCRuntimeClass, "myMethod", "(...sig...)V")`.
3. **Implement** in `ObjCRuntime.mm`. Convert C strings to `jstring` via `env->NewStringUTF`; call via `env->CallVoidMethod(gRuntime, gMyMethod, ...)`; release locals via `env->DeleteLocalRef`; check/clear exceptions.
4. **Register the Java method for JNI access** in `ReflectionCollectionFeature.java`'s `registerNatJ`:
   ```java
   RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("myMethod", String.class, ...));
   ```
   Without this, native-image strips the method and the JNI lookup throws.
5. **Call from `MOE.mm`** (or wherever) — include `MOE.h` / `NatJ.h`, `extern "C"` declare the helper, call it. Always wrap multiple calls in `@autoreleasepool`.

## Lifetime / reference rules of thumb

- `env->NewStringUTF` returns a local ref. Always `DeleteLocalRef` after the call, or rely on `PushLocalFrame`/`PopLocalFrame` for batches.
- `env->NewGlobalRef` is what makes a `jclass` / `jobject` survive across JNI calls. Used for all the `g*Class` and `g*Method` setup.
- ObjC `id` objects are reference-counted manually in this codebase (no ARC). `[obj retain]` / `[obj release]` on retention boundaries; double-check when adding/removing from `gObjC*Map`.
- The native side sometimes stores Java references inside ObjC objects via `objc_setAssociatedObject` — see `ObjCInstanceContainer.mm`. If you touch lifetime there, also touch the cleanup paths in `ObjCRuntime.mm` (`cleanupObjCProxy`, `cleanupObjCBlock`).

## Building and testing the native code

The native code is compiled via Xcode as part of the iOS framework build, not via Gradle (Gradle delegates to Xcode for .mm files). `clang -fsyntax-only` outside the Xcode context fails because libffi headers and a configured `jni.h` aren't on the include path — that's expected. To validate native changes, build a sample app via the regular Gradle/Xcode flow and inspect the linker output / runtime symptoms.
