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
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.filters.TextConsoleBuilder;
import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.process.ProcessListener;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.ProgramRunner;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;
import org.moe.common.junit.MOETestResultParser;
import org.moe.idea.compiler.MOEGradleRunner;
import org.moe.idea.execution.process.MOEOSProcessHandler;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.runconfig.configuration.test.MOETestListener;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.IOException;

public class MOERunProfileState extends CommandLineState {
    private static final Logger LOG = LoggerFactory.getLogger(MOERunProfileState.class);

    private final MOERunConfiguration runConfiguration;
    private Project project;
    private ProcessHandler processHandler;
    private ConsoleView console;

    public MOERunProfileState(Project project, ExecutionEnvironment environment) {
        super(environment);

        if (getEnvironment().getRunnerAndConfigurationSettings() == null) {
            throw new RuntimeException("RunConfiguration can't be null.");
        }

        this.runConfiguration = (MOERunConfiguration) getEnvironment().getRunnerAndConfigurationSettings().getConfiguration();
        this.project = project;

        try {
            if (runConfiguration.runJUnitTests()) {
                this.console = MOEJUnitUtil.getTestConsole(this, environment.getExecutor(), runConfiguration, project);
            } else {
                this.console = getConsole(this, environment.getExecutor(), runConfiguration, project);
            }
        } catch (ExecutionException e) {
            LOG.error(e.getMessage(), e);
        }
    }

    @NotNull
    @Override
    protected ProcessHandler startProcess() throws ExecutionException {
        return createProcessHandler();
    }

    @NotNull
    private OSProcessHandler createProcessHandler() throws ExecutionException {
        if (runConfiguration.configuration() == null) {
            throw new ExecutionException("Invalid build configuration for " + runConfiguration.getClass().getName());
        }

        final MOEGradleRunner gradleRunner = new MOEGradleRunner(runConfiguration);
        final boolean isDebug = runConfiguration.getActionType().equals("Debug");
        final GeneralCommandLine commandLine;
        try {
            commandLine = gradleRunner.construct(isDebug, true);
        } catch (IOException e) {
            throw new ExecutionException(e);
        }
        final OSProcessHandler handler = new MOEOSProcessHandler(commandLine);
        handler.setShouldDestroyProcessRecursively(true);
        final MOETestResultParser parser = new MOETestResultParser(new MOETestListener(this));

        final boolean isTest = runConfiguration.runJUnitTests();
        handler.addProcessListener(new ProcessListener() {
            @Override
            public void startNotified(ProcessEvent event) {
            }

            @Override
            public void processTerminated(ProcessEvent event) {
            }

            @Override
            public void processWillTerminate(ProcessEvent event, boolean willBeDestroyed) {
            }

            @Override
            public void onTextAvailable(ProcessEvent event, Key outputType) {
                String text = event.getText();

                if (isTest) {
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

    public MOERunConfigurationBase getConfiguration() {
        return runConfiguration;
    }

    @NotNull
    private ConsoleView getConsole(MOERunProfileState state, Executor executor, MOERunConfigurationBase conf, Project project) throws ExecutionException {
        final TextConsoleBuilder builder = TextConsoleBuilderFactory.getInstance().createBuilder(project);
        ConsoleView console = builder.getConsole();
        return console;
    }

}
