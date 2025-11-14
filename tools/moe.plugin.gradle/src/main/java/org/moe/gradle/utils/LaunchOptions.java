package org.moe.gradle.utils;

import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.moe.gradle.anns.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LaunchOptions {

    private static final String MOE_LAUNCHER_OPTIONS_PROPERTY = "moe.launcher.options";

    private static final String MOE_LAUNCHER_CONFIG_OPTION = "config";
    private static final String MOE_LAUNCHER_NO_WAIT_DEVICE_OPTION = "no-wait-device";
    private static final String MOE_LAUNCHER_NO_BUILD_OPTION = "no-build";
    private static final String MOE_LAUNCHER_NO_LAUNCH_OPTION = "no-launch";
    private static final String MOE_LAUNCHER_INSTALL_ON_TARGET_OPTION = "install-on-target";
    private static final String MOE_LAUNCHER_NO_INSTALL_ON_TARGET_OPTION = "no-install-on-target";
    private static final String MOE_LAUNCHER_DEBUG_OPTION = "debug";
    private static final String MOE_LAUNCHER_ENV_OPTION = "env";
    private static final String MOE_LAUNCHER_VMARG_OPTION = "vmarg";
    private static final String MOE_LAUNCHER_ARG_OPTION = "arg";
    private static final String MOE_LAUNCHER_PROXY_OPTION = "proxy";
    private static final String MOE_LAUNCHER_RAW_TEST_OUTPUT_OPTION = "raw-test-output";


    private boolean build = true;
    private boolean launch = true;
    private boolean installOnTarget = true;
    private boolean waitForDevice = true;
    private Mode mode = Mode.RELEASE;
    private RemotePort debug;
    private final Map<String, String> envs = new HashMap<>();
    private final List<String> vmargs = new ArrayList<>();
    private final List<String> args = new ArrayList<>();
    private final List<RemotePort> proxies = new ArrayList<>();
    private boolean rawTestOutput = false;

    public void read(@NotNull Project project) {
        Require.nonNull(project);

        if (!project.hasProperty(MOE_LAUNCHER_OPTIONS_PROPERTY)) {
            return;
        }

        final List<String> list = getUnescapedValues((String)project.property(MOE_LAUNCHER_OPTIONS_PROPERTY));
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
                    throw new GradleException("Launcher option '" + MOE_LAUNCHER_CONFIG_OPTION + "' requires one "
                            + "of the following values: debug, release. Defaults to release. Usage: '"
                            + MOE_LAUNCHER_CONFIG_OPTION + ":debug'");
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
                installOnTarget = true;

            } else if (MOE_LAUNCHER_NO_LAUNCH_OPTION.equals(key)) {
                if (value != null) {
                    project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                }
                launch = false;
                installOnTarget = false;

            } else if (MOE_LAUNCHER_INSTALL_ON_TARGET_OPTION.equals(key)) {
                if (value != null) {
                    project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                }
                installOnTarget = true;

            } else if (MOE_LAUNCHER_NO_INSTALL_ON_TARGET_OPTION.equals(key)) {
                if (value != null) {
                    project.getLogger().warn("Ignoring value for launcher option: '" + key + "'");
                }
                installOnTarget = false;

            } else if (MOE_LAUNCHER_DEBUG_OPTION.equals(key)) {
                if (value == null) {
                    throw new GradleException("Launcher option '" + MOE_LAUNCHER_DEBUG_OPTION + "' requires a "
                            + "value in one of the following formats: <local> or <local>:<remote>. Usage: '"
                            + MOE_LAUNCHER_DEBUG_OPTION + ":5005'");
                }
                if (value.indexOf(':') != -1) {
                    debug = new RemotePort(Integer.parseInt(value.substring(0, value.indexOf(':'))),
                            Integer.parseInt(value.substring(value.indexOf(':') + 1)));
                } else {
                    debug = new RemotePort(Integer.parseInt(value), null);
                }

            } else if (MOE_LAUNCHER_ENV_OPTION.equals(key)) {
                if (value == null) {
                    throw new GradleException(
                            "Launcher option '" + MOE_LAUNCHER_ENV_OPTION + "' requires a value. " + "Usage: '"
                                    + MOE_LAUNCHER_ENV_OPTION + ":key=value'");
                }
                final int kvsep = value.indexOf("=");
                if (kvsep != -1) {
                    envs.put(value.substring(0, kvsep), value.substring(kvsep + 1));
                } else {
                    envs.put(value, "");
                }

            } else if (MOE_LAUNCHER_VMARG_OPTION.equals(key)) {
                if (value == null) {
                    throw new GradleException(
                            "Launcher option '" + MOE_LAUNCHER_VMARG_OPTION + "' requires a value. " + "Usage: '"
                                    + MOE_LAUNCHER_VMARG_OPTION + ":-Xhello'");
                }
                vmargs.add(value);

            } else if (MOE_LAUNCHER_ARG_OPTION.equals(key)) {
                if (value == null) {
                    throw new GradleException(
                            "Launcher option '" + MOE_LAUNCHER_ARG_OPTION + "' requires a value. " + "Usage: '"
                                    + MOE_LAUNCHER_ARG_OPTION + ":helloworld'");
                }
                args.add(value);

            } else if (MOE_LAUNCHER_PROXY_OPTION.equals(key)) {
                if (value == null) {
                    throw new GradleException("Launcher option '" + MOE_LAUNCHER_PROXY_OPTION + "' requires a "
                            + "value in one of the following formats: <local> or <local>:<remote>. Usage: '"
                            + MOE_LAUNCHER_PROXY_OPTION + ":8080'");
                }
                final RemotePort port;
                if (value.indexOf(':') != -1) {
                    port = new RemotePort(Integer.parseInt(value.substring(0, value.indexOf(':'))),
                            Integer.parseInt(value.substring(value.indexOf(':') + 1)));
                } else {
                    port = new RemotePort(Integer.parseInt(value), null);
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

    public boolean isBuild() {
        return build;
    }

    public boolean isLaunch() {
        return launch;
    }

    public boolean isInstallOnTarget() {
        return installOnTarget;
    }

    public boolean isWaitForDevice() {
        return waitForDevice;
    }

    public Mode getMode() {
        return mode;
    }

    public RemotePort getDebug() {
        return debug;
    }

    public Map<String, String> getEnvs() {
        return envs;
    }

    public List<String> getVMArgs() {
        return vmargs;
    }

    public List<String> getArgs() {
        return args;
    }

    public List<RemotePort> getProxies() {
        return proxies;
    }

    public boolean isRawTestOutput() {
        return rawTestOutput;
    }
}
