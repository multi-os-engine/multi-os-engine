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
import org.moe.document.pbxproj.ProjectException;
import org.moe.generator.project.MOEProjectComposer.Template;
import org.moe.generator.project.MOEProjectComposer.Template.Language;
import org.moe.generator.project.writer.ResourceWriter;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.generator.project.writer.XcodeTemplateEditor;
import org.moe.generator.project.writer.XcodeTemplateEditor.Settings;

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
        if (!composer.isSubproject()) {
            copy("wrapper/gradlew", rootDir, SOURCE_FILE_NAME).setExecutable(true);
            copy("wrapper/gradlew.bat", rootDir, SOURCE_FILE_NAME);
            final File gradleWrapperDir = createDirectory("gradle", "wrapper");
            copy("wrapper/gradle/wrapper/gradle-wrapper.jar", gradleWrapperDir, SOURCE_FILE_NAME);
            copy("wrapper/gradle/wrapper/gradle-wrapper.properties", gradleWrapperDir, SOURCE_FILE_NAME);
        }

        // Copy Git files
        copy("git/.gitignore.in", rootDir, ".gitignore");
    }

    private void reifyTemplate() throws IOException, ProjectException {
        final String resource = "/org/moe/generator/project/" + templateRootPath + "template.json";
        final InputStream stream = XcodeEditor.class.getResourceAsStream(resource);
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
        final InputStream stream = XcodeEditor.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }

        final File xcodeDir = createDirectory("xcode");
        final File xcodeProjectFile = new File(xcodeDir, composer.getProjectName() + ".xcodeproj");

        XcodeTemplateEditor editor = new XcodeTemplateEditor(stream);
        XcodeTemplateEditor.Settings settings = new Settings();
        settings.moeProject = rootDir;
        settings.xcodeProject = xcodeProjectFile;
        settings.projectName = composer.getProjectName();
        settings.organizationName = composer.getOrganizationName();
        settings.bundleID = composer.getBundleID();
        editor.update(settings);

        editor.getProjectFile().saveAs(xcodeProjectFile);

        for (String target : new String[] { composer.getProjectName(), composer.getProjectName() + "-Test" }) {
            final File xcodeTargetDir = createDirectory("xcode", target);

            final InputStream buildScriptAsStream = XcodeEditor.class
                    .getResourceAsStream("/org/moe/generator/project/main.cpp.in");
            final ResourceWriter buildScriptResourceWriter = new ResourceWriter(buildScriptAsStream);
            buildScriptResourceWriter.writeAndClose(new File(xcodeTargetDir, "main.cpp"));
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
        final InputStream stream = XcodeEditor.class.getResourceAsStream(resource);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + resource);
        }
        try {
            ResourceWriter w = new ResourceWriter(stream);
            w.setPlaceholder("MOE_PROJECT_NAME", composer.getProjectName());
            w.setPlaceholder("MOE_VERSION", composer.getMoeVersion());
            w.setPlaceholder("PACKAGE_NAME", composer.getPackageName());
            if (composer.getTemplate().language.equals(Language.KOTLIN)) {
                w.enableRegion("USE_KOTLIN_PLUGIN");
                w.setPlaceholder("KOTLIN_VERSION", "1.0.6");
            }
            w.writeAndClose(outputFile);
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
        final InputStream stream = XcodeEditor.class.getResourceAsStream(resource);
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
