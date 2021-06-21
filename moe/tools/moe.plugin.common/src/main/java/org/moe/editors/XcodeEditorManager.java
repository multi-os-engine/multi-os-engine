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

package org.moe.editors;

import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Array.Predicate;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.MOEProjectFabricator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XcodeEditorManager {

    public static final String RELEASE = "Release";
    public static final String DEBUG = "Debug";
    public static final String DEVICE_KEY = "TARGETED_DEVICE_FAMILY";
    public static final String DEPLOYMENT_KEY = "IPHONEOS_DEPLOYMENT_TARGET";
    public static final String DEVICE_IPHONE_KEY = "iPhone";
    public static final String DEVICE_IPAD_KEY = "iPad";
    public static final String DEVICE_UNIVERSAL_KEY = "Universal";
    public static final String[] DEPLOYMENT_TARGET_SUGGESTED_VALUES = {"8.0", "8.1", "8.2", "8.3", "8.4", "9.0", "9.1", "9.2", "9.3", "10.0", "10.1", "10.2", "10.3", "11.0", "11.1", "11.2"};
    public static final String PRODUCT_BUNDLE_ID_KEY = "PRODUCT_BUNDLE_IDENTIFIER";
    public static final String ORGANIZATIONNAME_KEY = "ORGANIZATIONNAME";
    public static final String STORYBOARD_FILE = ".storyboard";
    public static final String XIB_FILE = ".xib";
    public static final String PLIST_FILE = ".plist";
    public static final String MOE_COPY_ANDROID_CACERTS_KEY = "MOE_COPY_ANDROID_CACERTS";
    public static final String ANDROID_CACERTS_YES = "YES";
    public static final String ANDROID_CACERTS_NO = "NO";

    private ProjectFile projectFile;
    private PBXNativeTarget mainTarget;
    private PBXNativeTarget testTarget;
    private XCBuildConfiguration mainReleaseXCBuildConfiguration;
    private XCBuildConfiguration mainDebugXCBuildConfiguration;
    private XCBuildConfiguration testReleaseXCBuildConfiguration;
    private XCBuildConfiguration testDebugXCBuildConfiguration;
    private XCBuildConfiguration defaultReleaseXCBuildConfiguration;
    private XCBuildConfiguration defaultDebugXCBuildConfiguration;
    private PBXProject pbxProject;
    private Root root;
    private File xcodeFile;
    private DocumentChangeListener documentChangeListener;

    public XcodeEditorManager(File xcodeProjectFile) throws ProjectException {
        this.xcodeFile = xcodeProjectFile;
        this.projectFile = new ProjectFile(xcodeFile);
        init();
    }

    public XcodeEditorManager(File xcodeProjectFile, String content) throws ProjectException {
        this.xcodeFile = xcodeProjectFile;
        load(content);
    }

    public void setListener(DocumentChangeListener listener) {
        this.documentChangeListener = listener;
    }

    public void load(String content) throws ProjectException {
        this.projectFile = new ProjectFile(content);
        init();
    }

    public void init() throws ProjectException {
        this.root = projectFile.getRoot();
        this.pbxProject = root.getRootObject().getReferenced();
        setTragets();
        setXCBuildConfigurations();
        setDefaultXCBuildConfigurations();
    }

    private void setTragets() {
        Array<PBXObjectRef<PBXNativeTarget>> targets = pbxProject.getOrCreateTargets();
        for (PBXObjectRef<PBXNativeTarget> target : targets) {
            PBXNativeTarget nativeTarget = target.getReferenced();
            String targetName = nativeTarget.getName();
            if (targetName.endsWith("-Test")) {
                this.testTarget = nativeTarget;
            } else {
                this.mainTarget = nativeTarget;
            }
        }
    }

    private void setXCBuildConfigurations() {
        this.mainReleaseXCBuildConfiguration = getXCBuildConfiguration(mainTarget, RELEASE);
        this.mainDebugXCBuildConfiguration = getXCBuildConfiguration(mainTarget, DEBUG);
        if (testTarget == null) return;
        this.testReleaseXCBuildConfiguration = getXCBuildConfiguration(testTarget, RELEASE);
        this.testDebugXCBuildConfiguration = getXCBuildConfiguration(testTarget, DEBUG);
    }

    private PBXNativeTarget getTarget(final String targetName) {
        final PBXObjectRef<PBXNativeTarget> objectRef = pbxProject.getOrCreateTargets()
                .find(new Predicate<PBXObjectRef<PBXNativeTarget>>() {
                    @Override
                    public boolean predicate(PBXObjectRef<PBXNativeTarget> objRef) {
                        return objRef.getReferenced().getName().equals(targetName);
                    }
                });
        if (objectRef == null) {
            throw new RuntimeException("Failed to find target with name '" + targetName + "'");
        }
        return objectRef.getReferenced();
    }

    public String getMainTargetName() {
        return mainTarget.getName();
    }

    public void setMainTargetName(String name) {
        if (getMainTargetName() != null && getMainTargetName().equals(name)) {
            return;
        }
        mainTarget.setName(name);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public boolean hasTestTarget(){
        return testTarget != null;
    }

    public String getTestTargetName() {
        return testTarget.getName();
    }

    public void setTestTargetName(String name) {
        if (getTestTargetName() != null && getTestTargetName().equals(name)) {
            return;
        }
        testTarget.setName(name);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    private XCBuildConfiguration getXCBuildConfiguration(PBXNativeTarget nTarget, String mode) {
        XCConfigurationList xcConfigurationList = nTarget.getBuildConfigurationList().getReferenced();
        for (PBXObjectRef<XCBuildConfiguration> ref : xcConfigurationList.getOrCreateBuildConfigurations()) {
            XCBuildConfiguration xcBuildConfiguration = ref.getReferenced();
            if (xcBuildConfiguration.getName().equals(mode)) {
                return xcBuildConfiguration;
            }
        }
        return null;
    }

    public String getProjectName() {
        return pbxProject.getProjectName();
    }

    public void setProjectName(String name) {
        pbxProject.setProjectName(name);
    }

    public String getDefaultDeploymentTarget() {
        String value = getBuildSettingsValueWithKey(defaultReleaseXCBuildConfiguration, DEPLOYMENT_KEY);
        value = value == null ? getBuildSettingsValueWithKey(defaultDebugXCBuildConfiguration, DEPLOYMENT_KEY) : value;
        return value;
    }

    public void setDefaultDeploymentTarget(String target) {
        if (getDefaultDeploymentTarget() != null && getDefaultDeploymentTarget().equals(target)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(defaultReleaseXCBuildConfiguration, DEPLOYMENT_KEY, target);
        setBuildSettingsWithKeyAndValue(defaultDebugXCBuildConfiguration, DEPLOYMENT_KEY, target);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getMainDeploymentTarget() {
        String value = getBuildSettingsValueWithKey(mainReleaseXCBuildConfiguration, DEPLOYMENT_KEY);
        value = value == null ? getBuildSettingsValueWithKey(mainDebugXCBuildConfiguration, DEPLOYMENT_KEY) : value;
        return value;
    }

    public void setMainDeploymentTarget(String target) {
        if (getMainDeploymentTarget() != null && getMainDeploymentTarget().equals(target)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(mainReleaseXCBuildConfiguration, DEPLOYMENT_KEY, target);
        setBuildSettingsWithKeyAndValue(mainDebugXCBuildConfiguration, DEPLOYMENT_KEY, target);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getTestDeploymentTarget() {
        String value = getBuildSettingsValueWithKey(testReleaseXCBuildConfiguration, DEPLOYMENT_KEY);
        value = value == null ? getBuildSettingsValueWithKey(testDebugXCBuildConfiguration, DEPLOYMENT_KEY) : value;
        return value;
    }

    public void setTestDeploymentTarget(String target) {
        if (getTestDeploymentTarget() != null && getTestDeploymentTarget().equals(target)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(testReleaseXCBuildConfiguration, DEPLOYMENT_KEY, target);
        setBuildSettingsWithKeyAndValue(testDebugXCBuildConfiguration, DEPLOYMENT_KEY, target);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getDefaultDevices() {
        String value = getBuildSettingsValueWithKey(defaultReleaseXCBuildConfiguration, DEVICE_KEY);
        value = value == null ? getBuildSettingsValueWithKey(defaultDebugXCBuildConfiguration, DEVICE_KEY) : value;
        return value;
    }

    public void setDefaultDevices(String device) {
        if (getDefaultDevices() != null && getDefaultDevices().equals(device)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(defaultReleaseXCBuildConfiguration, DEVICE_KEY, device);
        setBuildSettingsWithKeyAndValue(defaultDebugXCBuildConfiguration, DEVICE_KEY, device);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getMainDevices() {
        String value = getBuildSettingsValueWithKey(mainReleaseXCBuildConfiguration, DEVICE_KEY);
        value = value == null ? getBuildSettingsValueWithKey(mainDebugXCBuildConfiguration, DEVICE_KEY) : value;
        return value;
    }

    public void setMainDevices(String target) {
        if (getMainDevices() != null && getMainDevices().equals(target)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(mainReleaseXCBuildConfiguration, DEVICE_KEY, target);
        setBuildSettingsWithKeyAndValue(mainDebugXCBuildConfiguration, DEVICE_KEY, target);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getTestDevices() {
        String value = getBuildSettingsValueWithKey(testReleaseXCBuildConfiguration, DEVICE_KEY);
        value = value == null ? getBuildSettingsValueWithKey(testDebugXCBuildConfiguration, DEVICE_KEY) : value;
        return value;
    }

    public void setTestDevices(String target) {
        if (getDefaultDevices() != null && getDefaultDevices().equals(target)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(testReleaseXCBuildConfiguration, DEVICE_KEY, target);
        setBuildSettingsWithKeyAndValue(testDebugXCBuildConfiguration, DEVICE_KEY, target);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void save() throws IOException {
        projectFile.save();
    }

    public String getSourceToText() {
        return projectFile.toString();
    }

    public static Map<String, String> getDevicesMap() {
        Map<String, String> devices = new HashMap<String, String>();
        devices.put(DEVICE_IPHONE_KEY, "1");
        devices.put(DEVICE_IPAD_KEY, "2");
        devices.put(DEVICE_UNIVERSAL_KEY, "1,2");
        return devices;
    }

    private void setDefaultXCBuildConfigurations() {
        Array<PBXObjectRef<XCBuildConfiguration>> configList = pbxProject.getBuildConfigurationList().getReferenced().getOrCreateBuildConfigurations();
        for (PBXObjectRef<XCBuildConfiguration> configurationRef : configList) {
            XCBuildConfiguration configuration = configurationRef.getReferenced();
            if (configuration.getName().equals(RELEASE)) {
                defaultReleaseXCBuildConfiguration = configuration;
            } else {
                defaultDebugXCBuildConfiguration = configuration;
            }
        }
    }

    public List<Framework> getMainFrameworks() {
        return getFrameworks(mainTarget);
    }

    public List<Framework> getTestFrameworks() {
        return getFrameworks(testTarget);
    }

    private List<Framework> getFrameworks(PBXNativeTarget target) {
        List<Framework> frameworks = new ArrayList<Framework>();
        PBXFrameworksBuildPhase frameworksBuildPhase = EditorUtil.getOrCreateFrameworksBuildPhase(projectFile, target);

        for (PBXObjectRef<PBXBuildFile> frameworkFile : frameworksBuildPhase.getOrCreateFiles()) {
            PBXFileReference pbxFileReference =
                    (PBXFileReference) root.getObjects().get(frameworkFile.getReferenced().getFileRef());
            String name = pbxFileReference.getName();
            String path = pbxFileReference.getPath();
            name = name == null ? path : name;
            frameworks.add(new Framework(name, path, pbxFileReference.getSourceTree()));
        }

        return frameworks;
    }

    private void removeFramework(PBXNativeTarget target, Framework framework) {
        PBXFrameworksBuildPhase frameworksBuildPhase = EditorUtil.getOrCreateFrameworksBuildPhase(projectFile, target);
        Array<PBXObjectRef<PBXBuildFile>> files = frameworksBuildPhase.getOrCreateFiles();

        PBXObjectRef<PBXBuildFile> frameworkBuildFile = null;
        PBXObjectRef<PBXFileReference> frameworkFileRef = null;

        for (PBXObjectRef<PBXBuildFile> file : files) {
            PBXObjectRef<PBXFileReference> fileRef = (PBXObjectRef<PBXFileReference>) file.getReferenced().getFileRef();
            PBXFileReference pbxFileReference =
                    (PBXFileReference) root.getObjects().get(fileRef);
            String name = pbxFileReference.getName();
            String path = pbxFileReference.getPath();
            name = name == null ? "" : name;
            String frameworkName = framework.getName();
            String frameworkPath = framework.getPath();
            if (frameworkName.equals(name) && frameworkPath.equals(path)) {
                frameworkBuildFile = file;
                frameworkFileRef = fileRef;
            }
        }

        if (frameworkBuildFile != null && frameworkFileRef != null) {
            root.getObjects().remove(frameworkBuildFile);
            root.getObjects().remove(frameworkFileRef);
            files.remove(frameworkBuildFile);

            Array<PBXObjectRef<? extends PBXObject>> childrens = pbxProject.getMainGroup().getReferenced().getOrCreateChildren();

            if (childrens.contains(frameworkFileRef)) {
                childrens.remove(frameworkFileRef);
            }
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void removeMainFramework(Framework framework) {
        removeFramework(mainTarget, framework);
    }

    public void removeTestFramework(Framework framework) {
        removeFramework(testTarget, framework);
    }

    public void addFramewokToMain(Framework framework) {
        addFramework(framework, mainTarget);
    }

    public void addFramewokToTest(Framework framework) {
        addFramework(framework, testTarget);
    }

    private void addFramework(Framework framework, PBXNativeTarget target) {
        // Create framework file reference
        final PBXObjectRef<PBXFileReference> frameWorkFileRef = EditorUtil.createFileReference(
                projectFile,
                framework.getName(),
                framework.getPath(),
                framework.getSourceTree()
        );

        // Create framework build files
        PBXObjectRef<PBXBuildFile> frameworkLink = EditorUtil.createBuildFile(projectFile, frameWorkFileRef);

        PBXFrameworksBuildPhase frameworksBuildPhase = EditorUtil.getOrCreateFrameworksBuildPhase(projectFile, target);
        frameworksBuildPhase.getOrCreateFiles().add(frameworkLink);

        pbxProject.getMainGroup().getReferenced().getOrCreateChildren().add(0, frameWorkFileRef);

        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getMainProductName() {
        return mainTarget.getProductName();
    }

    public String getTestProductName() {
        return testTarget.getProductName();
    }

    public void setMainProductName(String productName) {
        if (mainTarget.getProductName() != null && mainTarget.getProductName().equals(productName)) {
            return;
        }
        mainTarget.setProductName(productName);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void setTestProductName(String productName) {
        if (testTarget.getProductName() != null && testTarget.getProductName().equals(productName)) {
            return;
        }
        testTarget.setProductName(productName);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public Map<String, String> getInterfaceFiles() {
        Map<String, String> files = new HashMap<String, String>();
        ArrayList<Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject>> fields = root.getObjects().rawData();
        for (Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject> field : fields) {
            if (field.getValue() instanceof PBXFileReference) {
                PBXFileReference pbxFileRef = (PBXFileReference) field.getValue();
                String filePath = pbxFileRef.getPath();
                if (filePath.endsWith(XIB_FILE) || filePath.endsWith(STORYBOARD_FILE)) {
                    String name = pbxFileRef.getName();
                    if (name != null) {
                        if (name.endsWith(XIB_FILE) || name.endsWith(STORYBOARD_FILE)) {
                            files.put(name, filePath);
                        } else {
                            files.put(getNameInPath(filePath), filePath);
                        }
                    }
                }
            }
        }
        return files;
    }

    public Map<String, String> getInterfaceFilesNamesAndFullNames() {
        Map<String, String> simpleAndFullnames = new HashMap<String, String>();
        Map<String, String> files = getInterfaceFiles();
        for (String fullName : files.keySet()) {
            simpleAndFullnames.put(EditorUtil.getInterfaceNameWithoutExtension(fullName), fullName);
        }
        return simpleAndFullnames;
    }

    private String getNameInPath(String filePath) {
        int idx = filePath.indexOf("/");
        if (idx > -1) {
            return filePath.substring(idx + 1, filePath.length());
        }
        return filePath;
    }


    public String getInfoMainPlist() {
        String infoPlist = getInfoPlist(mainReleaseXCBuildConfiguration);
        infoPlist = infoPlist == null ? getInfoPlist(mainDebugXCBuildConfiguration) : infoPlist;
        return infoPlist;
    }

    public String getInfoTestPlist() {
        String infoPlist = getInfoPlist(testReleaseXCBuildConfiguration);
        infoPlist = infoPlist == null ? getInfoPlist(testDebugXCBuildConfiguration) : infoPlist;
        return infoPlist;
    }

    private String getInfoPlist(XCBuildConfiguration configuration) {
        Dictionary<Value, NextStep> settings = configuration.getBuildSettingsOrNull();
        if (settings != null) {
            Value value = (Value) settings.get(new Value("INFOPLIST_FILE"));
            return value.value;
        }
        return null;
    }

    public String getBundleIdentifier() {
        String value = getBuildSettingsValueWithKey(mainReleaseXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY);
        value = value == null ? getBuildSettingsValueWithKey(mainDebugXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY) : value;
        return value;
    }

    public String getTestBundleIdentifier() {
        String value = getBuildSettingsValueWithKey(testReleaseXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY);
        value = value == null ? getBuildSettingsValueWithKey(testDebugXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY) : value;
        return value;
    }

    public void setBundleIdentifier(String id) {
        if (getBundleIdentifier() != null && getBundleIdentifier().equals(id)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(mainReleaseXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY, id);
        setBuildSettingsWithKeyAndValue(mainDebugXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY, id);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void setTestBundleIdentifier(String id) {
        if (getTestBundleIdentifier() != null && getTestBundleIdentifier().equals(id)) {
            return;
        }
        setBuildSettingsWithKeyAndValue(testReleaseXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY, id);
        setBuildSettingsWithKeyAndValue(testDebugXCBuildConfiguration, PRODUCT_BUNDLE_ID_KEY, id);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getOrganizationName() {
        Dictionary<Value, Value> attributes = pbxProject.getAttributesOrNull();
        if (attributes != null) {
            Value value = attributes.get(new Value(ORGANIZATIONNAME_KEY));
            return  value.value;
        }
        return "";
    }

    public void setOrganizationName(String name) {
        if (getOrganizationName() != null && getOrganizationName().equals(name)) {
            return;
        }
        Dictionary<Value, Value> attributes = pbxProject.getOrCreateAttributes();
        if (attributes != null) {
            attributes.put(ORGANIZATIONNAME_KEY, new Value(name));
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }

    public boolean isCopyAndroidCertsMain() {
        String value = getBuildSettingsValueWithKey(mainReleaseXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY);
        value = value == null ? getBuildSettingsValueWithKey(mainDebugXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY) : value;
        if (value == null || value.isEmpty()) {
            return false;
        } else if (value.equals(ANDROID_CACERTS_YES)) {
            return true;
        }
        return false;
    }

    public boolean isCopyAndroidCertsTest() {
        String value = getBuildSettingsValueWithKey(testReleaseXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY);
        value = value == null ? getBuildSettingsValueWithKey(testDebugXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY) : value;
        if (value == null || value.isEmpty()) {
            return false;
        } else if (value.equals(ANDROID_CACERTS_YES)) {
            return true;
        }
        return false;
    }

    public void setCopyAndroidCertsMain(boolean b) {
        boolean stored = isCopyAndroidCertsMain();
        if (b == stored) {
            return;
        }
        String value = b ? ANDROID_CACERTS_YES : ANDROID_CACERTS_NO;
        setBuildSettingsWithKeyAndValue(mainReleaseXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY, value);
        setBuildSettingsWithKeyAndValue(mainDebugXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY, value);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void setCopyAndroidCertsTest(boolean b) {
        boolean stored = isCopyAndroidCertsTest();
        if (b == stored) {
            return;
        }
        String value = b ? ANDROID_CACERTS_YES : ANDROID_CACERTS_NO;
        setBuildSettingsWithKeyAndValue(testReleaseXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY, value);
        setBuildSettingsWithKeyAndValue(testDebugXCBuildConfiguration, MOE_COPY_ANDROID_CACERTS_KEY, value);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    private String getBuildSettingsValueWithKey(XCBuildConfiguration xcBuildConfiguration, String key) {
        Value valueKey = new Value(key);
        Value nextStep = (Value) xcBuildConfiguration.getOrCreateBuildSettings().get(valueKey);
        if (nextStep != null) {
            return nextStep.value;
        }
        return null;
    }

    private void setBuildSettingsWithKeyAndValue(XCBuildConfiguration xcBuildConfiguration, String key, String value) {
        if (xcBuildConfiguration == null) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = xcBuildConfiguration.getOrCreateBuildSettings();
        Value keyValue = new Value(key);
        NextStep nextStep = buildSettings.get(keyValue);

        if (value == null) {
            if (nextStep != null) {
                buildSettings.remove(keyValue);
            }
        } else {
            buildSettings.put(keyValue, new Value(value));
        }
    }
}
