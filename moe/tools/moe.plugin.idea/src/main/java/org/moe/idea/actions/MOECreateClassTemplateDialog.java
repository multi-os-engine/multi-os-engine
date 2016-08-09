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
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.Nullable;
import res.MOEIcons;

import javax.swing.*;

public class MOECreateClassTemplateDialog extends DialogWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(MOECreateClassTemplateDialog.class);

    private final Project project;
    private final DataContext dataContext;
    private final String[] subclassComboBoxArray = {"UIViewController", "UITableViewController"};
    private JPanel contentPane;
    private JTextField classTextField;
    private JComboBox subclassComboBox;

    protected MOECreateClassTemplateDialog(@Nullable Project project, DataContext dataContext) {
        super(project);

        init();

        this.project = project;
        this.dataContext = dataContext;

        populateControls();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }

    private void populateControls() {

        subclassComboBox.addItem(subclassComboBoxArray[0]);
        subclassComboBox.addItem(subclassComboBoxArray[1]);
    }

    public MOEClassTemplate getClassTemplate() {
        String fileName = classTextField.getText().trim();
        String subclassName = subclassComboBox.getSelectedItem().toString();

        if (fileName.isEmpty()) {
            LOG.error("Failed to retrieve class name");
            return null;
        }

        if (Character.isLowerCase(fileName.codePointAt(0))) {
            fileName = fileName.substring(0, 1).toUpperCase() + fileName.substring(1);
        }

        VirtualFile virtualFile = CommonDataKeys.VIRTUAL_FILE.getData(dataContext);

        if (virtualFile == null) {
            LOG.error("Failed to get input file");
            return null;
        }


        String packageName = null;
        try {
            packageName = getPackageName(virtualFile);
        } catch (Exception e) {
            LOG.error("Class could not be created outside package");
            return null;
        }

        if (packageName == null) {
            LOG.error("Failed to get package name");
            return null;
        }

        return new MOEClassTemplate(fileName, subclassName, packageName);
    }

    private String getPackageName(VirtualFile file) throws Exception {
        Module module = MOESdkPlugin.findModuleForFile(project, file);
        if (module != null) {
            ModifiableRootModel rootModel = ModuleRootManager.getInstance(module).getModifiableModel();
            for (ContentEntry entry : rootModel.getContentEntries()) {
                for (SourceFolder srcFolder : entry.getSourceFolders()) {
                    String candidate = file.getPath();
                    try {
                        String parent = srcFolder.getFile().getPath();
                        if (candidate.startsWith(parent)) {
                            int index = parent.length() + 1;
                            return candidate.substring(index).replace('/', '.');
                        }
                    } catch (NullPointerException ignore) {
                    }
                }
            }
        }
        return null;
    }

    private void showMessage(String message) {
        Messages.showMessageDialog(message, "Multi-OS Engine Class Creation", MOEIcons.MOELogo);
    }

}
