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

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.ui.DocumentAdapter;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;
import org.moe.idea.utils.logger.LoggerFactory;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.io.IOException;

public class Identity extends JPanel {

    private static final Logger LOG = LoggerFactory.getLogger(Identity.class);

    private JTextField bundleIdentifier;
    private JTextField version;
    private JTextField build;
    private JPanel contentPane;
    private JTextField productNameTextField;
    private JTextField mainClassTextField;

    private InfoPlistManager infoPlistManager;
    private XcodeEditorManager xcodeEditorManager;
    private boolean mainTarget = false;
    private String bundleIdProjectFile;
    private boolean inited = false;

    public Identity() {
        super();

        bundleIdentifier.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    if (bundleIdProjectFile == null) {
                        infoPlistManager.setBundleIdentifier(bundleIdentifier.getText().trim());
                    } else {
                        if (mainTarget) {
                            xcodeEditorManager.setBundleIdentifier(bundleIdentifier.getText().trim());
                        } else {
                            xcodeEditorManager.setTestBundleIdentifier(bundleIdentifier.getText().trim());
                        }
                    }
                }
            }
        });

        version.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    infoPlistManager.setVersion(version.getText().trim());
                }
            }
        });

        build.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    infoPlistManager.setBuild(build.getText().trim());
                }
            }
        });

        productNameTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    if (mainTarget) {
                        xcodeEditorManager.setMainProductName(productNameTextField.getText().trim());
                    } else {
                        xcodeEditorManager.setTestProductName(productNameTextField.getText().trim());
                    }
                }
            }
        });

        mainClassTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    infoPlistManager.setMainClassName(mainClassTextField.getText().trim());
                }
            }
        });
    }

    public void init(boolean mainTarget, XcodeEditorManager xcodeEditorManager, InfoPlistManager infoPlistManager) {
        inited = false;
        this.xcodeEditorManager = xcodeEditorManager;
        this.infoPlistManager = infoPlistManager;
        this.mainTarget = mainTarget;
        bundleIdProjectFile = mainTarget ? xcodeEditorManager.getBundleIdentifier() : xcodeEditorManager.getTestBundleIdentifier();
        String bundleIdInfoFile = infoPlistManager.getBundleIdentifier();
        String bundleId = bundleIdProjectFile == null ? bundleIdInfoFile : bundleIdProjectFile;
        if (!bundleIdentifier.getText().equals(bundleId)) {
            bundleIdentifier.setText(bundleId);
        }
        String versionString = infoPlistManager.getVersion();
        if (!version.getText().equals(versionString)) {
            version.setText(versionString);
        }
        String buildString = infoPlistManager.getBuild();
        if (!build.getText().equals(buildString)) {
            build.setText(buildString);
        }

        String productName = mainTarget ? xcodeEditorManager.getMainTargetName() : xcodeEditorManager.getTestTargetName();
        if (!productNameTextField.getText().equals(productName)) {
            productNameTextField.setText(productName);
        }

        String mainClass = infoPlistManager.getMainClassName();
        if (!mainClassTextField.getText().equals(mainClass)) {
            mainClassTextField.setText(mainClass);
        }
        inited = true;
    }

}
