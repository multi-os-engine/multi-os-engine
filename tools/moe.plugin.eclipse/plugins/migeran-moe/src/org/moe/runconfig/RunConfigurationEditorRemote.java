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

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.eclipse.core.internal.runtime.Log;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.common.configuration.RemoteSettings;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.utils.OsUtils;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

public class RunConfigurationEditorRemote extends AbstractTab {

	private static final Logger LOG = LoggerFactory.getLogger(RunConfigurationEditorRemote.class);

	public static final int DEFAULT_REMOTE_BUILD_PORT = 22;
	public static final int DEFAULT_REMOTE_BUILD_TIMEOUT = 3600;
	public static final String DEFAULT_REMOTE_BUILD_REPOSITORY = "jcenter()";
	public static final String DEFAULT_REMOTE_KEYCHAIN_NAME = "moeremotebuild.keychain";

	protected boolean remoteBuildEnabled = false;
	protected String remoteHost;
	protected int remotePort;
	protected String remoteUser;
	protected String remoteKnownhosts;
	protected String remoteIdentity;
	protected String remoteKeychainName;
	protected String remoteKeychainPass;
	protected int remoteKeychainLocktimeout;
	protected String remoteGradleRepositories;
	private Button remoteBuildEnabledButton;
	private Text remoteHostText;
	private Text remotePortText;
	private Text remoteUserText;
	private Text remoteKnownhostsText;
	private Text remoteIdentityText;
	private Text remoteKeychainNameText;
	private Text remoteKeychainPassText;
	private Text remoteKeychainLocktimeoutText;
	private Text remoteGradleRepositoriesText;
	private RunConfigurationEditorLocal editorLocal;
	private Group remoteGroup;

	@Override
	public void createControl(Composite composite) {
		Group parent = new Group(composite, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		setControl(parent);

		remoteBuildEnabledButton = new Button(parent, SWT.CHECK);
		remoteBuildEnabledButton.setText("Enable Remote Build");

		remoteGroup = new Group(parent, SWT.NONE);
		remoteGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteGroup.setText("Remote Configuration");
		GridLayout remoteLayout = new GridLayout();
		remoteLayout.numColumns = 2;
		remoteGroup.setLayout(remoteLayout);

		remoteBuildEnabledButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					if (OsUtils.isMac()) {
						remoteGroup.setEnabled(remoteBuildEnabledButton.getSelection());
					}
					setRemoteBuildEnabled(remoteBuildEnabledButton.getSelection());
					updateLaunchConfigurationDialog();
				}
					break;
				}
			}
		});

		if (!OsUtils.isMac()) {
			remoteBuildEnabledButton.setSelection(true);
			remoteBuildEnabledButton.setEnabled(false);
		}

		Label remoteHostLabel = new Label(remoteGroup, SWT.NONE);
		remoteHostLabel.setText("Host:");

		remoteHostText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteHostText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteHost(remoteHostText.getText());
			}
		});
		remoteHostText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label portLabel = new Label(remoteGroup, SWT.NONE);
		portLabel.setText("Port:");

		remotePortText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remotePortText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remotePortText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				try {
					int port = Integer.valueOf(remotePortText.getText());
					setRemotePort(port);
				} catch (NumberFormatException e) {
				}
			}
		});

		Label userLabel = new Label(remoteGroup, SWT.NONE);
		userLabel.setText("User:");

		remoteUserText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteUserText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteUserText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteUser(remoteUserText.getText());
			}
		});

		Label knownhostsLabel = new Label(remoteGroup, SWT.NONE);
		knownhostsLabel.setText("Knownhosts:");

		remoteKnownhostsText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteKnownhostsText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteKnownhostsText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteKnownhosts(remoteKnownhostsText.getText());
			}
		});

		Label identityLabel = new Label(remoteGroup, SWT.NONE);
		identityLabel.setText("Identity:");

		remoteIdentityText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteIdentityText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteIdentityText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteIdentity(remoteIdentityText.getText());
			}
		});

		Label keychainNameLabel = new Label(remoteGroup, SWT.NONE);
		keychainNameLabel.setText("Keychain.name:");

		remoteKeychainNameText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteKeychainNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteKeychainNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteKeychainName(remoteKeychainNameText.getText());
			}
		});

		Label keychainPassLabel = new Label(remoteGroup, SWT.NONE);
		keychainPassLabel.setText("Keychain.pass:");

		remoteKeychainPassText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteKeychainPassText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteKeychainPassText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteKeychainPass(remoteKeychainPassText.getText());
			}
		});

		Label keychainLocktimeoutLabel = new Label(remoteGroup, SWT.NONE);
		keychainLocktimeoutLabel.setText("Keychain.locktimeout:");

		remoteKeychainLocktimeoutText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteKeychainLocktimeoutText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteKeychainLocktimeoutText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				try {
					int timeout = Integer.valueOf(remoteKeychainLocktimeoutText.getText());
					setRemoteKeychainLocktimeout(timeout);
				} catch (NumberFormatException e) {
				}
			}
		});

		Label gradleRepositoriesLabel = new Label(remoteGroup, SWT.NONE);
		gradleRepositoriesLabel.setText("Gradle repositories:");

		remoteGradleRepositoriesText = new Text(remoteGroup, SWT.SINGLE | SWT.BORDER);
		remoteGradleRepositoriesText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		remoteGradleRepositoriesText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				updateLaunchConfigurationDialog();
				setRemoteGradleRepositories(remoteGradleRepositoriesText.getText());
			}
		});

		Button importButton = new Button(parent, SWT.None);
		importButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		importButton.setText("Import");
		importButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					showPropertiesChoicerDialog();
				}
					break;
				}
			}
		});

		Button testButton = new Button(parent, SWT.None);
		testButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		testButton.setText("Test");
		testButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					testRemoteConnection();
				}
					break;
				}
			}
		});

		Button exportButton = new Button(parent, SWT.None);
		exportButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		exportButton.setText("Export");
		exportButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					showExportPropertyDialog();
				}
					break;
				}
			}
		});
	}

	@Override
	public String getName() {
		return "Remote Build";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration launchConfiguration) {
		try {
			if (OsUtils.isMac()) {
				setRemoteBuildEnabled(
						launchConfiguration.getAttribute(ApplicationManager.REMOTE_BUILD_ENABLED_KEY, false));
				remoteBuildEnabledButton.setSelection(isRemoteBuildEnabled());
				remoteGroup.setEnabled(isRemoteBuildEnabled());
			} else {
				setRemoteBuildEnabled(true);
				remoteGroup.setEnabled(true);
			}
			setRemoteHost(launchConfiguration.getAttribute(ApplicationManager.REMOTE_HOST_KEY, ""));
			setRemotePort(
					launchConfiguration.getAttribute(ApplicationManager.REMOTE_PORT_KEY, DEFAULT_REMOTE_BUILD_PORT));
			setRemoteUser(launchConfiguration.getAttribute(ApplicationManager.REMOTE_USER_KEY, ""));
			setRemoteKnownhosts(launchConfiguration.getAttribute(ApplicationManager.REMOTE_KNOWN_HOSTS_KEY, ""));
			setRemoteIdentity(launchConfiguration.getAttribute(ApplicationManager.REMOTE_IDENTITY_KEY, ""));
			setRemoteKeychainName(launchConfiguration.getAttribute(ApplicationManager.REMOTE_KEYCHAIN_NAME_KEY,
					DEFAULT_REMOTE_KEYCHAIN_NAME));
			setRemoteKeychainPass(launchConfiguration.getAttribute(ApplicationManager.REMOTE_KEYCHAIN_PASS_KEY, ""));
			setRemoteKeychainLocktimeout(launchConfiguration
					.getAttribute(ApplicationManager.REMOTE_KEYCHAIN_LOCK_TIMEOUT_KEY, DEFAULT_REMOTE_BUILD_TIMEOUT));
			setRemoteGradleRepositories(launchConfiguration
					.getAttribute(ApplicationManager.REMOTE_GRADLE_REPOSITORIES_KEY, DEFAULT_REMOTE_BUILD_REPOSITORY));

			updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity,
					remoteKeychainName, remoteKeychainPass, remoteKeychainLocktimeout, remoteGradleRepositories);
		} catch (CoreException e) {
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy launchConfiguration) {
		if (OsUtils.isMac()) {
			launchConfiguration.setAttribute(ApplicationManager.REMOTE_BUILD_ENABLED_KEY, isRemoteBuildEnabled());
		} else {
			launchConfiguration.setAttribute(ApplicationManager.REMOTE_BUILD_ENABLED_KEY, true);
		}
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_HOST_KEY, getRemoteHost());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_PORT_KEY, getRemotePort());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_USER_KEY, getRemoteUser());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_KNOWN_HOSTS_KEY, getRemoteKnownhosts());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_IDENTITY_KEY, getRemoteIdentity());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_KEYCHAIN_PASS_KEY, getRemoteKeychainPass());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_KEYCHAIN_NAME_KEY, getRemoteKeychainName());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_KEYCHAIN_LOCK_TIMEOUT_KEY,
				getRemoteKeychainLocktimeout());
		launchConfiguration.setAttribute(ApplicationManager.REMOTE_GRADLE_REPOSITORIES_KEY,
				getRemoteGradleRepositories());
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy launchConfiguration) {
		if (!OsUtils.isMac()) {
			launchConfiguration.setAttribute(ApplicationManager.REMOTE_BUILD_ENABLED_KEY, true);
		} else {
			launchConfiguration.setAttribute(ApplicationManager.REMOTE_BUILD_ENABLED_KEY, false);
		}
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		setErrorMessage(null);
		setMessage(null);

		if (isRemoteBuildEnabled()) {
			Properties properties = RemoteSettings.getProperties(remoteHostText.getText(), remotePortText.getText(),
					remoteUserText.getText(), remoteKnownhostsText.getText(), remoteIdentityText.getText(),
					remoteKeychainNameText.getText(), remoteKeychainPassText.getText(),
					remoteKeychainLocktimeoutText.getText(), remoteGradleRepositoriesText.getText());
			try {
				RemoteSettings.validate(properties);
			} catch (ConfigurationValidationException e) {
				setErrorMessage(e.getErrorMessage());
				return false;
			}
		}

		return true;
	}

	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	public int getRemotePort() {
		return remotePort;
	}

	public void setRemotePort(int remotePort) {
		this.remotePort = remotePort;
	}

	public String getRemoteUser() {
		return remoteUser;
	}

	public void setRemoteUser(String remotePUser) {
		this.remoteUser = remotePUser;
	}

	public String getRemoteKnownhosts() {
		return remoteKnownhosts;
	}

	public void setRemoteKnownhosts(String remoteKnownhosts) {
		this.remoteKnownhosts = remoteKnownhosts;
	}

	public String getRemoteIdentity() {
		return remoteIdentity;
	}

	public void setRemoteIdentity(String remoteIdentity) {
		this.remoteIdentity = remoteIdentity;
	}

	public String getRemoteKeychainPass() {
		return remoteKeychainPass;
	}

	public boolean isRemoteBuildEnabled() {
		return remoteBuildEnabled;
	}

	public void setRemoteBuildEnabled(boolean remoteBuildEnabled) {
		this.remoteBuildEnabled = remoteBuildEnabled;
	}

	public void setRemoteKeychainPass(String remoteKeychainPass) {
		this.remoteKeychainPass = remoteKeychainPass;
	}

	public int getRemoteKeychainLocktimeout() {
		return remoteKeychainLocktimeout;
	}

	public void setRemoteKeychainLocktimeout(int remoteKeychainLocktimeout) {
		this.remoteKeychainLocktimeout = remoteKeychainLocktimeout;
	}

	public String getRemoteGradleRepositories() {
		return remoteGradleRepositories;
	}

	public void setRemoteGradleRepositories(String remoteGradleRepositories) {
		this.remoteGradleRepositories = remoteGradleRepositories;
	}

	public void setRemoteKeychainName(String remoteKeychainName) {
		this.remoteKeychainName = remoteKeychainName;
	}

	public String getRemoteKeychainName() {
		return remoteKeychainName;
	}

	private void showPropertiesChoicerDialog() {
		FileDialog fileDialog = new FileDialog(getShell());
		fileDialog.setText("Select remote build properties file.");
		String[] filterExtensions = new String[] { "*.properties" };
		fileDialog.setFilterExtensions(filterExtensions);
		String selected = fileDialog.open();

		if (selected != null) {

			try {

				Properties property = RemoteSettings.readProperties(selected);
				String remoteHost = property.getProperty(RemoteSettings.HOST_KEY);
				String port = property.getProperty(RemoteSettings.PORT_KEY);
				port = port == null || port.isEmpty() ? "0" : port;
				int remotePort = Integer.parseInt(port);
				String remoteUser = property.getProperty(RemoteSettings.USER_KEY);
				String remoteKnownhosts = property.getProperty(RemoteSettings.KNOWHOSTS_KEY);
				String remoteIdentity = property.getProperty(RemoteSettings.IDENTITY_KEY);
				String remoteKeychainName = property.getProperty(RemoteSettings.KEYCHAIN_NAME_KEY);
				String remoteKeychainPass = property.getProperty(RemoteSettings.KEYCHAIN_PASS_KEY);
				String timeout = property.getProperty(RemoteSettings.KEYCHAIN_LOCKTIMEOUT_KEY);
				timeout = timeout == null || timeout.isEmpty() ? "0" : timeout;
				int remoteKeychainLocktimeout = Integer.parseInt(timeout);
				String remoteGradleRepositories = property.getProperty(RemoteSettings.GRADLE_REPOSITORIES_KEY);

				updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity,
						remoteKeychainName, remoteKeychainPass, remoteKeychainLocktimeout, remoteGradleRepositories);
			} catch (Exception e) {
				showError("Unable load properties file");
			}
		}
	}

	private void updateRemoteBuildSettings(String remoteHost, int remotePort, String remoteUser,
			String remoteKnownhosts, String remoteIdentity, String remoteKeychainName, String remoteKeychainPass,
			int remoteKeychainLocktimeout, String remoteGradleRepositories) {

		if (remoteHost != null && !remoteHost.isEmpty()) {
			remoteHostText.setText(remoteHost);
		}
		if (remotePort > 0) {
			remotePortText.setText(Integer.toString(remotePort));
		} else {
			remotePortText.setText(Integer.toString(DEFAULT_REMOTE_BUILD_PORT));
		}
		if (remoteUser != null && !remoteUser.isEmpty()) {
			remoteUserText.setText(remoteUser);
		}
		if (remoteKnownhosts != null && !remoteKnownhosts.isEmpty()) {
			remoteKnownhostsText.setText(remoteKnownhosts);
		}
		if (remoteIdentity != null && !remoteIdentity.isEmpty()) {
			remoteIdentityText.setText(remoteIdentity);
		}
		if (remoteKeychainName != null && !remoteKeychainName.isEmpty()) {
			remoteKeychainNameText.setText(remoteKeychainName);
		} else {
			remoteKeychainNameText.setText(DEFAULT_REMOTE_KEYCHAIN_NAME);
		}
		if (remoteKeychainPass != null && !remoteKeychainPass.isEmpty()) {
			remoteKeychainPassText.setText(remoteKeychainPass);
		}
		if (remoteKeychainLocktimeout > 0) {
			remoteKeychainLocktimeoutText.setText(Integer.toString(remoteKeychainLocktimeout));
		}
		if (remoteGradleRepositories != null && !remoteGradleRepositories.isEmpty()) {
			remoteGradleRepositoriesText.setText(remoteGradleRepositories);
		} else {
			remoteGradleRepositoriesText.setText(DEFAULT_REMOTE_BUILD_REPOSITORY);
		}
	}

	private void testRemoteConnection() {
		String projectName = editorLocal.getProjectName();
		if (projectName == null || projectName.isEmpty()) {
			showError("Please select project.");
			return;
		}

		IProject project = ProjectHelper.getProject(projectName);
		if (project == null) {
			showError("Not found project: " + projectName);
			return;
		}

		Properties properties = RemoteSettings.getProperties(remoteHostText.getText(), remotePortText.getText(),
				remoteUserText.getText(), remoteKnownhostsText.getText(), remoteIdentityText.getText(),
				remoteKeychainNameText.getText(), remoteKeychainPassText.getText(),
				remoteKeychainLocktimeoutText.getText(), remoteGradleRepositoriesText.getText());
		try {
			RemoteSettings.validate(properties);
		} catch (ConfigurationValidationException e) {
			showError(e.getErrorMessage());
		}
		MessageConsole console = MOEProjectBuildConsole.getBuildConsole();
		console.activate();
		final MessageConsoleStream out = console.newMessageStream();
		String errorMessage = RemoteSettings.test(project.getLocation().toFile(), properties,
				new ExecRunnerBase.ExecRunnerListener() {
					@Override
					public void stdout(String s) {
						out.println(s);
					}

					@Override
					public void stderr(String s) {
						out.println(s);
					}
				});

		if (errorMessage == null) {
			showMessage("Test successful");
		} else {
			showError(errorMessage);
		}
	}

	public void setRunConfigurationEditorLocal(RunConfigurationEditorLocal editor) {
		this.editorLocal = editor;
	}

	private void showExportPropertyDialog() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());
		dialog.setText("Select save folder");

		String selected = dialog.open();

		if (selected != null) {

			try {
				Properties properties = RemoteSettings.getProperties(remoteHostText.getText(), remotePortText.getText(),
						remoteUserText.getText(), remoteKnownhostsText.getText(), remoteIdentityText.getText(),
						remoteKeychainNameText.getText(), remoteKeychainPassText.getText(),
						remoteKeychainLocktimeoutText.getText(), remoteGradleRepositoriesText.getText());
				RemoteSettings.validate(properties);
				RemoteSettings.saveProperties(selected, properties);
				IProject project = getProject(editorLocal.getProjectName());
				project.refreshLocal(IResource.DEPTH_INFINITE, null);
				showMessage("Property file saved.");
			} catch (ConfigurationValidationException e) {
				showError(e.getErrorMessage());
			} catch (IOException e) {
				showError("Unable save properties file: " + e.getMessage());
			} catch (CoreException e) {
				LOG.error("Unable refresh project: ", e);
			}
		}
	}

}
