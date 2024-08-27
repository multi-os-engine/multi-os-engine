/*
Copyright 2014-2016 Intel Corporation

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

package org.moe.idea.compiler;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.text.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.plugins.gradle.service.GradleInstallationManager;
import org.moe.common.configuration.RemoteSettings;
import org.moe.common.exec.GradleExec;
import org.moe.common.utils.NativeUtil;
import org.moe.idea.MOEGlobalSettings;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MOEGradleRunner {

    private static final Logger LOG = LoggerFactory.getLogger(MOEGradleRunner.class);

    private final MOERunConfiguration runConfig;

    public MOEGradleRunner(MOERunConfiguration runConfig) {
        if (runConfig == null) {
            throw new NullPointerException();
        }
        this.runConfig = runConfig;
    }

    public static GeneralCommandLine construct(Module module, String... args) throws IOException {
        final List<String> cmdargs = new ArrayList<String>();

        // Get Gradle
        File workingDir = new File(ModuleUtils.getModulePath(module));
        GradleExec exec = new GradleExec(workingDir, null);
        cmdargs.add(exec.getExecPath());

        for (String arg : args) {
            cmdargs.add(arg);
        }

        return new GeneralCommandLine(cmdargs).withWorkDirectory(workingDir).withEnvironment("JAVA_HOME", MOEGradleRunner.requireGradleJavaHome(module).getAbsolutePath());
    }

    public GeneralCommandLine construct(boolean isDebug, boolean isLaunch) throws ExecutionException, IOException {
        final List<String> args = new ArrayList<String>();

        // Get Gradle
        Module module = runConfig.module();
        File workingDir = new File(ModuleUtils.getModulePath(module));
        GradleExec exec = new GradleExec(workingDir, null);
        args.add(exec.getExecPath());

        // Pass moe task
        if (runConfig.runJUnitTests()) {
            args.add("moeTest");
        } else {
            args.add("moeLaunch");
        }

        MOEGlobalSettings globalSettings = MOEGlobalSettings.getInstance();
        String logLevel = globalSettings.getGradleLoggingLevel();
        if (logLevel != null && !logLevel.isEmpty()) {
            args.add(logLevel);
        }
        String stacktraceLevel = globalSettings.getGradleStacktraceLevel();
        if (stacktraceLevel != null && !stacktraceLevel.isEmpty()) {
            args.add(stacktraceLevel);
        }

        final OptionsBuilder options = new OptionsBuilder();

        // Push mode
        if (isLaunch) {
            options.push("no-build");
            options.push("no-install-on-target");
        } else {
            options.push("no-launch");
            options.push("install-on-target");
        }

        // Push config
        options.push("config:" + runConfig.configuration());

        // Push debug
        if (isDebug) {
            if (runConfig.runOnSimulator()) {
                options.push("debug:" + runConfig.debugPort());
            } else {
                options.push("debug:" + runConfig.debugPort() + ":" + runConfig.debugRemotePort());
            }
        }

        List<String> vmArgs = runConfig.getVMArguments();
        if (vmArgs != null) {
            for (String arg : vmArgs) {
                if (arg != null && !arg.isEmpty()) {
                    options.push("vmarg:" + arg);
                }
            }
        }

        Map<String, String> environmentVariables = runConfig.getEnvironmentVariables();
        if (environmentVariables != null) {
            for (Map.Entry<String, String> arg : environmentVariables.entrySet()) {
                options.push("env:" + arg.getKey() + "=" + arg.getValue());
            }
        }

        List<String> programArguments = runConfig.getProgramArguments();
        if (programArguments != null) {
            for (String arg : programArguments) {
                if (arg != null && !arg.isEmpty()) {
                    options.push("arg:" + arg);
                }
            }
        }

        // Push test args
        if (runConfig.runJUnitTests()) {
            options.push("raw-test-output");
            String[] testArgs = runConfig.getTestArgs();
            if (testArgs != null) {
                for (String testArg : testArgs) {
                    if (testArg != null && !testArg.isEmpty()) {
                        options.push("arg:" + testArg);
                    }
                }
            }
        }

        // Pass option
        final String optionsString = options.toString();
        if (optionsString.length() > 0) {
            args.add(optionsString);
        }

        // Pass remote build settings
        if (runConfig.isRemoteBuildEnabled()) {
            args.add("-Pmoe.remotebuild.properties.ignore");
            Properties properties = RemoteSettings.getProperties(runConfig.getRemoteHost(), Integer.toString(runConfig.getRemotePort()),
                    runConfig.getRemoteUser(), runConfig.getRemoteKnownhosts(), runConfig.getRemoteIdentity(),
                    runConfig.getRemoteKeychainName(), runConfig.getRemoteKeychainPass(),
                    Integer.toString(runConfig.getRemoteKeychainLocktimeout()), runConfig.getRemoteGradleRepositories());
            RemoteSettings.getArguments("-P", properties, args);
        }

        // Pass target device
        if (runConfig.runOnSimulator()) {
            args.add("-Pmoe.launcher.simulators=" + runConfig.simulatorUdid());
        } else {
            if (!StringUtil.isEmptyOrSpaces(runConfig.deviceUdid())) {
                args.add("-Pmoe.launcher.devices=" + runConfig.deviceUdid());
            }
        }

        // Pass arch
        switch (runConfig.archType()) {
            case MOERunConfiguration.ARCH_TYPE_ALL:
                // No extra arg needed
                break;
            case MOERunConfiguration.ARCH_TYPE_AUTO:
                if (runConfig.runOnSimulator()) {
                    // Detect arch
                    if (NativeUtil.isHostAARCH64()) {
                        args.add("-Pmoe.archs=" + MOERunConfiguration.ARCH_ARM64);
                    } else {
                        args.add("-Pmoe.archs=" + MOERunConfiguration.ARCH_X86_64);
                    }
                } else {
                    // Fallback to ALL
                    LOG.warn("Unable to use auto architecture detection when running on real device, build all architectures instead");
                }
                break;
            case MOERunConfiguration.ARCH_TYPE_MANUAL:
                if (StringUtil.isEmpty(runConfig.architectures())) {
                    throw new ExecutionException("Invalid architectures " + runConfig.architectures());
                }
                args.add("-Pmoe.archs=" + runConfig.architectures());
                break;
            default:
                throw new ExecutionException("Unknown arch type " + runConfig.archType());
        }

        return new GeneralCommandLine(args).withWorkDirectory(workingDir).withEnvironment("JAVA_HOME", MOEGradleRunner.requireGradleJavaHome(module).getAbsolutePath());
    }

    private static class OptionsBuilder {
        private final StringBuilder builder = new StringBuilder();

        OptionsBuilder push(String value) {
            builder.append(",").append(value.replaceAll(",", "\\\\,"));
            return this;
        }

        @Override
        public String toString() {
            return builder.length() == 1 ? "" : ("-Pmoe.launcher.options=" + builder.substring(1));
        }
    }

    @Nullable
    public static File getGradleJavaHome(@NotNull Project project) {
        String p = GradleInstallationManager.getInstance().getGradleJvmPath(project, project.getBasePath());

        return p == null ? null : new File(p);
    }

    @Nullable
    public static File getGradleJavaHome(@NotNull Module module) {
        return getGradleJavaHome(module.getProject());
    }

    @NotNull
    public static File requireGradleJavaHome(@NotNull Project project) throws IOException {
        File javaHome = getGradleJavaHome(project);
        if (javaHome == null) {
            throw new IOException("Module SDK not configured or it's not a valid JDK");
        }

        return javaHome;
    }

    @NotNull
    public static File requireGradleJavaHome(@NotNull Module module) throws IOException {
        return requireGradleJavaHome(module.getProject());
    }
}
