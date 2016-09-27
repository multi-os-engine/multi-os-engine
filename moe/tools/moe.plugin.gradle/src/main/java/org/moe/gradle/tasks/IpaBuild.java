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
import org.gradle.api.tasks.InputDirectory;
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

public class IpaBuild extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_APP = "inputApp";
    private static final String CONVENTION_OUTPUT_IPA = "outputIpa";

    @Nullable
    private Object inputApp;

    @InputDirectory
    @NotNull
    public File getInputApp() {
        return getProject().file(getOrConvention(inputApp, CONVENTION_INPUT_APP));
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

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        final Server remoteServer = getMoePlugin().getRemoteServer();
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
            final String remoteApp = list.add(getInputApp());

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
                spec.args("-v", getInputApp().getAbsolutePath());
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
            final String sym = xcodeBuildTask.getConfigurationBuildDir().getAbsolutePath();
            return Paths.get(sym, ext.xcode.getMainProductName() + ".app").toFile();
        });
        addConvention(CONVENTION_OUTPUT_IPA, () -> resolvePathInBuildDir(ext.xcode.getMainProductName() + ".ipa"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "IpaBuild.log"));
    }
}
