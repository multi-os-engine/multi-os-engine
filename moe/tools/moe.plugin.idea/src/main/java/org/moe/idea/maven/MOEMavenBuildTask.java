/*
 * Copyright 2000-2014 JetBrains s.r.o.
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.idea.maven;

import org.moe.common.configuration.RemoteSettings;
import org.moe.idea.MOEGlobalSettings;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.utils.ModuleUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MOEMavenBuildTask extends MOEMavenTask {

    private MOERunConfiguration moeRunConfig;

    public MOEMavenBuildTask(MOERunConfiguration moeRunConfig) {
        super(moeRunConfig.module());
        this.moeRunConfig = moeRunConfig;
    }

    public String getWorkPath() {
        return ModuleUtils.getModulePath(moeRunConfig.module());
    }

    @Override
    protected void setGoalTarget(StringBuilder goalBuilder) {
        if (moeRunConfig.runJUnitTests()) {
            goalBuilder.append("moe:testxcodebuild");
        } else {
            goalBuilder.append("moe:xcodebuild");
        }
    }

    @Override
    protected void addArguments(StringBuilder goalBuilder) {
        List<String> args = new ArrayList<String>();

        args.add("-Dmoe.install.ontarget=true");

        MOEGlobalSettings globalSettings = MOEGlobalSettings.getInstance();
        String logLevel = globalSettings.getGradleLoggingLevel();
        if (logLevel != null && !logLevel.isEmpty()) {
            args.add("-D" + GRADLE_LOG_LEVEL_PROPERTY + logLevel);
        }

        String stacktraceLevel = globalSettings.getGradleStacktraceLevel();
        if (stacktraceLevel != null && !stacktraceLevel.isEmpty()) {
            args.add("-D" + GRADLE_STACKTRACE_LEVEL_PROPERTY + stacktraceLevel);
        }

        args.add("-D" + CONFIGURATION_MAVEN + moeRunConfig.configuration());

        boolean isRemoteBuildEnabled = moeRunConfig.isRemoteBuildEnabled();

        if (isRemoteBuildEnabled) {
            addRemoteMavenBuildArguments(args);
        }

        if (moeRunConfig.runOnSimulator()) {
            args.add("-D" + SIMULATOR_UDID + moeRunConfig.simulatorUdid());
        }

        for (String arg : args) {
            goalBuilder.append(" " + arg);
        }
    }

    private void addRemoteMavenBuildArguments(List<String> args) {
        args.add("-D" + REMOTEBUILD_ENABLED + "true");
        addRemoteArguments("-D", args);
    }

    private void addRemoteArguments(String prefix, List<String> args) {
        args.add("-Pmoe.remotebuild.properties.ignore");
        Properties properties = RemoteSettings.getProperties(moeRunConfig.getRemoteHost(), Integer.toString(moeRunConfig.getRemotePort()),
                moeRunConfig.getRemoteUser(), moeRunConfig.getRemoteKnownhosts(), moeRunConfig.getRemoteIdentity(),
                moeRunConfig.getRemoteKeychainName(), moeRunConfig.getRemoteKeychainPass(),
                Integer.toString(moeRunConfig.getRemoteKeychainLocktimeout()), moeRunConfig.getRemoteGradleRepositories());
        RemoteSettings.getArguments("-D", properties, args);
    }
}
