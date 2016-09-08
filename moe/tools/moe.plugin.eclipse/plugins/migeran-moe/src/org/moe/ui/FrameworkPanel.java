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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;
import org.moe.common.constants.MOEManifestConstants;
import org.moe.common.constants.MOEManifestConstants.LIBRARIES_PATHS;
import org.moe.tools.natjgen.utils.FrameworkUtil;
import org.moe.tools.natjgen.utils.FrameworkUtil.CPU_TYPE;
import org.moe.ui.CopyBundlePanel.CopyBundleTabListener;
import org.moe.ui.FrameworkDependencyPanel.DependencyTabListener;

public class FrameworkPanel {

	private Set<CPU_TYPE> archList;
	private Map<String, Set<CPU_TYPE>> archFileMapping;
	private Boolean type;
	private Button forceLoad;
	private Label availableArchitecturesLabel;
	private Label typeLabel;
	private Shell shell;
	private Text availableArchitecturesText;
	private Text typeText;
	private DependencyTabListener dependencyTabListener;
	private CopyBundleTabListener copyBundleTabListener;
	private FrameworkGroup frameworkGroup;
	private String framework;

	public FrameworkPanel(Shell shell, TabFolder tabFolder) {
		this.shell = shell;
		this.archList = new HashSet<CPU_TYPE>();
		this.archFileMapping = new HashMap<String, Set<CPU_TYPE>>();
		this.type = null;

		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("Framework");

		Group parent = new Group(tabFolder, SWT.NONE);
		parent.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		parent.setText("Framework");
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		parent.setLayout(layout);

		tabItem.setControl(parent);

		frameworkGroup = new FrameworkGroup(parent);

		forceLoad = new Button(parent, SWT.CHECK);
		forceLoad.setText("Force load");
		forceLoad.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {

				}
					break;
				}
			}
		});

		Group descriptionGroup = new Group(parent, SWT.NONE);
		descriptionGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout descriptionGroupLayout = new GridLayout();
		descriptionGroupLayout.numColumns = 2;
		descriptionGroup.setLayout(descriptionGroupLayout);

		availableArchitecturesLabel = new Label(descriptionGroup, SWT.NONE);
		availableArchitecturesLabel.setText("Available Architectures:");

		availableArchitecturesText = new Text(descriptionGroup, SWT.SINGLE | SWT.BORDER);
		availableArchitecturesText.setEditable(false);
		availableArchitecturesText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		typeLabel = new Label(descriptionGroup, SWT.NONE);
		typeLabel.setText("Type:");

		typeText = new Text(descriptionGroup, SWT.SINGLE | SWT.BORDER);
		typeText.setEditable(false);
		typeText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	public void setCopyBundleTabListener(CopyBundleTabListener listener) {
		this.copyBundleTabListener = listener;
	}

	public void setDependencyTabListener(DependencyTabListener dependencyTabListener) {
		this.dependencyTabListener = dependencyTabListener;
	}

	private void updateStatus() {
		String archs = "";
		type = null;

		archList.clear();

		File framework = new File(frameworkGroup.getFrameWorkPath());
		if (framework.exists()) {
			File file = new File(framework.getPath(), framework.getName().replace(".framework", ""));
			Set<CPU_TYPE> setArch = new HashSet<CPU_TYPE>(FrameworkUtil.checkArchitectures(file));
			archFileMapping.put(framework.getPath(), setArch);
			archList.addAll(setArch);
		}

		if (archList.size() > 0) {
			StringBuilder content = new StringBuilder();
			type = false;
			for (CPU_TYPE typeArch : archList) {
				content.append(typeArch.getName()).append(", ");
				type |= typeArch.isStatic();
			}
			archs = content.toString();
			archs = archs.substring(0, archs.length() - 2);
		}

		updateArchs(archs);
		updateType(type);
	}

	private void updateArchs(String statInfo) {
		availableArchitecturesText.setText(statInfo);
	}

	private void updateType(Boolean isStatic) {
		String staticFramework = "";
		if (isStatic != null) {
			staticFramework = isStatic ? "static" : "dynamic";
		}

		typeText.setText(staticFramework);
	}

	private void updateDependency() {
		dependencyTabListener.clearDependency();
		copyBundleTabListener.clearDependency();

		File frameworkFile = new File(frameworkGroup.getFrameWorkPath());

		if (frameworkFile != null) {
			Map<String, String> frameworkMap = FrameworkUtil.getFrameworkMap();

			File headerFolder = new File(frameworkFile, "Headers");
			if (headerFolder.exists()) {
				Set<String> dependencyList = new HashSet<String>();

				List<File> headerList = getAllSubFiles(headerFolder);

				File privateHeadersFile = new File(frameworkFile, "PrivateHeaders");
				if (privateHeadersFile.exists()) {
					headerList.addAll(getAllSubFiles(privateHeadersFile));
				}

				Pattern includePattern = Pattern.compile(".*((import)|(include)).*<\\s*\\w+/\\w+.*\\s*>.*");

				for (File header : headerList) {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(new FileReader(header));

						String line;
						while ((line = reader.readLine()) != null) {
							Matcher includeMatcher = includePattern.matcher(line);
							if (includeMatcher.find()) {
								int bracketIdx = line.indexOf("<");
								int slashIdx = line.indexOf("/");
								String framework = line.substring(bracketIdx + 1, slashIdx).trim();
								if (frameworkMap.containsKey(framework)) {
									dependencyList.add(framework);
								}

							}

						}
					} catch (Exception e) {

					} finally {
						if (reader != null) {
							try {
								reader.close();
							} catch (IOException e) {

							}
						}
					}
				}

				// add all dependency in list;
				dependencyTabListener.addDependency(dependencyList);
				copyBundleTabListener.addDependency(dependencyList);
			}
		}

	}

	private class FrameworkGroup {

		private Group frameworkGroup;
		private Text frameworkText;

		public FrameworkGroup(Composite parent) {

			this.frameworkGroup = new Group(parent, SWT.NONE);
			frameworkGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			GridLayout frameworkGroupLayout = new GridLayout();
			frameworkGroupLayout.numColumns = 5;
			frameworkGroup.setLayout(frameworkGroupLayout);

			Label frameworkLabel = new Label(frameworkGroup, SWT.NONE);
			frameworkLabel.setText("Select framework:");

			frameworkText = new Text(frameworkGroup, SWT.SINGLE | SWT.BORDER);
			frameworkText.setEditable(false);
			frameworkText.addModifyListener(new CustomModifiListener());
			GridData textdata = new GridData(GridData.FILL_HORIZONTAL);
			textdata.minimumWidth = 150;
			frameworkText.setLayoutData(textdata);

			Button browserButton = new Button(frameworkGroup, SWT.SEARCH);
			browserButton.setText("...");
			browserButton.addListener(SWT.Selection, new Listener() {

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

			Button addButton = new Button(frameworkGroup, SWT.SEARCH);
			addButton.setText(" + ");
			addButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					switch (event.type) {
					case SWT.Selection: {

					}
						break;
					}
				}
			});

			Button removeButton = new Button(frameworkGroup, SWT.SEARCH);
			removeButton.setText(" - ");
			removeButton.addListener(SWT.Selection, new Listener() {

				@Override
				public void handleEvent(Event event) {
					switch (event.type) {
					case SWT.Selection: {

					}
						break;
					}
				}
			});
		}

		public String getFrameWorkPath() {
			return frameworkText.getText();
		}

		private void showFrameworkDialog() {
			DirectoryDialog dialog = new DirectoryDialog(shell, SWT.SHEET);
			dialog.setMessage("Select framework");
			dialog.setFilterPath("farmework");
			String selectedDirectory = dialog.open();
			if (selectedDirectory != null) {
				frameworkText.setText(selectedDirectory);
				framework = selectedDirectory;
			}
		}
	}

	private class CustomModifiListener implements ModifyListener {

		@Override
		public void modifyText(ModifyEvent arg0) {
			updateStatus();
			if (type != null && type) {
				updateDependency();
			} else {
				dependencyTabListener.clearDependency();
			}
		}
	}

	public Map<String, String> getManifestProperties() {
		Map<String, String> result = new HashMap<String, String>();

		String value = frameworkGroup.getFrameWorkPath();
		File frameworkFile = new File(value);
		if (value != null && !value.isEmpty() && frameworkFile.exists()) {

			Set<CPU_TYPE> archs = archFileMapping.get(value);
			if (archs == null) {
				throw new NullPointerException("Failed to get manifest properties!");
			}

			if (archs.size() >= 4) {
				result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_universal.name(),
						"./lib/" + frameworkFile.getName());
				result.put(MOEManifestConstants.MOE_TYPE, typeText.getText());
				return result;
			} else if (archs.size() >= 2) {
				boolean isArm = false;
				for (CPU_TYPE arch : archs) {
					isArm |= arch.isArm();
				}

				if (isArm) {
					result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_device.name(),
							"./lib/device/" + frameworkFile.getName());
				} else {
					result.put(LIBRARIES_PATHS.MOE_ThirdpartyFramework_ios_simulator.name(),
							"./lib/simulator/" + frameworkFile.getName());
				}
			} else if (archs.size() == 1) {
				CPU_TYPE arch = archs.iterator().next();
				result.put(arch.getManifestConst(),
						String.format("./lib/%s/", arch.getName()) + frameworkFile.getName());
			}
		}

		result.put(MOEManifestConstants.MOE_TYPE, typeText.getText());
		return result;
	}

	protected List<File> getAllSubFiles(File folder) {
		List<File> result = new ArrayList<File>();

		File[] listFiles = folder.listFiles();
		if (listFiles != null) {
			for (File file : listFiles) {
				if (file.isDirectory()) {
					result.addAll(getAllSubFiles(file));
				} else {
					result.add(file);
				}
			}
		} else {
		}

		return result;
	}

	public File getFile() {
		return new File(framework);
	}

}
