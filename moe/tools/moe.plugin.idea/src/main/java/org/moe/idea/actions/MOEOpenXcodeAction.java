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
import com.intellij.openapi.module.Module;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.common.developer.NativeSDKUtil;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.ProjectUtil;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class MOEOpenXcodeAction extends AnAction {
    private Module module;

    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        if(module == null) {
            return;
        }

        final File modulePath = new File(ModuleUtils.getModulePath(module));
        final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(modulePath, ProjectUtil.XCODE_PROPERTIES_TASK);

        // Try to open workspace
        final String ws = properties.getProperty(ProjectUtil.XCODE_WORKSPACE_KEY);
        if (ws != null) {
            final File file = new File(ws);
            if (!file.exists()) {
                Messages.showErrorDialog("Xcode workspace does not exist", "Open Xcode Project");
            }
            try {
                NativeSDKUtil.openWithXcode(file.getAbsolutePath());
            } catch (IOException ignored) {
                System.out.println("Could not open workspace " + file.getAbsolutePath() + "\n" + ignored.getMessage());
            }
            return;
        }

        // Try to open project
        final String pr = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
        if (pr != null) {
            final File file = new File(pr);
            if (!file.exists()) {
                Messages.showErrorDialog("Xcode project does not exist", "Open Xcode Project");
            }
            try {
                NativeSDKUtil.openWithXcode(file.getAbsolutePath());
            } catch (IOException ignored) {
                System.out.println("Could not open project " + file.getAbsolutePath() + "\n" + ignored.getMessage());
            }
            return;
        }

        Messages.showErrorDialog("Neither the Xcode project nor the workspace is set in the Gradle plugin",
                "Open Xcode Project");
    }

    @Override
    public void update(AnActionEvent e) {
        Presentation presentation = e.getPresentation();

        if(OsUtils.isWindows()) {
            presentation.setEnabled(false);
            presentation.setVisible(false);

            return;
        }

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
