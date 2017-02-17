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
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.binding.GeneratorRunner;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.tools.natjgen.AbstractBinding;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.ConfigurationBuilder;
import org.moe.tools.natjgen.ValidationException;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class BindingEditorForm {

    private static final Logger LOG = LoggerFactory.getLogger(BindingEditorForm.class);

    private JPanel content;
    private BindingEditorListForm bindingsListPanel;
    private JScrollPane scrollPane;
    private JTabbedPane editorTabbedPane;
    private FrameworkBindingEditorForm frameworkEditor;
    private HeaderBindingEditorForm headerEditor;
    private JPanel panel;
    private Project project;
    private Module module;
    private File configurationFile;

    private String modulePath;

    private  Bindings bindings;

    public BindingEditorForm(Project project, VirtualFile virtualFile) {
        this.project = project;
        this.module = MOESdkPlugin.findModuleForFile(project, virtualFile);
        this.modulePath = ModuleUtil.getModuleDirPath(module);
        this.configurationFile = new File(virtualFile.getCanonicalPath());
        this.bindings = new Bindings();
        loadBindings();

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

    private void loadBindings() {

        if (configurationFile.length() > 0) {
            try {
                bindings.load(configurationFile);
            } catch (Exception e) {
                LOG.info("Wrong configurationó: " + e.getMessage());
            }
        }
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

    public Bindings getBindings() {
        return bindings;
    }

    public Project getProject() {
        return project;
    }

    public void save() {
        try {
            bindings.save(configurationFile);
        } catch (IOException e) {
            LOG.info("Unable save binding configuration: " + e.getMessage());
        }
        if (!bindings.isEmpty()) {
            editorTabbedPane.setVisible(true);
        } else {
            editorTabbedPane.setVisible(false);
        }
    }

    public void generate() {
        generate(null,false);
    }

    public void generate(AbstractBinding binding, boolean test) {
        save();
        try {
            validateBinding(binding);
            GeneratorRunner testGeneratorRunner = new GeneratorRunner(module);
            testGeneratorRunner.generateBinding(configurationFile, test, bindingsListPanel.isKeepGeneratedNatjgen());
        } catch (Exception e) {
            Messages.showErrorDialog(e.getMessage(), "Generate Binding Error");
        }
    }

    public void testAll() {
        generate(null, true);
    }

    public void testSelected(AbstractBinding binding) {
        generate(binding, true);
    }

    private void validateBinding(AbstractBinding binding) throws FileNotFoundException, ValidationException {
        ConfigurationBuilder builder = null;
        if (binding == null) {
            builder = new ConfigurationBuilder(bindings);
        } else {
            Bindings testBindings = new Bindings();
            testBindings.setPlatform(bindings.getPlatform());
            testBindings.setOutputDirectory(bindings.getOutputDirectory());
            testBindings.add(binding);
            builder = new ConfigurationBuilder(testBindings);
        }

        builder.build();
    }

    public String getModulePath() {
        return modulePath;
    }
}
