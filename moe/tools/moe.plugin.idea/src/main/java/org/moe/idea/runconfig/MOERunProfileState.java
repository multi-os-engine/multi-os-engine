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

package org.moe.idea.runconfig;

import com.intellij.execution.DefaultExecutionResult;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.CommandLineState;
import com.intellij.execution.filters.TextConsoleBuilder;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.GradleExec;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.runconfig.configuration.test.MOETestListener;
import org.moe.idea.runconfig.configuration.test.MOETestResultParser;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MOERunProfileState extends CommandLineState {

    private final MOERunConfigurationBase runConfiguration;
    private Project project;
    private ProcessHandler processHandler;
    private boolean needResultParser;
    private ConsoleView console;
    String[] testArgs;

    public MOERunProfileState(Project project, ExecutionEnvironment environment) {
        super(environment);

        if (getEnvironment().getRunnerAndConfigurationSettings() == null) {
            throw new RuntimeException("RunConfiguration can't be null.");
        }

        this.runConfiguration = (MOERunConfigurationBase) getEnvironment().getRunnerAndConfigurationSettings().getConfiguration();

        this.project = project;

        try {
            if (runConfiguration.runJUnitTests()) {
                this.console = MOEJUnitUtil.getTestConsole(this, environment.getExecutor(), runConfiguration, project);
            } else {
                this.console = getConsole(this, environment.getExecutor(), runConfiguration, project);
            }
        } catch (ExecutionException e) {

        }
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {

        MOEToolWindow.getInstance(project).show();

        return createProcessHandler();
    }

    @NotNull
    private OSProcessHandler createProcessHandler() throws ExecutionException {

        if (runConfiguration.configuration() == null) {
            throw new ExecutionException("Invalid build configuration for " + runConfiguration.getClass().getName());
        } else if (runConfiguration.architecture() == null) {
            throw new ExecutionException("Invalid architecture for " + runConfiguration.getClass().getName());
        }

        int debugPort = 0;
        int debugRemotePort = 0;
        needResultParser = false;
        testArgs = null;

        if (runConfiguration.debug()) {
            debugPort = runConfiguration.debugPort();
            debugRemotePort = runConfiguration.debugRemotePort();
        }

        Process process = null;
        StringBuilder optionsStringBuilder = null;

        List<String> args = new ArrayList<String>();
        String deviceUdid = runConfiguration.deviceUdid();

        boolean runOnSimulator = false;
        if (runConfiguration instanceof MOERunConfiguration) {

            MOERunConfiguration configurationLocal = (MOERunConfiguration) runConfiguration;

            if (configurationLocal.runJUnitTests()) {
                testArgs = configurationLocal.getTestArgs();
                needResultParser = true;
                args.add("moeTest");
            } else {
                args.add("moeLaunch");
            }

            boolean isDebug = configurationLocal.getActionType().equals("Debug");

            if (optionsStringBuilder == null) {
                optionsStringBuilder = new StringBuilder();
                optionsStringBuilder.append("-Pmoe.launcher.options=");
            }

            optionsStringBuilder.append("config:" + configurationLocal.configuration());
            optionsStringBuilder.append(",");

            if (configurationLocal.isRemoteBuildEnabled()) {
                args.add("-Pmoe.remotebuild.properties.ignore");
                args.add("-Pmoe.remotebuild.host=" + configurationLocal.getRemoteHost());
                args.add("-Pmoe.remotebuild.port=" + Integer.toString(configurationLocal.getRemotePort()));
                args.add("-Pmoe.remotebuild.user=" + configurationLocal.getRemoteUser());
                args.add("-Pmoe.remotebuild.knownhosts=" + configurationLocal.getRemoteKnownhosts());
                args.add("-Pmoe.remotebuild.identity=" + configurationLocal.getRemoteIdentity());
                args.add("-Pmoe.remotebuild.keychain.pass=" + configurationLocal.getRemoteKeychainPass());
                args.add("-Pmoe.remotebuild.keychain.locktimeout=" + Integer.toString(configurationLocal.getRemoteKeychainLocktimeout()));
                args.add("-Pmoe.remotebuild.gradle.repositories=" + configurationLocal.getRemoteGradleRepositories());
            }

            if (configurationLocal.runOnSimulator()) {
                deviceUdid = configurationLocal.simulatorUdid();

                args.add("-Pmoe.launcher.simulators=" + deviceUdid);
                if (isDebug) {
                    if (optionsStringBuilder == null) {
                        optionsStringBuilder = new StringBuilder();
                        optionsStringBuilder.append("-Pmoe.launcher.options=");
                    }
                    optionsStringBuilder.append("debug:" + Integer.toString(debugPort));
                    optionsStringBuilder.append(",");
                }
            } else {
                args.add("-Pmoe.launcher.devices=" + deviceUdid);
                if (isDebug) {
                    if (optionsStringBuilder == null) {
                        optionsStringBuilder = new StringBuilder();
                        optionsStringBuilder.append("-Pmoe.launcher.options=");
                    }
                    optionsStringBuilder.append("debug:" + Integer.toString(debugPort) + ":" + Integer.toString(debugRemotePort));
                    optionsStringBuilder.append(",");
                }
            }

            if (testArgs != null) {
                if (optionsStringBuilder == null) {
                    optionsStringBuilder = new StringBuilder();
                    optionsStringBuilder.append("-Pmoe.launcher.options=");
                }
                optionsStringBuilder.append("raw-test-output");
                optionsStringBuilder.append(",");
                for (String arg : testArgs) {
                    optionsStringBuilder.append("arg:" + arg);
                    optionsStringBuilder.append(",");
                }
            }

            Module module = ModuleManager.getInstance(runConfiguration.getProject()).findModuleByName(runConfiguration.moduleName());
            File f = new File(ModuleUtils.getModulePath(module));
            GradleExec exec = new GradleExec(f);
            if (optionsStringBuilder != null) {
                String optionsString = optionsStringBuilder.toString();
                optionsString = optionsString.substring(0, optionsString.length() - 1);
                args.add(optionsString);
            }
            exec.getArguments().addAll(args);
            ExecRunner runner = null;
            try {
                runner = exec.getRunner();
            } catch (IOException e) {
                throw new ExecutionException("GradleExec error", e);
            }

            if (runner != null) {
                runner.getBuilder().directory(f);
            }

            try {
                ProcessBuilder builder = runner.getBuilder();
                process = builder.start();
            } catch (IOException e) {
                throw new ExecutionException("Gradle launch error", e);
            }

        }

        if (process == null) {
            MOEToolWindow.getInstance(project).log("Can't detect run configuration type (unsupported)");
            throw new ExecutionException("Can't detect run configuration type for " + runConfiguration.getClass().getName());
        }

        final MOEProcessHandler handler = new MOEProcessHandler(process, null);

        final MOETestResultParser parser = new MOETestResultParser(new MOETestListener(this));

        handler.addProcessListener(new ProcessListener() {
            @Override
            public void startNotified(ProcessEvent processEvent) {

            }

            @Override
            public void processTerminated(ProcessEvent processEvent) {
                MOEToolWindow.getInstance(project).log("Application process has been terminated.");
            }

            @Override
            public void processWillTerminate(ProcessEvent processEvent, boolean b) {
                handler.getProcess().destroy();
            }

            @Override
            public void onTextAvailable(ProcessEvent processEvent, Key key) {
                String text = processEvent.getText();

                if (needResultParser) {
                    parser.addOutput(text);
                }

                if (text.contains("ApplicationVerificationFailed")) {
                    MOEToolWindow.getInstance(project).balloon(MessageType.ERROR, "Application installation failed. Please check log for details...");
                    MOEToolWindow.getInstance(project).log("Application installation failed. Please make sure you have correct bundle id in your Info.plist file.");
                }
            }
        });

        return handler;
    }

    @NotNull
    @Override
    public ExecutionResult execute(final Executor executor, @NotNull final ProgramRunner runner) throws ExecutionException {
        this.processHandler = startProcess();
        if (console != null) {
            console.attachToProcess(processHandler);
        }
        return new DefaultExecutionResult(console, processHandler);
    }

    public ProcessHandler getProcessHandler() {
        return processHandler;
    }

    public MOERunConfigurationBase getConfiguration(){
        return runConfiguration;
    }

    @NotNull
    private ConsoleView getConsole(MOERunProfileState state, Executor executor, MOERunConfigurationBase conf, Project project) throws ExecutionException {
        final TextConsoleBuilder builder = TextConsoleBuilderFactory.getInstance().createBuilder(project);
        ConsoleView console = builder.getConsole();
        return console;
    }

}
