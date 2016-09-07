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

package org.moe.natjgen.cli.utils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Map;
import java.util.Set;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.exec.environment.EnvironmentUtils;

import com.google.gson.Gson;
import org.moe.natjgen.cli.exceptions.WrapNatJGenException;
import org.moe.natjgen.cli.executable.Pod;
import org.moe.natjgen.cli.executable.Pod.PodNotFoundException;

public class Utils {

	public static void printDependencies(String podName, Set<String> printed) throws IOException, InterruptedException, WrapNatJGenException {
		String subspec = null;
		if (podName.contains("/")) {
			int idx = podName.indexOf("/");
			subspec = podName.substring(idx + 1);
			podName = podName.substring(0, idx);
		}

		String jSon = Pod.getSpecContent(podName);
		Gson gson = new Gson();
		SpecObject rootSpec = gson.fromJson(jSon, SpecObject.class);
		rootSpec.addSubspec(subspec);

		for (String key : rootSpec.getDependencies().keySet()) {
			if (!printed.contains(key)) {
				System.out.println(key);
				printed.add(key);
			}
			printDependencies(key, printed);
		}
	}

	public static String readFile(File file, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(file.toPath());
		return new String(encoded, encoding);
	}

	public static String[] execute(File dir, String command, Map<String, String> environment) {
		
		Map<String, String> current = null;
		try {
			current = EnvironmentUtils.getProcEnvironment();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		if(environment != null && current != null) {
			current.putAll(environment);
		}

		CommandLine cmdLine = CommandLine.parse(command);

		DefaultExecutor executor = new DefaultExecutor();
		executor.setWorkingDirectory(dir);

		ByteArrayOutputStream stdout = new ByteArrayOutputStream();
		ByteArrayOutputStream stderr = new ByteArrayOutputStream();
		PumpStreamHandler stHandler = new PumpStreamHandler(stdout, stderr);
		
		executor.setStreamHandler(stHandler);
		int exitValue = Executor.INVALID_EXITVALUE;

		try {
			exitValue = executor.execute(cmdLine,current);
		} catch (IOException e) {}

		return new String[]{ stdout.toString(), executor.isFailure(exitValue) ? stderr.toString() : null};
	}
}
