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

package org.moe.idea.actions;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessAdapter;
import com.intellij.execution.process.ProcessEvent;
import com.intellij.execution.process.ProcessOutputTypes;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.Key;
import com.intellij.util.ui.UIUtil;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.compiler.MOEGradleRunner;
import org.moe.idea.ui.MOEToolWindow;

import java.io.IOException;

public class MOEGenerateActionsAndOutletsAction extends AnAction {

    public static final String ACTION_TITLE = "Generate Actions and Outlets for Interface Builder";
    public static final String ACTION_PROGRESS_LABEL = "Generating Actions and Outlets";

    public MOEGenerateActionsAndOutletsAction() {
        super(ACTION_TITLE);
    }

    @Override
    public void update(AnActionEvent e) {
        DataContext dataContext = e.getDataContext();
        Module module = (Module)dataContext.getData(LangDataKeys.MODULE.getName());
        boolean isActionEnabled = (module != null) && MOESdkPlugin.isValidMoeModule(module);
        e.getPresentation().setEnabled(isActionEnabled);
        e.getPresentation().setVisible(isActionEnabled);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        final DataContext dataContext = e.getDataContext();
        final Module module = (Module)dataContext.getData(LangDataKeys.MODULE.getName());
        if (module == null) {
            Messages.showErrorDialog("Failed to locate module", "Actions and Outlets Generation Error");
            return;
        }
        ProgressManager.getInstance().runProcessWithProgressSynchronously(new Runnable() {
            @Override
            public void run() {
                ProgressIndicator progress = ProgressManager.getInstance().getProgressIndicator();
                if (progress == null) {
                    progress = new EmptyProgressIndicator();
                }
                progress.pushState();
                try {
                    progress.setText(ACTION_PROGRESS_LABEL);
                    runInternal();
                } catch (final Throwable t) {
                    t.printStackTrace(System.err);
                    UIUtil.invokeLaterIfNeeded(new Runnable() {
                        @Override
                        public void run() {
                            String message = t.getMessage();
                            if (message == null || message.length() == 0) {
                                message = "Unknown error";
                            }
                            Messages.showErrorDialog(message, "Actions and Outlets Generation Error");
                            final MOEToolWindow toolWindow = MOEToolWindow.getInstance(module.getProject());
                            toolWindow.show();
                        }
                    });
                } finally {
                    progress.popState();
                }
            }

            private void runInternal() throws IOException, ExecutionException {
                final GeneralCommandLine commandLine = MOEGradleRunner.construct(module, "moeGenerateUIObjCInterfaces");
                final OSProcessHandler handler = new OSProcessHandler(commandLine);
                handler.setShouldDestroyProcessRecursively(true);

                // Configure output
                final MOEToolWindow toolWindow = MOEToolWindow.getInstance(module.getProject());
                toolWindow.clear();
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
                handler.waitFor();
                final int exitValue = handler.getProcess().exitValue();
                if (exitValue != 0) {
                    throw new IOException(ACTION_TITLE + " finished with non-zero exit value (" + exitValue + ")");
                }
            }
        }, ACTION_TITLE, true, module.getProject());
    }
}
