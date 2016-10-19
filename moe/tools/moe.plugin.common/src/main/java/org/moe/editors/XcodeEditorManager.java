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
    public static final String[] DEPLOYMENT_TARGET_SUGGESTED_VALUES = {"8.0", "8.1", "8.2", "8.3", "8.4", "9.0", "9.1", "9.2", "9.3", "10.0"};

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

    public XcodeEditorManager(File xcodeProjectFile, String content) throws ProjectException {
        this.xcodeFile = xcodeProjectFile;
        load(content);
    }

    public void setListener(DocumentChangeListener listener) {
        this.documentChangeListener = listener;
    }

    public void load(String content) throws ProjectException {
        this.projectFile = new ProjectFile(content);
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
        this.testReleaseXCBuildConfiguration = getXCBuildConfiguration(testTarget, RELEASE);
        this.testDebugXCBuildConfiguration = getXCBuildConfiguration(testTarget, DEBUG);
    }

    private PBXNativeTarget getTarget(final String targetName) {
        // Search for target with name
        Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject> nTargetField = root.getObjects().findFirst(new Dictionary.FieldPredicate<PBXObjectRef<? extends PBXObject>, PBXObject>() {
            @Override
            public boolean predicate(Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject> field) {
                return field.value instanceof PBXNativeTarget && ((PBXNativeTarget)field.key.getReferenced())
                        .getName().equals(targetName);
            }
        });

        return (PBXNativeTarget)nTargetField.value;
    }

    public String getMainTargetName() {
        return mainTarget.getName();
    }

    public void setMainTargetName(String name) {
        if (getMainTargetName().equals(name)) {
            return;
        }
        mainTarget.setName(name);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getTestTargetName() {
        return testTarget.getName();
    }

    public void setTestTargetName(String name) {
        if (getTestTargetName().equals(name)) {
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
        Value nextStep = (Value) defaultReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEPLOYMENT_KEY));
        if (nextStep != null) {
            return nextStep.value;
        }
        return "";
    }

    public void setDefaultDeploymentTarget(String target) {
        if (getDefaultDeploymentTarget().equals(target)) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = defaultReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEPLOYMENT_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }

        buildSettings = defaultDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getMainDeploymentTarget() {
        if (mainReleaseXCBuildConfiguration == null) {
            return null;
        }
        Value nextStep = (Value) mainReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEPLOYMENT_KEY));
        if (nextStep != null) {
            return nextStep.value;
        }
        return null;
    }

    public void setMainDeploymentTarget(String target) {
        if (mainReleaseXCBuildConfiguration == null) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = mainReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEPLOYMENT_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }

        if (mainDebugXCBuildConfiguration == null) {
            return;
        }
        buildSettings = mainDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getTestDeploymentTarget() {
        if (testReleaseXCBuildConfiguration == null) {
            return null;
        }
        Value nextStep = (Value) testReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEPLOYMENT_KEY));
        if (nextStep != null) {
            return nextStep.value;
        }

        return null;
    }

    public void setTestDeploymentTarget(String target) {
        if (testReleaseXCBuildConfiguration == null) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = testReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEPLOYMENT_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }

        if (testDebugXCBuildConfiguration == null) {
            return;
        }
        buildSettings = testDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getDefaultDevices() {
        Value nextStep = (Value) defaultReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEVICE_KEY));
        if (nextStep != null) {
            return nextStep.toString();
        }
        return "";
    }

    public void setDefaultDevices(String device) {
        if (getDefaultDevices().equals(device)) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = defaultReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEVICE_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(device));
        } else {
            buildSettings.add(key, new Value(device));
        }
        buildSettings = defaultDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(device));
        } else {
            buildSettings.add(key, new Value(device));
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getMainDevices() {
        if (mainReleaseXCBuildConfiguration == null) {
            return null;
        }
        Value nextStep = (Value) mainReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEVICE_KEY));
        if (nextStep != null) {
            return nextStep.value;
        }
        return null;
    }

    public void setMainDevices(String target) {
        if (getMainDevices().equals(target)) {
            return;
        }
        if (mainReleaseXCBuildConfiguration == null) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = mainReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEVICE_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }

        if (mainDebugXCBuildConfiguration == null) {
            return;
        }
        buildSettings = mainDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getTestDevices() {
        if (testReleaseXCBuildConfiguration == null) {
            return null;
        }
        Value nextStep = (Value) testReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value(DEVICE_KEY));
        if (nextStep != null) {
            return nextStep.value;
        }
        return null;
    }

    public void setTestDevices(String target) {
        if (getDefaultDevices().equals(target)) {
            return;
        }
        if (testReleaseXCBuildConfiguration == null) {
            return;
        }
        Dictionary<Value, NextStep> buildSettings = testReleaseXCBuildConfiguration.getOrCreateBuildSettings();
        Value key = new Value(DEVICE_KEY);
        NextStep nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
        buildSettings = testDebugXCBuildConfiguration.getOrCreateBuildSettings();
        nextStep = buildSettings.getValue(key);
        if (nextStep != null) {
            buildSettings.replaceValue(key, new Value(target));
        } else {
            buildSettings.add(key, new Value(target));
        }
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
        devices.put(DEVICE_UNIVERSAL_KEY, "\"1,2\"");
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
        PBXFrameworksBuildPhase frameworksBuildPhase = MOEProjectFabricator.getOrCreateFrameworksBuildPhase(projectFile, target);

        for (PBXObjectRef<PBXBuildFile> frameworkFile : frameworksBuildPhase.getOrCreateFiles()) {
            PBXFileReference pbxFileReference =
                    (PBXFileReference) root.getObjects().getValue(frameworkFile.getReferenced().getFileRef());
            String name = pbxFileReference.getName();
            String path = pbxFileReference.getPath();
            name = name == null ? path : name;
            frameworks.add(new Framework(name, path, pbxFileReference.getSourceTree()));
        }

        return frameworks;
    }

    private void removeFramework(PBXNativeTarget target, Framework framework) {
        PBXFrameworksBuildPhase frameworksBuildPhase = MOEProjectFabricator.getOrCreateFrameworksBuildPhase(projectFile, target);
        Array<PBXObjectRef<PBXBuildFile>> files = frameworksBuildPhase.getOrCreateFiles();

        PBXObjectRef<PBXBuildFile> frameworkBuildFile = null;
        PBXObjectRef<PBXFileReference> frameworkFileRef = null;

        for (PBXObjectRef<PBXBuildFile> file : files) {
            PBXObjectRef<PBXFileReference> fileRef = (PBXObjectRef<PBXFileReference>) file.getReferenced().getFileRef();
            PBXFileReference pbxFileReference =
                    (PBXFileReference) root.getObjects().getValue(fileRef);
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
        final PBXObjectRef<PBXFileReference> frameWorkFileRef = MOEProjectFabricator.createFileReference(
                projectFile,
                framework.getName(),
                framework.getPath(),
                framework.getSourceTree()
        );

        // Create framework build files
        PBXObjectRef<PBXBuildFile> frameworkLink = MOEProjectFabricator.createBuildFile(projectFile, frameWorkFileRef);

        PBXFrameworksBuildPhase frameworksBuildPhase = MOEProjectFabricator.getOrCreateFrameworksBuildPhase(projectFile, target);
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
        if (mainTarget.getProductName().equals(productName)) {
            return;
        }
        mainTarget.setProductName(productName);
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void setTestProductName(String productName) {
        if (testTarget.getProductName().equals(productName)) {
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
            if (field.value instanceof PBXFileReference) {
                PBXFileReference pbxFileRef = (PBXFileReference) field.value;
                String filePath = pbxFileRef.getPath();
                if (filePath.endsWith(".xib") || filePath.endsWith(".storyboard")) {
                    String name = pbxFileRef.getName();
                    if (name.endsWith(".xib") || name.endsWith(".storyboard")) {
                        files.put(name, filePath);
                    } else {
                        files.put(getNameInPath(filePath), filePath);
                    }
                }
            }
        }
        return files;
    }

    private String getNameInPath(String filePath) {
        int idx = filePath.indexOf("/");
        if (idx > -1) {
            return filePath.substring(idx + 1, filePath.length());
        }
        return filePath;
    }


    public static File findInfoPlist(File root) {
        File[] files =root.listFiles();
        for (File f : files) {
            if (f.getPath().endsWith(".plist")) {
                return f;
            }
        }
        return null;
    }

    public String getBundleIdentifier() {
        NextStep nextStep = mainReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"));
        nextStep = nextStep == null ? mainDebugXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value("PRODUCT_BUNDLE_IDENTIFIER")) : nextStep;
        if (nextStep != null) {
            return nextStep.print(0);
        }
        return null;
    }

    public String getTestBundleIdentifier() {
        Value nextStep = (Value) testReleaseXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"));
        nextStep = nextStep == null ? (Value) testDebugXCBuildConfiguration.getOrCreateBuildSettings().getValue(new Value("PRODUCT_BUNDLE_IDENTIFIER")) : nextStep;
        if (nextStep != null) {
            return nextStep.value;
        }
        return null;
    }

    public void setBundleIdentifier(String id) {
        if (getBundleIdentifier().endsWith(id)) {
            return;
        }
        mainReleaseXCBuildConfiguration.getOrCreateBuildSettings().replaceValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"), new Value(id));
        mainDebugXCBuildConfiguration.getOrCreateBuildSettings().replaceValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"), new Value(id));
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public void setTestBundleIdentifier(String id) {
        if (getTestBundleIdentifier().endsWith(id)) {
            return;
        }
        testReleaseXCBuildConfiguration.getOrCreateBuildSettings().replaceValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"), new Value(id));
        testDebugXCBuildConfiguration.getOrCreateBuildSettings().replaceValue(new Value("PRODUCT_BUNDLE_IDENTIFIER"), new Value(id));
        if (documentChangeListener != null) {
            documentChangeListener.documentChanged();
        }
    }

    public String getOrganizationName() {
        Dictionary<Value, Value> attributes = pbxProject.getAttributesOrNull();
        if (attributes != null) {
            Value value = attributes.getValue(new Value("ORGANIZATIONNAME"));
            return  value.value;
        }
        return "";
    }

    public void setOrganizationName(String name) {
        Dictionary<Value, Value> attributes = pbxProject.getOrCreateAttributes();
        if (attributes != null) {
            Value value = attributes.getValue(new Value("ORGANIZATIONNAME"));
            if (value != null) {
                attributes.replaceValue(new Value("ORGANIZATIONNAME"), new Value(name));
            } else {
                attributes.add(new Value("ORGANIZATIONNAME"), new Value(name));
            }
            if (documentChangeListener != null) {
                documentChangeListener.documentChanged();
            }
        }
    }
}
