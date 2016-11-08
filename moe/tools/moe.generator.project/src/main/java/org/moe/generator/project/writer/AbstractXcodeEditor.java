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
import org.moe.document.pbxproj.PBXShellScriptBuildPhase;
import org.moe.document.pbxproj.PBXSourcesBuildPhase;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.XCBuildConfiguration;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.util.FileTypeUtil;
import org.moe.generator.project.writer.XcodeEditor.Settings;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public abstract class AbstractXcodeEditor {

    public abstract void update(Settings settings) throws IOException;

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

    protected static PBXObjectRef<PBXBuildFile> createBuildFile(ProjectFile file,
            PBXObjectRef<PBXFileReference> fileReference) {
        final PBXBuildFile buildFile = new PBXBuildFile();
        buildFile.setFileRef(fileReference);
        final PBXObjectRef<PBXBuildFile> reference = file.createReference(buildFile);
        file.getRoot().getObjects().put(reference);
        return reference;
    }

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

    protected PBXFrameworksBuildPhase getFrameworksBuildPhaseOrNull(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXFrameworksBuildPhase.class))) {
                continue;
            }
            return (PBXFrameworksBuildPhase)ref.getReferenced();
        }
        return null;
    }

    public static void cleanupBuildSettings(PBXNativeTarget target) {
        for (PBXObjectRef<XCBuildConfiguration> ref : target.getBuildConfigurationList().getReferenced()
                .getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = ref.getReferenced();
            final Dictionary<Value, NextStep> buildSettings = buildConfiguration.getOrCreateBuildSettings();
            buildSettings.sortByKeys();
        }
    }

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

    protected String getBuildSetting(PBXNativeTarget target, String key, String defaultValue) {
        for (PBXObjectRef<XCBuildConfiguration> ref : target.getBuildConfigurationList().getReferenced()
                .getOrCreateBuildConfigurations()) {
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
        return defaultValue;
    }

    protected void setBuildSetting(PBXNativeTarget target, String key, String value) {
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
            final Value newValue = new Value(value);
            buildSettings.put(key, newValue);
        }
    }

    protected void setBuildSetting(PBXNativeTarget target, String key, Map<String, String> values) {
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

    protected void appendBuildSetting(PBXNativeTarget target, String key, String value) {
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
}
