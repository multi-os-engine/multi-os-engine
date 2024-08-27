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

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.ProjectUtil;
import org.moe.gradle.model.MOEXcodeProperties;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.compiler.MOEGradleRunner;
import org.moe.idea.model.GradleModuleModel;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class MOEOpenXcodeEditorAction extends AnAction {
    private Module module;

    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        if(module == null) {
            return;
        }

        @Nullable String projectPath;

        // Read xcode property using facet
        MOEXcodeProperties xcodeProperties = GradleModuleModel.getXcodeProperties(module);
        if (xcodeProperties != null) {
            projectPath = xcodeProperties.getProject();
        } else {
            // For compatible with old Gradle plugin
            final File modulePath = new File(ModuleUtils.getModulePath(module));
            File javaHome;
            try {
                javaHome = MOEGradleRunner.requireGradleJavaHome(module);
            } catch (IOException e) {
                Messages.showErrorDialog(e.getMessage(), "Open Xcode Project");
                return;
            }
            final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(modulePath, ProjectUtil.XCODE_PROPERTIES_TASK, javaHome);

            projectPath = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
        }

        // Try to open project
        if (projectPath != null) {
            final File file = new File(projectPath, "project.pbxproj");
            if (!file.exists()) {
                Messages.showErrorDialog("Xcode project does not exist", "Open Xcode Project");
            }
            Project project = getEventProject(anActionEvent);
            if (project != null) {
                VirtualFile virtualFile = LocalFileSystem.getInstance().findFileByIoFile(file);
                if (virtualFile != null && virtualFile.exists()) {
                    FileEditorManager.getInstance(project).openFile(virtualFile, true);
                }
            }
            return;
        }

        Messages.showErrorDialog("Neither the Xcode project nor the workspace is set in the Gradle plugin",
                "Open Xcode Project");
    }

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = e.getPresentation();

        VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(e.getDataContext());

        if(file == null) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

        DataContext dataContext = e.getDataContext();
        module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());

        boolean enabled = false;
        if ((module != null) && MOESdkPlugin.isValidMoeModule(module)) {
            enabled = true;
        }

        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
    }
}
