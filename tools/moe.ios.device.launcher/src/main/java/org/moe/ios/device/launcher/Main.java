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

import com.badlogic.gdx.jnigen.commons.HostDetection;
import com.badlogic.gdx.jnigen.commons.Os;
import io.github.berstanio.pymobiledevice3.daemon.DaemonHandler;
import io.github.berstanio.pymobiledevice3.data.DeviceInfo;
import io.github.berstanio.pymobiledevice3.data.InstallMode;
import io.github.berstanio.pymobiledevice3.ipc.PyMobileDevice3IPC;
import io.github.berstanio.pymobiledevice3.venv.PyInstallation;
import io.github.berstanio.pymobiledevice3.venv.PyInstallationHandler;
import org.moe.common.ShutdownManager;
import org.moe.common.configuration.ConfigurationValidationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        if (!DaemonHandler.isDaemonRunning())
        {
            LOG.debug("IPC Daemon not running - starting");
            Path ownedDir;
            if (HostDetection.os == Os.Windows) {
                String localAppData = System.getenv("LOCALAPPDATA");
                if (localAppData != null) {
                    ownedDir = Paths.get(localAppData, "JavaPyMobileDevice3");
                } else {
                    // Fallback
                    ownedDir = Paths.get(System.getProperty("user.home"), "AppData", "Local", "JavaPyMobileDevice3");
                }
            } else {
                // Unix/Mac
                ownedDir = Paths.get(System.getProperty("user.home"), ".javapymobiledevice3");
            }

            File installDir = ownedDir.resolve("daemon-" + PyMobileDevice3IPC.PROTOCOL_VERSION).toFile();

            PyInstallation installation = PyInstallationHandler.install(installDir);
            DaemonHandler.startDaemon(installation);
            LOG.debug("Started IPC Daemon in {}", installation.getVEnv());
        }

        IPCHandler.init();

        if (IPCHandler.getInstance().isTunneldRunning().join())
        {
            LOG.debug("Tunneld is already running");
        }
        else
        {
            LOG.debug("Starting tunneld");
            if (HostDetection.os == Os.MacOsX)
                LOG.info("Elevated privileges are required to launch tunneld");
            IPCHandler.getInstance().ensureTunneldRunning().join();
            LOG.debug("Tunneld is started");
        }

        // Launch
        Main main = new Main(config);
        try {
            main.run();
        } catch (DeviceException e) {
            PRINT_ERROR(e.getMessage());
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
        DeviceInfo device = DeviceHelper.getDevice(config);
        if (device == null) {
            throw new DeviceException("Failed to connect to device, device is null");
        }
        try {
            if (config.getApplicationPath() != null) {
                InstallMode installMode = config.getInstallModePy();
                if (installMode != InstallMode.NONE)
                {
                    PRINT_CONTROL("Installing:");
                    IPCHandler.getInstance().installApp(device, config.getApplicationPath(), config.getInstallModePy(), value -> {
                        System.out.println("- Installation" + "@" + value + "%");
                    }).join();
                }

                String bundleIdentifier = IPCHandler.getInstance().getBundleIdentifier(config.getApplicationPath()).join();
                String appPath = IPCHandler.getInstance().getInstalledPath(device, bundleIdentifier).join();
                LaunchHelper.launch(device, appPath, config);
            } else {
                ProxyHelper.launch(device, config);
            }
        } finally {
            ShutdownManager.shutdown();
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
