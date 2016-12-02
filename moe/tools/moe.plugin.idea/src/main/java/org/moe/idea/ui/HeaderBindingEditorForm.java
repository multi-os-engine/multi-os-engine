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

import org.moe.tools.natjgen.HeaderBinding;

import javax.swing.*;

public class HeaderBindingEditorForm extends JPanel {

    private JPanel content;
    private JTextField nameTextField;
    private JTextField packageTextField;
    private SearchPathForm headerSearchPathList;
    private JTextArea importHeadersTextArea;
    private SearchPathForm userHeadersSearchPathsList;
    private SearchPathForm frameworkSearchPathsList;
    private JTextField headerPathTextField;
    private JButton button1;

    private HeaderBinding headerBinding;

    public HeaderBindingEditorForm() {

    }

    public void setHeaderBinding(HeaderBinding headerBinding) {
        this.headerBinding = headerBinding;
        nameTextField.setText(headerBinding.getName());
        headerPathTextField.setText(headerBinding.getHeaderPath());
        packageTextField.setText(headerBinding.getPackageBase());
        importHeadersTextArea.setText(headerBinding.getImportCode());

    }
}
