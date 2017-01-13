# NatJGen Documentation

NatJGen is a Java code generator for NatJ from C and Objective-C code.

## High Level Overview

Let's assume a basic run, where we have C and Objective-C code and are generating bindings for iOS 64-bit and 32-bit.

### Generator Run Overview

- The generator validates its configuration and initializes its environment.
- Then it composes the command-line arguments for parsing for iOS 64-bit. (When there are both 32-bit and 64-bit platforms to index, then the 64-bit is always indexed first!)
- Indexes the provided source code and uses `ModelBuilder` to create a base model of the indexed types, functions, globals, etc.
- Then it composes the command-line arguments for parsing for iOS 32-bit.
- Indexes the provided source code and uses `ModelDowngrader` to alter the built model so it is compatible with 32-bit environments as well.
- Applies type name aliasing on structs and enums.
- Generates/updates Java binding code.

### Indexing

Indexing is mostly generic for all declaration types.

Overview of `ModelBuilder`:

- [optional] Check declaration for prerequisites.
- Get a `Unit` from the `Configuration` representing the declaration.
  - The unit contains customizations applied to the declaration, eg.: handling mode, custom package, etc.
- [optional] Check for availability.
- Create managers for the declarations (eg.: for classes, structs) or modify existing managers (eg.: for struct fields, enum constants).

Overview of `ModelDowngradler`:

`ModelDowngradler` will mostly only update type infomation (and some linkage) as that is the reason if a type is not representable with NatJ on both 32/64-bit platforms.
After all indexing is done with this model editor, it will invalidate structs found on only one of the indexed platforms, and invalidates structs which cannot be represented by NatJ with a single type.

### Unit Managers

Unit managers are used to collect declarations which would be generated into the same Java source file. Eg.: Objective-C classes are managed by instances of `ObjCClassManager`.

NatJGen currently supports the following managers:

- `CEnumManager`: Named and unnamed C enumerations.
- `CManager`: C functions and global variables.
- `COpaquePtrManager`: Opaque pointers.
- `CStructManager`: C structs.
- `ObjCClassManager`: Objective-C classes.
- `ObjCExternalCategoryManager`: Objective-C categories (which were not mergeable into `ObjCClassManager`).
- `ObjCProtocolManager`: Objective-C protocols.

### Generator (class)

The `Generator` class is responsible for managing the unit managers.

The generation process is as follows:

- Merges all enum constants from unnamed enum types to a global (framework specific) manager.
- Initializes hierarchy between Objetive-C classes and protocols.
- Removes unsupported managers
- Initializes managers
- Runs member type validations on managers
- Runs member merging on managers
- Runs member manipulations on managers
- Runs pre-generation validations on managers
- Generates/Updates Java source codes via the managers
- Cleans up managers

### Managing Annotations

Type, method, field and parameter annotations are managed by the unit managers via the `ModifierEditor` class. This class handles both existing, modified and new annotations/modifiers.

### Type Resolution

Type resolution is covered by the `TypeResolver` class. The type resolver provides a context in which specified type bindings are supported. Eg.: in a `C struct` context Objective-C classes as struct fields are not supported but in `C functions` as parameters, they are.

### Resolving Uncertain Annotations

Whenever NatJGen can't decide how a type should be mapped by NatJ, it will put an "uncertain" annotation on the type and default to a mapping. The user can specify manually how to map these types by editing the generated type configuration file. At the next generation, when specifying the type configuration file as "input", NatJGen will map the resolved types correctly.
When an uncertain binding is encountered, NatJGen will do a key-value-match based lookup in the type configuration.

Eg.: The second argument of a C function named `hello` is uncertain. Internally, this is handled somewhat like a path: `c-function/hello/location/1`

The lookup will be as follows:

- Looks for key-value match: `c-function` - `hello`
- Looks for key-value match: `location` - `1` in the result of the above match (1 means second argument, indexing is from 0, return type is -1)
- Retrieve the `use` value from the final match result and pass that value to the type resolver

### Configurability

Properties:

- Platform: iOS, OS X, tvOS, NDK
- Package Base: package root, under which classes and sub-packages will be generated
- Base SDK: path to the Xcode SDK (Apple platforms only)
- Header Search Paths: paths where clang will search for `#include <...>`
- User Header Search Paths: paths where clang will search for `#include "..."`
- Framework Search Path: paths where clang will search for framework imports
- Source: Objective-C source code for clang to parse
- Output: Output directory for the generated files
- Docset: _Deprecated and broken_
- Unit Rules: list of rules to apply on declarations
- Logs Path: path where NatJGen will put the log files
- Type Config Input: input type configuration path
- Type Config Output: output type configuration path
- Type Config Clean Output: create output type configuration by ignoring resolved values found in the input type configuration
- Header File Resolving Paths: paths for resolving header files (used for inline C function support)
- Inline Function Binding Output: output path for generated Objective-C source files (used for inline C function support)
- Other CFlags: custom C flags passed to clang
- Inject default CFlags: inject default CFlags, if set to false, only search paths and `Other CFlags` will be passed to clang
- Use Included Standard Headers: use standard headers provided by clang

Unit Rules:

- Final: this is the last rule which should apply if all specified conditions are met
- Conditions: conditions of which all should match to apply actions
- Actions: list of actions to apply

Unit Rule Conditions:

- Name Match: declaration name matches
- Name Prefix: declaration name starts with
- Framework Match: declaration is from specified framework
- Path Match: declaration is from specified file
- Path Prefix: declaration is from file with the specified prefix
- Type Match: declaration is of type (objc-class, objc-protocol, objc-class-method, objc-instance-method, objc-property, c-struct, c-enum, c-enum, etc.)

    Note: prefixing the condition's name will negate the requirement. (Eg.: `{ condition: not-name-prefix, value: CF }`)

Unit Rule Actions:

- Replace Package: replace the package of the UnitManager with a specified value (not always applicable)
- Replace Package Base: replace the base package for the declarations
- Replace Native Library: replace the library of the UnitManager (not always applicable)
- Generate Hybrid Class: generate Objective-C hybrid class instead of binding class
- Handling Mode: how the declaration should be handled
	- disabled: don't generate at all
	- external: don't generate binding code but enable use sites (Eg.: SDK bindings with 3rd party libraries)
	- default: generate if supported
