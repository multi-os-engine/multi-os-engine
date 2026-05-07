---
name: moe-natjgen
description: NatJGen — libclang-driven binding-generator engine at `tools/moe.generator.natjgen/` that walks C/Objective-C headers and emits NatJ-annotated Java via Eclipse JDT AST editors. Satellites: `tools/moe.tools.natjgen/` (config DSL, `.nbc`) and `tools/moe.binding.clang/` (libclang Java bindings). TRIGGER when: editing under `tools/moe.generator.natjgen/`, `tools/moe.tools.natjgen/`, `tools/moe.binding.clang/`; modifying `Indexer`, `ModelBuilder`, `ModelDowngrader`, `Generator`, `Configuration`, `Type`/`TypeResolver`/`TypeConfiguration`, any `*Manager` (`ObjCClassManager`, `CManager`, `CStructManager`, `CEnumManager`, `CInlineManager`, `COpaquePtrManager`, `CallbackManager`, `ObjCProtocolManager`, `ObjCExternalCategoryManager`), JDT `*Editor` classes, or `NatJGenNativeLoader`; how `.natjgen` XML / `.nbc` config is interpreted; debugging `UnsatisfiedLinkError` from a NatJGen run; the iOS-binding regen workflow (`UPDATE_IOS_BINDING.md`). SKIP: editing the *checked-in generated* `apple/**` tree at `moe-core/moe.apple/moe.platform.ios/src/main/java/` — see that directory's CLAUDE.md; the user-side `NatJGen` Gradle task wrapper — `moe-app-build`; NatJ runtime registration / `@RegisterOnStartup` / `@ObjCClassBinding` — `natj-runtime`.
---

# NatJGen — binding generator engine

NatJGen reads C / Objective-C headers via libclang and emits Java source files that NatJ can use at runtime. The engine is `tools/moe.generator.natjgen/`. Two satellite modules support it: `moe.tools.natjgen` (config DSL) and `moe.binding.clang` (libclang Java bindings). The Gradle-task wrapper in `moe.plugin.gradle` and the iOS SDK regeneration workflow are out of scope here — they consume this engine; if you're touching them, look at `moe-app-build` or the `UPDATE_IOS_BINDING.md` files in `moe-core/moe.apple/moe.platform.ios/` respectively.

> **`generateBindings` is a manual one-shot, not part of the normal SDK build.** The `apple/**` source tree under `moe-core/moe.apple/moe.platform.ios/src/main/java/` is checked-in generated code with manual fixes layered on top via `fix_manual_binding_changes.patch`. The lifecycle build just `javac`s those sources. NatJGen runs only when you intentionally regenerate (per `UPDATE_IOS_BINDING.md`).

## Module separation

| Module | Role |
|---|---|
| `moe.binding.clang` | Java bindings to libclang (`org.clang.*`). Bootstrapped by NatJGen against itself, then committed. Loads `libclang.dylib` from `java.library.path`. |
| `moe.tools.natjgen` | Pure data + JSON: `Bindings`, `FrameworkBinding`, `HeaderBinding`, `XcodeProject`, `XcodeTarget`, `XcodeWorkspace`, `ConfigurationBuilder`. No libclang dep. Knows the `.nbc` (NatJ Binding Configuration) format. |
| `moe.generator.natjgen` | The engine. Reads either a legacy `.natjgen` config or the lower-level config produced by `ConfigurationBuilder` from a `.nbc`, then drives libclang + JDT to emit Java. |

The split is "what to bind" (tools.natjgen) vs "how to bind" (generator.natjgen). The generator never reads `.nbc` directly — `ConfigurationBuilder.build()` lowers it to the legacy format the generator already understands.

## End-to-end pipeline

`Main.main_internal(args)` (`moe.generator.natjgen/.../Main.java`) takes `(workspace, projectName, configFile)`:

```
NatJGenNativeLoader.initNatives()        ← System.loadLibrary("clang"), ("natj")
        │
        ▼
MOEJavaProject(projectName, workspace)   ← Eclipse JDT IJavaProject handle
        │
        ▼
generate(project, root, conf)
        │
        ▼
Configuration.read(...)                  ← parses .natjgen XML or hands off to ConfigurationBuilder
        │
        ▼
Indexer.index(configuration)             ← libclang TU per header set
        │   ├─ visits decls, populates per-construct managers:
        │   │     CManager, CEnumManager, CStructManager, CInlineManager, COpaquePtrManager,
        │   │     ObjCClassManager, ObjCProtocolManager, ObjCExternalCategoryManager, CallbackManager
        │   └─ resolves types via TypeResolver (configured by TypeConfiguration)
        ▼
ModelBuilder.build()                     ← cross-references managers, fixes inheritance,
        │                                   merges categories, materializes generics
        ▼
ModelDowngrader.run()                    ← downgrades model to the Java target version
        │                                   (bindings target Java 1.8)
        ▼
Generator.generate()                     ← walks managers, emits/edits Java source via JDT AST
        │   ├─ ClassEditor, ClassMemberEditor, ConstructorEditor, MethodEditor,
        │   │     FieldEditor, InitializerEditor, ModifierEditor (in /natjgen/*Editor.java)
        │   ├─ Doc lookup: XcodeFullDocumentation, XcodeCommentDocumentation,
        │   │     XcodeLinkedDocumentation
        │   └─ Edits are AST-level: existing files are *modified*, not regenerated wholesale,
        │         so unrelated hand-edits often survive a regen
        ▼
project.save()                           ← JDT writes the formatted source files
```

Native libs are loaded via `NatJGenNativeLoader` from `java.library.path` — the Gradle task sets this to `rootProject.external.{llvm,natj}.jnipath`. If a NatJGen run dies with `UnsatisfiedLinkError`, suspect that wiring before suspecting the headers.

## The Configuration class — schema for `.natjgen`

`Configuration.java` (~92K, biggest file in the engine) is the in-memory representation of a `.natjgen` XML file. It's not just a property bag — it holds:

- The platform name (Apple SDK roots are looked up via `NativeSDKUtil`)
- Header inclusion lists (with framework / SDK path resolution)
- Per-package source root mapping (`PackageRoot` entries map ObjC package prefixes → output java packages)
- `TypeConfiguration` rules (overrides for how specific C types map to Java types)
- Manual class overrides (force a class into a specific package, rename it, blacklist methods, etc.)
- Output controls (where bindings go, whether inline functions get separate output, etc.)

A `.nbc` file going through `ConfigurationBuilder.build()` produces a synthetic `Configuration` — that's the only way Bindings/FrameworkBinding/HeaderBinding entries reach the engine.

## The type system: Type, TypeResolver, TypeConfiguration

`Type.java` (~53K) is the C/ObjC type representation: every type the indexer encounters becomes a `Type` instance with its kind (primitive, pointer, struct, function-pointer, ObjC class, ObjC protocol, block, generic param, …), constness, nullability, mapping target Java type, and a list of attributes.

`TypeResolver.java` (~38K) is the dispatcher: given a libclang `CXType` and a context (return vs param, inside a block vs not, struct vs not, etc.) it returns a `Type`. It applies the rules from `TypeConfiguration` in priority order:

1. Explicit per-class overrides (e.g. "treat `NSString*` as `String` in this method")
2. Per-attribute overrides (e.g. presence of `__nullable`, `NS_REQUIRES_RETAIN`)
3. Default ObjC mappings (`id` → `NSObject`, blocks → `@ObjCBlock` interfaces)
4. Default C mappings (numeric types respecting `NS_OPTIONS`, `NS_ENUM`)
5. Pointer fallback (`NULL`-able, opaque pointer)

`TypeConfiguration.java` is what the user populates via `<TypeConf>` blocks in `.natjgen` (or what `ConfigurationBuilder` synthesizes). Adding a new type kind is "add to `Type`'s tagged union" + "extend `TypeResolver`'s switch chain" + "let `TypeConfiguration` express the new override."

`UnsupportedTypeException` is the engine's standard escape hatch — when `TypeResolver` can't map a type and no rule covers it, the affected method/field is marked unsupported and the surrounding class still generates without it. Don't catch and ignore; let it bubble to the manager that classifies it as a `ValidationEntry`.

## The Managers — one per construct kind

Every C/ObjC declaration kind has a manager (in `tools/moe.generator.natjgen/src/main/java/org/moe/natjgen/`):

| Manager | Construct |
|---|---|
| `CManager` | Free C functions |
| `CEnumManager` | `enum`, `NS_ENUM`, `NS_OPTIONS` |
| `CStructManager` | `struct`, anonymous structs in fields |
| `CInlineManager` | `static inline` C functions (need C-side wrappers) |
| `COpaquePtrManager` | Opaque-pointer typedefs (`typedef struct _Foo* FooRef`) |
| `ObjCClassManager` (~51K, biggest) | `@interface` declarations including categories, properties, ivars, class clusters, generics |
| `ObjCProtocolManager` | `@protocol` |
| `ObjCExternalCategoryManager` | Categories on classes from another binding (separate compilation unit emission) |
| `CallbackManager` | Function-pointer types and ObjC blocks (lazy-emits `$Block_*` / `$Function_*` interfaces) |

Each manager is `AbstractUnitManager` or `AbstractModelEditor` based — the former owns a JDT `ICompilationUnit`, the latter edits one belonging to another manager. Manager lifecycle:

1. `Indexer` calls `manager.add(decl)` per declaration as it walks the TU
2. `ModelBuilder` calls `manager.resolve()` to cross-reference (e.g. `ObjCClassManager.resolve()` resolves super-classes to managers)
3. `Generator` calls `manager.generate()` which uses the editors to emit/modify Java source

`ObjCClassManager` is by far the most complex — it handles class clusters, categories merging, generic type parameters, hybrid bindings, manual overrides, ARC/MRR distinctions, and the `init*` family quirks. When debugging an ObjC binding emission issue, start there.

## JDT-based source editing

Every Java file the generator touches is loaded as a JDT `CompilationUnit`. Edits are AST-level via the *Editor classes:

| Editor | Concern |
|---|---|
| `ClassEditor` | Class declaration, modifiers, supers, type params, doc |
| `ClassMemberEditor` | Position-in-file, modifier ordering, common bookkeeping |
| `ConstructorEditor` | `<init>` shape, super call, `@Selector` placement |
| `MethodEditor` | Method signature, annotations, body (for `@NotImplemented` stubs) |
| `FieldEditor` | Static fields (constants, struct field offsets) |
| `InitializerEditor` | `static {}` blocks (rare; mostly for class-level setup) |
| `ModifierEditor` | Annotation+modifier list manipulation primitives |

Two consequences worth knowing:

- **Non-trivial hand-edits often survive a regen.** The editors only mutate AST nodes for declarations they're regenerating; nodes the generator doesn't touch are preserved verbatim. This is what makes the iOS SDK regen workflow viable — but don't *rely* on it for important customizations; use a patch instead.
- **Whitespace and comment preservation** comes from JDT's `ASTRewrite` infrastructure, not from anything the generator does. If a regen is producing weird whitespace, look at the JDT version (it's pinned in `moe.generator.natjgen/build.gradle`) before suspecting the editors.

## Application: a small dispatcher

`Application.java` is a CLI entrypoint distinct from `Main` — it takes a Bindings JSON (the user-DSL flow) and runs the equivalent generation. Currently used only in tests. The "real" entrypoint for users is `Main.main`, which is what the Gradle task `javaexec`s.

## Critical files

| Concern | File |
|---|---|
| Engine entrypoint | `tools/moe.generator.natjgen/src/main/java/org/moe/natjgen/Main.java` |
| Configuration model | `.../natjgen/Configuration.java` |
| Header walker | `.../natjgen/Indexer.java` |
| Cross-reference + post-walk | `.../natjgen/ModelBuilder.java` |
| Java target downgrade | `.../natjgen/ModelDowngrader.java` |
| Source emission orchestrator | `.../natjgen/Generator.java` |
| Type representation | `.../natjgen/Type.java` |
| Type resolution dispatcher | `.../natjgen/TypeResolver.java` |
| Type config DSL | `.../natjgen/TypeConfiguration.java` |
| Per-construct managers | `.../natjgen/{C,CEnum,CStruct,CInline,COpaquePtr,ObjCClass,ObjCProtocol,ObjCExternalCategory,Callback}Manager.java` |
| Manager bases | `.../natjgen/{AbstractUnitManager,AbstractModelEditor,AbstractModelElement,AbstractASTBase}.java` |
| JDT editors | `.../natjgen/{Class,ClassMember,Constructor,Method,Field,Initializer,Modifier}Editor.java` |
| ObjC method shape | `.../natjgen/{ObjCMethod,ObjCMethodFamily,ObjCMethodKind,ObjCAttributeInfo,ObjCGenericParamType}.java` |
| Validation channel | `.../natjgen/{ValidationEntry,UnsupportedTypeException,GeneratorException}.java` |
| Doc extraction | `.../natjgen/Xcode{Full,Comment,Linked}Documentation.java` |
| libclang helpers | `.../natjgen/ClangUtil.java` |
| Native lib bootstrap | `.../natjgen/nativelibs/NatJGenNativeLoader.java` |
| JDT project handle | `.../natjgen/helper/MOEJavaProject.java` |
| Config DSL — Bindings root | `tools/moe.tools.natjgen/src/main/java/org/moe/tools/natjgen/Bindings.java` |
| Config DSL — binding kinds | `.../tools/natjgen/{FrameworkBinding,HeaderBinding,AbstractBinding}.java` |
| Config DSL → engine config | `.../tools/natjgen/ConfigurationBuilder.java` |
| Xcode project model | `.../tools/natjgen/{XcodeProject,XcodeTarget,XcodeWorkspace}.java` |
| libclang Java bindings | `tools/moe.binding.clang/src/main/java/org/clang/...` |

## Conventions worth knowing without reading further

- **Don't catch `UnsupportedTypeException` low in `TypeResolver`.** It's the channel that tells the manager "this declaration can't be expressed in Java" — caught and swallowed, you get silently malformed bindings instead of a clean skip with a `ValidationEntry`.
- **Editors mutate AST in place; don't regenerate compilation units wholesale.** The generator's main value-add over a code-emit-from-template approach is that it preserves unrelated nodes. A change that switches an editor to `String.format`-style emission breaks every downstream consumer who hand-edited adjacent code.
- **`moe.binding.clang` is bootstrapped by NatJGen against itself.** The committed `org.clang.*` source is what `Main.getClangSample()` would emit. When bumping LLVM, regenerating `moe.binding.clang` is a step that needs the *previous* `moe.binding.clang` to compile — handle bootstrap carefully if you change either NatJ annotations or libclang's API surface in the same release.
- **Generator output targets Java 1.8.** `ModelDowngrader` is what enforces this. If you add a feature that emits a Java 9+ construct, also extend `ModelDowngrader` to handle it.
- **The `.natjgen` XML format is the engine's only real input.** `.nbc` is a higher-level convenience that `ConfigurationBuilder` lowers; everything internal to the engine works on `Configuration`. Don't try to add features at the `.nbc` layer that the engine can't represent — extend `Configuration` first.
