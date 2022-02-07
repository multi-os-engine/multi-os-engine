package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;

public class ResourceDetectionOptions {
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @IgnoreUnused
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
