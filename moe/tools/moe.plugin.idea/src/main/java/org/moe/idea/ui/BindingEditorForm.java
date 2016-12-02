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

package org.moe.idea.ui;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.tools.natjgen.AbstractBinding;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.FrameworkBinding;
import org.moe.tools.natjgen.HeaderBinding;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

public class BindingEditorForm {

    private static final Logger LOG = LoggerFactory.getLogger(BindingEditorForm.class);

    private JPanel content;
    private BindingEditorListForm bindingsListPanel;
    private JTabbedPane editorTabbedPane;
    private JPanel frameworkEditorTab;
    private JPanel headerEditorTab;
    private FrameworkBindingEditorForm frameworkEditor;
    private HeaderBindingEditorForm headerEditor;
    private Project project;
    private File configurationFile;

    private  Bindings bindings;

    public BindingEditorForm(Project project, VirtualFile virtualFile) {
        this.project = project;

        this.configurationFile = new File(virtualFile.getCanonicalPath());
        this.bindings = new Bindings();
        loadBindingsList();

        if (bindings.isEmpty()) {
            editorTabbedPane.setVisible(false);
        }

        bindingsListPanel.setEditorForm(this);
        bindingsListPanel.setFrameworkBindingEditorForm(frameworkEditor);
        bindingsListPanel.setHeaderBindingEditorForm(headerEditor);
        bindingsListPanel.init();
    }

    public JComponent getComponent() {
        return content;
    }

    private void loadBindingsList() {

        try {
            bindings.load(configurationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*FrameworkBinding frameworkBinding = new FrameworkBinding();
        frameworkBinding.setName("Google Play Games");
        frameworkBinding.setFrameworkPath("src/frameworks/google-gpg/sdk/ios/gpg.framework");
        frameworkBinding.setImportCode("#import <gpg/GooglePlayGames.h>");
        frameworkBinding.setPackageBase("com.migeran.bindings");

        bindings.add(frameworkBinding);

        FrameworkBinding frameworkBinding2 = new FrameworkBinding();
        frameworkBinding2.setName("Google Play Test");
        frameworkBinding2.setFrameworkPath("src/frameworks/google-gpg/sdk/ios/GooglePlus.framework");
        frameworkBinding2.setImportCode("#import <gpg/GooglePlayGames.h>");
        frameworkBinding2.setPackageBase("com.migeran.bindings");

        bindings.add(frameworkBinding2);

        HeaderBinding headerBinding = new HeaderBinding();
        headerBinding.setName("Header test");
        headerBinding.setPackageBase("org.moe.headerbinding");
        bindings.add(headerBinding);*/
    }

    public void showFrameworkEditorTab() {
        editorTabbedPane.setSelectedIndex(0);
        editorTabbedPane.setEnabledAt(0, true);
        editorTabbedPane.setEnabledAt(1, false);
    }

    public void showHeaderEditorTab() {
        editorTabbedPane.setSelectedIndex(1);
        editorTabbedPane.setEnabledAt(0, false);
        editorTabbedPane.setEnabledAt(1, true);
    }

    public Bindings getBindingsList() {
        return bindings;
    }

    public Project getProject() {
        return project;
    }

    public void save() {
        try {
            bindings.save(configurationFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
