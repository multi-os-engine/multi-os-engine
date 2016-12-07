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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.moe.tools.natjgen.FrameworkBinding;
import org.eclipse.swt.widgets.Button;

public class FrameworkComposite extends Composite {
	
	private Text nameText;
	private Text frameworkPathText;
	private Text packageNameText;
	private Text importHeadersText;
	private Button browseButton;
	
	private FrameworkBinding frameworkBinding;
	private BindingEditorForm editorForm;
	private boolean inited = false;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public FrameworkComposite(Composite parent, int style) {
		super(parent, style);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(10, 10, 430, 290);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(10, 10, 111, 14);
		lblNewLabel.setText("Name:");
		
		nameText = new Text(composite, SWT.BORDER);
		nameText.setBounds(127, 10, 235, 19);
		
		frameworkPathText = new Text(composite, SWT.BORDER);
		frameworkPathText.setBounds(127, 35, 235, 19);
		
		packageNameText = new Text(composite, SWT.BORDER);
		packageNameText.setBounds(127, 60, 235, 19);
		
		Label lblNewLabel_1 = new Label(composite, SWT.NONE);
		lblNewLabel_1.setBounds(10, 35, 111, 14);
		lblNewLabel_1.setText("Framework path:");
		
		Label lblNewLabel_2 = new Label(composite, SWT.NONE);
		lblNewLabel_2.setBounds(10, 60, 111, 14);
		lblNewLabel_2.setText("Base package name:");
		
		Label lblNewLabel_3 = new Label(composite, SWT.NONE);
		lblNewLabel_3.setBounds(10, 105, 111, 14);
		lblNewLabel_3.setText("Import headers:");
		
		importHeadersText = new Text(composite, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		importHeadersText.setBounds(10, 125, 410, 78);
		
		browseButton = new Button(composite, SWT.NONE);
		browseButton.setBounds(368, 31, 52, 28);
		browseButton.setText("...");
		
		setDefaultValuesAndListeners();

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	private void setDefaultValuesAndListeners() {
		
		nameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					frameworkBinding.setName(nameText.getText().trim());
					documentChanged();
				}
			}
		});
		
		frameworkPathText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					frameworkBinding.setFrameworkPath(frameworkPathText.getText().trim());
					documentChanged();
				}
			}
		});
		
		packageNameText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					frameworkBinding.setPackageBase(packageNameText.getText().trim());
					documentChanged();
				}
			}
		});
		
		importHeadersText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				if (inited) {
					frameworkBinding.setImportCode(importHeadersText.getText().trim());
					documentChanged();
				}
			}
		});
		
		browseButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				showChooserDialog();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	public void initWithFrameworkBinding(FrameworkBinding frameworkBinding) {
		inited = false;
		this.frameworkBinding = frameworkBinding;
		
		String name = frameworkBinding.getName();
		name = name == null ? "" : frameworkBinding.getName();
		nameText.setText(name);
		
		String frameworkPath = frameworkBinding.getFrameworkPath();
		frameworkPath = frameworkPath == null ? "" : frameworkPath;
		frameworkPathText.setText(frameworkPath);
		
		String packageName = frameworkBinding.getPackageBase();
		packageName = packageName == null ? "" : packageName;
		packageNameText.setText(packageName);
		
		String importCode = frameworkBinding.getImportCode();
		importCode = importCode == null ? "" : importCode;
		importHeadersText.setText(importCode);
		
		inited = true;
	}
	
	public void setBindingEditorForm(BindingEditorForm form) {
		this.editorForm = form;
	}
	
	private void documentChanged() {
		editorForm.documentChanged();
	}
	
	private void showChooserDialog() {
		DirectoryDialog directoryDialog = new DirectoryDialog(getShell());
		directoryDialog.setText("Select Framework.");
		String selected = directoryDialog.open();
		if (selected != null) {
			frameworkPathText.setText(selected);
		}
	}

}
