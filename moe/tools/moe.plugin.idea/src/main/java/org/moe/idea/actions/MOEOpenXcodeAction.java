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
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.ProjectUtil;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.utils.ModuleUtils;

import java.io.File;
import java.io.IOException;

public class MOEOpenXcodeAction extends AnAction {
    private Module module;

    @Override
    public void actionPerformed(final AnActionEvent anActionEvent) {
        if(module == null) {
            return;
        }

        File xcodeFile = new File(ProjectUtil.retrieveXcodeProjectPathFromGradle(new File(ModuleUtils.getModulePath(module))));
        if ((xcodeFile == null) || !xcodeFile.exists()) {
            Messages.showErrorDialog("Xcode project not exist", "Open Xcode Project");
            return;
        }

        try {
            SimpleExec.getOpen("xcode", xcodeFile.getAbsolutePath()).getRunner().run(null);
        } catch (IOException ignored) {
            System.out.println("Could not open project " + xcodeFile.getAbsolutePath() + "\n" + ignored.getMessage());
        }
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
