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
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.ui.DocumentAdapter;
import org.moe.idea.builder.MOEModuleBuilder;
import org.moe.idea.builder.MOEModuleProperties;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class MOEWizardPageOne extends ModuleWizardStep {
    private final MOEModuleBuilder builder;

    private JPanel panel;

    private JTextField projectName;
    private JTextField productName;
    private JTextField organizationName;
    private JTextField companyIdentifier;
    private JRadioButton keepXcodeProject;
    private JLabel xcodeProjectPathLabel;
    private JTextField xcodeProjectPath;

    private Pattern validJavaPackagePattern = Pattern.compile("^[a-zA-Z_\\$][\\w\\$]*(?:\\.[a-zA-Z_\\$][\\w\\$]*)*$");

    public MOEWizardPageOne(MOEModuleBuilder builder) {
        this.builder = builder;

        initControls();
    }

    @Override
    public JComponent getComponent() {
        return panel;
    }

    @Override
    public void updateDataModel() {
        MOEModuleProperties config = builder.getMOEModuleProperties();

        if (projectName != null) {
            config.setProjectName(projectName.getText());
        }

        if (productName != null) {
            config.setProductName(productName.getText());
        }

        if (organizationName != null) {
            config.setOrganizationName(organizationName.getText());
        }

        if (companyIdentifier != null) {
            config.setCompanyIdentifier(companyIdentifier.getText());
        }

        if (keepXcodeProject != null) {
            config.setKeepXcodeProject(keepXcodeProject.isSelected());
        }

        if (xcodeProjectPath != null) {
            config.setXcodeProjectPath(xcodeProjectPath.getText());
        }
    }

    @Override
    public boolean validate() throws ConfigurationException {
        if (projectName.getText().trim().isEmpty()) {
            throw new ConfigurationException("Enter a Project Name");
        }

        if (productName.getText().trim().isEmpty()) {
            throw new ConfigurationException("Enter a Product Name");
        }

        if (companyIdentifier.getText().trim().isEmpty()) {
            throw new ConfigurationException("Enter a Company Identifier");
        }

        if (organizationName.getText().trim().isEmpty()) {
            throw new ConfigurationException("Enter a Organization Name");
        }

        if (!validJavaPackagePattern.matcher(productName.getText()).matches() ||
                !validJavaPackagePattern.matcher(projectName.getText()).matches()) {
            throw new ConfigurationException("Product Name or Project Name is invalid!\n" +
                    "1) Allowed word characters (a-zA-Z_0-9) and dots.\n" +
                    "2) Segments between dots must be of non-zero length.\n" +
                    "3) A digit cannot be the first character.");
        }

        if (keepXcodeProject.isSelected()) {
            if (xcodeProjectPath.getText().trim().isEmpty()) {
                throw new ConfigurationException("Enter a Xcode Project Path");
            }
        }

        return true;
    }

    private void initControls() {
        if (projectName != null) {
            projectName.getDocument().addDocumentListener(new DocumentAdapter() {
                protected void textChanged(DocumentEvent e) {
                    productName.setText(projectName.getText());
                }
            });
        }

        keepXcodeProject.setSelected(false);
        xcodeProjectPath.setVisible(false);
        xcodeProjectPathLabel.setVisible(false);

        keepXcodeProject.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (keepXcodeProject.isSelected()) {
                    xcodeProjectPath.setVisible(true);
                    xcodeProjectPathLabel.setVisible(true);
                } else {
                    xcodeProjectPath.setVisible(false);
                    xcodeProjectPathLabel.setVisible(false);
                }
            }
        });
    }
}
