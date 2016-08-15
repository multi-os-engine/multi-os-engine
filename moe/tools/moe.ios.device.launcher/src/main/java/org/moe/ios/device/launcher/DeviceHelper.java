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

import org.moe.common.ShutdownManager;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.libimobiledevice.enums.idevice_error_t;
import org.libimobiledevice.opaque.idevice_t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.libimobiledevice.c.Globals.*;

/**
 * Helper class for device creation.
 */
@SuppressWarnings("unchecked")
class DeviceHelper {

    /**
     * Connection event, add.
     */
    public static final int CONN_EVENT_ADD = 1;
    /**
     * Connection event, add.
     */
    public static final int CONN_EVENT_REMOVE = 2;
    /**
     * USBMUXD connection type.
     */
    public static final int CONN_TYPE_USBMUXD = 1;
    /**
     * USB connection subtype.
     */
    public static final String CONN_SUB_TYPE_USB = "USB";
    /**
     * Logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(DeviceHelper.class);
    /**
     * Lock for 'wait for device'.
     */
    private static final Lock W4D_LOCK = new ReentrantLock();
    /**
     * 'wait for device' device found condition.
     */
    private static final Condition W4D_ADDED = W4D_LOCK.newCondition();
    /**
     * Thread currently waiting on 'wait for device' to complete.
     */
    private static Thread W4D_WAITING_THREAD;
    /**
     * Flag for 'wait for device' shutdown hook installed.
     */
    private static boolean W4D_SHUTDOWN_HOOK_INSTALLED;

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
        Set<String> devices = new HashSet<String>();

        IntPtr countRef = PtrFactory.newIntReference();
        Ptr<Ptr<BytePtr>> listRef = (Ptr<Ptr<BytePtr>>) PtrFactory.newPointerPtr(Byte.class, 3, 1, true, false);
        idevice_get_device_list_with_connection(listRef, countRef, CONN_TYPE_USBMUXD, CONN_SUB_TYPE_USB);

        int count = countRef.get();
        Ptr<BytePtr> list = listRef.get();
        for (int i = 0; i < count; ++i) {
            String device = list.get(i).toASCIIString();
            devices.add(device);
        }

        idevice_device_list_free(listRef.get());

        return devices;
    }

    /**
     * Wait for a device with the specified UDID. If the UDID is null, then wait for the first device.
     *
     * @param udid device UDID
     * @return new idevice_t object
     * @throws DeviceException If creation fails
     */
    public static idevice_t waitForDevice(final String udid) throws DeviceException {
        W4D_LOCK.lock();

        // Install cleanup hook on first use
        if (!W4D_SHUTDOWN_HOOK_INSTALLED) {
            W4D_SHUTDOWN_HOOK_INSTALLED = true;
            ShutdownManager.register(new Runnable() {
                @Override
                public void run() {
                    Thread tmp = W4D_WAITING_THREAD;
                    if (tmp != null) {
                        tmp.interrupt();
                        try {
                            tmp.join(2000);
                        } catch (InterruptedException e) {
                            LOG.error("Failed to join 'wait for device' thread");
                        }
                    }
                }
            });
        }

        // Set waiting thread
        W4D_WAITING_THREAD = Thread.currentThread();

        // Register event listener
        System.out.println("Waiting for iOS Device...");
        final StringBuilder udidBuilder = new StringBuilder();
        USBDeviceWatcher.IUSBDeviceListener listener = new USBDeviceWatcher.IUSBDeviceListener() {
            @Override
            public void handle(int event, String deviceUDID) {
                if (event != CONN_EVENT_ADD) {
                    return;
                }
                if (udid != null && !udid.equals(deviceUDID)) {
                    return;
                }
                W4D_LOCK.lock();
                try {
                    LOG.debug("Found device: " + deviceUDID);
                    if (udidBuilder.length() > 0) {
                        return;
                    }
                    udidBuilder.append(deviceUDID);
                    W4D_ADDED.signal();
                } finally {
                    W4D_LOCK.unlock();
                }
            }
        };
        USBDeviceWatcher.register(listener);

        // Wait for results
        try {
            try {
                W4D_ADDED.await();
            } catch (InterruptedException e) {
                LOG.debug("Waiting for device interrupted");
                // We just got interrupted, how rude...
                // Any other reason then app being killed?
                return null;
            }
        } finally {
            // Cleanup
            USBDeviceWatcher.unregister(listener);
            W4D_WAITING_THREAD = null;
            W4D_LOCK.unlock();
        }

        // Return new device on success
        return newDeviceViaUSB(udidBuilder.toString());
    }

    /**
     * Returns a new idevice_t for the specified options.
     *
     * @param config configuration
     * @return new idevice_t object
     * @throws DeviceException If the creation fails
     */
    public static idevice_t getDevice(Configuration config) throws DeviceException {
        if (config.getDeviceUDID() == null || config.getDeviceUDID().length() == 0) {
            return getFirstAvailableDevice(config.getWaitForDevice());
        }
        if (config.getWaitForDevice()) {
            return DeviceHelper.waitForDevice(config.getDeviceUDID());
        } else {
            return newDeviceViaUSB(config.getDeviceUDID());
        }
    }

    /**
     * Returns an idevice_t for the first available device.
     *
     * @param w4d wait for device
     * @return new idevice_t object
     * @throws DeviceException If the creation fails or if w4d is false and there are no devices connected
     */
    private static idevice_t getFirstAvailableDevice(boolean w4d) throws DeviceException {
        if (w4d) {
            return DeviceHelper.waitForDevice(null);
        } else {
            Set<String> devices = getDevices();
            if (devices.size() == 0) {
                throw new DeviceException("There are no devices connected", null, 0);
            }

            return newDeviceViaUSB(devices.toArray(new String[devices.size()])[0]);
        }
    }

    /**
     * Creates a new idevice_t which is connected to the specified udid via USBMUXD/USB.
     *
     * @param udid device UDID
     * @return new idevice_t object
     * @throws DeviceException If the creation fails
     */
    private static idevice_t newDeviceViaUSB(String udid) throws DeviceException {
        if (udid == null) {
            throw new NullPointerException();
        }

        LOG.debug("Creating new USB device for " + udid);

        // Create a new device connected via USB
        Ptr<idevice_t> deviceRef = PtrFactory.newOpaquePtrReference(idevice_t.class);
        int error = idevice_new_with_connection(deviceRef, udid, CONN_TYPE_USBMUXD, CONN_SUB_TYPE_USB);
        if (error != idevice_error_t.IDEVICE_E_SUCCESS) {
            throw new DeviceException("Failed to create device", "idevice_new_with_connection", error);
        }

        return deviceRef.get();
    }
}
