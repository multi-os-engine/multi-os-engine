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
import org.moe.common.utils.CloseableUtil;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.libimobiledevice.enums.debugserver_error_t;
import org.libimobiledevice.opaque.debugserver_client_t;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static org.libimobiledevice.c.Globals.debugserver_client_receive_with_timeout;
import static org.libimobiledevice.c.Globals.debugserver_client_send;

/**
 * Class proxy for debugserver.
 */
public class DebugserverProxy{
	
	 /**
     * Local port for server.
     */
    private int localPort;

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
     * Proxy thread.
     */
    private Thread proxyThread;

    /**
     * Accepted socket.
     */
    private Socket socket;

    /**
     * Shutdown hook registered flag.
     */
    private boolean hasShutdownHookRegistered;

    private volatile boolean quit = false;

	private debugserver_client_t debugserver;
	
	private DebugserverProxy(int localPort, debugserver_client_t debugserver){
		this.debugserver = debugserver;
		if (localPort < 0 || localPort > 0xFFFF) {
            throw new IllegalArgumentException("Illegal port");
        }
        this.localPort = localPort;
	}
	/**
     * Creates a proxy for debugserver.
     *
     * @param debugserver   debugserver 
     * @param localPort     local server port
     * @return runnable for interrupt
     */
    public static DebugserverProxy create(debugserver_client_t debugserver, final int localPort) {
    	DebugserverProxy proxy = new DebugserverProxy(localPort, debugserver);
    	proxy.start();
        return proxy;
    }


	 /**
     * Starts the proxy for debugserver.
     */
    private void start() {
        try {
            server = new ServerSocket(localPort);
            server.setReuseAddress(true);
            server.setSoTimeout(5000);
        } catch (IOException e) {
            System.out.println(localPort + ": Creating server socket failed");
            quit = true;
            return;
        }

        // Start proxy
        proxyThread = new Thread(new Runnable() {
                /**
                 * Local to remote forwarder thread.
                 */
                private Thread local2remoteThread;
                /**
                 * Remote to local forwarder thread.
                 */
                private Thread remote2localThread;
                /**
                 * Input stream from socket.
                 */
                private InputStream socketInput;
                /**
                 * Output stream to socket.
                 */
                private OutputStream socketOutput;

                @Override
                public void run() {
                    accept();
                    startup();

                    // Join threads
                    if (local2remoteThread != null) {
                        try {
                            local2remoteThread.join();
                        } catch (InterruptedException e) {
                            System.out.println(localPort + ": Joining local2remoteThread failed");
                        }
                    }
                }

                private void accept() {
                    if (Thread.currentThread().isInterrupted()) {
                        quit = true;
                    }

                    boolean isAccepted = false;

                    while(!isAccepted) {
                        try {
                            socket = server.accept();
                            isAccepted = true;
                        } catch (IOException e) {
                            if (!Thread.currentThread().isInterrupted()) {
                                isAccepted = false;
                            } else {
                                System.out.println(localPort + ": Server accept interrupted");
                                quit = true;
                            }
                        }
                    }
                }

                private void startup() {
                    if (Thread.currentThread().isInterrupted()) {
                        quit = true;
                        return;
                    }

                    try {
                        socketInput = socket.getInputStream();
                        socketOutput = socket.getOutputStream();
                    } catch(IOException e){
                        if (!Thread.currentThread().isInterrupted()) {
                            System.out.println(localPort + ": Server accept failed");
                        } else {
                            System.out.println(localPort + ": Server accept interrupted");
                            quit = true;
                        }
                        return;
                    }

                    // Create forwarder threads
                    local2remoteThread = createClientToServerThread("local2remoteThread", socketInput);
                    // Start forwarding threads
                    local2remoteThread.start();

                    serverLock.lock();
                    try {
                        try {
                            serverEnded.await();
                        } catch (InterruptedException e) {
                            System.out.println(localPort + ": Proxy server was interrupted: "+e.toString());
                        }
                    } finally {
                        serverLock.unlock();
                    }
                }

                private Thread createClientToServerThread(final String name, final InputStream is) {
                    return new Thread(new Runnable() {
                        // Buffer
                        final int bufferSize = 1024 * 1024;
                        final BytePtr buffer = PtrFactory.newByteArray(bufferSize);
                        final byte[] bufIn = new byte[bufferSize];

                        int err = debugserver_error_t.DEBUGSERVER_E_SUCCESS;
                        @Override
                        public void run() {
                            remote2localThread = createServerToClientThread("remote2localThread", socketOutput);
                            remote2localThread.start();

                            IntPtr countSent = PtrFactory.newIntReference(0);

                            while (!Thread.currentThread().isInterrupted() && !quit) {
                                try {
                                    int count = is.read(bufIn);
                                    if (count == -1) {
                                        break;
                                    }
                                    buffer.copyFrom(bufIn);
                                    err = debugserver_client_send(debugserver, buffer, count, countSent);
                                    if (err != debugserver_error_t.DEBUGSERVER_E_SUCCESS) {
                                        System.out.println("Debugserver send data failed!");
                                        break;
                                    }
                                    if(count != countSent.getValue()){
                                        System.out.println("Not all data sent count "+count+" countSent "+countSent);
                                    }
                                } catch (IOException e) {
                                    System.out.println("sending data interrupted");
                                    break;
                                }
                            }

                            if (remote2localThread != null) {
                                try {
                                    remote2localThread.join();
                                } catch (InterruptedException e) {
                                    System.out.println(localPort + ": Joining remote2localThread failed");
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

                private Thread createServerToClientThread(final String name, final OutputStream os) {
                    return new Thread(new Runnable() {
                        // Buffer
                        final int bufferSize = 1024 * 1024;
                        final BytePtr buffer = PtrFactory.newByteArray(bufferSize);
                        final byte bufOut[] = new byte[bufferSize];
                        int err = debugserver_error_t.DEBUGSERVER_E_SUCCESS;

                        @Override
                        public void run() {
                            while (!Thread.currentThread().isInterrupted() && !quit) {
                                IntPtr count =  PtrFactory.newIntReference(0);
                                try {
                                    err = debugserver_client_receive_with_timeout(debugserver, buffer, bufferSize,
                                            count, 50);
                                    if (err != debugserver_error_t.DEBUGSERVER_E_SUCCESS ) {
                                        System.out.println("Debugserver receive data failed!");
                                        break;
                                    }
                                    buffer.copyTo(bufOut);
                                } catch (Exception e) {
                                    System.out.println("receiving data interrupted1");
                                    break;
                                }
                                try{
                                    if (err == debugserver_error_t.DEBUGSERVER_E_SUCCESS && count.getValue() != 0) {
                                        os.write(bufOut, 0, count.getValue());
                                    }

                                } catch (IOException e) {
                                    System.out.println("receiving data interrupted: "+e.toString());
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

                public synchronized void stop() {
                                System.out.println(localPort + ": Stopping proxy");
                                quit = true;

                                // Close inputs
                                tryClose(socketInput, "Closing remote output failed");
                                Thread.yield();

                                // Close outputs
                                tryClose(socketOutput, "Closing remote output failed");

                                System.out.println(localPort + ": Stopping socket completed");

                            }
            });

        proxyThread.start();
    }

    
    private void tryClose(Closeable closeable, String failMessage) {
        if (closeable != null) {
            CloseableUtil.tryClose(closeable, null, localPort + ": " + failMessage);
        }
    }

    /**
     * Stops the
     */
    public synchronized void stop() {
        quit = true;

        // If waiting in accept
        tryClose(server, "Closing server failed");
        Thread.yield();
    }
    /**
     * Waits for the proxy server to stop.
     */
    public synchronized void waitFor() {
        quit = true;
        // Interrupt if already forwarding
        proxyThread.interrupt();
        try {
            synchronized (proxyThread) {
                proxyThread.join(10000);
            }
        } catch (InterruptedException e) {
            //ignore
        }
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
