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
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Xcode editor for generic Xcode project changes. This class is used for updating an Xcode project.
 */
public class XcodeEditor extends AbstractXcodeEditor {

    /**
     * Xcode project file.
     */
    protected final ProjectFile projectFile;
    /**
     * Xcode project.
     */
    protected final PBXProject project;

    /**
     * This is the name of the build setting that stores the version of the Xcode project.
     */
    private final String MOE_VERSION = "MOE_VERSION";

    /**
     * Field storing whether the Xcode project is up to date.
     */
    private AtomicBoolean isUpToDate;

    /**
     * Creates a new XcodeEditor instance.
     *
     * @param stream Stream to read Xcode project from
     * @throws ProjectException if an error occurs
     */
    public XcodeEditor(InputStream stream) throws ProjectException {
        projectFile = new ProjectFile(stream);
        project = projectFile.getRoot().getRootObject().getReferenced();
    }

    /**
     * Creates a new XcodeEditor instance.
     *
     * @param file File to read Xcode project from
     * @throws ProjectException if an error occurs
     */
    public XcodeEditor(File file) throws ProjectException {
        projectFile = new ProjectFile(file);
        project = projectFile.getRoot().getRootObject().getReferenced();
    }

    /**
     * Returns the Xcode project file.
     *
     * @return Xcode project file
     */
    public ProjectFile getProjectFile() {
        return projectFile;
    }

    public String getActVersion() {
        return getBuildSettingValue(project, MOE_VERSION);
    }

    /**
     * Returns whether the project is up to date.
     *
     * @return Whether the Xcode project is up to date.
     * @throws IOException if an I/O error occurs
     */
    public boolean isUpToDate() throws IOException {
        if (isUpToDate != null) {
            return isUpToDate.get();
        }

        isUpToDate = new AtomicBoolean();

        String expectedVersion = getExpectedVersion();

        Map<String, String> versionSettings = getBuildSetting(project, MOE_VERSION, null);
        if (versionSettings.size() !=
                project.getBuildConfigurationList().getReferenced().getOrCreateBuildConfigurations().size()) {
            isUpToDate.set(false);
        } else {
            isUpToDate.set(true);
            for (String version : versionSettings.values()) {
                if (!expectedVersion.equals(version)) {
                    isUpToDate.set(false);
                    break;
                }
            }
        }

        return isUpToDate.get();
    }

    /**
     * Settings for configuring the XcodeEditor.
     */
    public static class Settings {
        /**
         * Main target name.
         */
        public String mainTarget;
        /**
         * Test target name.
         */
        public String testTarget;
        /**
         * MOE project path.
         */
        public File moeProject;
        /**
         * Xcode project path.
         */
        public File xcodeProject;

        /**
         * Validates the fields.
         */
        public void validate() {
            if (mainTarget == null) {
                throw new NullPointerException("mainTarget is null");
            }
            if (moeProject == null) {
                throw new NullPointerException("moeProject is null");
            }
            if (xcodeProject == null) {
                throw new NullPointerException("xcodeProject is null");
            }
        }
    }

    @Override
    public void update(Settings settings) throws IOException {
        settings.validate();

        configureProject();

        configureTarget(getTarget(settings.mainTarget), settings, false);
        final PBXNativeTarget testTarget = getTarget(settings.testTarget, true);
        if (testTarget != null) {
            configureTarget(testTarget, settings, true);
        }

        // Remove MOE.framework references
        final List<PBXObjectRef<?>> toRemove = new ArrayList<PBXObjectRef<?>>();
        for (Entry<PBXObjectRef<? extends PBXObject>, PBXObject> entry : projectFile.getRoot().getObjects()
                .entrySet()) {
            if (entry.getValue() instanceof PBXBuildFile) {
                final PBXObjectRef<?> fileRefObjRef = ((PBXBuildFile)entry.getValue()).getFileRef();
                if (fileRefObjRef == null) {
                    toRemove.add(entry.getKey());
                    continue;
                }
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

    /**
     * Retrieves the expected Xcode settings version.
     *
     * @return The expected Xcode settings version.
     * @throws IOException if an I/O error occurs
     */
    private String getExpectedVersion() throws IOException {
        final Properties props = new Properties();
        props.load(getClass().getResourceAsStream("/org/moe/generator/project/moe.properties"));
        return props.getProperty("MOE-Xcode-Version");
    }

    /**
     * Makes the Xcode project up to date by setting the version.
     */
    private void setAsUpToDate() throws IOException {
        String expectedVersion = getExpectedVersion();
        setBuildSetting(project, MOE_VERSION, expectedVersion);
        if (isUpToDate == null) {
            isUpToDate = new AtomicBoolean();
        }
        isUpToDate.set(true);
    }

    /**
     * Configures the project.
     *
     * @throws IOException if an I/O error occurs
     */
    private void configureProject() throws IOException {
        setAsUpToDate();
        cleanupBuildSettings(project);

        // Disable i386 build for simulators
        setBuildSetting(project, "EXCLUDED_ARCHS[sdk=iphonesimulator*]", "i386");
    }

    /**
     * Configures the specified target.
     *
     * @param target   Target to configure
     * @param settings Settings
     * @param isTest   Is test target flag
     * @throws IOException if an I/O error occurs
     */
    private void configureTarget(PBXNativeTarget target, Settings settings, boolean isTest) throws IOException {
        final String sourceSet;
        if (isTest) {
            sourceSet = "test";
        } else {
            sourceSet = "main";
        }

        final String moeProjectPath =
                "${SRCROOT}/" + (getRelativePath(settings.xcodeProject.getParentFile().getAbsoluteFile(),
                        settings.moeProject.getAbsoluteFile()));

        // Save some important values
        final Map<String, String> MOE_PROJECT_DIR_VALUE = getBuildSetting(target, "MOE_PROJECT_DIR",
                getDebugReleaseMap(moeProjectPath));
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

        setBuildSetting(target, "MOE_SEGPROT", "-segprot __OATDATA rx rx -segprot __ARTDATA rw rw");
        setBuildSetting(target, "MOE_SEGPROT[arch=x86_64]",
                "-segprot __OATDATA rwx rx -segprot __ARTDATA rwx rw");

        setBuildSetting(target, "MOE_PAGEZERO", "");
        setBuildSetting(target, "MOE_PAGEZERO[arch=x86_64]", "-pagezero_size 4096");

        setBuildSetting(target, "MOE_SDK_PATH", "${MOE_PROJECT_BUILD_DIR}/moe/sdk");
        setBuildSetting(target, "MOE_FRAMEWORK_PATH", "${MOE_SDK_PATH}/sdk/${PLATFORM_NAME}");

        setBuildSetting(target, "MOE_OTHER_LDFLAGS",
                "${MOE_SECT_OAT} ${MOE_SECT_ART} ${MOE_SEGPROT} ${MOE_PAGEZERO} ${MOE_CUSTOM_OTHER_LDFLAGS} -lc++ "
                        + "-framework MOE");

        setBuildSetting(target, "MOE_COPY_ANDROID_CACERTS", MOE_COPY_ANDROID_CACERTS_VALUE);

        setBuildSetting(target, "MOE_JAVA_VERSION_OVERRIDE", "");

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

        //Check FRAMEWORK_SEARCH_PATHS
        checkFrameWorkSearchPaths(target);

        //Check OTHER_LDFLAGS
        checkOtherLDFlags(target);

        cleanupBuildSettings(target);
    }

    /**
     * Returns the target for the specified name.
     *
     * @param targetName Target to look for
     * @return Target or null
     */
    protected PBXNativeTarget getTarget(final String targetName) {
        return getTarget(targetName, false);
    }

    /**
     * Returns the target for the specified name.
     *
     * @param targetName Target to look for
     * @param nullFail   Flag for failing on not found targets
     * @return Target or null
     */
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

    /**
     * Returns the group for the specified name.
     *
     * @param groupName Group to look for
     * @return Group
     */
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
