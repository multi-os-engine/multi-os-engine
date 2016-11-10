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
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.PBXShellScriptBuildPhase;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.nextstep.Array.Predicate;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class XcodeEditor extends AbstractXcodeEditor {

    protected final ProjectFile projectFile;
    protected final PBXProject project;

    public XcodeEditor(InputStream stream) throws ProjectException {
        projectFile = new ProjectFile(stream);
        project = projectFile.getRoot().getRootObject().getReferenced();
    }

    public XcodeEditor(File file) throws ProjectException {
        projectFile = new ProjectFile(file);
        project = projectFile.getRoot().getRootObject().getReferenced();
    }

    public ProjectFile getProjectFile() {
        return projectFile;
    }

    public static class Settings {
        public String mainTarget;
        public String testTarget;

        public void validate() {

        }
    }

    public void update(Settings settings) throws IOException {
        settings.validate();

        configureTarget(getTarget(settings.mainTarget), false);
        final PBXNativeTarget testTarget = getTarget(settings.testTarget, true);
        if (testTarget != null) {
            configureTarget(testTarget, true);
        }

        // Remove MOE.framework references
        final List<PBXObjectRef<?>> toRemove = new ArrayList<PBXObjectRef<?>>();
        for (Entry<PBXObjectRef<? extends PBXObject>, PBXObject> entry : projectFile.getRoot().getObjects()
                .entrySet()) {
            if (entry.getValue() instanceof PBXBuildFile) {
                final PBXObjectRef<?> fileRefObjRef = ((PBXBuildFile)entry.getValue()).getFileRef();
                final PBXObject filerefobj = fileRefObjRef.getReferenced();
                if (filerefobj instanceof PBXFileReference) {
                    PBXFileReference fileref = (PBXFileReference)filerefobj;
                    if ("MOE.framework".equals(fileref.getName()) || (fileref.getPath() != null && fileref.getPath()
                            .endsWith("MOE.framework"))) {
                        toRemove.add(fileRefObjRef);
                        toRemove.add(entry.getKey());
                    }
                }
            }
        }

        for (PBXObjectRef<?> ref : toRemove) {
            projectFile.getRoot().getObjects().remove(ref);
        }
    }

    private void configureTarget(PBXNativeTarget target, boolean isTest) throws IOException {
        final String sourceSet;
        if (isTest) {
            sourceSet = "test";
        } else {
            sourceSet = "main";
        }

        // Save some important values
        final Map<String, String> MOE_PROJECT_DIR_VALUE = getBuildSetting(target, "MOE_PROJECT_DIR",
                getDebugReleaseMap("${SRCROOT}/.."));
        final Map<String, String> MOE_PROJECT_BUILD_DIR_VALUE = getBuildSetting(target, "MOE_PROJECT_BUILD_DIR",
                getDebugReleaseMap("${MOE_PROJECT_DIR}/build"));
        final Map<String, String> MOE_COPY_ANDROID_CACERTS_VALUE = getBuildSetting(target, "MOE_COPY_ANDROID_CACERTS",
                getDebugReleaseMap("NO"));

        // Remove all "MOE_" values
        removeMOEPrefixKeys(target);

        // Add all "MOE_" values
        setBuildSetting(target, "MOE_PROJECT_DIR", MOE_PROJECT_DIR_VALUE);
        setBuildSetting(target, "MOE_PROJECT_BUILD_DIR", MOE_PROJECT_BUILD_DIR_VALUE);
        setBuildSetting(target, "MOE_SECT_OAT",
                "-sectcreate __OATDATA __oatdata \"${MOE_PROJECT_BUILD_DIR}/moe/" + sourceSet
                        + "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.oat\"");
        setBuildSetting(target, "MOE_SECT_ART",
                "-sectcreate __ARTDATA __artdata \"${MOE_PROJECT_BUILD_DIR}/moe/" + sourceSet
                        + "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.art\"");

        setBuildSetting(target, "MOE_SEGPROT[sdk=iphoneos*]", "-segprot __OATDATA rx rx -segprot __ARTDATA rw rw");
        setBuildSetting(target, "MOE_SEGPROT[sdk=iphonesimulator*]",
                "-segprot __OATDATA rwx rx -segprot __ARTDATA rwx rw");

        setBuildSetting(target, "MOE_PAGEZERO[sdk=iphoneos*]", "");
        setBuildSetting(target, "MOE_PAGEZERO[sdk=iphonesimulator*]", "-pagezero_size 4096");

        setBuildSetting(target, "MOE_SDK_PATH", "${MOE_PROJECT_BUILD_DIR}/moe/sdk");
        setBuildSetting(target, "MOE_FRAMEWORK_PATH", "${MOE_SDK_PATH}/sdk/${PLATFORM_NAME}");

        setBuildSetting(target, "MOE_OTHER_LDFLAGS",
                "${MOE_SECT_OAT} ${MOE_SECT_ART} ${MOE_SEGPROT} ${MOE_PAGEZERO} ${MOE_CUSTOM_OTHER_LDFLAGS} -lstdc++ "
                        + "-framework MOE");

        setBuildSetting(target, "MOE_COPY_ANDROID_CACERTS", MOE_COPY_ANDROID_CACERTS_VALUE);

        setBuildSetting(target, "STRIP_STYLE", "non-global");
        setBuildSetting(target, "DEAD_CODE_STRIPPING", "NO");
        setBuildSetting(target, "ENABLE_BITCODE", "NO");
        setBuildSetting(target, "ONLY_ACTIVE_ARCH", getDebugReleaseMap("YES", "NO"));

        // Create build script
        final PBXShellScriptBuildPhase moeCompileBuildPhase = getOrCreateMOECompileBuildPhase(projectFile, target);
        moeCompileBuildPhase.setShellPath("/bin/bash");

        final InputStream buildScriptAsStream = XcodeEditor.class
                .getResourceAsStream("/org/moe/generator/project/moe.build.script.sh.in");
        final ResourceWriter buildScriptResourceWriter = new ResourceWriter(buildScriptAsStream);
        buildScriptResourceWriter.setPlaceholder("MOE_TARGET_SOURCESET_NAME", sourceSet);
        moeCompileBuildPhase.setShellScript(buildScriptResourceWriter.replaceAndGet());

        cleanupBuildSettings(target);
    }

    protected PBXNativeTarget getTarget(final String targetName) {
        return getTarget(targetName, false);
    }

    protected PBXNativeTarget getTarget(final String targetName, boolean nullFail) {
        final PBXObjectRef<PBXNativeTarget> objectRef = project.getOrCreateTargets()
                .find(new Predicate<PBXObjectRef<PBXNativeTarget>>() {
                    @Override
                    public boolean predicate(PBXObjectRef<PBXNativeTarget> objRef) {
                        return objRef.getReferenced().getName().equals(targetName);
                    }
                });
        if (objectRef == null) {
            if (nullFail) {
                return null;
            }
            throw new RuntimeException("Failed to find target with name '" + targetName + "'");
        }
        return objectRef.getReferenced();
    }

    protected PBXGroup getGroup(final String groupName) {
        final PBXObjectRef<? extends PBXObject> objectRef = project.getMainGroup().getReferenced().getOrCreateChildren()
                .find(new Predicate<PBXObjectRef<? extends PBXObject>>() {
                    @Override
                    public boolean predicate(PBXObjectRef<? extends PBXObject> obj) {
                        final PBXObject referenced = obj.getReferenced();
                        if (!(referenced instanceof PBXGroup)) {
                            return false;
                        }
                        final PBXGroup group = (PBXGroup)referenced;
                        if (group.getPath() == null) {
                            return false;
                        } else if (group.getPath().equals(groupName)) {
                            return true;
                        }
                        return false;
                    }
                });
        if (objectRef == null) {
            throw new RuntimeException("Failed to find group with name '" + groupName + "'");
        }
        return (PBXGroup)objectRef.getReferenced();
    }
}
