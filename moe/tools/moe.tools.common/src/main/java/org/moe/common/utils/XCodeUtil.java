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


package org.moe.common.utils;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.File;
import java.io.IOException;

/**
 * Utility class for Xcode.
 */
public class XCodeUtil {

	/**
	 * Configurations.
	 * // TODO: remove
	 */
	public static class Configuration {
		/**
		 * Platform: iOS.
		 */
		public final static String PLATFORM_IOS = "iOS";
		/**
		 * Platform: macOS.
		 */
		public final static String PLATFORM_OSX = "OS X";
	}

	/**
	 * Platform: iOS.
	 */
	public static final String PLATFORM_IOS = Configuration.PLATFORM_IOS;
	/**
	 * Platform: macOS.
	 */
	public static final String PLATFORM_OSX = Configuration.PLATFORM_OSX;

	/**
	 * Creates a new XCodeUtil instance.
	 */
	private XCodeUtil() {
	}

	/**
	 * Return the Xcode developer path.
	 * @return Developer path or null on error.
	 */
	public static String getDeveloperPath() {
		SimpleExec exec = SimpleExec.getXcodeSelect();
		exec.getArguments().add("-p");

		String out = null;
		try {
			out = ExecOutputCollector.collect(exec);
		} catch(Exception e) {

		}

		if ((out == null) || out.isEmpty()) {
			return null;
		}

		return out;
	}

	/**
	 * Returns the path to Xcode.
	 * @return Path to Xcode
	 */
	public static String getXcodePath() {
		final String suffix = "/Contents/Developer";

		String path = getDeveloperPath();

		if (path == null) {
			return null;
		}

		if (path.endsWith(suffix)) {
			path = path.substring(0, path.length() - suffix.length());
		}
		else if (path.endsWith(suffix + "/")) {
			path = path.substring(0, path.length() - suffix.length() + 1);
		}

		if (!path.endsWith(".app")) {
			return null;
		}

		return path;
	}

	/**
	 * Opens the specified file with Xcode.
	 * @param file File to open
	 * @throws IOException if an I/O error occurs
	 */
	public static void openWithXcode(String file) throws IOException {
		if (file == null) {
			throw new NullPointerException();
		}

		String xcodePath = getXcodePath();

		if (xcodePath == null) {
			return;
		}

		SimpleExec exec = SimpleExec.getOpen(xcodePath, file);
		exec.getArguments().add("-R");
		exec.getRunner().run(null);
	}

	/**
	 * Returns the path to the Xcode platform SDKs.
	 * @param platform Platform
	 * @return Path to platform SDKs
	 */
	public static String getPlatformSDKsPath(String platform) {
		if (platform.equalsIgnoreCase(PLATFORM_IOS)) {
			String dev = getDeveloperPath();
			if (dev == null) {
				return null;
			}

			return dev + "/Platforms/iPhoneOS.platform/Developer/SDKs/";
		}
		else if (platform.equalsIgnoreCase(PLATFORM_OSX)) {
			String dev = getDeveloperPath();
			if (dev == null) {
				return null;
			}

			return dev + "/Platforms/MacOSX.platform/Developer/SDKs/";
		}
		else {
			return null;
		}
	}

	/**
	 * Returns the path to Xcode's DocSets.
	 * @return Path to Xcode's DocSets
	 */
	public static String getDocsetPath() {
		String dev = getDeveloperPath();

		if (dev == null) {
			return null;
		}

		File ds = new File(dev, "Documentation/DocSets");

		return ds.getAbsolutePath();
	}
}
