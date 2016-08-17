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

package org.moe.idea.actions;

import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.compiler.CompileStatusNotification;
import com.intellij.openapi.compiler.CompilerManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.OsUtils;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.MOEIpaConfiguration;
import org.moe.idea.ui.MOEToolWindow;
import res.MOEIcons;
import res.MOEText;

import java.io.File;
import java.io.IOException;

public class MOECreateIpaAction extends AnAction {
    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        final MOECreateIpaDialog dialog = new MOECreateIpaDialog(anActionEvent.getProject());

        dialog.show();

        if (dialog.getExitCode() != DialogWrapper.OK_EXIT_CODE) {
            return;
        }

        final MOEIpaConfiguration settings = dialog.getConfiguration();
        if (settings == null) {
            return;
        }

        final Project project = anActionEvent.getProject();

        if(project == null) {
            return;
        }

        final CompileScope scope = CompilerManager.getInstance(project).createModuleCompileScope(settings.module(), true);

        scope.putUserData(MOEIpaConfiguration.IPA_KEY, settings);

        CompilerManager.getInstance(anActionEvent.getProject()).compile(scope, new CompileStatusNotification() {
            @Override
            public void finished(boolean aborted, int errors, int warnings, CompileContext compileContext) {
                MOEToolWindow.getInstance(project).show();
                MOEToolWindow.getInstance(project).log(MOEText.get("IPA.Compilation.Finished"), errors, warnings);

                String path = compileContext.getUserData(MOEIpaConfiguration.IPA_PATH);

                if(errors == 0 && path != null) {
                    int result = Messages.showYesNoDialog(anActionEvent.getProject(),
                            String.format(MOEText.get("Ipa.Saved"), path),
                            MOEText.get("Build.Ipa"),
                            OsUtils.isMac() ? MOEText.get("Reveal.In.Finder") : MOEText.get("Show.In.Explorer"),
                            MOEText.get("Close"),
                            MOEIcons.MOESmall);

                    if(result == 0) {

                        if (OsUtils.isMac()) {
                            SimpleExec exec = SimpleExec.getOpen(null, path);
                            exec.getArguments().add("-R");
                            try {
                                ExecOutputCollector.collect(exec);
                            } catch (Exception e) {

                            }
                        } else {
                            try {
                                File ipaDir = new File(path);
                                if (ipaDir.isFile()) {
                                    ipaDir = ipaDir.getParentFile();
                                }
                                Runtime.getRuntime().exec("explorer " + ipaDir.getAbsolutePath());
                            }
                            catch (IOException ignored) {
                            }
                        }
                    }
                }
            }
        });
    }

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = getTemplatePresentation();

        DataContext dataContext = e.getDataContext();
        Module module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());

        boolean enabled = false;

        if (module != null && MOESdkPlugin.isValidMoeModule(module)) {
            enabled = true;
        }

        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
    }
}
