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
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Value;

/**
 * ProjectHelper class adds helper method to simplify some object creation.
 */
public class ProjectHelper {

	/**
	 * Project file.
	 */
	private final ProjFile file;

	/**
	 * File manager.
	 */
	private final FileManager fileManager;

	/**
	 * Creates a new ProjectHelper instance.
	 *
	 * @param file        project file
	 * @param fileManager file manager
	 */
	public ProjectHelper(ProjFile file, FileManager fileManager) {
		if (file == null || fileManager == null) {
			throw new NullPointerException();
		}
		this.file = file;
		this.fileManager = fileManager;
	}

	/**
	 * Returns the project file.
	 *
	 * @return project file
	 */
	public ProjFile getFile() {
		return file;
	}

	/**
	 * Returns the file manager.
	 *
	 * @return file manager
	 */
	public FileManager getFileManager() {
		return fileManager;
	}

	/**
	 * Creates a new PBXGroup.
	 *
	 * @param name       group name
	 * @param sourceTree source tree
	 * @return new PBXGroup
	 */
	public PBXObjectRef<PBXGroup> createGroup(String name, String sourceTree) {
		return file.newPBXGroup(name, name, sourceTree);
	}

	/**
	 * Creates a new PBXProject.
	 *
	 * @param organizationName organization name
	 * @return new PBXProject
	 */
	public PBXObjectRef<PBXProject> createProject(String organizationName) {
		PBXProject p = new PBXProject();
		p.getAttributes().add(new Value("ORGANIZATIONNAME"), new Value(organizationName));
		p.setCompatibilityVersion("Xcode 3.2");
		p.setDevelopmentRegion("English");
		p.setHasScannedForEncodings("0");
		addStrings(p.getKnownRegions(), "en", "Base");
		return addAndReturn(p);
	}

	/**
	 * Creates a new PBXNativeTarget.
	 *
	 * @param name target name
	 * @return new PBXNativeTarget
	 */
	public PBXObjectRef<PBXNativeTarget> createTarget(String name) {
		PBXNativeTarget t = new PBXNativeTarget();
		t.setName(name);
		t.setProductName(name);
		t.setProductType("com.apple.product-type.application");
		return addAndReturn(t);
	}

	/**
	 * Creates a new XCConfigurationList.
	 *
	 * @return new XCConfigurationList
	 */
	public PBXObjectRef<XCConfigurationList> createBuildConfigList() {
		XCConfigurationList l = new XCConfigurationList();
		return addAndReturn(l);
	}

	/**
	 * Adds string values to an Array.
	 *
	 * @param array  array to add to
	 * @param values values to add
	 */
	private void addStrings(Array<Value> array, String... values) {
		for (String value : values) {
			array.add(new Value(value));
		}
	}

	/**
	 * Adds a new Object to the project and returns its reference.
	 *
	 * @param object object to add
	 * @param <T>    type of the object
	 * @return reference to object in the project
	 */
	public <T extends PBXObject> PBXObjectRef<T> addAndReturn(T object) {
		PBXObjectRef<T> ref = file.createReference(object);
		file.getRoot().getObjects().add(ref);
		return ref;
	}
}
