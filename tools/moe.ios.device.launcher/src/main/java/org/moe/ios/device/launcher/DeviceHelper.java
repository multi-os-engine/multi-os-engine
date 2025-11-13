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

import io.github.berstanio.pymobiledevice3.data.DeviceInfo;
import io.github.berstanio.pymobiledevice3.data.DeviceListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Helper class for device creation.
 */
class DeviceHelper {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(DeviceHelper.class);

    /**
     * Creates a new DeviceHelper instance.
     */
    private DeviceHelper() {
    }

    /**
     * Returns a set of currently connected devices which are connected via USBMUXD/USB.
     *
     * @return a set of currently connected devices
     */
    public static Set<String> getDevices() {
        String[] devices = IPCHandler.getInstance().listDevicesUDID().join();
        return new HashSet<>(Arrays.asList(devices));
    }

    /**
     * Wait for a device with the specified UDID. If the UDID is null, then wait for the first device.
     *
     * @param udid device UDID
     * @return new idevice_t object
     * @throws DeviceException If creation fails
     */
    public static DeviceInfo waitForDevice(final String udid) throws DeviceException {
        CompletableFuture<String> future = new CompletableFuture<>();
        // Register event listener
        System.out.println("Waiting for iOS Device...");
        DeviceListener listener = new DeviceListener() {

            @Override
            public void deviceAdded(String deviceUDID) {
                if (udid != null && !udid.equals(deviceUDID))
                    return;

                if (future.isDone())
                    return;

                LOG.debug("Found device: " + deviceUDID);
                future.complete(deviceUDID);
            }

            @Override
            public void deviceRemoved(String s) {

            }
        };
        USBDeviceWatcher.register(listener);

        try {
            // Wait for results
            String result = future.get();
            return IPCHandler.getInstance().getDevice(result).join();
        } catch (InterruptedException e) {
            LOG.debug("Waiting for device interrupted");
            // We just got interrupted, how rude...
            // Any other reason then app being killed?
            return null;
        } catch (ExecutionException e) {
            LOG.error("Failed waiting for device", e);
            return null;
        } finally {
            USBDeviceWatcher.unregister(listener);
        }
    }

    /**
     * Returns a new idevice_t for the specified options.
     *
     * @param config configuration
     * @return new idevice_t object
     * @throws DeviceException If the creation fails
     */
    public static DeviceInfo getDevice(Configuration config) throws DeviceException {
        if (config.getDeviceUDID() == null || config.getDeviceUDID().isEmpty()) {
            return getFirstAvailableDevice(config.getWaitForDevice());
        }
        if (config.getWaitForDevice()) {
            return DeviceHelper.waitForDevice(config.getDeviceUDID());
        } else {
            return IPCHandler.getInstance().getDevice(config.getDeviceUDID()).join();
        }
    }

    /**
     * Returns an idevice_t for the first available device.
     *
     * @param w4d wait for device
     * @return new idevice_t object
     * @throws DeviceException If the creation fails or if w4d is false and there are no devices connected
     */
    private static DeviceInfo getFirstAvailableDevice(boolean w4d) throws DeviceException {
        if (w4d) {
            return DeviceHelper.waitForDevice(null);
        } else {
            return IPCHandler.getInstance().getDevice(null).join();
        }
    }
}
