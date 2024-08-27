/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.ios.device.launcher;

import org.moe.common.Port;
import org.moe.common.ProxyPort;
import org.moe.common.configuration.AbstractConfiguration;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.common.utils.ArrayUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * iOS Device launch configuration.
 */
public class Configuration extends AbstractConfiguration {

    /*
     Configuration property names.
     */
    /**
     * Property name: Device UDID.
     */
    public static final String DEVICE_UDID_PROPERTY_NAME = "Device UDID";
    /**
     * Property name: Application Path.
     */
    public static final String APPLICATION_PATH_PROPERTY_NAME = "Application Path";
    /**
     * Property name: List Devices.
     */
    public static final String LIST_DEVICES_PROPERTY_NAME = "List Devices";
    /**
     * Property name: Wait for Device.
     */
    public static final String WAIT_FOR_DEVICE_PROPERTY_NAME = "Wait for Device";
    /**
     * Property name: Add Launch Argument.
     */
    public static final String ADD_LAUNCH_ARG_PROPERTY_NAME = "Add Launch Argument";
    /**
     * Property name: Add Env Variable.
     */
    public static final String ADD_ENV_VAR_PROPERTY_NAME = "Add Env Variable";
    /**
     * Property name: Add Proxy Port.
     */
    public static final String ADD_PROXY_PORT_PROPERTY_NAME = "Add Proxy Port";
    /**
     * Property name: JDWP Port.
     */
    public static final String JDWP_PORT_PROPERTY_NAME = "JDWP Port";
    /**
     * Property name: debugserver Port.
     */
    public static final String NATIVE_DEBUG_PORT_PROPERTY_NAME = "debugserver Port";
    /**
     * Property name: Install Mode.
     */
    public static final String INSTALL_MODE_PROPERTY_NAME = "Install Mode";
    /**
     * Property name: STD Out.
     */
    public static final String STD_OUT_PROPERTY_NAME = "STD Out";
    /**
     * Property name: STD Out File.
     */
    public static final String STD_OUT_FILE_PROPERTY_NAME = "STD Out File";

    /*
    Installation modes.
     */
    /**
     * Install mode: runonly.
     */
    public static final String INSTALL_MODE_RUN_ONLY = "runonly";
    /**
     * Install mode: installonly.
     */
    public static final String INSTALL_MODE_INSTALL_ONLY = "installonly";
    /**
     * Install mode: upgradeonly.
     */
    public static final String INSTALL_MODE_UPGRADE_ONLY = "upgradeonly";
    /**
     * Install mode: install.
     */
    public static final String INSTALL_MODE_INSTALL = "install";
    /**
     * Install mode: upgrade.
     */
    public static final String INSTALL_MODE_UPGRADE = "upgrade";
    /**
     * Installation mode.
     */
    private String installMode = INSTALL_MODE_UPGRADE;
    /**
     * All installation modes.
     */
    public static final String[] INSTALL_MODES = new String[] { INSTALL_MODE_RUN_ONLY, INSTALL_MODE_INSTALL,
            INSTALL_MODE_UPGRADE, INSTALL_MODE_INSTALL_ONLY, INSTALL_MODE_UPGRADE_ONLY
    };
    /**
     * Launch arguments.
     */
    private final ArrayList<String> launchArgs = new ArrayList<String>();
    /**
     * Launch arguments.
     */
    private final HashMap<String, String> envVars = new HashMap<String, String>();
    /**
     * Proxy ports.
     */
    private final ArrayList<ProxyPort> proxyPorts = new ArrayList<ProxyPort>();
    /**
     * Device UDID.
     */
    private String deviceUDID;
    /**
     * Application path.
     */
    private File applicationPath;
    /**
     * List devices.
     */
    private boolean listDevices;
    /**
     * Wait for device.
     */
    private boolean waitForDevice;
    /**
     * Proxy port for jdwp.
     */
    private ProxyPort jdwpPort;
    /**
     * STD out port.
     */
    private Port stdOutPort;
    /**
     * STD out file.
     */
    private File stdOutFile;
    /**
     * Proxy port for debugserver.
     */
    private ProxyPort debugserverPort = null;

    /**
     * Creates a new Configuration instance.
     */
    public Configuration() {
    }

    /**
     * Returns the device UDID.
     *
     * @return device UDID
     */
    public String getDeviceUDID() {
        return deviceUDID;
    }

    /**
     * Sets the device UDID.
     *
     * @param deviceUDID device UDID
     */
    public void setDeviceUDID(String deviceUDID) {
        requireOpen();
        this.deviceUDID = deviceUDID;
    }

    /**
     * Returns the application path.
     *
     * @return application path
     */
    public File getApplicationPath() {
        return applicationPath;
    }

    /**
     * Sets the application path.
     *
     * @param applicationPath application path
     */
    public void setApplicationPath(File applicationPath) {
        requireOpen();
        this.applicationPath = applicationPath;
    }

    /**
     * Returns the list devices flag.
     *
     * @return list devices flag
     */
    public boolean getListDevices() {
        return listDevices;
    }

    /**
     * Sets the list devices flag.
     *
     * @param listDevices list devices flag
     */
    public void setListDevices(boolean listDevices) {
        requireOpen();
        this.listDevices = listDevices;
    }

    /**
     * Returns the wait for device flag.
     *
     * @return wait for device flag
     */
    public boolean getWaitForDevice() {
        return waitForDevice;
    }

    /**
     * Sets the wait for device flag.
     *
     * @param waitForDevice wait for device flag
     */
    public void setWaitForDevice(boolean waitForDevice) {
        requireOpen();
        this.waitForDevice = waitForDevice;
    }

    /**
     * Returns the list of launch arguments.
     *
     * @return list of launch arguments
     */
    public ArrayList<String> getLaunchArgs() {
        return new ArrayList<String>(launchArgs);
    }

    /**
     * Adds a new launch argument.
     *
     * @param arg launch argument
     */
    public void addLaunchArg(String arg) {
        requireOpen();
        launchArgs.add(arg);
    }

    /**
     * Returns the env vars' map.
     *
     * @return env vars' map
     */
    public HashMap<String, String> getEnvVars() {
        return new HashMap<String, String>(envVars);
    }

    /**
     * Adds a new env var.
     *
     * @param key   key
     * @param value value
     */
    public void addEnvVar(String key, String value) {
        requireOpen();
        envVars.put(key, value);
    }

    /**
     * Returns the list of proxy ports.
     *
     * @return list of proxy ports
     */
    public ArrayList<ProxyPort> getProxyPorts() {
        return new ArrayList<ProxyPort>(proxyPorts);
    }

    /**
     * Adds a new proxy port.
     *
     * @param proxyPort proxy port
     */
    public void addProxyPort(ProxyPort proxyPort) {
        requireOpen();
        proxyPorts.add(proxyPort);
    }

    /**
     * Returns the JDWP proxy port.
     *
     * @return JDWP proxy port
     */
    public ProxyPort getJdwpPort() {
        return jdwpPort;
    }

    /**
     * Sets the JDWP proxy port.
     *
     * @param jdwpPort JDWP proxy port
     */
    public void setJdwpPort(ProxyPort jdwpPort) {
        requireOpen();
        this.jdwpPort = jdwpPort;
    }

    /**
     * Returns the debugserver proxy port.
     *
     * @return debugserver proxy port
     */
    public ProxyPort getDebugserverPort() {
        return debugserverPort;
    }

    /**
     * Sets the debugserver proxy port.
     *
     * @param debugserverPort debugserver proxy port
     */
    public void setDebugserverPort(ProxyPort debugserverPort) {
        requireOpen();
        this.debugserverPort = debugserverPort;
    }

    /**
     * Returns the install mode.
     *
     * @return install mode
     */
    public String getInstallMode() {
        return installMode;
    }

    /**
     * Sets the install mode.
     *
     * @param installMode install mode
     */
    public void setInstallMode(String installMode) {
        requireOpen();
        this.installMode = installMode;
    }

    /**
     * Returns the STD out port.
     *
     * @return STD out port.
     */
    public Port getStdOutPort() {
        return stdOutPort;
    }

    /**
     * Sets the STD out port.
     *
     * @param stdOutPort STD out port
     */
    public void setStdOutPort(Port stdOutPort) {
        requireOpen();
        this.stdOutPort = stdOutPort;
    }

    /**
     * Returns the STD out file.
     *
     * @return STD out file.
     */
    public File getStdOutFile() {
        return stdOutFile;
    }

    /**
     * Sets the STD out file.
     *
     * @param stdOutFile STD out file
     */
    public void setStdOutFile(File stdOutFile) {
        this.stdOutFile = stdOutFile;
    }

    @Override
    public void validate() throws ConfigurationValidationException {
        if (getDeviceUDID() != null) {
            assertNotEmpty(DEVICE_UDID_PROPERTY_NAME, deviceUDID);
        }

        if (!getListDevices() && getJdwpPort() == null && getProxyPorts().size() == 0 && getDebugserverPort() == null) {
            // Only required if installing is the only action
            assertNotNull(APPLICATION_PATH_PROPERTY_NAME, applicationPath);
        }
        assertDirectoryExists(APPLICATION_PATH_PROPERTY_NAME, applicationPath);

        assertNotNull(INSTALL_MODE_PROPERTY_NAME, installMode);
        assertValueIsOneOf(INSTALL_MODE_PROPERTY_NAME, installMode, INSTALL_MODES);
    }

    @Override
    public Object getProperty(String key) {
        if (DEVICE_UDID_PROPERTY_NAME.equals(key)) {
            return getDeviceUDID();
        } else if (APPLICATION_PATH_PROPERTY_NAME.equals(key)) {
            return getApplicationPath();
        } else if (LIST_DEVICES_PROPERTY_NAME.equals(key)) {
            return getListDevices();
        } else if (WAIT_FOR_DEVICE_PROPERTY_NAME.equals(key)) {
            return getWaitForDevice();
        } else if (ADD_LAUNCH_ARG_PROPERTY_NAME.equals(key)) {
            throw new IllegalArgumentException("write only arg");
        } else if (ADD_ENV_VAR_PROPERTY_NAME.equals(key)) {
            throw new IllegalArgumentException("write only arg");
        } else if (ADD_PROXY_PORT_PROPERTY_NAME.equals(key)) {
            throw new IllegalArgumentException("write only arg");
        } else if (JDWP_PORT_PROPERTY_NAME.equals(key)) {
            return getJdwpPort();
        } else if (NATIVE_DEBUG_PORT_PROPERTY_NAME.equals(key)) {
            return getDebugserverPort();
        } else if (INSTALL_MODE_PROPERTY_NAME.equals(key)) {
            return getInstallMode();
        } else if (STD_OUT_PROPERTY_NAME.equals(key)) {
            return getStdOutPort();
        } else if (STD_OUT_FILE_PROPERTY_NAME.equals(key)) {
            return getStdOutFile();
        } else {
            return super.getProperty(key);
        }
    }

    @Override
    public void setProperty(String key, Object value) {
        if (DEVICE_UDID_PROPERTY_NAME.equals(key)) {
            setDeviceUDID((String)value);
        } else if (APPLICATION_PATH_PROPERTY_NAME.equals(key)) {
            setApplicationPath((File)value);
        } else if (LIST_DEVICES_PROPERTY_NAME.equals(key)) {
            setListDevices((Boolean)value);
        } else if (WAIT_FOR_DEVICE_PROPERTY_NAME.equals(key)) {
            setWaitForDevice((Boolean)value);
        } else if (ADD_LAUNCH_ARG_PROPERTY_NAME.equals(key)) {
            addLaunchArg((String)value);
        } else if (ADD_ENV_VAR_PROPERTY_NAME.equals(key)) {
            String kv = (String)value;
            int idx = kv.indexOf('=');
            if (idx == -1) {
                addEnvVar(kv, "");
            } else {
                addEnvVar(kv.substring(0, idx), kv.substring(idx + 1));
            }
        } else if (ADD_PROXY_PORT_PROPERTY_NAME.equals(key)) {
            addProxyPort((ProxyPort)value);
        } else if (JDWP_PORT_PROPERTY_NAME.equals(key)) {
            setJdwpPort((ProxyPort)value);
        } else if (NATIVE_DEBUG_PORT_PROPERTY_NAME.equals(key)) {
            setDebugserverPort((ProxyPort)value);
        } else if (INSTALL_MODE_PROPERTY_NAME.equals(key)) {
            setInstallMode((String)value);
        } else if (STD_OUT_PROPERTY_NAME.equals(key)) {
            setStdOutPort((Port)value);
        } else if (STD_OUT_FILE_PROPERTY_NAME.equals(key)) {
            setStdOutFile((File)value);
        } else {
            super.setProperty(key, value);
        }
    }

    @Override
    public Class<?> getPropertyClass(String key) {
        if (DEVICE_UDID_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (APPLICATION_PATH_PROPERTY_NAME.equals(key)) {
            return File.class;
        } else if (LIST_DEVICES_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (WAIT_FOR_DEVICE_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (ADD_LAUNCH_ARG_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (ADD_ENV_VAR_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (ADD_PROXY_PORT_PROPERTY_NAME.equals(key)) {
            return ProxyPort.class;
        } else if (JDWP_PORT_PROPERTY_NAME.equals(key)) {
            return ProxyPort.class;
        } else if (NATIVE_DEBUG_PORT_PROPERTY_NAME.equals(key)) {
            return ProxyPort.class;
        } else if (INSTALL_MODE_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (STD_OUT_PROPERTY_NAME.equals(key)) {
            return Port.class;
        } else if (STD_OUT_FILE_PROPERTY_NAME.equals(key)) {
            return File.class;
        } else {
            return super.getPropertyClass(key);
        }
    }

    @Override
    public String[] getAllPropertyNames() {
        return ArrayUtil.concatenate(super.getAllPropertyNames(), new String[] {
                // @formatter:off
                DEVICE_UDID_PROPERTY_NAME,
                APPLICATION_PATH_PROPERTY_NAME,
                LIST_DEVICES_PROPERTY_NAME,
                WAIT_FOR_DEVICE_PROPERTY_NAME,
                ADD_LAUNCH_ARG_PROPERTY_NAME,
                ADD_ENV_VAR_PROPERTY_NAME,
                ADD_PROXY_PORT_PROPERTY_NAME,
                JDWP_PORT_PROPERTY_NAME,
                NATIVE_DEBUG_PORT_PROPERTY_NAME,
                INSTALL_MODE_PROPERTY_NAME,
                STD_OUT_PROPERTY_NAME,
                STD_OUT_FILE_PROPERTY_NAME,
                // @formatter:on
        });
    }
}
