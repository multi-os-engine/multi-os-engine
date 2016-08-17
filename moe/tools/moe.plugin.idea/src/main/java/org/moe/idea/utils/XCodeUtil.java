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


package org.moe.idea.utils;

import com.intellij.openapi.diagnostic.Logger;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.moe.idea.utils.logger.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class XCodeUtil {

    private static final Logger LOG = LoggerFactory.getLogger(XCodeUtil.class);

	public static final String PLATFORM_IOS = Configuration.PLATFORM_IOS;
	public static final String PLATFORM_OSX = Configuration.PLATFORM_OSX;

	private XCodeUtil() {
	}

	public static String getDeveloperPath() {
		SimpleExec exec = SimpleExec.getXcodeSelect();
		exec.getArguments().add("-p");

		String out = null;
		try {
			out = ExecOutputCollector.collect(exec);
		} catch(Exception e) {

		}

		if ((out == null) || out.isEmpty()) {
			LOG.debug("Failed to get Xcode developer path");

			return null;
		}

		return out;
	}

	public static String getXcodePath() {
		final String suffix = "/Contents/Developer";

		String path = getDeveloperPath();

		if (path == null) {
			LOG.debug("Failed to get Xcode.app path, developer path is null, falling back to /Applications/Xcode.app");
			return null;
		}

		if (path.endsWith(suffix)) {
			path = path.substring(0, path.length() - suffix.length());
		}
		else if (path.endsWith(suffix + "/")) {
			path = path.substring(0, path.length() - suffix.length() + 1);
		}

		if (!path.endsWith(".app")) {
			LOG.debug("Failed to get Xcode.app path, didn't find .app file");
			return null;
		}

		return path;
	}

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

	public static String getDocsetPath() {
		String dev = getDeveloperPath();

		if (dev == null) {
			return null;
		}

		File ds = new File(dev, "Documentation/DocSets");

		return ds.getAbsolutePath();
	}
}
