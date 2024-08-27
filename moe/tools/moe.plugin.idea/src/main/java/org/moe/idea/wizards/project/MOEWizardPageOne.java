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
import org.moe.generator.project.MOEProjectComposer;
import org.moe.idea.builder.MOEModuleBuilder;
import org.moe.idea.builder.MOEModuleProperties;

import javax.swing.*;
import javax.swing.event.DocumentEvent;

import static org.moe.generator.project.MOEProjectComposer.Field.*;

public class MOEWizardPageOne extends ModuleWizardStep {

    private final static String BUNDLE_ID = "Application Bundle Id: ";
    private final MOEModuleBuilder builder;
    private JPanel panel;
    private JTextField organizationName;
    private JTextField companyIdentifier;
    private JTextField packageNameTextField;
    private JLabel bundleIdField;
    private JTextField projectName;
    private MOEProjectComposer projectComposer;

    public MOEWizardPageOne(MOEModuleBuilder builder) {
        this.builder = builder;
        this.projectComposer = new MOEProjectComposer();

        projectName.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                projectComposer.setProjectName(projectName.getText().trim());
                bundleIdField.setText(BUNDLE_ID + projectComposer.getBundleID());
            }
        });
        companyIdentifier.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                projectComposer.setOrganizationID(companyIdentifier.getText().trim());
                bundleIdField.setText(BUNDLE_ID + projectComposer.getBundleID());
            }
        });
        organizationName.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                projectComposer.setOrganizationName(organizationName.getText().trim());
            }
        });
        packageNameTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                projectComposer.setPackageName(packageNameTextField.getText().trim());
            }
        });
    }

    @Override
    public JComponent getComponent() {
        return panel;
    }

    @Override
    public void updateDataModel() {
        MOEModuleProperties config = builder.getMOEModuleProperties();

        if (projectName != null) {
            config.setProjectName(projectName.getText().trim());
        }

        if (organizationName != null) {
            config.setOrganizationName(organizationName.getText().trim());
        }

        if (companyIdentifier != null) {
            config.setCompanyIdentifier(companyIdentifier.getText().trim());
        }

        if (packageNameTextField != null) {
            config.setPackageName(packageNameTextField.getText().trim());
        }
    }

    @Override
    public boolean validate() throws ConfigurationException {
        try {
            projectComposer.validate(
                    PROJECT_NAME,
                    PACKAGE_NAME,
                    ORGANIZATION_NAME,
                    ORGANIZATION_IDENTIFIER);
        } catch (MOEProjectComposer.MOEProjectComposerValidationException e) {
            throw new ConfigurationException(e.getMessage());
        }
        return true;
    }

}
