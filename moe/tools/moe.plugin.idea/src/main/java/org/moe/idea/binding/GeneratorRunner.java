package org.moe.idea.binding;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.ui.UIUtil;
import org.moe.common.exec.AbstractJarExec;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.GradleExec;
import org.moe.common.utils.ProjectUtil;
import org.moe.document.pbxproj.ProjectException;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ModuleUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import static org.moe.common.utils.ProjectUtil.*;

/**
 * Created by rolandvigh on 05/12/16.
 */
public class GeneratorRunner {

    public static final String ACTION_TITLE = "Generate Binding";
    public static final String ACTION_PROGRESS_LABEL = "Generate Binding";

    private Module module;
    private File coonfigurationFile;
    private boolean test;
    private String sdkPath;

    public GeneratorRunner(Module module) {
        this.module = module;
    }

    public void generateBinding(File confFile, boolean test) {
        this.coonfigurationFile = confFile;
        this.test = test;

        sdkPath = MOESdkPlugin.getSdkRootPath(module);

        if (sdkPath == null) {
            showErrorMessage("Unable find moe sdk");
        }

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

            private void runInternal(ProgressIndicator progress) throws ProjectException, IOException {
                String s = null;

                final MOEToolWindow toolWindow = MOEToolWindow.getInstance(module.getProject());
                toolWindow.clear();

                progress.setFraction(0.1);

                progress.setFraction(0.2);

                StringBuilder builder = new StringBuilder();
                builder.append("cd ");
                builder.append(sdkPath);
                builder.append("/tools && ");
                builder.append("java ");
                if (test) {
                    builder.append("-Dmoe.natjgen.testrun=true ");
                }
                String modulePath = ModuleUtils.getModulePath(module);
                File moduleFile = new File(modulePath);
                builder.append("-cp wrapnatjgen.jar org.moe.natjgen.Main ");
                builder.append(moduleFile.getParent());
                builder.append(" ");
                builder.append(module.getName());
                builder.append(" ");
                builder.append(coonfigurationFile.getCanonicalFile() + " ");
                String[] cmd = {"/bin/sh", "-c", builder.toString()};

                Process p = Runtime.getRuntime().exec(cmd);

                final BufferedReader stdInput = new BufferedReader(new
                        InputStreamReader(p.getInputStream()));

                final BufferedReader stdError = new BufferedReader(new
                        InputStreamReader(p.getErrorStream()));


                Thread t1 = new Thread(new Runnable() {
                    @Override
                        public void run() {
                            String s = null;
                            try {
                                while ((s = stdInput.readLine()) != null) {
                                    toolWindow.printNormalMessage("I: " + s + "\n");
                                }
                            } catch (Exception e) {

                            }
                        }
                });
                t1.start();

                Thread t2 = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String s = null;
                        try {
                            while ((s = stdError.readLine()) != null) {
                                toolWindow.printNormalMessage("E: " + s + "\n");
                            }
                        } catch (Exception e) {

                        }
                    }
                });
                t2.start();

                int result = 0;
                try {
                    result = p.waitFor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                progress.setFraction(0.9);

                module.getProject().getBaseDir().getFileSystem().refresh(true);

                progress.setFraction(1.0);

                if (result == 0) {
                    String format = test ? "Test successful" : "Generate successful";
                    toolWindow.balloon(MessageType.INFO, format);
                } else {
                    String format = test ? "Test Error" : "Generate Error";
                    toolWindow.balloon(MessageType.INFO, format);
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
