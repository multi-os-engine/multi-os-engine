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

package org.moe.idea.compiler;

import org.moe.common.constants.ProductType;
import org.moe.common.PasswordEntry;
import org.moe.common.variant.ModeVariant;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.MOEIpaConfiguration;
import org.moe.idea.runconfig.configuration.local.MOERunConfigurationLocal;
import org.moe.idea.runconfig.configuration.remote.MOERunConfigurationRemote;
import org.moe.idea.ui.MOEToolWindow;
import com.intellij.compiler.options.CompileStepBeforeRun;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.compiler.CompilerMessageCategory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.util.concurrency.Semaphore;
import com.intellij.util.ui.UIUtil;
import res.MOEText;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class MOECompileTask implements CompileTask {

    private Project project;
    private List<String> argsToClean;
    private List<CompileTask> postGradleCompileTasks;


    public MOECompileTask() {
        argsToClean = new ArrayList<String>();
        postGradleCompileTasks = new ArrayList<CompileTask>();
    }

    @Override
    public boolean execute(CompileContext compileContext) {
        if (compileContext.getMessageCount(CompilerMessageCategory.ERROR) > 0) {
            return false;
        }

        Object configuration = compileContext.getCompileScope().getUserData(CompileStepBeforeRun.RUN_CONFIGURATION);

        if (configuration == null) {
            configuration = compileContext.getCompileScope().getUserData(MOEIpaConfiguration.IPA_KEY);
        }

        List<MOEGradleRunner.GradleTask> tasks = new ArrayList<MOEGradleRunner.GradleTask>();

        if (configuration instanceof MOERunConfigurationLocal) {
            MOERunConfigurationLocal runConfiguration = (MOERunConfigurationLocal) configuration;

            project = runConfiguration.getProject();

            tasks.addAll(createBuildApplicationTasks(runConfiguration));
        } else if (configuration instanceof MOERunConfigurationRemote) {
            MOERunConfigurationRemote remoteConfiguration = (MOERunConfigurationRemote) configuration;

            project = remoteConfiguration.getProject();
            remoteConfiguration.productType(ProductType.app);
            remoteConfiguration.configuration(ModeVariant.DEBUG_NAME);

            try {
                tasks.addAll(createBuildApplicationRemoteTasks(remoteConfiguration));
            } catch (Exception e) {
                MOEToolWindow.getInstance(project).log(e.getMessage());
                return false;
            }

            postGradleCompileTasks.add(new MOERemoteCompileTask(remoteConfiguration));
        } else if (configuration instanceof MOEIpaConfiguration) {
            MOEIpaConfiguration ipaConfiguration = (MOEIpaConfiguration) configuration;
            RunConfiguration runConfiguration = ipaConfiguration.runConfiguration();

            if (runConfiguration instanceof MOERunConfigurationRemote) {
                // Build IPA on remote build server
                MOERunConfigurationRemote remoteConfiguration = (MOERunConfigurationRemote) runConfiguration;

                project = remoteConfiguration.getProject();
                remoteConfiguration.configuration(ModeVariant.RELEASE_NAME);
                remoteConfiguration.productType(ProductType.ipa);

                try {
                    tasks.addAll(createBuildApplicationRemoteTasks((MOERunConfigurationRemote) runConfiguration));
                } catch (Exception e) {
                    MOEToolWindow.getInstance(project).log(e.getMessage());
                    return false;
                }

                postGradleCompileTasks.add(new MOERemoteCompileTask(remoteConfiguration));
            } else {
                project = ipaConfiguration.getProject();

                try {
                    tasks.addAll(createBuildIpaTasks(ipaConfiguration));
                } catch (Exception e) {
                    MOEToolWindow.getInstance(project).log(e.getMessage());
                    return false;
                }
            }
        }
        else {
            // return false causes 'Compilation aborted' for non MOE modules
            return true;
        }

        if (invokeGradle(tasks)) {

            boolean compileResult = (postGradleCompileTasks.size() == 0) || invokePostGradleCompileTasks(compileContext);
            if (!compileResult) return compileResult;

            if (configuration instanceof MOEIpaConfiguration) {

                MOEIpaConfiguration ipaConfiguration = (MOEIpaConfiguration) configuration;

                String appPath = MOESdkPlugin.getXcodeBuildAppPath(ipaConfiguration.module(), ipaConfiguration.architecture(), ipaConfiguration.configuration(), false);

                appPath = appPath.replace(".app", ".ipa");

                compileContext.putUserData(MOEIpaConfiguration.IPA_PATH, appPath);
            }

            return compileResult;
        }

        return false;
    }

    private List<MOEGradleRunner.GradleTask> createBuildApplicationTasks(MOERunConfigurationLocal configuration) {
        List<MOEGradleRunner.GradleTask> list = new ArrayList<MOEGradleRunner.GradleTask>();

        String modulePath = configuration.modulePath();
        if ((modulePath == null) || modulePath.isEmpty()) {
            return list;
        }

        List<String> args = new ArrayList<String>();

        String target = configuration.runJUnitTests() ? "moeTest" : "moeMain";
        String taskName = String.format(target + "%s%sXcodeBuild", configuration.configuration(), configuration.runOnSimulator() ? "Iphonesimulator" : "Iphoneos");
        MOEGradleRunner.GradleTask task = new MOEGradleRunner.GradleTask(taskName, args, modulePath);
        list.add(task);

        return list;
    }

    private List<MOEGradleRunner.GradleTask> createBuildApplicationRemoteTasks(MOERunConfigurationRemote remoteConfiguration)
            throws PasswordSafeException {
        List<MOEGradleRunner.GradleTask> list = new ArrayList<MOEGradleRunner.GradleTask>();

        String modulePath = remoteConfiguration.modulePath();
        if ((modulePath == null) || modulePath.isEmpty()) {
            return list;
        }

        List<String> args = new ArrayList<String>();

        String taskName = String.format("moeMain%sIphoneosOutsidePackager", remoteConfiguration.configuration());

        MOEGradleRunner.GradleTask task = new MOEGradleRunner.GradleTask(taskName, args, modulePath);
        list.add(task);

        return list;
    }

    private List<MOEGradleRunner.GradleTask> createBuildIpaTasks(MOEIpaConfiguration configuration) {
        List<MOEGradleRunner.GradleTask> list = new ArrayList<MOEGradleRunner.GradleTask>();

        String modulePath = configuration.modulePath();
        if ((modulePath == null) || modulePath.isEmpty()) {
            return list;
        }

        RunConfiguration runConfig = configuration.runConfiguration();
        String profilePath = "";
        if (runConfig instanceof MOERunConfigurationRemote) {
            profilePath = ((MOERunConfigurationRemote)runConfig).profilePath();
        }

        List<String> args = new ArrayList<String>();

        args.add("-Pmoe.ipaOptions.provisioningProfile=" + profilePath);
        args.add("-Pmoe.ipaOptions.signingIdentity=" + configuration.signingIdentity().name());

        MOEGradleRunner.GradleTask task = new MOEGradleRunner.GradleTask("moeIpaBuild", args, modulePath);

        list.add(task);

        return list;
    }

    private boolean invokeGradle(List<MOEGradleRunner.GradleTask> tasks) {

        final AtomicBoolean result = new AtomicBoolean();

        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
            public void run() {
                MOEToolWindow.getInstance(project).showAndCreate(project);
            }
        });

        MOEToolWindow.getInstance(project).clear();
        MOEToolWindow.getInstance(project).log(MOEText.get("Build.Started") + " (" + MOESdkPlugin.getPluginVersion() + ")");

        try {
            final Semaphore completed = new Semaphore();
            completed.down();

            final MOEGradleRunner runner = new MOEGradleRunner(project,
                    MOEText.get("MOE.Build"),
                    true,
                    tasks) {

                @Override
                protected void success() {
                    MOEToolWindow.getInstance(project).log(MOEText.get(messagePrefix() + ".Finished.Successfully"));

                    result.set(true);
                    completed.up();
                }

                @Override
                protected void cancel() {
                    MOEToolWindow.getInstance(project).log(MOEText.get(messagePrefix() + ".Canceled"));

                    result.set(false);
                    completed.up();
                }

                @Override
                protected void error(String error) {
                    MOEToolWindow.getInstance(project).balloon(MessageType.ERROR, MOEText.get(messagePrefix() + ".Finished.Error"));
                    MOEToolWindow.getInstance(project).log(MOEText.get(messagePrefix() + ".Finished.Error") + ": " + error);

                    result.set(false);
                    completed.up();
                }
            };

            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    if (ApplicationManager.getApplication().isDispatchThread()) {
                        runner.queue();
                    } else {
                        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
                            public void run() {
                                runner.queue();
                            }
                        });
                    }
                }
            });

            completed.waitFor();

            for (String arg : argsToClean) {
                PasswordEntry.clean(arg);
            }
            argsToClean.clear();
        } catch (Exception e) {
            return result.get();
        }

        return result.get();
    }

    private boolean invokePostGradleCompileTasks(CompileContext compileContext) {

        final AtomicBoolean result = new AtomicBoolean();

        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
            public void run() {
                MOEToolWindow.getInstance(project).showAndCreate(project);
            }
        });

        try {
            final Semaphore completed = new Semaphore();
            completed.down();

            final MOECompileTaskRunner runner = new MOECompileTaskRunner(project,
                    MOEText.get("MOE.Build"),
                    true,
                    postGradleCompileTasks,
                    compileContext) {

                @Override
                protected void success() {
                    MOEToolWindow.getInstance(project).log(MOEText.get("Build.Finished.Successfully"));

                    result.set(true);
                    completed.up();
                }

                @Override
                protected void cancel() {
                    MOEToolWindow.getInstance(project).log(MOEText.get("Build.Canceled"));

                    result.set(false);
                    completed.up();
                }

                @Override
                protected void error(String error) {
                    MOEToolWindow.getInstance(project).balloon(MessageType.ERROR, MOEText.get("Build.Finished.Error"));
                    MOEToolWindow.getInstance(project).log(MOEText.get("Build.Finished.Error") + ": " + error);

                    result.set(false);
                    completed.up();
                }
            };

            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    if (ApplicationManager.getApplication().isDispatchThread()) {
                        runner.queue();
                    } else {
                        UIUtil.invokeAndWaitIfNeeded(new Runnable() {
                            public void run() {
                                runner.queue();
                            }
                        });
                    }
                }
            });

            completed.waitFor();

        } catch (Exception e) {
            return result.get();
        } finally {
            postGradleCompileTasks.clear();
        }

        return result.get();
    }

    private String messagePrefix() {
        if (postGradleCompileTasks.size() != 0) {
            return "Gradle.Build";
        }
        return "Build";
    }

}
