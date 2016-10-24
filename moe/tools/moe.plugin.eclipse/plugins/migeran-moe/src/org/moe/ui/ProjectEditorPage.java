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

package org.moe.ui;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.wb.swt.SWTResourceManager;
import org.moe.editors.EditorUtil;
import org.moe.editors.XcodeEditorManager;

import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;

public class ProjectEditorPage extends AbstractEditiorPage {
	private Text projectName;
	private Text organizationName;
	private Combo deploymentTargetCombo;
	private Combo devicesCombo;
	
	private XcodeEditorManager xcodeEditorManager;
	private Map<String, String> devices;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public ProjectEditorPage(String id, String title) {
		super(id, title);
	}

	/**
	 * Create the form page.
	 * @param editor
	 * @param id
	 * @param title
	 * @wbp.parser.constructor
	 * @wbp.eval.method.parameter id "Some id"
	 * @wbp.eval.method.parameter title "Some title"
	 */
	public ProjectEditorPage(FormEditor editor, String id, String title, boolean main) {
		super(editor, id, title, main);
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.getForm().getBody().setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		FormToolkit toolkit = managedForm.getToolkit();
		toolkit.setBackground(null);
		ScrolledForm form = managedForm.getForm();
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FormLayout());
		
		Group group = new Group(managedForm.getForm().getBody(), SWT.NONE);
		group.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		FormData fd_group = new FormData();
		fd_group.bottom = new FormAttachment(0, 124);
		fd_group.right = new FormAttachment(0, 594);
		fd_group.top = new FormAttachment(0);
		fd_group.left = new FormAttachment(0);
		group.setLayoutData(fd_group);
		managedForm.getToolkit().adapt(group);
		managedForm.getToolkit().paintBordersFor(group);
		group.setLayout(new GridLayout(3, false));
		new Label(group, SWT.NONE);
		
		Label lblNewLabel = new Label(group, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Project name:");
		
		projectName = new Text(group, SWT.BORDER);
		projectName.setEditable(false);
		projectName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(projectName, true, true);
		new Label(group, SWT.NONE);
		
		Label lblDeploymentTarget = new Label(group, SWT.NONE);
		managedForm.getToolkit().adapt(lblDeploymentTarget, true, true);
		lblDeploymentTarget.setText("iOS Deployment Target:");
		
		deploymentTargetCombo = new Combo(group, SWT.NONE);
		deploymentTargetCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(deploymentTargetCombo);
		managedForm.getToolkit().paintBordersFor(deploymentTargetCombo);
		new Label(group, SWT.NONE);
		
		Label lblDevices_1 = new Label(group, SWT.NONE);
		managedForm.getToolkit().adapt(lblDevices_1, true, true);
		lblDevices_1.setText("Devices:");
		
		devicesCombo = new Combo(group, SWT.NONE);
		devicesCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(devicesCombo);
		managedForm.getToolkit().paintBordersFor(devicesCombo);
		new Label(group, SWT.NONE);
		
		Label lblDevices = new Label(group, SWT.NONE);
		lblDevices.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		managedForm.getToolkit().adapt(lblDevices, true, true);
		lblDevices.setText("Organization:");
		
		organizationName = new Text(group, SWT.BORDER);
		organizationName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(organizationName, true, true);
		
		setDefaultValuesAndListeners();
		
		readData();
	}
	
	private void setDefaultValuesAndListeners() {
		for (String target : XcodeEditorManager.DEPLOYMENT_TARGET_SUGGESTED_VALUES) {
			deploymentTargetCombo.add(target);
        }
		
		deploymentTargetCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				xcodeEditorManager.setDefaultDeploymentTarget(deploymentTargetCombo.getText());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		devices = XcodeEditorManager.getDevicesMap();
        for (String name : devices.keySet()) {
        	devicesCombo.add(name);
        }
        
        devicesCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				xcodeEditorManager.setDefaultDevices(devices.get(devicesCombo.getText()));
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        organizationName.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				xcodeEditorManager.setOrganizationName(organizationName.getText().trim());
				
			}
		});
	}

	public void readData() {
		String name = xcodeEditorManager.getProjectName();
		projectName.setText(name);
		deploymentTargetCombo.setText(xcodeEditorManager.getDefaultDeploymentTarget());
        devicesCombo.setText(EditorUtil.getKey(devices, xcodeEditorManager.getDefaultDevices()));
        organizationName.setText(xcodeEditorManager.getOrganizationName());
	}
	
	public void setXcodeEditorManager(XcodeEditorManager xcodeEditorManager) {
		this.xcodeEditorManager = xcodeEditorManager;
	}
}
