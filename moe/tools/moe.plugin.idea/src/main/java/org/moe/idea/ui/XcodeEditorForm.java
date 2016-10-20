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
import org.moe.editors.EditorUtil;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;
import org.moe.idea.utils.logger.LoggerFactory;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class XcodeEditorForm {

    private static final Logger LOG = LoggerFactory.getLogger(XcodeEditorForm.class);

    private JPanel contentPane;
    private JTabbedPane baseTabbedPane;
    private Identity mainIdentity;
    private DeploymentInfo mainDeploymentInfo;
    private LinkedFrameworksForm mainLinkedFrameworks;
    private Identity testIdentity;
    private DeploymentInfo testDeploymentInfo;
    private LinkedFrameworksForm testLinkedFrameworks;
    private JTextField projectNameTextField;
    private JComboBox deploymentComboBox;
    private JComboBox devicesComboBox;
    private JTextField organizationTextField;
    private AppIconsAndLaunchImages appIconsAndLaunchImagesMain;
    private AppIconsAndLaunchImages appIconsAndLaunchImagesTest;

    private XcodeEditorManager xcodeEditorManager;
    private Map<String, String> devices;
    private InfoPlistManager mainInfoPlistManager;
    private InfoPlistManager testInfoPlistManager;
    private boolean inited = false;

    public XcodeEditorForm() {
        devices = XcodeEditorManager.getDevicesMap();
        for (String name : devices.keySet()) {
            devicesComboBox.addItem(name);
        }
        devicesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String device = devices.get((String) devicesComboBox.getSelectedItem());
                mainDeploymentInfo.updateDevices(device);
                testDeploymentInfo.updateDevices(device);
                if (inited) {
                    xcodeEditorManager.setDefaultDevices(device);
                }
            }
        });

        projectNameTextField.setEditable(false);

        for (String target : XcodeEditorManager.DEPLOYMENT_TARGET_SUGGESTED_VALUES) {
            deploymentComboBox.addItem(target);
        }

        deploymentComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String target = (String) deploymentComboBox.getSelectedItem();
                mainDeploymentInfo.updateDeployment(target);
                testDeploymentInfo.updateDeployment(target);
                if (inited) {
                    xcodeEditorManager.setDefaultDeploymentTarget(target);
                }
            }
        });

        organizationTextField.getDocument().addDocumentListener(new DocumentAdapter() {
            protected void textChanged(DocumentEvent e) {
                if (inited) {
                    xcodeEditorManager.setOrganizationName(organizationTextField.getText().trim());
                }
            }
        });

    }

    public JComponent getComponent() {
        return contentPane;
    }

    public void init() {
        inited = false;
        projectNameTextField.setText(xcodeEditorManager.getProjectName());
        devicesComboBox.setSelectedItem(EditorUtil.getKey(devices, xcodeEditorManager.getDefaultDevices()));
        deploymentComboBox.setSelectedItem(xcodeEditorManager.getDefaultDeploymentTarget());
        organizationTextField.setText(xcodeEditorManager.getOrganizationName());

        mainIdentity.init(true, xcodeEditorManager, mainInfoPlistManager);
        testIdentity.init(false, xcodeEditorManager, testInfoPlistManager);
        mainDeploymentInfo.init(true, xcodeEditorManager, mainInfoPlistManager);
        testDeploymentInfo.init(false, xcodeEditorManager, testInfoPlistManager);
        mainLinkedFrameworks.init(true, xcodeEditorManager);
        testLinkedFrameworks.init(false, xcodeEditorManager);
        appIconsAndLaunchImagesMain.init(xcodeEditorManager, mainInfoPlistManager);
        appIconsAndLaunchImagesTest.init(xcodeEditorManager, testInfoPlistManager);
        inited = true;
    }

    public void refresh() {
        init();
    }

    public void setXcodeEditorManager(XcodeEditorManager xcodeEditorManager) {
        this.xcodeEditorManager = xcodeEditorManager;
    }

    public void setMainInfoPlistManager(InfoPlistManager mainInfoPlistManager) {
        this.mainInfoPlistManager = mainInfoPlistManager;
    }

    public void setTestInfoPlistManager(InfoPlistManager testInfoPlistManager) {
        this.testInfoPlistManager = testInfoPlistManager;
    }
}
