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

import org.moe.document.pbxproj.*;
import org.moe.generator.project.config.Configuration;
import org.moe.generator.project.util.FileTypeUtil;

import java.io.File;
import java.io.IOException;

/**
 * The XcodeTarget class manages a Xcode target.
 */
public class XcodeTarget {

	static public final String SUPPORTING_FILES_GROUP_NAME = "Supporting Files";

	/**
	 * Gradle source set name.
	 */
	private final String sourceSet;

	/**
	 * Target name.
	 */
	private final String name;

	/**
	 * Project helper.
	 */
	private final ProjectHelper helper;

	/**
	 * Target reference.
	 */
	private PBXObjectRef<PBXNativeTarget> targetRef;

	/**
	 * Debug configuration reference.
	 */
	private PBXObjectRef<XCBuildConfiguration> debugConfigurationRef;

	/**
	 * Release configuration reference.
	 */
	private PBXObjectRef<XCBuildConfiguration> releaseConfigurationRef;

	/**
	 * Configuration list reference.
	 */
	private PBXObjectRef<XCConfigurationList> configurationListRef;

	/**
	 * Group reference.
	 */
	private PBXObjectRef<PBXGroup> groupRef;

	/**
	 * Supporting files group reference.
	 */
	private PBXObjectRef<PBXGroup> supportingFilesGroupRef;

	/**
	 * Creates a new XcodeTarget instance.
	 *
	 * @param sourceSet   source set name
	 * @param nameSuffix  target name suffix
	 * @param helper      helper object
	 * @param config      generator configuration
	 */
	public XcodeTarget(String sourceSet, String nameSuffix, ProjectHelper helper, Configuration config) {
		String name = config.getProjectName() + nameSuffix;
		if (sourceSet == null || config == null || config.getProjectName() == null || helper == null || nameSuffix == null) {
			throw new NullPointerException();
		}
		this.sourceSet = sourceSet;
		this.name = name;
		this.helper = helper;

		// Create the default structure
		create(config.getProductName() == null ? null : config.getProductName() + nameSuffix, config);
	}

	/**
	 * Creates a new XcodeTarget instance.
	 *
	 * @param targetRef   target refernce
	 * @param helper      helper object
	 */
	public XcodeTarget(PBXObjectRef<PBXNativeTarget> targetRef, ProjectHelper helper) {
		this.targetRef = targetRef;
		PBXNativeTarget target = targetRef.getReferenced();

		this.name = target.getName();
		if (this.name.endsWith("-Test")) {
			this.sourceSet = "test";
		} else {
			this.sourceSet = "main";
		}

		this.helper = helper;

		this.configurationListRef = target.getBuildConfigurationList();
		for (PBXObjectRef<XCBuildConfiguration> buildConfig : configurationListRef.getReferenced().getBuildConfigurations()) {
			if ("Release".equals(buildConfig.getReferenced().getName())) {
				this.releaseConfigurationRef = buildConfig;
			} else if ("Debug".equals(buildConfig.getReferenced().getName())) {
				this.debugConfigurationRef = buildConfig;
			}
		}

		for (PBXObjectRef<? extends PBXObject> mainGroupChildRef : helper.getFile().getRoot().getRootObject().getReferenced().getMainGroup().getReferenced().getChildren()) {
			if (mainGroupChildRef.getReferenced() instanceof PBXGroup) {
				PBXGroup mainGroupChild = (PBXGroup)mainGroupChildRef.getReferenced();
				if (this.name.equals(mainGroupChild.getName())) {
					this.groupRef = (PBXObjectRef<PBXGroup>)mainGroupChildRef;
					for (PBXObjectRef<? extends PBXObject> sfGroupRef : this.groupRef.getReferenced().getChildren()) {
						if (sfGroupRef.getReferenced() instanceof PBXGroup) {
							PBXGroup sfGroup = (PBXGroup) sfGroupRef.getReferenced();
							if (SUPPORTING_FILES_GROUP_NAME.equals(sfGroup.getName())) {
								this.supportingFilesGroupRef = (PBXObjectRef<PBXGroup>)sfGroupRef;
								break;
							}
						}
					}
					break;
				}
			}
		}
	}

	/**
	 * Returns the Gradle source set name.
	 *
	 * @return source set name
	 */
	public String getSourceSet() {
		return sourceSet;
	}

	/**
	 * Returns the target's name.
	 *
	 * @return target's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the target reference.
	 *
	 * @return target reference
	 */
	public PBXObjectRef<PBXNativeTarget> getTargetRef() {
		return targetRef;
	}

	/**
	 * Returns the debug configuration reference.
	 *
	 * @return debug configuration reference
	 */
	public PBXObjectRef<XCBuildConfiguration> getDebugConfigurationRef() {
		return debugConfigurationRef;
	}

	/**
	 * Returns the release configuration reference.
	 *
	 * @return release configuration reference
	 */
	public PBXObjectRef<XCBuildConfiguration> getReleaseConfigurationRef() {
		return releaseConfigurationRef;
	}

	/**
	 * Returns the configuration list reference.
	 *
	 * @return configuration list reference
	 */
	public PBXObjectRef<XCConfigurationList> getConfigurationListRef() {
		return configurationListRef;
	}

	/**
	 * Returns the group reference.
	 *
	 * @return group reference
	 */
	public PBXObjectRef<PBXGroup> getGroupRef() {
		return groupRef;
	}

	/**
	 * Returns the supporting files group reference.
	 *
	 * @return supporting files group reference
	 */
	public PBXObjectRef<PBXGroup> getSupportingFilesGroupRef() {
		return supportingFilesGroupRef;
	}

	/**
	 * Returns the target.
	 *
	 * @return target
	 */
	public PBXNativeTarget getTarget() {
		return targetRef.getReferenced();
	}

	/**
	 * Returns the debug configuration.
	 *
	 * @return debug configuration
	 */
	public XCBuildConfiguration getDebugConfiguration() {
		return debugConfigurationRef.getReferenced();
	}

	/**
	 * Returns the release configuration.
	 *
	 * @return release configuration
	 */
	public XCBuildConfiguration getReleaseConfiguration() {
		return releaseConfigurationRef.getReferenced();
	}

	/**
	 * Returns the configuration list.
	 *
	 * @return configuration list
	 */
	public XCConfigurationList getConfigurationList() {
		return configurationListRef.getReferenced();
	}

	/**
	 * Returns the group.
	 *
	 * @return group
	 */
	public PBXGroup getGroup() {
		return groupRef.getReferenced();
	}

	/**
	 * Returns the supporting files group.
	 *
	 * @return supporting files group
	 */
	public PBXGroup getSupportingFilesGroup() {
		return supportingFilesGroupRef.getReferenced();
	}

	/**
	 * Creates the default structure of this target.
	 *
	 * @param productName product name
	 * @param config configuration
	 */
	private void create(String productName, Configuration config) {
		// Create target
		this.targetRef = helper.createTarget(name);

		// Create configurations & list
		this.configurationListRef = helper.createBuildConfigList();
		getTarget().setBuildConfigurationList(configurationListRef);
		getConfigurationList().setDefaultConfigurationIsVisible("0");
		this.debugConfigurationRef = createBuildConfig(true, productName, config);
		getConfigurationList().getBuildConfigurations().add(debugConfigurationRef);
		this.releaseConfigurationRef = createBuildConfig(false, productName, config);
		getConfigurationList().getBuildConfigurations().add(releaseConfigurationRef);

		// Create groups
		this.groupRef = helper.createGroup(name, Generator.SOURCE_TREE_GROUP);
		this.supportingFilesGroupRef = helper.getFile().newPBXGroup(SUPPORTING_FILES_GROUP_NAME, null, Generator.SOURCE_TREE_GROUP);
		getGroup().getChildren().add(supportingFilesGroupRef);
	}

	/**
	 * Create a target build configuration.
	 *
	 * @param debug debug mode
	 * @param productName product name
	 * @param config configuration
	 * @return build configuration
	 */
	private PBXObjectRef<XCBuildConfiguration> createBuildConfig(boolean debug, String productName, Configuration config) {
		XCBuildConfiguration c = new XCBuildConfiguration();
		c.setName(debug ? "Debug" : "Release");
		BuildSettingsHelper.addTargetConfig(c.getBuildSettings(), debug, productName, config);
		return helper.addAndReturn(c);
	}

	/**
	 * Creates and adds a PBXShellScriptBuildPhase.
	 *
	 * @return PBXShellScriptBuildPhase reference
	 */
	@SuppressWarnings({"unchecked"})
	public PBXObjectRef<PBXShellScriptBuildPhase> createShellScriptBuildPhase() {
		// Create phase
		PBXObjectRef<PBXShellScriptBuildPhase> phaseRef = helper.addAndReturn(new PBXShellScriptBuildPhase());

		// Add phase to target
		getTarget().getBuildPhases().add((PBXObjectRef) phaseRef);

		// Setup phase & return
		PBXShellScriptBuildPhase buildPhase = phaseRef.getReferenced();
		buildPhase.setBuildActionMask("2147483647");
		buildPhase.getFiles();
		buildPhase.getInputPaths();
		buildPhase.getOutputPaths();
		buildPhase.setRunOnlyForDeploymentPostprocessing("0");
		return phaseRef;
	}

	/**
	 * Creates and adds a PBXFrameworksBuildPhase.
	 *
	 * @return PBXFrameworksBuildPhase reference
	 */
	@SuppressWarnings({"unchecked"})
	public PBXObjectRef<PBXFrameworksBuildPhase> createFrameworksBuildPhase() {
		// Create phase
		PBXObjectRef<PBXFrameworksBuildPhase> phaseRef = helper.addAndReturn(new PBXFrameworksBuildPhase());

		// Add phase to target
		getTarget().getBuildPhases().add((PBXObjectRef) phaseRef);

		// Setup phase & return
		PBXFrameworksBuildPhase buildPhase = phaseRef.getReferenced();
		buildPhase.setBuildActionMask("2147483647");
		buildPhase.getFiles();
		buildPhase.setRunOnlyForDeploymentPostprocessing("0");
		return phaseRef;
	}

	/**
	 * Creates and adds a PBXResourcesBuildPhase.
	 *
	 * @return PBXResourcesBuildPhase reference
	 */
	@SuppressWarnings({"unchecked"})
	public PBXObjectRef<PBXResourcesBuildPhase> createResourcesBuildPhase() {
		// Create phase
		PBXObjectRef<PBXResourcesBuildPhase> phaseRef = helper.addAndReturn(new PBXResourcesBuildPhase());

		// Add phase to target
		getTarget().getBuildPhases().add((PBXObjectRef) phaseRef);

		// Setup phase & return
		PBXResourcesBuildPhase buildPhase = phaseRef.getReferenced();
		buildPhase.setBuildActionMask("2147483647");
		buildPhase.getFiles();
		buildPhase.setRunOnlyForDeploymentPostprocessing("0");
		return phaseRef;
	}

	/**
	 * Creates and adds a PBXSourcesBuildPhase.
	 *
	 * @return PBXSourcesBuildPhase reference
	 */
	@SuppressWarnings({"unchecked"})
	public PBXObjectRef<PBXSourcesBuildPhase> createSourcesBuildPhase() {
		// Create phase
		PBXObjectRef<PBXSourcesBuildPhase> phaseRef = helper.addAndReturn(new PBXSourcesBuildPhase());

		// Add phase to target
		getTarget().getBuildPhases().add((PBXObjectRef) phaseRef);

		// Setup phase & return
		PBXSourcesBuildPhase buildPhase = phaseRef.getReferenced();
		buildPhase.setBuildActionMask("2147483647");
		buildPhase.getFiles();
		buildPhase.setRunOnlyForDeploymentPostprocessing("0");
		return phaseRef;
	}

	/**
	 * Creates and adds a PBXCopyFilesBuildPhase.
	 *
	 * @return PBXCopyFilesBuildPhase reference
	 */
	@SuppressWarnings({"unchecked"})
	public PBXObjectRef<PBXCopyFilesBuildPhase> createCopyFilesBuildPhase() {
		// Create phase
		PBXObjectRef<PBXCopyFilesBuildPhase> phaseRef = helper.addAndReturn(new PBXCopyFilesBuildPhase());

		// Add phase to target
		getTarget().getBuildPhases().add((PBXObjectRef) phaseRef);

		// Setup phase & return
		PBXCopyFilesBuildPhase buildPhase = phaseRef.getReferenced();
		buildPhase.setBuildActionMask("2147483647");
		buildPhase.getFiles();
		buildPhase.setRunOnlyForDeploymentPostprocessing("0");
		return phaseRef;
	}

	/**
	 * Adds a new file reference to this target.
	 *
	 * @param fileName          file name (and path)
	 * @param explFileType      explicit file type
	 * @param lastKnownFileType last known file type
	 * @param sourceTree        source tree
	 * @return created reference as a FileResult
	 * @throws IOException
	 */
	public FileResult createFile(String fileName, String explFileType, String lastKnownFileType, String sourceTree)
			throws IOException {
		// Get parent directory for file (the targets folder) & create it
		File parent = helper.getFileManager().createDirectoryInRoot(name);

		// Check for dynamic file type request
		if (lastKnownFileType.length() == 0) {
			lastKnownFileType = FileTypeUtil.getFileType(fileName);
		}

		// Create file reference
		PBXObjectRef<PBXFileReference> fileRefRef = helper.addAndReturn(new PBXFileReference());
		PBXFileReference fileRef = fileRefRef.getReferenced();
		fileRef.setExplicitFileType(explFileType);
		fileRef.setLastKnownFileType(lastKnownFileType);
		fileRef.setPath(fileName);
		fileRef.setSourceTree(sourceTree);

		// Return result
		return new FileResult(new File(parent, fileName), fileRefRef);
	}
}
