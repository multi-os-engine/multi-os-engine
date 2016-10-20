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

import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class AppIconsAndLaunchImages extends JPanel {
    private JPanel contentPane;
    private JComboBox launchScreenComboBox;
    private InfoPlistManager infoPlistManager;
    private XcodeEditorManager xcodeEditorManager;
    private boolean inited = false;

    public AppIconsAndLaunchImages() {
        super();

        launchScreenComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inited) {
                    String interfaceName = (String) launchScreenComboBox.getSelectedItem();
                    if (interfaceName == null || interfaceName.equals("-")) {
                        infoPlistManager.setLaunchScreenFile(null);
                    } else {
                        infoPlistManager.setLaunchScreenFile(interfaceName);
                    }
                }
            }
        });
    }

    public void init(XcodeEditorManager xcodeEditorManager, InfoPlistManager infoPlistManager) {
        inited = false;
        this.xcodeEditorManager = xcodeEditorManager;
        this.infoPlistManager = infoPlistManager;
        launchScreenComboBox.removeAllItems();

        launchScreenComboBox.addItem("-");

        Map<String, String> uiInterfaces = xcodeEditorManager.getInterfaceFiles();
        for (String uiInterface : uiInterfaces.keySet()) {
            launchScreenComboBox.addItem(uiInterface);
        }
        String interfaceFile = infoPlistManager.getLaunchScreenFile(xcodeEditorManager);
        launchScreenComboBox.setSelectedItem(interfaceFile);
        inited = false;
    }
}
