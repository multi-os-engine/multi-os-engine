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

import io.github.berstanio.pymobiledevice3.data.DeviceListener;
import io.github.berstanio.pymobiledevice3.ipc.DeviceObserver;

/**
 * Manages simple device states.
 */
public class USBDeviceWatcher {

    private final DeviceObserver deviceObserver;

    /**
     * Creates a new DeviceWatcher instance.
     */
    private USBDeviceWatcher() {
        this.deviceObserver = new DeviceObserver(IPCHandler.getInstance());
    }

    /**
     * Registers a new listener.
     *
     * @param listener listener
     */
    public static void register(DeviceListener listener) {
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
    public static void unregister(DeviceListener listener) {
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
    private void registerListener(final DeviceListener listener) {
        deviceObserver.addListener(listener);
    }

    /**
     * Un-registers a listener.
     *
     * @param listener listener
     */
    private void unregisterListener(DeviceListener listener) {
        deviceObserver.removeListener(listener);
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
