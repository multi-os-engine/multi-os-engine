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

package org.moe.generator.project.writer;

import java.io.File;
import java.util.List;

/**
 * PlistWriter is a simple writer class for plist files.
 */
class PlistWriter {

	/**
	 * Content Writer.
	 */
	private final ContentWriter w;

	/**
	 * Creates a new PlistWriter instance.
	 *
	 * @param file file to write into.
	 */
	PlistWriter(File file) {
		w = new ContentWriter(file);
		w.w("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
		w.w("<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">\n");
		w.w("<plist version=\"1.0\">\n");
		w.w("<dict>\n");
	}

	/**
	 * Closes the plist.
	 */
	void close() {
		w.w("</dict>\n");
		w.w("</plist>\n");
		w.close();
	}

	/**
	 * Adds a String value into the plist.
	 *
	 * @param key   key
	 * @param value value
	 */
	void addString(String key, String value) {
		writeTag("key", key);
		writeTag("string", value);
	}

	/**
	 * Adds a boolean value into the plist.
	 *
	 * @param key   key
	 * @param value value
	 */
	void addBoolean(String key, boolean value) {
		writeTag("key", key);
		if (value) {
			w.w("\t<true/>\n");
		} else {
			w.w("\t<false/>\n");
		}
	}

	/**
	 * Adds a String array value into the plist.
	 *
	 * @param key    key
	 * @param values values
	 */
	void addStringList(String key, List<String> values) {
		writeTag("key", key);
		w.w("\t<array>\n");
		for (String value : values) {
			w.w("\t");
			writeTag("string", value);
		}
		w.w("\t</array>\n");
	}

	/**
	 * Writes a tag.
	 *
	 * @param name  name
	 * @param value value
	 */
	private void writeTag(String name, String value) {
		w.w("\t<" + name + ">" + value + "</" + name + ">\n");
	}
}
