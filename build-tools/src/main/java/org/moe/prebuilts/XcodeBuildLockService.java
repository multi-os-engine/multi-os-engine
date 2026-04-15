package org.moe.prebuilts;

import org.gradle.api.services.BuildService;
import org.gradle.api.services.BuildServiceParameters;

public abstract class XcodeBuildLockService implements BuildService<BuildServiceParameters.None> {
    public static final String NAME = "xcodeBuildLock";
}
