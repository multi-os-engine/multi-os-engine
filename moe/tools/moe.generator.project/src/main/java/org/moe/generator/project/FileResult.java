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

import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXObjectRef;

import java.io.File;

/**
 * The FileResult class stores a File-PBXFileReference pair.
 */
public class FileResult {

	/**
	 * File.
	 */
	private final File file;

	/**
	 * File reference.
	 */
	private final PBXObjectRef<PBXFileReference> fileRef;

	/**
	 * Creates a new FileResult instance.
	 *
	 * @param file    file
	 * @param fileRef file reference
	 */
	public FileResult(File file, PBXObjectRef<PBXFileReference> fileRef) {
		this.file = file;
		this.fileRef = fileRef;
	}

	/**
	 * Returns the file.
	 *
	 * @return file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Returns the file reference.
	 *
	 * @return file reference
	 */
	public PBXObjectRef<PBXFileReference> getFileRef() {
		return fileRef;
	}

}
