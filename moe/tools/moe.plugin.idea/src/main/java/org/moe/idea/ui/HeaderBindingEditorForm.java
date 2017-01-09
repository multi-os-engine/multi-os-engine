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
import org.moe.tools.natjgen.HeaderBinding;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class HeaderBindingEditorForm extends JPanel {

    private JPanel content;
    private JTextField nameTextField;
    private JTextField packageTextField;
    private SearchPathForm headerSearchPathList;
    private JTextArea importHeadersTextArea;
    private SearchPathForm userHeadersSearchPathsList;
    private SearchPathForm frameworkSearchPathsList;
    private JTextField headerPathTextField;
    private JButton browsePathButton;
    private JTextField explicitLibraryTextField;
    private JRadioButton bindingRadioButton;
    private JRadioButton hybridRadioButton;

    private BindingEditorListForm listForm;
    private HeaderBinding headerBinding;
    private boolean inited = false;

    public HeaderBindingEditorForm() {

        nameTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    headerBinding.setName(nameTextField.getText().trim());
                    save();
                }
            }
        });

        packageTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    headerBinding.setPackageBase(packageTextField.getText().trim());
                    save();
                }
            }
        });

        explicitLibraryTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    headerBinding.setExplicitLibrary(explicitLibraryTextField.getText().trim());
                    save();
                }
            }
        });

        headerPathTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    headerBinding.setHeaderPath(headerPathTextField.getText().trim());
                    save();
                }
            }
        });

        importHeadersTextArea.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    headerBinding.setImportCode(importHeadersTextArea.getText().trim());
                    save();
                }
            }
        });

        browsePathButton.addActionListener(new ActionListener() {
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
                        headerBinding.setObjcClassGenerationMode(Bindings.BINDING);
                        save();
                    }
                }
                else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    if (inited) {
                        headerBinding.setObjcClassGenerationMode(Bindings.HYBRID);
                        save();
                    }
                }
            }
        });
    }

    public void initWithHeaderBinding(HeaderBinding headerBinding) {
        inited = false;
        this.headerBinding = headerBinding;
        nameTextField.setText(headerBinding.getName());
        headerPathTextField.setText(headerBinding.getHeaderPath());
        explicitLibraryTextField.setText(headerBinding.getExplicitLibrary());
        packageTextField.setText(headerBinding.getPackageBase());
        importHeadersTextArea.setText(headerBinding.getImportCode());

        headerSearchPathList.setBindingEditorForm(this);
        headerSearchPathList.init(headerBinding.getHeaderSearchPaths());
        userHeadersSearchPathsList.setBindingEditorForm(this);
        userHeadersSearchPathsList.init(headerBinding.getUserHeaderSearchPaths());
        frameworkSearchPathsList.setBindingEditorForm(this);
        frameworkSearchPathsList.init(headerBinding.getFrameworkSearchPaths());

        String bindingType = headerBinding.getObjcClassGenerationMode();
        if (bindingType == null || bindingType.isEmpty()) {
            bindingType = Bindings.BINDING;
            headerBinding.setObjcClassGenerationMode(bindingType);
            save();
        }
        boolean isBinding = bindingType == null || bindingType.equals(Bindings.BINDING);
        bindingRadioButton.setSelected(isBinding);
        hybridRadioButton.setSelected(!isBinding);

        inited = true;

    }

    public void setBindingEditorListForm(BindingEditorListForm form) {
        this.listForm = form;
    }

    public void save() {
        listForm.save();
    }

    private void openDirChooser() {
        FileChooserDescriptor descriptor = new FileChooserDescriptor(false, true, false, false, false, false);
        VirtualFile root = FileChooser.chooseFile(descriptor, null, null);
        if (root != null) {
            String modulePath = listForm.getModulePath();
            String headerPath = root.getCanonicalPath();
            if (headerPath.startsWith(modulePath)) {
                headerPath = headerPath.substring(modulePath.length() + 1, headerPath.length());
            }
            headerPathTextField.setText(headerPath);
        }
    }
}
