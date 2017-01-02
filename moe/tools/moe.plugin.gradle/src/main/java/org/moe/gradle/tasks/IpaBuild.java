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

package org.moe.gradle.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Map;

public class IpaBuild extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_APP = "inputApp";
    private static final String CONVENTION_OUTPUT_IPA = "outputIpa";

    @Nullable
    private Object inputApp;

    @InputDirectory
    @Optional
    @Nullable
    public File getInputApp() {
        final Object inputApp = nullableGetOrConvention(this.inputApp, CONVENTION_INPUT_APP);
        if (inputApp == null) {
            return null;
        }
        return getProject().file(inputApp);
    }

    @IgnoreUnused
    public void setInputApp(@Nullable Object inputApp) {
        this.inputApp = inputApp;
    }

    @Nullable
    private Object outputIpa;

    @OutputFile
    @NotNull
    public File getOutputIpa() {
        return getProject().file(getOrConvention(outputIpa, CONVENTION_OUTPUT_IPA));
    }

    @IgnoreUnused
    public void setOutputIpa(@Nullable Object outputIpa) {
        this.outputIpa = outputIpa;
    }

    @NotNull
    private final String ipaBuildTaskDate = new Date().toString();

    @Input
    @NotNull
    @IgnoreUnused
    public String getIpaBuildTaskDate() {
        // NOTE: never allow Gradle to skip this task due to incremental build!!!
        return ipaBuildTaskDate;
    }

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        final Server remoteServer = getMoePlugin().getRemoteServer();
        final File inputApp = Require.nonNull(getInputApp());
        if (remoteServer != null) {
            final Path ipaRel;
            try {
                ipaRel = getInnerProjectRelativePath(getOutputIpa());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteIpa = remoteServer.getRemotePath(ipaRel);

            // Upload project
            final FileList list = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());
            final String remoteApp = list.add(inputApp);

            // NOTE: do not re-upload the files, incremental builds are disabled for remotely executed tasks, the
            // files are guarantied to be there. Also, enabling this would possibly break the signed files.
            // remoteServer.upload("application files", list);

            remoteServer.exec("PackageApplication", "" +
                    "xcrun -sdk iphoneos PackageApplication -v '" + remoteApp + "' -o '" + remoteIpa + "'");

            remoteServer.downloadFile("ipa file", remoteIpa, getOutputIpa().getParentFile());

        } else {
            exec(spec -> {
                // Set executable
                spec.setExecutable("xcrun");

                // Set options
                spec.args("-sdk", "iphoneos");
                spec.args("PackageApplication");
                spec.args("-v", inputApp.getAbsolutePath());
                spec.args("-o", getOutputIpa().getAbsolutePath());
            });
        }
    }

    private XcodeBuild xcodeBuildTaskDep;

    @NotNull
    @IgnoreUnused
    public XcodeBuild getXcodeBuildTaskDep() {
        return Require.nonNull(xcodeBuildTaskDep);
    }

    protected final void setupMoeTask() {
        setSupportsRemoteBuild(true);

        final MoeExtension ext = getMoeExtension();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE);

        setDescription("Builds .ipa file.");

        // Add dependencies
        final XcodeBuild xcodeBuildTask = getMoePlugin().getTaskBy(XcodeBuild.class,
                TaskUtils.getSourceSet(getMoePlugin(), SourceSet.MAIN_SOURCE_SET_NAME),
                Mode.RELEASE,
                ext.getPlatformType());
        xcodeBuildTaskDep = xcodeBuildTask;
        dependsOn(xcodeBuildTask);

        // Update convention mapping
        addConvention(CONVENTION_INPUT_APP, () -> {
            final Map<String, String> buildSettings = xcodeBuildTask.getNullableXcodeBuildSettings();
            if (buildSettings == null) {
                return null;
            }
            final String sym = xcodeBuildTask.getConfigurationBuildDir().getAbsolutePath();
            final String productName = buildSettings.get("PRODUCT_NAME");
            return Paths.get(sym, productName + ".app").toFile();
        });
        addConvention(CONVENTION_OUTPUT_IPA, () -> {
            final Map<String, String> buildSettings = xcodeBuildTask.getXcodeBuildSettings();
            final String productName = buildSettings.get("PRODUCT_NAME");
            return resolvePathInBuildDir(productName + ".ipa");
        });
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "IpaBuild.log"));
    }
}
