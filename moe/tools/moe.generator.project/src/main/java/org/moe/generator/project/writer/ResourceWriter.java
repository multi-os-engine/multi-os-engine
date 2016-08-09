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

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * ResourceWriter writes a resource from an input stream to an external file with support for placeholder replacement.
 */
class ResourceWriter {

	/**
	 * Content writer.
	 */
	private final ContentWriter w;

	/**
	 * Input stream.
	 */
	private final InputStream inputStream;

	/**
	 * Map for placeholders.
	 */
	private final HashMap<String, String> placeholders = new HashMap<String, String>();

	/**
	 * List for enabled placeholders.
	 */
	private final ArrayList<String> enabledRegions = new ArrayList<String>();

	/**
	 * Creates a new ResourceWriter instance.
	 *
	 * @param file        file to write into
	 * @param inputStream input stream
	 */
	ResourceWriter(File file, InputStream inputStream) {
		if (file == null || inputStream == null) {
			throw new NullPointerException();
		}
		this.inputStream = inputStream;
		w = new ContentWriter(file);
	}

	/**
	 * Add a key-value pair into the placeholder map.
	 *
	 * @param placeholder placeholder name
	 * @param value       value
	 */
	void setPlaceholder(String placeholder, String value) {
		if (placeholder == null || value == null) {
			throw new NullPointerException();
		}
		placeholders.put("${_PLACEHOLDER_" + placeholder + "}", value);
	}

	/**
	 * Add enabled region.
	 *
	 * @param region region to enable
	 */
	void enableRegion(String region) {
		if (region == null) {
			throw new NullPointerException();
		}
		enabledRegions.add(region);
	}

	/**
	 * Write to file and close.
	 */
	void writeAndClose() {
		Stack<String> regionStack = new Stack<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
		String line;
		try {
			while ((line = br.readLine()) != null) {
				if (checkRegion(line, regionStack)) {
					continue;
				}
				if (regionStack.size() > 0 && regionStack.peek().startsWith("-")) {
					continue;
				}
				for (Map.Entry<String, String> next : placeholders.entrySet()) {
					line = line.replaceAll(Pattern.quote(next.getKey()), next.getValue());
				}
				w.wl(line);
			}

			// Done with the file
			br.close();
		} catch (IOException e) {
			throw new RuntimeException("Failed to write to file", e);
		}
		w.close();
	}

	private boolean checkRegion(String line, Stack<String> regionStack) {
		// Push
		if (line.startsWith("//<<---REGION:")) {
			String region = line.substring("//<<---REGION:".length());
			boolean enabled = enabledRegions.contains(region);
			if (regionStack.size() > 0 && regionStack.peek().startsWith("-")) {
				enabled = false;
			}
			regionStack.push((enabled ? "+" : "-") + region);
			return true;
		}
		// Pop
		else if (line.startsWith("//>>---REGION:")) {
			String region = line.substring("//>>---REGION:".length());
			if (regionStack.size() == 0) {
				throw new IllegalStateException("Number of region starts must match the number of region ends");
			}
			String top = regionStack.pop();
			if (top.length() != region.length() + 1 || !top.endsWith(region)) {
				throw new IllegalStateException("Number of region starts must match the number of region ends");
			}
			return true;
		}
		return false;
	}
}
