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

import org.libimobiledevice.opaque.idevice_t;
import org.moe.common.ShutdownManager;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.common.utils.NativeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Set;

/**
 * Main class.
 */
public class Main {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    /**
     * Loads native libraries.
     *
     * @throws IOException if an I/O error occures
     */
    private static void loadNativeLibraries() throws IOException {
        String current = new java.io.File(".").getCanonicalPath();

        String osName = NativeUtil.getUnifiedSystemName();

        if (osName.equals(NativeUtil.OS_NAME_MAC_OS_X)) {
            System.load(current + "/macosx/libnatj.dylib");
            System.load(current + "/macosx/libimobiledevice.dylib");
        } else if (osName.equals(NativeUtil.OS_NAME_WINDOWS)) {
            System.load(current + "/windows/x86_64/natj.dll");
            System.load(current + "/windows/x86_64/libimobiledevice.dll");
        } else {
            throw new RuntimeException("Unsupported OS");
        }
    }

    /**
     * Configuration to launch.
     */
    private final Configuration config;

    /**
     * Create a new Main instance.
     *
     * @param config configuration to launch
     */
    private Main(Configuration config) {
        if (config == null) {
            throw new NullPointerException();
        }
        this.config = config;
    }

    /**
     * Main.
     *
     * @param args Program arguments
     * @throws IOException if an I/O error occurs
     */
    public static void main(String[] args) throws IOException {
        // Read configuration
        Configuration config = ConfigurationAppender.read(args);
        try {
            config.validate();
            config.close();
        } catch (ConfigurationValidationException ex) {
            PRINT_ERROR("Invalid property (" + ex.getPropertyName() + ") - " + ex.getErrorMessage());
            System.exit(1);
        }

        loadNativeLibraries();

        // Launch
        Main main = new Main(config);
        try {
            main.run();
        } catch (DeviceException e) {
            if (e.getCall() != null) {
                PRINT_ERROR(e.getMessage() + " (" + e.getCall() + " returned " + e.getCode() + ")");
            } else {
                PRINT_ERROR(e.getMessage());
            }
            LOG.debug("Launching failed", e);
            System.exit(1);
        }
    }

    /**
     * Run the launcher.
     *
     * @throws DeviceException If an error occurred
     */
    private void run() throws DeviceException {
        if (config.getListDevices()) {
            printDevices();
        }
        idevice_t device = DeviceHelper.getDevice(config);
        if (device == null) {
            throw new DeviceException("Failed to connect to device, device is null");
        }
        try {
            if (config.getApplicationPath() != null) {
                String appPath = InstallHelper.uploadAndInstall(device, config);
                LaunchHelper.launch(device, appPath, config);
            } else {
                ProxyHelper.launch(device, config);
            }
        } finally {
            ShutdownManager.shutdown();
            //idevice_free(device);
        }
    }

    /**
     * Prints the list of connected deices.
     */
    private void printDevices() {
        Set<String> devices = DeviceHelper.getDevices();
        PRINT_CONTROL("Connected iOS Devices:");
        for (String device : devices) {
            System.out.println("- " + device);
        }
        PRINT_CONTROL("");
    }

    /**
     * Prints a control related string on std out.
     *
     * @param ctrlString control string
     */
    public static void PRINT_CONTROL(String ctrlString) {
        if (ctrlString == null) {
            ctrlString = "";
        }
        System.out.println(ctrlString);
        System.out.flush();
    }

    /**
     * Prints an error related string on std err, with ERROR: prefix.
     *
     * @param errString error string
     */
    public static void PRINT_ERROR(String errString) {
        if (errString == null) {
            errString = "";
        }
        errString = "ERROR: " + errString;
        System.err.println(errString);
        System.err.flush();
    }
}
