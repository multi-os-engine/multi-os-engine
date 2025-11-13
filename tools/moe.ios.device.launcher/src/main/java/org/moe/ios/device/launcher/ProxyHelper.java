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
import io.github.berstanio.pymobiledevice3.data.USBMuxForwarder;
import org.moe.common.ProxyPort;
import org.moe.common.ShutdownManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Helper class for proxy servers.
 */
public class ProxyHelper {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ProxyHelper.class);

    /**
     * Starts the proxy server.
     *
     * @param device        Device to connect to
     * @param configuration Configuration
     */
    public static void launch(DeviceInfo device, Configuration configuration) {
        if (configuration.getJdwpPort() == null && configuration.getProxyPorts().isEmpty()) {
            return;
        }

        ProxyPort debugPort = configuration.getJdwpPort();
        AtomicBoolean shuttingDown = new AtomicBoolean(false);
        if (debugPort != null) {
            LOG.debug("Starting debug server: " + debugPort);
            createProxyServer(debugPort, device, shuttingDown);
        }
        List<ProxyPort> proxyPorts = configuration.getProxyPorts();
        for (ProxyPort port : proxyPorts) {
            LOG.debug("Starting proxy server: " + port);
            createProxyServer(port, device, shuttingDown);
        }
    }

    /**
     * Creates a proxy server for the specified proxy port.
     *
     * @param port         proxy port
     * @param device       device
     * @param isInShutdown boolean signaling, that application is shutting down
     */
    static void createProxyServer(final ProxyPort port, final DeviceInfo device, final AtomicBoolean isInShutdown) {
        LOG.debug(port.getRemotePort() + ": Trying to connect to remote");
        USBMuxForwarder forwarder = IPCHandler.getInstance().usbMuxForwarderCreate(device, port.getRemotePort(), port.getLocalPort()).join();
        LOG.debug(port.getRemotePort() + ": Connected to remote");

        ShutdownManager.register(new Thread(() -> {
            IPCHandler.getInstance().usbMuxForwarderClose(forwarder).join();
        }));
    }
}
