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
                @Storage(id="other", file = "$APP_CONFIG$/moe.global.settings.xml")
        }
)
public class MOEGlobalSettings implements PersistentStateComponent<MOEGlobalSettings.MOEGlobalSettingsBean> {

    public static final String GRADLE_DEFAULT_KEY = "Default";

    public static final String GRADLE_DEFAULT_VALUE = "";

    public static final String GRADLE_INFO_KEY = "Info";

    public static final String GRADLE_INFO_VALUE = "--info";

    public static final String GRADLE_STACKTRACE_KEY = "Stacktrace";

    public static final String GRADLE_STACKTRACE_VALUE = "--info,--stacktrace";

    public static final String GRADLE_DEBUG_KEY = "Debug";

    public static final String GRADLE_DEBUG_VALUE = "--info,--stacktrace,--debug";

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

    public String getGradleConsoleMode() {
        return settingsBean.GRADLE_RUN_MODE;
    }

    public static Map<String, String> getRunModes() {
        Map<String, String> runModes = new HashMap<String, String>();
        runModes.put(GRADLE_DEFAULT_KEY, GRADLE_DEFAULT_VALUE);
        runModes.put(GRADLE_INFO_KEY, GRADLE_INFO_VALUE);
        runModes.put(GRADLE_STACKTRACE_KEY, GRADLE_STACKTRACE_VALUE);
        runModes.put(GRADLE_DEBUG_KEY, GRADLE_DEBUG_VALUE);
        return runModes;
    }

    public static class MOEGlobalSettingsBean {
        public MOEGlobalSettingsBean(){}

        public String GRADLE_RUN_MODE = GRADLE_DEFAULT_VALUE;

    }
}
