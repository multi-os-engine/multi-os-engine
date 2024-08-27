/*
 * Copyright 2000-2014 JetBrains s.r.o.
 * Copyright (C) 2018 Migeran
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

package org.moe.idea.runconfig.beforeRunTasks;

import com.intellij.execution.BeforeRunTaskProvider;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.util.Key;
import com.intellij.util.concurrency.Semaphore;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.idea.ui.DeviceChooserDialog;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.logger.LoggerFactory;
import res.MOEIcons;

import javax.swing.Icon;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class MOEGradleTaskProvider extends BeforeRunTaskProvider<MOEGradleTask> {

    private static final Logger LOG = LoggerFactory.getLogger(MOEGradleTaskProvider.class);

    public static final Key<MOEGradleTask> TaskID = new Key<MOEGradleTask>("MOEGradle");
    private boolean isOpenDialog;
    private boolean canceled;

    @Override
    public Key<MOEGradleTask> getId() {
        return TaskID;
    }

    @Override
    public String getName() {
        return "Multi-OS Engine gradle build";
    }

    @Nullable
    @Override
    public Icon getTaskIcon(MOEGradleTask task) {
        return MOEIcons.MOESmall;
    }

    @Override
    public String getDescription(MOEGradleTask task) {
        return "Run Multi-OS Engine Gradle";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MOEIcons.MOESmall;
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Nullable
    @Override
    public MOEGradleTask createTask(RunConfiguration runConfiguration) {
        if (runConfiguration instanceof MOERunConfigurationBase) {
            return new MOEGradleTask(TaskID, runConfiguration);
        }
        return null;
    }

    @Override
    public boolean canExecuteTask(RunConfiguration configuration, MOEGradleTask task) {
        return configuration instanceof MOERunConfigurationBase;
    }

    @Override
    public boolean executeTask(DataContext context, final RunConfiguration configuration, final ExecutionEnvironment env, MOEGradleTask task) {

        final AtomicBoolean success = new AtomicBoolean();

        final AtomicReference<String> errorMsgRef = new AtomicReference<String>();

        try {
            final Semaphore doneSemaphore = new Semaphore();
            doneSemaphore.down();

            final MOERunConfiguration runConfig = (MOERunConfiguration) configuration;
            isOpenDialog = runConfig.getOpenDeploymentTargetDialog();

            final MOEGradleRunner gradleRunner = new MOEGradleRunner(env.getProject(), "Building MOE application", runConfig);

            final MOEAfterGradleInvocationTask afterTask = new MOEAfterGradleInvocationTask() {
                @Override
                public void execute(@NotNull MOEGradleInvocationResult result) {
                    LOG.debug("MOE application gradle build ended");
                    success.set(result.isBuildSuccessful());
                    errorMsgRef.set(result.getErrorMessage());
                    gradleRunner.removeAfterTask(this);
                    doneSemaphore.up();
                }
            };

            gradleRunner.addAfterTask(afterTask);

            ApplicationManager.getApplication().invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    if (ApplicationManager.getApplication().isDispatchThread()) {
                        showDialog(runConfig);
                        FileDocumentManager.getInstance().saveAllDocuments();
                        gradleRunner.queue();
                    } else {
                        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
                            @Override
                            public void run() {
                                showDialog(runConfig);
                                FileDocumentManager.getInstance().saveAllDocuments();
                                gradleRunner.queue();
                            }
                        });
                    }
                }
            });
            doneSemaphore.waitFor();

        } catch (Exception e) {
            LOG.debug("Unable execute task", e);
            return false;
        }

        ApplicationManager.getApplication().invokeLater(new Runnable() {
            @Override
            public void run() {
                String errorMessage = errorMsgRef.get();

                if (errorMessage != null) {
                    MOEToolWindow toolWindow = MOEToolWindow.getInstance(env.getProject());
                    toolWindow.printErrorMessage(errorMessage);
                }
            }
        });

        return success.get();
    }

    private void showDialog(final MOERunConfiguration runConfig) {
        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
            @Override
            public void run() {
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

        while (isOpenDialog) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                LOG.debug("InterruptedException", e);
            }
        }
    }
}
