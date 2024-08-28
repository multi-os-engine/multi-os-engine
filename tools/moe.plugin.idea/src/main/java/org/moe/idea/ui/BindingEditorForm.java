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

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.binding.GeneratorRunner;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.tools.natjgen.AbstractBinding;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.ConfigurationBuilder;
import org.moe.tools.natjgen.ValidationException;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

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
    private VirtualFile configurationFile;
    private boolean saveInProgress;

    private String modulePath;

    private Bindings bindings;

    public BindingEditorForm(Project project, VirtualFile virtualFile) {
        this.project = project;
        this.configurationFile = virtualFile;
        this.module = MOESdkPlugin.findModuleForFile(project, virtualFile);
        this.modulePath = ModuleUtils.getModulePath(module);
        this.bindings = new Bindings();
        bindingsListPanel.setEditorForm(this);
        bindingsListPanel.setFrameworkBindingEditorForm(frameworkEditor);
        bindingsListPanel.setHeaderBindingEditorForm(headerEditor);
    }

    public JComponent getComponent() {
        return content;
    }

    public void loadBindings() {
        Document document = FileDocumentManager.getInstance().getDocument(configurationFile);
        try {
            String text = document.getTextLength() > 0 ? document.getText() : "{}";
            bindings.load(new StringReader(text));
        } catch (Exception e) {
            LOG.info("Wrong configuration: " + e.getMessage());
        }

        editorTabbedPane.setVisible(!bindings.isEmpty());

        bindingsListPanel.init();
    }

    public void documentChanged() {
        // we want to avoid reloading everything on every save as otherwise the UI jumps about constantly,
        // for example if you add a 2nd binding and have started editing it, it saves as you edit,
        // but if each save causes a reload, it will select the first binding again, even though you are trying to edit the 2nd one
        if (saveInProgress) return;
        // This method may still hold a writelock, and we are doing a UI update.
        // Avoid deadlocks, break out of writelock psi/thread for UI update.
        ApplicationManager.getApplication().invokeLater(this::loadBindings);
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
            saveInProgress = true;
            StringWriter writer = new StringWriter();
            bindings.save(writer);
            ApplicationManager.getApplication().runWriteAction(() -> {
                FileDocumentManager.getInstance().getDocument(configurationFile).setText(writer.toString());
            });
        }
        catch (IOException e) {
            LOG.info("Unable save binding configuration: " + e.getMessage());
        }
        finally {
            saveInProgress = false;
        }

        if (!bindings.isEmpty()) {
            editorTabbedPane.setVisible(true);
        } else {
            editorTabbedPane.setVisible(false);
        }
    }

    public void generate() {
        generate(null, false);
    }

    public void generate(AbstractBinding binding, boolean test) {
        save();
        try {
            validateBinding(binding);
            GeneratorRunner testGeneratorRunner = new GeneratorRunner(module);
            testGeneratorRunner.generateBinding(new File(configurationFile.getCanonicalPath()), test, bindingsListPanel.isKeepGeneratedNatjgen());
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

    public Module getModule() {
        return module;
    }
}
