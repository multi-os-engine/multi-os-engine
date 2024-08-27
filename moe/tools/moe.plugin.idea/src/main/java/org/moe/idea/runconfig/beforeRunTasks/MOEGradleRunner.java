/*
 * Copyright (C) 2013 The Android Open Source Project
 * Copyright (C) 2018 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.idea.runconfig.beforeRunTasks;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Sets;
import com.intellij.compiler.CompilerManagerImpl;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.util.ProgressIndicatorBase;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Key;
import com.intellij.openapi.wm.ex.ProgressIndicatorEx;
import com.intellij.ui.AppIcon;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.logger.LoggerFactory;

import java.util.Collection;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class MOEGradleRunner extends Task.Backgroundable {

    private static final Logger LOG = LoggerFactory.getLogger(MOEGradleRunner.class);

    private MOERunConfiguration runConfig;

    @NotNull
    private Collection<MOEAfterGradleInvocationTask> myAfterTasks = Sets.newLinkedHashSet();

    @NotNull
    private volatile ProgressIndicator progressIndicator = new EmptyProgressIndicator();

    @NonNls
    private static final String APP_ICON_ID = "compiler";


    public MOEGradleRunner(@Nullable Project project, @NotNull String title, boolean canBeCancelled, MOERunConfiguration migeranConfig) {
        super(project, title, canBeCancelled);

        this.runConfig = migeranConfig;
    }

    public MOEGradleRunner(@Nullable Project project, @NotNull String title, MOERunConfiguration migeranConfig) {
        this(project, title, true, migeranConfig);
    }

    @Override
    public void run(@NotNull ProgressIndicator indicator) {

        this.progressIndicator = indicator;

        MOEGradleInvocationResult result = new MOEGradleInvocationResult();


        Semaphore semaphore = ((CompilerManagerImpl) CompilerManager.getInstance(runConfig.getProject())).getCompilationSemaphore();
        boolean acquired = false;
        try {
            try {
                while (!acquired) {
                    acquired = semaphore.tryAcquire(300, TimeUnit.MILLISECONDS);
                    if (indicator.isCanceled()) {
                        // Give up obtaining the semaphore, let compile work begin in order to stop gracefully on cancel event.
                        break;
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            if (!isHeadless()) {
                addIndicatorDelegate();
            }

            result.setBuildSuccessful(false);

            buildProject(indicator, result);
        } finally {
            try {
                indicator.stop();
            } finally {
                if (acquired) {
                    semaphore.release();
                }
            }

            for (MOEAfterGradleInvocationTask task : myAfterTasks) {
                task.execute(result);
            }
        }
    }

    private void buildProject(@NotNull ProgressIndicator indicator, MOEGradleInvocationResult result) {

        final Stopwatch stopwatch = Stopwatch.createUnstarted();
        stopwatch.start();
        String errorMessage = null;
        try {
            LOG.debug("Start build process");
            final org.moe.idea.compiler.MOEGradleRunner gradleRunner = new org.moe.idea.compiler.MOEGradleRunner(runConfig);

            final MOEToolWindow toolWindow = MOEToolWindow.getInstance(runConfig.getProject());

            final GeneralCommandLine commandLine = gradleRunner.construct(false);
            final OSProcessHandler handler = new OSProcessHandler(commandLine);
            try {
                handler.setShouldDestroyProcessRecursively(true);
                handler.addProcessListener(new ProcessAdapter() {
                    @Override
                    public void onTextAvailable(ProcessEvent event, Key outputType) {
                        if (ProcessOutputTypes.STDERR.equals(outputType)) {
                            toolWindow.error(event.getText());
                        } else if (ProcessOutputTypes.STDOUT.equals(outputType)) {
                            toolWindow.log(event.getText());
                        }
                    }
                });
                handler.startNotify();

                // Start and wait
                while (!handler.isProcessTerminated() && !indicator.isCanceled()) {
                    if (handler.waitFor(1000)) {
                        break;
                    }
                }
            } finally {
                handler.destroyProcess();
                while (!handler.isProcessTerminated()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }

            int returnCode = handler.getProcess().exitValue();

            // Show on failure
            if (returnCode != 0) {
                toolWindow.balloon(MessageType.ERROR, "BUILD FAILED");
                errorMessage = "Multi-OS Engine module build failed";
            }

            if (errorMessage == null) {
                result.setBuildSuccessful(true);
            } else {
                result.setBuildSuccessful(false);
                result.setErrorMessage(errorMessage);
            }
        } catch (Exception e) {
            result.setBuildSuccessful(false);
            result.setErrorMessage(String.format("Error while building %s .%n", e.getMessage()));
        } finally {
            stopwatch.stop();
        }
    }

    public void removeAfterTask(MOEAfterGradleInvocationTask task) {
        myAfterTasks.remove(task);
    }

    public void addAfterTask(MOEAfterGradleInvocationTask task) {
        myAfterTasks.add(task);
    }

    private void addIndicatorDelegate() {
        if (progressIndicator instanceof ProgressIndicatorEx) {
            ProgressIndicatorEx indicator = (ProgressIndicatorEx) progressIndicator;
            indicator.addStateDelegate(new ProgressIndicatorStateDelegate());
        }
    }

    private class ProgressIndicatorStateDelegate extends ProgressIndicatorBase {

        @Override
        public void stop() {
            super.stop();

            stopAppIconProgress();
        }

        private void stopAppIconProgress() {
            UIUtil.invokeLaterIfNeeded(new Runnable() {
                @Override
                public void run() {
                    AppIcon appIcon = AppIcon.getInstance();
                    Project project = runConfig.getProject();
                    if (appIcon.hideProgress(project, APP_ICON_ID)) {
                        appIcon.setOkBadge(project, true);
                        appIcon.requestAttention(project, false);
                    }
                }
            });
        }
    }
}
