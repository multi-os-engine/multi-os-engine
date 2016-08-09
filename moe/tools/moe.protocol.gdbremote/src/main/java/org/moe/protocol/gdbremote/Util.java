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

package org.moe.protocol.gdbremote;

import java.util.*;

class Util {

	/**
	 * Construct a map from a string.
	 *
	 * @param string
	 *            string containing the map
	 * @param entryDelim
	 *            entry delimiter string
	 * @param kvDelim
	 *            key-value delimiter string
	 * @return constructed map
	 */
	static Map<String, String> converToMap(String string, String entryDelim,
			String kvDelim) {
		String entry_d = "\\Q" + entryDelim + "\\E";
		String entries[] = string.split(entry_d);
		HashMap<String, String> map = new HashMap<String, String>(
				entries.length);
		for (String entry : entries) {
			if (entry.length() == 0) {
				continue;
			}
			int idx = entry.indexOf(kvDelim);
			if (idx < 0) {
				map.put(entry, null);
			} else {
				map.put(entry.substring(0, idx),
						entry.substring(idx + kvDelim.length()));
			}
		}
		return map;
	}

	/**
	 * Construct a list from a string.
	 *
	 * @param string
	 *            string containing the list
	 * @param delim
	 *            element delimiter string
	 * @return constructed list
	 */
	static List<String> convertToList(String string, String delim) {
		String elem_d = "\\Q" + delim + "\\E";
		String elems[] = string.split(elem_d);
		return new ArrayList<String>(Arrays.asList(elems));
	}

}
