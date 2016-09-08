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

import java.util.regex.Pattern;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class XcodeWizardPage extends AbstractWizardPage {

	private Text xcodeProjectNameText;
	private Text productNameText;
	private Text organizationNameText;
	private Text companyIdentifierText;
	private Button keepXcodeButton;
	private Label xcodePathLabel;
	private Text xcodePathText;
	private Group xcodePathGroup;

	private Pattern validJavaPackagePattern = Pattern.compile("^[a-zA-Z_\\$][\\w\\$]*(?:\\.[a-zA-Z_\\$][\\w\\$]*)*$");

	protected XcodeWizardPage(String pageName) {
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

		Group projectGroup = new Group(parent, SWT.NONE);
		projectGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectGroup.setText("Xcode Project");
		GridLayout projectLayout = new GridLayout();
		projectLayout.numColumns = 1;
		projectGroup.setLayout(projectLayout);

		Group projectNameGroup = new Group(projectGroup, SWT.NONE);
		projectNameGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout projectNameLayout = new GridLayout();
		projectNameLayout.numColumns = 2;
		projectNameGroup.setLayout(projectNameLayout);

		Label sdkLabel = new Label(projectNameGroup, SWT.NONE);
		sdkLabel.setText("Xcode Project Name:");

		xcodeProjectNameText = new Text(projectNameGroup, SWT.SINGLE | SWT.BORDER);
		xcodeProjectNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		xcodeProjectNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				validate();
				productNameText.setText(xcodeProjectNameText.getText());
			}
		});

		keepXcodeButton = new Button(projectGroup, SWT.CHECK);
		keepXcodeButton.setText("Keep Xcode Project");
		keepXcodeButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					xcodePathGroup.setVisible(keepXcodeButton.getSelection());
				}
					break;
				}
			}
		});

		xcodePathGroup = new Group(projectGroup, SWT.NONE);
		xcodePathGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout xcodePathLayout = new GridLayout();
		xcodePathLayout.numColumns = 2;
		xcodePathGroup.setLayout(xcodePathLayout);
		xcodePathGroup.setVisible(false);

		xcodePathLabel = new Label(xcodePathGroup, SWT.NONE);
		xcodePathLabel.setText("Xcode Project Path:");

		xcodePathText = new Text(xcodePathGroup, SWT.SINGLE | SWT.BORDER);
		xcodePathText.addModifyListener(new ValidateListener());
		xcodePathText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		xcodePathText.setText("xcode");

		Group bundleGroup = new Group(parent, SWT.NONE);
		bundleGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		bundleGroup.setText("Bundle Properties");
		GridLayout bundleLayout = new GridLayout();
		bundleLayout.numColumns = 2;
		bundleGroup.setLayout(bundleLayout);

		Label productNameLabel = new Label(bundleGroup, SWT.NONE);
		productNameLabel.setText("Product Name:");
		productNameText = new Text(bundleGroup, SWT.SINGLE | SWT.BORDER);
		productNameText.addModifyListener(new ValidateListener());
		productNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label organizationNameLabel = new Label(bundleGroup, SWT.NONE);
		organizationNameLabel.setText("Organization Name:");
		organizationNameText = new Text(bundleGroup, SWT.SINGLE | SWT.BORDER);
		organizationNameText.addModifyListener(new ValidateListener());
		organizationNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label companyIdentifierLabel = new Label(bundleGroup, SWT.NONE);
		companyIdentifierLabel.setText("Company Identifier:");
		companyIdentifierText = new Text(bundleGroup, SWT.SINGLE | SWT.BORDER);
		companyIdentifierText.addModifyListener(new ValidateListener());
		companyIdentifierText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		setPageComplete(false);
		validate();
	}

	@Override
	public boolean canFlipToNextPage() {
		return true;
	}

	@Override
	public IWizardPage getNextPage() {
		IWizardPage nextPage = super.getNextPage();
		if (nextPage instanceof ProjecrSettingsPage) {
			ProjecrSettingsPage settingsPage = (ProjecrSettingsPage)nextPage;
			settingsPage.setProjectName(xcodeProjectNameText.getText().trim());
			settingsPage.setLocation(getDefaultDirectory());
		}
		return nextPage;
	}

	public String getOrganizationName() {
		return organizationNameText.getText().trim();
	}

	public String getProductName() {
		return productNameText.getText().trim();
	}

	public String getXcodeProjectPath() {
		return xcodePathText.getText().trim();
	}

	public boolean isKeepXcodeProject() {
		return keepXcodeButton.getSelection();
	}

	public String getCompanyIdentifier() {
		return companyIdentifierText.getText().trim();
	}

	protected boolean validate() {
		setMessage(null);
		setErrorMessage(null);
		if (xcodeProjectNameText.getText().trim().isEmpty()) {
			setErrorMessage("Enter a Xcode Project Name");
			return false;
		}

		if (productNameText.getText().trim().isEmpty()) {
			setErrorMessage("Enter a Product Name");
			return false;
		}

		if (organizationNameText.getText().trim().isEmpty()) {
			setErrorMessage("Enter a Organization Name");
			return false;
		}

		if (companyIdentifierText.getText().trim().isEmpty()) {
			setErrorMessage("Enter a Company Identifier");
			return false;
		}

		if (!validJavaPackagePattern.matcher(productNameText.getText()).matches()
				|| !validJavaPackagePattern.matcher(xcodeProjectNameText.getText()).matches()) {
			setErrorMessage(
					"Product Name or Project Name is invalid!\n" + "1) Allowed word characters (a-zA-Z_0-9) and dots.\n"
							+ "2) Segments between dots must be of non-zero length.\n"
							+ "3) A digit cannot be the first character.");
		}

		if (keepXcodeButton.getSelection()) {
			if (xcodePathText.getText().trim().isEmpty()) {
				setErrorMessage("Enter a Xcode Project Path");
				return false;
			}
		}

		setPageComplete(true);
		return true;
	}

	private String getDefaultDirectory() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath path = workspace.getRoot().getLocation();
		return path.toOSString();
	}

}
