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
import static org.moe.idea.MOEGlobalSettings.GRADLE_STACKTRACE_NONE_VALUE;

public class MOEGlobalSettingsForm {
    private JComboBox logLevelComboBox;
    private JPanel basePanel;
    private JComboBox stacktraceLevelComboBox;
    protected static Map<String, String> loggingLevels;
    protected static Map<String, String> stackTraceLevels;
    private MOEGlobalSettings globalSettings = MOEGlobalSettings.getInstance();

    public MOEGlobalSettingsForm() {
        loggingLevels = MOEGlobalSettings.getLoggingLevels();
        stackTraceLevels = MOEGlobalSettings.getStacktraceLevels();

        for (String s : loggingLevels.keySet()) {
            logLevelComboBox.addItem(s);
        }
        logLevelComboBox.setSelectedItem(GRADLE_DEFAULT_KEY);

        for (String s : stackTraceLevels.keySet()) {
            stacktraceLevelComboBox.addItem(s);
        }
        stacktraceLevelComboBox.setSelectedItem(GRADLE_STACKTRACE_NONE_VALUE);
    }

    public boolean isModified() {
        if (globalSettings.getState() == null) {
            return false;
        }
        if (!globalSettings.getState().GRADLE_LOGGING_LEVEL.equals(loggingLevels.get((String) logLevelComboBox.getSelectedItem())) ||
                !globalSettings.getState().GRADLE_STACKTRACE_LEVEL.equals(stackTraceLevels.get((String) stacktraceLevelComboBox.getSelectedItem()))) {
            return true;
        }
        return false;
    }

    public void apply() {
        globalSettings.getState().GRADLE_LOGGING_LEVEL = loggingLevels.get((String) logLevelComboBox.getSelectedItem());
        globalSettings.getState().GRADLE_STACKTRACE_LEVEL = stackTraceLevels.get((String) stacktraceLevelComboBox.getSelectedItem());
    }

    public void reset() {
        if (globalSettings.getState() != null) {
            logLevelComboBox.setSelectedItem(getLoggingValue());
            stacktraceLevelComboBox.setSelectedItem(getStacktraceValue());
        } else {
            logLevelComboBox.setSelectedItem(GRADLE_DEFAULT_KEY);
            stacktraceLevelComboBox.setSelectedItem(GRADLE_STACKTRACE_NONE_VALUE);
        }
    }

    public JComponent getComponentPanel() {
        return basePanel;
    }

    public String getLoggingValue() {
        String mode = globalSettings.getState().GRADLE_LOGGING_LEVEL;
        for (String key : loggingLevels.keySet()) {
            String value = loggingLevels.get(key);
            if (value.equals(mode)) {
                return key;
            }
        }
        return "";
    }

    public String getStacktraceValue() {
        String mode = globalSettings.getState().GRADLE_STACKTRACE_LEVEL;
        for (String key : stackTraceLevels.keySet()) {
            String value = stackTraceLevels.get(key);
            if (value.equals(mode)) {
                return key;
            }
        }
        return "";
    }
}
