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

import org.moe.idea.MOEGlobalSettings;

import javax.swing.*;
import java.util.Map;

import static org.moe.idea.MOEGlobalSettings.GRADLE_DEFAULT_KEY;

public class MOEGlobalSettingsForm {
    private JComboBox gradleRunModeComboBox;
    private JPanel basePanel;
    protected static Map<String, String> runModes;
    private MOEGlobalSettings globalSettings = MOEGlobalSettings.getInstance();

    public MOEGlobalSettingsForm() {
        runModes = MOEGlobalSettings.getRunModes();

        for (String s : runModes.keySet()) {
            gradleRunModeComboBox.addItem(s);
        }
        gradleRunModeComboBox.setSelectedItem(GRADLE_DEFAULT_KEY);
    }

    public boolean isModified() {
        if (globalSettings.getState() == null) {
            return false;
        }
        return !globalSettings.getState().GRADLE_RUN_MODE.equals(runModes.get((String)gradleRunModeComboBox.getSelectedItem()));
    }

    public void apply() {
        globalSettings.getState().GRADLE_RUN_MODE = runModes.get((String)gradleRunModeComboBox.getSelectedItem());
    }

    public void reset() {
        if (globalSettings.getState() != null) {
            gradleRunModeComboBox.setSelectedItem(getValue());
        } else {
            gradleRunModeComboBox.setSelectedItem(GRADLE_DEFAULT_KEY);
        }
    }

    public JComponent getComponentPanel() {
        return basePanel;
    }

    public String getValue() {
        String mode = globalSettings.getState().GRADLE_RUN_MODE;
        for (String key : runModes.keySet()) {
            String value = runModes.get(key);
            if (value.equals(mode)) {
                return key;
            }
        }
        return "";
    }
}
