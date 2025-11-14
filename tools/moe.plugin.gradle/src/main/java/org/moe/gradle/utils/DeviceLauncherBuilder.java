package org.moe.gradle.utils;

import org.gradle.process.JavaExecSpec;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeviceLauncherBuilder {
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

    public enum InstallMode {
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
    private final List<RemotePort> proxyPorts = new ArrayList<>();
    private RemotePort debug;
    private InstallMode installMode;
    private Integer nativeDebug;
    private Integer output;
    private File outputFile;

    public DeviceLauncherBuilder setUDID(@Nullable String udid) {
        this.udid = udid;
        return this;
    }

    public DeviceLauncherBuilder setAppPath(@Nullable File appPath) {
        this.appPath = appPath;
        return this;
    }

    public DeviceLauncherBuilder setList(boolean list) {
        this.list = list;
        return this;
    }

    public DeviceLauncherBuilder setWaitForDevice(boolean waitForDevice) {
        this.waitForDevice = waitForDevice;
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder addLaunchArgs(@NotNull String arg) {
        launchArgs.add(Require.nonNull(arg));
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder putEnvVar(@NotNull String key, @Nullable String value) {
        if (value == null) {
            envVars.remove(Require.nonNull(key));
        } else {
            envVars.put(Require.nonNull(key), value);
        }
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder addProxyPort(int local, @Nullable Integer remote) {
        proxyPorts.add(new RemotePort(local, remote));
        return this;
    }

    public DeviceLauncherBuilder setDebug(int local, @Nullable Integer remote) {
        debug = new RemotePort(local, remote);
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder setInstallMode(@Nullable InstallMode mode) {
        this.installMode = mode;
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder setNativeDebug(@Nullable Integer local) {
        nativeDebug = local;
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder setOutput(@Nullable Integer local) {
        output = local;
        return this;
    }

    @IgnoreUnused
    public DeviceLauncherBuilder setOutputFile(@Nullable File file) {
        outputFile = file;
        return this;
    }

    public void build(@NotNull MoeSDK sdk, @NotNull JavaExecSpec exec) {
        Require.nonNull(sdk);
        Require.nonNull(exec);

        exec.setWorkingDir(sdk.getToolsDir().getAbsolutePath());

        exec.setMain("-jar");
        exec.args(sdk.getiOSDeviceJar().getAbsolutePath());

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

