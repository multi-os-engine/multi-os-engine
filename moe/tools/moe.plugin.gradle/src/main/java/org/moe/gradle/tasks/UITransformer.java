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
import org.gradle.api.Project;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.SupplyingTaskClosure;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UITransformer extends AbstractBaseTask {

    private static final String CONVENTION_UI_RESOURCES_DIR = "uiResourcesDir";
    private static final String CONVENTION_UI_TRANSFORMER_JAR = "uiTransformerJar";
    private static final String CONVENTION_UI_TRANSFORMER_RES = "uiTransformerRes";
    private static final String CONVENTION_LAYOUT_DIR = "layoutDir";
    private static final String CONVENTION_OUTPUT_STORYBOARD_FILE = "outputStoryboardFile";

    @Nullable
    private Object uiResourcesDir;

    @InputDirectory
    @NotNull
    public File getUiResourcesDir() {
        return getProject().file(getOrConvention(uiResourcesDir, CONVENTION_UI_RESOURCES_DIR));
    }

    @IgnoreUnused
    public void setUiResourcesDir(@Nullable Object uiResourcesDir) {
        this.uiResourcesDir = uiResourcesDir;
    }

    @Nullable
    private Object uiTransformerJar;

    @InputFile
    @NotNull
    public File getUiTransformerJar() {
        return getProject().file(getOrConvention(uiTransformerJar, CONVENTION_UI_TRANSFORMER_JAR));
    }

    @IgnoreUnused
    public void setUiTransformerJar(@Nullable Object uiTransformerJar) {
        this.uiTransformerJar = uiTransformerJar;
    }

    @Nullable
    private Object uiTransformerRes;

    @InputDirectory
    @NotNull
    public File getUiTransformerRes() {
        return getProject().file(getOrConvention(uiTransformerRes, CONVENTION_UI_TRANSFORMER_RES));
    }

    @IgnoreUnused
    public void setUiTransformerRes(@Nullable Object uiTransformerRes) {
        this.uiTransformerRes = uiTransformerRes;
    }

    @Nullable
    /* Mark this field with finally to disable customization. */
    private final Object layoutDir = null;

    @InputDirectory
    @NotNull
    public File getLayoutDir() {
        return getProject().file(getOrConvention(layoutDir, CONVENTION_LAYOUT_DIR));
    }

    /* NOTE: Disable this setter for now
    public void setLayoutDir(@Nullable Object layoutDir) {
        this.layoutDir = layoutDir;
    }
    */

    @Nullable
    /* Mark this field with finally to disable customization. */
    private final Object outputStoryboardFile = null;

    @OutputFile
    @NotNull
    public File getOutputStoryboardFile() {
        return getProject().file(getOrConvention(outputStoryboardFile, CONVENTION_OUTPUT_STORYBOARD_FILE));
    }

    /* NOTE: Disable this setter for now
    public void setOutputStoryboardFile(@Nullable Object outputStoryboardFile) {
        this.outputStoryboardFile = outputStoryboardFile;
    }
    */

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        javaexec(spec -> {
            spec.classpath(getUiTransformerJar().getAbsolutePath());
            spec.setMain("org.moe.transformer.OSXUITransformer");
            spec.args("--ixml-res-path=" + getUiResourcesDir().getAbsolutePath());
            spec.args("--out-format=storyboard");
            spec.args("--out-filename=MainUI");
            spec.args("--out-path=" + getUiResourcesDir().getAbsolutePath());
            spec.args("--uitransformer-res-path=" + getUiTransformerRes().getAbsolutePath());
        });
        if (!getOutputStoryboardFile().exists()) {
            throw new GradleException("Failed to transform .ixml to .storyboard");
        }

        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            FileList list = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());
            final String remoteStoryboard = list.add(getOutputStoryboardFile());

            // Upload
            remoteServer.upload("storyboard file", list);

            // Process
            remoteServer.exec("ibtool",
                    "ibtool " + remoteStoryboard + " " +
                            "--write " + remoteStoryboard + " " +
                            "--update-frames " +
                            "--errors --warnings --notices");

            // Download
            remoteServer.downloadFile("storyboard file", remoteStoryboard, getOutputStoryboardFile().getParentFile());

        } else {
            exec(spec -> {
                spec.setExecutable("ibtool");
                spec.args(getOutputStoryboardFile().getAbsolutePath());
                spec.args("--write", getOutputStoryboardFile().getAbsolutePath());
                spec.args("--update-frames");
                spec.args("--errors", "--warnings", "--notices");
            });
        }

        if (!getOutputStoryboardFile().exists()) {
            throw new GradleException("Storyboard can't be found after calling ibtool: " + getOutputStoryboardFile().getAbsolutePath());
        }
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(true);

        final Project project = getProject();
        final MoeSDK sdk = getMoeSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName());

        // Create task
        setDescription("Run uiTransformer (sourceset: " + sourceSet.getName() + ").");

        // Update convention mapping
        addConvention(CONVENTION_UI_RESOURCES_DIR, () -> resolvePathInProjectDir("src", "main", "resources"));
        addConvention(CONVENTION_UI_TRANSFORMER_JAR, sdk::getUITransformerJar);
        addConvention(CONVENTION_UI_TRANSFORMER_RES, sdk::getUITransformerRes);
        addConvention(CONVENTION_LAYOUT_DIR, () -> resolvePathRelativeToRoot(getUiResourcesDir(), "layout"));
        addConvention(CONVENTION_OUTPUT_STORYBOARD_FILE, () -> resolvePathRelativeToRoot(getUiResourcesDir(), "MainUI.storyboard"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "UITransformer.log"));

        // Only execute this task if the layout dir exists.
        onlyIf(new SupplyingTaskClosure<UITransformer, Boolean>(project) {
            @Override
            public Boolean doCall(UITransformer task) {
                return task.shouldRunUITransformer();
            }
        });
    }

    public boolean shouldRunUITransformer() {
        return getLayoutDir().exists();
    }
}
