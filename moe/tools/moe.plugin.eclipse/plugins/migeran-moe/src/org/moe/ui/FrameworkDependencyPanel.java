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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.moe.common.constants.MOEManifestConstants.LINKER_FLAGS;

public class FrameworkDependencyPanel {

	private Text dependecyFrameworkText;
	private Button addDependenyButton;
	private Button removeDependencyButton;
	private List dependecyFrameworksList;
	private Button addLinkerFlagButton;
	private Button removeLinkerFlagButton;
	private Text linkerFlagText;
	private List linkerFlagsList;
	private java.util.List<String> dependencyFrameWorksData;
	private java.util.List<String> linkerFlagsData;

	public FrameworkDependencyPanel(TabFolder tabFolder) {

		this.dependencyFrameWorksData = new ArrayList<>();
		this.linkerFlagsData = new ArrayList<>();

		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("Dependency");

		Group parent = new Group(tabFolder, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		parent.setText("Dependency");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		tabItem.setControl(parent);

		Group dependencyGroup = new Group(parent, SWT.NONE);
		dependencyGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout dependencyGroupLayout = new GridLayout();
		dependencyGroupLayout.numColumns = 4;
		dependencyGroup.setLayout(dependencyGroupLayout);

		addDependenyButton = new Button(dependencyGroup, SWT.SEARCH);
		addDependenyButton.setText("Add");
		addDependenyButton.setEnabled(false);
		addDependenyButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					String value = dependecyFrameworkText.getText();
					if (value != null && !value.isEmpty()) {
						dependecyFrameworksList.add(value);
						dependencyFrameWorksData.add(value);
					}
				}
					break;
				}
			}
		});

		removeDependencyButton = new Button(dependencyGroup, SWT.SEARCH);
		removeDependencyButton.setText("Delete");
		removeDependencyButton.setEnabled(false);
		removeDependencyButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					int idx = dependecyFrameworksList.getSelectionIndex();
					dependecyFrameworksList.remove(idx);
					dependencyFrameWorksData.remove(idx);
				}
					break;
				}
			}
		});

		Label dependencyLabel = new Label(dependencyGroup, SWT.NONE);
		dependencyLabel.setText("Framework: ");

		dependecyFrameworkText = new Text(dependencyGroup, SWT.SINGLE | SWT.BORDER);
		dependecyFrameworkText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		dependecyFrameworkText.setEditable(false);

		dependecyFrameworksList = new List(parent, SWT.BORDER | SWT.V_SCROLL);
		dependecyFrameworksList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		Group linkerFlagsGroup = new Group(parent, SWT.NONE);
		linkerFlagsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout linkerFlagsGroupLayout = new GridLayout();
		linkerFlagsGroupLayout.numColumns = 4;
		linkerFlagsGroup.setLayout(linkerFlagsGroupLayout);

		addLinkerFlagButton = new Button(linkerFlagsGroup, SWT.SEARCH);
		addLinkerFlagButton.setText("Add");
		addLinkerFlagButton.setEnabled(false);
		addLinkerFlagButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					String value = linkerFlagText.getText();
					if (value != null && !value.isEmpty()) {
						linkerFlagsList.add(value);
						linkerFlagsData.add(value);
					}
				}
					break;
				}
			}
		});

		removeLinkerFlagButton = new Button(linkerFlagsGroup, SWT.SEARCH);
		removeLinkerFlagButton.setText("Delete");
		removeLinkerFlagButton.setEnabled(false);
		removeLinkerFlagButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					int idx = linkerFlagsList.getSelectionIndex();
					linkerFlagsList.remove(idx);
					linkerFlagsData.remove(idx);
				}
					break;
				}
			}
		});

		Label linkerFlagLabel = new Label(linkerFlagsGroup, SWT.NONE);
		linkerFlagLabel.setText("Linker flag: ");

		linkerFlagText = new Text(linkerFlagsGroup, SWT.SINGLE | SWT.BORDER);
		linkerFlagText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		linkerFlagText.setEditable(false);

		linkerFlagsList = new List(parent, SWT.BORDER | SWT.V_SCROLL);
		linkerFlagsList.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	public Map<String, String> getManifestProperties() {
		Map<String, String> result = new HashMap<String, String>();

		StringBuilder framework = new StringBuilder();
		for (String element : dependencyFrameWorksData) {
			framework.append(String.format("-framework %s;", element));

		}
		if (framework.toString().length() > 0) {
			result.put(LINKER_FLAGS.MOE_FRAMEWORKS.name(), framework.toString());
		}

		StringBuilder flags = new StringBuilder();
		for (String element : linkerFlagsData) {
			flags.append(element).append(";");
		}
		if (flags.toString().length() > 0) {
			result.put(LINKER_FLAGS.MOE_CUSTOM_LINKER_FLAGS.name(), flags.toString());
		}

		return result;
	}

	public class DependencyTabListener {

		void addDependency(Set<String> dependencyList) {
			for (String dependency : dependencyList) {
				dependecyFrameworksList.add(dependency);
				dependencyFrameWorksData.add(dependency);
			}
			setPanelEnabled(true);
		}

		void clearDependency() {
			dependecyFrameworksList.removeAll();
			dependencyFrameWorksData.clear();
			setPanelEnabled(false);
		}
	}

	private void setPanelEnabled(boolean b) {
		dependecyFrameworkText.setEditable(b);
		addDependenyButton.setEnabled(b);
		removeDependencyButton.setEnabled(b);
		addLinkerFlagButton.setEnabled(b);
		removeLinkerFlagButton.setEnabled(b);
		linkerFlagText.setEditable(b);
	}

	public DependencyTabListener getListener() {
		return new DependencyTabListener();
	}

}
