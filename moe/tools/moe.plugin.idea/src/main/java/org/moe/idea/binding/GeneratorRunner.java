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

package org.moe.idea.binding;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.util.ui.UIUtil;

import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.GradleExec;
import org.moe.common.exec.IKillListener;
import org.moe.document.pbxproj.ProjectException;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;

public class GeneratorRunner {

    public static final String ACTION_TITLE = "Generate Binding";
    public static final String ACTION_PROGRESS_LABEL = "Generate Binding";

    private Module module;
    private File coonfigurationFile;
    private boolean test;
    private boolean keep;

    public GeneratorRunner(Module module) {
        this.module = module;
    }

    public void generateBinding(File confFile, boolean test, boolean keep) {
        this.coonfigurationFile = confFile;
        this.test = test;
        this.keep = keep;

        run();
    }

    private void run() {
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
                    runInternal(progress);
                } catch (final Throwable t) {
                    t.printStackTrace(System.err);
                    UIUtil.invokeLaterIfNeeded(new Runnable() {
                        @Override
                        public void run() {
                            String message = t.getMessage();
                            if (message == null || message.length() == 0) {
                                message = "Unknown error";
                            }
                            String title = test ? "Test Binding Error" : "Generate Binding Error";
                            Messages.showErrorDialog(message, title);
                        }
                    });
                } finally {
                    progress.popState();
                }
            }

            private void runInternal(final ProgressIndicator progress) throws ProjectException, IOException {
                String s = null;

                final MOEToolWindow toolWindow = MOEToolWindow.getInstance(module.getProject());
                toolWindow.clear();

                progress.setFraction(0.1);

                final StringBuilder errorBuilder = new StringBuilder();
                String modulePath = ModuleUtils.getModulePath(module);
                File moduleFile = new File(modulePath);

                progress.setFraction(0.2);

                GradleExec exec = new GradleExec(moduleFile);

                exec.getArguments().add("moeNatJGen");
                exec.getArguments().add("-Draw-binding-output");
                exec.getArguments().add("-Dmoe.binding.conf=" + coonfigurationFile.getPath());
                if (test) {
                    exec.getArguments().add("-Dmoe.natjgen.testrun=true");
                }
                if (keep) {
                    exec.getArguments().add("-Dmoe.keep.natjgen");
                }

                ExecRunner runner = exec.getRunner();
                runner.getBuilder().directory(moduleFile);
                runner.setListener(new ExecRunnerBase.ExecRunnerListener() {

                    @Override
                    public void stdout(String line) {
                        toolWindow.printNormalMessage(line + "\n");
                    }

                    @Override
                    public void stderr(String line) {
                        toolWindow.printErrorMessage(line + "\n");
                        errorBuilder.append(line);
                        errorBuilder.append("\n");
                    }
                });

                runner.run(new IKillListener() {

                    @Override
                    public boolean needsKill() {
                        return progress.isCanceled();
                    }
                });

                progress.setFraction(0.9);

                LocalFileSystem.getInstance().refresh(true);

                progress.setFraction(1.0);

                final String errorMessage = errorBuilder.toString();

                if (errorMessage == null || errorMessage.isEmpty()) {
                    String format = test ? "Test successful" : "Generate successful";
                    toolWindow.balloon(MessageType.INFO, format);
                } else {
                    String format = test ? "Test Error" : "Generate Error";
                    toolWindow.balloon(MessageType.INFO, format);

                    UIUtil.invokeLaterIfNeeded(new Runnable() {
                        @Override
                        public void run() {
                            String title = test ? "Test Binding Error" : "Generate Binding Error";
                            Messages.showErrorDialog(errorMessage, title);
                        }
                    });
                }
            }
        }, ACTION_TITLE, true, module.getProject());
    }

    private void showErrorMessage(final String message) {
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                Messages.showErrorDialog(message, "Generate Binding Error");
            }
        });
    }
}
