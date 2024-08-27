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

package org.moe.generator.project.writer;

import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXGroup;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXSourcesBuildPhase;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Value;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Xcode editor for Xcode template project changes.
 */
public class XcodeTemplateEditor extends XcodeEditor {

    /**
     * Creates a new XcodeEditor instance.
     *
     * @param stream Stream to read Xcode project from
     * @throws ProjectException if an error occurs
     */
    public XcodeTemplateEditor(InputStream stream) throws ProjectException {
        super(stream);
    }

    /**
     * Creates a new XcodeEditor instance.
     *
     * @param file File to read Xcode project from
     * @throws ProjectException if an error occurs
     */
    public XcodeTemplateEditor(File file) throws ProjectException {
        super(file);
    }

    /**
     * Xcode project template settings.
     */
    public static class Settings extends XcodeEditor.Settings {
        /**
         * Project name.
         */
        public String projectName;
        /**
         * Organization name.
         */
        public String organizationName;
        /**
         * Bundle ID.
         */
        public String bundleID;

        @Override
        public void validate() {
            mainTarget = projectName;
            testTarget = projectName + "-Test";
            super.validate();
        }
    }

    /**
     * Updates an Xcode project with the specified settings.
     *
     * @param settings Settings to update with
     * @throws IOException if an I/O error occurs
     */
    public void update(Settings settings) throws IOException {
        settings.validate();

        project.getOrCreateAttributes().put("ORGANIZATIONNAME", new Value(settings.organizationName));

        configureTarget(settings, getTarget("__main_target__"), getGroup("__main_target__"), false);
        configureTarget(settings, getTarget("__test_target__"), getGroup("__test_target__"), true);

        super.update(settings);
    }

    /**
     * Configures the specified target.
     *
     * @param settings Settings
     * @param target   Target to configure
     * @param group    Target's group
     * @param isTest   Is test target flag
     * @throws IOException if an I/O error occurs
     */
    private void configureTarget(Settings settings, PBXNativeTarget target, PBXGroup group, boolean isTest)
            throws IOException {
        final String suffix;
        if (isTest) {
            suffix = "-Test";
        } else {
            suffix = "";
        }

        final String projectName = settings.projectName + suffix;
        group.setPath(projectName);
        target.setName(projectName);
        target.setProductName(projectName);
        target.getProductReference().getReferenced().setPath(projectName + ".app");

        setBuildSetting(target, "INFOPLIST_FILE", projectName + "/Info.plist");
        setBuildSetting(target, "PRODUCT_BUNDLE_IDENTIFIER", settings.bundleID + suffix);

        appendBuildSetting(target, "FRAMEWORK_SEARCH_PATHS", "$(inherited)");
        appendBuildSetting(target, "FRAMEWORK_SEARCH_PATHS", "${MOE_FRAMEWORK_PATH}");

        appendBuildSetting(target, "OTHER_LDFLAGS", "$(inherited)");
        appendBuildSetting(target, "OTHER_LDFLAGS", "${MOE_OTHER_LDFLAGS}");

        final PBXGroup supportingFiles = getOrCreateSubGroup(projectFile, group, "Supporting Files");
        final Array<PBXObjectRef<? extends PBXObject>> supportingFilesChildren = supportingFiles.getOrCreateChildren();

        // Create main.cpp file reference
        final PBXObjectRef<PBXFileReference> mainCppFileRef = createFileReference(projectFile, null, "main.cpp",
                "<group>");
        supportingFilesChildren.add(mainCppFileRef);

        // Create main.cpp build file
        final PBXObjectRef<PBXBuildFile> mainCppBuildFile = createBuildFile(projectFile, mainCppFileRef);

        final PBXSourcesBuildPhase sourcesBuildPhase = getOrCreateSourcesBuildPhase(projectFile, target);
        sourcesBuildPhase.getOrCreateFiles().add(mainCppBuildFile);

        cleanupBuildSettings(target);
    }
}
