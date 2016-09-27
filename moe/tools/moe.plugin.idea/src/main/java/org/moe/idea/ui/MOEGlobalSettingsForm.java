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
