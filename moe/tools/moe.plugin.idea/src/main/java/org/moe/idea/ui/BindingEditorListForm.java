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

import com.intellij.icons.AllIcons;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.ui.DocumentAdapter;
import org.moe.tools.natjgen.AbstractBinding;
import org.moe.tools.natjgen.Bindings;
import org.moe.tools.natjgen.FrameworkBinding;
import org.moe.tools.natjgen.HeaderBinding;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class BindingEditorListForm extends JPanel {

    private JList bindingsList;
    private JButton addButton;
    private JButton removeButton;
    private JButton upButton;
    private JButton downButton;
    private JPanel content;
    private JTextField outputDirectoryTextField;
    private JComboBox platformComboBox;
    private JButton actionsButton;
    private JTextField inlineFunctionOutputTextField;
    private JTextField typeConfInputTextField;
    private JTextField typeConfOutputTextField;
    private JCheckBox keepGenratedNatjgenFileCheckBox;

    private BindingEditorForm editorForm;
    private FrameworkBindingEditorForm frameworkBindingEditorForm;
    private HeaderBindingEditorForm headerBindingEditorForm;
    private DefaultListModel listModel;
    private List<AbstractBinding> bindingList;
    private Bindings bindings;
    private boolean inited = false;

    public BindingEditorListForm() {
        addButton.setIcon(AllIcons.General.Add);
        removeButton.setIcon(AllIcons.General.Remove);
        upButton.setIcon(AllIcons.Actions.MoveUp);
        downButton.setIcon(AllIcons.Actions.MoveDown);
        actionsButton.setIcon(AllIcons.General.GearPlain);

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
                        frameworkBindingEditorForm.initWithFrameworkBinding((FrameworkBinding) abstractBinding);
                        editorForm.showFrameworkEditorTab();
                    } else {
                        headerBindingEditorForm.initWithHeaderBinding((HeaderBinding) abstractBinding);
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
                    bindings.remove(idx);
                    idx--;
                    listModel.add(idx, selected);
                    bindingsList.setSelectedIndex(idx);
                    bindings.add(idx, selected.getBinding());
                    saveBindings();
                }
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = bindingsList.getSelectedIndex();
                if (idx < listModel.getSize() - 1) {
                    AbstractBindingModel selected = (AbstractBindingModel) listModel.remove(idx);
                    bindings.remove(idx);
                    idx++;
                    listModel.add(idx, selected);
                    bindingsList.setSelectedIndex(idx);
                    bindings.add(idx, selected.getBinding());
                    saveBindings();
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = bindingsList.getSelectedIndex();
                listModel.remove(idx);
                bindings.remove(idx);
                if (listModel.getSize() > 0) {
                    bindingsList.setSelectedIndex(0);
                }
                saveBindings();
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createBinding();
            }
        });

        outputDirectoryTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    editorForm.getBindings().setOutputDirectory(outputDirectoryTextField.getText().trim());
                    save();
                }
            }
        });

        platformComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    editorForm.getBindings().setPlatform((String) platformComboBox.getSelectedItem());
                    save();
                }
            }
        });
        actionsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                final JPopupMenu popup = new JPopupMenu();
                popup.add(new JMenuItem(new AbstractAction("Test Selected") {
                    public void actionPerformed(ActionEvent e) {
                        int idx = bindingsList.getSelectedIndex();
                        if (idx >= 0) {
                            AbstractBinding binding = bindings.get(idx);
                            if (binding != null) {
                                editorForm.testSelected(binding);
                            }
                        }
                    }
                }));
                popup.add(new JMenuItem(new AbstractAction("Test All") {
                    public void actionPerformed(ActionEvent e) {
                        editorForm.testAll();
                    }
                }));
                popup.add(new JMenuItem(new AbstractAction("Generate Bindings") {
                    public void actionPerformed(ActionEvent e) {
                        editorForm.generate();
                    }
                }));

                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });

        inlineFunctionOutputTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    editorForm.getBindings().setInlineFunctionBindingOutput(inlineFunctionOutputTextField.getText().trim());
                    save();
                }
            }
        });

        typeConfInputTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    editorForm.getBindings().setTypeConfigInput(typeConfInputTextField.getText().trim());
                    save();
                }
            }
        });

        typeConfOutputTextField.getDocument().addDocumentListener(new DocumentAdapter() {

            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    editorForm.getBindings().setTypeConfigOutput(typeConfOutputTextField.getText().trim());
                    save();
                }
            }
        });
    }

    public void init() {

        inited = false;

        frameworkBindingEditorForm.setBindingEditorListForm(this);
        headerBindingEditorForm.setBindingEditorListForm(this);

        this.bindings = editorForm.getBindings();

        loadList();

        bindingsList.setSelectedIndex(0);

        String path = bindings.getOutputDirectory();

        if (path == null || path.isEmpty()) {
            path = "src/main/java";
            bindings.setOutputDirectory(path);
            save();
        }
        outputDirectoryTextField.setText(path);

        String platform = bindings.getPlatform();
        if (platform == null || platform.isEmpty()) {
            platform = Bindings.PLATFORM_IOS;
            bindings.setPlatform(platform);
            save();
        }
        platformComboBox.setSelectedItem(platform);

        inlineFunctionOutputTextField.setText(bindings.getInlineFunctionBindingOutput());
        typeConfInputTextField.setText(bindings.getTypeConfigInput());
        typeConfOutputTextField.setText(bindings.getTypeConfigOutput());

        inited = true;
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

    private void createBinding() {
        CreateFrameorkBindingDialog dialog = new CreateFrameorkBindingDialog(editorForm.getProject());
        dialog.show();
        if (dialog.getExitCode() == DialogWrapper.OK_EXIT_CODE) {
            String name = dialog.getName();
            if (name != null && !name.isEmpty()) {
                AbstractBinding binding = dialog.isFramework() ? new FrameworkBinding() : new HeaderBinding();
                binding.setName(name);
                bindings.add(binding);
                listModel.addElement(new AbstractBindingModel(binding));
                saveBindings();
                bindingsList.setSelectedIndex(listModel.size() - 1);
            }
        }
    }

    public void save() {
        editorForm.save();
    }

    public void saveBindings() {
        editorForm.save();
        loadList();
    }

    private void loadList() {
        int idx = bindingsList.getSelectedIndex();
        listModel.removeAllElements();

        for (AbstractBinding binding : bindings) {
            listModel.addElement(new AbstractBindingModel(binding));
        }

        bindingsList.setSelectedIndex(idx);
    }

    public Module getModule() {
        return editorForm.getModule();
    }

    public boolean isKeepGeneratedNatjgen() {
        return keepGenratedNatjgenFileCheckBox.isSelected();
    }
}
