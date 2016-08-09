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

import java.util.Map;

@SuppressWarnings("unchecked")
public class PBXReferenceProxy extends PBXObject {

	public static final String FILE_TYPE_KEY = "fileType";
	public static final String PATH_KEY = "path";
	public static final String REMOTE_REF_KEY = "remoteRef";
	public static final String SOURCE_TREE_KEY = "sourceTree";

	public PBXReferenceProxy(Dictionary<Value, NextStep> dict) {
		super(dict);
	}

	public PBXReferenceProxy() {
		super(null);
		setIsa(this.getClass().getSimpleName());
	}

	@Override
	public String getCommentString() {
		return getPath();
	}

	@Override
	public void connectReferences(Map<String, Value> map) {
		connectReferencesInValue(REMOTE_REF_KEY, map);
	}

	@Override
	public void update() {
	}

	@Override
	public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
		if (ref.equals(getRemoteRef())) {
			setRemoteRef(null);
		}
	}

	/** Fields **/

	public String getFileType() {
		return getStringValue(FILE_TYPE_KEY);
	}

	public void setFileType(String value) {
		setStringValue(FILE_TYPE_KEY, value);
	}

	public String getPath() {
		return getStringValue(PATH_KEY);
	}

	public void setPath(String value) {
		setStringValue(PATH_KEY, value);
	}

	public PBXObjectRef<PBXContainerItemProxy> getRemoteRef() {
		return (PBXObjectRef<PBXContainerItemProxy>) getPBXObjectRefValue(REMOTE_REF_KEY);
	}

	public void setRemoteRef(PBXObjectRef<PBXContainerItemProxy> value) {
		setPBXObjectRefValue(REMOTE_REF_KEY, value);
	}

	public String getSourceTree() {
		return getStringValue(SOURCE_TREE_KEY);
	}

	public void setSourceTree(String value) {
		setStringValue(SOURCE_TREE_KEY, value);
	}

}
