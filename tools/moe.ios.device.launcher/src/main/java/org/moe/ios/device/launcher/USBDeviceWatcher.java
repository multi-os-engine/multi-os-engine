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

import org.libimobiledevice.c.Globals;
import org.libimobiledevice.enums.idevice_connection_type;
import org.libimobiledevice.enums.idevice_event_type;
import org.libimobiledevice.struct.idevice_event_t;
import org.moe.natj.general.ptr.VoidPtr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.libimobiledevice.c.Globals.idevice_event_subscribe;
import static org.libimobiledevice.c.Globals.idevice_event_unsubscribe;

/**
 * Manages simple device states.
 */
public class USBDeviceWatcher {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(USBDeviceWatcher.class);

    /**
     * Lock.
     */
    private final Lock lock = new ReentrantLock();

    /**
     * Listeners.
     */
    private final ArrayList<IUSBDeviceListener> listeners = new ArrayList<IUSBDeviceListener>();

    /**
     * Listeners.
     */
    private final ConcurrentLinkedQueue<IUSBDeviceListener> initializingListeners = new ConcurrentLinkedQueue<IUSBDeviceListener>();

    /**
     * List of connected devices.
     */
    private final ArrayList<String> connectedDevices = new ArrayList<String>();

    /**
     * Creates a new DeviceWatcher instance.
     */
    private USBDeviceWatcher() {
        idevice_event_subscribe(new Globals.Function_idevice_event_subscribe() {
            @Override
            public void call_idevice_event_subscribe(idevice_event_t event, VoidPtr context) {
                LOG.debug("Event: " + event.event() + ", conn_type: " + event.conn_type());
                if (event.conn_type() != idevice_connection_type.USBMUXD) {
                    return;
                }
                // Initializing listeners is always a priority
                while (!initializingListeners.isEmpty()) {
                    Thread.yield();
                }
                lock.lock();
                final int eventType = event.event();
                final String eventUDID = event.udid();
                if (eventType == idevice_event_type.ADD) {
                    if (!connectedDevices.contains(eventUDID)) {
                        connectedDevices.add(eventUDID);
                    }
                } else {
                    if (connectedDevices.contains(eventUDID)) {
                        connectedDevices.remove(eventUDID);
                    }
                }
                try {
                    for (IUSBDeviceListener listener : listeners) {
                        try {
                            listener.handle(eventType, eventUDID);
                        } catch (Exception e) {
                            LOG.error("Exception in idevice_event_subscribe listener", e);
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
        }, null);
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                idevice_event_unsubscribe();
            }
        }));
    }

    /**
     * Registers a new listener.
     *
     * @param listener listener
     */
    public static void register(IUSBDeviceListener listener) {
        if (listener == null) {
            throw new NullPointerException();
        }
        Holder.INSTANCE.registerListener(listener);
    }

    /**
     * Un-registers a listener.
     *
     * @param listener listener
     */
    public static void unregister(IUSBDeviceListener listener) {
        if (listener == null) {
            return;
        }
        Holder.INSTANCE.unregisterListener(listener);
    }

    /**
     * Registers a new listener.
     *
     * @param listener listener
     */
    private void registerListener(final IUSBDeviceListener listener) {
        lock.lock();
        try {
            if (!listeners.contains(listener)) {
                listeners.add(listener);
            }
            initializingListeners.add(listener);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    try {
                        for (String device : connectedDevices) {
                            listener.handle(idevice_event_type.ADD, device);
                        }
                    } finally {
                        initializingListeners.remove(listener);
                        lock.unlock();
                    }
                }
            }).start();
        } finally {
            lock.unlock();
        }
    }

    /**
     * Un-registers a listener.
     *
     * @param listener listener
     */
    private void unregisterListener(IUSBDeviceListener listener) {
        lock.lock();
        try {
            if (listeners.contains(listener)) {
                listeners.remove(listener);
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * Listener interface.
     */
    public static interface IUSBDeviceListener {
        /**
         * Handles a USB device event.
         *
         * @param event      event
         * @param deviceUDID device UDID
         */
        void handle(int event, String deviceUDID);
    }

    /**
     * Holder class for shared instance.
     */
    private static class Holder {
        /**
         * Shared DeviceWatcher instance.
         */
        public static final USBDeviceWatcher INSTANCE = new USBDeviceWatcher();
    }

}
