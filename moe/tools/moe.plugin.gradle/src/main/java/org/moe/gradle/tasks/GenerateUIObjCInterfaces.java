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
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXBuildPhase;
import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXGroup;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.PBXSourcesBuildPhase;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.Root;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.natj.IBActionAndOutletComposer;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class GenerateUIObjCInterfaces extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_OUTPUT_SOURCE = "outputSource";
    private static final String CONVENTION_XCODE_PROJECT_FILE = "xcodeProjectFile";

    @Nullable private Set<Object> inputFiles;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getInputFiles() {
        return getProject().files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES));
    }

    @IgnoreUnused
    public void setInputFiles(@Nullable Collection<Object> inputFiles) {
        this.inputFiles = inputFiles == null ? null : new HashSet<>(inputFiles);
    }

    @Nullable private Object outputSource;

    @OutputFile
    @NotNull
    public File getOutputSource() {
        return getProject().file(getOrConvention(outputSource, CONVENTION_OUTPUT_SOURCE));
    }

    @IgnoreUnused
    public void setOutputSource(@Nullable Object outputSource) {
        this.outputSource = outputSource;
    }

    @Nullable private Object xcodeProjectFile;

    @InputDirectory
    @NotNull
    public File getXcodeProjectFile() {
        return getProject().file(getOrConvention(xcodeProjectFile, CONVENTION_XCODE_PROJECT_FILE));
    }

    @IgnoreUnused
    public void setXcodeProjectFile(@Nullable Object xcodeProjectFile) {
        this.xcodeProjectFile = xcodeProjectFile;
    }

    @Override
    protected void run() {
        // Reset logs
        FileUtils.write(getLogFile(), "");

        final IBActionAndOutletComposer composer = new IBActionAndOutletComposer();
        FileUtils.classAndJarInputIterator(getProject(), getInputFiles(), composer::read);
        final String composition = composer.compose();

        // Save to file
        FileUtils.write(getOutputSource(), composition);

        // Check whether Xcode project contains this file
        if (System.getenv("XCODE_VERSION_ACTUAL") != null) {
            getLogger().warn("Skipping Xcode project update in task " + getName()
                    + " because build was started from Xcode");
            return;
        }
        try {
            ProjectFile file = new ProjectFile(getXcodeProjectFile());
            final Root fileRoot = file.getRoot();
            final PBXProject rootObject = fileRoot.getRootObject().getReferenced();
            final PBXGroup mainGroup = rootObject.getMainGroup().getReferenced();
            final String mainTargetName = getMoeExtension().xcode.getMainTarget();

            // Locate main target
            PBXObjectRef<PBXNativeTarget> mainTarget = rootObject.getOrCreateTargets().find(obj -> {
                if (obj == null) return false;
                final PBXNativeTarget refd = obj.getReferenced();
                return refd != null && mainTargetName.equals(refd.getName());
            });
            if (mainTarget == null) {
                throw new RuntimeException("Failed to locate target named '" + mainTargetName + "'");
            }

            // Locate compile sources build phase
            @SuppressWarnings("unchecked") PBXObjectRef<PBXSourcesBuildPhase> sourcesBP = (PBXObjectRef)mainTarget
                    .getReferenced().getBuildPhasesOrNull().find(obj -> {
                        if (obj == null) return false;
                        final PBXBuildPhase refd = obj.getReferenced();
                        if (refd == null) return false;
                        return refd instanceof PBXSourcesBuildPhase;
                    });
            if (sourcesBP == null) {
                throw new RuntimeException("Failed to locate the sources build phase");
            }

            // Search for the 'Multi-OS Engine' group and create it on demand
            @SuppressWarnings("unchecked") PBXObjectRef<PBXGroup> groupRef = (PBXObjectRef<PBXGroup>)mainGroup
                    .getOrCreateChildren().find(obj -> {
                        if (obj == null) return false;
                        final PBXObject refd = obj.getReferenced();
                        if (refd == null) return false;
                        if (refd instanceof PBXGroup) {
                            PBXGroup grp = (PBXGroup)refd;
                            return "Multi-OS Engine".equals(grp.getName());
                        }
                        return false;
                    });
            if (groupRef == null) {
                groupRef = file.newPBXGroup("Multi-OS Engine", null, "<group>");
                file.getRoot().getObjects().put(groupRef);
                mainGroup.getChildrenOrNull().add(groupRef);
            }

            // Calculate relative path to output source from SRCROOT
            final Path relativePath = getXcodeProjectFile().getParentFile().toPath()
                    .relativize(getOutputSource().toPath());
            final String relativePathString = relativePath.toString();

            // Search for the generated file's file reference and create it on demand
            @SuppressWarnings("unchecked") PBXObjectRef<PBXFileReference> fileRef = (PBXObjectRef<PBXFileReference>)groupRef
                    .getReferenced().getOrCreateChildren().find(obj -> {
                        if (obj == null) return false;
                        final PBXObject refd = obj.getReferenced();
                        if (refd == null) return false;
                        if (refd instanceof PBXFileReference) {
                            PBXFileReference grp = (PBXFileReference)refd;
                            return relativePathString.equals(grp.getPath());
                        }
                        return false;
                    });
            if (fileRef == null) {
                fileRef = file.newPBXFileReference(null, "sourcecode.c.objc", null, getOutputSource().getName(),
                        relativePathString, "<group>");
                file.getRoot().getObjects().put(fileRef);
                groupRef.getReferenced().getChildrenOrNull().add(fileRef);
            }

            // Search for the generated file's build reference and create it on demand
            PBXObjectRef<PBXFileReference> finalFileRef = fileRef;
            PBXObjectRef<PBXBuildFile> buildRef = sourcesBP.getReferenced().getOrCreateFiles().find(obj -> {
                if (obj == null) return false;
                final PBXBuildFile refd = obj.getReferenced();
                return refd != null && finalFileRef.value.equals(refd.getFileRef().value);
            });
            if (buildRef == null) {
                buildRef = file.newPBXBuildFile(fileRef);
                file.getRoot().getObjects().put(buildRef);
            }

            PBXObjectRef<PBXBuildFile> finalBuildRef = buildRef;
            final PBXObjectRef<PBXBuildFile> existingBuildRef = sourcesBP.getReferenced().getOrCreateFiles()
                    .find(obj -> obj.value.equals(finalBuildRef.value));
            if (existingBuildRef == null) {
                sourcesBP.getReferenced().getOrCreateFiles().add(buildRef);
            }

            file.save();
        } catch (Throwable e) {
            throw new GradleException("Filed to update Xcode project", e);
        }
    }

    private Retrolambda retrolambdaTaskDep;

    @NotNull
    public Retrolambda getRetrolambdaTaskDep() {
        return Require.nonNull(retrolambdaTaskDep);
    }

    protected final void setupMoeTask() {
        SourceSet sourceSet = TaskUtils.getSourceSet(getMoePlugin(), SourceSet.MAIN_SOURCE_SET_NAME);
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "ui-headers");

        setDescription("Generates header files for Interface Builder");

        // Add dependencies
        final Retrolambda retroTask = getMoePlugin().getTaskBy(Retrolambda.class, sourceSet);
        retrolambdaTaskDep = retroTask;
        dependsOn(retroTask);

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES, () -> {
            final ArrayList<Object> files = new ArrayList<>();
            files.add(retroTask.getOutputDir());
            if (getMoeExtension().getProguardLevelRaw() == MoeExtension.PROGUARD_LEVEL_APP) {
                files.add(getMoeExtension().getPlatformJar());
            }
            return files;
        });
        addConvention(CONVENTION_OUTPUT_SOURCE,
                () -> resolvePathInBuildDir(out, "moe-" + sourceSet.getName() + "-interfaces.m"));
        addConvention(CONVENTION_XCODE_PROJECT_FILE,
                () -> resolvePathRelativeToRoot(getProject().file(getMoeExtension().xcode.getProject())));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "GenerateUIHeaders.log"));
    }
}
