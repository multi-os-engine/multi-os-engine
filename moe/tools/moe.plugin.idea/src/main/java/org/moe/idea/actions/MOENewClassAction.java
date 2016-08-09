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

import org.moe.idea.MOESdkPlugin;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.template.MOEClassTemplate;
import org.moe.template.MOEClassTemplateGenerator;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.SourceFolder;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.vfs.VirtualFile;


public class MOENewClassAction extends AnAction {

    private static final Logger LOG = LoggerFactory.getLogger(MOENewClassAction.class);

    private static final String ACTION_TITLE = "Create Multi-OS Engine Template Class";

    public MOENewClassAction() {
        super(ACTION_TITLE);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        MOECreateClassTemplateDialog dialog = new MOECreateClassTemplateDialog(anActionEvent.getProject(), anActionEvent.getDataContext());

        dialog.show();

        if (dialog.getExitCode() != DialogWrapper.OK_EXIT_CODE) {
            return;
        }

        Project project = anActionEvent.getProject();
        if (project == null) {
            return;
        }

        MOEClassTemplate classTemplate = dialog.getClassTemplate();
        if (classTemplate == null) {
            return;
        }

        DataContext dataContext = anActionEvent.getDataContext();

        MOEClassTemplateGenerator generator = new MOEClassTemplateGenerator();
        generator.generate(classTemplate, dataContext);
    }

    @Override
    public void update(AnActionEvent e) {
        Project project = e.getProject();

        final VirtualFile file = CommonDataKeys.VIRTUAL_FILE.getData(e.getDataContext());

        Module module = MOESdkPlugin.findModuleForFile(project, file);

        boolean isActionEnabled = isSourceFolder(module, file) && MOESdkPlugin.isValidMoeModule(module);

        e.getPresentation().setEnabled(isActionEnabled);
        e.getPresentation().setVisible(isActionEnabled);
    }

    private boolean isSourceFolder(Module module, VirtualFile file) {
        if (file != null && module != null) {
            ModifiableRootModel rootModel = ModuleRootManager.getInstance(module).getModifiableModel();
            for (ContentEntry entry : rootModel.getContentEntries()) {
                for (SourceFolder srcFolder : entry.getSourceFolders()) {
                    String candidate = file.getPath();
                    try {
                        String parent = srcFolder.getFile().getPath();
                        if (candidate.startsWith(parent) && !candidate.equals(parent)) {
                            return true;
                        }
                    } catch (NullPointerException ignore) {
                    }
                }
            }
        }
        return false;
    }
}

