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
import org.moe.document.pbxproj.PBXBuildPhase;
import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXFrameworksBuildPhase;
import org.moe.document.pbxproj.PBXGroup;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.PBXShellScriptBuildPhase;
import org.moe.document.pbxproj.PBXSourcesBuildPhase;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.XCBuildConfiguration;
import org.moe.document.pbxproj.XCConfigurationList;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.util.FileTypeUtil;
import org.moe.generator.project.writer.XcodeEditor.Settings;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Base class for Xcode editors.
 */
public abstract class AbstractXcodeEditor {

    /**
     * Updates an Xcode project with the specified settings.
     *
     * @param settings Settings to update with
     * @throws IOException if an I/O error occurs
     */
    public abstract void update(Settings settings) throws IOException;

    /**
     * Creates a new PBXFileReference reference.
     *
     * @param file       Project file
     * @param name       File name
     * @param filePath   File path
     * @param sourceTree Source tree
     * @return New PBXFileReference reference
     */
    protected static PBXObjectRef<PBXFileReference> createFileReference(ProjectFile file, String name, String filePath,
            String sourceTree) {
        final PBXFileReference fileReference = new PBXFileReference();
        fileReference.setLastKnownFileType(FileTypeUtil.getFileType(filePath));
        fileReference.setPath(filePath);
        if (name != null) {
            fileReference.setName(name);
        }
        if (sourceTree != null) {
            fileReference.setSourceTree(sourceTree);
        }
        final PBXObjectRef<PBXFileReference> reference = file.createReference(fileReference);
        file.getRoot().getObjects().put(reference);
        return reference;
    }

    /**
     * Creates a new PBXBuildFile reference.
     *
     * @param file          Project file
     * @param fileReference PBXFileReference reference
     * @return New PBXBuildFile reference
     */
    protected static PBXObjectRef<PBXBuildFile> createBuildFile(ProjectFile file,
            PBXObjectRef<PBXFileReference> fileReference) {
        final PBXBuildFile buildFile = new PBXBuildFile();
        buildFile.setFileRef(fileReference);
        final PBXObjectRef<PBXBuildFile> reference = file.createReference(buildFile);
        file.getRoot().getObjects().put(reference);
        return reference;
    }

    /**
     * Gets or creates a new PBXSourcesBuildPhase.
     *
     * @param file   Project file
     * @param target Native target to search in/add the phase to
     * @return A PBXSourcesBuildPhase
     */
    protected PBXSourcesBuildPhase getOrCreateSourcesBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXSourcesBuildPhase.class))) {
                continue;
            }
            return (PBXSourcesBuildPhase)ref.getReferenced();
        }
        final PBXSourcesBuildPhase phase = new PBXSourcesBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().put(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }

    /**
     * Gets or creates a new MOE specific PBXShellScriptBuildPhase.
     *
     * @param file   Project file
     * @param target Native target to search in/add the phase to
     * @return MOE specific PBXShellScriptBuildPhase
     */
    protected PBXShellScriptBuildPhase getOrCreateMOECompileBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXShellScriptBuildPhase.class))) {
                continue;
            }
            final PBXShellScriptBuildPhase referenced = (PBXShellScriptBuildPhase)ref.getReferenced();
            if (!"Compile Sources (MOE)".equals(referenced.getName())) {
                continue;
            }
            return (PBXShellScriptBuildPhase)ref.getReferenced();
        }
        final PBXShellScriptBuildPhase phase = new PBXShellScriptBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        phase.getOrCreateInputPaths();
        phase.getOrCreateOutputPaths();
        phase.setName("Compile Sources (MOE)");
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().put(reference);
        target.getBuildPhasesOrNull().add(0, reference);
        return phase;
    }

    /**
     * Gets the first PBXFrameworksBuildPhase from the specified target.
     *
     * @param target Native target to search in
     * @return PBXFrameworksBuildPhase or <code>null</code>
     */
    protected PBXFrameworksBuildPhase getFrameworksBuildPhaseOrNull(PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXFrameworksBuildPhase.class))) {
                continue;
            }
            return (PBXFrameworksBuildPhase)ref.getReferenced();
        }
        return null;
    }

    /**
     * Clean op build settings in the specified target.
     *
     * @param target Target to clean up the build settings in
     */
    public static void cleanupBuildSettings(PBXNativeTarget target) {
        cleanupBuildSettings(target.getBuildConfigurationList().getReferenced());
    }

    /**
     * Clean op build settings in the project.
     *
     * @param project Project to clean up the build settings in
     */
    public static void cleanupBuildSettings(PBXProject project) {
        cleanupBuildSettings(project.getBuildConfigurationList().getReferenced());
    }

    /**
     * Clean op build settings in the specified configuration list.
     *
     * @param configuretionList Configuration list to clean up the build settings in
     */
    private static void cleanupBuildSettings(XCConfigurationList configuretionList) {
        for (PBXObjectRef<XCBuildConfiguration> ref : configuretionList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            buildSettings.sortByKeys();
        }
    }

    /**
     * Gets or creates a subgroup in the specified group.
     *
     * @param file  Project file
     * @param group Parent group
     * @param name  Child group name
     * @return The child group
     */
    protected PBXGroup getOrCreateSubGroup(ProjectFile file, PBXGroup group, String name) {
        for (PBXObjectRef<? extends PBXObject> ref : group.getOrCreateChildren()) {
            final PBXObject object = ref.getReferenced();
            if (object instanceof PBXGroup) {
                PBXGroup child = (PBXGroup)object;
                if (name.equals(child.getName())) {
                    return child;
                }
            }
        }
        final PBXGroup child = new PBXGroup();
        child.setName(name);
        child.setSourceTree("<group>");
        child.getOrCreateChildren();
        final PBXObjectRef<PBXGroup> reference = file.createReference(child);
        file.getRoot().getObjects().put(reference);
        group.getChildrenOrNull().add(reference);
        return child;
    }

    /**
     * Removes all build settings with 'MOE_' prefix from the specified target.
     *
     * @param target Target to remove the build settings from
     */
    protected void removeMOEPrefixKeys(PBXNativeTarget target) {
        for (PBXObjectRef<XCBuildConfiguration> ref : target.getBuildConfigurationList().getReferenced()
                .getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.startsWith("MOE_")) {
                    iterator.remove();
                }
            }
        }
    }

    /**
     * Creates a map for Debug and Release configurations with the same value.
     *
     * @param value Value for both configurations
     * @return Configuration map object
     */
    public static Map<String, String> getDebugReleaseMap(String value) {
        return getDebugReleaseMap(value, value);
    }

    /**
     * Creates a map for separate Debug and Release configuration values.
     *
     * @param debugValue   Debug value
     * @param releaseValue Release value
     * @return Configuration map object
     */
    public static Map<String, String> getDebugReleaseMap(String debugValue, String releaseValue) {
        if (debugValue == null) {
            throw new NullPointerException();
        }
        if (releaseValue == null) {
            throw new NullPointerException();
        }
        final Map<String, String> map = new HashMap<String, String>();
        map.put("Debug", debugValue);
        map.put("Release", releaseValue);
        return map;
    }

    /**
     * Returns the value from a target for the specified build setting.
     *
     * @param target       Target to get build settings from
     * @param key          Build settings key
     * @param defaultValue Default value for key
     * @return Value map for key or default value
     */
    public static Map<String, String> getBuildSetting(PBXNativeTarget target, String key,
            Map<String, String> defaultValue) {
        return getBuildSetting(target.getBuildConfigurationList().getReferenced(), key, defaultValue);
    }

    /**
     * Returns the value from a project for the specified build setting.
     *
     * @param project      Target to get build settings from
     * @param key          Build settings key
     * @param defaultValue Default value for key
     * @return Value map for key or default value
     */
    public static Map<String, String> getBuildSetting(PBXProject project, String key,
            Map<String, String> defaultValue) {
        return getBuildSetting(project.getBuildConfigurationList().getReferenced(), key, defaultValue);
    }

    /**
     * Returns the value from a configuration list for the specified build setting.
     *
     * @param configurationList Configuration list to get build settings from
     * @param key               Build settings key
     * @param defaultValue      Default value for key
     * @return Value map for key or default value
     */
    private static Map<String, String> getBuildSetting(XCConfigurationList configurationList, String key,
            Map<String, String> defaultValue) {
        final Map<String, String> map = new HashMap<String, String>();
        for (PBXObjectRef<XCBuildConfiguration> ref : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals(key)) {
                    final NextStep value = entry.getValue();
                    if (value instanceof Value) {
                        map.put(buildConfiguration.getName(), ((Value)value).value);
                    }
                }
            }
        }
        if (defaultValue != null) {
            for (Entry<String, String> entry : defaultValue.entrySet()) {
                if (!map.containsKey(entry.getKey())) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return map;
    }

    /**
     * Returns the value from a project for the specified build setting.
     *
     * @param project      Target to get build settings from
     * @param key          Build settings key
     * @return String value
     */
    public static String getBuildSettingValue(PBXProject project, String key) {
        return getBuildSettingValue(project.getBuildConfigurationList().getReferenced(), key);
    }

    /**
     * Returns the value from a configuration list for the specified build setting.
     *
     * @param configurationList Configuration list to get build settings from
     * @param key               Build settings key
     * @return String value
     */
    private static String getBuildSettingValue(XCConfigurationList configurationList, String key) {
        final Map<String, String> map = new HashMap<String, String>();
        for (PBXObjectRef<XCBuildConfiguration> ref : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals(key)) {
                    final NextStep value = entry.getValue();
                    if (value instanceof Value) {
                        return ((Value)value).value;
                    }
                }
            }
        }
        return null;
    }

    public static void checkFrameWorkSearchPaths(PBXNativeTarget target) {
        XCConfigurationList configurationList = target.getBuildConfigurationList().getReferenced();
        for (PBXObjectRef<XCBuildConfiguration> ref : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();

            Array frameworkSearchPaths = null;
            Value moeFrameworkPath = new Value("${MOE_FRAMEWORK_PATH}");

            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals("FRAMEWORK_SEARCH_PATHS")) {
                    final NextStep value = entry.getValue();
                    if (!(value instanceof Array)) {
                        buildSettings.remove(existingKey);
                    } else {
                        frameworkSearchPaths = (Array)value;
                    }
                }
            }

            if (frameworkSearchPaths != null) {
                // No longer needed
                frameworkSearchPaths.remove(moeFrameworkPath);
            }
        }
    }

    protected static void checkSettingsAppend(PBXNativeTarget target, final String key, final String appendValue) {
        XCConfigurationList configurationList = target.getBuildConfigurationList().getReferenced();
        for (PBXObjectRef<XCBuildConfiguration> ref : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();

            Value inherited = new Value("$(inherited)");
            Value appendedValue = new Value(appendValue);
            Array currentValues = null;

            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals(key)) {
                    final NextStep value = entry.getValue();

                    if (!(value instanceof Array)) {
                        currentValues = new Array();
                        currentValues.add(value);
                        buildSettings.remove(existingKey);
                        buildSettings.put(existingKey, currentValues);
                    } else {
                        currentValues = (Array) value;
                    }
                }
            }
            if (currentValues == null) {
                currentValues = new Array();
                buildSettings.put(new Value(key), currentValues);
            }
            if (!currentValues.contains(inherited)) {
                currentValues.add(inherited);
            }
            if (!currentValues.contains(appendedValue)) {
                currentValues.add(appendedValue);
            }
        }
    }

    public static void checkHeaderSearchPaths(PBXNativeTarget target) {
        checkSettingsAppend(target, "HEADER_SEARCH_PATHS", "${MOE_HEADER_SEARCH_PATHS}");
    }

    public static void checkOtherLDFlags(PBXNativeTarget target) {
        checkSettingsAppend(target, "OTHER_LDFLAGS", "${MOE_OTHER_LDFLAGS}");
    }

    /**
     * Sets the value for the specified build setting.
     *
     * @param target Target to get build settings from
     * @param key    Build settings key
     * @param value  Value for key
     */
    public static void setBuildSetting(PBXNativeTarget target, String key, String value) {
        setBuildSetting(target.getBuildConfigurationList().getReferenced(), key, value);
    }

    /**
     * Sets the value for the specified build setting.
     *
     * @param project Project to get build settings from
     * @param key     Build settings key
     * @param value   Value for key
     */
    public static void setBuildSetting(PBXProject project, String key, String value) {
        setBuildSetting(project.getBuildConfigurationList().getReferenced(), key, value);
    }

    /**
     * Sets the value for the specified build setting.
     *
     * @param configurationList Project to get build settings from
     * @param key               Build settings key
     * @param value             Value for key
     */
    private static void setBuildSetting(XCConfigurationList configurationList, String key, String value) {
        for (PBXObjectRef<XCBuildConfiguration> ref : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals(key) || existingKey.value.startsWith(key + "[")) {
                    iterator.remove();
                }
            }
            final Value newValue = new Value(value);
            buildSettings.put(key, newValue);
        }
    }

    /**
     * Sets the value for the specified build setting.
     *
     * @param target Target to get build settings from
     * @param key    Build settings key
     * @param values Configuration specific values for key
     */
    public static void setBuildSetting(PBXNativeTarget target, String key, Map<String, String> values) {
        for (PBXObjectRef<XCBuildConfiguration> ref : target.getBuildConfigurationList().getReferenced()
                .getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            for (Iterator<Entry<Value, NextStep>> iterator = buildSettings.entrySet().iterator(); iterator
                    .hasNext(); ) {
                final Entry<Value, NextStep> entry = iterator.next();
                Value existingKey = entry.getKey();
                if (existingKey.value.equals(key) || existingKey.value.startsWith(key + "[")) {
                    iterator.remove();
                }
            }
            final String value = values.get(buildConfiguration.getName());
            if (value != null) {
                final Value newValue = new Value(value);
                buildSettings.put(key, newValue);
            }
        }
    }

    /**
     * Appends the specified value to the build setting.
     *
     * @param target Target to get build settings from
     * @param key    Build settings key
     * @param value  Value for key
     */
    public static void appendBuildSetting(PBXNativeTarget target, String key, String value) {
        for (PBXObjectRef<XCBuildConfiguration> ref : target.getBuildConfigurationList().getReferenced()
                .getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();

            final NextStep nextStep = buildSettings.get(key);
            if (nextStep != null) {
                if (nextStep instanceof Array) {
                    @SuppressWarnings("unchecked") Array<NextStep> array = (Array<NextStep>)nextStep;
                    array.add(new Value(value));
                } else if (nextStep instanceof Value) {
                    final Array<NextStep> array = new Array<NextStep>();
                    array.add(nextStep);
                    array.add(new Value(value));
                    buildSettings.put(key, array);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                final Array<NextStep> array = new Array<NextStep>();
                buildSettings.put(key, array);
                array.add(new Value(value));
            }
        }
    }

    /**
     * Returns the relative path of the specified path compared to the base path.
     *
     * @param base Base path
     * @param path Other path
     * @return Relative path
     * @throws IOException if an error occurs
     */
    public static String getRelativePath(File base, File path) throws IOException {
        String a = base.toURI().getPath();
        String b = path.toURI().getPath();

        if (a.equals(b)) {
            return "";
        }

        String[] basePaths = a.split("/");
        String[] otherPaths = b.split("/");
        int n = 0;
        for (; n < basePaths.length && n < otherPaths.length; n++) {
            if (!basePaths[n].equals(otherPaths[n])) break;
        }
        StringBuilder tmp = new StringBuilder("../");
        for (int m = n; m < basePaths.length - 1; m++)
            tmp.append("../");
        for (int m = n; m < otherPaths.length; m++) {
            tmp.append(otherPaths[m]);
            tmp.append("/");
        }

        return tmp.toString();
    }
}
