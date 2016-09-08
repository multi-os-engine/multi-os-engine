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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase.ExecRunnerListener;
import org.moe.common.exec.GradleExec;
import org.moe.utils.MessageFactory;
import org.moe.utils.logger.LoggerFactory;

public class ApplicationManager {

	private static final Logger LOG = LoggerFactory.getLogger(ApplicationManager.class);

	public static final String REMOTEBUILD_PROPERTIES_IGNORE = "moe.remotebuild.properties.ignore";
	public static final String REMOTEBUILD_HOST = "moe.remotebuild.host=";
	public static final String REMOTEBUILD_PORT = "moe.remotebuild.port=";
	public static final String REMOTEBUILD_USER = "moe.remotebuild.user=";
	public static final String REMOTEBUILD_KNOWNHOSTS = "moe.remotebuild.knownhosts";
	public static final String REMOTEBUILD_IDENTITY = "moe.remotebuild.identity=";
	public static final String REMOTEBUILD_KEYCHAIN_PASS = "moe.remotebuild.keychain.pass=";
	public static final String REMOTEBUILD_KEYCHAINLOCKTIMEOUT = "moe.remotebuild.keychain.locktimeout";
	public static final String REMOTEBUILD_GRADLE_REPOSITORIES = "moe.remotebuild.gradle.repositories=";
	public static final String REMOTEBUILD_ENABLED = "moe.remotebuild=";
	public static final String CONFIGURATION_MAVEN = "moe.configuration=";
	public static final String LAUNCHER_SIMULATORS = "moe.launcher.simulators=";
	public static final String SIMULATOR_UDID = "moe.simulator.udid=";
	public static final String DEVICE_UDID = "moe.launcher.devices=";

	private List<String> args;
	private IProject project;
	private OptionsBuilder optionsBuilder;

	public ApplicationManager(IProject project) {
		this.project = project;
	}

	public void build(ILaunchConfiguration launchConfiguration, IProgressMonitor progressMonitor) throws CoreException {
		LOG.debug("Build project: " + project.getName());

		if (progressMonitor == null) {
			progressMonitor = new NullProgressMonitor();
		}

		progressMonitor.beginTask("Build...", 4);

		args = new ArrayList<String>();

		boolean isRemoteBuildEnabled = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_BUILD_ENABLED_KEY, false);

		boolean isJUnitEnabled = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.RUN_JUNIT_TEST_KEY, false);

		optionsBuilder = new OptionsBuilder();

		progressMonitor.subTask("Set Configuration...");

		if (isJUnitEnabled) {
			args.add("moeTest");
		} else {
			args.add("moeLaunch");
		}
		optionsBuilder.push("no-launch");
		optionsBuilder.push(
				"config:" + launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.CONFIGURATION_KEY,
						AbstractLaunchConfigurationDelegate.DEFAULT_CONFIGURATION));

		if (isRemoteBuildEnabled) {
			args.add("-P" + REMOTEBUILD_PROPERTIES_IGNORE);
			addRemoteBuildArguments(launchConfiguration);
		}

		addSimulatorUDIDArgument("-P", launchConfiguration, false);

		launchBuild();

	}

	private void addRemoteMavenBuildArguments(ILaunchConfiguration launchConfiguration) throws CoreException {
		args.add("-D" + REMOTEBUILD_ENABLED + "true");
		addRemoteArguments("-D", launchConfiguration);
	}

	private void addRemoteBuildArguments(ILaunchConfiguration launchConfiguration) throws CoreException {
		addRemoteArguments("-P", launchConfiguration);
	}

	private void addRemoteArguments(String prefix, ILaunchConfiguration launchConfiguration) throws CoreException {
		String remoteHost = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_HOST_KEY, "");
		int remotePort = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_PORT_KEY, 0);
		String remoteUser = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_USER_KEY, "");
		String remoteKnownhosts = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_KNOWN_HOSTS_KEY, "");
		String remoteIdentity = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_IDENTITY_KEY, "");
		String remoteKeychainPass = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_KEYCHAIN_PASS_KEY, "");
		int remoteKeychainLocktimeout = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_KEYCHAIN_LOCK_TIMEOUT_KEY, 0);
		String remoteGradleRepositories = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_GRADLE_REPOSITORIES_KEY, "");

		addArgument(prefix + REMOTEBUILD_HOST + remoteHost);
		addArgument(prefix + REMOTEBUILD_PORT + remotePort);
		addArgument(prefix + REMOTEBUILD_USER + remoteUser);
		addArgument(prefix + REMOTEBUILD_KNOWNHOSTS + remoteKnownhosts);
		addArgument(prefix + REMOTEBUILD_IDENTITY + remoteIdentity);
		addArgument(prefix + REMOTEBUILD_KEYCHAIN_PASS + remoteKeychainPass);
		addArgument(prefix + REMOTEBUILD_KEYCHAINLOCKTIMEOUT + remoteKeychainLocktimeout);
		addArgument(prefix + REMOTEBUILD_GRADLE_REPOSITORIES + remoteGradleRepositories);

	}

	private void addSimulatorUDIDArgument(String prefix, ILaunchConfiguration launchConfiguration, boolean isMaven)
			throws CoreException {
		boolean runOnSimulator = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.RUN_ON_SIMULATOR_KEY, true);

		if (runOnSimulator) {
			if (isMaven) {
				addArgument(prefix + SIMULATOR_UDID
						+ launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.SIMULATOR_UUID_KEY, ""));
			} else {
				addArgument(prefix + LAUNCHER_SIMULATORS
						+ launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.SIMULATOR_UUID_KEY, ""));
			}
		}
	}

	private void addArgument(String arg) {
		args.add(arg);
	}

	@SuppressWarnings("restriction")
	public void buildMavenProject(ILaunchConfiguration launchConfiguration, ILaunch launch,
			IProgressMonitor progressMonitor) throws CoreException {
		if (progressMonitor == null) {
			progressMonitor = new NullProgressMonitor();
		}

		args = new ArrayList<String>();

		args.add("-D" + CONFIGURATION_MAVEN
				+ launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.CONFIGURATION_KEY,
						AbstractLaunchConfigurationDelegate.DEFAULT_CONFIGURATION));

		progressMonitor.beginTask("Build...", 4);
		LOG.debug("Start maven build");

		boolean isRemoteBuildEnabled = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.REMOTE_BUILD_ENABLED_KEY, false);

		progressMonitor.subTask("Set Configuration...");

		if (isRemoteBuildEnabled) {
			addRemoteMavenBuildArguments(launchConfiguration);
		}

		addSimulatorUDIDArgument("-D", launchConfiguration, true);

		progressMonitor.worked(1);

		MOEMavenLaunchDelegate delegate = new MOEMavenLaunchDelegate();
		delegate.setRemoteArguments(args);
		LOG.debug("MOEMavenLaunchDelegate set arguments");
		delegate.launch(launchConfiguration, ILaunchManager.RUN_MODE, launch, progressMonitor);

		IProcess[] process = launch.getProcesses();

		if (process.length < 1) {
			throw new CoreException(MessageFactory.getError("Unable to build project with maven"));
		}

		IProcess mavenProcess = process[0];

		while (!launch.isTerminated()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				LOG.error("InterruptedException", e);
			}
		}

		progressMonitor.subTask("Build ended...");

		progressMonitor.worked(1);

		int result = mavenProcess.getExitValue();

		if (result != 0) {
			throw new CoreException(MessageFactory.getError("Maven build error"));
		}

		progressMonitor.subTask("Build successful");
	}

	public void setOptionsBuilder(OptionsBuilder builder) {
		this.optionsBuilder = builder;
	}

	public void setArguments(List<String> newArgs) {
		this.args = newArgs;
	}

	public void launchBuild() throws CoreException {
		MessageConsole console = MOEProjectBuildConsole.getBuildConsole();
		console.activate();
		console.clearConsole();

		File f = project.getLocation().toFile();
		GradleExec exec = new GradleExec(f);
		if (optionsBuilder != null) {
			args.add(optionsBuilder.toString());
		}
		exec.getArguments().addAll(args);
		ExecRunner runner = null;
		try {
			runner = exec.getRunner();
		} catch (IOException e) {
			throw new CoreException(MessageFactory.getError("GradleExec error", e));
		}

		Process process = null;
		if (runner != null) {
			runner.getBuilder().directory(f);
			final MessageConsoleStream consoleStream = console.newMessageStream();
			runner.setListener(new ExecRunnerListener() {

				@Override
				public void stdout(String message) {
					consoleStream.println(message);
				}

				@Override
				public void stderr(String message) {
					consoleStream.println(message);
				}
			});
		}

		try {
			process = runner.execute();
			while (process.isAlive()) {
				LOG.debug("Wait to build...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					LOG.error("InterruptedException", e);
				}
			}
			int result = process.waitFor();

			if (result != 0) {
				throw new CoreException(MessageFactory.getError("Gradle build error"));
			}
			LOG.debug("Build result: " + result);
		} catch (IOException | InterruptedException e) {
			throw new CoreException(MessageFactory.getError("Gradle launch error", e));
		}
	}

	public void launchApplication(ILaunch launch, Map<String, String> vmArgs, IProgressMonitor progressMonitor)
			throws CoreException {
		File projectFile = project.getLocation().toFile();
		GradleExec exec = new GradleExec(projectFile);
		if (optionsBuilder != null) {
			args.add(optionsBuilder.toString());
		}
		exec.getArguments().addAll(args);
		ExecRunner runner = null;
		try {
			runner = exec.getRunner();
		} catch (IOException e) {
			throw new CoreException(MessageFactory.getError("GradleExec error", e));
		}

		Process process = null;
		if (runner != null) {
			runner.getBuilder().directory(projectFile);
		}

		try {
			process = runner.getBuilder().start();
		} catch (IOException e) {
			throw new CoreException(MessageFactory.getError("Gradle launch error", e));
		}

		if (process != null) {
			Launcher launcher = new Launcher(launch, process, vmArgs, progressMonitor);
			launcher.start();
		} else {
			throw new CoreException(MessageFactory.getError("Gradle launch error, process is null"));
		}
	}

	public static class OptionsBuilder {
		private final StringBuilder builder = new StringBuilder();

		OptionsBuilder push(String value) {
			builder.append(",").append(value.replaceAll(",", "\\,"));
			return this;
		}

		@Override
		public String toString() {
			return builder.length() == 1 ? "" : ("-Pmoe.launcher.options=" + builder.substring(1));
		}
	}

}
