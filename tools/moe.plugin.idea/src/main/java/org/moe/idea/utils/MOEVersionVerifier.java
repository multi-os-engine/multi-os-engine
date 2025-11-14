package org.moe.idea.utils;

import com.intellij.openapi.module.Module;
import org.apache.maven.artifact.versioning.ComparableVersion;
import org.moe.idea.model.GradleModuleModel;

public class MOEVersionVerifier {

    public static final String VERSION_LAUNCH_TASK_REWRITE = "2.0.0-SNAPSHOT";

    public static boolean isVersionGreaterOrEqual(Module module, String minVersion) {
        return isVersionGreaterOrEqual(GradleModuleModel.getInstance(module), minVersion);
    }

    public static boolean isVersionGreaterOrEqual(GradleModuleModel gradleModuleModel, String minVersion) {
        if (gradleModuleModel == null)
            return false;
        if (gradleModuleModel.getSdkProperties() == null)
            return false;
        if (gradleModuleModel.getSdkProperties().getVersion() == null)
            return false;

        return new ComparableVersion(gradleModuleModel.getSdkProperties().getVersion()).compareTo(new ComparableVersion(minVersion)) >= 0;
    }
}
