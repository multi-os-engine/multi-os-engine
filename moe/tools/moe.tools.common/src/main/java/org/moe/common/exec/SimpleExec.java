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

package org.moe.common.exec;

import org.moe.common.utils.OsUtils;

import java.io.File;

public class SimpleExec extends AbstractExec {
	static private String lookupCommand;

	static {
		if (OsUtils.isMac()) {
			lookupCommand = "which";
		} else if (OsUtils.isWindows()) {
			lookupCommand = "where";
		}
	}

	private SimpleExec(String name) {
		super(name, null);
	}

	private SimpleExec(String name, File workingDir) {
		super(name, workingDir);
	}

	@Override
	protected String lookupExec() {
		return null;
	}

	public static SimpleExec getExec(String name) {
		return new SimpleExec(name);
	}

	public static SimpleExec getExec(String name, File workingDir) {
		return new SimpleExec(name, workingDir);
	}

	public static SimpleExec getXcodeSelect() {
		return getExec("xcode-select");
	}

	public static SimpleExec getOpen(String app, String file) {
		SimpleExec exec = getExec("open");
		if (app != null) {
			exec.getArguments().add("-a");
			exec.getArguments().add(app);
		}
		if (file != null) {
			exec.getArguments().add(file);
		}
		return exec;
	}

	public static SimpleExec getWhich(String app) {
		SimpleExec exec = getExec(lookupCommand);
		if (app != null) {
			exec.getArguments().add(app);
		}
		return exec;
	}

	public static SimpleExec getRevealInFinder(String path) {
		if (path == null) {
			throw new NullPointerException();
		}
		SimpleExec exec = getExec("osascript");
		exec.getArguments().add("-e");
		exec.getArguments().add("tell application \"Finder\" to reveal POSIX file " + "\"" + path + "\"" + " activate");
		return exec;
	}

}
