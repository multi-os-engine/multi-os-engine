package org.moe.gradle.options;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProGuardOptions {

    public static final int LEVEL_APP = 0;
    public static final int LEVEL_PLATFORM = 1;
    public static final int LEVEL_ALL = 2;

    private static final String LEVEL_APP_STRING = "app";
    private static final String LEVEL_PLATFORM_STRING = "platform";
    private static final String LEVEL_ALL_STRING = "all";

    private int level = LEVEL_ALL;
    private boolean minifyEnabled = true;
    private boolean obfuscationEnabled = false;
    @Nullable
    private Set<String> excludeFiles;

    @NotNull
    @IgnoreUnused
    public String getLevel() {
        switch (level) {
            case LEVEL_APP:
                return LEVEL_APP_STRING;
            case LEVEL_PLATFORM:
                return LEVEL_PLATFORM_STRING;
            case LEVEL_ALL:
                return LEVEL_ALL_STRING;
            default:
                throw new IllegalStateException();
        }
    }

    public int getLevelRaw() {
        return level;
    }

    @IgnoreUnused
    public void setLevel(@NotNull String level) {
        try {
            this.level = getLevelForString(level);
        } catch (GradleException ex) {
            throw new GradleException("level property can only be set to " +
                "'" + LEVEL_APP_STRING + "', " +
                "'" + LEVEL_PLATFORM_STRING + "' or " +
                "'" + LEVEL_ALL_STRING + "'");
        }
    }

    private static int getLevelForString(@NotNull String proguardLevel) {
        if (LEVEL_APP_STRING.equalsIgnoreCase(proguardLevel)) {
            return LEVEL_APP;
        } else if (LEVEL_PLATFORM_STRING.equalsIgnoreCase(proguardLevel)) {
            return LEVEL_PLATFORM;
        } else if (LEVEL_ALL_STRING.equalsIgnoreCase(proguardLevel)) {
            return LEVEL_ALL;
        } else {
            throw new GradleException();
        }
    }

    public boolean isMinifyEnabled() {
        return minifyEnabled;
    }

    @IgnoreUnused
    public void setMinifyEnabled(boolean minifyEnabled) {
        this.minifyEnabled = minifyEnabled;
    }

    public boolean isObfuscationEnabled() {
        return obfuscationEnabled;
    }

    @IgnoreUnused
    public void setObfuscationEnabled(boolean obfuscationEnabled) {
        this.obfuscationEnabled = obfuscationEnabled;
    }

    @Nullable
    public Collection<String> getExcludeFiles() {
        return excludeFiles;
    }

    @IgnoreUnused
    public void setExcludeFiles(@Nullable Collection<String> excludedFiles) {
        this.excludeFiles = excludedFiles == null ? null : new LinkedHashSet<>(excludedFiles);
    }

    public ProGuardOptions excludeFile(String... names) {
        if (excludeFiles == null) {
            excludeFiles = new LinkedHashSet<>();
        }
        excludeFiles.addAll(Arrays.asList(Require.nonNull(names)));
        return this;
    }

    @Nullable
    private Object baseCfgFile;

    @Nullable
    public Object getBaseCfgFile() {
        return baseCfgFile;
    }

    @IgnoreUnused
    public void setBaseCfgFile(@Nullable Object baseCfgFile) {
        this.baseCfgFile = baseCfgFile;
    }

    @Nullable
    private Object appendCfgFile;

    @Nullable
    public Object getAppendCfgFile() {
        return appendCfgFile;
    }

    @IgnoreUnused
    public void setAppendCfgFile(@Nullable Object appendCfgFile) {
        this.appendCfgFile = appendCfgFile;
    }
}
