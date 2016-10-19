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

import com.dd.plist.NSString;
import org.moe.editors.EditorUtil;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class DeploymentInfo extends JPanel {

    public static final String INHERITED = "Inherited";

    private JComboBox mainDeploymentComboBox;
    private JComboBox mainDevicesComboBox;
    private JTabbedPane deviceTabbedPane;
    private JCheckBox ipadPortraitCheckBox;
    private JCheckBox ipadUpsideDownCheckBox;
    private JCheckBox ipadLandscapeLeftCheckBox;
    private JCheckBox ipadLandscapeRightCheckBox;
    private JCheckBox ipadHideDuringApplicationLaunchCheckBox;
    private JCheckBox ipadRequiresFullScreenCheckBox;
    private JComboBox iphoneInterfaceComboBox;
    private JComboBox iphoneStyleComboBox;
    private JComboBox ipadInterfaceComboBox;
    private JPanel deploymentPanel;
    private JPanel contentPane;
    private JCheckBox iphonePortraitCheckBox;
    private JCheckBox iphoneUpsideDownCheckBox;
    private JCheckBox iphoneLandscapeLeftCheckBox;
    private JCheckBox iphoneLandscapeRightCheckBox;
    private JCheckBox iphoneHideDuringApplicationLaunchCheckBox;
    private JCheckBox iphoneRequiresFullScreenCheckBox;
    private JLabel inheritedDeploymentTarget;
    private JLabel inheritedDevice;

    private Map<String, String> devices;
    Map<String, NSString> styles;
    private XcodeEditorManager xcodeEditorManager;
    private InfoPlistManager infoPlistManager;
    private String inheritedDeviceName;
    private String inheritedDeploymentTargetName;
    private boolean mainTarget = false;
    private boolean inited = false;

    public DeploymentInfo() {
        super();

        inheritedDevice.setVisible(false);
        inheritedDeploymentTarget.setVisible(false);

        devices = XcodeEditorManager.getDevicesMap();
        mainDevicesComboBox.addItem(INHERITED);
        for (String name : devices.keySet()) {
            mainDevicesComboBox.addItem(name);
        }

        mainDevicesComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String device = ((String) mainDevicesComboBox.getSelectedItem());
                setInheritedDeviceLabel(device);
                if (inited) {
                    if (mainTarget) {
                        xcodeEditorManager.setMainDevices(devices.get(device));
                    } else {
                        xcodeEditorManager.setTestDevices(devices.get(device));
                    }
                }
            }
        });

        mainDeploymentComboBox.addItem(INHERITED);
        for (String target : XcodeEditorManager.DEPLOYMENT_TARGET_SUGGESTED_VALUES) {
            mainDeploymentComboBox.addItem(target);
        }

        mainDeploymentComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String target = (String) mainDeploymentComboBox.getSelectedItem();
                setInheritedDeploymentTargetLabel(target);
                if (inited) {
                    if (mainTarget) {
                        xcodeEditorManager.setMainDeploymentTarget(target);
                    } else {
                        xcodeEditorManager.setTestDeploymentTarget(target);
                    }
                }
            }
        });

        styles = InfoPlistManager.getStatusBarStylesMap();
        for (String name : styles.keySet()) {
            iphoneStyleComboBox.addItem(name);
        }
        iphoneStyleComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setStyle(styles.get((String) iphoneStyleComboBox.getSelectedItem()));
                }
            }
        });

        iphonePortraitCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfacePortrait(iphonePortraitCheckBox.isSelected());
                }
            }
        });

        ipadPortraitCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfacePortraitIPad(ipadPortraitCheckBox.isSelected());
                }
            }
        });

        ipadUpsideDownCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceUpsideDownIPad(ipadUpsideDownCheckBox.isSelected());
                }
            }
        });

        iphoneUpsideDownCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceUpsideDown(iphoneUpsideDownCheckBox.isSelected());
                }
            }
        });

        ipadLandscapeLeftCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceLandscapeLeftIPad(ipadLandscapeLeftCheckBox.isSelected());
                }
            }
        });

        ipadLandscapeRightCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceLandscapeRightIPad(ipadLandscapeRightCheckBox.isSelected());
                }
            }
        });

        ipadHideDuringApplicationLaunchCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setHideStatusBarIPad(ipadHideDuringApplicationLaunchCheckBox.isSelected());
                }
            }
        });

        ipadRequiresFullScreenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setRequiresFullScreen(ipadRequiresFullScreenCheckBox.isSelected());
                }
                iphoneRequiresFullScreenCheckBox.setSelected(ipadRequiresFullScreenCheckBox.isSelected());

            }
        });

        iphoneRequiresFullScreenCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setRequiresFullScreen(iphoneRequiresFullScreenCheckBox.isSelected());
                }
                ipadRequiresFullScreenCheckBox.setSelected(iphoneRequiresFullScreenCheckBox.isSelected());
            }
        });

        iphoneLandscapeLeftCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceLandscapeLeft(iphoneLandscapeLeftCheckBox.isSelected());
                }
            }
        });

        iphoneLandscapeRightCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setInterfaceLandscapeRight(iphoneLandscapeRightCheckBox.isSelected());
                }
            }
        });

        iphoneHideDuringApplicationLaunchCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    infoPlistManager.setHideStatusBar(iphoneHideDuringApplicationLaunchCheckBox.isSelected());
                }
            }
        });

        iphoneInterfaceComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    String interfaceName = (String) iphoneInterfaceComboBox.getSelectedItem();
                    if (interfaceName == null || interfaceName.equals("-")) {
                        infoPlistManager.setInterfaceFile(null);
                    } else {
                        infoPlistManager.setInterfaceFile(interfaceName);
                    }
                }
            }
        });

        ipadInterfaceComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    String interfaceName = (String) ipadInterfaceComboBox.getSelectedItem();
                    if (interfaceName == null || interfaceName.equals("-")) {
                        infoPlistManager.setInterfaceFileIPad(null);
                    } else {
                        infoPlistManager.setInterfaceFileIPad(interfaceName);
                    }
                }
            }
        });

    }

    public void init(boolean mainTarget, XcodeEditorManager xcodeEditorManager, InfoPlistManager infoPlistManager) {
        inited = false;
        this.xcodeEditorManager = xcodeEditorManager;
        this.infoPlistManager = infoPlistManager;
        this.inheritedDeviceName = xcodeEditorManager.getDefaultDevices();
        this.inheritedDeploymentTargetName = xcodeEditorManager.getDefaultDeploymentTarget();
        this.mainTarget = mainTarget;

        String deviceName = mainTarget ? xcodeEditorManager.getMainDevices() : xcodeEditorManager.getTestDevices();
        deviceName = EditorUtil.getKey(devices, deviceName);
        String deployment = mainTarget ? xcodeEditorManager.getMainDeploymentTarget() : xcodeEditorManager.getTestDeploymentTarget();
        String selectedDevice = (String) mainDevicesComboBox.getSelectedItem();
        if (deviceName == null) {
            if (!selectedDevice.equals(INHERITED)) {
                mainDevicesComboBox.setSelectedItem(INHERITED);
            }
        } else if (!selectedDevice.equals(deviceName)) {
            mainDevicesComboBox.setSelectedItem(deviceName);
        }
        String selectedTarget = (String) mainDeploymentComboBox.getSelectedItem();
        if (deployment == null) {
            if (!selectedTarget.equals(INHERITED)) {
                mainDeploymentComboBox.setSelectedItem(INHERITED);
            }
        } else if (!selectedTarget.equals(deployment)) {
            mainDeploymentComboBox.setSelectedItem(deployment);
        }

        ipadPortraitCheckBox.setSelected(infoPlistManager.isInterfacePortraitIPad());
        iphonePortraitCheckBox.setSelected(infoPlistManager.isInterfacePortrait());
        iphoneStyleComboBox.setSelectedItem(EditorUtil.getNSStringKey(styles, infoPlistManager.getStyle()));
        ipadHideDuringApplicationLaunchCheckBox.setSelected(infoPlistManager.isHideStatusBarIPad());
        iphoneHideDuringApplicationLaunchCheckBox.setSelected(infoPlistManager.isHideStatusBar());
        ipadRequiresFullScreenCheckBox.setSelected(infoPlistManager.isRequiresFullScreen());
        iphoneRequiresFullScreenCheckBox.setSelected(infoPlistManager.isRequiresFullScreen());
        ipadUpsideDownCheckBox.setSelected(infoPlistManager.isInterfaceUpsideDownIPad());
        iphoneUpsideDownCheckBox.setSelected(infoPlistManager.isInterfaceUpsideDown());
        ipadLandscapeLeftCheckBox.setSelected(infoPlistManager.isInterfaceLandscapeLeftIPad());
        iphoneLandscapeLeftCheckBox.setSelected(infoPlistManager.isInterfaceLandscapeLeft());
        ipadLandscapeRightCheckBox.setSelected(infoPlistManager.isInterfaceLandscapeRightIPad());
        iphoneLandscapeRightCheckBox.setSelected(infoPlistManager.isInterfaceLandscapeRight());

        iphoneInterfaceComboBox.removeAllItems();
        ipadInterfaceComboBox.removeAllItems();

        iphoneInterfaceComboBox.addItem("-");
        ipadInterfaceComboBox.addItem("-");

        Map<String, String> uiInterfaces = xcodeEditorManager.getInterfaceFiles();
        for (String uiInterface : uiInterfaces.keySet()) {
            iphoneInterfaceComboBox.addItem(uiInterface);
            ipadInterfaceComboBox.addItem(uiInterface);
        }
        String interfaceFile = infoPlistManager.getInterfaceFile();
        iphoneInterfaceComboBox.setSelectedItem(interfaceFile);
        ipadInterfaceComboBox.setSelectedItem(infoPlistManager.getInterfaceFileIPad());
        inited = true;
    }

    private void setInheritedDeviceLabel(String label) {
        if (label.equals(INHERITED)) {
            inheritedDevice.setVisible(true);
            inheritedDevice.setText(EditorUtil.getKey(devices, inheritedDeviceName));
        } else {
            inheritedDevice.setVisible(false);
            inheritedDevice.setText("");
        }
    }

    private void setInheritedDeploymentTargetLabel(String label) {
        if (label.equals(INHERITED)) {
            inheritedDeploymentTarget.setVisible(true);
            inheritedDeploymentTarget.setText(inheritedDeploymentTargetName);
        } else {
            inheritedDeploymentTarget.setVisible(false);
            inheritedDeploymentTarget.setText("");
        }
    }

    public void updateDevices(String defaultDevice) {
        this.inheritedDeviceName = defaultDevice;
        setInheritedDeviceLabel(((String) mainDevicesComboBox.getSelectedItem()));
    }

    public void updateDeployment(String target) {
        this.inheritedDeploymentTargetName = target;
        setInheritedDeploymentTargetLabel((String) mainDeploymentComboBox.getSelectedItem());
    }
}
