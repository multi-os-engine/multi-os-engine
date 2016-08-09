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

package org.moe.document.pbxproj;

import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

@SuppressWarnings("unchecked")
public final class PBXShellScriptBuildPhase extends PBXBuildPhase {

	public static final String INPUT_PATHS_KEY = "inputPaths";
	public static final String OUTPUT_PATHS_KEY = "outputPaths";
	public static final String SHELL_PATH_KEY = "shellPath";
	public static final String SHELL_SCRIPT_KEY = "shellScript";
	public static final String NAME_KEY = "name";

	public PBXShellScriptBuildPhase(Dictionary<Value, NextStep> dict) {
		super(dict);
	}

	public PBXShellScriptBuildPhase() {
		super(null);
		setIsa(this.getClass().getSimpleName());
	}

	@Override
	public String getCommentString() {
		return getName() == null ? "ShellScript" : getName();
	}

	/** Fields **/

	public Array<Value> getInputPaths() {
		return (Array<Value>) getArrayValue(INPUT_PATHS_KEY);
	}

	public Array<Value> getOutputPaths() {
		return (Array<Value>) getArrayValue(OUTPUT_PATHS_KEY);
	}

	public String getShellPath() {
		return getStringValue(SHELL_PATH_KEY);
	}

	public void setShellPath(String value) {
		setStringValue(SHELL_PATH_KEY, value);
	}

	public String getShellScript() {
		return getStringValue(SHELL_SCRIPT_KEY);
	}

	public void setShellScript(String value) {
		setStringValue(SHELL_SCRIPT_KEY, value);
	}

	public String getName() {
		return getStringValue(NAME_KEY);
	}

	public void setName(String value) {
		setStringValue(NAME_KEY, value);
	}

}
