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

package org.moe.idea.compiler;

import com.intellij.compiler.options.CompileStepBeforeRun;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.compiler.CompilerMessageCategory;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Key;
import com.intellij.util.ui.UIUtil;
import org.moe.idea.maven.MOEMavenBuildTask;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.ui.DeviceChooserDialog;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.IOException;

public class MOECompileTask implements CompileTask {
    private static final Logger LOG = LoggerFactory.getLogger(MOECompileTask.class);

    private boolean isOpenDialog;
    private boolean canceled;

    @Override
    public boolean execute(CompileContext context) {
        RunConfiguration c = context.getCompileScope().getUserData(CompileStepBeforeRun.RUN_CONFIGURATION);

        if (!(c instanceof MOERunConfiguration)) {
            return true;
        }

        final MOERunConfiguration runConfig = (MOERunConfiguration) c;
        isOpenDialog = runConfig.getOpenDeploymentTargetDialog();
        canceled = false;
        runConfig.setCanceled(canceled);

        final MOEToolWindow toolWindow = MOEToolWindow.getInstance(runConfig.getProject());
        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
            @Override
            public void run() {
                toolWindow.clear();
                if (isOpenDialog) {
                    DeviceChooserDialog dialog = new DeviceChooserDialog(runConfig.module(), runConfig);
                    dialog.show();
                    if (dialog.getExitCode() != DialogWrapper.OK_EXIT_CODE) {
                        canceled = true;
                        runConfig.setCanceled(canceled);
                    }
                    isOpenDialog = false;
                }
            }
        });
        try {

            while (isOpenDialog) {
                Thread.sleep(100);
            }

            boolean isMaven = ModuleUtils.isMOEMavenModule(runConfig.module());

            // Start progress
            ProgressIndicator progress = context.getProgressIndicator();
            context.getProgressIndicator().pushState();
            progress.setText("Building MOE application");

            if (canceled) {
                toolWindow.balloon(MessageType.INFO, "BUILD CANCELED");
                return true;
            }

            if (!isMaven) {

                final CompileThread compileThread = new CompileThread(runConfig, context);
                compileThread.start();

                context.addMessage(CompilerMessageCategory.INFORMATION, "Building " + runConfig.moduleName(), null, -1, -1);

                // Wait for completion
                while (compileThread.isAlive() && !progress.isCanceled()) {
                    compileThread.join(1000);
                }
                if (compileThread.isAlive() && progress.isCanceled()) {
                    compileThread.interrupt();
                    compileThread.join(1000);
                }

                // Re-throw error
                if (compileThread.throwable != null) {
                    throw compileThread.throwable;
                }

                // Show on failure
                if (compileThread.returnCode != 0) {
                    if (!compileThread.canceled) {
                        toolWindow.balloon(MessageType.ERROR, "BUILD FAILED");
                        context.addMessage(CompilerMessageCategory.ERROR, "Multi-OS Engine module build failed", null, -1, -1, toolWindow.getNavigatable());
                    } else {
                        toolWindow.balloon(MessageType.INFO, "BUILD CANCELED");
                    }
                    return false;
                }
            } else {
                MOEMavenBuildTask mavenTask = new MOEMavenBuildTask(runConfig, "Building " + runConfig.moduleName(), true);
                boolean result = mavenTask.runTask();
                if (!result) {
                    toolWindow.balloon(MessageType.ERROR, "BUILD FAILED");
                    context.addMessage(CompilerMessageCategory.ERROR, "Multi-OS Engine module build failed", null, -1, -1, toolWindow.getNavigatable());
                    return false;
                }
            }

        } catch (Throwable t) {
            toolWindow.balloon(MessageType.ERROR, "BUILD FAILED");
            LOG.error("Failed to compile module", t);
            context.addMessage(CompilerMessageCategory.ERROR, "Multi-OS Engine module build failed, an internal error occurred", null, -1, -1);
            return false;
        } finally {
            context.getProgressIndicator().popState();
        }
        return true;
    }

    private class CompileThread extends Thread {
        private final MOERunConfiguration runConfig;
        private final CompileContext compileContext;
        private int returnCode = -1;
        private OSProcessHandler handler;
        private Throwable throwable;
        private boolean canceled;

        private CompileThread(MOERunConfiguration runConfig, CompileContext compileContext) {
            if (runConfig == null) {
                throw new NullPointerException();
            }
            if (compileContext == null) {
                throw new NullPointerException();
            }
            this.runConfig = runConfig;
            this.compileContext = compileContext;
        }

        @Override
        public void run() {
            try {
                unsafeRun();
            } catch (Throwable t) {
                throwable = t;
            }
        }

        private void unsafeRun() throws ExecutionException, IOException, InterruptedException {
            // Configure Gradle
            final MOEGradleRunner gradleRunner = new MOEGradleRunner(runConfig);
            final boolean isDebug = runConfig.getActionType().equals("Debug");
            final GeneralCommandLine commandLine = gradleRunner.construct(isDebug, false);
            handler = new OSProcessHandler(commandLine);
            handler.setShouldDestroyProcessRecursively(true);

            // Configure output
            final MOEToolWindow toolWindow = MOEToolWindow.getInstance(runConfig.getProject());
            handler.addProcessListener(new ProcessAdapter() {
                @Override
                public void onTextAvailable(ProcessEvent event, Key outputType) {
                    if (ProcessOutputTypes.STDERR.equals(outputType)) {
                        toolWindow.error(event.getText());
                    } else if (ProcessOutputTypes.STDOUT.equals(outputType)) {
                        toolWindow.log(event.getText());
                    } else {
                        compileContext.addMessage(CompilerMessageCategory.INFORMATION, "MOE: " + event.getText(), null, -1, -1, toolWindow.getNavigatable());
                    }
                }
            });
            handler.startNotify();

            // Start and wait
            handler.waitFor();
            returnCode = handler.getProcess().exitValue();
        }

        @Override
        public void interrupt() {
            canceled = true;
            if (handler != null) {
                handler.destroyProcess();
                int timeout = 2000;
                while (timeout > 0 && !handler.isProcessTerminated()) {
                    timeout -= 100;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
                if (handler.isProcessTerminated()) {
                    return;
                }
            }
            super.interrupt();
        }
    }
}
