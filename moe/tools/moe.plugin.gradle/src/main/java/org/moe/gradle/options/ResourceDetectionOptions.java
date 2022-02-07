package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class ResourceDetectionOptions {
    private boolean enabled = true;

    public boolean isEnabled() {
        return enabled;
    }

    @IgnoreUnused
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @NotNull
    @org.jetbrains.annotations.NotNull
    private Set<String> excludePatterns = new LinkedHashSet<>(
        Arrays.asList(
            // https://github.com/graalvm/native-build-tools/blob/00a13a087fcab94aebc1439dd79becd842aad224/common/utils/src/main/java/org/graalvm/buildtools/utils/SharedConstants.java#L63-L70
            "META-INF/services/.*",
            "META-INF/native-image/.*",
            "META-INF/maven/.*",
            "META-INF/LICENSE.*",
            "META-INF/NOTICE.*",
            "META-INF/.*[.](md|adoc)",
            "META-INF/INDEX.LIST",
            ".*/package.html"
        )
    );

    /**
     * Returns the list of regular expressions which will be used to exclude
     * resources from detection.
     */
    @org.jetbrains.annotations.NotNull
    public Collection<String> getExcludePatterns() {
        return excludePatterns;
    }

    @IgnoreUnused
    public void setExcludePatterns(@org.jetbrains.annotations.NotNull Collection<String> excludePatterns) {
        this.excludePatterns = new LinkedHashSet<>(Require.nonNull(excludePatterns));
    }

    @NotNull
    @org.jetbrains.annotations.NotNull
    @IgnoreUnused
    public ResourceDetectionOptions excludePattern(String... patterns) {
        excludePatterns.addAll(Arrays.asList(Require.nonNull(patterns)));
        return this;
    }
}
