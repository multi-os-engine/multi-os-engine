---
name: moe-idea-plugin
description: IntelliJ IDEA / Android Studio plugin at `tools/moe.plugin.idea/`, published to JetBrains Marketplace via `publishPlugin`. Mostly a thin UI shell over the user-side `moe.plugin.gradle` (run configs invoke Gradle tasks); the load-bearing non-shim parts are `MOESdkType` (GraalVM detection + wiring as IDE JDK) and direct `pymobiledevice3` device-list calls in `DeviceChooserDialog`. Targets IntelliJ Community 2023.3.8+. TRIGGER when: editing under `tools/moe.plugin.idea/src/main/{java,kotlin}/org/moe/idea/`; touching `META-INF/plugin.xml`, `studio-contribs.xml`, or any `.form` file under `org/moe/idea/ui/`; modifying `MOERunConfiguration*`, `MOEProgramRunner`, `MOERunProfileState`, `MOESdkType`, `MOEGradleTaskProvider`, `MOEGradleProjectResolver`, `MOEGradleRunner`, `MOEToolWindow*`, `MOEGlobalSettings`, `MOEGlobalSearchableConfigurable`, `Startup.kt`, `XcodeProjectEditor*`, `BindingEditor*`, `DeviceChooserDialog`, `MOEProjectTemplatesFactory`, `MOEClassTemplate*`, the JUnit-runner glue (`MOEJUnit*`, `MOETest*`); editing the IDEA plugin's `build.gradle` (intellij-platform plugin config, `since-build`, `runIde` task); IDE plugin doesn't pick up devices / SDK / run config breaks; debugging via `:tools:moe.plugin.idea:runIde` (debug port 5005). SKIP: the Gradle tasks the IDE plugin invokes — `moe-app-build`; the device launcher CLI (`ios-device.jar`) — `moe-ios-device`; the binding editor's *backing model* (`moe.tools.natjgen` config DSL) — `moe-natjgen`.
---

# MOE IntelliJ / Android Studio Plugin

`moe.plugin.idea` is published as a JetBrains Marketplace plugin (`org.moe`, "Multi-OS Engine"). Targets IntelliJ IDEA Community 2023.3.8+ (`since-build 233`, no until-build) and Android Studio (via the optional `studio-contribs.xml` extension). Built with the IntelliJ Platform Gradle Plugin 2.x.

## What it is and isn't

**Is**: a UI shell around `moe.plugin.gradle`. Run configurations call Gradle tasks. The "Build Project" before-run hook calls `moeLaunch`. The Xcode editor reads/writes `.pbxproj` via `moe.document.pbxproj`. The binding editor reads/writes `.natjgen` via `moe.tools.natjgen`.

**Isn't**: a build system, a parser, or anything that re-implements Gradle plugin logic. If a task is missing for a feature, it goes in the Gradle plugin first; the IDE plugin gets the wiring.

The two non-shim pieces are `MOESdkType` (GraalVM detection / SDK wiring) and the direct `pymobiledevice3` calls for device lists. Everything else is a Gradle invocation or a Swing form.

## Plugin extensions (plugin.xml summary)

| Extension point | Class | Purpose |
|---|---|---|
| `configurationType` | `MOERunConfigurationType` | "Multi-OS Engine" run configuration kind |
| `programRunner` | `MOEProgramRunner` | Runs/debugs MOE configurations |
| `stepsBeforeRunProvider` | `MOEGradleTaskProvider` | "Run Gradle Task" step that always runs before a MOE config launches |
| `sdkType` | `MOESdkType` (`JavaDependentSdkType`) | Treats GraalVM as a configurable IDE-level SDK |
| `externalProjectDataService` | `GradleModuleModelDataService` | Reads MOE module info from Gradle Tooling API |
| `facetType` | `GradleFacetType` | Facet attached to MOE Gradle modules |
| `projectResolve` (gradle) | `MOEGradleProjectResolver` | Provides the `GradleModuleModel` via Tooling-API model builder |
| `toolWindow` | `MOEToolWindowFactory` | "Multi-OS Engine" bottom panel |
| `projectTemplatesFactory` | `MOEProjectTemplatesFactory` | "New Project" template wizard |
| `fileEditorProvider` | `XcodeProjectEditorProvider`, `BindingEditorProvider` | Custom editors for `.pbxproj` and `.natjgen` |
| `applicationConfigurable` | `MOEGlobalSearchableConfigurable` | Settings → Tools → MOE |
| `applicationService` | `MOEGlobalSettings` | Persisted plugin settings |
| `postStartupActivity` | `Startup` (Kotlin) | One-shot init on project open |

## SDK detection and JVM wiring (`MOESdkType`)

`MOESdkType extends JavaDependentSdkType implements JavaSdkType`. Why this exists: MOE projects need a specific GraalVM as their build/runtime JDK, but IntelliJ doesn't know what "MOE SDK" means. The class:

- Provides a UI to pick a MOE SDK installation
- Auto-detects via `JavaSdk` and the same `MOESdkProperties` Tooling-API model that the Gradle plugin exposes (`tools/moe.plugin.gradle/.../model/impl/MOESdkPropertiesImpl.kt`)
- Sets up the IDE's project-level JDK to the GraalVM the Gradle plugin resolved (so editor inspections, run configurations, and Gradle sync all use the same JVM)
- Wires javadoc/sources/annotation roots so completion sees the SDK's `moe-core` and `moe-ios` jars

This was the 1.5.x era's main work — change-notes mention "Improve SDK management", "Set GraalVM JDK as SDK", "Run MOE build using the same JDK as the Gradle JVM", "Improve support when multiple JDKs are installed". Treat `MOESdkType` as the plugin's hard-earned area; small changes here have broken setups before.

## Run configurations and before-run gradle

`MOERunConfiguration` (extends `MOERunConfigurationBase`) holds the user's choices: target module, source set (main vs test), Debug/Release, device vs simulator, target UDID, args, env. `MOERunProfileState` builds the actual launch:

1. `MOEGradleTask` (registered via `MOEGradleTaskProvider`) is auto-added as a `BeforeRunTask`. When the user hits Run, Gradle invokes `moeLaunch{Device|Simulator}*` against the chosen module.
2. The Gradle invocation result (success/failure, log path) is captured via `MOEGradleInvocationResult` / `MOEAfterGradleInvocationTask`.
3. If debugging, `MOEProgramRunner` attaches IntelliJ's JDWP debugger to the local port the launcher is forwarding (per `LaunchOptions.debug`).

For test runs there's a parallel set under `runconfig/configuration/test/`: `MOEJUnitUtil`, `MOETestClassBrowser`, `MOETestListener`, `MOETestLocationProvider`, `MOETestConsoleProperties`. They wire IntelliJ's JUnit UI to the JUnit XML the launcher writes per device.

## Direct device enumeration

`DeviceChooserDialog` (in `org/moe/idea/ui/`) calls `javapymobiledevice3` directly, not through Gradle. This is intentional for latency — Gradle daemon spin-up + task graph eval is multiple seconds; the device dropdown needs to feel instant.

The trade-off: the IDE plugin has a transitive dependency on `org.multi-os-engine:javapymobiledevice3` (see `build.gradle`), and bumps to that artifact need a coordinated release. The Python venv path is shared with the launcher (`~/.javapymobiledevice3/daemon-{PROTOCOL_VERSION}/`), so first-time setup is paid once.

## Custom editors

| Editor | Backing model | Code |
|---|---|---|
| Xcode project editor | `moe.document.pbxproj` (parses `project.pbxproj`) | `editors/XcodeProjectEditor*.java`, `ui/XcodeEditorForm.{java,form}` |
| Binding editor (per-binding) | `moe.tools.natjgen.AbstractBinding` | `editors/BindingEditor*.java`, `ui/{HeaderBindingEditorForm,BindingEditorListForm}.{java,form}`, `ui/Identity.{java,form}` |
| Device chooser | direct javapymobiledevice3 | `ui/DeviceChooserDialog.{java,form}` |
| Deployment info | static data | `ui/DeploymentInfo.{java,form}` |
| New binding wizard | uses ConfigurationBuilder | `actions/MOENewBindingAction.java`, `ui/NewBindingDialog.form` |

The editors live in `org/moe/idea/editors/`; the Swing forms are in `org/moe/idea/ui/`. `.form` files are IntelliJ's GUI Designer XML — edit via the IDE, the corresponding `.java` is partially generated.

## Class & project templates

- Project templates: `MOEProjectTemplatesFactory` registers a "Multi-OS Engine" entry in the New Project wizard. Templates live under `src/main/resources/template/`.
- Class templates: `MOEClassTemplate*` — when the user does "New → Multi-OS Engine Class" (action id `org.moe.idea.NewClass`), this generates a `NativeObject` subclass with the right NatJ annotations.
- Binding templates: `template/bindings/template.{h,m}` are scaffolds emitted when the user creates a new binding.

## Build and packaging

`build.gradle` uses the IntelliJ Platform plugin 2.x with `intellijPlatform { create("IC", "2023.3.8") }` and bundles the `com.intellij.gradle` and `com.intellij.java` plugins. The build produces `build/distributions/${PLUGIN_NAME}.zip`. Java toolchain is 17, but `options.release = 11` so the plugin runs on older IDE bundled JDKs.

`runIde` task is preconfigured with JDWP on port 5005 — useful for debugging the plugin itself (`./gradlew :tools:moe.plugin.idea:runIde` then attach a remote debugger).

Publishing goes to the JetBrains Marketplace via the IntelliJ Platform plugin's `publishPlugin` task, gated on `intellij.publishToken` project property; CI sets this from a vault.

The `build.gradle` also has a leftover `maven-publish` block — that block is dead/incorrect and is **not** the actual publishing path. Don't try to push the IDE plugin via `publishToMavenLocal` and assume that's the canonical artefact.

## Critical files

| Concern | File |
|---|---|
| Plugin XML | `tools/moe.plugin.idea/src/main/resources/META-INF/plugin.xml` |
| Studio contribs | `tools/moe.plugin.idea/src/main/resources/META-INF/studio-contribs.xml` |
| SDK type / GraalVM detection | `src/main/java/org/moe/idea/sdk/MOESdkType.java` |
| Run config | `src/main/java/org/moe/idea/runconfig/configuration/MOERunConfiguration*.java` |
| Run profile state / debug attach | `src/main/java/org/moe/idea/runconfig/{MOEProgramRunner,MOERunProfileState}.java` |
| Before-run Gradle hook | `src/main/java/org/moe/idea/runconfig/beforeRunTasks/MOEGradle*.java` |
| Gradle task invoker | `src/main/java/org/moe/idea/compiler/MOEGradleRunner.java` |
| Gradle Tooling API resolver | `src/main/kotlin/org/moe/idea/extension/MOEGradleProjectResolver.kt` |
| Module model | `src/main/kotlin/org/moe/idea/model/{,impl/}*.kt` + `service/GradleModuleModelDataService.java` |
| Facet | `src/main/kotlin/org/moe/idea/facet/gradle/GradleFacet*.kt` |
| Tool window | `src/main/java/org/moe/idea/ui/MOEToolWindow*.java` |
| Settings | `src/main/java/org/moe/idea/{MOEGlobalSettings,MOEGlobalSearchableConfigurable}.java` |
| Startup activity | `src/main/kotlin/org/moe/idea/Startup.kt` |
| Project templates | `src/main/java/org/moe/idea/wizards/project/MOEProjectTemplate*.java` + `resources/template/` |
| Class template generator | `src/main/java/org/moe/template/MOEClassTemplate*.java` |
| Custom editors | `src/main/java/org/moe/idea/editors/{XcodeProject,Binding}Editor*.java` |
| Device chooser (direct pymobiledevice3) | `src/main/java/org/moe/idea/ui/DeviceChooserDialog.{java,form}` |

## Conventions worth knowing without reading further

- **Don't add Gradle plugin logic here.** If a feature needs new build behavior, add the Gradle task in `moe.plugin.gradle`, then wire it from the IDE plugin. The IDE plugin should never duplicate task logic.
- **`MOESdkType` is fragile.** The detection of GraalVM home, the wiring of class/source/javadoc roots, and the JDK matching to the Gradle daemon are all subtle; version bumps and refactors here repeatedly broke setups (see change-notes 1.5.0–1.5.3). Test with a clean IDE config dir.
- **The IDE plugin reaches into `javapymobiledevice3` directly only for device lists.** Anything that needs to *launch* a device should go through the Gradle plugin. Don't expand the direct usage.
- **`runIde` debug port is 5005.** Don't change it without updating dev docs — multiple developers may have IDE run configs configured for 5005 already.
- **`since-build 233`, no `until-build`.** This is intentional — the user wants the plugin to keep working on new IDEA EAPs without releases. If you depend on a deprecated API, either compat-shim it or bump `since-build` (don't add an `until-build`).
- **`.form` files are partially generated.** Always edit them in IntelliJ's GUI Designer, never by hand. The accompanying `.java` has marker comments — preserve them.
