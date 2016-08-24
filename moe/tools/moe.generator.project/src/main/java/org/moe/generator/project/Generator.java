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

package org.moe.generator.project;

import org.moe.common.constants.MOEManifestConstants.BUNDLE_RESOURCES;
import org.moe.common.constants.MOEManifestConstants.LIBRARIES_PATHS;
import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.config.Configuration;
import org.moe.generator.project.util.FileTypeUtil;
import org.moe.generator.project.writer.ContentProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * The Generator class generates the complete project.
 */
public final class Generator {

    /*
    Pre-defined SourceTree values
     */
    public static final String SOURCE_TREE_GROUP = "<group>";
    public static final String SOURCE_TREE_PROJECT = "SOURCE_ROOT";

    /**
     * Configuration.
     */
    private final Configuration config;

    /**
     * Project helper.
     */
    private ProjectHelper projectHelper;

    /**
     * Project file.
     */
    private ProjFile file;

    /**
     * Creates a new Generator instance.
     *
     * @param config configuration
     */
    public Generator(Configuration config) {
        this.config = config;
    }

    /**
     * Generates the project.
     *
     * @throws IOException
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public void create() throws IOException {
        file = new ProjFile();
        Root root = file.getRoot();
        root.setArchiveVersion("1");
        root.setObjectVersion("46");
        root.getClasses();
        projectHelper = new ProjectHelper(file, new FileManager(config.getProjectRoot()));

        String relativePathToBasePrj = config.getRelativePathToBasePrj() + "/";
        String relativePathToBuildDir = config.getRelativePathToBuildDir() + "/";

        // Create targets
        XcodeTarget mainTarget = new XcodeTarget("main", "", projectHelper, config);
        XcodeTarget testTarget = new XcodeTarget("test", "-Test", projectHelper, config);

        // Create groups
        PBXObjectRef<PBXGroup> mainGroupRef = projectHelper.createGroup(null, SOURCE_TREE_GROUP);
        PBXObjectRef<PBXGroup> prodGroupRef = projectHelper.createGroup("Products", SOURCE_TREE_GROUP);
        PBXObjectRef<PBXGroup> fwGroupRef = projectHelper.createGroup("Frameworks", SOURCE_TREE_GROUP);
        mainGroupRef.getReferenced().getChildren().add(mainTarget.getGroupRef());
        mainGroupRef.getReferenced().getChildren().add(testTarget.getGroupRef());
        mainGroupRef.getReferenced().getChildren().add(fwGroupRef);
        mainGroupRef.getReferenced().getChildren().add(prodGroupRef);

        // Create project
        PBXObjectRef<PBXProject> projectRef = projectHelper.createProject(config.getOrganizationName());
        root.setRootObject(projectRef);
        PBXProject project = projectRef.getReferenced();
        project.setProjectName(config.getProductName());
        project.setMainGroup(mainGroupRef);
        project.setProductRefGroup(prodGroupRef);
        project.setProjectDirPath("");
        project.setProjectRoot("");

        // Add targets
        project.getTargets().add(mainTarget.getTargetRef());
        project.getTargets().add(testTarget.getTargetRef());

        // Create build configurations
        PBXObjectRef<XCBuildConfiguration> projectDebugBCRef = createBuildConfig(true);
        PBXObjectRef<XCBuildConfiguration> projectReleaseBCRef = createBuildConfig(false);

        // Create build configuration list
        PBXObjectRef<XCConfigurationList> projectConfigListRef = projectHelper.createBuildConfigList();
        project.setBuildConfigurationList(projectConfigListRef);
        XCConfigurationList projectConfigList = projectConfigListRef.getReferenced();
        projectConfigList.setDefaultConfigurationIsVisible("0");
        projectConfigList.setDefaultConfigurationName("Release");
        projectConfigList.getBuildConfigurations().add(projectDebugBCRef);
        projectConfigList.getBuildConfigurations().add(projectReleaseBCRef);

        // Create build phases
        PBXObjectRef<PBXShellScriptBuildPhase> mainShellBPRef = mainTarget.createShellScriptBuildPhase();
        PBXShellScriptBuildPhase mainShellBP = mainShellBPRef.getReferenced();
        mainShellBP.setName("Compile Sources (MOE)");
        mainShellBP.setShellPath("/bin/bash");
        mainShellBP.setShellScript(ContentProvider.getGradleBuildScriptContents(false, config));
        PBXObjectRef<PBXFrameworksBuildPhase> mainFwBPRef = mainTarget.createFrameworksBuildPhase();
        PBXObjectRef<PBXResourcesBuildPhase> mainResBPRef = mainTarget.createResourcesBuildPhase();
        PBXObjectRef<PBXSourcesBuildPhase> mainSrcBPRef = mainTarget.createSourcesBuildPhase();
        PBXObjectRef<PBXCopyFilesBuildPhase> mainEfwBPRef = mainTarget.createCopyFilesBuildPhase();
        PBXCopyFilesBuildPhase mainEfwBP = mainEfwBPRef.getReferenced();
        mainEfwBP.setDstPath("");
        mainEfwBP.setDstSubfolderSpec("10");
        mainEfwBP.setName("Embed Frameworks");

        PBXObjectRef<PBXShellScriptBuildPhase> testShellBPRef = testTarget.createShellScriptBuildPhase();
        PBXShellScriptBuildPhase testShellBP = testShellBPRef.getReferenced();
        testShellBP.setName("Compile Sources (MOE)");
        testShellBP.setShellPath("/bin/bash");
        testShellBP.setShellScript(ContentProvider.getGradleBuildScriptContents(true, config));
        PBXObjectRef<PBXFrameworksBuildPhase> testFwBPRef = testTarget.createFrameworksBuildPhase();
        PBXObjectRef<PBXResourcesBuildPhase> testResBPRef = testTarget.createResourcesBuildPhase();
        PBXObjectRef<PBXSourcesBuildPhase> testSrcBPRef = testTarget.createSourcesBuildPhase();
        PBXObjectRef<PBXCopyFilesBuildPhase> testEfwBPRef = testTarget.createCopyFilesBuildPhase();
        PBXCopyFilesBuildPhase testEfwBP = testEfwBPRef.getReferenced();
        testEfwBP.setDstPath("");
        testEfwBP.setDstSubfolderSpec("10");
        testEfwBP.setName("Embed Frameworks");

		/*
         * CREATE FILES
		 */
        // main.cpp
        FileResult main_cpp = mainTarget.createFile("main.cpp", null, "", SOURCE_TREE_GROUP);
        mainTarget.getSupportingFilesGroup().getChildren().add(main_cpp.getFileRef());
        createBuildFile(main_cpp.getFileRef(), mainSrcBPRef.getReferenced());
        createBuildFile(main_cpp.getFileRef(), testSrcBPRef.getReferenced());
        ContentProvider.generateMainCppContent(main_cpp.getFile());

        // build.xcconfig in Main target
        FileResult mainBuild_xcconfig = mainTarget.createFile("build.xcconfig", null, "", SOURCE_TREE_GROUP);
        mainTarget.getSupportingFilesGroup().getChildren().add(mainBuild_xcconfig.getFileRef());
        mainTarget.getDebugConfiguration().setBaseConfigurationReference(mainBuild_xcconfig.getFileRef());
        mainTarget.getReleaseConfiguration().setBaseConfigurationReference(mainBuild_xcconfig.getFileRef());
        ContentProvider.generateXcConfigContent(mainBuild_xcconfig.getFile(), false, config);

        // build.xcconfig in Test target
        FileResult testBuild_xcconfig = testTarget.createFile("build.xcconfig", null, "", SOURCE_TREE_GROUP);
        testTarget.getSupportingFilesGroup().getChildren().add(testBuild_xcconfig.getFileRef());
        testTarget.getDebugConfiguration().setBaseConfigurationReference(testBuild_xcconfig.getFileRef());
        testTarget.getReleaseConfiguration().setBaseConfigurationReference(testBuild_xcconfig.getFileRef());
        ContentProvider.generateXcConfigContent(testBuild_xcconfig.getFile(), true, config);

        // Info.plist
        /////////////
        String mainInfo_plistName;
        String infoPlistPath = config.getInfoPlistPath();
        boolean generateInfoPlist = false;
        if ((infoPlistPath == null) || infoPlistPath.isEmpty()) {
            generateInfoPlist = true;
            mainInfo_plistName = "Info.plist";
            infoPlistPath = mainTarget.getName() + "/" + mainInfo_plistName;
        } else {
            mainInfo_plistName = new File(infoPlistPath).getName();
        }
        FileResult mainInfo_plist = mainTarget.createFile(mainInfo_plistName, null, "", SOURCE_TREE_PROJECT);
        mainTarget.getSupportingFilesGroup().getChildren().add(mainInfo_plist.getFileRef());
        PBXFileReference mainInfo_plist_ref = mainInfo_plist.getFileRef().getReferenced();
        mainInfo_plist_ref.setName(mainInfo_plistName);
        mainInfo_plist_ref.setPath(infoPlistPath);

        if (generateInfoPlist) {
            ContentProvider.generateInfoPlistContent(new File(config.getProjectRoot(), infoPlistPath), config, false);
        }

        Value infoPlistFileKey = new Value("INFOPLIST_FILE");
        Value mainInfoPlistFileValue = new Value(infoPlistPath);
        mainTarget.getDebugConfiguration().getBuildSettings().add(infoPlistFileKey, mainInfoPlistFileValue);
        mainTarget.getReleaseConfiguration().getBuildSettings().add(infoPlistFileKey, mainInfoPlistFileValue);

        // Info-Test.plist
        //////////////////
        String testInfo_plistName;
        boolean generateTestInfoPlist = false;
        String testInfoPlistPath = config.getTestInfoPlistPath();
        if ((testInfoPlistPath == null) || testInfoPlistPath.isEmpty()) {
            generateTestInfoPlist = true;
            testInfo_plistName = "Info-Test.plist";
            testInfoPlistPath = testTarget.getName() + "/" + testInfo_plistName;
        } else {
            testInfo_plistName = new File(testInfoPlistPath).getName();
        }
        FileResult testInfo_plist = testTarget.createFile(testInfo_plistName, null, "", SOURCE_TREE_PROJECT);
        testTarget.getSupportingFilesGroup().getChildren().add(testInfo_plist.getFileRef());
        PBXFileReference testInfo_plist_ref = testInfo_plist.getFileRef().getReferenced();
        testInfo_plist_ref.setName(testInfo_plistName);
        testInfo_plist_ref.setPath(testInfoPlistPath);

        if (generateTestInfoPlist) {
            ContentProvider.generateInfoPlistContent(new File(config.getProjectRoot(), testInfoPlistPath), config, true);
        }

        Value testInfoPlistFileKey = new Value("INFOPLIST_FILE");
        Value testInfoPlistFileValue = new Value(testInfoPlistPath);
        testTarget.getDebugConfiguration().getBuildSettings().add(testInfoPlistFileKey, testInfoPlistFileValue);
        testTarget.getReleaseConfiguration().getBuildSettings().add(testInfoPlistFileKey, testInfoPlistFileValue);

        // <PRODUCT>.app
        PBXObjectRef<PBXFileReference> mainAppFileRefRef = createProductFile(mainTarget.getName());
        prodGroupRef.getReferenced().getChildren().add(mainAppFileRefRef);
        mainTarget.getTarget().setProductReference(mainAppFileRefRef);

        // <PRODUCT>-Test.app
        PBXObjectRef<PBXFileReference> testAppFileRefRef = createProductFile(testTarget.getName());
        prodGroupRef.getReferenced().getChildren().add(testAppFileRefRef);
        testTarget.getTarget().setProductReference(testAppFileRefRef);

        // MOE.framework
        FileResult moe_fw = mainTarget.createFile("MOE.framework", null, "", "MOE_FRAMEWORK_PATH");
        fwGroupRef.getReferenced().getChildren().add(moe_fw.getFileRef());
        // -> Embed Frameworks
        embedFramework(moe_fw, mainEfwBP);
        embedFramework(moe_fw, testEfwBP);
        // -> Frameworks
        createBuildFile(moe_fw.getFileRef(), mainFwBPRef.getReferenced());
        createBuildFile(moe_fw.getFileRef(), testFwBPRef.getReferenced());

        // Custom libraries
        final String platformNames[] = new String[] { "iphoneos", "iphonesimulator" };
        IdentityHashMap<Enum, List<String>> properties = config.getDependenciesManifestsProperties();
        for (LIBRARIES_PATHS val : LIBRARIES_PATHS.values()) {
            List<String> pathList = properties.get(val);
            if (pathList != null) {
                for (String path : pathList) {
                    String name = new File(path).getName();
                    boolean embedded = false;
                    String libPath = "";
                    String srcTree = SOURCE_TREE_PROJECT;

                    if (path.contains("libs/dynamic/")) {
                        embedded = true;
                        for (String platformName : platformNames) {
                            if (path.contains("libs/dynamic/" + platformName)) {
                                libPath = name;
                                srcTree = "MOE_CUSTOM_DYNAMIC_FRAMEWORK_PATH";
                                break;
                            }
                        }
                        if (libPath.isEmpty()) {
                            libPath = relativePathToBuildDir + "libs/dynamic/" + name;
                        }
                    } else if (path.contains("libs/static/")) {
                        for (String platformName : platformNames) {
                            if (path.contains("libs/static/" + platformName)) {
                                libPath = name;
                                srcTree = "MOE_CUSTOM_STATIC_FRAMEWORK_PATH";
                                break;
                            }
                        }
                        if (libPath.isEmpty()) {
                            libPath = relativePathToBuildDir + "libs/static/" + name;
                        }
                    } else {
                        libPath = name;
                    }

                    String lastKnownFileType = FileTypeUtil.getFileType(name);

                    PBXFileReference fileRef = new PBXFileReference();
                    fileRef.setLastKnownFileType(lastKnownFileType);
                    fileRef.setPath(libPath);
                    fileRef.setSourceTree(srcTree);

                    boolean exists = false;
                    for (PBXObjectRef<?> objRef : fwGroupRef.getReferenced().getChildren()) {
                        PBXFileReference tmpRef = (PBXFileReference) objRef.getReferenced();
                        if (tmpRef.equals(fileRef)) {
                            exists = true;
                            break;
                        }
                    }
                    if (exists) {
                        continue;
                    }

                    FileResult result = mainTarget.createFile(libPath, null, "", srcTree);
                    fwGroupRef.getReferenced().getChildren().add(result.getFileRef());

                    // -> Embed Frameworks
                    if (embedded) {
                        embedFramework(result, mainEfwBP);
                        embedFramework(result, testEfwBP);
                    }
                    // -> Frameworks
                    createBuildFile(result.getFileRef(), mainFwBPRef.getReferenced());
                    createBuildFile(result.getFileRef(), testFwBPRef.getReferenced());
                }
            }
        }

        // preregister.txt in Main target
        FileResult mainPreregister_txt = mainTarget.createFile("preregister.txt", null, "", SOURCE_TREE_GROUP);
        mainTarget.getSupportingFilesGroup().getChildren().add(mainPreregister_txt.getFileRef());
        PBXFileReference mainPreregister_txtRef = mainPreregister_txt.getFileRef().getReferenced();
        mainPreregister_txtRef.setPath(relativePathToBuildDir + "moe/main/preregister.txt");
        mainPreregister_txtRef.setName("preregister.txt");
        mainPreregister_txtRef.setSourceTree(SOURCE_TREE_PROJECT);
        createBuildFile(mainPreregister_txt.getFileRef(), mainResBPRef.getReferenced());

        // preregister.txt in Test target
        FileResult testPreregister_txt = testTarget.createFile("preregister.txt", null, "", SOURCE_TREE_GROUP);
        testTarget.getSupportingFilesGroup().getChildren().add(testPreregister_txt.getFileRef());
        PBXFileReference testPreregister_txtRef = testPreregister_txt.getFileRef().getReferenced();
        testPreregister_txtRef.setPath(relativePathToBuildDir + "moe/test/preregister.txt");
        testPreregister_txtRef.setName("preregister.txt");
        testPreregister_txtRef.setSourceTree(SOURCE_TREE_PROJECT);
        createBuildFile(testPreregister_txt.getFileRef(), testResBPRef.getReferenced());

        // application.jar in Main target
        FileResult mainApplication_jar = mainTarget.createFile("application.jar", null, "", SOURCE_TREE_GROUP);
        mainTarget.getSupportingFilesGroup().getChildren().add(mainApplication_jar.getFileRef());
        PBXFileReference mainApplication_jarRef = mainApplication_jar.getFileRef().getReferenced();
        mainApplication_jarRef.setPath(relativePathToBuildDir + "moe/main/application.jar");
        mainApplication_jarRef.setName("application.jar");
        mainApplication_jarRef.setSourceTree(SOURCE_TREE_PROJECT);
        createBuildFile(mainApplication_jar.getFileRef(), mainResBPRef.getReferenced());

        // application.jar in Test target
        FileResult testApplication_jar = testTarget.createFile("application.jar", null, "", SOURCE_TREE_GROUP);
        testTarget.getSupportingFilesGroup().getChildren().add(testApplication_jar.getFileRef());
        PBXFileReference testApplication_jarRef = testApplication_jar.getFileRef().getReferenced();
        testApplication_jarRef.setPath(relativePathToBuildDir + "moe/test/application.jar");
        testApplication_jarRef.setName("application.jar");
        testApplication_jarRef.setSourceTree(SOURCE_TREE_PROJECT);
        createBuildFile(testApplication_jar.getFileRef(), testResBPRef.getReferenced());

        // classlist.txt in Test target
        FileResult testClasses_txt = testTarget.createFile("classlist.txt", null, "", SOURCE_TREE_GROUP);
        testTarget.getSupportingFilesGroup().getChildren().add(testClasses_txt.getFileRef());
        PBXFileReference testClasses_txtRef = testClasses_txt.getFileRef().getReferenced();
        testClasses_txtRef.setPath(relativePathToBuildDir + "moe/test/classlist.txt");
        testClasses_txtRef.setName("classlist.txt");
        testClasses_txtRef.setSourceTree(SOURCE_TREE_PROJECT);
        createBuildFile(testClasses_txt.getFileRef(), testResBPRef.getReferenced());

        // Add resources Main target
        List<String> mainResourcesSet = config.getMainResourcesSet();
        for (String resPath : mainResourcesSet) {
            String resName = new File(resPath).getName();
            if ((resName == null) || resName.isEmpty()) {
                continue;
            }

            String lastKnownFileType = FileTypeUtil.getFileType(resName);

            PBXFileReference fileRef = new PBXFileReference();
            fileRef.setLastKnownFileType(lastKnownFileType);
            fileRef.setPath(resPath);
            fileRef.setName(resName);
            fileRef.setSourceTree(SOURCE_TREE_PROJECT);

            boolean exists = false;
            for (PBXObjectRef<?> objRef : mainTarget.getSupportingFilesGroup().getChildren()) {
                PBXFileReference tmpRef = (PBXFileReference) objRef.getReferenced();
                if (tmpRef.equals(fileRef)) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                continue;
            }

            FileResult result;
            try {
                result = mainTarget.createFile(resPath, null, lastKnownFileType, SOURCE_TREE_PROJECT);
            } catch (IllegalArgumentException iae) {
                continue;
            }
            result.getFileRef().getReferenced().setName(resName);

            mainTarget.getSupportingFilesGroup().getChildren().add(result.getFileRef());
            createBuildFile(result.getFileRef(), mainResBPRef.getReferenced());
        }

        // Add resources Test target
        for (String resPath : config.getTestResourcesSet()) {
            String resName = new File(resPath).getName();;
            if ((resName == null) || resName.isEmpty()) {
                continue;
            }

            String lastKnownFileType = FileTypeUtil.getFileType(resName);

            PBXFileReference fileRef = new PBXFileReference();
            fileRef.setLastKnownFileType(lastKnownFileType);
            fileRef.setPath(resPath);
            fileRef.setName(resName);
            fileRef.setSourceTree(SOURCE_TREE_PROJECT);

            boolean exists = false;
            for (PBXObjectRef<?> objRef : testTarget.getSupportingFilesGroup().getChildren()) {
                PBXFileReference tmpRef = (PBXFileReference) objRef.getReferenced();
                if (tmpRef.equals(fileRef)) {
                    exists = true;
                    break;
                }
            }
            if (exists) {
                continue;
            }

            FileResult result;
            try {
                result = testTarget.createFile(resPath, null, lastKnownFileType, SOURCE_TREE_PROJECT);
            } catch (IllegalArgumentException iae) {
                continue;
            }
            result.getFileRef().getReferenced().setName(resName);

            testTarget.getSupportingFilesGroup().getChildren().add(result.getFileRef());
            createBuildFile(result.getFileRef(), testResBPRef.getReferenced());
        }

        for (BUNDLE_RESOURCES bundleRes : BUNDLE_RESOURCES.values()) {
            List<String> bundleResPaths = config.getDependenciesManifestsProperties().get(bundleRes);
            if (bundleResPaths != null) {
                for (String bundleResPath : bundleResPaths) {
                    String resName = relativePathToBuildDir + bundleResPath;
                    FileResult res = mainTarget.createFile(resName, null, "", SOURCE_TREE_PROJECT);

                    mainTarget.getSupportingFilesGroup().getChildren().add(res.getFileRef());
                    createBuildFile(res.getFileRef(), mainResBPRef.getReferenced());
                }
            }
        }

        // Create default files and structures
        file.saveAs(projectHelper.getFileManager().getFileInRoot(config.getProjectName() + ".xcodeproj"));
    }

    /**
     * Create a project build configuration.
     *
     * @param debug debug mode
     * @return build configuration
     */
    private PBXObjectRef<XCBuildConfiguration> createBuildConfig(boolean debug) {
        XCBuildConfiguration c = new XCBuildConfiguration();
        c.setName(debug ? "Debug" : "Release");
        BuildSettingsHelper.addProjectConfig(c.getBuildSettings(), debug, config);
        return projectHelper.addAndReturn(c);
    }

    /**
     * Creates the gradle wrapper if option is not skipped.
     *
     * @throws IOException
     */
    public void createGradleWrapper() throws IOException {
        if (config.getSkipGradleWrapper()) {
            return;
        }

        if (file == null) {
            file = new ProjFile();
        }

        if (projectHelper == null) {
            projectHelper = new ProjectHelper(file, new FileManager(config.getProjectRoot()));
        }

        FileManager fileManager = projectHelper.getFileManager();

        writeFile("wrapper", "gradlew", null, true);
        writeFile("wrapper", "gradlew.bat", null, true);
        writeFile("wrapper", "gradle/wrapper/gradle-wrapper.jar", null, true);
        ContentProvider.generateGradlePropertiesFile(fileManager.getFileInRoot("gradle/wrapper/gradle-wrapper.properties"), config);

        fileManager.getFileInRoot("gradlew").setExecutable(true);
    }

    /**
     * Writes the specified internal resource to an external file.
     *
     * @param internalSubpath internal subpath
     * @param filename        file name and relative math
     * @throws IOException
     */
    private void writeFile(String internalSubpath, String filename, String removableSuffix, boolean needInternalInOut) throws IOException {
        String path = "/org/moe/generator/project";
        if (internalSubpath != null) {
            path += "/" + internalSubpath;
        }

        if (needInternalInOut) {
            path += "/" + filename;
        }

        InputStream stream = Generator.class.getResourceAsStream(path);
        if (stream == null) {
            throw new IOException("Failed to locate resource " + path);
        }
        try {
            FileManager fileManager = projectHelper.getFileManager();
            if (removableSuffix != null && filename.endsWith(removableSuffix)) {
                filename = filename.substring(0, filename.length() - removableSuffix.length());
            }
            File out = fileManager.getFileInRoot(filename);
            if (!out.getParentFile().exists()) {
                out.getParentFile().mkdirs();
            }

            FileOutputStream fos = new FileOutputStream(out);
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
    }

    /**
     * Creates additional files and structures.
     *
     * @throws IOException
     */
    private void createNonXcodeDefaults() throws IOException {
        FileManager fileManager = projectHelper.getFileManager();

        // build.gradle
//		File build_gradle = fileManager.getFileInRoot("build.gradle");
//		ContentProvider.generateGradleBuildFile(build_gradle, config);

        // Save Xcode project
        file.saveAs(fileManager.getFileInRoot(config.getProjectName() + ".xcodeproj"));

        // Create file structure
//		fileManager.createDirectoryInRoot("src", "main", "java");
//		fileManager.createDirectoryInRoot("src", "main", "resources");
//		fileManager.createDirectoryInRoot("src", "test", "java");
//		fileManager.createDirectoryInRoot("src", "test", "resources");

//		if (config.getUseScala()) {
//			fileManager.createDirectoryInRoot("src", "main", "scala");
//			fileManager.createDirectoryInRoot("src", "test", "scala");
//		}

//		fileManager.createDirectoryInRoot("lib");

//		if (config.targetIsIOS()) {
//			writeFile(null, "src/main/java/Main.java.ios.in", ".ios.in", true);
//		} else if (config.targetIsTvOS()) {
//			writeFile(null, "src/main/java/Main.java.tvos.in", ".tvos.in", true);
//		} else {
//			throw new RuntimeException("Unsupported target platform: " + config.getTargetPlatform());
//		}

        //.gitignore. .gitinvisible
//        writeFile("git/.gitignore.in", ".gitignore.in", ".in", false);
//        writeFile("git/.gitinvisible.in", "src/main/resources/.gitinvisible.in", ".in", false);
//        writeFile("git/.gitinvisible.in", "src/test/java/.gitinvisible.in", ".in", false);
//        writeFile("git/.gitinvisible.in", "src/test/resources/.gitinvisible.in", ".in", false);
    }

    /**
     * Adds a framework to the specified copy phase.
     *
     * @param framework           framework file to add
     * @param copyFilesBuildPhase build phase to add to
     */
    private void embedFramework(FileResult framework, PBXCopyFilesBuildPhase copyFilesBuildPhase) {
        PBXObjectRef<PBXBuildFile> m_sdk_fw_embed = createBuildFile(framework.getFileRef(), copyFilesBuildPhase);
        Array<NextStep> m_sdk_fw_embed_attrs = new Array<NextStep>();
        m_sdk_fw_embed_attrs.add(new Value("CodeSignOnCopy"));
        m_sdk_fw_embed_attrs.add(new Value("RemoveHeadersOnCopy"));
        m_sdk_fw_embed.getReferenced().getSettings().add(new Value("ATTRIBUTES"), m_sdk_fw_embed_attrs);
    }

    /**
     * Creates a product file.
     *
     * @param name name of the product
     * @return reference to the file
     */
    private PBXObjectRef<PBXFileReference> createProductFile(String name) {
        PBXObjectRef<PBXFileReference> fileRefRef = projectHelper.addAndReturn(new PBXFileReference());
        PBXFileReference fileRef = fileRefRef.getReferenced();
        fileRef.setExplicitFileType("wrapper.application");
        fileRef.setIncludeInIndex("0");
        fileRef.setPath(name + ".app");
        fileRef.setSourceTree("BUILT_PRODUCTS_DIR");
        return fileRefRef;
    }

    /**
     * Creates a new build file and adds it to the specified build phase.
     *
     * @param fileRef       file to add
     * @param srcBuildPhase phase to add to
     * @return reference to the build file
     */
    private PBXObjectRef<PBXBuildFile> createBuildFile(PBXObjectRef<PBXFileReference> fileRef, PBXBuildPhase srcBuildPhase) {
        PBXObjectRef<PBXBuildFile> buildFileRef = projectHelper.addAndReturn(new PBXBuildFile());
        PBXBuildFile buildFile = buildFileRef.getReferenced();
        buildFile.setFileRef(fileRef);
        srcBuildPhase.getFiles().add(buildFileRef);
        return buildFileRef;
    }
}
