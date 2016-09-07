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

package org.moe.natjgen.cli.manager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.cli.CommandLine;

import org.moe.natjgen.cli.exceptions.WrapNatJGenException;
import org.moe.natjgen.cli.executor.CocoaPodsExecutor;
import org.moe.natjgen.cli.executor.GenerateBindingExecutor;
import org.moe.natjgen.cli.executor.IExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyFrameworkLinkExecutor;
import org.moe.natjgen.cli.executor.ThirdPartyLibraryLinkExecutor;
import org.moe.natjgen.cli.utils.Utils;
import org.moe.natjgen.cli.utils.params.OptionsHandler;

public class ExecutorManager {

	public static IExecutor getExecutorByParams(CommandLine request) throws IOException, InterruptedException, WrapNatJGenException {

		if (request.hasOption(OptionsHandler.HELP.getLongOpt())) {
			OptionsHandler.printHelp();
			return null;
		}

		String packageName = request.hasOption(OptionsHandler.PACKAGE_NAME.getLongOpt())
				? request.getOptionValue(OptionsHandler.PACKAGE_NAME.getLongOpt()) : "org.moe";

		String[] javaSource = request.getOptionValues(OptionsHandler.JAVA_SOURCE.getLongOpt());
		String[] bundle = request.getOptionValues(OptionsHandler.BUNDLE.getLongOpt());
		String ldFlags = null;
		if (request.hasOption(OptionsHandler.LD_FLAGS.getLongOpt())) {
			String ldFlagsPath = request.getOptionValue(OptionsHandler.LD_FLAGS.getLongOpt());
			File ldFlagsFile = new File(ldFlagsPath);
			if (ldFlagsFile.exists()) {
				List<String> lines = Files.readAllLines(ldFlagsFile.toPath());
				StringBuilder strbldr = new StringBuilder();
				for (String line : lines) {
					strbldr.append(line);
					strbldr.append(";");
				}
				ldFlags = strbldr.toString();
				if (ldFlags.startsWith(" "))
					ldFlags = ldFlags.substring(1);
			}
		}

		IExecutor executor = null;
		if (request.hasOption(OptionsHandler.FRAMEWORK.getLongOpt())) {
			String[] frameworks = request.getOptionValues(OptionsHandler.FRAMEWORK.getLongOpt());
			String[] headers = request.getOptionValues(OptionsHandler.HEADERS.getLongOpt());

			if (headers == null) {
				File frameworkFile = null;
				Set<String> headersContent = new HashSet<String>();
				Set<String> frameworkNameSet = new HashSet<String>();

				for (String framework : frameworks) {
					if ((framework == null) || framework.isEmpty()) {
						continue;
					}
					frameworkFile = new File(framework);

					if (!frameworkNameSet.contains(frameworkFile.getName())) {
						File headersFolder = new File(frameworkFile, "Headers");
						if (headersFolder.exists()) {
							headersContent.add(headersFolder.getPath());
						} else {
							System.err.println(String.format("Specify correct path in %s parameter",
									OptionsHandler.FRAMEWORK.getLongOpt()));
							return null; // TODO: Error throwing
						}
					}

					frameworkNameSet.add(frameworkFile.getName());
				}

				headers = headersContent.toArray(new String[0]);
			}

			String outFile = request.getOptionValue(OptionsHandler.OUTPUT_FILE_PATH.getLongOpt());
			if (outFile == null || !outFile.endsWith(".jar")) {
				System.err.println(String.format("Specify jar file in %s parameter",
						OptionsHandler.OUTPUT_FILE_PATH.getLongOpt()));
				return null; // TODO: Error throwing
			}

			executor = new ThirdPartyFrameworkLinkExecutor(packageName, frameworks, javaSource, headers, bundle,
					outFile, ldFlags);
		} else if (request.hasOption(OptionsHandler.LIBRARY.getLongOpt())) {
			String[] library = request.getOptionValues(OptionsHandler.LIBRARY.getLongOpt());
			String[] headers = request.getOptionValues(OptionsHandler.HEADERS.getLongOpt());

			if (headers == null) {
				System.err
						.println(String.format("Specify headers in %s parameter", OptionsHandler.HEADERS.getLongOpt()));
				return null; // TODO: Error throwing
			}

			String outFile = request.getOptionValue(OptionsHandler.OUTPUT_FILE_PATH.getLongOpt());
			if (outFile == null || !outFile.endsWith(".jar")) {
				System.err.println(String.format("Specify jar file in %s parameter",
						OptionsHandler.OUTPUT_FILE_PATH.getLongOpt()));
				return null; // TODO: Error throwing
			}

			executor = new ThirdPartyLibraryLinkExecutor(packageName, library, javaSource, headers, bundle, outFile,
					ldFlags);
		} else if (request.hasOption(OptionsHandler.POD.getLongOpt())) {

			String pod = request.getOptionValue(OptionsHandler.POD.getLongOpt());
			String outFile = request.getOptionValue(OptionsHandler.OUTPUT_FILE_PATH.getLongOpt());
			if (outFile == null || !outFile.endsWith(".jar")) {
				System.err.println(String.format("Specify jar file in %s parameter",
						OptionsHandler.OUTPUT_FILE_PATH.getLongOpt()));
				return null; // TODO: Error throwing
			}
			String jpodSpecRepo = request.getOptionValue(OptionsHandler.JPOD_SPEC_REPO.getLongOpt());

			executor = new CocoaPodsExecutor(pod, outFile, javaSource, jpodSpecRepo, packageName,
					Collections.emptySet());
		} else if (request.hasOption(OptionsHandler.ALL_DEPENDENCIES.getLongOpt())) {
			String pod = request.getOptionValue(OptionsHandler.ALL_DEPENDENCIES.getLongOpt());
			Utils.printDependencies(pod, new HashSet<String>());
		} else {

			String pathToProject = request.getOptionValue(OptionsHandler.PATH_TO_PROJECT.getLongOpt());
			String headers = request.getOptionValue(OptionsHandler.HEADERS.getLongOpt());

			if (pathToProject == null) {
				System.err.println(String.format("Specify correct path in %s parameter",
						OptionsHandler.PATH_TO_PROJECT.getLongOpt()));
				return null; // TODO: Error throwing
			}

			if (headers == null) {
				System.err.println(
						String.format("Specify jar correct path in %s parameter", OptionsHandler.HEADERS.getLongOpt()));
				return null; // TODO: Error throwing
			}

			executor = new GenerateBindingExecutor(pathToProject, packageName, headers,
					request.hasOption(OptionsHandler.CREATE_FROM_PROTOTYPE.getLongOpt()));

		}

		return executor;
	}
}
