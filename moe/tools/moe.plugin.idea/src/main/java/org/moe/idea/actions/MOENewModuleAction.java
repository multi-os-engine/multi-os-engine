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

import com.intellij.ide.projectWizard.NewProjectWizard;
import com.intellij.ide.util.newProjectWizard.AbstractProjectWizard;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ProjectBuilder;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Presentation;
import com.intellij.openapi.module.ModifiableModuleModel;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ui.configuration.DefaultModulesProvider;
import com.intellij.openapi.roots.ui.configuration.ModulesConfigurator;
import com.intellij.openapi.roots.ui.configuration.actions.NewModuleAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.List;

public class MOENewModuleAction extends NewModuleAction {

    public MOENewModuleAction() {
        getTemplatePresentation().setText("New Multi-OS Engine Module...");
    }

    @Override
    public void update(AnActionEvent event) {

        boolean enabled = true;

        Presentation presentation = getTemplatePresentation();

        /*
        Presentation presentation = getTemplatePresentation();

        boolean enabled = false;

        IdeView view = LangDataKeys.IDE_VIEW.getData(event.getDataContext());

        PsiDirectory directory = view.getDirectories()[0];

        if (directory != null && directory.getVirtualFile() != null) {
            if(event.getProject().getBasePath().compareToIgnoreCase(directory.getVirtualFile().getPath()) == 0) {
                enabled = true;
            }
        }

        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
        */

        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = getEventProject(e);
        if (project != null) {
            Object dataFromContext = this.prepareDataFromContext(e);
//            String defaultPath = null;
//            VirtualFile virtualFile = (VirtualFile)e.getData(CommonDataKeys.VIRTUAL_FILE);
//            if(virtualFile != null && virtualFile.isDirectory()) {
//                defaultPath = virtualFile.getPath();
//            }
//
//            NewProjectWizard wizard = new NewProjectWizard(project, new DefaultModulesProvider(project), defaultPath);

            // TODO: temp hack for adding by force a module that will be changed with correct one.
            // TODO: didn't find alternative way to fix incorrect adding MOE module in AS 2.1 and AS 2.0
            String tempModuleDir = project.getBasePath() + File.separator + "temp";

            NewProjectWizard wizard = new NewProjectWizard(project, new DefaultModulesProvider(project), tempModuleDir);
            if (wizard.showAndGet()) {
                this.createModuleFromWizard(project, dataFromContext, wizard);
            }
        }
    }

    @Override
    public Module createModuleFromWizard(Project project, @Nullable Object dataFromContext, AbstractProjectWizard wizard) {
        ProjectBuilder builder = wizard.getProjectBuilder();

        if (builder instanceof ModuleBuilder) {
            ModuleBuilder module = (ModuleBuilder) builder;
            if (module.getName() == null) {
                module.setName(wizard.getProjectName());
            }

            if (module.getModuleFilePath() == null) {
                module.setModuleFilePath(wizard.getModuleFilePath());
            } else {
                //TODO: get fake temp module to change with the correct one with info from wizard
                File tempModuleFile = new File(module.getModuleFilePath());
                String endOfFile = tempModuleFile.getName();
                File tempFolder = tempModuleFile.getParentFile();
                if (tempFolder != null && tempFolder.getParent() != null) {
                    String correctedContentEntryPath = tempFolder.getParent() + File.separator + module.getName();
                    String correctedModuleFilePath = correctedContentEntryPath + File.separator + endOfFile;
                    ((ModuleBuilder) builder).setModuleFilePath(correctedModuleFilePath);
                    ((ModuleBuilder) builder).setContentEntryPath(correctedContentEntryPath);
                }
            }
        }

        if (!builder.validate(project, project)) {
            return null;
        } else {
            Module module1;
            if (builder instanceof ModuleBuilder) {
                module1 = ((ModuleBuilder) builder).commitModule(project, (ModifiableModuleModel) null);
                if (module1 != null) {
                    this.processCreatedModule(module1, dataFromContext);
                }

                return module1;
            } else {
                List modules = builder.commit(project, (ModifiableModuleModel) null, new DefaultModulesProvider(project));
                if (builder.isOpenProjectSettingsAfter()) {
                    ModulesConfigurator.showDialog(project, (String) null, (String) null);
                }

                module1 = modules != null && !modules.isEmpty() ? (Module) modules.get(0) : null;
                project.save();
                return module1;
            }
        }
    }
}
