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
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.moe.tools.natjgen.HeaderBinding;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;

public class HeaderComposite extends Composite {

	private Text nameText;
	private Text headerPathText;
	private Text pacgaeNameText;
	private Text explicitLibraryText;
	private Text importHeadersText;
	private List headerSearchPathsList;
	private Button newHeaderSearchPathButton;
	private Button removeHeaderSearchPathButton;
	private List userHeaderSearchPathsList;
	private Button newUserHeaderSearchPathButton;
	private Button removeUserHeaderSearchPathButton;
	private List frameworkSearchPathsList;
	private Button newFrameworkSearchPathButton;
	private Button removeFrameworkSearchPathButton;
	private Button browseHeaderPathButton;
	
	private HeaderBinding headerBinding;
	private BindingEditorForm editorForm;
	private boolean inited = false;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public HeaderComposite(Composite parent, int style) {
		super(parent, style);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(10, 10, 461, 446);
		
		nameText = new Text(composite, SWT.BORDER);
		nameText.setBounds(139, 10, 249, 19);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(10, 13, 123, 14);
		lblNewLabel.setText("Name:");
		
		headerPathText = new Text(composite, SWT.BORDER);
		headerPathText.setBounds(139, 35, 249, 19);
		
		pacgaeNameText = new Text(composite, SWT.BORDER);
		pacgaeNameText.setBounds(139, 60, 249, 19);
		
		explicitLibraryText = new Text(composite, SWT.BORDER);
		explicitLibraryText.setBounds(139, 87, 249, 19);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setBounds(10, 40, 123, 14);
		lblNewLabel_1.setText("Header path:");
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setBounds(10, 65, 123, 14);
		lblNewLabel_2.setText("Base package name:");
		
		Label lblNewLabel_3 = new Label(composite, SWT.NONE);
		lblNewLabel_3.setBounds(10, 90, 123, 14);
		lblNewLabel_3.setText("Explicit library:");
		
		Label lblNewLabel_4 = new Label(composite, SWT.NONE);
		lblNewLabel_4.setBounds(10, 110, 149, 14);
		lblNewLabel_4.setText("Header search paths:");
		
		headerSearchPathsList = new List(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		headerSearchPathsList.setBounds(10, 130, 348, 58);
		
		newHeaderSearchPathButton = new Button(composite, SWT.NONE);
		newHeaderSearchPathButton.setBounds(364, 130, 56, 28);
		newHeaderSearchPathButton.setText("+");
		
		removeHeaderSearchPathButton = new Button(composite, SWT.NONE);
		removeHeaderSearchPathButton.setBounds(364, 160, 56, 28);
		removeHeaderSearchPathButton.setText("-");
		
		Label lblUserHeaderSearch = new Label(composite, SWT.NONE);
		lblUserHeaderSearch.setBounds(10, 196, 149, 14);
		lblUserHeaderSearch.setText("User header search paths:");
		
		userHeaderSearchPathsList = new List(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		userHeaderSearchPathsList.setBounds(10, 216, 348, 58);
		
		newUserHeaderSearchPathButton = new Button(composite, SWT.NONE);
		newUserHeaderSearchPathButton.setBounds(364, 216, 56, 28);
		newUserHeaderSearchPathButton.setText("+");
		
		removeUserHeaderSearchPathButton = new Button(composite, SWT.NONE);
		removeUserHeaderSearchPathButton.setBounds(364, 246, 56, 28);
		removeUserHeaderSearchPathButton.setText("-");
		
		Label lblNewLabel_5 = new Label(composite, SWT.NONE);
		lblNewLabel_5.setBounds(10, 280, 149, 14);
		lblNewLabel_5.setText("Framework search paths:");
		
		frameworkSearchPathsList = new List(composite, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		frameworkSearchPathsList.setBounds(10, 297, 348, 58);
		
		newFrameworkSearchPathButton = new Button(composite, SWT.NONE);
		newFrameworkSearchPathButton.setBounds(364, 297, 56, 28);
		newFrameworkSearchPathButton.setText("+");
		
		removeFrameworkSearchPathButton = new Button(composite, SWT.NONE);
		removeFrameworkSearchPathButton.setBounds(364, 327, 56, 28);
		removeFrameworkSearchPathButton.setText("-");
		
		Label lblNewLabel_6 = new Label(composite, SWT.NONE);
		lblNewLabel_6.setBounds(10, 361, 149, 14);
		lblNewLabel_6.setText("Import headers:");
		
		importHeadersText = new Text(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		importHeadersText.setBounds(10, 381, 348, 55);
		
		browseHeaderPathButton = new Button(composite, SWT.NONE);
		browseHeaderPathButton.setBounds(398, 31, 42, 28);
		browseHeaderPathButton.setText("...");
		
		setDefaultValuesAndListeners();
	}
	
	private void setDefaultValuesAndListeners() {
		
		nameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					headerBinding.setName(nameText.getText().trim());
					documentChanged();
				}
			}
		});
		
		headerPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					headerBinding.setHeaderPath(headerPathText.getText().trim());
					documentChanged();
				}
			}
		});
		
		pacgaeNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					headerBinding.setPackageBase(pacgaeNameText.getText().trim());
					documentChanged();
				}
			}
		});
		
		explicitLibraryText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					headerBinding.setExplicitLibrary(explicitLibraryText.getText().trim());
					documentChanged();
				}
			}
		});
		
		importHeadersText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					headerBinding.setImportCode(importHeadersText.getText().trim());
					documentChanged();
				}
			}
		});
		
		newHeaderSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				showChooserDialog(headerSearchPathsList);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		removeHeaderSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				int idx = headerSearchPathsList.getSelectionIndex();
				if (idx >= 0) {
					headerBinding.getHeaderSearchPaths().remove(idx);
					headerSearchPathsList.remove(idx);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		newUserHeaderSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				showChooserDialog(userHeaderSearchPathsList);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		removeUserHeaderSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				int idx = headerSearchPathsList.getSelectionIndex();
				if (idx >= 0) {
					headerBinding.getUserHeaderSearchPaths().remove(idx);
					userHeaderSearchPathsList.remove(idx);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		newFrameworkSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				showChooserDialog(frameworkSearchPathsList);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		removeFrameworkSearchPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				int idx = headerSearchPathsList.getSelectionIndex();
				if (idx >= 0) {
					headerBinding.getFrameworkSearchPaths().remove(idx);
					frameworkSearchPathsList.remove(idx);
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		browseHeaderPathButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				showChooserDialog(null);
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void initWithHeaderBinding(HeaderBinding headerBinding) {
		inited = false;
		this.headerBinding = headerBinding;
		
		String name = headerBinding.getName();
		name = name == null ? "" : name;
		nameText.setText(name);
		
		String headerPath = headerBinding.getHeaderPath();
		headerPath = headerPath == null ? "" : headerPath;
		headerPathText.setText(headerPath);
		
		String packageName = headerBinding.getPackageBase();
		packageName = packageName == null ? "" : packageName;
		pacgaeNameText.setText(packageName);
		
		String explicitLibrary = headerBinding.getExplicitLibrary();
		explicitLibrary = explicitLibrary == null ? "" : explicitLibrary;
		explicitLibraryText.setText(explicitLibrary);
		
		String importCode = headerBinding.getImportCode();
		importCode = importCode == null ? "" : importCode;
		importHeadersText.setText(importCode);
		
		for (String path : headerBinding.getHeaderSearchPaths()) {
			headerSearchPathsList.add(path);
		}
		
		for (String path : headerBinding.getUserHeaderSearchPaths()) {
			userHeaderSearchPathsList.add(path);
		}
		
		for (String path : headerBinding.getFrameworkSearchPaths()) {
			frameworkSearchPathsList.add(path);
		}
		
		inited = true;
	}
	
	public void setBindingEditorForm(BindingEditorForm form) {
		this.editorForm = form;
	}
	
	private void documentChanged() {
		editorForm.documentChanged();
	}
	
	private void showChooserDialog(List list) {
		DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
		directoryDialog.setText("Select Search Path.");
		String selected = directoryDialog.open();
		if (selected != null) {
			if (list == headerSearchPathsList) {
				headerSearchPathsList.add(selected);
				headerBinding.getHeaderSearchPaths().add(selected);
			} else if (list == userHeaderSearchPathsList) {
				userHeaderSearchPathsList.add(selected);
				headerBinding.getUserHeaderSearchPaths().add(selected);
			} else if (list == frameworkSearchPathsList) {
				frameworkSearchPathsList.add(selected);
				headerBinding.getFrameworkSearchPaths().add(selected);
			} else if (list == null) {
				headerPathText.setText(selected);
			}
		}
	}
}
