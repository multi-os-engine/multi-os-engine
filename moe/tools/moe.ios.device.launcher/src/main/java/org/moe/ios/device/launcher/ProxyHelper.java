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

import org.moe.common.ProxyPort;
import org.moe.common.ShutdownManager;
import org.moe.common.utils.ProxyUtil;
import org.moe.ios.device.ConnectionHelper;
import org.moe.ios.device.ConnectionInputStream;
import org.moe.ios.device.ConnectionLock;
import org.moe.ios.device.ConnectionOutputStream;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.libimobiledevice.enums.idevice_error_t;
import org.libimobiledevice.opaque.idevice_connection_t;
import org.libimobiledevice.opaque.idevice_t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.libimobiledevice.c.Globals.idevice_connect;
import static org.libimobiledevice.c.Globals.idevice_disconnect;

/**
 * Helper class for proxy servers.
 */
public class ProxyHelper {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ProxyHelper.class);

    public static void launch(idevice_t device, Configuration configuration) {
        if (configuration.getJdwpPort() == null && configuration.getProxyPorts().size() == 0) {
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
    static void createProxyServer(final ProxyPort port, final idevice_t device, final AtomicBoolean isInShutdown) {
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                LOG.debug(port.getRemotePort() + ": Trying to connect to remote");
                Ptr<idevice_connection_t> conn_ptr = PtrFactory.newOpaquePtrReference(idevice_connection_t.class);
                int err = 0;
                do {
                    if (err != 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            break;
                        }
                    }
                    err = idevice_connect(device, (char)(port.getShortRemotePort() & 0xFFFF), conn_ptr);
                }
                while (!Thread.currentThread().isInterrupted() &&
                        err != idevice_error_t.IDEVICE_E_SUCCESS &&
                        !isInShutdown.get());
                final idevice_connection_t conn = conn_ptr.get();

                // Let go if interrupted
                if (Thread.currentThread().isInterrupted() || err != idevice_error_t.IDEVICE_E_SUCCESS) {
                    if (err == idevice_error_t.IDEVICE_E_SUCCESS) {
                        idevice_disconnect(conn);
                    }
                    return;
                }

                LOG.debug(port.getRemotePort() + ": Connected to remote");
                final ConnectionLock dscisLock = new ConnectionLock();
                final ConnectionLock dscosLock = new ConnectionLock();
                ConnectionInputStream<idevice_connection_t> dscis = ConnectionHelper.getInputStream(conn, dscisLock);
                ConnectionOutputStream<idevice_connection_t> dscos = ConnectionHelper.getOutputStream(conn, dscosLock);
                Runnable disconnectHook = new Runnable() {

                    @Override
                    public void run() {
                        dscisLock.lockAndClose();
                        dscosLock.lockAndClose();
                        idevice_disconnect(conn);
                        dscisLock.unlock();
                        dscosLock.unlock();
                    }
                };
                ShutdownManager.register(disconnectHook);

                ProxyUtil proxyUtil = ProxyUtil.create(port.getLocalPort(), dscis, dscos);
                proxyUtil.registerShutdownHook();
            }
        });
        thread.start();
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                thread.interrupt();
                try {
                    thread.join(10000);
                } catch (InterruptedException e) {
                    LOG.debug(port.getRemotePort() + ": Failed to join remote connect thread");
                }
            }
        }));
    }
}
