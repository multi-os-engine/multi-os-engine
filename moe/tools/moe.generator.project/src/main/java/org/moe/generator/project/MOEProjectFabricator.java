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

package org.moe.generator.project;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXBuildPhase;
import org.moe.document.pbxproj.PBXCopyFilesBuildPhase;
import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXFrameworksBuildPhase;
import org.moe.document.pbxproj.PBXGroup;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.PBXResourcesBuildPhase;
import org.moe.document.pbxproj.PBXShellScriptBuildPhase;
import org.moe.document.pbxproj.PBXSourcesBuildPhase;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.XCBuildConfiguration;
import org.moe.document.pbxproj.XCConfigurationList;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.MOEProjectComposer.Template;
import org.moe.generator.project.MOEProjectComposer.Template.Language;
import org.moe.generator.project.util.FileTypeUtil;
import org.moe.generator.project.writer.ContentProvider;
import org.moe.generator.project.writer.ResourceWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MOEProjectFabricator {

    private static final String SOURCE_FILE_NAME = "";

    private final MOEProjectComposer composer;
    private final String templateRootPath;

    public MOEProjectFabricator(MOEProjectComposer composer) {
        if (composer == null) {
            throw new NullPointerException();
        }
        this.composer = composer;
        templateRootPath = "templates/" + composer.getTemplate().id + "/";
    }

    public void fabricate() throws IOException, ProjectException {
        prepareGradleProject();
        reifyTemplate();
    }

    private File rootDir;

    private void prepareGradleProject() throws IOException {
        // Prepare directories
        rootDir = composer.getTargetDirectory();

        // Create Gradle files
        write("build.gradle.in", rootDir, "build.gradle");
        copy("wrapper/gradlew", rootDir, SOURCE_FILE_NAME).setExecutable(true);
        copy("wrapper/gradlew.bat", rootDir, SOURCE_FILE_NAME);
        final File gradleWrapperDir = createDirectory("gradle", "wrapper");
        copy("wrapper/gradle/wrapper/gradle-wrapper.jar", gradleWrapperDir, SOURCE_FILE_NAME);
        copy("wrapper/gradle/wrapper/gradle-wrapper.properties", gradleWrapperDir, SOURCE_FILE_NAME);

        // Copy Git files
        copy("git/.gitignore.in", rootDir, ".gitignore");
    }

    private void reifyTemplate() throws IOException, ProjectException {
        final String resource = "/org/moe/generator/project/" + templateRootPath + "template.json";
        final InputStream stream = ContentProvider.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }
        final JsonElement element = new JsonParser().parse(new InputStreamReader(stream));
        final JsonElement tasksElement = element.getAsJsonObject().get("tasks");
        for (JsonElement task : tasksElement.getAsJsonArray()) {
            final JsonObject taskObject = task.getAsJsonObject();
            final String taskName = taskObject.get("task").getAsString();
            if (taskName.equals("copy")) {
                templateCopy(taskObject);

            } else if (taskName.equals("copy-package-source")) {
                templateCopyPackageSource(taskObject);

            } else if (taskName.equals("xcodeproj")) {
                templateXcodeproj(taskObject);

            } else {
                throw new RuntimeException("Unsupported template task '" + taskName + "'");
            }
        }
    }

    private void templateCopy(JsonObject taskObject) throws IOException {
        if (!templateCondition(taskObject)) {
            return;
        }

        final JsonArray from = taskObject.get("from").getAsJsonArray();
        for (JsonElement element : from) {
            final String resource = element.getAsString();
            final String[] split = resource.split("/");
            for (int i = 0, splitLength = split.length; i < splitLength; i++) {
                String comp = split[i];
                if ("__main_target__".equals(comp)) {
                    split[i] = composer.getProjectName();
                } else if ("__test_target__".equals(comp)) {
                    split[i] = composer.getProjectName() + "-Test";
                }
            }
            write(templateRootPath + resource, rootDir, split);
        }
    }

    private void templateCopyPackageSource(JsonObject taskObject) throws IOException {
        if (!templateCondition(taskObject)) {
            return;
        }

        final String root = taskObject.get("root").getAsString();
        final String sourceSet = taskObject.get("source-set").getAsString();
        final JsonArray from = taskObject.get("from").getAsJsonArray();
        for (JsonElement element : from) {
            final String resource = element.getAsString();
            final String outpath;
            if (composer.getTemplate().language.equals(Language.JAVA)) {
                outpath = "src/" + sourceSet + "/java/" + composer.getPackageName().replaceAll("\\.", "/") + "/"
                        + resource;

            } else if (composer.getTemplate().language.equals(Language.KOTLIN)) {
                outpath = "src/" + sourceSet + "/kotlin/" + composer.getPackageName().replaceAll("\\.", "/") + "/"
                        + resource;

            } else {
                throw new RuntimeException("Unsupported language '" + composer.getTemplate().language + "'");
            }
            write(templateRootPath + root + "/" + resource, rootDir, outpath.split("/"));
        }
    }

    private void templateXcodeproj(JsonObject taskObject) throws ProjectException, IOException {
        if (!templateCondition(taskObject)) {
            return;
        }

        final String from = taskObject.get("from").getAsString();
        final String resource = "/org/moe/generator/project/" + templateRootPath + from;
        final InputStream stream = ContentProvider.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }
        ProjectFile file = new ProjectFile(stream);

        final PBXProject project = file.getRoot().getRootObject().getReferenced();
        project.getOrCreateAttributes().replaceValue("ORGANIZATIONNAME", new Value(composer.getOrganizationName()));

        final PBXGroup mainGroup;
        final PBXGroup testGroup;
        {
            PBXGroup _mainGroup = null;
            PBXGroup _testGroup = null;
            final Array<PBXObjectRef<? extends PBXObject>> mainGroupElements = project.getMainGroup().getReferenced()
                    .getOrCreateChildren();
            for (PBXObjectRef<? extends PBXObject> elementRef : mainGroupElements) {
                final PBXObject referenced = elementRef.getReferenced();
                if (!(referenced instanceof PBXGroup)) {
                    continue;
                }
                final PBXGroup group = (PBXGroup)referenced;
                if (group.getPath() == null) {
                    continue;
                } else if (group.getPath().equals("__main_target__")) {
                    _mainGroup = group;

                } else if (group.getPath().equals("__test_target__")) {
                    _testGroup = group;
                }
            }
            mainGroup = _mainGroup;
            testGroup = _testGroup;
        }

        final Array<PBXObjectRef<PBXNativeTarget>> targets = project.getOrCreateTargets();
        for (PBXObjectRef<PBXNativeTarget> targetRef : targets) {
            final PBXNativeTarget target = targetRef.getReferenced();
            if (target.getName().equals("__main_target__")) {
                configureTarget(file, target, mainGroup, false);

            } else if (target.getName().equals("__test_target__")) {
                configureTarget(file, target, testGroup, true);
            }
        }

        final File xcodeDir = createDirectory("xcode");
        file.saveAs(new File(xcodeDir, composer.getProjectName() + ".xcodeproj"));
    }

    private void configureTarget(ProjectFile file, PBXNativeTarget target, PBXGroup group, boolean isTest)
            throws IOException {
        final String suffix;
        final String sourceSet;
        if (isTest) {
            suffix = "-Test";
            sourceSet = "test";
        } else {
            suffix = "";
            sourceSet = "main";
        }

        final String projectName = composer.getProjectName() + suffix;
        group.setPath(projectName);
        target.setName(projectName);
        target.setProductName(projectName);
        target.getProductReference().getReferenced().setPath(projectName + ".app");

        final XCConfigurationList configurationList = target.getBuildConfigurationList().getReferenced();
        for (PBXObjectRef<XCBuildConfiguration> configRef : configurationList.getOrCreateBuildConfigurations()) {
            final XCBuildConfiguration buildConfiguration = configRef.getReferenced();
            final Dictionary<Value, NextStep> settings = buildConfiguration.getOrCreateBuildSettings();
            _setxcbs(settings, "INFOPLIST_FILE", projectName + "/Info.plist");
            _setxcbs(settings, "PRODUCT_BUNDLE_IDENTIFIER", composer.getBundleID() + suffix);
            _setxcbs(settings, "ENABLE_BITCODE", "NO");

            _setxcbs(settings, "MOE_PROJECT_DIR", "${SRCROOT}/..");
            _setxcbs(settings, "MOE_PROJECT_BUILD_DIR", "${MOE_PROJECT_DIR}/build");
            _setxcbs(settings, "MOE_SECT_OAT",
                    "-sectcreate __OATDATA __oatdata \"${MOE_PROJECT_BUILD_DIR}/moe/" + sourceSet
                            + "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.oat\"");
            _setxcbs(settings, "MOE_SECT_ART",
                    "-sectcreate __ARTDATA __artdata \"${MOE_PROJECT_BUILD_DIR}/moe/" + sourceSet
                            + "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.art\"");

            _setxcbs(settings, "MOE_SEGPROT[sdk=iphoneos*]", "-segprot __OATDATA rx rx -segprot __ARTDATA rw rw");
            _setxcbs(settings, "MOE_SEGPROT[sdk=iphonesimulator*]",
                    "-segprot __OATDATA rwx rx -segprot __ARTDATA rwx rw");

            _setxcbs(settings, "MOE_PAGEZERO[sdk=iphoneos*]", "");
            _setxcbs(settings, "MOE_PAGEZERO[sdk=iphonesimulator*]", "-pagezero_size 4096");

            _setxcbs(settings, "MOE_FRAMEWORK_PATH", "${MOE_PROJECT_BUILD_DIR}/moe/sdk/sdk/${PLATFORM_NAME}");

            _setxcbs(settings, "MOE_OTHER_LDFLAGS",
                    "${MOE_SECT_OAT} ${MOE_SECT_ART} ${MOE_SEGPROT} ${MOE_PAGEZERO} ${MOE_CUSTOM_OTHER_LDFLAGS} -lstdc++");

            _appendxcbs(settings, "FRAMEWORK_SEARCH_PATHS", "$(inherited)");
            _appendxcbs(settings, "FRAMEWORK_SEARCH_PATHS", "${MOE_FRAMEWORK_PATH}");

            _appendxcbs(settings, "OTHER_LDFLAGS", "$(inherited)");
            _appendxcbs(settings, "OTHER_LDFLAGS", "${MOE_OTHER_LDFLAGS}");
        }

        final PBXGroup supportingFiles = getOrCreateSubGroup(file, group, "Supporting Files");
        final Array<PBXObjectRef<? extends PBXObject>> supportingFilesChildren = supportingFiles.getOrCreateChildren();

        // Create main.cpp file reference
        final PBXObjectRef<PBXFileReference> mainCppFileRef = createFileReference(file, null, "main.cpp", "<group>");
        {
            final File xcodeTargetDir = createDirectory("xcode", composer.getProjectName() + suffix);
            ContentProvider.generateMainCppContent(new File(xcodeTargetDir, mainCppFileRef.getReferenced().getPath()));
        }
        supportingFilesChildren.add(mainCppFileRef);

        // Create main.cpp build file
        final PBXObjectRef<PBXBuildFile> mainCppBuildFile = createBuildFile(file, mainCppFileRef);

        // Create MOE.framework file reference
        final PBXObjectRef<PBXFileReference> moeFwFileRef = createFileReference(file, null, "MOE.framework",
                "MOE_FRAMEWORK_PATH");

        // Create MOE.framework build files
        final PBXObjectRef<PBXBuildFile> moeFWLink = createBuildFile(file, moeFwFileRef);
        final PBXObjectRef<PBXBuildFile> moeFWEmbed = createBuildFile(file, moeFwFileRef);
        {
            final Array<Value> moeEmbedFwBuildFileAttrs = new Array<Value>();
            moeEmbedFwBuildFileAttrs.add(new Value("CodeSignOnCopy"));
            moeEmbedFwBuildFileAttrs.add(new Value("RemoveHeadersOnCopy"));
            moeFWEmbed.getReferenced().getOrCreateSettings().add(new Value("ATTRIBUTES"), moeEmbedFwBuildFileAttrs);
        }

        // Create build script
        final PBXShellScriptBuildPhase moeCompileBuildPhase = getOrCreateMOECompileBuildPhase(file, target);
        moeCompileBuildPhase.setShellPath("/bin/bash");
        moeCompileBuildPhase.setShellScript(ContentProvider.getGradleBuildScriptContents(isTest));

        final PBXSourcesBuildPhase sourcesBuildPhase = getOrCreateSourcesBuildPhase(file, target);
        sourcesBuildPhase.getOrCreateFiles().add(mainCppBuildFile);

        final PBXFrameworksBuildPhase frameworksBuildPhase = getOrCreateFrameworksBuildPhase(file, target);
        frameworksBuildPhase.getOrCreateFiles().add(moeFWLink);

        final PBXCopyFilesBuildPhase moeEmbedFrameworksBuildPhase = getOrCreateMOEEmbedFrameworksBuildPhase(file,
                target);
        moeEmbedFrameworksBuildPhase.getOrCreateFiles().add(moeFWEmbed);
    }

    private PBXObjectRef<PBXFileReference> createFileReference(ProjectFile file, String name, String filePath,
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
        file.getRoot().getObjects().add(reference);
        return reference;
    }

    private PBXObjectRef<PBXBuildFile> createBuildFile(ProjectFile file, PBXObjectRef<PBXFileReference> fileReference) {
        final PBXBuildFile buildFile = new PBXBuildFile();
        buildFile.setFileRef(fileReference);
        final PBXObjectRef<PBXBuildFile> reference = file.createReference(buildFile);
        file.getRoot().getObjects().add(reference);
        return reference;
    }

    private PBXSourcesBuildPhase getOrCreateSourcesBuildPhase(ProjectFile file, PBXNativeTarget target) {
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
        file.getRoot().getObjects().add(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }

    private PBXResourcesBuildPhase getOrCreateResourcesBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXResourcesBuildPhase.class))) {
                continue;
            }
            return (PBXResourcesBuildPhase)ref.getReferenced();
        }
        final PBXResourcesBuildPhase phase = new PBXResourcesBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().add(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }

    private PBXFrameworksBuildPhase getOrCreateFrameworksBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXFrameworksBuildPhase.class))) {
                continue;
            }
            return (PBXFrameworksBuildPhase)ref.getReferenced();
        }
        final PBXFrameworksBuildPhase phase = new PBXFrameworksBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().add(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }

    private PBXShellScriptBuildPhase getOrCreateMOECompileBuildPhase(ProjectFile file, PBXNativeTarget target) {
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
        file.getRoot().getObjects().add(reference);
        target.getBuildPhasesOrNull().add(0, reference);
        return phase;
    }

    private PBXCopyFilesBuildPhase getOrCreateMOEEmbedFrameworksBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXCopyFilesBuildPhase.class))) {
                continue;
            }
            final PBXCopyFilesBuildPhase referenced = (PBXCopyFilesBuildPhase)ref.getReferenced();
            if (!"Embed Frameworks (MOE)".equals(referenced.getName())) {
                continue;
            }
            return referenced;
        }
        final PBXCopyFilesBuildPhase phase = new PBXCopyFilesBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        phase.setName("Embed Frameworks (MOE)");
        phase.setDstPath("");
        phase.setDstSubfolderSpec("10");
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().add(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }

    private PBXGroup getOrCreateSubGroup(ProjectFile file, PBXGroup group, String name) {
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
        file.getRoot().getObjects().add(reference);
        group.getChildrenOrNull().add(reference);
        return child;
    }

    private static void _setxcbs(Dictionary<Value, NextStep> settings, String key, String value) {
        final Value _key = new Value(key);
        if (settings.contains(_key)) {
            settings.replaceValue(_key, new Value(value));
        } else {
            settings.add(_key, new Value(value));
        }
    }

    private static void _appendxcbs(Dictionary<Value, NextStep> settings, String key, String value) {
        final Value _key = new Value(key);
        if (settings.contains(_key)) {
            @SuppressWarnings("unchecked") final Array<Value> list = (Array<Value>)settings.getValue(_key);
            list.add(new Value(value));
        } else {
            final Array<Value> list = new Array<Value>();
            list.add(new Value(value));
            settings.add(_key, list);
        }
    }

    private boolean templateCondition(JsonObject taskObject) {
        final JsonElement element = taskObject.get("condition");
        if (element == null) {
            return true;
        }
        final Template template = composer.getTemplate();
        final String condition = element.getAsString();
        if (condition.startsWith("language:")) {
            if (!condition.substring("language:".length()).equals(template.language.toLowerCase())) return false;
        }
        return true;
    }

    /*
     * Utils
     */

    private static File createDirectory(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException();
        }
        if (!file.mkdirs() && (!file.exists() || !file.isDirectory())) {
            throw new IOException("Failed to create target directory at '" + file.getAbsolutePath() + "'");
        }
        return file;
    }

    private File createDirectory(String... subpaths) throws IOException {
        File file = rootDir;
        for (String subpath : subpaths) {
            file = new File(file, subpath);
        }
        return createDirectory(file);
    }

    private File write(String resource, File rootDir, String... subdirs) throws IOException {
        if (resource == null) {
            throw new NullPointerException();
        }
        if (rootDir == null) {
            throw new NullPointerException();
        }
        if (subdirs.length == 0) {
            throw new IllegalArgumentException("missing output file name");
        }

        // Update resource
        final String resourceFileName;
        if (resource.lastIndexOf('/') == -1) {
            resourceFileName = resource;
        } else {
            resourceFileName = resource.substring(resource.lastIndexOf('/') + 1);
        }
        resource = "/org/moe/generator/project/" + resource;

        // Prepare output directory
        File outputFile = rootDir;
        for (String subdir : subdirs) {
            if (SOURCE_FILE_NAME.equals(subdir)) {
                outputFile = new File(outputFile, resourceFileName);
            } else {
                outputFile = new File(outputFile, subdir);
            }
        }
        createDirectory(outputFile.getParentFile());

        // Process and write file
        final InputStream stream = ContentProvider.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }
        try {
            ResourceWriter w = new ResourceWriter(outputFile, stream);
            w.setPlaceholder("MOE_PROJECT_NAME", composer.getProjectName());
            w.setPlaceholder("MOE_VERSION", composer.getMoeVersion());
            w.setPlaceholder("PACKAGE_NAME", composer.getPackageName());
            if (composer.getTemplate().language.equals(Language.KOTLIN)) {
                w.enableRegion("USE_KOTLIN_PLUGIN");
                w.setPlaceholder("KOTLIN_VERSION", "1.0.4");
            }
            w.writeAndClose();
        } finally {
            try {
                stream.close();
            } catch (IOException ignore) {
            }
        }
        return outputFile;
    }

    private File copy(String resource, File rootDir, String... subdirs) throws IOException {
        if (resource == null) {
            throw new NullPointerException();
        }
        if (rootDir == null) {
            throw new NullPointerException();
        }
        if (subdirs.length == 0) {
            throw new IllegalArgumentException("missing output file name");
        }

        // Update resource
        final String resourceFileName;
        if (resource.lastIndexOf('/') == -1) {
            resourceFileName = resource;
        } else {
            resourceFileName = resource.substring(resource.lastIndexOf('/') + 1);
        }
        resource = "/org/moe/generator/project/" + resource;

        // Prepare output directory
        File outputFile = rootDir;
        for (String subdir : subdirs) {
            if (SOURCE_FILE_NAME.equals(subdir)) {
                outputFile = new File(outputFile, resourceFileName);
            } else {
                outputFile = new File(outputFile, subdir);
            }
        }
        createDirectory(outputFile.getParentFile());

        // Write file
        final InputStream stream = ContentProvider.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }
        try {
            FileOutputStream fos = new FileOutputStream(outputFile);
            try {
                int count;
                byte bytes[] = new byte[8192];
                while ((count = stream.read(bytes)) > 0) {
                    fos.write(bytes, 0, count);
                }
            } finally {
                fos.close();
            }
        } finally {
            stream.close();
        }
        return outputFile;
    }
}
