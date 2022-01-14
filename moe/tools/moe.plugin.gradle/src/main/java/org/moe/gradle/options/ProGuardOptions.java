package org.moe.gradle.options;

import org.gradle.api.GradleException;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;

public class ProGuardOptions {

    public static final int LEVEL_APP = 0;
    public static final int LEVEL_PLATFORM = 1;
    public static final int LEVEL_ALL = 2;

    private static final String LEVEL_APP_STRING = "app";
    private static final String LEVEL_PLATFORM_STRING = "platform";
    private static final String LEVEL_ALL_STRING = "all";

    private int level = LEVEL_APP;

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
}
