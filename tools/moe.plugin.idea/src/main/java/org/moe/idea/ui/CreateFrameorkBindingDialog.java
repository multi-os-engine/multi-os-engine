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

import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.DocumentAdapter;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateFrameorkBindingDialog  extends DialogWrapper {

    private JPanel contentPane;
    private JTextField nameTextField;
    private JRadioButton headerRadioButton;
    private JRadioButton frameworkRadioButton;

    private boolean isFramework = true;
    private String name;

    public CreateFrameorkBindingDialog(Project project) {
        super(project);

        nameTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                name = nameTextField.getText().trim();
            }
        });

        headerRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isFramework = !headerRadioButton.isSelected();
            }
        });

        frameworkRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isFramework = frameworkRadioButton.isSelected();
            }
        });

        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }

    public String getName() {
        return name;
    }

    public boolean isFramework() {
        return isFramework;
    }
}
