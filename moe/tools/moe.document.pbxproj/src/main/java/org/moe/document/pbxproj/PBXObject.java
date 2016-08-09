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

import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class PBXObject extends Dictionary<Value, NextStep> {

	public static final String ISA_KEY = "isa";

	protected PBXObject(Dictionary<Value, NextStep> dict) {
		super(dict);
	}

	public abstract String getCommentString();

	public abstract void connectReferences(Map<String, Value> map);

	public abstract void removeReference(PBXObjectRef<? extends PBXObject> ref);

	public void update() {

	}

	protected void connectReferencesInValue(String key, Map<String, Value> map) {
		Value value = (Value) getValue(key);
		if (value != null) {
			replaceValue(key, map.get(value.value));
		}
	}

	protected void connectReferencesInValueArray(String key, Map<String, Value> map) {
		Array<NextStep> array = (Array<NextStep>) getValue(key);
		if (array != null) {
			int count = array.size();
			for (int i = 0; i < count; ++i) {
				Value v = (Value) array.get(i);
				array.set(i, map.get(v.value));
			}
		}
	}

	protected String getStringValue(String key) {
		Value value = (Value) getValue(key);
		if (value != null) {
			return value.value;
		}
		return null;
	}

	protected void setStringValue(String key, String newvalue) {
		if (newvalue == null) {
			remove(key);
		} else {
			Value value = (Value) getValue(key);
			if (value == null) {
				add(new Value(key), new Value(newvalue));
			} else {
				value.value = newvalue;
			}
		}
	}

	protected Array<?> getArrayValue(String key) {
		Array<?> value = (Array<?>) getValue(key);
		if (value != null) {
			return value;
		} else {
			value = new Array<NextStep>();
			add(new Value(key), value);
			return value;
		}
	}

	protected Dictionary<?, ?> getDictionaryValue(String key) {
		Dictionary<?, ?> value = (Dictionary<?, ?>) getValue(key);
		if (value != null) {
			return value;
		} else {
			value = new Dictionary<Value, NextStep>();
			add(new Value(key), value);
			return value;
		}
	}

	protected PBXObjectRef<?> getPBXObjectRefValue(String key) {
		return (PBXObjectRef<?>) getValue(key);
	}

	protected void setPBXObjectRefValue(String key, PBXObjectRef<?> newvalue) {
		if (newvalue == null) {
			remove(key);
		} else {
			Value value = (Value) getValue(key);
			if (value == null) {
				add(new Value(key), newvalue);
			} else {
				replaceValue(key, newvalue);
			}
		}
	}

	/** Fields **/

	public String getIsa() {
		return getStringValue(ISA_KEY);
	}

	public void setIsa(String value) {
		setStringValue(ISA_KEY, value);
	}
}
