package org.moe.ui;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.common.utils.OsUtils;
import org.moe.runconfig.ApplicationManager;
import org.moe.utils.SimCtl;
import org.moe.utils.logger.LoggerFactory;

public class SelectDeploymenttargetDialog extends Dialog {
	
	private static final Logger LOG = LoggerFactory.getLogger(SelectDeploymenttargetDialog.class);
	
	private Combo simulatorsCombo;
	private Combo devicesCombo;
	private Button simulatorButton;
	private Button deviceButton;
	private List<String> simulatorIds = new ArrayList<>();
	private List<String> deviceIds = new ArrayList<>();
	private IProject project;
	private ILaunchConfiguration launchConfiguration;
	private String simulatorUDID;
	private String deviceUDID;
	private boolean runOnSimulator;

	public SelectDeploymenttargetDialog(Shell parentShell, IProject project, ILaunchConfiguration launchConfiguration) {
		super(parentShell);
		this.project = project;
		this.launchConfiguration = launchConfiguration;
	}
	
	@Override
    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        
        Group runOnGroup = new Group(parent, SWT.NONE);
		runOnGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		runOnGroup.setText("Run on");
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		runOnGroup.setLayout(layout);

		simulatorButton = new Button(runOnGroup, SWT.RADIO);
		simulatorButton.setText("Simulator");
		simulatorButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					updateItems(true);
					simulatorUDID = simulatorIds.get(simulatorsCombo.getSelectionIndex());
				}
					break;
				}
			}
		});
        
        simulatorsCombo = new Combo(runOnGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
        simulatorsCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (simulatorIds.size() > 0) {
					simulatorUDID = simulatorIds.get(simulatorsCombo.getSelectionIndex());
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

		if (OsUtils.isMac()) {
			for (SimCtl.Device device : SimCtl.getDevices()) {
				simulatorsCombo.add(device.name + " (" + device.runtime + ")");
				simulatorIds.add(device.udid);
			}

			simulatorsCombo.select(0);
		}
		
		deviceButton = new Button(runOnGroup, SWT.RADIO);
		deviceButton.setText("Device");
		deviceButton.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				switch (event.type) {
				case SWT.Selection: {
					updateItems(false);
					deviceUDID = deviceIds.get(devicesCombo.getSelectionIndex());
				}
					break;
				}
			}
		});

		devicesCombo = new Combo(runOnGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
		devicesCombo.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent arg0) {
				if (deviceIds.size() > 1) {
					deviceUDID = deviceIds.get(devicesCombo.getSelectionIndex());
				}
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		updateDeviceCombo();
		
		if (!OsUtils.isMac()) {
			simulatorButton.setSelection(false);
			simulatorButton.setEnabled(false);
			simulatorsCombo.setEnabled(false);
			deviceButton.setSelection(true);
		}
		
		try {
			setDefaults(launchConfiguration);
		} catch (CoreException e) {
			LOG.error("Configuration error occured", e);
		}

        return container;
    }
	
	@Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Select Deployment Target");
    }
	
	private void updateItems(boolean runOnSimulator) {
		if (OsUtils.isMac()) {
			simulatorButton.setSelection(runOnSimulator);
			simulatorsCombo.setEnabled(runOnSimulator);
			deviceButton.setSelection(!runOnSimulator);
			devicesCombo.setEnabled(!runOnSimulator);
		}
		this.runOnSimulator = runOnSimulator;
	}
	
	private void updateDeviceCombo() {
		int selected = devicesCombo.getSelectionIndex();
		devicesCombo.removeAll();
		deviceIds.clear();
		devicesCombo.add("First available iOS device");
		deviceIds.add("");

		File projectFile = project.getLocation().toFile();

		try {
			for (DeviceInfo device : Device.getDevices(projectFile)) {
				devicesCombo.add(device.name() + " (" + device.udid() + ")");
				deviceIds.add(device.udid());
			}
		} catch (IOException e) {
			LOG.debug("Unable to get devices", e);
		}

		if (selected >= 0) {
			devicesCombo.select(selected);
		} else {
			devicesCombo.select(0);
		}
	}
	
	private void setDefaults(ILaunchConfiguration launchConfiguration) throws CoreException {
		if (OsUtils.isMac()) {
			boolean runOnSimulator = launchConfiguration.getAttribute(ApplicationManager.RUN_ON_SIMULATOR_KEY,
					true);
			updateItems(runOnSimulator);

			String simulatorUUID = launchConfiguration.getAttribute(ApplicationManager.SIMULATOR_UUID_KEY, "");
			if (!simulatorUUID.isEmpty()) {
				simulatorsCombo.select(simulatorIds.indexOf(simulatorUUID));
			}
		}

		String deviceUUID = launchConfiguration.getAttribute(ApplicationManager.DEVICE_UUID_KEY, "");
		if (!deviceUUID.isEmpty()) {
			devicesCombo.select(deviceIds.indexOf(deviceUUID));
		}
	}

	public boolean runOnSimulator() {
		return runOnSimulator;
	}

	public String getDeviceUDID() {
		return deviceUDID;
	}
	
	public String getSimulatorUDID() {
		return simulatorUDID;
	}

}
