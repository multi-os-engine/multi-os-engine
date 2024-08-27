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
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.swt.widgets.TabFolder;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.moe.editors.EditorUtil;
import org.moe.editors.Framework;
import org.moe.editors.InfoPlistManager;
import org.moe.editors.XcodeEditorManager;

import com.dd.plist.NSString;

import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

public class TargetEditorPage extends AbstractEditiorPage {
	
	public static final String INHERITED = "Inherited";
	
	private Text bundleIdText;
	private Text versionText;
	private Text build;
	private Text productName;
	private Text mainClass;
	private Button copyCaCertificates;
	private Combo deploymentCombo;
	private Label inheritedDeploymentLabel;
	private Combo devicesCombo;
	private Label inheritedDeviceLabel;
	private TabItem tbtmIphone;
	private Combo iphoneMainInterfaceCombo;
	private Button iphonePortrait;
	private Button iphoneUpsideDown;
	private Button iphoneLandscapeLeft;
	private Button iphonelandscapeRight;
	private Combo statusBarStyleCombo;
	private Button iphoneHideStatusBar;
	private Button iphoneRequriesFullScreen;
	private TabItem tbtmIpad;
	private Combo ipadMainInterfaceCombo;
	private Button ipadPortrait;
	private Button ipadUpsideDown;
	private Button ipadLandscapeLeft;
	private Button ipadLandscapeRight;
	private Button ipadHideDuring;
	private Button ipadrequiresFullScreen;
	private Combo launchScreenCombo;
	private List frameworksList;
	private Button addButton;
	private Button removeButton;
	
	private XcodeEditorManager xcodeEditorManager;
	private InfoPlistManager infoPlistManager;
	private Map<String, String> devices;
	Map<String, NSString> styles;
	private String inheritedDeviceName;
    private String inheritedDeploymentTargetName;
    private String bundleIdProjectFile;
    private Map<String, Framework> frameworksMap;

	/**
	 * Create the form page.
	 * @param id
	 * @param title
	 */
	public TargetEditorPage(String id, String title) {
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
	public TargetEditorPage(FormEditor editor, String id, String title, boolean main) {
		super(editor, id, title, main);
		this.frameworksMap = new HashMap<>();
	}

	/**
	 * Create contents of the form.
	 * @param managedForm
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm) {
		managedForm.getForm().setAlwaysShowScrollBars(true);
		managedForm.getForm().getBody().setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		FormToolkit toolkit = managedForm.getToolkit();
		toolkit.setBackground(null);
		ScrolledForm form = managedForm.getForm();
		Composite body = form.getBody();
		toolkit.decorateFormHeading(form.getForm());
		toolkit.paintBordersFor(body);
		managedForm.getForm().getBody().setLayout(new FillLayout(SWT.HORIZONTAL));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(managedForm.getForm().getBody(), SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setAlwaysShowScrollBars(true);
		managedForm.getToolkit().adapt(scrolledComposite);
		managedForm.getToolkit().paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Group group = new Group(scrolledComposite, SWT.NONE);
		managedForm.getToolkit().adapt(group);
		managedForm.getToolkit().paintBordersFor(group);
		group.setLayout(new FormLayout());
		
		Group group_1 = new Group(group, SWT.NONE);
		FormData fd_group_1 = new FormData();
		fd_group_1.right = new FormAttachment(0, 548);
		fd_group_1.top = new FormAttachment(0);
		fd_group_1.left = new FormAttachment(0);
		group_1.setLayoutData(fd_group_1);
		managedForm.getToolkit().adapt(group_1);
		managedForm.getToolkit().paintBordersFor(group_1);
		group_1.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel = new Label(group_1, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		managedForm.getToolkit().adapt(lblNewLabel, true, true);
		lblNewLabel.setText("Bundle Identifier:");
		
		bundleIdText = new Text(group_1, SWT.BORDER);
		bundleIdText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(bundleIdText, true, true);
		
		Label lblNewLabel_1 = new Label(group_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_1, true, true);
		lblNewLabel_1.setText("Version:");
		
		versionText = new Text(group_1, SWT.BORDER);
		versionText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(versionText, true, true);
		
		Label lblNewLabel_2 = new Label(group_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_2, true, true);
		lblNewLabel_2.setText("Build:");
		
		build = new Text(group_1, SWT.BORDER);
		build.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(build, true, true);
		
		Label lblNewLabel_3 = new Label(group_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_3, true, true);
		lblNewLabel_3.setText("Product name:");
		
		productName = new Text(group_1, SWT.BORDER);
		productName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(productName, true, true);
		
		Label lblNewLabel_4 = new Label(group_1, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_4, true, true);
		lblNewLabel_4.setText("Main class:");
		
		mainClass = new Text(group_1, SWT.BORDER);
		mainClass.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(mainClass, true, true);
		new Label(group_1, SWT.NONE);
		
		copyCaCertificates = new Button(group_1, SWT.CHECK);
		managedForm.getToolkit().adapt(copyCaCertificates, true, true);
		copyCaCertificates.setText("Copy CA Certificates");
		
		Group group_2 = new Group(group, SWT.NONE);
		FormData fd_group_2 = new FormData();
		fd_group_2.bottom = new FormAttachment(0, 245);
		fd_group_2.right = new FormAttachment(0, 548);
		fd_group_2.top = new FormAttachment(0, 162);
		fd_group_2.left = new FormAttachment(0);
		group_2.setLayoutData(fd_group_2);
		managedForm.getToolkit().adapt(group_2);
		managedForm.getToolkit().paintBordersFor(group_2);
		group_2.setLayout(new GridLayout(4, false));
		
		Label lblDeploymentTarget = new Label(group_2, SWT.NONE);
		managedForm.getToolkit().adapt(lblDeploymentTarget, true, true);
		lblDeploymentTarget.setText("Deployment target:");
		
		deploymentCombo = new Combo(group_2, SWT.NONE);
		deploymentCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(deploymentCombo);
		managedForm.getToolkit().paintBordersFor(deploymentCombo);
		new Label(group_2, SWT.NONE);
		
		Label lblNewLabel_5 = new Label(group_2, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_5, true, true);
		
		inheritedDeploymentLabel = new Label(group_2, SWT.NONE);
		managedForm.getToolkit().adapt(inheritedDeploymentLabel, true, true);
		inheritedDeploymentLabel.setText("Devices:");
		
		devicesCombo = new Combo(group_2, SWT.NONE);
		devicesCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(devicesCombo);
		managedForm.getToolkit().paintBordersFor(devicesCombo);
		new Label(group_2, SWT.NONE);
		
		inheritedDeviceLabel = new Label(group_2, SWT.NONE);
		managedForm.getToolkit().adapt(inheritedDeviceLabel, true, true);
		
		Group group_3 = new Group(group, SWT.NONE);
		FormData fd_group_3 = new FormData();
		fd_group_3.right = new FormAttachment(0, 548);
		fd_group_3.top = new FormAttachment(0, 251);
		fd_group_3.left = new FormAttachment(0);
		group_3.setLayoutData(fd_group_3);
		managedForm.getToolkit().adapt(group_3);
		managedForm.getToolkit().paintBordersFor(group_3);
		group_3.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(group_3, SWT.NONE);
		managedForm.getToolkit().adapt(tabFolder);
		managedForm.getToolkit().paintBordersFor(tabFolder);
		
		tbtmIphone = new TabItem(tabFolder, SWT.NONE);
		tbtmIphone.setText("iPhone");
		
		Group group_5 = new Group(tabFolder, SWT.NONE);
		tbtmIphone.setControl(group_5);
		managedForm.getToolkit().paintBordersFor(group_5);
		group_5.setLayout(new GridLayout(2, false));
		
		Label lblMainInterface = new Label(group_5, SWT.NONE);
		managedForm.getToolkit().adapt(lblMainInterface, true, true);
		lblMainInterface.setText("Main interface:");
		
		iphoneMainInterfaceCombo = new Combo(group_5, SWT.NONE);
		iphoneMainInterfaceCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(iphoneMainInterfaceCombo);
		managedForm.getToolkit().paintBordersFor(iphoneMainInterfaceCombo);
		
		Label lblNewLabel_8 = new Label(group_5, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_8, true, true);
		lblNewLabel_8.setText("Device orientation");
		
		iphonePortrait = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphonePortrait, true, true);
		iphonePortrait.setText("Portrait");
		new Label(group_5, SWT.NONE);
		
		iphoneUpsideDown = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphoneUpsideDown, true, true);
		iphoneUpsideDown.setText("Upside Down");
		new Label(group_5, SWT.NONE);
		
		iphoneLandscapeLeft = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphoneLandscapeLeft, true, true);
		iphoneLandscapeLeft.setText("Landscape Left");
		new Label(group_5, SWT.NONE);
		
		iphonelandscapeRight = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphonelandscapeRight, true, true);
		iphonelandscapeRight.setText("Landscape Right");
		
		Label lblStatusBarStyle = new Label(group_5, SWT.NONE);
		managedForm.getToolkit().adapt(lblStatusBarStyle, true, true);
		lblStatusBarStyle.setText("Status Bar Style:");
		
		statusBarStyleCombo = new Combo(group_5, SWT.NONE);
		statusBarStyleCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(statusBarStyleCombo);
		managedForm.getToolkit().paintBordersFor(statusBarStyleCombo);
		new Label(group_5, SWT.NONE);
		
		iphoneHideStatusBar = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphoneHideStatusBar, true, true);
		iphoneHideStatusBar.setText("Hide status bar");
		new Label(group_5, SWT.NONE);
		
		iphoneRequriesFullScreen = new Button(group_5, SWT.CHECK);
		managedForm.getToolkit().adapt(iphoneRequriesFullScreen, true, true);
		iphoneRequriesFullScreen.setText("Requries full screen");
		
		tbtmIpad = new TabItem(tabFolder, SWT.NONE);
		tbtmIpad.setText("iPad");
		
		Group group_6 = new Group(tabFolder, SWT.NONE);
		tbtmIpad.setControl(group_6);
		managedForm.getToolkit().paintBordersFor(group_6);
		group_6.setLayout(new GridLayout(2, false));
		
		Label lblNewLabel_9 = new Label(group_6, SWT.NONE);
		managedForm.getToolkit().adapt(lblNewLabel_9, true, true);
		lblNewLabel_9.setText("Main interface:");
		
		ipadMainInterfaceCombo = new Combo(group_6, SWT.NONE);
		ipadMainInterfaceCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(ipadMainInterfaceCombo);
		managedForm.getToolkit().paintBordersFor(ipadMainInterfaceCombo);
		
		Label lblDeviceOrientation = new Label(group_6, SWT.NONE);
		managedForm.getToolkit().adapt(lblDeviceOrientation, true, true);
		lblDeviceOrientation.setText("Device orientation:");
		
		ipadPortrait = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadPortrait, true, true);
		ipadPortrait.setText("Portrait");
		new Label(group_6, SWT.NONE);
		
		ipadUpsideDown = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadUpsideDown, true, true);
		ipadUpsideDown.setText("Upside Down");
		new Label(group_6, SWT.NONE);
		
		ipadLandscapeLeft = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadLandscapeLeft, true, true);
		ipadLandscapeLeft.setText("Landscape Left");
		new Label(group_6, SWT.NONE);
		
		ipadLandscapeRight = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadLandscapeRight, true, true);
		ipadLandscapeRight.setText("Landscape Right");
		new Label(group_6, SWT.NONE);
		
		ipadHideDuring = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadHideDuring, true, true);
		ipadHideDuring.setText("Hide during application launch");
		new Label(group_6, SWT.NONE);
		
		ipadrequiresFullScreen = new Button(group_6, SWT.CHECK);
		managedForm.getToolkit().adapt(ipadrequiresFullScreen, true, true);
		ipadrequiresFullScreen.setText("Requires full screen");
		
		Group group_4 = new Group(group, SWT.NONE);
		FormData fd_group_4 = new FormData();
		fd_group_4.right = new FormAttachment(0, 548);
		fd_group_4.top = new FormAttachment(0, 520);
		fd_group_4.left = new FormAttachment(0);
		group_4.setLayoutData(fd_group_4);
		managedForm.getToolkit().adapt(group_4);
		managedForm.getToolkit().paintBordersFor(group_4);
		group_4.setLayout(new GridLayout(2, false));
		
		Label lblLaunchScreenFile = new Label(group_4, SWT.NONE);
		managedForm.getToolkit().adapt(lblLaunchScreenFile, true, true);
		lblLaunchScreenFile.setText("Launch Screen File:");
		
		launchScreenCombo = new Combo(group_4, SWT.NONE);
		launchScreenCombo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		managedForm.getToolkit().adapt(launchScreenCombo);
		managedForm.getToolkit().paintBordersFor(launchScreenCombo);
		
		Group grpLinkedFrameworksAnd = new Group(group, SWT.NONE);
		grpLinkedFrameworksAnd.setText("Linked Frameworks and Libraries");
		grpLinkedFrameworksAnd.setLayout(new FormLayout());
		FormData fd_grpLinkedFrameworksAnd = new FormData();
		fd_grpLinkedFrameworksAnd.bottom = new FormAttachment(100);
		fd_grpLinkedFrameworksAnd.right = new FormAttachment(0, 548);
		fd_grpLinkedFrameworksAnd.top = new FormAttachment(0, 572);
		fd_grpLinkedFrameworksAnd.left = new FormAttachment(0);
		grpLinkedFrameworksAnd.setLayoutData(fd_grpLinkedFrameworksAnd);
		managedForm.getToolkit().adapt(grpLinkedFrameworksAnd);
		managedForm.getToolkit().paintBordersFor(grpLinkedFrameworksAnd);
		
		Group group_8 = new Group(grpLinkedFrameworksAnd, SWT.NONE);
		FormData fd_group_8 = new FormData();
		fd_group_8.right = new FormAttachment(0, 422);
		fd_group_8.top = new FormAttachment(0);
		fd_group_8.left = new FormAttachment(0);
		group_8.setLayoutData(fd_group_8);
		managedForm.getToolkit().adapt(group_8);
		managedForm.getToolkit().paintBordersFor(group_8);
		
		Group group_9 = new Group(grpLinkedFrameworksAnd, SWT.NONE);
		FormData fd_group_9 = new FormData();
		fd_group_9.bottom = new FormAttachment(group_8, 0, SWT.BOTTOM);
		
		frameworksList = new List(group_8, SWT.BORDER | SWT.V_SCROLL);
		frameworksList.setBounds(0, 0, 408, 72);
		managedForm.getToolkit().adapt(frameworksList, true, true);
		fd_group_9.right = new FormAttachment(0, 534);
		fd_group_9.top = new FormAttachment(0);
		fd_group_9.left = new FormAttachment(0, 428);
		group_9.setLayoutData(fd_group_9);
		managedForm.getToolkit().adapt(group_9);
		managedForm.getToolkit().paintBordersFor(group_9);
		group_9.setLayout(new FillLayout(SWT.VERTICAL));
		
		addButton = new Button(group_9, SWT.NONE);
		managedForm.getToolkit().adapt(addButton, true, true);
		addButton.setText("Add");
		
		removeButton = new Button(group_9, SWT.NONE);
		managedForm.getToolkit().adapt(removeButton, true, true);
		removeButton.setText("Remove");
		scrolledComposite.setContent(group);
		scrolledComposite.setMinSize(group.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		setDefaultValuesAndListeners();
		
		readData();
	}
	
	private void setDefaultValuesAndListeners() {
		bundleIdText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (bundleIdProjectFile == null) {
                    infoPlistManager.setBundleIdentifier(bundleIdText.getText().trim());
                } else {
                    if (isMain()) {
                        xcodeEditorManager.setBundleIdentifier(bundleIdText.getText().trim());
                    } else {
                        xcodeEditorManager.setTestBundleIdentifier(bundleIdText.getText().trim());
                    }
                }
			}
		});
		
		versionText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				infoPlistManager.setVersion(versionText.getText().trim());
			}
		});
		
		productName.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (isMain()) {
                    xcodeEditorManager.setMainProductName(productName.getText().trim());
                } else {
                    xcodeEditorManager.setTestProductName(productName.getText().trim());
                }
			}
		});
		
		mainClass.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				infoPlistManager.setMainClassName(mainClass.getText().trim());
			}
		});
		
		build.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				infoPlistManager.setBuild(build.getText().trim());
			}
		});
		
		copyCaCertificates.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (isMain()) {
                    xcodeEditorManager.setCopyAndroidCertsMain(copyCaCertificates.getSelection());
                } else {
                    xcodeEditorManager.setCopyAndroidCertsTest(copyCaCertificates.getSelection());
                }
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		for (String target : XcodeEditorManager.DEPLOYMENT_TARGET_SUGGESTED_VALUES) {
			deploymentCombo.add(target);
        }
		
		deploymentCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String target = deploymentCombo.getText();
				setInheritedDeploymentTargetLabel(target);
                target = target.equals(INHERITED) ? null : target;
				if (isMain()) {
					xcodeEditorManager.setMainDeploymentTarget(target);
				} else {
					xcodeEditorManager.setTestDeploymentTarget(target);
				}
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
				String device = devicesCombo.getText();
				setInheritedDeviceLabel(device);
                device = device.equals(INHERITED) ? null : device;
				if (isMain()) {
					xcodeEditorManager.setMainDevices(device);;
				} else {
					xcodeEditorManager.setTestDevices(device);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        styles = InfoPlistManager.getStatusBarStylesMap();
        for (String name : styles.keySet()) {
        	statusBarStyleCombo.add(name);
        }
        
        statusBarStyleCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setStyle(styles.get(statusBarStyleCombo.getText()));
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphonePortrait.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfacePortrait(iphonePortrait.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadPortrait.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfacePortraitIPad(ipadPortrait.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphoneUpsideDown.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceUpsideDown(iphoneUpsideDown.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

        ipadUpsideDown.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceUpsideDownIPad(ipadUpsideDown.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadLandscapeLeft.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceLandscapeLeftIPad(ipadLandscapeLeft.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphoneLandscapeLeft.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceLandscapeLeftIPad(iphoneLandscapeLeft.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadLandscapeRight.addSelectionListener(new SelectionListener() {
        	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceLandscapeRightIPad(ipadLandscapeRight.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphonelandscapeRight.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setInterfaceLandscapeRightIPad(iphonelandscapeRight.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadrequiresFullScreen.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setRequiresFullScreen(ipadrequiresFullScreen.getSelection());
				iphoneRequriesFullScreen.setSelection(ipadrequiresFullScreen.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphoneRequriesFullScreen.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setRequiresFullScreen(ipadrequiresFullScreen.getSelection());
				ipadrequiresFullScreen.setSelection(iphoneRequriesFullScreen.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadHideDuring.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setHideStatusBarIPad(ipadHideDuring.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphoneHideStatusBar.addSelectionListener(new SelectionListener() {
	
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				infoPlistManager.setHideStatusBar(iphoneHideStatusBar.getSelection());
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        iphoneMainInterfaceCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String interfaceName = iphoneMainInterfaceCombo.getText();
                if (interfaceName == null || interfaceName.equals("-")) {
                    infoPlistManager.setInterfaceFile(null);
                } else {
                    infoPlistManager.setInterfaceFile(interfaceName);
                }
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        ipadMainInterfaceCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String interfaceName = ipadMainInterfaceCombo.getText();
                if (interfaceName == null || interfaceName.equals("-")) {
                    infoPlistManager.setInterfaceFileIPad(null);
                } else {
                    infoPlistManager.setInterfaceFileIPad(interfaceName);
                }
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        launchScreenCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				String interfaceName = launchScreenCombo.getText();
                if (interfaceName == null || interfaceName.equals("-")) {
                    infoPlistManager.setLaunchScreenFile(null);
                } else {
                    infoPlistManager.setLaunchScreenFile(interfaceName);
                }
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        addButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Shell shell = Display.getDefault().getActiveShell();
				FrameworksDialog dialog = new FrameworksDialog(shell);
				if (dialog.open() == Window.OK) {
					Framework selectedFramework = dialog.getSelectedFramework();
                    if (!frameworksMap.containsKey(selectedFramework.getName())) {
                        if (isMain()) {
                            xcodeEditorManager.addFramewokToMain(selectedFramework);
                        } else {
                            xcodeEditorManager.addFramewokToTest(selectedFramework);
                        }
                        updateFrameworksList();
                    }
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
    	removeButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				Framework selectedFramework = frameworksMap.get(frameworksList.getItem(frameworksList.getSelectionIndex()));
                if (isMain()) {
                    xcodeEditorManager.removeMainFramework(selectedFramework);
                } else {
                    xcodeEditorManager.removeTestFramework(selectedFramework);
                }
                updateFrameworksList();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	public void readData() {
		bundleIdProjectFile = isMain() ? xcodeEditorManager.getBundleIdentifier() : xcodeEditorManager.getTestBundleIdentifier();
        String bundleIdInfoFile = infoPlistManager.getBundleIdentifier();
        String id = bundleIdProjectFile == null ? bundleIdInfoFile : bundleIdProjectFile;
        if (!bundleIdText.getText().equals(bundleIdText)) {
        	bundleIdText.setText(id);
        }
        String versionString = infoPlistManager.getVersion();
        if (!versionText.getText().equals(versionString)) {
            versionText.setText(versionString);
        }
        String buildString = infoPlistManager.getBuild();
        if (!build.getText().equals(buildString)) {
            build.setText(buildString);
        }

        String product = isMain() ? xcodeEditorManager.getMainProductName() : xcodeEditorManager.getTestProductName();
        if (!productName.getText().equals(product)) {
        	productName.setText(product);
        }

        String mainClassName = infoPlistManager.getMainClassName();
        if (!mainClass.getText().equals(mainClassName)) {
        	mainClass.setText(mainClassName);
        }

        boolean copyCA = isMain() ? xcodeEditorManager.isCopyAndroidCertsMain() : xcodeEditorManager.isCopyAndroidCertsTest();
        copyCaCertificates.setSelection(copyCA);
        
        String deviceName = isMain() ? xcodeEditorManager.getMainDevices() : xcodeEditorManager.getTestDevices();
        deviceName = EditorUtil.getKey(devices, deviceName);
        String deployment = isMain() ? xcodeEditorManager.getMainDeploymentTarget() : xcodeEditorManager.getTestDeploymentTarget();
        String selectedDevice = devicesCombo.getText();
        if (deviceName == null) {
            if (!selectedDevice.equals(INHERITED)) {
            	devicesCombo.setText(INHERITED);
            }
        } else if (!selectedDevice.equals(deviceName)) {
        	devicesCombo.setText(deviceName);
        }
        String selectedTarget = deploymentCombo.getText();
        if (deployment == null) {
            if (!selectedTarget.equals(INHERITED)) {
            	deploymentCombo.setText(INHERITED);
            }
        } else if (!selectedTarget.equals(deployment)) {
        	deploymentCombo.setText(deployment);
        }

        ipadPortrait.setSelection(infoPlistManager.isInterfacePortraitIPad());
        iphonePortrait.setSelection(infoPlistManager.isInterfacePortrait());
        statusBarStyleCombo.setText(EditorUtil.getNSStringKey(styles, infoPlistManager.getStyle()));
        ipadHideDuring.setSelection(infoPlistManager.isHideStatusBarIPad());
        iphoneHideStatusBar.setSelection(infoPlistManager.isHideStatusBar());
        ipadrequiresFullScreen.setSelection(infoPlistManager.isRequiresFullScreen());
        iphoneRequriesFullScreen.setSelection(infoPlistManager.isRequiresFullScreen());
        ipadUpsideDown.setSelection(infoPlistManager.isInterfaceUpsideDownIPad());
        iphoneUpsideDown.setSelection(infoPlistManager.isInterfaceUpsideDown());
        ipadLandscapeLeft.setSelection(infoPlistManager.isInterfaceLandscapeLeftIPad());
        iphoneLandscapeLeft.setSelection(infoPlistManager.isInterfaceLandscapeLeft());
        ipadLandscapeRight.setSelection(infoPlistManager.isInterfaceLandscapeRightIPad());
        iphonelandscapeRight.setSelection(infoPlistManager.isInterfaceLandscapeRight());
        
		iphoneMainInterfaceCombo.removeAll();
		ipadMainInterfaceCombo.removeAll();
		iphoneMainInterfaceCombo.add("-");
		ipadMainInterfaceCombo.add("-");
		
		Map<String, String> uiInterfaces = xcodeEditorManager.getInterfaceFiles();
        for (String uiInterface : uiInterfaces.keySet()) {
        	iphoneMainInterfaceCombo.add(uiInterface);
        	ipadMainInterfaceCombo.add(uiInterface);
        }
        String interfaceFile = infoPlistManager.getInterfaceFile();
        iphoneMainInterfaceCombo.setText(interfaceFile);
        ipadMainInterfaceCombo.setText(infoPlistManager.getInterfaceFileIPad());
        
        launchScreenCombo.removeAll();
        launchScreenCombo.add("-");

        for (String uiInterface : uiInterfaces.keySet()) {
        	launchScreenCombo.add(uiInterface);
        }
        String interfaceLaunchFile = infoPlistManager.getLaunchScreenFile(xcodeEditorManager);
        launchScreenCombo.setText(interfaceLaunchFile);
        
        updateFrameworksList();
	}
	
	private void updateFrameworksList() {
		java.util.List<Framework> frameworks = isMain() ? xcodeEditorManager.getMainFrameworks() : xcodeEditorManager.getTestFrameworks();
        frameworksMap.clear();
        frameworksList.removeAll();
        for (Framework framework : frameworks) {
        	frameworksList.add(framework.getName());
        	frameworksMap.put(framework.getName(), framework);
        }
	}

	@Override
	public void setXcodeEditorManager(XcodeEditorManager xcodeEditorManager) {
		this.xcodeEditorManager = xcodeEditorManager;
	}
	
	@Override
	public void setInfoPlistManager(InfoPlistManager infoPlistManager) {
		this.infoPlistManager = infoPlistManager;
	}
	
	private void setInheritedDeviceLabel(String label) {
        if (label.equals(INHERITED)) {
        	inheritedDeviceLabel.setVisible(true);
        	inheritedDeviceLabel.setText(EditorUtil.getKey(devices, inheritedDeviceName));
        } else {
        	inheritedDeviceLabel.setVisible(false);
        	inheritedDeviceLabel.setText("");
        }
    }

    private void setInheritedDeploymentTargetLabel(String label) {
        if (label.equals(INHERITED)) {
        	inheritedDeploymentLabel.setVisible(true);
        	inheritedDeploymentLabel.setText(inheritedDeploymentTargetName);
        } else {
        	inheritedDeploymentLabel.setVisible(false);
        	inheritedDeploymentLabel.setText("");
        }
    }
}
