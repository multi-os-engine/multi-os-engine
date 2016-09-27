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

package org.moe.idea;

import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SearchableConfigurable;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.idea.ui.MOEGlobalSettingsForm;

import javax.swing.*;

public class MOEGlobalSearchableConfigurable implements SearchableConfigurable {

    private MOEGlobalSettingsForm settingsForm;

    @NotNull
    @Override
    public String getId() {
        return "moe.global.settings";
    }

    @Nullable
    @Override
    public Runnable enableSearch(String s) {
        return null;
    }

    @Nls
    @Override
    public String getDisplayName() {
        return "Multi-OS Engine Global";
    }

    @Nullable
    @Override
    public String getHelpTopic() {
        return "";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        this.settingsForm = new MOEGlobalSettingsForm();
        return settingsForm.getComponentPanel();
    }

    @Override
    public boolean isModified() {
        return settingsForm.isModified();
    }

    @Override
    public void apply() throws ConfigurationException {
        settingsForm.apply();
    }

    @Override
    public void reset() {
        settingsForm.reset();
    }

    @Override
    public void disposeUIResources() {
        settingsForm = null;
    }


}
