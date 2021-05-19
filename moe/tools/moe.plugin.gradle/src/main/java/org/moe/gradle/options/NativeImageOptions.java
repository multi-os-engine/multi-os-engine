package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

public class NativeImageOptions {

    /**
     * Array of native-image command-line options
     */
    @Nullable
    private String[] options;

    @Nullable
    public String[] getOptions() {
        return options;
    }

    @IgnoreUnused
    public void setOptions(@Nullable String[] options) {
        this.options = options;
    }
}
