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

package org.moe.natjgen;

public class ObjCAttributeInfo {

	/**
	 * IBAction attribute kind
	 */
	public static final int IBACTION = 0;

	/**
	 * IBOutlet attribute kind
	 */
	public static final int IBOUTLET = 1;

	/**
	 * IBOutletCollection attribute kind
	 */
	public static final int IBOUTLETCOLLECTION = 2;

	/**
	 * The kind of the attribute
	 */
	private final int kind;

	/**
	 * The value of the attribute
	 */
	private final String value;

	/**
	 * Create a new {@link ObjCAttributeInfo} object
	 * 
	 * @param kind
	 *            kind of the attribute
	 */
	public ObjCAttributeInfo(int kind) {
		this(kind, null);
	}

	/**
	 * Create a new {@link ObjCAttributeInfo} object
	 * 
	 * @param kind
	 *            kind of the attribute
	 * @param value
	 *            value of the attribute
	 */
	public ObjCAttributeInfo(int kind, String value) {
		if (kind < IBACTION || kind > IBOUTLETCOLLECTION) {
			throw new IllegalArgumentException();
		}

		if (kind != IBOUTLETCOLLECTION && value != null) {
			throw new IllegalArgumentException();
		}

		if (kind == IBOUTLETCOLLECTION && value == null) {
			throw new IllegalArgumentException();
		}

		this.kind = kind;
		this.value = value;
	}

	/**
	 * Returns the attibute's kind
	 * 
	 * @return kind
	 */
	public int getKind() {
		return kind;
	}

	/**
	 * Returns the attribute's value
	 * 
	 * @return
	 */
	public String getValue() {
		return value;
	}

}
