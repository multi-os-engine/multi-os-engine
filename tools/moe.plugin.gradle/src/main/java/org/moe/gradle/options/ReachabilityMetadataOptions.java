package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReachabilityMetadataOptions {

    /**
     * Default release of the oracle/graalvm-reachability-metadata repository.
     */
    public static final String DEFAULT_VERSION = "1.0.4";

    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @IgnoreUnused
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Release version of the metadata repository, ignored when {@link #setUri(Object) uri} is set.
     */
    @Nullable
    private String version;

    @Nullable
    public String getVersion() {
        return version;
    }

    @IgnoreUnused
    public void setVersion(@Nullable String version) {
        this.version = version;
    }

    /**
     * Custom repository source instead of the official release: an http(s) URL of a repository
     * zip, or a local repository zip file.
     */
    @Nullable
    private Object uri;

    @Nullable
    public Object getUri() {
        return uri;
    }

    @IgnoreUnused
    public void setUri(@Nullable Object uri) {
        this.uri = uri;
    }

    /**
     * "group:artifact" modules to exclude from metadata matching.
     */
    @NotNull
    private List<String> excludedModules = new ArrayList<>();

    @NotNull
    public List<String> getExcludedModules() {
        return excludedModules;
    }

    @IgnoreUnused
    public void setExcludedModules(@NotNull List<String> excludedModules) {
        this.excludedModules = excludedModules;
    }

    /**
     * "group:artifact" to metadata config version overrides, forcing a specific config version
     * when the resolved dependency version is not covered by the repository.
     */
    @NotNull
    private Map<String, String> moduleToConfigVersion = new HashMap<>();

    @NotNull
    public Map<String, String> getModuleToConfigVersion() {
        return moduleToConfigVersion;
    }

    @IgnoreUnused
    public void setModuleToConfigVersion(@NotNull Map<String, String> moduleToConfigVersion) {
        this.moduleToConfigVersion = moduleToConfigVersion;
    }
}
