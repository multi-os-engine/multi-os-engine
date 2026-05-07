# build-tools — Gradle Plugin for MOE Internal Builds

**Location**: `moe/build-tools/`
**Plugin ID**: `org.moe.buildtools`
**Package**: `org.moe.prebuilts`

This is a `java-gradle-plugin` that provides three abstract task types used throughout the MOE build system for native compilation. It is NOT the user-facing `moe-gradle` plugin — it is only for building MOE itself.

## Plugin Entry Point: BuildTools.java

`BuildTools implements Plugin<Project>` applies to `allprojects` and:
- Reads `moe.verbose` and `moe.dontunmount` gradle properties via `providers.gradleProperty()`
- Configures all `BaseTask` subclasses with `verbose`, `rootProjectDirectory`, `projectName` conventions
- Configures all `Prebuild` tasks with `dontUnmount` convention
- Configures all `XcodeBuild` tasks with default `xcodeProject` convention (projectDir/projectName.xcodeproj) and registers a `XcodeBuildLockService` BuildService per-xcodeproj path (maxParallelUsages=1) so parallel Gradle workers cannot simultaneously invoke xcodebuild on the same project

## BaseTask (abstract)

Base class for all build-tools tasks. Key features:
- `@Inject ExecOperations`, `FileSystemOperations`, `ProjectLayout` for config-cache safety
- `@Internal verbose`, `rootProjectDirectory`, `projectName` managed properties
- `doExecute()` @TaskAction: creates a log file, wraps execution in `NonClosingFileOutputStream` (tees to stdout when verbose), calls abstract `executeImpl()`, dumps full log to stderr on failure
- `exec(Action<ExecSpec>)`: wraps `ExecOperations.exec()` to redirect stdout/stderr to log file, appends command line to log
- Abstract: `logFile()` and `executeImpl()`

## Prebuild extends BaseTask

Runs a bash build script inside an HFS+ ramdisk for isolation. Used for libffi cross-compilation.

### Properties
| Property | Annotation | Purpose |
|---|---|---|
| `sourcePath` | `@Input` | Relative path from repo root to source dir (e.g. `external/libffi`) |
| `ramdiskSizeMB` | `@Input` | Ramdisk size (default 128–256 MB) |
| `buildScript` | `@Input` | Shell script name to execute (e.g. `moe-prebuild-ios.sh`) |
| `targetName` | `@Input` | Build target label (e.g. `ios`, `macos`, `windows`) |
| `preBuildCopySpec` | `@Internal` | Extra files to copy onto ramdisk before build |
| `dontUnmount` | `@Internal` | If true, leave ramdisk mounted for debugging |
| `env(key, value)` | — | Add environment variable |

### Execution Flow
1. `hdiutil attach -nomount ram://N` → get device path
2. `diskutil erasevolume HFS+ build-YYYYMMDD-hhmmss <device>` → mount at `/Volumes/build-*`
3. `rsync -r --exclude=.git <sourceFile>/ <ramdisk>/`
4. Copy `preBuildCopySpec` files onto ramdisk
5. Execute `bash <buildScript>` on ramdisk with `MOE_PREBUILTS_DIR`, `MOE_PREBUILTS_TARGET_DIR` env vars
6. `diskutil unmountDisk <device>` (unless dontUnmount)

### Input/Output
- `@InputDirectory getSourceFile()`: resolves `rootProjectDirectory/../../<sourcePath>` (navigates to repo root)
- `@OutputDirectory getOutputDirectory()`: resolves `rootProjectDirectory/<sourcePath>/build/<targetName>`

## Script extends BaseTask

Step-based execution DSL. Builds a list of `Step` objects at configuration time, runs them at execution time.

### DSL Methods
| Method | Purpose |
|---|---|
| `workDir 'name'` | Set working dir to `build/<name>`, creates dir |
| `rawWorkDir 'path'` | Set working dir to arbitrary path relative to project |
| `progress 'msg'` | Add a progress-reporting step |
| `exec 'cmd', 'arg1', ...` | Add an exec step (captures current workDir + envMap + failureMessage) |
| `download 'target', 'url'` | Add curl download step (skips if target exists) |
| `mkdir 'path'` | Add mkdir -p step |
| `rsync from, to` | Add rsync -aL --delete step |
| `env 'key', 'value'` | Set env var for subsequent exec steps |
| `unset 'key'` | Remove env var |
| `checkDir 'path'` | Validate directory exists, return absolute path |
| `failureMessage 'msg'` | Set error message for next exec step |

### Step Types
- `ProgressStep`: prints `> message` to stdout
- `ExecStep`: captures `(executable, args, workDir, envMap, failureMessage)` at add time; runs at execution time

## XcodeBuild extends BaseTask

Wraps `xcodebuild` invocation with pretty-printed output parsing and per-project mutual exclusion.

### Properties
| Property | Annotation | Purpose |
|---|---|---|
| `xcodeProject` | `@Internal` (DirectoryProperty) | Path to .xcodeproj |
| `configuration` | `@Input` | e.g. `Release-ios`, `Debug-ios` |
| `target` | `@Input` | Xcode target name |
| `sdk` | `@Input` | Xcode SDK (iphoneos, iphonesimulator, macosx) |
| `env(key, value)` | — | Environment variable |
| `cond_buildopt(condOrValue, key[, value])` | — | Conditional `KEY=VALUE` xcodebuild arg |
| `extraArgs(...)` | — | Additional xcodebuild arguments |

### Static Factory: createTask()
```java
XcodeBuild.createTask(project, target, platform, sdk, configuration, deps)
```
- Generates task name: `build_<target>_<platform>_<sdk>_<config.lower>`
- Sets configuration to `<configuration>-<platform>` (e.g. `Release-ios`)
- Wires cross-project dependencies from `deps["projects"]` list:
  - Entry format: `":project:path"` or `":project:path@customTarget"` 
  - Resolves to `<project>:build_<target>_<platform>_<sdk>_<config>` task

### Caching Strategy
XcodeBuild tasks use `outputs.upToDateWhen { false }` to disable Gradle's up-to-date checks. This is intentional — xcodebuild has its own incremental build cache that is more accurate for native compilation than Gradle's file-based snapshotting. Gradle is responsible for task ordering and dependency wiring; xcodebuild handles caching.

### XcodeOutputStream
Parses xcodebuild stdout line-by-line. Recognizes `CompileC`, `Libtool`, `Ld`, `CreateUniversalBinary`, `GenerateDSYMFile` and reformats them with relative paths. Captures build failure lines after detecting `"The following build commands failed:"`.

### XcodeBuildLockService
A `BuildService<None>` registered per xcodeproj path with `maxParallelUsages=1`. Prevents Gradle's parallel execution from invoking multiple xcodebuild instances on the same project simultaneously.

## Utility Classes

### NonClosingFileOutputStream
Extends `FileOutputStream`. Overrides `close()` to no-op (prevents Gradle's exec from closing the shared log). Provides `realClose()` for actual cleanup. Optionally tees writes to `System.out` when verbose mode is on.

### SplitOutputStream
Tees writes to two `OutputStream`s (primary + secondary). `close()` only closes secondary, not primary — so the primary log stream stays open across multiple exec calls.
