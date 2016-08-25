package org.moe.generator.project;

import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.GradleExec;
import org.moe.common.exec.IKillListener;
import org.moe.common.utils.ProjectUtil;
import org.moe.generator.project.config.Configuration;
import org.moe.generator.project.writer.ContentProvider;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ProjectTemplate {

    private static final String PACKAGE_NAME_TAG = "__package_name__";
    private static final String PROJECT_NAME_TAG = "__project_name__";
    private static final String RESOURCES_TAG = "__resources__";

    private String rootPath;
    private String packageName;
    private String projectName;
    private String organizationName;
    private String companyIdentifier;
    private String mainClassName;
    private String xcodeProjectPath;
    private boolean keepXcode;
    private boolean useEclipse = false;


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

    public ProjectTemplate xcodeProjectPath(String xcodeProjectPath) {
        this.xcodeProjectPath = xcodeProjectPath;
        return this;
    }

    public ProjectTemplate keepXcode(boolean keepXcode) {
        this.keepXcode = keepXcode;
        return this;
    }

    public ProjectTemplate useEclipse(boolean useEclipse) {
        this.useEclipse = useEclipse;
        return this;
    }

    public String xcodeProjectPath() {
        return xcodeProjectPath;
    }

    public boolean isKeepXcode() {
        return keepXcode;
    }

    public boolean createProject(String templateName, String moeVersion, boolean createGradleWrapper) {

        Configuration config = new Configuration(moeVersion);
        config.setTargetPlatform("Universal iOS");
        config.setPackageName(packageName);
        config.setProductName("");
        config.setProjectName(projectName);
        config.setBundleID(companyIdentifier + "." + projectName);
        config.setLaunchScreenFilePath("src/main/resources/LaunchScreen.xib");
        config.setKeepXcode(keepXcode);
        config.setXcodeProjectPath(xcodeProjectPath);
        config.setUseEclipse(useEclipse);
        config.setProjectRoot(new File(rootPath));
        File build_gradle = new File(rootPath + File.separator + "build.gradle");
        build_gradle.getParentFile().mkdirs();

        ContentProvider.generateGradleBuildFile(build_gradle, config);

        String path = "/template/wizard/" + templateName;

        InputStream templateStream = ProjectTemplate.class.getResourceAsStream(path);;

        try {
            extractTemplate(templateStream);
        } catch (IOException e) {
            e.printStackTrace(System.err);
            return false;
        }

        if (createGradleWrapper) {
            config.setGradleVersion("2.14.1");
            Generator generator = new Generator(config);
            try {
                generator.createGradleWrapper();
            } catch (IOException e) {
                e.printStackTrace(System.err);
                return false;
            }
        }

        if (isKeepXcode()) {
            File projectFile = new File(rootPath);

            try {
                GradleExec exec = new GradleExec(projectFile);
                exec.getArguments().add("moeXcodeProjectGenerator");
                exec.getArguments().add("-Pmoe.xcode.forceGenerate");
                ExecRunner runner = exec.getRunner();
                runner.getBuilder().directory(projectFile);
                int result = runner.run(new IKillListener() {
                    @Override
                    public boolean needsKill() {
                        return false;
                    }
                });
            } catch (Exception e) {
                e.printStackTrace(System.err);
                return false;
            }
        }

        try {
            if (templateStream != null) {
                templateStream.close();
            }
        } catch (IOException ignore) {

        }

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
                fileName = fileName.replace(RESOURCES_TAG, "resources");
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
                fos.close();
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
