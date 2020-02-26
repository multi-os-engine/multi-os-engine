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

package org.moe.ios.device;

import org.libimobiledevice.enums.debugserver_error_t;
import org.libimobiledevice.enums.idevice_error_t;
import org.libimobiledevice.opaque.debugserver_client_t;
import org.libimobiledevice.opaque.idevice_connection_t;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;

import static org.libimobiledevice.c.Globals.*;

/**
 * This class provides helper methods for connection creation &amp; management.
 */
public class ConnectionHelper {

    /**
     * Create a new ConnectionHelper instance.
     */
    private ConnectionHelper() {

    }

    /**
     * Creates a new ConnectionInputStream for a debugserver_client_t object.
     *
     * @param client    debugserver_client_t object
     * @param usageLock Connection lock
     * @return new ConnectionInputStream instance
     */
    public static ConnectionInputStream<debugserver_client_t> getInputStream(debugserver_client_t client,
            final ConnectionLock usageLock) {
        if (client == null) {
            throw new NullPointerException();
        }
        return new ConnectionInputStream<debugserver_client_t>(client) {
            @Override
            protected int recvImpl(debugserver_client_t handle, BytePtr buffer, int len, IntPtr recvBytes,
                    int timeout) {
                try {
                    if (usageLock.lockGetClosed()) {
                        return -1;
                    }
                    int result = debugserver_client_receive_with_timeout(handle, buffer, len, recvBytes, timeout);
                    if (result == debugserver_error_t.DEBUGSERVER_E_TIMEOUT) {
                        // This is actually not an error, we just return a success with len=0
                        // and caller will retry if needed.
                        result = idevice_error_t.IDEVICE_E_SUCCESS;
                    }
                    return result;
                } finally {
                    usageLock.unlock();
                }
            }
        };
    }

    /**
     * Creates a new ConnectionOutputStream for a debugserver_client_t object.
     *
     * @param client    debugserver_client_t object
     * @param usageLock Connection lock
     * @return new ConnectionOutputStream instance
     */
    public static ConnectionOutputStream<debugserver_client_t> getOutputStream(debugserver_client_t client,
            final ConnectionLock usageLock) {
        if (client == null) {
            throw new NullPointerException();
        }
        return new ConnectionOutputStream<debugserver_client_t>(client) {
            @Override
            protected int sendImpl(debugserver_client_t handle, BytePtr buffer, int len, IntPtr sentBytes) {
                try {
                    if (usageLock.lockGetClosed()) {
                        return -1;
                    }
                    return debugserver_client_send(handle, buffer, len, sentBytes);
                } finally {
                    usageLock.unlock();
                }
            }
        };
    }

    /**
     * Creates a new ConnectionInputStream for a idevice_connection_t object.
     *
     * @param connection idevice_connection_t object
     * @param usageLock  Connection lock
     * @return new ConnectionInputStream instance
     */
    public static ConnectionInputStream<idevice_connection_t> getInputStream(idevice_connection_t connection,
            final ConnectionLock usageLock) {
        if (connection == null) {
            throw new NullPointerException();
        }
        return new ConnectionInputStream<idevice_connection_t>(connection) {
            @Override
            protected int recvImpl(idevice_connection_t handle, BytePtr buffer, int len, IntPtr recvBytes,
                    int timeout) {
                try {
                    if (usageLock.lockGetClosed()) {
                        return -1;
                    }
                    int result = idevice_connection_receive_timeout(handle, buffer, len, recvBytes, timeout);
                    if (result == idevice_error_t.IDEVICE_E_TIMEOUT) {
                        // This is actually not an error, we just return a success with len=0
                        // and caller will retry if needed.
                        result = idevice_error_t.IDEVICE_E_SUCCESS;
                    }
                    return result;
                } finally {
                    usageLock.unlock();
                }
            }
        };
    }

    /**
     * Creates a new ConnectionOutputStream for a idevice_connection_t object.
     *
     * @param connection idevice_connection_t object
     * @param usageLock  Connection lock
     * @return new ConnectionOutputStream instance
     */
    public static ConnectionOutputStream<idevice_connection_t> getOutputStream(idevice_connection_t connection,
            final ConnectionLock usageLock) {
        if (connection == null) {
            throw new NullPointerException();
        }
        return new ConnectionOutputStream<idevice_connection_t>(connection) {
            @Override
            protected int sendImpl(idevice_connection_t handle, BytePtr buffer, int len, IntPtr sentBytes) {
                try {
                    if (usageLock.lockGetClosed()) {
                        return -1;
                    }
                    return idevice_connection_send(handle, buffer, len, sentBytes);
                } finally {
                    usageLock.unlock();
                }
            }
        };
    }
}
