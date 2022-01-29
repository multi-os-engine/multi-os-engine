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
import org.gradle.api.tasks.Input;
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

    @Input
    public boolean isUseLLVM() {
        return getMoeExtension().nativeImage.isUseLLVM();
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
        settings.useLLVM = getMoeExtension().nativeImage.isUseLLVM();
        try {
            XcodeEditor xcodeEditor = new XcodeEditor(xcodeFile);
            xcodeEditor.update(settings);
            xcodeEditor.getProjectFile().save();
        } catch (ProjectException e) {
            throw new GradleException("Could not open Xcode project for updating settings", e);
        } catch (IOException e) {
            throw new GradleException("Could not update Xcode project settings", e);
        }
    }

    protected final void setupMoeTask() {
        // This task is invoked manually, thus we don't need
        // to check inputs and outputs.

        setDescription("Updates Xcode project settings");

        setSupportsRemoteBuild(false);

        // Never up-to-date as this is manual task
        getOutputs().upToDateWhen(task -> false);

        final Path out = Paths.get(MoePlugin.MOE);

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "XcodeUpdate.log"));
    }

}
