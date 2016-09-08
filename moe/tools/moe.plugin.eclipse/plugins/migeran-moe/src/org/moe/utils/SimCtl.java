/*
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.PlatformUI;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.SimpleExec;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class SimCtl {

	public SimCtl() {
		try {
			initialize();
		} catch (Throwable t) {
			Bundle bundle = FrameworkUtil.getBundle(SimCtl.class);
			ILog log = Platform.getLog(bundle);
			log.log(new Status(IStatus.ERROR, PlatformUI.PLUGIN_ID, IStatus.OK, "Unable to initialize", t));
		}
	}

	public static List<Device> getDevices() {
		return new SimCtl().devices;
	}

	private static class Pair<L, R> {
		final L left;
		final R right;

		Pair(final L left, final R right) {
			super();
			this.left = left;
			this.right = right;
		}
	}

	public static class Device {
		public final String name;
		public final String udid;
		public final String runtime;

		Device(String name, String udid, String runtime) {
			this.name = name;
			this.udid = udid;
			this.runtime = runtime;
		}

		@Override
		public String toString() {
			return udid + " - " + runtime + " - " + name;
		}
	}

	public final List<Device> devices = new ArrayList<Device>();

	private void initialize() throws Exception {

		SimpleExec exec = SimpleExec.getExec("xcrun");
		exec.getArguments().addAll(Arrays.asList("simctl", "list", "-j", "runtimes", "devices"));

		final StringBuilder output = new StringBuilder();
		final ExecRunner runner = exec.getRunner();
		runner.setListener(new ExecRunnerBase.ExecRunnerListener() {
			@Override
			public void stdout(String s) {
				output.append(s);
			}

			@Override
			public void stderr(String s) {

			}
		});
		final Process process = runner.execute();
		if (process.waitFor() != 0) {
			throw new RuntimeException();
		}
		final String json = output.toString();

		final JsonObject root = new JsonParser().parse(json).getAsJsonObject();
		final Map<String, String> runtimesNI = new HashMap<String, String>();
		final Map<String, String> runtimesIN = new HashMap<String, String>();
		final String platformDisplayName = "ios";

		for (JsonElement _runtime : root.getAsJsonArray("runtimes")) {
			final JsonObject runtime = _runtime.getAsJsonObject();
			if (!runtime.get("availability").getAsString().equals("(available)")) continue;

			final String identifier = runtime.get("identifier").getAsString();
			final String lastcomp = identifier.substring(identifier.lastIndexOf('.') + 1);
			if (!lastcomp.toLowerCase().startsWith(platformDisplayName)) continue;

			final String name = runtime.get("name").getAsString();
			runtimesNI.put(name, identifier);
			runtimesIN.put(identifier, name);
		}

		for (Map.Entry<String, JsonElement> e : root.getAsJsonObject("devices").entrySet()) {
			if (!(runtimesIN.containsKey(e.getKey()) || runtimesNI.containsKey(e.getKey()))) continue;

			for (JsonElement _x : e.getValue().getAsJsonArray()) {
				final Pair<String, JsonObject> x = new Pair<String, JsonObject>(e.getKey(), _x.getAsJsonObject());
				if (!x.right.get("availability").getAsString().equals("(available)")) continue;

				final String key = x.left;
				final String runtime;
				if (runtimesIN.containsKey(key)) {
					runtime = runtimesIN.get(key);
				} else {
					runtime = key;
				}
				final JsonObject value = x.right;
				devices.add(new Device(value.get("name").getAsString(), value.get("udid").getAsString(), runtime));
			}

		}
	}

}
