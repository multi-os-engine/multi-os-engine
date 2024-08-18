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
import org.moe.idea.utils.ModuleUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SearchPathForm extends JPanel {

    private JPanel content;
    private JList pathList;
    private JButton addButton;
    private JButton removeButton;

    private DefaultListModel listModel;
    private List<String> searchPaths;
    private HeaderBindingEditorForm bindingEditorForm;

    public SearchPathForm() {
        addButton.setIcon(AllIcons.General.Add);
        removeButton.setIcon(AllIcons.General.Remove);

        this.listModel = new DefaultListModel();
        pathList.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dir = ModuleUtils.selectDir(bindingEditorForm.getListForm().getModule());
                if (dir != null) {
                    searchPaths.add(dir);
                    save();
                    loadList();
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = pathList.getSelectedIndex();
                if (idx >= 0) {
                    searchPaths.remove(idx);
                }
                save();
                loadList();
            }
        });
    }

    public void init(List<String> paths) {
        this.searchPaths = paths;
        loadList();
    }

    public void setBindingEditorForm(HeaderBindingEditorForm form) {
        this.bindingEditorForm = form;
    }

    private void loadList() {
        listModel.removeAllElements();

        for (String path : searchPaths) {
            listModel.addElement(path);
        }
    }

    private void save() {
        bindingEditorForm.save();
    }
}
