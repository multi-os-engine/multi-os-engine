/*
Copyright (C) 2017 Migeran

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
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.specs.Spec;
import org.moe.document.pbxproj.ProjectException;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.generator.project.writer.XcodeEditor.Settings;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.options.XcodeOptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UpdateXcodeSettings extends AbstractBaseTask {

    private static final Logger LOG = Logging.getLogger(UpdateXcodeSettings.class);

    private XcodeEditor xcodeEditor;

    public UpdateXcodeSettings() {
        XcodeOptions xcode = getMoeExtension().xcode;
        File xcodeFile = getProject().file(xcode.getProject());

        try {
            xcodeEditor = new XcodeEditor(xcodeFile);
        } catch (ProjectException e) {
            throw new GradleException("Could not open Xcode project for updating settings", e);
        }

        getOutputs().upToDateWhen(new Spec<Task>() {
            @Override
            public boolean isSatisfiedBy(Task task) {
                try {
                    String actVersion = xcodeEditor.getActVersion();
                    if (actVersion == null || actVersion.isEmpty()) {
                        return false;
                    }
                    if (getProject().hasProperty("moe.forced.update")) {
                        return false;
                    } else {
                        return xcodeEditor.isUpToDate();
                    }
                } catch (IOException e) {
                    throw new GradleException("Could not determine if the Xcode project up to date", e);
                }
            }
        });
    }

    @Override
    protected void run() {
        XcodeOptions xcode = getMoeExtension().xcode;

        File xcodeFile = getProject().file(xcode.getProject());

        XcodeEditor.Settings settings = new Settings();
        settings.mainTarget = xcode.getMainTarget();
        settings.testTarget = xcode.getTestTarget();
        settings.moeProject = getProject().getProjectDir();
        settings.xcodeProject = xcodeFile;
        try {
            xcodeEditor.update(settings);
            xcodeEditor.getProjectFile().save();
        } catch (IOException e) {
            throw new GradleException("Could not update Xcode project settings", e);
        }
    }

    protected final void setupMoeTask() {
        // This task is invoked manually, thus we don't need
        // to check inputs and outputs.

        setDescription("Updates Xcode project settings");

        setSupportsRemoteBuild(false);

        final Path out = Paths.get(MoePlugin.MOE);

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "XcodeUpdate.log"));
    }

}
