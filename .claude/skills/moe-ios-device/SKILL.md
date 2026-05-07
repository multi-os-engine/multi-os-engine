---
name: moe-ios-device
description: iOS device bridge — installing/launching apps on physical devices, JDWP attach, port-forwarding, device enumeration. Components: `tools/moe.ios.device.launcher/` (standalone Java CLI, `ios-device.jar`) + `tools/moe.protocol.gdbremote/` (LLDB-flavoured GDB Remote Serial Protocol talking to `debugserver`) + the `org.multi-os-engine:javapymobiledevice3` IPC bridge to a `pymobiledevice3` daemon. TRIGGER when: editing under `tools/moe.ios.device.launcher/` or `tools/moe.protocol.gdbremote/`; modifying `Main`, `Configuration`, `DeviceHelper`, `USBDeviceWatcher`, `LaunchHelper`, `ProxyHelper`, `IPCHandler`, or `GDBRemoteProtocol`/`Communication`/`PacketOutputStream`/`Signal`/`IStopReplyListener`; touching `LaunchDevice`/`LaunchSimulator`/`ListDevices`/`ListSimulators` task wrappers in `moe.plugin.gradle/tasks/`; touching `DeviceLauncherBuilder` or `LaunchOptions` in `moe.plugin.gradle/utils/`; modifying `DeviceChooserDialog` (IDEA's direct device enumeration); symptoms "device not found", "tunneld won't start", "tunneld asks for sudo", "debugger won't attach", "JDWP port forward fails", "no stdout from launched app", `OS_ACTIVITY_*` / `NSUnbufferedIO` env-var questions, `PROTOCOL_VERSION` mismatches, `~/.javapymobiledevice3/` venv issues, `--install-mode` semantics (`runonly`/`install`/`upgrade`), Mach-O CPU-type downgrade. SKIP: building the `.app` / `.ipa` — `moe-app-build`; IDE-side run-configuration UI — `moe-idea-plugin`; the GPL `IPCPyMobileDevice3` daemon repo (out of tree).
---

# iOS Device Bridge

`moe.ios.device.launcher` is a standalone Java CLI (`ios-device.jar`, fat jar with `Main-Class: org.moe.ios.device.launcher.Main`) that does everything an app needs after the `.app` is built: install it, launch it, port-forward stdout and JDWP, and attach a debugger. It's invoked two ways:

1. **From the Gradle plugin** — `LaunchDevice` task `javaexec`s the jar with CLI args built by `DeviceLauncherBuilder` (covered in `moe-app-build` skill). This is the path used for `./gradlew moeLaunch` and IDE Run/Debug.
2. **From the IDEA plugin** — directly, for device enumeration in `DeviceChooserDialog`. The IDE bypasses Gradle for the device list because it's faster (no daemon spin-up, no task graph eval).

## Architecture: how it actually talks to a device

```
Java (this codebase)
      │
      ▼
PyMobileDevice3IPC  (org.multi-os-engine:javapymobiledevice3 — sibling repo, JNI/IPC bridge)
      │
      ▼  (IPC over local socket, daemon protocol PROTOCOL_VERSION-suffixed)
DaemonHandler  (Python venv installed once at ~/.javapymobiledevice3/daemon-{PROTOCOL_VERSION}/)
      │
      ▼  (subprocess)
pymobiledevice3 Python CLI  (open-source upstream)
      │
      ▼  (lockdown + tunneld over USB/Wi-Fi)
iOS device  (debugserver, installation_proxy, etc.)
```

The Java side never touches USB directly. Everything goes through `pymobiledevice3` (the Python project), which `moe.ios.device.launcher` provisions on first use into a per-protocol-version venv. This was a 1.6.0 architectural change (see plugin.xml change-notes); previously it used native libimobiledevice / libplist via JNI.

> **Why `IPCPyMobileDevice3` is a separate sibling repo, not vendored under `moe/`:** it's GPL-licensed; `moe/` is Apache 2.0. The boundary is intentional. The Java IPC bridge `org.multi-os-engine:javapymobiledevice3` (composite-built from `external/javapymobiledevice3`, included by `tools/`) is the Apache-side stub that talks to the GPL-side daemon — keep that boundary intact.

`tunneld` is a long-running pymobiledevice3 process that handles the lockdown tunnel for paired devices. On macOS it needs elevated privileges (one sudo prompt), then stays up across launches. The launcher checks `IPCHandler.isTunneldRunning()` and starts it lazily.

## Launcher startup sequence (Main.java)

```
read CLI args → Configuration.validate()
        │
        ▼
DaemonHandler.isDaemonRunning() ?  NO → install Python venv + start daemon
        │
        ▼
IPCHandler.init()  → new PyMobileDevice3IPC()
        │
        ▼
isTunneldRunning() ? NO → ensureTunneldRunning() (sudo on macOS)
        │
        ▼
DeviceHelper.getDevice(config)  (resolves UDID or first available)
        │
   ┌────┴───────────┐
   ▼                ▼
list devices?  app path given?
                   │
       ┌───────────┴───────────┐
       NO                     YES
       │                       │
       ▼                       ▼
ProxyHelper.launch       installApp (if not RUN_ONLY)
   (port-forward only)        │
                              ▼
                          getInstalledPath
                              │
                              ▼
                          LaunchHelper.launch
```

`ProxyHelper.launch` exists for the case where the user just wants port-forwards to a process already running on a device — not currently exposed via the Gradle task, but supported by the CLI.

## LaunchHelper — the real work

`LaunchHelper.launch(device, appPath, config)` (in `LaunchHelper.java`):

1. Open Mach-O of the binary, read supported CPU types — used to downgrade `arm64` → `arm` if the device CPU isn't arm64-capable
2. `IPCHandler.debugServerConnect(device, port)` returns `(hostname, port)` on the local box that proxies to `debugserver` on the device (started by `pymobiledevice3` over the lockdown tunnel)
3. Open a TCP socket to that port, wrap in `GDBRemoteProtocol(is, os)`
4. `protocol.set_StartNoAckMode()` (unless user wants raw debugserver), then send env (forced + user), arguments (with `-XX:JDWPOptions=…` if `--debug` requested), and `vCont c` to start
5. If `--debug` was set, spin up `ProxyHelper.createProxyServer(debugPort, device, ...)` to forward JDWP traffic from a local port to the in-app JDWP server (wire format: pymobiledevice3-tunneled TCP)
6. Register a `USBDeviceWatcher` listener so device unplug terminates the process
7. Wait on `processEnded` condition; on shutdown signal, send `ctrl-C` then `k` to debugserver

Forced env vars `OS_ACTIVITY_MODE=enable`, `OS_ACTIVITY_DT_MODE=enable`, `NSUnbufferedIO=YES` are critical: without them, `os_log`/`NSLog` output never reaches stdout (so the IDE Run window stays blank). See the LLDB source link in `LaunchHelper.java:311-316` for context.

## GDB Remote Serial Protocol

`moe.protocol.gdbremote` implements the LLDB extension of GDB RSP (the protocol `debugserver` speaks). Java-only, no JNI:

| Class | Role |
|---|---|
| `GDBRemoteProtocol` | High-level: typed methods (`set_StartNoAckMode`, `query_HostInfo`, `query_LaunchSuccess`, `set_EnvironmentHexEncoded`, `send_Arguments`, `send_vCont`, `send_ctrl_C`, `send_k`) |
| `Communication` | Packet framing: `$payload#cs` checksums, ack/nack, hex encoding |
| `PacketOutputStream` | Buffered packet writer |
| `Signal` | POSIX signal constants |
| `Util` | Hex encoding, `qSupported` parsing, etc. |
| `IStopReplyListener` | Callback interface — `processSignaled`, `processExited`, `processTerminated`, `processOutput` |

`LaunchHelper` implements `IStopReplyListener` and routes `processOutput(String)` to stdout (and `--output-file` if given). When the app crashes, `processSignaled` triggers a clean teardown.

## CLI surface (built by `DeviceLauncherBuilder`)

| Flag | Effect |
|---|---|
| `--udid=<udid>` | Target specific device (else first available) |
| `--app-path=<path>` | Path to `.app` to install/launch |
| `--list` | Just print devices |
| `--wait-for-device` | Block until a device is connected |
| `--launch-arg=<arg>` (repeatable) | Argv passed to the app's `main` |
| `--env=<key>=<val>` (repeatable) | Env var set in the app's process |
| `--proxy-port=<local>[:<remote>]` (repeatable) | TCP forward |
| `--debug=<local>[:<remote>]` | JDWP attach forward |
| `--install-mode={runonly,install,upgrade,installonly,upgradeonly}` | What to do with `--app-path` |
| `--native-debug=<local>` | Forward debugserver port directly (for native LLDB attach) |
| `--output=<port>` | Forward stdout to local TCP port |
| `--output-file=<path>` | Tee stdout to file |

`InstallMode.RUN_ONLY` skips installation and just launches the already-installed bundle (matched by bundle id from the `.app`'s `Info.plist`).

## IDEA plugin's direct usage

`moe.plugin.idea` calls `javapymobiledevice3` *directly* in `DeviceChooserDialog` (and friends) for the device list — it does NOT shell out to `ios-device.jar`. That's why MOE Gradle plugin updates can change device-launch behavior without an IDEA plugin release, but device *enumeration* changes need both. The Python venv is shared (same path), so first-time setup is paid once across both consumers.

## Critical files

| Concern | File |
|---|---|
| Launcher CLI entrypoint | `tools/moe.ios.device.launcher/src/main/java/org/moe/ios/device/launcher/Main.java` |
| Configuration parser | `.../launcher/{Configuration,ConfigurationAppender}.java` |
| Device discovery | `.../launcher/DeviceHelper.java` + `USBDeviceWatcher.java` |
| Install + launch flow | `.../launcher/LaunchHelper.java` |
| Port-forward only | `.../launcher/ProxyHelper.java` |
| pymobiledevice3 IPC | `.../launcher/IPCHandler.java` (singleton over `PyMobileDevice3IPC`) |
| GDB RSP | `tools/moe.protocol.gdbremote/src/main/java/org/moe/protocol/gdbremote/{GDBRemoteProtocol,Communication,PacketOutputStream,Signal,Util,IStopReplyListener}.java` |
| Gradle task wrapper | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/tasks/{LaunchDevice,LaunchSimulator,ListDevices,ListSimulators}.java` |
| Gradle CLI builder | `tools/moe.plugin.gradle/src/main/java/org/moe/gradle/utils/DeviceLauncherBuilder.java` |
| Gradle launch options | `.../utils/LaunchOptions.java` |
| pymobiledevice3 bridge (sibling repo) | `org.multi-os-engine:javapymobiledevice3` (composite-built from `external/javapymobiledevice3`) |

## Conventions worth knowing without reading further

- **The pymobiledevice3 daemon is per-protocol-version.** Path is `~/.javapymobiledevice3/daemon-{PyMobileDevice3IPC.PROTOCOL_VERSION}/`. Bumping PROTOCOL_VERSION forces a fresh venv install on next run; users may need to clean the old one manually. macOS/Linux paths under `~/.javapymobiledevice3/`, Windows uses `%LOCALAPPDATA%/JavaPyMobileDevice3/`.
- **`tunneld` needs sudo on macOS.** First launch will prompt; the Java side prints "Elevated privileges are required to launch tunneld" before the prompt. CI environments need a passwordless sudoers entry or a pre-running tunneld.
- **Forced env vars (`OS_ACTIVITY_*`, `NSUnbufferedIO`) are not optional.** Removing them silently breaks stdout streaming. The reasoning is in a comment block citing LLDB source; keep both the env vars and the comment.
- **Don't catch + ignore exceptions in the launch loop.** `LaunchHelper.launch()` has retry-once-on-Locked semantics for `query_LaunchSuccess`; other errors should propagate as `DeviceException` and abort. Silent retries hide actual device problems.
- **Device enumeration in IDEA bypasses the launcher CLI.** If you change device-list behavior in the launcher, also update `DeviceChooserDialog` (or factor out a shared helper). Currently they're independent code paths.
- **`GDBRemoteProtocol` is LLDB-flavored, not gdb-flavored.** It uses LLDB extensions like `qHostInfo`, `set_LaunchArch`, `QSetEnvironmentHexEncoded`. Don't try to make it portable to non-Apple debugservers.
