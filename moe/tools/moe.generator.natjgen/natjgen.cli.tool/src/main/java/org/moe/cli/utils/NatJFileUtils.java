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

package org.moe.cli.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.annotation.NonNull;

/**
 * This class implements the most often used operations with files
 */
public class NatJFileUtils {

	/**
	 * The root temporary direction for the specific wrapnatjgen's launch
	 */
	private static File tmpDir = null;

	/**
	 * The method deletes all temporary files created during the launch
	 */
	private static void recursiveDeleteOnShutdownHook() {
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					FileUtils.deleteDirectory(tmpDir);
				} catch (IOException e) {
					throw new RuntimeException("Failed to delete " + tmpDir, e);
				}
			}
		}));
	}

	/**
	 * @return {@link #tmpDir}
	 */
	private static File getBaseTempDirectory() throws IOException {
		if (tmpDir == null) {
			Path tmpPath = Files.createTempDirectory("wrapnatjgen_temp_");
			if (tmpPath == null || !tmpPath.toFile().isDirectory() || !tmpPath.toFile().exists())
				throw new IOException();
			else
				tmpDir = tmpPath.toFile();
			recursiveDeleteOnShutdownHook();
		}
		return tmpDir.getCanonicalFile();
	}

	/**
	 * Creates a new temporary directory as a subdirectory of the {@link #tmpDir}
	 * @return new temporary directory
	 * @throws IOException
	 */
	public static @NonNull File getNewTempDirectory() throws IOException {
		final File temp;

		temp = new File(getBaseTempDirectory(), Long.toString(System.nanoTime()));

		if (!(temp.mkdir())) {
			throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
		}
		return temp;
	}
	
	/**
	 * Copies directory keeping symbolic links working
	 * @param srcDir
	 * @param destDir
	 * @throws IOException 
	 */
	public static void copyDirectoryWithSymbolicLinks(@NonNull File srcDir, @NonNull File destDir) throws IOException {
		if ( !srcDir.isDirectory() ) 
			throw new IOException("Invalid framework file: " + srcDir + " is not a directory!");
		
		File[] frameworkFiles = srcDir.listFiles();
		for( File file : frameworkFiles ) {
			try {
				boolean isSymlink = FileUtils.isSymlink(file);
				if(isSymlink) {
					Path target = Files.readSymbolicLink(file.toPath());
					File newLink = new File( destDir, file.getName() );
					Files.createSymbolicLink(newLink.toPath(), target);
				} else {
					if ( file.isDirectory() ) {
						File nextDestDir = new File(destDir, file.getName());
						copyDirectoryWithSymbolicLinks(file, nextDestDir);
					} else {
						FileUtils.copyFileToDirectory(file, destDir);
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
