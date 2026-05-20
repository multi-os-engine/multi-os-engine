# prebuilts

This composite hosts cross-toolchain build tasks: LLVM (libclang), MinGW, a downloadable Linux cross-compiler, and per-platform libffi cross-builds.

## `:prebuilts:llvm` is the only manual-only task

```
./gradlew :prebuilts:llvm
```

Run once after first checkout (or after the `vendor/external/llvm` submodule SHA moves). It cmake-builds libclang from `vendor/external/llvm` for macOS arm64+x86_64 and lands the install at `prebuilts/llvm/macos/`. It is **deliberately not** wired transitively into other tasks — the build is multi-minute and would dominate every clean build if it were. Any task that needs libclang assumes it's present and reads the path from `moeExternal.llvm.{root,jnipath,macos}`.

Every other prebuild task in this directory (libffi, mingw, linuxCrosscompiler) is on-demand from downstream tasks — `:tools:moe-sdk:sdk` and the natj platform builds pull them in transitively. Don't run those by hand unless you know why.

## libffi patches and the MinGW patch trio

Checked-in patches that must apply cleanly against the vendored sources:

- `prebuilts/external/libffi/libffi-disable-armv7-ios.patch`
- `prebuilts/external/libffi/libffi-backport-cif-fix.patch`
- `mingw-disable-tzdb.patch`, `mingw-fix-libc.patch`, `mingw-xcode15-fix.patch`

If the `vendor/external/libffi` submodule SHA advances, re-test the patch chain.

## Output layout

| task | output |
|---|---|
| `:prebuilts:llvm` | `prebuilts/llvm/macos/` (libclang.dylib + headers + cmake install) |
| `:prebuilts:mingw` | `prebuilts/mingw/` (cross-toolchain for natj-win) |
| `:prebuilts:linuxCrosscompiler` | `prebuilts/build/linux-crosscompiler/` (downloaded zip extract) |
| `:prebuilts:external:libffi:prebuild_<platform>` | `prebuilts/external/libffi/build/{ios,macos,windows,linux,ndk}/` |

The `idea { module { excludeDirs += file("llvm") + file("mingw") } }` block is intentional — those dirs are large compile output trees, not source.
