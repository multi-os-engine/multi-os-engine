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

import com.intellij.openapi.ui.DialogWrapper;
import org.moe.editors.Framework;
import org.moe.editors.XcodeEditorManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class LinkedFrameworksForm extends JPanel {
    private JList frameworkList;
    private JPanel contentPane;
    private JButton addButton;
    private JButton removeButton;
    private XcodeEditorManager xcodeEditorManager;
    private DefaultListModel listModel;
    private boolean mainTarget;
    private boolean inited = false;

    public LinkedFrameworksForm() {
        super();
        this.listModel = new DefaultListModel();
        frameworkList.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameworksDialog frameworksDialog = new FrameworksDialog(null);
                frameworksDialog.show();
                if (frameworksDialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
                    if (inited) {
                        Framework selectedFramework = frameworksDialog.getSelectedFramework();
                        if (!listModel.contains(selectedFramework)) {
                            if (mainTarget) {
                                xcodeEditorManager.addFramewokToMain(selectedFramework);
                            } else {
                                xcodeEditorManager.addFramewokToTest(selectedFramework);
                            }
                            listModel.addElement(selectedFramework);
                        }
                    }
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    Framework selectedFramework = (Framework) frameworkList.getSelectedValue();
                    if (mainTarget) {
                        xcodeEditorManager.removeMainFramework(selectedFramework);
                    } else {
                        xcodeEditorManager.removeTestFramework(selectedFramework);
                    }
                    listModel.removeElement(selectedFramework);
                }
            }
        });
    }

    public void init(boolean mainTarget, XcodeEditorManager xcodeEditorManager) {
        inited = false;
        this.xcodeEditorManager = xcodeEditorManager;
        this.mainTarget = mainTarget;
        List<Framework> frameworks = mainTarget ? xcodeEditorManager.getMainFrameworks() : xcodeEditorManager.getTestFrameworks();
        listModel.removeAllElements();
        for (Framework framework : frameworks) {
            listModel.addElement(framework);
        }
        inited = true;
    }
}
