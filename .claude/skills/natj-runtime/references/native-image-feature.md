# GraalVM native-image: ReflectionCollectionFeature

`moe-core/moe.apple/moe.core.java/src/main/java/org/moe/core/svm/ReflectionCollectionFeature.java` is the `org.graalvm.nativeimage.hosted.Feature` that tells native-image which classes/methods/fields to keep available for reflection and JNI in the AOT-compiled binary.

Without correct registrations here, every `Class.forName`, `getMethod`, or JNI-from-native call that "works in the JVM" silently breaks in release builds. Most "works on simulator, fails on device" bugs trace back to a missing entry in this file.

## Activation

`moe-core/moe.apple/moe.core.java/src/main/resources/META-INF/native-image/org/multi-os-engine/core/native-image.properties`:

```
Args = --features=org.moe.core.svm.ReflectionCollectionFeature
```

Native-image picks the file up via the `META-INF/native-image` ServiceLoader pattern.

## Three reflection APIs

| API                                  | Use it for                                                       |
|--------------------------------------|------------------------------------------------------------------|
| `RuntimeReflection.register(class)`  | Make `Class.forName(name)` succeed for `name`                    |
| `RuntimeReflection.register(method)` | Make `getDeclaredMethod` find it; allow `method.invoke`          |
| `RuntimeReflection.registerAllDeclaredMethods(class)` | Bulk variant for entire classes                 |
| `RuntimeJNIAccess.register(method)`  | Allow native code to look up the method via `GetMethodID`        |
| `RuntimeJNIAccess.register(class)`   | Allow native code to `FindClass` the class                       |
| `RuntimeJNIAccess.register(field)`   | Allow native code to read/write the field                        |
| `RuntimeProxyCreation.register(...)` | Allow `java.lang.reflect.Proxy.newProxyInstance` for the iface   |

`RuntimeReflection` and `RuntimeJNIAccess` are independent — registering for reflection does **not** make the same surface JNI-accessible, and vice-versa. When in doubt, register both.

## How the file is structured

`registerNatJ(BeforeAnalysisAccess)` and `registerSQLite(...)` are split for clarity. `beforeAnalysis` calls them and then sets up four `registerSubtypeReachabilityHandler` callbacks:

1. **`OpaquePtr.class`** — for every interface implementing `OpaquePtr`, register its `$Impl` class's `Pointer` constructor.
2. **`NativeObject.class`** — for every `NativeObject` subclass, register the `Pointer` constructor.
3. **`StructObject.class`** — for every `StructObject` subclass, register the `__natjCache` field for both reflection and JNI, and all declared methods for reflection.
4. **`ObjCObject.class`** — **the binding handler.** For every `ObjCObject` subtype, register the class itself for reflection (so `Class.forName` works post-AOT — required by the lazy-load path in `resolveObjCClass`), then `registerAllDeclaredMethods` and `registerAllMethods`, then for every method annotated `@Selector` (concrete only) register it for both reflection and JNI.
5. A fifth handler walks every `Object` subtype and pulls in `call_*` methods plus `@Runtime` interfaces; this is the catch-all for runtime annotation processing.

When adding a new annotation that affects native dispatch, this is where you wire it up. Mirror the existing `@Selector` pattern.

## When to add new entries

- **You added a new method on `ObjCRuntime` (or any class) that's called from native code via JNI.** Add `RuntimeJNIAccess.register(ObjCRuntime.class.getDeclaredMethod("foo", ...))` in `registerNatJ`. The recent `registerUnloadedObjCBinding` registration is the template.
- **You added a new annotation type.** Add it to `NATJ_ANNOTATION_CLASSES` (line 80) so the annotation class itself and all its methods are JNI-accessible.
- **You added a new intermediate interface that bindings implement.** If native code does `IsAssignableFrom` against it, register it via `RuntimeJNIAccess.register(YourIface.class)`.
- **You introduced a new field that's read/written from native.** Register it via `RuntimeJNIAccess.register(field)` in the appropriate reachability handler.

## Diagnosing native-image stripping

Symptoms in release builds:

- `Class.forName(...)` throws `ClassNotFoundException` — class not registered for reflection. The recent fix added `RuntimeReflection.register(aClass)` inside the `ObjCObject` reachability handler precisely for this reason; before it, the lazy-load path in `resolveObjCClass` couldn't load any binding from `objc-bindings.txt`.
- `GetMethodID` returns NULL in native code — method not registered for JNI access. Check the method exists in the registered set.
- `FindClass` returns NULL — class not registered for JNI access. `RuntimeJNIAccess.register(class)`.
- `getDeclaredMethods()` returns an unexpectedly empty array — class is registered but methods aren't. Use `registerAllDeclaredMethods` or register specific ones.

Native-image's `--initialize-at-build-time` and `--initialize-at-run-time` flags can also strip things via class initialization side effects; if you're chasing a stripping bug, also check `native-image.properties` and any other `Feature` impls.

## Don't bother re-registering

The reachability handlers run during analysis; native-image dedupes. You can register the same class/method twice safely. But each call costs analysis time, so don't gratuitously do `registerAllDeclaredMethods` if you only need one method.
