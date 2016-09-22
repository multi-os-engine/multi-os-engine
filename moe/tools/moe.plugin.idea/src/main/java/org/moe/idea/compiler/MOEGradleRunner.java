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
import com.intellij.openapi.module.Module;
import com.intellij.openapi.util.text.StringUtil;
import org.moe.common.exec.GradleExec;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MOEGradleRunner {

    private final MOERunConfiguration runConfig;

    public MOEGradleRunner(MOERunConfiguration runConfig) {
        if (runConfig == null) {
            throw new NullPointerException();
        }
        this.runConfig = runConfig;
    }

    public GeneralCommandLine construct(boolean isDebug, boolean isLaunch) throws ExecutionException {
        final List<String> args = new ArrayList<String>();

        // Get Gradle
        Module module = runConfig.module();
        File workingDir = new File(ModuleUtils.getModulePath(module));
        GradleExec exec = new GradleExec(workingDir);
        args.add(exec.getExecPath());

        // Pass moe task
        if (runConfig.runJUnitTests()) {
            args.add("moeTest");
        } else {
            args.add("moeLaunch");
        }

        final OptionsBuilder options = new OptionsBuilder();

        // Push mode
        if (isLaunch) {
            options.push("no-build");
        } else {
            options.push("no-launch");
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

        List<String> environmentVariables = runConfig.getEnvironmentVariables();
        if (environmentVariables != null) {
            for (String arg : environmentVariables) {
                if (arg != null && !arg.isEmpty()) {
                    options.push("env:" + arg);
                }
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
            for (String testArg : runConfig.getTestArgs()) {
                if (testArg != null && !testArg.isEmpty()) {
                    options.push("arg:" + testArg);
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
            args.add("-Pmoe.remotebuild.host=" + runConfig.getRemoteHost());
            args.add("-Pmoe.remotebuild.port=" + Integer.toString(runConfig.getRemotePort()));
            args.add("-Pmoe.remotebuild.user=" + runConfig.getRemoteUser());
            args.add("-Pmoe.remotebuild.knownhosts=" + runConfig.getRemoteKnownhosts());
            args.add("-Pmoe.remotebuild.identity=" + runConfig.getRemoteIdentity());
            args.add("-Pmoe.remotebuild.keychain.name=" + runConfig.getRemoteKeychainName());
            args.add("-Pmoe.remotebuild.keychain.pass=" + runConfig.getRemoteKeychainPass());
            args.add("-Pmoe.remotebuild.keychain.locktimeout=" + Integer.toString(runConfig.getRemoteKeychainLocktimeout()));
            args.add("-Pmoe.remotebuild.gradle.repositories=" + runConfig.getRemoteGradleRepositories());
        }

        // Pass target device
        if (runConfig.runOnSimulator()) {
            args.add("-Pmoe.launcher.simulators=" + runConfig.simulatorUdid());
        } else {
            if (!StringUtil.isEmptyOrSpaces(runConfig.deviceUdid())) {
                args.add("-Pmoe.launcher.devices=" + runConfig.deviceUdid());
            }
        }

        return new GeneralCommandLine(args).withWorkDirectory(workingDir);
    }

    private static class OptionsBuilder {
        private final StringBuilder builder = new StringBuilder();

        OptionsBuilder push(String value) {
            builder.append(",").append(value.replaceAll(",", "\\,"));
            return this;
        }

        @Override
        public String toString() {
            return builder.length() == 1 ? "" : ("-Pmoe.launcher.options=" + builder.substring(1));
        }
    }
}
