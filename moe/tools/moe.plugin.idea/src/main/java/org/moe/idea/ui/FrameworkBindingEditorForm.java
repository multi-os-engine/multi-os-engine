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

import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.ui.DocumentAdapter;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.FrameworkBinding;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class FrameworkBindingEditorForm extends JPanel{
    private JPanel content;
    private JTextField nameTextField;
    private JLabel nameLabel;
    private JTextField frameworkTextField;
    private JButton selectFrameworkButton;
    private JTextArea importHeadersTextArea;
    private JTextField basePackageNameTextField;
    private JRadioButton hybridRadioButton;
    private JRadioButton bindingRadioButton;

    private FrameworkBinding frameworkBinding;
    private BindingEditorListForm listForm;
    private boolean inited = false;

    public FrameworkBindingEditorForm() {
        nameTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    frameworkBinding.setName(nameTextField.getText().trim());
                    save();
                }
            }
        });

        frameworkTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    frameworkBinding.setFrameworkPath(frameworkTextField.getText().trim());
                    save();
                }
            }
        });

        importHeadersTextArea.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    frameworkBinding.setImportCode(importHeadersTextArea.getText().trim());
                    save();
                }
            }
        });

        basePackageNameTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    frameworkBinding.setPackageBase(basePackageNameTextField.getText().trim());
                    save();
                }
            }
        });

        selectFrameworkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDirChooser();
            }
        });

        bindingRadioButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (inited) {
                        frameworkBinding.setObjcClassGenerationMode(Bindings.BINDING);
                        save();
                    }
                }
                else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    if (inited) {
                        frameworkBinding.setObjcClassGenerationMode(Bindings.HYBRID);
                        save();
                    }
                }
            }
        });
    }

    public void setVisibility(boolean b) {
        content.setVisible(b);
    }

    public void initWithFrameworkBinding(FrameworkBinding frameworkBinding) {
        inited = false;
        this.frameworkBinding = frameworkBinding;
        nameTextField.setText(frameworkBinding.getName());
        frameworkTextField.setText(frameworkBinding.getFrameworkPath());
        importHeadersTextArea.setText(frameworkBinding.getImportCode());
        basePackageNameTextField.setText(frameworkBinding.getPackageBase());

        String bindingType = frameworkBinding.getObjcClassGenerationMode();
        if (bindingType == null || bindingType.isEmpty()) {
            bindingType = Bindings.BINDING;
            frameworkBinding.setObjcClassGenerationMode(bindingType);
            save();
        }
        boolean isBinding = bindingType.equals(Bindings.BINDING);
        bindingRadioButton.setSelected(isBinding);
        hybridRadioButton.setSelected(!isBinding);

        inited = true;
    }

    public void setBindingEditorListForm(BindingEditorListForm form) {
        this.listForm = form;
    }

    private void save() {
        listForm.save();
    }

    private void openDirChooser() {
        FileChooserDescriptor descriptor = new FileChooserDescriptor(false, true, false, false, false, false);
        VirtualFile root = FileChooser.chooseFile(descriptor, null, null);
        if (root != null) {
            String modulePath = listForm.getModulePath();
            String frameworkPath = root.getCanonicalPath();
            if (frameworkPath.startsWith(modulePath)) {
                frameworkPath = frameworkPath.substring(modulePath.length() + 1, frameworkPath.length());
            }
            frameworkTextField.setText(frameworkPath);
        }
    }
}
