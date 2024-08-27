/*******************************************************************************
 * Copyright (c) 2000, 2015 IBM Corporation and others.
 * Copyright (C) 2016 Migeran
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.moe.runconfig;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.internal.ui.SWTFactory;
import org.eclipse.debug.ui.StringVariableSelectionDialog;
import org.eclipse.jdt.internal.debug.ui.actions.ControlAccessibleListener;
import org.eclipse.jdt.internal.debug.ui.launcher.LauncherMessages;
import org.eclipse.jdt.internal.debug.ui.launcher.NameValuePairDialog;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.moe.utils.logger.LoggerFactory;

@SuppressWarnings("restriction")
public class ArgumentsTab extends AbstractTab {

	private static final Logger LOG = LoggerFactory.getLogger(ArgumentsTab.class);

	protected Text environmentVariablesText;
	protected Text vmArgumentsText;
	protected Text programArgumentsText;
	private TableViewer tableViewer;
	private EnvironmentTableListener tableListener = new EnvironmentTableListener();
	private Button parametersAddButton;
	private Button parametersEditButton;
	private Button parametersRemoveButton;

	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		Composite comp = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(1, true);
		comp.setLayout(layout);
		comp.setFont(font);

		GridData gd = new GridData(GridData.FILL_BOTH);
		comp.setLayoutData(gd);
		setControl(comp);

		Group environmentGroup = new Group(comp, SWT.NONE);
		environmentGroup.setFont(font);
		layout = new GridLayout();
		environmentGroup.setLayout(layout);
		environmentGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
		environmentGroup.setText("Enviroment variables:");

		createEnvironmentVariablesSection(environmentGroup);

		Group vmArgumentsGroup = new Group(comp, SWT.NONE);
		vmArgumentsGroup.setFont(font);
		layout = new GridLayout();
		vmArgumentsGroup.setLayout(layout);
		vmArgumentsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
		vmArgumentsGroup.setText("VM arguments:");

		vmArgumentsText = new Text(vmArgumentsGroup, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
		vmArgumentsText.addTraverseListener(new TraverseListener() {
			@Override
			public void keyTraversed(TraverseEvent e) {
				switch (e.detail) {
				case SWT.TRAVERSE_ESCAPE:
				case SWT.TRAVERSE_PAGE_NEXT:
				case SWT.TRAVERSE_PAGE_PREVIOUS:
					e.doit = true;
					break;
				case SWT.TRAVERSE_RETURN:
				case SWT.TRAVERSE_TAB_NEXT:
				case SWT.TRAVERSE_TAB_PREVIOUS:
					if ((vmArgumentsText.getStyle() & SWT.SINGLE) != 0) {
						e.doit = true;
					} else {
						if (!vmArgumentsText.isEnabled() || (e.stateMask & SWT.MODIFIER_MASK) != 0) {
							e.doit = true;
						}
					}
					break;
				}
			}
		});
		gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 40;
		gd.widthHint = 100;
		vmArgumentsText.setLayoutData(gd);
		vmArgumentsText.setFont(font);
		vmArgumentsText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent evt) {
				updateLaunchConfigurationDialog();
			}
		});
		ControlAccessibleListener.addListener(vmArgumentsText, vmArgumentsGroup.getText());

		Button vmArgumentsTextButton = createPushButton(vmArgumentsGroup, "Variables...", null);
		vmArgumentsTextButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		vmArgumentsTextButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
				dialog.open();
				String variable = dialog.getVariableExpression();
				if (variable != null) {
					vmArgumentsText.insert(variable);
				}
			}
		});

		Group programArgumentsGroup = new Group(comp, SWT.NONE);
		programArgumentsGroup.setFont(font);
		layout = new GridLayout();
		programArgumentsGroup.setLayout(layout);
		programArgumentsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
		programArgumentsGroup.setText("Program arguments:");

		programArgumentsText = new Text(programArgumentsGroup, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL);
		programArgumentsText.addTraverseListener(new TraverseListener() {
			@Override
			public void keyTraversed(TraverseEvent e) {
				switch (e.detail) {
				case SWT.TRAVERSE_ESCAPE:
				case SWT.TRAVERSE_PAGE_NEXT:
				case SWT.TRAVERSE_PAGE_PREVIOUS:
					e.doit = true;
					break;
				case SWT.TRAVERSE_RETURN:
				case SWT.TRAVERSE_TAB_NEXT:
				case SWT.TRAVERSE_TAB_PREVIOUS:
					if ((vmArgumentsText.getStyle() & SWT.SINGLE) != 0) {
						e.doit = true;
					} else {
						if (!programArgumentsText.isEnabled() || (e.stateMask & SWT.MODIFIER_MASK) != 0) {
							e.doit = true;
						}
					}
					break;
				}
			}
		});
		gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 40;
		gd.widthHint = 100;
		programArgumentsText.setLayoutData(gd);
		programArgumentsText.setFont(font);
		programArgumentsText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent evt) {
				updateLaunchConfigurationDialog();
			}
		});
		ControlAccessibleListener.addListener(programArgumentsText, programArgumentsGroup.getText());

		Button programArgumentsTextButton = createPushButton(programArgumentsGroup, "Variables...", null);
		programArgumentsTextButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		programArgumentsTextButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				StringVariableSelectionDialog dialog = new StringVariableSelectionDialog(getShell());
				dialog.open();
				String variable = dialog.getVariableExpression();
				if (variable != null) {
					programArgumentsText.insert(variable);
				}
			}
		});
	}

	@Override
	public String getName() {
		return "Arguments";
	}

	@Override
	public void initializeFrom(ILaunchConfiguration config) {
		Map<String, String> input = new HashMap<String, String>();
		try {
			Map<String, String> params = config.getAttribute(ApplicationManager.ENVIRONMENT_VARIABLES_KEY,
					(Map<String, String>) null);
			if (params != null) {
				input.putAll(params);
			}
		} catch (CoreException e) {
			LOG.error("Configuration error", e);
		}
		tableViewer.setInput(input);
		try {
			vmArgumentsText.setText(config.getAttribute(ApplicationManager.VM_ARGUMENTS_KEY, ""));
			programArgumentsText.setText(config.getAttribute(ApplicationManager.PROGRAM_ARGUMENTS_KEY, ""));
		} catch (CoreException e) {
			LOG.error("Configuration error", e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy workingCopy) {
		workingCopy.setAttribute(ApplicationManager.ENVIRONMENT_VARIABLES_KEY, getViewerInput());
		workingCopy.setAttribute(ApplicationManager.VM_ARGUMENTS_KEY, getAttributeValueFrom(vmArgumentsText));
		workingCopy.setAttribute(ApplicationManager.PROGRAM_ARGUMENTS_KEY, getAttributeValueFrom(programArgumentsText));
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy workingCopy) {
		// TODO Auto-generated method stub

	}

	private void createEnvironmentVariablesSection(Composite comp) {
		Composite paramcomp = SWTFactory.createComposite(comp, comp.getFont(), 2, 1, GridData.FILL_BOTH, 0, 0);

		Table ptable = new Table(paramcomp, SWT.FULL_SELECTION | SWT.BORDER);
		tableViewer = new TableViewer(ptable);
		GridData gd = new GridData(GridData.FILL_BOTH);
		ptable.setLayoutData(gd);
		TableColumn column1 = new TableColumn(ptable, SWT.NONE);
		column1.setText(LauncherMessages.appletlauncher_argumenttab_parameterscolumn_name_text);
		TableColumn column2 = new TableColumn(ptable, SWT.NONE);
		column2.setText(LauncherMessages.appletlauncher_argumenttab_parameterscolumn_value_text);
		TableLayout tableLayout = new TableLayout();
		ptable.setLayout(tableLayout);
		tableLayout.addColumnData(new ColumnWeightData(100));
		tableLayout.addColumnData(new ColumnWeightData(100));
		ptable.setHeaderVisible(true);
		ptable.setLinesVisible(true);
		ptable.addSelectionListener(tableListener);
		ptable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				setParametersButtonsEnableState();
				if (parametersEditButton.isEnabled()) {
					handleParametersEditButtonSelected();
				}
			}
		});

		tableViewer.setContentProvider(new IStructuredContentProvider() {
			@Override
			public Object[] getElements(Object inputElement) {
				Map<?, ?> params = (Map<?, ?>) inputElement;
				return params.keySet().toArray();
			}

			@Override
			public void dispose() {
			}

			@Override
			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}
		});

		tableViewer.setLabelProvider(new ITableLabelProvider() {
			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}

			@Override
			public String getColumnText(Object element, int columnIndex) {
				if (columnIndex == 0) {
					return element.toString();
				}

				String key = (String) element;
				Map<String, String> params = getViewerInput();
				Object object = params.get(key);
				if (object != null) {
					return object.toString();
				}
				return null;
			}

			@Override
			public void addListener(ILabelProviderListener listener) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {
			}
		});

		tableViewer.setComparator(new ViewerComparator());

		Composite envcomp = SWTFactory.createComposite(paramcomp, paramcomp.getFont(), 1, 1,
				GridData.VERTICAL_ALIGN_BEGINNING | GridData.HORIZONTAL_ALIGN_FILL, 0, 0);

		parametersAddButton = createPushButton(envcomp,
				LauncherMessages.appletlauncher_argumenttab_parameters_button_add_text, null);
		parametersAddButton.addSelectionListener(tableListener);

		parametersEditButton = createPushButton(envcomp,
				LauncherMessages.appletlauncher_argumenttab_parameters_button_edit_text, null);
		parametersEditButton.addSelectionListener(tableListener);

		parametersRemoveButton = createPushButton(envcomp,
				LauncherMessages.appletlauncher_argumenttab_parameters_button_remove_text, null);
		parametersRemoveButton.addSelectionListener(tableListener);
	}

	@SuppressWarnings("unchecked")
	private Map<String, String> getViewerInput() {
		return (Map<String, String>) tableViewer.getInput();
	}

	private class EnvironmentTableListener extends SelectionAdapter implements ModifyListener {

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.swt.events.ModifyListener#modifyText(org.eclipse.swt.
		 * events.ModifyEvent)
		 */
		@Override
		public void modifyText(ModifyEvent e) {
			updateLaunchConfigurationDialog();
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.
		 * swt.events.SelectionEvent)
		 */
		@Override
		public void widgetSelected(SelectionEvent e) {
			Object source = e.getSource();
			if (source == tableViewer.getTable() || source == tableViewer) {
				setParametersButtonsEnableState();
			} else if (source == parametersAddButton) {
				handleParametersAddButtonSelected();
			} else if (source == parametersEditButton) {
				handleParametersEditButtonSelected();
			} else if (source == parametersRemoveButton) {
				handleParametersRemoveButtonSelected();
			}
		}

	}

	private void handleParametersAddButtonSelected() {
		NameValuePairDialog dialog = new NameValuePairDialog(getShell(),
				LauncherMessages.appletlauncher_argumenttab_parameters_dialog_add_title,
				new String[] { LauncherMessages.appletlauncher_argumenttab_parameters_dialog_add_name_text,
						LauncherMessages.appletlauncher_argumenttab_parameters_dialog_add_value_text }, //
				new String[] { "", "" });
		openNewParameterDialog(dialog, null);
		setParametersButtonsEnableState();
	}

	private void handleParametersEditButtonSelected() {
		IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
		String key = (String) selection.getFirstElement();
		Map<String, String> params = getViewerInput();
		String value = params.get(key);

		NameValuePairDialog dialog = new NameValuePairDialog(getShell(),
				LauncherMessages.appletlauncher_argumenttab_parameters_dialog_edit_title,
				new String[] { LauncherMessages.appletlauncher_argumenttab_parameters_dialog_edit_name_text,
						LauncherMessages.appletlauncher_argumenttab_parameters_dialog_edit_value_text }, //
				new String[] { key, value });

		openNewParameterDialog(dialog, key);
	}

	private void handleParametersRemoveButtonSelected() {
		IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
		Object[] keys = selection.toArray();
		for (int i = 0; i < keys.length; i++) {
			String key = (String) keys[i];
			Map<String, String> params = getViewerInput();
			params.remove(key);
		}
		tableViewer.refresh();
		setParametersButtonsEnableState();
		updateLaunchConfigurationDialog();
	}

	/**
	 * Set the enabled state of the three environment variable-related buttons
	 * based on the selection in the Table widget.
	 */
	private void setParametersButtonsEnableState() {
		IStructuredSelection selection = (IStructuredSelection) tableViewer.getSelection();
		int selectCount = selection.size();
		if (selectCount < 1) {
			parametersEditButton.setEnabled(false);
			parametersRemoveButton.setEnabled(false);
		} else {
			parametersRemoveButton.setEnabled(true);
			if (selectCount == 1) {
				parametersEditButton.setEnabled(true);
			} else {
				parametersEditButton.setEnabled(false);
			}
		}
		parametersAddButton.setEnabled(true);
	}

	/**
	 * Show the specified dialog and update the parameter table based on its
	 * results.
	 * 
	 * @param dialog
	 *            the dialog
	 * @param key
	 *            the key to edit
	 */
	private void openNewParameterDialog(NameValuePairDialog dialog, String key) {
		if (dialog.open() != Window.OK) {
			return;
		}
		String[] nameValuePair = dialog.getNameValuePair();
		Map<String, String> params = getViewerInput();
		params.remove(key);
		params.put(nameValuePair[0], nameValuePair[1]);
		tableViewer.refresh();
		updateLaunchConfigurationDialog();
	}

	protected String getAttributeValueFrom(Text text) {
		String content = text.getText().trim();
		if (content.length() > 0) {
			return content;
		}
		return null;
	}

}
