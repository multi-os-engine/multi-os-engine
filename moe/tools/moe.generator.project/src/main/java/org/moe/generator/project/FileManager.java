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

import java.io.File;
import java.io.IOException;

/**
 * FileManager adds utility methods to for file and directory management and creation.
 */
public class FileManager {

	/**
	 * File for the project root.
	 */
	private File projectRoot;

	/**
	 * Creates a new FileManager instance.
	 *
	 * @param projectRoot project root.
	 */
	public FileManager(File projectRoot) {
		this.projectRoot = projectRoot;
	}

	/**
	 * Returns a File object pointing to the specified sub path under root.
	 *
	 * @param paths sub paths
	 * @return File
	 */
	public File getFileInRoot(String... paths) {
		return getFile(paths, false);
	}

	/**
	 * Returns a File object pointing to the specified sub path.
	 *
	 * @param paths  sub paths
	 * @param noRoot is not in root
	 * @return File
	 */
	private File getFile(String[] paths, boolean noRoot) {
		File f;
		if (noRoot) {
			f = new File("");
		} else {
			f = projectRoot;
		}
		for (String path : paths) {
			f = new File(f, path);
		}
		return f;
	}

	/**
	 * Returns a File object pointing to the specified sub path under root and creates the directory.
	 *
	 * @param paths sub paths
	 * @return File
	 */
	public File createDirectoryInRoot(String... paths) throws IOException {
		File file = getFileInRoot(paths);
		if (!file.exists() && !file.mkdirs()) {
			throw new IOException("Failed to create directory " + file);
		}
		if (!file.isDirectory()) {
			throw new IOException("Found a file instead of a directory" + file);
		}
		return file;
	}
}
