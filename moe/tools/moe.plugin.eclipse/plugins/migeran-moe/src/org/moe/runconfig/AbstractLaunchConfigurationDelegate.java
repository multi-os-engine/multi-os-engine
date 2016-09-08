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

package org.moe.runconfig;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;

public abstract class AbstractLaunchConfigurationDelegate extends AbstractJavaLaunchConfigurationDelegate {

	public static final String DEBUG_PORT_KEY = "debug_port";
	public static final int DEFAULT_DEBUG_PORT = 8000;
	public static final String DEBUG_REMOTE_PORT_KEY = "debug_remote_port";
	public static final int DEFAULT_DEBUG_REMOTE_PORT = 8000;
	public static final String RUN_ON_SIMULATOR_KEY = "run_on_simulator";
	public static final String DEFAULT_CONFIGURATION = "Debug";
	public static final String CONFIGURATION_KEY = "configuration";
	public static final String SIMULATOR_UUID_KEY = "imulator_uuid";
	public static final String DEVICE_UUID_KEY = "device_uuid";
	public static final String REMOTE_BUILD_ENABLED_KEY = "remoteBuildEnabled";
	public static final String REMOTE_HOST_KEY = "remoteHost";
	public static final String REMOTE_PORT_KEY = "remotePort";
	public static final String REMOTE_USER_KEY = "remoteUser";
	public static final String REMOTE_KNOWN_HOSTS_KEY = "remoteKnownhosts";
	public static final String REMOTE_IDENTITY_KEY = "remoteIdentity";
	public static final String REMOTE_KEYCHAIN_PASS_KEY = "remoteKeychainPass";
	public static final String REMOTE_KEYCHAIN_LOCK_TIMEOUT_KEY = "remoteKeychainLocktimeout";
	public static final String REMOTE_GRADLE_REPOSITORIES_KEY = "remoteGradleRepositories";
	public static final String RUN_JUNIT_TEST_KEY = "run_junit_test";

	protected ILaunchConfiguration launchConfiguration;

	protected int getDebugPort() {
		try {
			return launchConfiguration.getAttribute(DEBUG_PORT_KEY, DEFAULT_DEBUG_PORT);
		} catch (CoreException ignored) {

		}
		return DEFAULT_DEBUG_PORT;
	}

	protected boolean isRunOnSimulator() {
		try {
			return launchConfiguration.getAttribute(RUN_ON_SIMULATOR_KEY, true);
		} catch (CoreException ignored) {

		}
		return true;
	}

	protected String getConfiguration() {
		try {
			return launchConfiguration.getAttribute(CONFIGURATION_KEY, DEFAULT_CONFIGURATION);
		} catch (CoreException ignored) {

		}
		return DEFAULT_CONFIGURATION;
	}

	protected String getArch() {
		if (isRunOnSimulator()) {
			return "i386";
		}
		return "armv7,arm64";
	}

	protected boolean isJUnitTest() {
		// TODO Auto-generated method stub
		return false;
	}

	protected String getSimulatoreUdid() {
		try {
			return launchConfiguration.getAttribute(SIMULATOR_UUID_KEY, "");
		} catch (CoreException ignored) {

		}
		return "";
	}

	protected String getDeviceUdid() {
		try {
			return launchConfiguration.getAttribute(DEVICE_UUID_KEY, "");
		} catch (CoreException ignored) {

		}
		return "";
	}

	protected int getDebugRemotePort() {
		try {
			return launchConfiguration.getAttribute(DEBUG_REMOTE_PORT_KEY, DEFAULT_DEBUG_REMOTE_PORT);
		} catch (CoreException ignored) {

		}
		return DEFAULT_DEBUG_REMOTE_PORT;
	}

}
