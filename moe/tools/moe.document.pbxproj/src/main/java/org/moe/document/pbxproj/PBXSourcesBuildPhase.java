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

import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

public final class PBXSourcesBuildPhase extends PBXBuildPhase {

	public PBXSourcesBuildPhase(Dictionary<Value, NextStep> dict) {
		super(dict);
	}

	public PBXSourcesBuildPhase() {
		super(null);
		setIsa(this.getClass().getSimpleName());
	}

	@Override
	public String getCommentString() {
		return "Sources";
	}

}
