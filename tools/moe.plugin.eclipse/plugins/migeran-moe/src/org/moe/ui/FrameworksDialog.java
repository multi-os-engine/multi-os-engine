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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Text;
import org.moe.editors.Framework;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.custom.ScrolledComposite;

public class FrameworksDialog extends Dialog {
	private Text searchText;
	private List frameworksList;
	private java.util.List<Framework> frameworks;
	private Map<String, Framework> frameworksMap;
	private Framework selectedFramework;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public FrameworksDialog(Shell parentShell) {
		super(parentShell);
		this.frameworks = Framework.getFrameworks();
		this.frameworksMap = new HashMap<>();
	}
	
	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Choose frameworks and libraries to add");
    }

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		Group group = new Group(container, SWT.NONE);
		FormData fd_group = new FormData();
		fd_group.bottom = new FormAttachment(0, 34);
		fd_group.right = new FormAttachment(0, 450);
		fd_group.top = new FormAttachment(0);
		fd_group.left = new FormAttachment(0);
		group.setLayoutData(fd_group);
		group.setLayout(new GridLayout(1, false));
		
		searchText = new Text(group, SWT.BORDER);
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		FormData fd_scrolledComposite = new FormData();
		fd_scrolledComposite.bottom = new FormAttachment(group, 184, SWT.BOTTOM);
		fd_scrolledComposite.top = new FormAttachment(group, 6);
		fd_scrolledComposite.left = new FormAttachment(0, 10);
		fd_scrolledComposite.right = new FormAttachment(0, 440);
		scrolledComposite.setLayoutData(fd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		frameworksList = new List(scrolledComposite, SWT.BORDER | SWT.V_SCROLL);
		scrolledComposite.setContent(frameworksList);
		scrolledComposite.setMinSize(frameworksList.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		searchText.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent arg0) {
				search(searchText.getText().trim());
			}
		});
		
		for (Framework framework : frameworks) {
			frameworksList.add(framework.getName());
			frameworksMap.put(framework.getName(), framework);
        }

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
	
	public Framework getSelectedFramework() {
		return selectedFramework;
	}
	
	private void search(String therm) {
		frameworksList.removeAll();
		frameworksMap.clear();
        if (therm == null || therm.isEmpty()) {
            for (Framework framework : frameworks) {
            	frameworksList.add(framework.getName());
            	frameworksMap.put(framework.getName(), framework);
            }
        } else {
            for (Framework framework : frameworks) {
                if (framework.getName().toLowerCase().contains(therm.toLowerCase())) {
                	frameworksList.add(framework.getName());
                	frameworksMap.put(framework.getName(), framework);
                }
            }
        }
    }
}
