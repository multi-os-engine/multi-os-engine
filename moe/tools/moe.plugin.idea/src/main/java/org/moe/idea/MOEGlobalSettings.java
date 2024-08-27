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

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

@State(
        name = "MOEGlobalSettings",
        storages = {
                @Storage(value = "$APP_CONFIG$/moe.global.settings.xml")
        }
)
public class MOEGlobalSettings implements PersistentStateComponent<MOEGlobalSettings.MOEGlobalSettingsBean> {

    public static final String GRADLE_DEFAULT_KEY = "Lifecycle";

    public static final String GRADLE_DEFAULT_VALUE = "";

    public static final String GRADLE_QUIET_KEY = "Quiet";

    public static final String GRADLE_QUIET_VALUE = "--quiet";

    public static final String GRADLE_INFO_KEY = "Info";

    public static final String GRADLE_INFO_VALUE = "--info";

    public static final String GRADLE_DEBUG_KEY = "Debug";

    public static final String GRADLE_DEBUG_VALUE = "--debug";

    public static final String GRADLE_STACKTRACE_NONE_KEY = "None";

    public static final String GRADLE_STACKTRACE_NONE_VALUE = "";

    public static final String GRADLE_STACKTRACE_SIMPLE_KEY = "Simple";

    public static final String GRADLE_STACKTRACE_SIMPLE_VALUE = "--stacktrace";

    public static final String GRADLE_STACKTRACE_FULL_KEY = "Full";

    public static final String GRADLE_STACKTRACE_FULL_VALUE = "--full-stacktrace";

    private MOEGlobalSettingsBean settingsBean = new MOEGlobalSettingsBean();

    @Nullable
    @Override
    public MOEGlobalSettingsBean getState() {
        return settingsBean;
    }

    @Override
    public void loadState(MOEGlobalSettingsBean moeGlobalSettingsBean) {
        this.settingsBean = moeGlobalSettingsBean;
    }

    @NotNull
    public static MOEGlobalSettings getInstance() {
        return ServiceManager.getService(MOEGlobalSettings.class);
    }

    public String getGradleLoggingLevel() {
        return settingsBean.GRADLE_LOGGING_LEVEL;
    }

    public String getGradleStacktraceLevel() {
        return settingsBean.GRADLE_STACKTRACE_LEVEL;
    }

    public static Map<String, String> getLoggingLevels() {
        Map<String, String> levels = new HashMap<String, String>();
        levels.put(GRADLE_DEFAULT_KEY, GRADLE_DEFAULT_VALUE);
        levels.put(GRADLE_QUIET_KEY, GRADLE_QUIET_VALUE);
        levels.put(GRADLE_INFO_KEY, GRADLE_INFO_VALUE);
        levels.put(GRADLE_DEBUG_KEY, GRADLE_DEBUG_VALUE);
        return levels;
    }

    public static Map<String, String> getStacktraceLevels() {
        Map<String, String> levels = new HashMap<String, String>();
        levels.put(GRADLE_STACKTRACE_NONE_KEY, GRADLE_STACKTRACE_NONE_VALUE);
        levels.put(GRADLE_STACKTRACE_SIMPLE_KEY, GRADLE_STACKTRACE_SIMPLE_VALUE);
        levels.put(GRADLE_STACKTRACE_FULL_KEY, GRADLE_STACKTRACE_FULL_VALUE);
        return levels;
    }

    public static class MOEGlobalSettingsBean {
        public MOEGlobalSettingsBean(){}

        public String GRADLE_LOGGING_LEVEL = GRADLE_DEFAULT_VALUE;
        public String GRADLE_STACKTRACE_LEVEL = GRADLE_STACKTRACE_NONE_VALUE;

    }
}
