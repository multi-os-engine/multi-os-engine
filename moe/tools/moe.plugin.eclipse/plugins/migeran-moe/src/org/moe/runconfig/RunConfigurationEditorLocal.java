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

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.moe.MOEProjectNature;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.common.utils.OsUtils;
import org.moe.utils.Configuration;
import org.moe.utils.InputValidationHelper;
import org.moe.utils.ProjectHelper;
import org.moe.utils.SimCtl;
import org.moe.utils.logger.LoggerFactory;

public class RunConfigurationEditorLocal extends AbstractLaunchConfigurationTab {

	private static final Logger LOG = LoggerFactory.getLogger(RunConfigurationEditorLocal.class);

	public final static String ATTR_GOALS = "M2_GOALS";

	public final static String ATTR_RUNTIME = "M2_RUNTIME";

	private Combo projectsCombo;
	private Combo configurationCombo;
	private Combo simulatorsCombo;
	private Combo devicesCombo;
	private Button simulatorButton;
	private Button deviceButton;
	private Text debugPortText;
	private Text remotePortText;
	private Label remotePortLabel;
	private List<String> simulatorIds = new ArrayList<>();
	private List<String> deviceIds = new ArrayList<>();
	private IProject project;

	@Override
	public void createControl(Composite composite) {

		Group parent = new Group(composite, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		setControl(parent);

		initProjectSection(parent);

		initConfigurationSection(parent);

		initRunOnSection(parent);

		initJDWPDebugSection(parent);

		updateItems(true);

		project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());

		if (project != null) {
			projectsCombo.setText(project.getName());
		}
	}

	@Override
	public String getName() {
		return "Launch";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration launchConfiguration) {
		try {
			String projectName = launchConfiguration.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
					"");
			if (!projectName.isEmpty()) {
				projectsCombo.setText(projectName);
			}

			if (OsUtils.isMac()) {
				boolean runOnSimulator = launchConfiguration
						.getAttribute(AbstractLaunchConfigurationDelegate.RUN_ON_SIMULATOR_KEY, true);
				updateItems(runOnSimulator);

				String simulatorUUID = launchConfiguration
						.getAttribute(AbstractLaunchConfigurationDelegate.SIMULATOR_UUID_KEY, "");
				if (!simulatorUUID.isEmpty()) {
					simulatorsCombo.select(simulatorIds.indexOf(simulatorUUID));
				}
			}

			String deviceUUID = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.DEVICE_UUID_KEY,
					"");
			if (!deviceUUID.isEmpty()) {
				devicesCombo.select(deviceIds.indexOf(deviceUUID));
			}

			int debugPort = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.DEBUG_PORT_KEY, -1);

			if (debugPort > 0) {
				debugPortText.setText(String.valueOf(debugPort));
			} else {
				debugPortText.setText(String.valueOf(AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_PORT));
			}

			int remotePort = launchConfiguration.getAttribute(AbstractLaunchConfigurationDelegate.DEBUG_REMOTE_PORT_KEY,
					-1);
			if (remotePort > 0) {
				remotePortText.setText(String.valueOf(remotePort));
			} else {
				remotePortText.setText(String.valueOf(AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_REMOTE_PORT));
			}

			configurationCombo.setText(launchConfiguration
					.getAttribute(AbstractLaunchConfigurationDelegate.CONFIGURATION_KEY, Configuration.RELEASE_NAME));
		} catch (CoreException e) {

		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy launchConfigurationWorkingCopy) {
		launchConfigurationWorkingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME,
				projectsCombo.getText());
		if (OsUtils.isMac()) {
			launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.RUN_ON_SIMULATOR_KEY,
					simulatorButton.getSelection());
			launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.SIMULATOR_UUID_KEY,
					simulatorIds.get(simulatorsCombo.getSelectionIndex()));
		}
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEVICE_UUID_KEY,
				deviceIds.get(devicesCombo.getSelectionIndex()));
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEBUG_PORT_KEY,
				Integer.parseInt(debugPortText.getText()));
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEBUG_REMOTE_PORT_KEY,
				Integer.parseInt(remotePortText.getText()));
		launchConfigurationWorkingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_ALLOW_TERMINATE, true);
		launchConfigurationWorkingCopy.setAttribute(ATTR_GOALS, "moe:xcodebuild");
		launchConfigurationWorkingCopy.setAttribute(ATTR_RUNTIME, ProjectHelper.getMavenRuntimePath());
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.CONFIGURATION_KEY,
				configurationCombo.getItem(configurationCombo.getSelectionIndex()));
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);

		String projectName = projectsCombo.getText();
		if (projectName == null || projectName.isEmpty()) {
			setErrorMessage("Please select a project");
			return false;
		}

		String port = debugPortText.getText();
		if (port == null || port.isEmpty()) {
			setErrorMessage("Please enter a debug port");
			return false;
		} else if (!InputValidationHelper.isInteger(port)) {
			setErrorMessage("Wrong debug port number, please enter a numeric value.");
			return false;
		}

		port = remotePortText.getText();
		if (port == null || port.isEmpty()) {
			setErrorMessage("Please enter a remote port");
			return false;
		} else if (!InputValidationHelper.isInteger(port)) {
			setErrorMessage("Wrong remote debug port number, please enter a numeric value.");
			return false;
		}
		return true;
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy launchConfigurationWorkingCopy) {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		String projectName = project == null ? "" : project.getName();
		launchConfigurationWorkingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, projectName);
		if (!OsUtils.isMac()) {
			launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.RUN_ON_SIMULATOR_KEY,
					false);
		} else {
			launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.RUN_ON_SIMULATOR_KEY, true);
		}
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.SIMULATOR_UUID_KEY, "");
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEVICE_UUID_KEY, "");
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEBUG_PORT_KEY,
				AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_PORT);
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.DEBUG_REMOTE_PORT_KEY,
				AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_REMOTE_PORT);
		launchConfigurationWorkingCopy.setAttribute(ATTR_GOALS, "moe:xcodebuild");
		launchConfigurationWorkingCopy.setAttribute(ATTR_RUNTIME, ProjectHelper.getMavenRuntimePath());
		launchConfigurationWorkingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_ALLOW_TERMINATE, true);
		launchConfigurationWorkingCopy.setAttribute(AbstractLaunchConfigurationDelegate.CONFIGURATION_KEY,
				Configuration.RELEASE_NAME);
	}

	private void initProjectSection(Composite parent) {
		Group projectGroup = new Group(parent, SWT.NONE);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		projectGroup.setLayout(layout);

		Label projectTextLabel = new Label(projectGroup, SWT.NONE);
		projectTextLabel.setText("Project:");

		projectsCombo = new Combo(projectGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		projectsCombo.addSelectionListener(new MySelectionListener());

		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject[] projects = root.getProjects();
		for (IProject project : projects) {
			try {
				if (project.hasNature(MOEProjectNature.NATURE_ID)) {
					projectsCombo.add(project.getName());
				}
			} catch (CoreException ignore) {

			}
		}
	}

	private void initConfigurationSection(Composite parent) {
		Group iosGroup = new Group(parent, SWT.NONE);
		iosGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		iosGroup.setText("Active configuration");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		iosGroup.setLayout(layout);

		Label sdkLabel = new Label(iosGroup, SWT.NONE);
		sdkLabel.setText("Active:");

		configurationCombo = new Combo(iosGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		configurationCombo.addSelectionListener(new MySelectionListener());
		configurationCombo.add(Configuration.RELEASE_NAME);
		configurationCombo.add(Configuration.DEBUG_NAME);
	}

	private void initRunOnSection(Composite parent) {
		Group runOnGroup = new Group(parent, SWT.NONE);
		runOnGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		runOnGroup.setText("Run on");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		runOnGroup.setLayout(layout);

		simulatorButton = new Button(runOnGroup, SWT.RADIO);
		simulatorButton.setText("Simulator");
		simulatorButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					updateItems(true);
					updateLaunchConfigurationDialog();
				}
					break;
				}
			}
		});

		simulatorsCombo = new Combo(runOnGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		simulatorsCombo.addSelectionListener(new MySelectionListener());

		if (OsUtils.isMac()) {
			for (SimCtl.Device device : SimCtl.getDevices()) {
				simulatorsCombo.add(device.name + " (" + device.runtime + ")");
				simulatorIds.add(device.udid);
			}

			simulatorsCombo.select(0);
		}

		deviceButton = new Button(runOnGroup, SWT.RADIO);
		deviceButton.setText("Device");
		deviceButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					updateItems(false);
					updateLaunchConfigurationDialog();
				}
					break;
				}
			}
		});

		devicesCombo = new Combo(runOnGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		devicesCombo.addSelectionListener(new MySelectionListener());
		updateDeviceCombo();

		if (!OsUtils.isMac()) {
			simulatorButton.setSelection(false);
			simulatorButton.setEnabled(false);
			simulatorsCombo.setEnabled(false);
			deviceButton.setSelection(true);
		}

	}

	private void initJDWPDebugSection(Composite parent) {
		Group jdwpDebugGroup = new Group(parent, SWT.NONE);
		jdwpDebugGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		jdwpDebugGroup.setText("JDWP Debug");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		jdwpDebugGroup.setLayout(layout);

		Label debugPortLabel = new Label(jdwpDebugGroup, SWT.NONE);
		debugPortLabel.setText("Port:");

		debugPortText = new Text(jdwpDebugGroup, SWT.SINGLE | SWT.BORDER);
		debugPortText.addModifyListener(new MyModifyListener());
		debugPortText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		debugPortText.setText(String.valueOf(AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_PORT));

		remotePortLabel = new Label(jdwpDebugGroup, SWT.NONE);
		remotePortLabel.setText("Remote Port:");

		remotePortText = new Text(jdwpDebugGroup, SWT.SINGLE | SWT.BORDER);
		remotePortText.addModifyListener(new MyModifyListener());
		remotePortText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remotePortText.setText(String.valueOf(AbstractLaunchConfigurationDelegate.DEFAULT_DEBUG_REMOTE_PORT));
	}

	private void updateItems(boolean runOnSimulator) {
		if (OsUtils.isMac()) {
			simulatorButton.setSelection(runOnSimulator);
			simulatorsCombo.setEnabled(runOnSimulator);
			deviceButton.setSelection(!runOnSimulator);
			devicesCombo.setEnabled(!runOnSimulator);
			remotePortLabel.setVisible(!runOnSimulator);
			remotePortText.setEnabled(!runOnSimulator);
			remotePortText.setVisible(!runOnSimulator);
		}
	}

	private class MySelectionListener implements SelectionListener {

		@Override
		public void widgetDefaultSelected(SelectionEvent arg0) {
			updateLaunchConfigurationDialog();
		}

		@Override
		public void widgetSelected(SelectionEvent arg0) {
			updateLaunchConfigurationDialog();
		}
	}

	private class MyModifyListener implements ModifyListener {

		@Override
		public void modifyText(ModifyEvent arg0) {
			updateLaunchConfigurationDialog();
		}

	}

	private void updateDeviceCombo() {
		int selected = devicesCombo.getSelectionIndex();
		devicesCombo.removeAll();
		deviceIds.clear();
		devicesCombo.add("First available iOS device");
		deviceIds.add("");

		String projectName = projectsCombo.getText();

		if (projectName == null || projectName.isEmpty()) {
			projectName = projectsCombo.getItem(0);
		}

		if (projectName == null || projectName.isEmpty()) {
			return;
		}

		IProject project = ProjectHelper.getProject(projectName);

		if (project == null) {
			return;
		}

		File projectFile = project.getLocation().toFile();

		try {
			for (DeviceInfo device : Device.getDevices(projectFile)) {
				devicesCombo.add(device.name() + " (" + device.udid() + ")");
				deviceIds.add(device.udid());
			}
		} catch (IOException e) {
			LOG.debug("Unable to get devices", e);
		}

		if (selected >= 0) {
			devicesCombo.select(selected);
		} else {
			devicesCombo.select(0);
		}
	}

	public String getProjectName() {
		return projectsCombo.getText();
	}

}
