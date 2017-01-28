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

package org.moe.common.utils;

import org.moe.common.ShutdownManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Utility class for creating proxy servers.
 */
public class ProxyUtil {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(ProxyUtil.class);

    /**
     * Local port for server.
     */
    private int localPort;
    /**
     * Input stream from remote's output.
     */
    private InputStream remoteOutput;
    /**
     * Output stream to remote's input.
     */
    private OutputStream remoteInput;

    // Create server
    /**
     * Proxy server.
     */
    private ServerSocket server;
    /**
     * Lock.
     */
    private final Lock serverLock = new ReentrantLock();
    /**
     * Ended condition.
     */
    private final Condition serverEnded = serverLock.newCondition();

    /**
     * Accepted socket.
     */
    private Socket socket;
    /**
     * Input stream from socket.
     */
    private InputStream socketInput;
    /**
     * Output stream to socket.
     */
    private OutputStream socketOutput;

    /**
     * Proxy thread.
     */
    private Thread proxyThread;
    /**
     * Local to remote forwarder thread.
     */
    private Thread local2remoteThread;
    /**
     * Remote to local forwarder thread.
     */
    private Thread remote2localThread;

    /**
     * Shutdown hook registered flag.
     */
    private boolean hasShutdownHookRegistered;

    /**
     * Creates a new ProxyUtil instance.
     *
     * @param localPort    local server port
     * @param remoteOutput input stream from remote's output
     * @param remoteInput  output stream to remote's input
     */
    private ProxyUtil(int localPort, InputStream remoteOutput, OutputStream remoteInput) {
        if (remoteOutput == null || remoteInput == null) {
            throw new IllegalArgumentException();
        }
        if (localPort < 0 || localPort > 0xFFFF) {
            throw new IllegalArgumentException("Illegal port");
        }
        this.localPort = localPort;
        this.remoteOutput = remoteOutput;
        this.remoteInput = remoteInput;
    }

    /**
     * Creates a proxy server.
     *
     * @param localPort    local server port
     * @param remoteOutput input stream from remote's output
     * @param remoteInput  output stream to remote's input
     * @return runnable for interrupt
     */
    public static ProxyUtil create(final int localPort, final InputStream remoteOutput, final OutputStream remoteInput) {
        ProxyUtil proxy = new ProxyUtil(localPort, remoteOutput, remoteInput);
        proxy.start();
        return proxy;
    }

    /**
     * Starts the proxy server.
     */
    private void start() {
        LOG.debug(localPort + ": Creating proxy server");

        // Start proxy
        proxyThread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    server = new ServerSocket(localPort);
                } catch (IOException e) {
                    LOG.error(localPort + ": Creating server socket failed");
                    return;
                }

                accept();

                tryClose(server, "Closing server failed");

                // Join threads
                if (local2remoteThread != null) {
                    try {
                        local2remoteThread.join();
                    } catch (InterruptedException e) {
                        LOG.error(localPort + ": Joining local2remoteThread failed");
                    }
                }
                if (remote2localThread != null) {
                    try {
                        remote2localThread.join();
                    } catch (InterruptedException e) {
                        LOG.error(localPort + ": Joining remote2localThread failed");
                    }
                }
            }

            /**
             * Accept a connection.
             */
            private void accept() {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }

                try {
                    socket = server.accept();
                    socketInput = socket.getInputStream();
                    socketOutput = socket.getOutputStream();
                } catch (IOException e) {
                    if (!Thread.currentThread().isInterrupted()) {
                        LOG.error(localPort + ": Server accept failed");
                    } else {
                        LOG.debug(localPort + ": Server accept interrupted");
                    }
                    return;
                }
                LOG.debug(localPort + ": Accepted connection");

                startup();

                tryClose(socket, "Closing socket failed");
                tryClose(socketInput, "Closing socket input stream");
                tryClose(socketOutput, "Closing socket output stream");
            }

            /**
             * Startup the proxy server.
             */
            private void startup() {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }

                // Create forwarder threads
                local2remoteThread = createForwardingThread("local2remoteThread", socketInput, remoteInput);
                remote2localThread = createForwardingThread("remote2localThread", remoteOutput, socketOutput);

                // Start forwarding threads
                LOG.debug(localPort + ": Starting forwarding");
                local2remoteThread.start();
                remote2localThread.start();

                serverLock.lock();
                try {
                    try {
                        serverEnded.await();
                    } catch (InterruptedException e) {
                        LOG.debug(localPort + ": Proxy server was interrupted");
                    }
                } finally {
                    serverLock.unlock();
                }

                tryClose(remoteInput, "Closing remote input failed");
                tryClose(remoteOutput, "Closing remote output failed");
            }

            /**
             * Create a stream forwarding thread.
             * @param name Thread name
             * @param is Input
             * @param os Output
             * @return Thread
             */
            private Thread createForwardingThread(final String name, final InputStream is, final OutputStream os) {
                return new Thread(new Runnable() {

                    /**
                     * Buffer size.
                     */
                    final int bufferSize = 16384;
                    /**
                     * Buffer.
                     */
                    final byte[] buffer = new byte[bufferSize];

                    @Override
                    public void run() {
                        LOG.debug(localPort + ": Starting " + name);
                        while (!Thread.currentThread().isInterrupted()) {
                            try {
                                int count = is.read(buffer);
                                if (count == -1) {
                                    break;
                                }
                                os.write(buffer, 0, count);
                            } catch (IOException e) {
                                break;
                            }
                        }

                        // Signal the end
                        serverLock.lock();
                        try {
                            serverEnded.signal();
                        } finally {
                            serverLock.unlock();
                        }
                    }
                });
            }
        });
        proxyThread.start();
    }

    /**
     * Try to close the specified Closeable.
     * @param closeable Closeable to close
     * @param failMessage Failure message
     */
    private void tryClose(Closeable closeable, String failMessage) {
        if (closeable != null) {
            CloseableUtil.tryClose(closeable, LOG, localPort + ": " + failMessage);
        }
    }

    /**
     * Stops the proxy.
     */
    public synchronized void stop() {
        LOG.debug(localPort + ": Stopping proxy");

        // If waiting in accept
        tryClose(server, "Closing server failed");
        Thread.yield();

        // Close inputs
        tryClose(remoteOutput, "Closing remote output failed");
        tryClose(socketInput, "Closing remote input failed");
        Thread.yield();

        // Close outputs
        tryClose(socketOutput, "Closing remote output failed");
        tryClose(remoteInput, "Closing remote input failed");

        // Interrupt forwarder threads
        if (remote2localThread != null) {
            remote2localThread.interrupt();
        }
        if (local2remoteThread != null) {
            local2remoteThread.interrupt();
        }

        LOG.debug(localPort + ": Stopping proxy completed");
    }

    /**
     * Waits for the proxy server to stop.
     */
    public synchronized void waitFor() {
        LOG.debug(localPort + ": Waiting for proxy");
        // Interrupt if already forwarding
        proxyThread.interrupt();
        try {
            synchronized (proxyThread) {
                proxyThread.join(10000);
            }
        } catch (InterruptedException e) {
            LOG.error(localPort + ": Proxy thread shut down interrupted");
        }
        LOG.debug(localPort + ": Proxy thread shut down");
    }

    /**
     * Registers a shutdown hook.
     */
    public synchronized void registerShutdownHook() {
        if (!hasShutdownHookRegistered) {
            hasShutdownHookRegistered = true;
            ShutdownManager.register(new Runnable() {
                @Override
                public void run() {
                    stop();
                }
            });
            ShutdownManager.registerPost(new Runnable() {
                @Override
                public void run() {
                    waitFor();
                }
            });
        }
    }
}
