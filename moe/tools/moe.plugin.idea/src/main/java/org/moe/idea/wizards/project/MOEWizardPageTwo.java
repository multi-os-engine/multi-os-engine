/*
Copyright 2014-2016 Intel Corporation

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


package org.moe.idea.wizards.project;

import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import org.moe.idea.builder.MOEModuleBuilder;
import org.moe.idea.builder.MOEModuleProperties;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MOEWizardPageTwo extends ModuleWizardStep {
    private final MOEModuleBuilder moduleBuilder;

    private JPanel panel;
    private JTextField projectName;
    private JTextField productName;
    private JTextField organizationName;
    private JTextField companyIdentifier;

    public JPanel getPanel() {
        return panel;
    }

    public MOEWizardPageTwo(MOEModuleBuilder moduleBuilder) {
        this.moduleBuilder = moduleBuilder;
    }

    @Override
    public JComponent getComponent() {
        return getPanel();
    }

    @Override
    public void updateDataModel() {
        MOEModuleProperties config = moduleBuilder.getMOEModuleProperties();

        config.setProjectName(projectName.getText());
        config.setProductName(productName.getText());
        config.setOrganizationName(organizationName.getText());
        config.setCompanyIdentifier(companyIdentifier.getText());
    }
}
