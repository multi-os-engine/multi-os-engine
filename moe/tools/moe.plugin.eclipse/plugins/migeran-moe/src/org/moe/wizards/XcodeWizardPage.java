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

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.moe.generator.project.MOEProjectComposer;

import static org.moe.generator.project.MOEProjectComposer.Field.*;

public class XcodeWizardPage extends AbstractWizardPage {
	
	private final static String BUNDLE_ID = "Application Bundle Id: ";

	private Text projectNameText;
	private Text organizationNameText;
	private Text companyIdentifierText;
	private Text packageNameText;
	private Label bundleIdentifier;
	private MOEProjectComposer projectComposer;

	protected XcodeWizardPage(String pageName) {
		super(pageName);
		this.projectComposer = new MOEProjectComposer();
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
		projectGroup.setText("Project");
		GridLayout projectLayout = new GridLayout();
		projectLayout.numColumns = 1;
		projectGroup.setLayout(projectLayout);

		Group projectNameGroup = new Group(projectGroup, SWT.NONE);
		projectNameGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout projectNameLayout = new GridLayout();
		projectNameLayout.numColumns = 2;
		projectNameGroup.setLayout(projectNameLayout);

		Label projectNameLabel = new Label(projectNameGroup, SWT.NONE);
		projectNameLabel.setText("Project Name:");

		projectNameText = new Text(projectNameGroup, SWT.SINGLE | SWT.BORDER);
		projectNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				projectComposer.setProjectName(projectNameText.getText().trim());
				validate();
				
			}
		});
		
		Label packageNameLabel = new Label(projectNameGroup, SWT.NONE);
		packageNameLabel.setText("Package Name:");

		packageNameText = new Text(projectNameGroup, SWT.SINGLE | SWT.BORDER);
		packageNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		packageNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				projectComposer.setPackageName(packageNameText.getText().trim());
				bundleIdentifier.setText(BUNDLE_ID + projectComposer.getBundleID());
				validate();
			}
		});

		Group bundleGroup = new Group(parent, SWT.NONE);
		bundleGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		bundleGroup.setText("Bundle Properties");
		GridLayout bundleLayout = new GridLayout();
		bundleLayout.numColumns = 2;
		bundleGroup.setLayout(bundleLayout);

		Label organizationNameLabel = new Label(bundleGroup, SWT.NONE);
		organizationNameLabel.setText("Organization Name:");
		organizationNameText = new Text(bundleGroup, SWT.SINGLE | SWT.BORDER);
		organizationNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				projectComposer.setOrganizationName(organizationNameText.getText().trim());
				validate();
			}
		});
		organizationNameText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Label companyIdentifierLabel = new Label(bundleGroup, SWT.NONE);
		companyIdentifierLabel.setText("Company Identifier:");
		companyIdentifierText = new Text(bundleGroup, SWT.SINGLE | SWT.BORDER);
		companyIdentifierText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				projectComposer.setOrganizationID(companyIdentifierText.getText().trim());
				bundleIdentifier.setText(BUNDLE_ID + projectComposer.getBundleID());
				validate();
			}
		});
		companyIdentifierText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		Group bundleIdGroup = new Group(parent, SWT.NONE);
		bundleIdGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout bundleIdLayout = new GridLayout();
		bundleIdLayout.numColumns = 1;
		bundleIdGroup.setLayout(bundleIdLayout);
		
		bundleIdentifier = new Label(bundleIdGroup, SWT.NONE);
		bundleIdentifier.setText("Application Bundle Id} = {Organization Identifier}.{Product Name}");

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
			settingsPage.setProjectName(projectNameText.getText().trim());
		}
		return nextPage;
	}

	public String getOrganizationName() {
		return organizationNameText.getText().trim();
	}

	public String getCompanyIdentifier() {
		return companyIdentifierText.getText().trim();
	}
	
	public String getPackageName() {
		return packageNameText.getText().trim();
	}

	protected boolean validate() {
		setMessage(null);
		setErrorMessage(null);
		
		try {
            projectComposer.validate(
            		PROJECT_NAME,
                    PACKAGE_NAME,
                    ORGANIZATION_NAME,
                    ORGANIZATION_IDENTIFIER);
        } catch (MOEProjectComposer.MOEProjectComposerValidationException e) {
        	setPageComplete(false);
        	setErrorMessage(e.getMessage());
        }

		setPageComplete(true);
		return true;
	}

}
