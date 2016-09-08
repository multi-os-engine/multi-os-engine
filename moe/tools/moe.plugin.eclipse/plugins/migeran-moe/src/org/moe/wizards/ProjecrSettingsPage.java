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

package org.moe.wizards;

import java.io.File;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class ProjecrSettingsPage extends AbstractWizardPage {

	private Text projectNameText;
	private Text projectLocationText;
	private Label projectLocationLabel;
	private Button browserButton;
	private String defaultPath;
	private Combo gradleVersionCombo;

	protected ProjecrSettingsPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite composite) {
		Group parent = new Group(composite, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		setControl(parent);

		Group projectNameGroup = new Group(parent, SWT.NONE);
		projectNameGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout projectNameLayout = new GridLayout();
		projectNameLayout.numColumns = 2;
		projectNameGroup.setLayout(projectNameLayout);

		Label sdkLabel = new Label(projectNameGroup, SWT.NONE);
		sdkLabel.setText("Project Name:");

		projectNameText = new Text(projectNameGroup, SWT.SINGLE | SWT.BORDER);
		projectNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (defaultPath != null) {
					projectLocationText.setText(defaultPath + File.separator + projectNameText.getText());
				}
				validate();
			}
		});
		projectNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Group projectLocationGroup = new Group(parent, SWT.NONE);
		projectLocationGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout projectLocationLayout = new GridLayout();
		projectLocationLayout.numColumns = 3;
		projectLocationGroup.setLayout(projectLocationLayout);

		projectLocationLabel = new Label(projectLocationGroup, SWT.NONE);
		projectLocationLabel.setText("Project Location:");

		projectLocationText = new Text(projectLocationGroup, SWT.SINGLE | SWT.BORDER);
		projectLocationText.addModifyListener(new ValidateListener());
		projectLocationText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		browserButton = new Button(projectLocationGroup, SWT.SEARCH);
		browserButton.setText("...");
		browserButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					showDirectoryDialog();
				}
					break;
				}
			}
		});

		Group pgradleGroup = new Group(parent, SWT.NONE);
		pgradleGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout gradleLayout = new GridLayout();
		gradleLayout.numColumns = 2;
		pgradleGroup.setLayout(gradleLayout);

		Label gradleVersionLabel = new Label(pgradleGroup, SWT.NONE);
		gradleVersionLabel.setText("Gradle Version:");

		gradleVersionCombo = new Combo(pgradleGroup, SWT.READ_ONLY);
		gradleVersionCombo.setFont(parent.getFont());
		gradleVersionCombo.setEnabled(true);

		ArrayList<String> gradleVersions = new ArrayList<String>();
		gradleVersions.add("2.14.1");

		if (gradleVersions != null && !gradleVersions.isEmpty()) {
			for (String s : gradleVersions) {
				gradleVersionCombo.add(s);
			}
			gradleVersionCombo.setText("2.14.1");
		}

		setPageComplete(false);
		validate();
	}

	@Override
	public boolean canFlipToNextPage() {
		return false;
	}

	public String getProjectRoot() {
		return projectLocationText.getText().trim();
	}

	private void showDirectoryDialog() {
		DirectoryDialog dialog = new DirectoryDialog(getShell(), SWT.SHEET);
		dialog.setMessage("Select project file directory");
		dialog.setFilterPath(defaultPath);
		String selectedDirectory = dialog.open();
		if (selectedDirectory != null) {
			defaultPath = selectedDirectory;
			projectLocationText.setText(defaultPath);
		}
	}

	protected boolean validate() {
		setMessage(null);
		setErrorMessage(null);
		if (projectNameText.getText().trim().isEmpty()) {
			setErrorMessage("Enter a Project Name");
			return false;
		}

		if (projectLocationText.getText().trim().isEmpty()) {
			setErrorMessage("Select a Project Location");
			return false;
		}

		if (projectExsitsInWorkspace()) {
			setErrorMessage("A project with this name already exists.");
			return false;
		}

		setPageComplete(true);
		return true;
	}

	public void setProjectName(String name) {
		if (projectNameText.getText().isEmpty()) {
			projectNameText.setText(name);
		}
	}

	public void setLocation(String defaultDirectory) {
		defaultPath = defaultDirectory;
		if (projectLocationText.getText().isEmpty()) {
			projectLocationText.setText(defaultPath + File.separator + projectNameText.getText());
		}
	}

	public String getProjectName() {
		return projectNameText.getText().trim();
	}

	public String getGradleVersion() {
		return gradleVersionCombo.getText();
	}

	private boolean projectExsitsInWorkspace() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProject project = workspace.getRoot().getProject(getProjectName());
		if (project != null && project.exists()) {
			return true;
		}
		return false;
	}

}
