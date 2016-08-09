/*
Copyright 2014-2016 Intel Corporation

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

package org.moe.template;

import org.moe.generator.project.config.Configuration;
import org.moe.generator.project.writer.ContentProvider;
import org.moe.idea.MOESdkPlugin;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ProjectTemplate {

    private static final String PACKAGE_NAME_TAG = "__package_name__";
    private static final String PROJECT_NAME_TAG = "__project_name__";
    private static final String FRAMEWORK_PATH_TAG = "__framework_path__";
    private static final String RESOURCES_TAG = "__resources__";

    private String rootPath;
    private String packageName;
    private String projectName;
    private String organizationName;
    private String companyIdentifier;
    private String mainClassName;
    private String sdkHome;


    public ProjectTemplate() {
    }

    public ProjectTemplate rootPath(String rootPath) {
        this.rootPath = rootPath;
        return this;
    }

    public String rootPath() {
        return rootPath;
    }

    public ProjectTemplate packageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String packageName() {
        return packageName;
    }

    public ProjectTemplate organizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    public String organizationName() {
        return organizationName;
    }

    public ProjectTemplate projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String companyIdentifier() {
        return companyIdentifier;
    }

    public ProjectTemplate companyIdentifier(String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
        return this;
    }

    public String projectName() {
        return projectName;
    }

    public String mainClassName() {
        return mainClassName;
    }

    public ProjectTemplate mainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
        return this;
    }

    public String sdkHome() {
        return sdkHome;
    }

    public ProjectTemplate sdkHome(String sdkHome) {
        this.sdkHome = sdkHome;
        return this;
    }

    private String xcodeProjectPath() {
        return rootPath() + File.separator + "xcode";
    }

    private String xcodeSourcesPath() {
        return xcodeProjectPath() + File.separator + projectName();
    }

    public boolean createProject(InputStream templateStream) {
        try {
            extractTemplate(templateStream);
        } catch (IOException e) {
            return false;
        }

        Configuration config = new Configuration();
        config.setPackageName(packageName);
        config.setProductName("");
        config.setProjectName(projectName);
        config.setBundleID(companyIdentifier + "." + projectName);
        config.setLaunchScreenFilePath("src/main/resources/LaunchScreen.xib");

        File build_gradle = new File(rootPath + File.separator + "build.gradle");
        build_gradle.getParentFile().mkdirs();

        ContentProvider.generateGradleBuildFile(build_gradle, config);

        return true;
    }

    private void extractTemplate(InputStream zipStream) throws IOException {
        byte[] buffer = new byte[1024];

        ZipInputStream inputStream = new ZipInputStream(zipStream);
        ZipEntry zipEntry;

        File newFile;

        while ((zipEntry = inputStream.getNextEntry()) != null) {
            String fileName = zipEntry.getName();

            if (fileName.contains(PACKAGE_NAME_TAG)) {
                fileName = fileName.replace(PACKAGE_NAME_TAG, packageName().replace('.', '/'));
            } else if (fileName.contains(PROJECT_NAME_TAG)) {
                fileName = fileName.replace(PROJECT_NAME_TAG, projectName());
            } else if (fileName.contains(RESOURCES_TAG)) {
                fileName = fileName.replace(RESOURCES_TAG, MOESdkPlugin.getResourcesFolderName());
            }

            // Ignore OS X hidden files

            if (fileName.indexOf("__") == 0 || fileName.contains(".DS_Store")) {
                continue;
            }

            if (zipEntry.isDirectory()) {
                newFile = new File(rootPath() + File.separator + fileName);
                newFile.mkdirs();

                continue;
            }

            newFile = new File(rootPath() + File.separator + fileName);

            new File(newFile.getParent()).mkdirs();

            FileOutputStream fos = new FileOutputStream(newFile);

            int len;

            try {
                while ((len = inputStream.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
            } finally {
                try {
                    fos.close();
                } catch (Exception e) {

                }
            }

            if (isJavaSource(fileName) ||
                    isLayoutFile(fileName) ||
                    isPreregisterFile(fileName) ||
                    isPbxprojFile(fileName)) {
                replaceTagsInFile(newFile.getAbsolutePath());
            }
        }

        inputStream.closeEntry();
        inputStream.close();
    }

    private void replaceTagsInFile(String path) {
        String newline = System.getProperty("line.separator");

        FileReader fileReader;

        try {
            fileReader = new FileReader(path);
        } catch (FileNotFoundException e) {
            return;
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        StringBuilder outputBuilder = new StringBuilder();

        try {
            while ((line = bufferedReader.readLine()) != null) {
                outputBuilder.append(line);
                outputBuilder.append(newline);
            }
        } catch (IOException ignored) {
        } finally {
            try {
                fileReader.close();
            } catch (IOException ignored) {
            }
        }

        String output = outputBuilder.toString();

        output = output.replace(PROJECT_NAME_TAG, projectName());
        output = output.replace(PACKAGE_NAME_TAG, packageName());
        output = output.replace(FRAMEWORK_PATH_TAG, sdkHome());

        FileWriter fileWriter;

        try {
            fileWriter = new FileWriter(path);
        } catch (IOException e) {
            return;
        }

        try {
            fileWriter.write(output);

        } catch (IOException ignored) {
        } finally {
            try {
                fileWriter.close();
            } catch (IOException ignored) {
            }
        }
    }

    private boolean isJavaSource(String fileName) {
        return (fileName.toLowerCase().endsWith(".java"));
    }

    private boolean isLayoutFile(String fileName) {
        return (fileName.toLowerCase().endsWith(".ixml"));
    }

    private boolean isPreregisterFile(String fileName) {
        return (fileName.toLowerCase().endsWith(".txt"));
    }

    private boolean isPbxprojFile(String fileName) {
        return (fileName.toLowerCase().endsWith("project.pbxproj"));
    }
}
