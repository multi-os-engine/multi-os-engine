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

import com.intellij.execution.Executor;
import com.intellij.execution.RunnerAndConfigurationSettings;
import com.intellij.execution.configurations.ParametersList;
import com.intellij.execution.executors.DefaultRunExecutor;
import com.intellij.execution.impl.DefaultJavaProgramRunner;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.notification.Notification;
import com.intellij.notification.NotificationListener;
import com.intellij.notification.NotificationType;
import com.intellij.notification.Notifications;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ShowSettingsUtil;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.concurrency.Semaphore;
import com.intellij.util.execution.ParametersListUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.maven.execution.MavenRunner;
import org.jetbrains.idea.maven.execution.MavenRunnerParameters;
import org.jetbrains.idea.maven.execution.MavenRunnerSettings;
import org.jetbrains.idea.maven.execution.RunnerBundle;
import org.jetbrains.idea.maven.model.MavenExplicitProfiles;
import org.jetbrains.idea.maven.project.MavenGeneralSettings;
import org.jetbrains.idea.maven.project.MavenProject;
import org.jetbrains.idea.maven.project.MavenProjectsManager;
import org.jetbrains.idea.maven.tasks.TasksBundle;
import org.jetbrains.idea.maven.utils.MavenLog;
import org.jetbrains.idea.maven.utils.MavenSettings;
import org.jetbrains.idea.maven.utils.MavenUtil;
import org.moe.common.configuration.RemoteSettings;
import org.moe.idea.MOEGlobalSettings;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.utils.ModuleUtils;

import javax.swing.event.HyperlinkEvent;
import java.io.File;
import java.util.*;

import static org.jetbrains.idea.maven.execution.MavenRunConfigurationType.createRunnerAndConfigurationSettings;
import static org.moe.idea.utils.ModuleUtils.findPomXml;

public class MOEMavenTask {

    public static final String GRADLE_LOG_LEVEL_PROPERTY = "moe.gradle.log.level=";
    public static final String GRADLE_STACKTRACE_LEVEL_PROPERTY = "moe.gradle.stacktrace.level=";
    public static final String CONFIGURATION_MAVEN = "moe.configuration=";
    public static final String REMOTEBUILD_ENABLED = "moe.remotebuild=";
    public static final String SIMULATOR_UDID = "moe.simulator.udid=";

    private MOERunConfiguration moeRunConfig;
    private Module module;
    private boolean finished = false;

    public MOEMavenTask(MOERunConfiguration moeRunConfig) {
        super();
        this.moeRunConfig = moeRunConfig;
        this.module = moeRunConfig.module();
    }

    public String getWorkPath() {
        return ModuleUtils.getModulePath(moeRunConfig.module());
    }

    public String getGoal() {
        return "moe:xcodebuild";
    }

    public boolean runTask() {

        String workDirectory = getWorkPath();

        MavenProjectsManager projectsManager = MavenProjectsManager.getInstance(module.getProject());

        File mavenHome = MavenUtil.resolveMavenHomeDirectory(projectsManager.getGeneralSettings().getMavenHome());
        if (mavenHome == null) {
            Notification notification = new Notification(MavenUtil.MAVEN_NOTIFICATION_GROUP,
                    "Failed to execute goal",
                    RunnerBundle.message("external.maven.home.no.default.with.fix"), NotificationType.ERROR,
                    new NotificationListener.Adapter() {
                        @Override
                        protected void hyperlinkActivated(@NotNull Notification notification,
                                                          @NotNull HyperlinkEvent e) {
                            ShowSettingsUtil.getInstance()
                                    .showSettingsDialog(module.getProject(), MavenSettings.DISPLAY_NAME);
                        }
                    });

            Notifications.Bus.notify(notification, module.getProject());
            return false;
        }

        StringBuilder goalBuilder = new StringBuilder();

        if (moeRunConfig.runJUnitTests()) {
            goalBuilder.append("moe:testxcodebuild");
        } else {
            goalBuilder.append("moe:xcodebuild");
        }

        addBuildArguments(goalBuilder);

        MavenRunnerParameters parameters =
                new MavenRunnerParameters(true, workDirectory, Arrays.asList(ParametersList.parse(goalBuilder.toString())), Collections.<String>emptyList());

        MavenGeneralSettings generalSettings = new MavenGeneralSettings();
        generalSettings.setMavenHome(mavenHome.getPath());

        MavenRunnerSettings runnerSettings = MavenRunner.getInstance(module.getProject()).getSettings().clone();
        runnerSettings.setMavenProperties(new LinkedHashMap<String, String>());
        runnerSettings.setSkipTests(true);

        RunnerAndConfigurationSettings configSettings = createRunnerAndConfigurationSettings(generalSettings, runnerSettings, parameters, module.getProject());
        ProgramRunner runner = DefaultJavaProgramRunner.getInstance();
        Executor executor = DefaultRunExecutor.getRunExecutorInstance();
        ExecutionEnvironment environment = new ExecutionEnvironment(executor, runner, configSettings, module.getProject());

        return executeTask(module.getProject(), getMavenProject(), environment, goalBuilder.toString());
    }

    private void addBuildArguments(StringBuilder goalBuilder) {
        List<String> args = new ArrayList<String>();

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

    public boolean executeTask(final Project project,
                               final MavenProject mavenProject,
                               ExecutionEnvironment env,
                               final String goal) {
        final Semaphore targetDone = new Semaphore();
        final boolean[] result = new boolean[]{true};

        try {
            ApplicationManager.getApplication().invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    if (project == null || project.isDisposed() || mavenProject == null) return;

                    final MavenExplicitProfiles explicitProfiles = MavenProjectsManager.getInstance(project).getExplicitProfiles();
                    final MavenRunner mavenRunner = MavenRunner.getInstance(project);

                    targetDone.down();
                    new Task.Backgroundable(project, TasksBundle.message("maven.tasks.executing"), true) {
                        public void run(@NotNull ProgressIndicator indicator) {
                            try {
                                MavenRunnerParameters params = new MavenRunnerParameters(
                                        true,
                                        mavenProject.getDirectory(),
                                        ParametersListUtil.parse(goal),
                                        explicitProfiles.getEnabledProfiles(),
                                        explicitProfiles.getDisabledProfiles());

                                result[0] = mavenRunner.runBatch(Collections.singletonList(params),
                                        null,
                                        null,
                                        TasksBundle.message("maven.tasks.executing"),
                                        indicator);
                            }
                            finally {
                                targetDone.up();
                            }
                        }

                        @Override
                        public boolean shouldStartInBackground() {
                            return MavenRunner.getInstance(project).getSettings().isRunMavenInBackground();
                        }

                        @Override
                        public void processSentToBackground() {
                            MavenRunner.getInstance(project).getSettings().setRunMavenInBackground(true);
                        }
                    }.queue();
                }
            }, ModalityState.NON_MODAL);
        }
        catch (Exception e) {
            MavenLog.LOG.error(e);
            return false;
        }
        targetDone.waitFor();
        return result[0];
    }

    private MavenProject getMavenProject() {
        String pomXmlPath = findPomXml(module);
        if (pomXmlPath == null || pomXmlPath.isEmpty()) {
            return null;
        }
        VirtualFile file = LocalFileSystem.getInstance().findFileByPath(pomXmlPath);
        if (file == null) return null;

        MavenProjectsManager manager = MavenProjectsManager.getInstance(module.getProject());
        if (manager == null) {
            return null;
        }
        return manager.findProject(file);
    }
}
