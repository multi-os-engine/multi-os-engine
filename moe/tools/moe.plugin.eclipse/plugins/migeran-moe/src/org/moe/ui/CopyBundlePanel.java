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

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.moe.common.constants.MOEManifestConstants.BUNDLE_RESOURCES;

public class CopyBundlePanel {

	private Shell shell;
	private Button copyBundleResourceAddButton;
	private Button copyBundleResourceRemoveButton;
	private List copyBundleResourceList;
	private java.util.List<String> copyBundleResourceData;

	public CopyBundlePanel(Shell shell, TabFolder tabFolder) {
		this.shell = shell;
		this.copyBundleResourceData = new ArrayList<>();

		TabItem tabItem = new TabItem(tabFolder, SWT.NULL);
		tabItem.setText("Copy bundle resources");

		Group parent = new Group(tabFolder, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		parent.setText("Copy bundle resources");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		tabItem.setControl(parent);

		Group copyBundleResourceGroup = new Group(parent, SWT.NONE);
		copyBundleResourceGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout copyBundleResourceGroupLayout = new GridLayout();
		copyBundleResourceGroupLayout.numColumns = 2;
		copyBundleResourceGroup.setLayout(copyBundleResourceGroupLayout);

		copyBundleResourceAddButton = new Button(copyBundleResourceGroup, SWT.SEARCH);
		copyBundleResourceAddButton.setText("Add");
		copyBundleResourceAddButton.setEnabled(false);
		copyBundleResourceAddButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					showFrameworkDialog();
				}
					break;
				}
			}
		});

		copyBundleResourceRemoveButton = new Button(copyBundleResourceGroup, SWT.SEARCH);
		copyBundleResourceRemoveButton.setText("Delete");
		copyBundleResourceRemoveButton.setEnabled(false);
		copyBundleResourceRemoveButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					int idx = copyBundleResourceList.getSelectionIndex();
					copyBundleResourceList.remove(idx);
					copyBundleResourceData.remove(idx);
				}
					break;
				}
			}
		});

		copyBundleResourceList = new List(parent, SWT.BORDER | SWT.V_SCROLL);
		copyBundleResourceList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	public Map<String, String> getManifestProperties() {
		Map<String, String> result = new HashMap<String, String>();

		StringBuilder folderContent = new StringBuilder();
		StringBuilder fileContent = new StringBuilder();
		for (String entry : copyBundleResourceData) {
			File bundle = new File(entry.toString());
			if (bundle.exists() && bundle.isDirectory()) {
				folderContent.append(bundle.getAbsolutePath()).append(":");
			} else if (bundle.exists() && bundle.isFile()) {
				fileContent.append(bundle.getAbsolutePath()).append(":");
			}

		}

		if (folderContent.toString().length() > 0) {
			result.put(BUNDLE_RESOURCES.MOE_BUNDLE_FOLDER_RESOURCES.name(), folderContent.toString());
		}

		if (fileContent.toString().length() > 0) {
			result.put(BUNDLE_RESOURCES.MOE_BUNDLE_FILE_RESOURCES.name(), fileContent.toString());
		}

		return result;
	}

	private void showFrameworkDialog() {
		DirectoryDialog dialog = new DirectoryDialog(shell, SWT.SHEET);
		dialog.setMessage("Select bundle resource");
		dialog.setFilterPath("farmework");
		String selectedDirectory = dialog.open();
		if (selectedDirectory != null) {
			copyBundleResourceList.add(selectedDirectory);
			copyBundleResourceData.add(selectedDirectory);
		}
	}

	public class CopyBundleTabListener {

		void addDependency(Set<String> dependencyList) {
			setPanelEnabled(true);
		}

		void clearDependency() {
			setPanelEnabled(false);
		}
	}

	private void setPanelEnabled(boolean b) {
		copyBundleResourceAddButton.setEnabled(b);
		copyBundleResourceRemoveButton.setEnabled(b);
	}

	public CopyBundleTabListener getListener() {
		return new CopyBundleTabListener();
	}

}
