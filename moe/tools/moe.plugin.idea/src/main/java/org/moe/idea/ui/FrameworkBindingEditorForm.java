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

import com.intellij.ui.DocumentAdapter;
import org.moe.tools.natjgen.FrameworkBinding;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

public class FrameworkBindingEditorForm extends JPanel{
    private JPanel content;
    private JTextField nameTextField;
    private JLabel nameLabel;
    private JTextField frameworkTextField;
    private JButton selectFrameworkButton;
    private JTextArea importHeadersTextArea;
    private JTextField basePackageNameTextField;

    private FrameworkBinding frameworkBinding;

    public FrameworkBindingEditorForm() {
        nameTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                frameworkBinding.setName(nameTextField.getText().trim());
            }
        });

        frameworkTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                frameworkBinding.setFrameworkPath(frameworkTextField.getText().trim());
            }
        });

        importHeadersTextArea.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                frameworkBinding.setImportCode(importHeadersTextArea.getText().trim());
            }
        });
    }

    public void setVisibility(boolean b) {
        content.setVisible(b);
    }

    public void setFrameworkBinding(FrameworkBinding frameworkBinding) {
        this.frameworkBinding = frameworkBinding;
        nameTextField.setText(frameworkBinding.getName());
        frameworkTextField.setText(frameworkBinding.getFrameworkPath());
        importHeadersTextArea.setText(frameworkBinding.getImportCode());
        basePackageNameTextField.setText(frameworkBinding.getPackageBase());
    }
}
