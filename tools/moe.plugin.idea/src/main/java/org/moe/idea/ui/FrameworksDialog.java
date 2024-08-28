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
import org.moe.editors.Framework;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.List;

public class FrameworksDialog extends DialogWrapper {

    private JPanel contentPane;
    private JTextField searchTextField;
    private JList listframeworksList;
    private List<Framework> frameworks;
    private DefaultListModel listModel;
    private Framework selectedFramework;

    protected FrameworksDialog(@Nullable Project project) {
        super(project);

        setTitle("Choose frameworks and libraries to add");

        this.frameworks = Framework.getFrameworks();

        searchTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                search(searchTextField.getText().trim());
            }
        });

        this.listModel = new DefaultListModel();
        listframeworksList.setModel(listModel);
        for (Framework framework : frameworks) {
            listModel.addElement(framework);
        }

        listframeworksList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                selectedFramework = (Framework) listframeworksList.getSelectedValue();
            }
        });

        init();
    }

    private void search(String therm) {
        listModel.removeAllElements();
        if (therm == null || therm.isEmpty()) {
            for (Framework framework : frameworks) {
                listModel.addElement(framework);
            }
        } else {
            for (Framework framework : frameworks) {
                if (framework.getName().toLowerCase().contains(therm.toLowerCase())) {
                    listModel.addElement(framework);
                }
            }
        }
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }

    public Framework getSelectedFramework() {
        return selectedFramework;
    }
}
