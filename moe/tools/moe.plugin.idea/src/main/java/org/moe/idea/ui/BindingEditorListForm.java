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
import org.moe.tools.natjgen.AbstractBinding;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.FrameworkBinding;
import org.moe.tools.natjgen.HeaderBinding;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BindingEditorListForm extends JPanel {

    private JList bindingsList;
    private JButton testAllButton;
    private JButton addButton;
    private JButton removeButton;
    private JButton testSelectedButton;
    private JButton upButton;
    private JButton downButton;
    private JPanel content;
    private JButton generateBindingsButton;
    private JTextField outputDirectoryTextField;
    private JComboBox platformComboBox;

    private BindingEditorForm editorForm;
    private FrameworkBindingEditorForm frameworkBindingEditorForm;
    private HeaderBindingEditorForm headerBindingEditorForm;
    private DefaultListModel listModel;
    private List<AbstractBinding> bindingList;

    public BindingEditorListForm() {
        this.bindingList = new ArrayList<AbstractBinding>();
        this.listModel = new DefaultListModel();
        bindingsList.setModel(listModel);
        bindingsList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                AbstractBindingModel selected = (AbstractBindingModel) bindingsList.getSelectedValue();
                if (selected != null) {
                    AbstractBinding abstractBinding = selected.getBinding();
                    if (abstractBinding.getType().equals(FrameworkBinding.TYPE)) {
                        frameworkBindingEditorForm.setFrameworkBinding((FrameworkBinding) abstractBinding);
                        editorForm.showFrameworkEditorTab();
                    } else {
                        headerBindingEditorForm.setHeaderBinding((HeaderBinding) abstractBinding);
                        editorForm.showHeaderEditorTab();
                    }
                }
            }
        });

        platformComboBox.addItem(Bindings.PLATFORM_IOS);
        platformComboBox.addItem(Bindings.PLATFORM_OSX);
        platformComboBox.setSelectedIndex(0);

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = bindingsList.getSelectedIndex();
                if (idx > 0) {
                    AbstractBindingModel selected = (AbstractBindingModel) listModel.remove(idx);
                    listModel.add(idx - 1, selected);
                    bindingsList.setSelectedIndex(idx - 1);
                }
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = bindingsList.getSelectedIndex();
                if (idx < listModel.getSize() - 1) {
                    AbstractBindingModel selected = (AbstractBindingModel) listModel.remove(idx);
                    listModel.add(idx + 1, selected);
                    bindingsList.setSelectedIndex(idx + 1);
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = bindingsList.getSelectedIndex();
                listModel.remove(idx);
                if (listModel.getSize() > 0) {
                    bindingsList.setSelectedIndex(0);
                }
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showFrameworkDialog();
            }
        });

        generateBindingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editorForm.save();
            }
        });
    }

    public void init() {
        listModel.removeAllElements();

        for (AbstractBinding binding : editorForm.getBindingsList()) {
            listModel.addElement(new AbstractBindingModel(binding));
        }

        bindingsList.setSelectedIndex(0);
    }

    public void setEditorForm(BindingEditorForm editorForm) {
        this.editorForm = editorForm;
    }

    public void setFrameworkBindingEditorForm(FrameworkBindingEditorForm frameworkBindingEditorForm) {
        this.frameworkBindingEditorForm = frameworkBindingEditorForm;
    }

    public void setHeaderBindingEditorForm(HeaderBindingEditorForm headerBindingEditorForm) {
        this.headerBindingEditorForm = headerBindingEditorForm;
    }

    public class AbstractBindingModel {

        private AbstractBinding binding;

        public AbstractBindingModel(AbstractBinding abstractBinding) {
            this.binding = abstractBinding;
        }

        @Override
        public String toString() {
            return binding.getName();
        }

        public AbstractBinding getBinding() {
            return binding;
        }
    }

    private void showFrameworkDialog() {
        CreateFrameorkBindingDialog dialog = new CreateFrameorkBindingDialog(editorForm.getProject());
        dialog.show();
        if (dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {

        }
    }
}
