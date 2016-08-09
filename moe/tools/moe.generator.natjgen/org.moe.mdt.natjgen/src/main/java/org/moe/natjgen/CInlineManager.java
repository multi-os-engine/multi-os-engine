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

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.moe.natjgen.util.FileUtil;
import org.eclipse.core.runtime.CoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CInlineManager {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(CInlineManager.class);

	List<String> functions = new ArrayList<String>();
	Set<String> includes = new HashSet<String>();
	CManager cManager;
	String unitName;
	final File nativeOutputPath;

	public CInlineManager(CManager cManager, File nativeOutputPath) {
		this.cManager = cManager;
		unitName = cManager.getUnitName();
		this.nativeOutputPath = nativeOutputPath;
	}

	public boolean addFunction(CFunction f) {
		final String RETURN_TYPE = f.getType().getTypeSpelling();
		final String NAME = f.getName();

		// Create argument list and argument definition list
		final StringBuilder argsDef = new StringBuilder();
		final StringBuilder args = new StringBuilder();
		ArrayList<CalleeArgument> l = f.getArguments();
		for (int i = 0; i < l.size(); i++) {
			CalleeArgument arg = l.get(i);
			Type t = arg.getType();
			String cTypeName = t.getTypeSpelling();
			argsDef.append(cTypeName).append(' ').append(arg.getName());
			args.append(arg.getName());
			if (i < l.size() - 1) {
				argsDef.append(", ");
				args.append(", ");
			}
		}

		final String ARGS_DEF = argsDef.toString();
		final String ARGS = args.toString();
		final String RETURN = f.getType().isVoid() ? "" : "return ";

		// @formatter:off
		String resource = ""
				+ "EXPORT " + RETURN_TYPE + " __natj_inline_" + NAME + "(" + ARGS_DEF + ") {\n"
				+ "\t" + RETURN + NAME + "(" + ARGS + ");\n"
				+ "}\n";
		// @formatter:on

		functions.add(resource);

		for (String location : f.getLocations()) {
			String loc = "#import <" + cManager.getIndexer().getConfiguration().getIncludePathForHeader(location) + ">";
			includes.add(loc);
		}

		return true;
	}

	private static final String EXTENSION = "m";

	public boolean endEdit() throws CoreException {
		if (functions.isEmpty()) {
			return true;
		}

		LOG.debug("Generating inline wrapper for " + unitName);

		final String OBJC_CLASS = unitName;

		// Create includes list
		final StringBuilder incls = new StringBuilder();
		ArrayList<String> sortedIncludes = new ArrayList<String>(includes);
		Collections.sort(sortedIncludes);
		for (String s : sortedIncludes) {
			incls.append(s).append('\n');
		}
		final String INCLUDES = incls.toString();

		// Create body list
		final StringBuilder body = new StringBuilder();
		for (String s : functions) {
			body.append(s).append('\n');
		}
		final String BODY = body.toString();

		// @formatter:off
		String resource = ""
				+ "//\n"
				+ "//  " + OBJC_CLASS + ".m\n"
				+ "//\n"
				+ "\n"
				+ INCLUDES + "\n"
				+ "\n"
				+ "#define EXPORT __attribute__ ((visibility (\"default\")))\n"
				+ "\n"
				+ BODY + "\n";
		// @formatter:on

		if (!FileUtil.writeResource(nativeOutputPath, unitName, EXTENSION, resource)) {
			LOG.debug("Unable to generate inline wrapper " + unitName);
			return false;
		}

		LOG.debug("Inline wrapper " + unitName + " is generated");

		return true;
	}

}
