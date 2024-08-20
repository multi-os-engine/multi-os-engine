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

import com.intellij.openapi.actionSystem.ActionUpdateThread;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.fileEditor.FileEditorManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vfs.VirtualFileManager;
import org.jetbrains.annotations.NotNull;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.ui.NewBindingDialog;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class MOENewBindingAction extends AnAction {

    private static final Logger LOG = LoggerFactory.getLogger(MOENewBindingAction.class);

    private static final String ACTION_TITLE = "Create New Binding Configuration";

    private Module module;

    public MOENewBindingAction() {
        super(ACTION_TITLE);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        if (module != null) {
            NewBindingDialog dialog = new NewBindingDialog(module.getProject());
            dialog.show();
            if (dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
                VirtualFile file = null;

                String name = dialog.getName();
                String path = ModuleUtils.getModulePath(module);
                if (name != null && !name.isEmpty() && path != null && !path.isEmpty()) {
                    File newConfFile = new File(path, name + ".nbc");

                    if (!newConfFile.exists()) {
                        try {
                            newConfFile.createNewFile();
                        } catch (IOException e) {
                            LOG.info("Unable create file" + e.getMessage());
                        }

                        String filePath = ModuleUtils.getModulePath(module) + "/" + newConfFile.getPath();
                        file = VirtualFileManager.getInstance().refreshAndFindFileByUrl("file://" + filePath);

                        if (file != null && file.exists()) {
                            FileEditorManager.getInstance(module.getProject()).openFile(file, true);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void update(AnActionEvent e) {
        DataContext dataContext = e.getDataContext();
        module = (Module) dataContext.getData(LangDataKeys.MODULE.getName());

        boolean enabled = false;
        if ((module != null) && MOESdkPlugin.isValidMoeLibModule(module)) {
            enabled = true;
        }

        Presentation presentation = e.getPresentation();
        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
    }

    @Override
    public @NotNull ActionUpdateThread getActionUpdateThread() {
        return ActionUpdateThread.BGT;
    }
}
