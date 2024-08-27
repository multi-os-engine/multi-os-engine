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

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Text;
import org.moe.tools.natjgen.FrameworkBinding;
import org.moe.tools.natjgen.HeaderBinding;
import org.eclipse.swt.widgets.Button;

public class NewBindingDialog extends Dialog {
	
	private Text text;
	private Button frameworkRadioButton;
	private Button headerRadioButton;
	private String name;
	private String type = FrameworkBinding.TYPE;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public NewBindingDialog(Shell parentShell) {
		super(parentShell);
	}
	
	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Create New Binding");
    }

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.top = new FormAttachment(0, 32);
		fd_lblNewLabel.left = new FormAttachment(0, 10);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Name:");
		
		text = new Text(container, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.right = new FormAttachment(lblNewLabel, 371, SWT.RIGHT);
		fd_text.top = new FormAttachment(0, 32);
		fd_text.left = new FormAttachment(lblNewLabel, 6);
		text.setLayoutData(fd_text);
		
		text.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				name = text.getText().trim();
			}
		});
		
		frameworkRadioButton = new Button(container, SWT.RADIO);
		frameworkRadioButton.setSelection(true);
		FormData fd_btnRadioButton = new FormData();
		fd_btnRadioButton.top = new FormAttachment(text, 21);
		fd_btnRadioButton.left = new FormAttachment(text, 0, SWT.LEFT);
		frameworkRadioButton.setLayoutData(fd_btnRadioButton);
		frameworkRadioButton.setText("Framework");
		
		frameworkRadioButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				type = FrameworkBinding.TYPE;
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		headerRadioButton = new Button(container, SWT.RADIO);
		FormData fd_btnRadioButton_1 = new FormData();
		fd_btnRadioButton_1.top = new FormAttachment(frameworkRadioButton, 17);
		fd_btnRadioButton_1.left = new FormAttachment(text, 0, SWT.LEFT);
		headerRadioButton.setLayoutData(fd_btnRadioButton_1);
		headerRadioButton.setText("Header");
		
		headerRadioButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				type = HeaderBinding.TYPE;
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
	
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
}
