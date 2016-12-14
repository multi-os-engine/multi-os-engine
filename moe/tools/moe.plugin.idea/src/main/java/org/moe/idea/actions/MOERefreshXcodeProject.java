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

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.ui.UIUtil;
import org.moe.common.utils.ProjectUtil;
import org.moe.document.pbxproj.ProjectException;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.generator.project.writer.XcodeEditor.Settings;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import static org.moe.common.utils.ProjectUtil.*;

public class MOERefreshXcodeProject extends AnAction {
    public static final String ACTION_TITLE = "Inject/Refresh Xcode Project Settings";
    public static final String ACTION_PROGRESS_LABEL = "Injecting/Refreshing Xcode Settings";

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
            Messages.showErrorDialog("Failed to locate module", "Injecting/Refreshing Xcode Settings Error");
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
                            Messages.showErrorDialog(message, "Injecting/Refreshing Xcode Settings Error");
                        }
                    });
                } finally {
                    progress.popState();
                }
            }

            private void runInternal() throws ProjectException, IOException {
                final File moduleFile = new File(ModuleUtils.getModulePath(module));
                final Properties properties = ProjectUtil
                        .retrievePropertiesFromGradle(moduleFile, XCODE_PROPERTIES_TASK);

                final String xcodeProjectPath = (String)properties.get(XCODE_PROJECT_KEY);
                final String mainTarget = (String)properties.get(XCODE_MAIN_TARGET_KEY);
                final String testTarget = (String)properties.get(XCODE_TEST_TARGET_KEY);
                File xcodeFile = new File(xcodeProjectPath);
                if (!xcodeFile.exists()) {
                    throw new RuntimeException("Xcode project does not exist at " + xcodeProjectPath);
                }

                final XcodeEditor xcodeEditor = new XcodeEditor(xcodeFile);
                XcodeEditor.Settings settings = new Settings();
                settings.mainTarget = (mainTarget == null || mainTarget.length() == 0) ? null : mainTarget;
                settings.testTarget = (testTarget == null || testTarget.length() == 0) ? null : testTarget;
                settings.moeProject = moduleFile;
                settings.xcodeProject = xcodeFile;
                xcodeEditor.update(settings);

                xcodeEditor.getProjectFile().save();
            }
        }, ACTION_TITLE, true, module.getProject());
    }
}
