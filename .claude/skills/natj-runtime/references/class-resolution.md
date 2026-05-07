# ObjC pointer → Java instance resolution

Every time native ObjC code returns an instance to Java, it goes through this path. The mapper classifies the incoming peer first; only one of the four classifications has non-trivial logic.

## The four kinds of objects

`ObjCObjectMapper.objectToJava(long peer, JavaObjectConstructionInfo info)` (file: `natj/src/main/java/org/moe/natj/objc/map/ObjCObjectMapper.java`) classifies the incoming peer first:

```java
boolean isInherited = ObjCRuntime.isKindOfInheritedClass(peer);
boolean isProxy     = !isInherited && ObjCRuntime.isKindOfProxyClass(peer);
boolean isHybrid    = !isInherited && !isProxy && ObjCRuntime.isKindOfHybridClass(peer);
boolean isBinding   = !isInherited && !isProxy && !isHybrid;
```

| Kind        | Java side                                    | Class lookup path                                                                                |
|-------------|----------------------------------------------|--------------------------------------------------------------------------------------------------|
| inherited   | Java subclass of an ObjC class               | `info.type` (the static expected type)                                                           |
| proxy       | Java proxy implementing ObjC protocol         | `info.type` + protocol info, no class search                                                    |
| hybrid      | `@RegisterOnStartup` Java class with `+initialize` swizzle into ObjC | `ObjCRuntime.getJavaTypeForHybridClass(getObjectClass(peer))` (native lookup in `gObjCHybridMap`) |
| binding     | Plain `@ObjCClassBinding`                    | `ObjCRuntime.resolveObjCClass(getObjectClass(peer))` — the path with all the moving parts        |

The first three reach their Java class in a single lookup. Everything below is about the fourth.

## resolveObjCClass: the five steps

`natj/src/main/java/org/moe/natj/objc/ObjCRuntime.java`, `resolveObjCClass(long cls)`. Inside one nested `synchronized` block over `resolvedObjCClasses`, `preferablePackagesForPrefixes`, `sdkPackages`, `externalPackages`, and `unloadedObjCBindings`:

1. **Cache lookup** in `resolvedObjCClasses` (`HashMap<Long, Class<?>>`, keyed by ObjC class pointer). Populated by `doRegistration()` whenever a binding's `<clinit>` calls `NatJ.register()`. Hit → done.
2. **Private-class walk-up.** While the ObjC class name starts with `_`, walk up the ObjC superclass chain checking the cache. This is how SDK-internal subclasses (e.g. `_NSConcreteValue`) find their way to the closest public ancestor (`NSValue`).
3. **Package search by name.** Three nested loops:
   - `preferablePackagesForPrefixes` — class-name-prefix → preferred packages (e.g. `"NS"` → `apple.foundation`, `apple.uikit`, `apple`).
   - `sdkPackages` — every SDK package registered in the constructor (per platform).
   - `externalPackages` — registered by `IFrameworkInitializer` at startup.
   Each loop tries `Class.forName(pack + "." + objcName)`. **A successful `Class.forName` runs the binding's `<clinit>`, which calls `NatJ.register()`, which populates `resolvedObjCClasses`.** This is what makes the path "self-heal" for any class whose package is registered.
4. **`unloadedObjCBindings` side-table lookup.** `Map<String, String>` (objcName → java FQN), populated at startup from `objc-bindings.txt` by `registerUnloadedObjCBinding`. On a hit, `Class.forName(javaFQN)` again triggers `<clinit>` → `NatJ.register()`. This catches bindings whose Java package was never registered as an SDK package.
5. **Parent fallback.** `javaClass = resolveObjCClass(getClassParent(cls))`. Recurses up the ObjC superclass chain until something matches; bottoms out at the hierarchy root (`NSObject` for Apple platforms).

The end of the method caches whatever was resolved (or the hierarchy root) under every ObjC class pointer walked along the way (the `resolvables` list). Subsequent lookups of the same ObjC class hit the cache directly.

## Why `Class.forName` is load-bearing

The package-search loops look like a name-to-class lookup, and they are — but they're also a side-effecting class load. Two things happen on a successful `Class.forName`:

1. The class is returned (the surface behavior).
2. The class's `<clinit>` runs, which calls `NatJ.register()`, which calls `doRegistration()`, which **inserts into `resolvedObjCClasses`** keyed by the native class pointer.

The second part is what populates the cache for next time. A refactor to a no-load lookup (`findLoadedClass` or similar) breaks registration for any class not previously initialized. If you need a peek-without-load primitive, build a separate side-table — `unloadedObjCBindings` is exactly that pattern.

## The secondary fallback in ObjCObjectMapper

After `resolveObjCClass` returns, `objectToJava` does one more guard:

```java
if (!info.type.isAssignableFrom(cls)) {
    if (info.type.isInterface() && info.type.isAnnotationPresent(ObjCProtocolName.class)) {
        cls = ObjCOpaqueObject.class;
    } else {
        cls = info.type;     // override the resolved class
    }
}
```

If the resolved class isn't a subtype of the static expected type, the resolved answer is thrown away and the static type is used. This handles toll-free-bridged CF/NS pairs where the ObjC class hierarchy doesn't match the Java declaration. `info.type` always wins on conflict.

## Locking

The whole resolution is wrapped in nested `synchronized` blocks. Java monitors are reentrant, so it's safe for `Class.forName` to fire `<clinit>` → `NatJ.register()` → `doRegistration()` → `synchronized(resolvedObjCClasses)` while the outer `resolveObjCClass` already holds it. The `unloadedObjCBindings` monitor is taken in a consistent order (always inside the others), and any `Class.forName` call must release `unloadedObjCBindings` first.

If you add a new lock here, take it on the inside of the existing nest — never on the outside, and never in `doRegistration` ahead of `resolvedObjCClasses`. The current monitor order is `resolvedObjCClasses → preferablePackagesForPrefixes → sdkPackages → externalPackages → unloadedObjCBindings`.

## doRegistration: the cache write side

`ObjCRuntime.doRegistration(Class<?>)`. Called from `NatJ.register()` via the runtime stack. Two things happen:

1. `registerClass(type)` (native) → returns the ObjC class pointer (registers selectors, instance variables, hybrid `+initialize` swizzle on the native side; populates `gObjCAllocMap` / `gObjCHybridMap` / `gObjCTypeMap` as appropriate).
2. `resolvedObjCClasses.put(objcClass, type)` — the cache write that drives all subsequent `resolveObjCClass` calls.

`unloadedObjCBindings` is intentionally **not** cleaned up here. It's a pure fallback map populated once at startup and read on cache miss; the cache hit on `resolvedObjCClasses` short-circuits before ever consulting it again, so the entry is dead weight but cheap.

If you're adding a new kind of ObjC class, step (1) is where you'd hook in — `registerObjCClass` in `ObjCRuntime.mm` is the dispatcher. Step (2) is the only thing keeping fast-path resolution working; do not skip it.

## NatJ.register itself

`natj/src/main/java/org/moe/natj/general/NatJ.java`, `register()`. Discovers the calling class via stack trace, finds its `@Library` annotation (if any), and dispatches to `runtime.doRegistration(type)` on the appropriate `NativeRuntime` (one of `ObjCRuntime`, `CRuntime`, `CxxRuntime`). Idempotent — re-registering an already-registered class is a no-op via the `runtimesUnderConstruction` set and the `resolvedObjCClasses` cache.
