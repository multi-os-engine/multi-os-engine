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

public final class JavaRestrictions {

	/**
	 * An array of special names reserved by Java
	 */
	private static final String javaReserved[] = new String[] {
			"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue",
			"default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "finalize",
			"goto", "if", "implements", "import", "instanceof", "int", "interface", "load", "long", "native", "new",
			"notify", "notifyAll", "null", "package", "private", "protected", "public", "return", "short", "static",
			"strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void",
			"volatile", "wait", "while"
	};

	/**
	 * Tells whether the given name is reserved by Java or not
	 * 
	 * @param name
	 *            the name to check
	 * @return true if reserved otherwise false
	 */
	public static boolean isReserved(String name) {
		for (String res : javaReserved) {
			if (res.equals(name)) {
				return true;
			}
		}
		return false;
	}

}
