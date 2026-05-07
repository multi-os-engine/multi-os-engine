# moe-core

This composite has **two distinct jobs** that share no source tree but live under the same root for historical/build-graph reasons.

## Job 1 — drive the SVM/JDK/JDWP build

`moe.apple/moe.core.native/` orchestrates the native side: fetch a boot JDK (from the vendored `svm/labs-openjdk`), run `mx ... build` against `svm/graal` to produce a graalDist (a self-contained GraalVM with `native-image`), then run a sequence of Xcode and `native-image` invocations to produce the static archives and frameworks the user-app links against.

End artefacts (per arch × {iphoneos, iphonesimulator}):
- `libjvm.a` — Graal SVM JVM (from `svm.graal`)
- `libjava.a` — labs-openjdk java runtime (from `svm.openjdk`)
- `libjavasqlite.a` — SQLite (from `external.javasqlite`)
- `svmjdwp.framework` — feature framework user apps link against to enable JDWP debug support (from `svm.jdwp` — invokes `native-image` at SDK build time)
- `libmoe.a` — the deliverable: links all of the above plus `MOE.mm`/`ErrorDelegate.m`/`inline/*.m` shims (from `moe.sdk`)

See `moe.apple/moe.core.native/CLAUDE.md` for the SVM pipeline detail.

## Job 2 — host the iOS bindings

`moe.apple/moe.platform.ios/src/main/java/apple/**` is **checked-in generated code with manual fixes layered on top**. The lifecycle build just `javac`'s those sources into `moe-ios.jar`.

NatJGen runs only when bindings are intentionally regenerated, via `:moe-core:moe.apple:moe.platform.ios:generateBindings`. That is a manual one-shot — not part of the normal build. The workflow (regenerate, re-apply fixes patch, validate) is in `moe.apple/moe.platform.ios/UPDATE_IOS_BINDING.md`.

`moe.apple/moe.platform.ios.junit/` is a small JUnit runner for iOS-side tests, packaged into `moe-ios-junit.jar`. `moe.apple/moe.core.java/` is the small Java-side runtime — `moe-core.jar` — and is where SVM Features (e.g. `ReflectionCollectionFeature`, `JDWPSubstitutions`) live, compiled `compileOnly` against the `graalvm-svm = "23.0.7"` API library (the runtime native-image is GraalVM 25; see root `CLAUDE.md`).

## Module renames in published artifacts

Settings keep the human module names; published artifact basenames are different:

| module path | gradle name | final jar |
|---|---|---|
| `moe.apple/moe.platform.ios` | `:moe.apple:moe.platform.ios` | `moe-ios.jar` (fat-jar — NatJ shaded in deliberately) |
| `moe.apple/moe.platform.ios.junit` | `:moe.apple:moe.platform.ios.junit` | `moe-ios-junit.jar` |
| `moe.apple/moe.core.java` | `:moe.apple:moe.core.java` | `moe-core.jar` |

The fat-jar shape of `moe-ios.jar` is intentional (license isolation + ease of consumption); don't refactor it into a thin jar without coordination.

## Dead bits to ignore

- `android.py` — used to apply license headers; basically dead.
- `svm/mx/` directory — empty; the actual `mx` lives in the top-level `svm/mx/`.
- `dependencies/premake5.rb` — Homebrew formula for `premake5`, used by `natj-win`. Live, but not interesting unless you're touching the Windows build.

## Authoritative docs

- `UPDATE_JAVA_VERSION.md` — runbook for upgrading labs-openjdk / GraalVM. Some line-level details are dated (it says `build.gradle` — files are now `.kts`) but the procedure is correct.
- `moe.apple/moe.platform.ios/UPDATE_IOS_BINDING.md` — runbook for regenerating the iOS bindings.
