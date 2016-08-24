/*
Copyright (C) 2016 Migeran

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.gradle.tasks;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.output.NullOutputStream;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.DefaultTask;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.tasks.JavaExec;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetContainer;
import org.gradle.api.tasks.TaskContainer;
import org.gradle.process.ExecSpec;
import org.gradle.process.JavaExecSpec;
import org.moe.gradle.AbstractMoePlugin;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.JUnitTestCollector;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Launchers {
    private static final Logger LOG = LoggerFactory.getLogger(Launchers.class);

    private static final String MOE_LAUNCHER_DEVICE_UDID_PROPERTY = "moe.launcher.devices";
    private static final String MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY = "moe.launcher.simulators";
    private static final String MOE_LAUNCHER_OPTIONS_PROPERTY = "moe.launcher.options";

    private static final String MOE_LAUNCHER_CONFIG_OPTION = "config";
    private static final String MOE_LAUNCHER_NO_WAIT_DEVICE_OPTION = "no-wait-device";
    private static final String MOE_LAUNCHER_NO_BUILD_OPTION = "no-build";
    private static final String MOE_LAUNCHER_NO_LAUNCH_OPTION = "no-launch";
    private static final String MOE_LAUNCHER_DEBUG_OPTION = "debug";
    private static final String MOE_LAUNCHER_ENV_OPTION = "env";
    private static final String MOE_LAUNCHER_VMARG_OPTION = "vmarg";
    private static final String MOE_LAUNCHER_ARG_OPTION = "arg";
    private static final String MOE_LAUNCHER_PROXY_OPTION = "proxy";
    private static final String MOE_LAUNCHER_RAW_TEST_OUTPUT_OPTION = "raw-test-output";

    private static class Options {
        boolean build = true;
        boolean launch = true;
        boolean waitForDevice = true;
        Mode mode = Mode.RELEASE;
        Port debug;
        final Map<String, String> envs = new HashMap<>();
        final List<String> vmargs = new ArrayList<>();
        final List<String> args = new ArrayList<>();
        final List<Port> proxies = new ArrayList<>();
        boolean rawTestOutput = false;

        void read(@NotNull Project project) {
            Require.nonNull(project);

            if (!project.hasProperty(MOE_LAUNCHER_OPTIONS_PROPERTY)) {
                return;
            }

            final List<String> list = getUnescapedValues((String) project.property(MOE_LAUNCHER_OPTIONS_PROPERTY));
            for (String optline : list) {
                String key, value;

                final int sep = optline.indexOf(":");
                if (sep == -1) {
                    key = optline;
                    value = null;
                } else {
                    key = optline.substring(0, sep);
                    value = optline.substring(sep + 1);
                }

                if (MOE_LAUNCHER_CONFIG_OPTION.equals(key)) {
                    if (!Mode.validateName(value)) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_CONFIG_OPTION + "' requires one " +
                                "of the following values: debug, release. Defaults to release. Usage: '" +
                                MOE_LAUNCHER_CONFIG_OPTION + ":debug'");
                    }
                    mode = Mode.getForName(value);

                } else if (MOE_LAUNCHER_NO_WAIT_DEVICE_OPTION.equals(key)) {
                    if (value != null) {
                        project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                    }
                    waitForDevice = false;

                } else if (MOE_LAUNCHER_NO_BUILD_OPTION.equals(key)) {
                    if (value != null) {
                        project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                    }
                    build = false;

                } else if (MOE_LAUNCHER_NO_LAUNCH_OPTION.equals(key)) {
                    if (value != null) {
                        project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                    }
                    launch = false;

                } else if (MOE_LAUNCHER_DEBUG_OPTION.equals(key)) {
                    if (value == null) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_DEBUG_OPTION + "' requires a " +
                                "value in one of the following formats: <local> or <local>:<remote>. Usage: '" +
                                MOE_LAUNCHER_DEBUG_OPTION + ":5005'");
                    }
                    if (value.indexOf(':') != -1) {
                        debug = new Port(
                                Integer.parseInt(value.substring(0, value.indexOf(':'))),
                                Integer.parseInt(value.substring(value.indexOf(':') + 1)));
                    } else {
                        debug = new Port(Integer.parseInt(value), null);
                    }

                } else if (MOE_LAUNCHER_ENV_OPTION.equals(key)) {
                    if (value == null) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_ENV_OPTION + "' requires a value. " +
                                "Usage: '" + MOE_LAUNCHER_ENV_OPTION + ":key=value'");
                    }
                    final int kvsep = value.indexOf("=");
                    if (kvsep != -1) {
                        envs.put(value.substring(0, kvsep), value.substring(kvsep + 1));
                    } else {
                        envs.put(value, "");
                    }

                } else if (MOE_LAUNCHER_VMARG_OPTION.equals(key)) {
                    if (value == null) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_VMARG_OPTION + "' requires a value. " +
                                "Usage: '" + MOE_LAUNCHER_VMARG_OPTION + ":-Xhello'");
                    }
                    vmargs.add(value);

                } else if (MOE_LAUNCHER_ARG_OPTION.equals(key)) {
                    if (value == null) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_ARG_OPTION + "' requires a value. " +
                                "Usage: '" + MOE_LAUNCHER_ARG_OPTION + ":helloworld'");
                    }
                    args.add(value);

                } else if (MOE_LAUNCHER_PROXY_OPTION.equals(key)) {
                    if (value == null) {
                        throw new GradleException("Launcher option '" + MOE_LAUNCHER_PROXY_OPTION + "' requires a " +
                                "value in one of the following formats: <local> or <local>:<remote>. Usage: '" +
                                MOE_LAUNCHER_PROXY_OPTION + ":8080'");
                    }
                    final Port port;
                    if (value.indexOf(':') != -1) {
                        port = new Port(
                                Integer.parseInt(value.substring(0, value.indexOf(':'))),
                                Integer.parseInt(value.substring(value.indexOf(':') + 1)));
                    } else {
                        port = new Port(Integer.parseInt(value), null);
                    }
                    proxies.add(port);

                } else if (MOE_LAUNCHER_RAW_TEST_OUTPUT_OPTION.equals(key)) {
                    if (value != null) {
                        project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                    }
                    rawTestOutput = true;

                } else {
                    project.getLogger().warn("Unknown launcher option: '" + key + "'");
                }
            }
        }

        private static List<String> getUnescapedValues(final String value) {
            if (value == null) {
                return new ArrayList<>();
            }

            final List<String> opts = new ArrayList<>();
            final int length = value.length();
            final StringBuilder builder = new StringBuilder(length);
            boolean escaped = false;
            for (int idx = 0; idx < length; ++idx) {
                final char c = value.charAt(idx);
                if (escaped) {
                    escaped = false;
                    builder.append(c);
                } else {
                    if (c == '\\') {
                        escaped = true;
                    } else if (c == ',') {
                        opts.add(builder.toString());
                        builder.replace(0, builder.length(), "");
                    } else {
                        builder.append(c);
                    }
                }
            }

            if (builder.length() > 0) {
                opts.add(builder.toString());
            }

            return opts;
        }
    }

    private static class Port {
        final int local;

        @Nullable
        final Integer remote;

        Port(int local, @Nullable Integer remote) {
            this.local = local;
            this.remote = remote;
        }

        @Override
        public String toString() {
            return remote == null ? Integer.toString(local) : (local + ":" + remote);
        }
    }

    private static class DeviceLauncherBuilder {
        // @formatter:off
        private static final String UDID_ARG            = "--udid";
        private static final String APP_PATH_ARG        = "--app-path";
        private static final String LIST_ARG            = "--list";
        private static final String WAIT_FOR_DEVICE_ARG = "--wait-for-device";
        private static final String LAUNCH_ARG_ARG      = "--launch-arg";
        private static final String ENV_ARG             = "--env";
        private static final String PROXY_PORT_ARG      = "--proxy-port";
        private static final String DEBUG_ARG           = "--debug";
        private static final String INSTALL_MODE_ARG    = "--install-mode";
        private static final String NATIVE_DEBUG_ARG    = "--native-debug";
        private static final String OUTPUT_ARG          = "--output";
        private static final String OUTPUT_FILE_ARG     = "--output-file";
        // @formatter:on

        enum InstallMode {
            RUN_ONLY, INSTALL, UPGRADE, INSTALL_ONLY, UPGRADE_ONLY;

            @Override
            public String toString() {
                switch (this) {
                    case RUN_ONLY:
                        return "runonly";
                    case INSTALL:
                        return "install";
                    case UPGRADE:
                        return "upgrade";
                    case INSTALL_ONLY:
                        return "installonly";
                    case UPGRADE_ONLY:
                        return "upgradeonly";
                    default:
                        throw new IllegalStateException();
                }
            }
        }

        private String udid;
        private File appPath;
        private boolean list;
        private boolean waitForDevice;
        private final List<String> launchArgs = new ArrayList<>();
        private final Map<String, String> envVars = new HashMap<>();
        private final List<Port> proxyPorts = new ArrayList<>();
        private Port debug;
        private InstallMode installMode;
        private Integer nativeDebug;
        private Integer output;
        private File outputFile;

        private DeviceLauncherBuilder setUDID(@Nullable String udid) {
            this.udid = udid;
            return this;
        }

        private DeviceLauncherBuilder setAppPath(@Nullable File appPath) {
            this.appPath = appPath;
            return this;
        }

        private DeviceLauncherBuilder setList(boolean list) {
            this.list = list;
            return this;
        }

        private DeviceLauncherBuilder setWaitForDevice(boolean waitForDevice) {
            this.waitForDevice = waitForDevice;
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder addLaunchArgs(@NotNull String arg) {
            launchArgs.add(Require.nonNull(arg));
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder putEnvVar(@NotNull String key, @Nullable String value) {
            if (value == null) {
                envVars.remove(Require.nonNull(key));
            } else {
                envVars.put(Require.nonNull(key), value);
            }
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder addProxyPort(int local, @Nullable Integer remote) {
            proxyPorts.add(new Port(local, remote));
            return this;
        }

        private DeviceLauncherBuilder setDebug(int local, @Nullable Integer remote) {
            debug = new Port(local, remote);
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder setInstallMode(@Nullable InstallMode mode) {
            this.installMode = mode;
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder setNativeDebug(@Nullable Integer local) {
            nativeDebug = local;
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder setOutput(@Nullable Integer local) {
            output = local;
            return this;
        }

        @IgnoreUnused
        private DeviceLauncherBuilder setOutputFile(@Nullable File file) {
            outputFile = file;
            return this;
        }

        private void build(@NotNull MoePlugin plugin, @NotNull JavaExecSpec exec) {
            Require.nonNull(plugin);
            Require.nonNull(exec);

            exec.setWorkingDir(plugin.getSDK().getToolsDir().getAbsolutePath());

            exec.setMain("-jar");
            exec.args(plugin.getSDK().getiOSDeviceJar().getAbsolutePath());

            if (udid != null) {
                exec.args(UDID_ARG + "=" + udid);
            }

            if (appPath != null) {
                exec.args(APP_PATH_ARG + "=" + appPath);
            }

            if (list) {
                exec.args(LIST_ARG);
            }

            if (waitForDevice) {
                exec.args(WAIT_FOR_DEVICE_ARG);
            }

            launchArgs.forEach(arg -> exec.args(LAUNCH_ARG_ARG + "=" + arg));

            envVars.forEach((k, v) -> exec.args(ENV_ARG + "=" + k + "=" + v));

            proxyPorts.forEach(port -> exec.args(PROXY_PORT_ARG + "=" + port));

            if (debug != null) {
                exec.args(DEBUG_ARG + "=" + debug);
            }

            if (installMode != null) {
                exec.args(INSTALL_MODE_ARG + "=" + installMode);
            }

            if (nativeDebug != null) {
                exec.args(NATIVE_DEBUG_ARG + "=" + nativeDebug);
            }

            if (output != null) {
                exec.args(OUTPUT_ARG + "=" + output);
            }

            if (outputFile != null) {
                exec.args(OUTPUT_FILE_ARG + "=" + outputFile.getAbsolutePath());
            }
        }
    }

    private static class SimulatorLauncherBuilder {
        // @formatter:off
        private static final String UDID_ARG            = "--udid";
        private static final String APP_PATH_ARG        = "--app-path";
        private static final String LAUNCH_ARG_ARG      = "--launch-arg";
        private static final String ENV_ARG             = "--env";
        private static final String DEBUG_ARG           = "--debug";
        // @formatter:on

        private String udid;
        private File appPath;
        private final List<String> launchArgs = new ArrayList<>();
        private final Map<String, String> envVars = new HashMap<>();
        private Port debug;

        private SimulatorLauncherBuilder setUDID(@Nullable String udid) {
            this.udid = udid;
            return this;
        }

        private SimulatorLauncherBuilder setAppPath(@Nullable File appPath) {
            this.appPath = appPath;
            return this;
        }

        @IgnoreUnused
        private SimulatorLauncherBuilder addLaunchArgs(@NotNull String arg) {
            launchArgs.add(Require.nonNull(arg));
            return this;
        }

        @IgnoreUnused
        private SimulatorLauncherBuilder putEnvVar(@NotNull String key, @Nullable String value) {
            if (value == null) {
                envVars.remove(Require.nonNull(key));
            } else {
                envVars.put(Require.nonNull(key), value);
            }
            return this;
        }

        private SimulatorLauncherBuilder setDebug(int local) {
            debug = new Port(local, null);
            return this;
        }

        private void build(@NotNull MoePlugin plugin, @NotNull ExecSpec exec) {
            Require.nonNull(plugin);
            Require.nonNull(exec);

            exec.setWorkingDir(plugin.getSDK().getToolsDir().getAbsolutePath());

            exec.setExecutable(plugin.getSDK().getSimlauncherExec());

            if (udid != null) {
                exec.args(UDID_ARG + "=" + udid);
            }

            if (appPath != null) {
                exec.args(APP_PATH_ARG + "=" + appPath);
            }

            launchArgs.forEach(arg -> exec.args(LAUNCH_ARG_ARG + "=" + arg));

            envVars.forEach((k, v) -> exec.args(ENV_ARG + "=" + k + "=" + v));

            if (debug != null) {
                exec.args(DEBUG_ARG + "=" + debug.local);
            }
        }
    }

    private static class SimCtl {
        private static class Device {
            @NotNull
            final String name;
            @NotNull
            final String udid;
            @NotNull
            final String runtime;

            Device(@NotNull String name, @NotNull String udid, @NotNull String runtime) {
                this.name = Require.nonNull(name);
                this.udid = Require.nonNull(udid);
                this.runtime = Require.nonNull(runtime);
            }

            @Override
            public String toString() {
                return udid + " - " + runtime + " - " + name;
            }
        }

        final List<Device> devices = new ArrayList<>();

        private void initialize(@NotNull MoePlugin plugin) {
            Require.nonNull(plugin);
            final Project project = plugin.getProject();

            final String json = TaskUtils.quickExec(project, "xcrun", "simctl", "list", "-j", "runtimes", "devices");
            final JsonObject root = new JsonParser().parse(json).getAsJsonObject();
            final Map<String, String> runtimesNI = new HashMap<>();
            final Map<String, String> runtimesIN = new HashMap<>();
            final String platformDisplayName = plugin.getExtension().getPlatformType().displayName.toLowerCase();
            StreamSupport.stream(root.getAsJsonArray("runtimes").spliterator(), false)
                    .map(JsonElement::getAsJsonObject)
                    .filter(x -> x.get("availability").getAsString().equals("(available)"))
                    .filter(x -> {
                        final String identifier = x.get("identifier").getAsString();
                        final String lastcomp = identifier.substring(identifier.lastIndexOf('.') + 1);
                        return lastcomp.toLowerCase().startsWith(platformDisplayName);
                    })
                    .forEach(x -> {
                        final String name = x.get("name").getAsString();
                        final String identifier = x.get("identifier").getAsString();
                        runtimesNI.put(name, identifier);
                        runtimesIN.put(identifier, name);
                    });

            root.getAsJsonObject("devices").entrySet().stream()
                    .filter(e -> runtimesIN.containsKey(e.getKey()) || runtimesNI.containsKey(e.getKey()))
                    .flatMap(e -> StreamSupport.stream(e.getValue().getAsJsonArray().spliterator(), false)
                            .map(x -> new ImmutablePair<>(e.getKey(), x.getAsJsonObject())))
                    .filter(x -> x.getRight().get("availability").getAsString().equals("(available)"))
                    .forEach(x -> {
                        final String key = x.getLeft();
                        final String runtime;
                        if (runtimesIN.containsKey(key)) {
                            runtime = runtimesIN.get(key);
                        } else {
                            runtime = key;
                        }
                        final JsonObject value = x.getRight();
                        devices.add(new Device(value.get("name").getAsString(), value.get("udid").getAsString(), runtime));
                    });
        }
    }

    public static void addTasks(@NotNull MoePlugin plugin) {
        Require.nonNull(plugin);

        final Project project = plugin.getProject();
        final TaskContainer tasks = project.getTasks();

        // Collect devices
        final List<String> devices = new ArrayList<>();
        if (project.hasProperty(MOE_LAUNCHER_DEVICE_UDID_PROPERTY)) {
            Arrays.stream(((String) project.property(MOE_LAUNCHER_DEVICE_UDID_PROPERTY)).split(Pattern.quote(",")))
                    .map(String::trim)
                    .forEach(devices::add);
        }

        // Collect simulators
        final List<String> simulators = new ArrayList<>();
        if (project.hasProperty(MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY)) {
            Arrays.stream(((String) project.property(MOE_LAUNCHER_SIMULATOR_UDID_PROPERTY)).split(Pattern.quote(",")))
                    .map(String::trim)
                    .forEach(simulators::add);
        }

        // If there were no devices & simulators specified, add null to devices to indicate first available device
        if (devices.size() == 0 && simulators.size() == 0) {
            devices.add(null);
        }

        // Options
        final Options options = new Options();
        options.read(project);

        { // List connected devices
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            tasks.create("moeListDevices", JavaExec.class, exec -> {
                exec.setGroup(AbstractMoePlugin.MOE);
                exec.setDescription("Lists all connected devices.");
                new DeviceLauncherBuilder().setList(true).build(plugin, exec);

                exec.setIgnoreExitValue(true);
                exec.setStandardOutput(baos);
                exec.setErrorOutput(new NullOutputStream());

            }).getActions().add(task -> System.out.print("\n" + baos.toString().trim() + "\n"));
        }

        { // List available simulators
            tasks.create("moeListSimulators", DefaultTask.class, exec -> {
                exec.setGroup(AbstractMoePlugin.MOE);
                exec.setDescription("Lists all simulators.");
            }).getActions().add(task -> {
                final SimCtl simctl = new SimCtl();

                if (Os.isFamily(Os.FAMILY_MAC) && TaskUtils.checkExec(project, "which", "xcrun")) {
                    System.out.println("Initializing");
                    simctl.initialize(plugin);
                }

                final String list = simctl.devices.stream()
                        .map(d -> "- " + d)
                        .collect(Collectors.joining("\n"));
                System.out.print("\nAvailable Simulators:\n" + list.trim() + "\n");
            });
        }

        final SourceSetContainer sourceSets = plugin.getJavaConvention().getSourceSets();

        { // Launch an application on a device or simulator
            final SourceSet sourceSet = sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME);

            // Get XcodeBuild task for device
            final XcodeBuild xcodeBuildDev;
            if (devices.size() > 0) {
                xcodeBuildDev = plugin.getTaskBy(XcodeBuild.class, sourceSet, options.mode,
                        plugin.getExtension().getPlatformType());
            } else {
                xcodeBuildDev = null;
            }

            // Get XcodeBuild task for simulator
            final XcodeBuild xcodeBuildSim;
            if (simulators.size() > 0) {
                xcodeBuildSim = plugin.getTaskBy(XcodeBuild.class, sourceSet, options.mode,
                        plugin.getExtension().getPlatformType().simulatorPlatform);
            } else {
                xcodeBuildSim = null;
            }

            // Create task
            final Task launch = tasks.create("moeLaunch", task -> {
                task.setGroup(AbstractMoePlugin.MOE);
                task.setDescription("Build and run the MOE application on a device or simulator.");
                setupDevicesAndSimulators(plugin, project, devices, simulators, options, xcodeBuildDev, xcodeBuildSim, task, false);
            });
            if (options.build && xcodeBuildDev != null) {
                launch.dependsOn(xcodeBuildDev);
            }
            if (xcodeBuildDev != null) {
                launch.mustRunAfter(xcodeBuildDev);
            }
            if (options.build && xcodeBuildSim != null) {
                launch.dependsOn(xcodeBuildSim);
            }
            if (xcodeBuildSim != null) {
                launch.mustRunAfter(xcodeBuildSim);
            }
        }

        { // Launch tests on a device or simulator
            final SourceSet sourceSet = sourceSets.getByName(SourceSet.TEST_SOURCE_SET_NAME);

            // Get XcodeBuild task for device
            final XcodeBuild xcodeBuildDev;
            if (devices.size() > 0) {
                xcodeBuildDev = plugin.getTaskBy(XcodeBuild.class, sourceSet, options.mode, plugin.getExtension().getPlatformType());
            } else {
                xcodeBuildDev = null;
            }

            // Get XcodeBuild task for simulator
            final XcodeBuild xcodeBuildSim;
            if (simulators.size() > 0) {
                xcodeBuildSim = plugin.getTaskBy(XcodeBuild.class, sourceSet, options.mode, plugin.getExtension().getPlatformType().simulatorPlatform);
            } else {
                xcodeBuildSim = null;
            }

            // Create task
            final Task launch = tasks.create("moeTest", task -> {
                task.setGroup(AbstractMoePlugin.MOE);
                task.setDescription("Build and run tests on a device or simulator.");
                setupDevicesAndSimulators(plugin, project, devices, simulators, options, xcodeBuildDev, xcodeBuildSim, task, true);
            });
            if (options.build && xcodeBuildDev != null) {
                launch.dependsOn(xcodeBuildDev);
            }
            if (xcodeBuildDev != null) {
                launch.mustRunAfter(xcodeBuildDev);
            }
            if (options.build && xcodeBuildSim != null) {
                launch.dependsOn(xcodeBuildSim);
            }
            if (xcodeBuildSim != null) {
                launch.mustRunAfter(xcodeBuildSim);
            }
        }
    }

    private static class JUnitTestCollectorWriter extends OutputStream {
        private final JUnitTestCollector testCollector;

        private final ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        JUnitTestCollectorWriter(@NotNull JUnitTestCollector testCollector) {
            this.testCollector = testCollector;
        }

        @Override
        public synchronized void write(int b) throws IOException {
            if (b == '\n') {
                testCollector.appendLine(buffer.toString());
                buffer.reset();
            } else {
                buffer.write(b);
            }
        }

        @Override
        public synchronized void write(byte[] b, int off, int len) throws IOException {
            if (b == null) {
                throw new NullPointerException();
            } else if ((off < 0) || (off > b.length) || (len < 0) ||
                    ((off + len) > b.length) || ((off + len) < 0)) {
                throw new IndexOutOfBoundsException();
            } else if (len == 0) {
                return;
            }

            int start = 0;
            for (int i = start; i < len; ++i) {
                final byte d = b[off + i];
                if (d == '\n') {
                    buffer.write(b, off + start, i - start);
                    testCollector.appendLine(buffer.toString());
                    buffer.reset();
                    start = i + 1;
                }
            }
            buffer.write(b, off + start, len - start);
        }

        @Override
        public synchronized void close() throws IOException {
            if (buffer.size() > 0) {
                testCollector.appendLine(buffer.toString());
                buffer.reset();
                buffer.close();
            }
            super.close();
        }
    }

    private static void setupDevicesAndSimulators(@NotNull MoePlugin plugin, @NotNull Project project,
                                                  @NotNull List<String> devices, @NotNull List<String> simulators,
                                                  @NotNull Options options,
                                                  @Nullable XcodeBuild xcodeBuildDev, @Nullable XcodeBuild xcodeBuildSim,
                                                  @NotNull Task task, boolean test) {
        Require.nonNull(plugin);
        Require.nonNull(project);
        Require.nonNull(devices);
        Require.nonNull(simulators);
        Require.nonNull(options);
        Require.nonNull(task);

        final AtomicInteger numFailedTests = new AtomicInteger();
        final File testOutputDir = project.getBuildDir().toPath().resolve(Paths.get(MoePlugin.MOE, "reports")).toFile();
        if (test) {
            try {
                FileUtils.deleteFileOrFolder(testOutputDir);
            } catch (IOException e) {
                throw new GradleException(e.getMessage(), e);
            }
            if (!testOutputDir.exists() && !testOutputDir.mkdirs()) {
                throw new GradleException("Failed to create directory " + testOutputDir);
            }
            if (testOutputDir.exists() && !testOutputDir.isDirectory()) {
                throw new GradleException("Expected directory at " + testOutputDir);
            }
        }

        for (String udid : devices) {
            if (!options.launch) {
                continue;
            }
            task.getActions().add(t -> {
                // Get proper Xcode settings
                final Map<String, String> settings;
                if (xcodeBuildDev.getDidWork()) {
                    settings = xcodeBuildDev.getXcodeBuildSettings();
                } else {
                    settings = xcodeBuildDev.getCachedXcodeBuildSettings();
                }

                // Get app path
                final File appPath = new File(settings.get("BUILT_PRODUCTS_DIR"), settings.get("FULL_PRODUCT_NAME"));

                final JUnitTestCollector testCollector;
                if (test && !options.rawTestOutput) {
                    testCollector = new JUnitTestCollector();
                } else {
                    testCollector = null;
                }

                TaskUtils.javaexec(project, exec -> {
                    // Create device launcher
                    final DeviceLauncherBuilder builder = new DeviceLauncherBuilder().setWaitForDevice(options.waitForDevice);
                    if (udid != null) {
                        builder.setUDID(udid);
                    }
                    if (options.debug != null) {
                        builder.setDebug(options.debug.local, options.debug.remote);
                    }
                    options.envs.forEach(builder::putEnvVar);
                    options.vmargs.forEach(builder::addLaunchArgs);
                    builder.addLaunchArgs("-args");
                    options.args.forEach(builder::addLaunchArgs);
                    options.proxies.forEach(p -> builder.addProxyPort(p.local, p.remote));
                    builder.setAppPath(appPath)
                            .build(plugin, exec);

                    if (testCollector != null) {
                        final JUnitTestCollectorWriter writer = new JUnitTestCollectorWriter(testCollector);
                        exec.setStandardOutput(writer);
                        exec.setErrorOutput(writer);
                    } else {
                        exec.setStandardOutput(System.out);
                        exec.setErrorOutput(System.err);
                    }
                });

                if (testCollector != null) {
                    numFailedTests.getAndAdd(testCollector.getNumFailures() + testCollector.getNumErrors());
                    writeJUnitReport(udid == null ? "unknown-device" : udid, testCollector, testOutputDir);
                }
            });
        }

        for (String udid : simulators) {
            if (!options.launch) {
                continue;
            }
            task.getActions().add(t -> {
                // Get proper Xcode settings
                final Map<String, String> settings;
                if (xcodeBuildSim.getDidWork()) {
                    settings = xcodeBuildSim.getXcodeBuildSettings();
                } else {
                    settings = xcodeBuildSim.getCachedXcodeBuildSettings();
                }

                // Get app path
                final File appPath = new File(settings.get("BUILT_PRODUCTS_DIR"), settings.get("FULL_PRODUCT_NAME"));

                final JUnitTestCollector testCollector;
                if (test && !options.rawTestOutput) {
                    testCollector = new JUnitTestCollector();
                } else {
                    testCollector = null;
                }

                TaskUtils.exec(project, exec -> {
                    // Create simulator launcher
                    final SimulatorLauncherBuilder builder = new SimulatorLauncherBuilder();
                    if (udid != null) {
                        builder.setUDID(udid);
                    }
                    if (options.debug != null) {
                        builder.setDebug(options.debug.local);
                    }
                    options.envs.forEach(builder::putEnvVar);
                    options.vmargs.forEach(builder::addLaunchArgs);
                    builder.addLaunchArgs("-args");
                    options.args.forEach(builder::addLaunchArgs);
                    builder.setAppPath(appPath)
                            .build(plugin, exec);

                    if (testCollector != null) {
                        final JUnitTestCollectorWriter writer = new JUnitTestCollectorWriter(testCollector);
                        exec.setStandardOutput(writer);
                        exec.setErrorOutput(writer);
                    } else {
                        exec.setStandardOutput(System.out);
                        exec.setErrorOutput(System.err);
                    }
                });

                if (testCollector != null) {
                    numFailedTests.getAndAdd(testCollector.getNumFailures() + testCollector.getNumErrors());
                    writeJUnitReport(udid == null ? "unknown-simulator" : udid, testCollector, testOutputDir);
                }
            });
        }

        if (test) {
            task.getActions().add(t -> {
                if (numFailedTests.get() > 0) {
                    throw new GradleException(numFailedTests.get() + " tests failed on all targets combined, reports can be found here: " + testOutputDir);
                }
            });
        }
    }

    private static void writeJUnitReport(@NotNull String udid, @NotNull JUnitTestCollector testCollector,
                                         @NotNull File out) {
        Require.nonNull(udid);
        Require.nonNull(testCollector);
        Require.nonNull(out);

        final File out_xml = prepareOutputSubdir(out, "xml");
        final File out_html = prepareOutputSubdir(out, "html");
        final File out_txt = prepareOutputSubdir(out, "txt");

        // Try to write xml
        try {
            final File file = new File(out_xml, udid + ".xml");
            FileUtils.write(file, testCollector.getXMLReport());
        } catch (GradleException ex) {
            LOG.error(ex.getMessage(), ex.getCause());
        }

        // Try to write html
        try {
            final File file = new File(out_html, udid + ".html");
            FileUtils.write(file, testCollector.getHTMLReport(udid));
        } catch (GradleException ex) {
            LOG.error(ex.getMessage(), ex.getCause());
        }

        // Try to write txt
        try {
            final File file = new File(out_txt, udid + ".txt");
            FileUtils.write(file, testCollector.getCompleteInput());
        } catch (GradleException ex) {
            LOG.error(ex.getMessage(), ex.getCause());
        }
    }

    private static File prepareOutputSubdir(@NotNull File parent, String name) {
        final File out = new File(parent, name);
        if (!out.mkdir()) {
            LOG.info("mkdir failed for " + out);
        }
        if (!out.exists()) {
            throw new GradleException("Directory doesn't exist at " + out);
        }
        if (!out.isDirectory()) {
            throw new GradleException("Expected directory at " + out);
        }
        return out;
    }
}
