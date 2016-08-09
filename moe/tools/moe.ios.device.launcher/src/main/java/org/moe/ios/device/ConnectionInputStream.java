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

import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.libimobiledevice.enums.idevice_error_t;

import java.io.IOException;
import java.io.InputStream;

/**
 * Abstract class for libimobiledevice connection receiving.
 *
 * @param <T> handle's class
 */
public abstract class ConnectionInputStream<T> extends InputStream {

    /**
     * The default buffer size, 1MB.
     */
    private static final int BUFFER_SIZE = 1 * 1024 * 1024;
    /**
     * Pre-allocated buffer's size.
     */
    private final int bufferSize = BUFFER_SIZE;
    /**
     * Pre-allocated buffer for faster operation.
     */
    private final BytePtr buffer = PtrFactory.newByteArray(bufferSize);
    /**
     * Native handle to the connection.
     */
    private final T handle;
    /**
     * Lock for buffer usage.
     */
    private final Object bufferLock = new Object();
    /**
     * Lock for close state.
     */
    private final Object closeLock = new Object();
    /**
     * Closed state of the stream.
     */
    private boolean isClosed = false;

    /**
     * Creates a new {@link ConnectionInputStream} with a native handle.
     *
     * @param handle handle
     */
    public ConnectionInputStream(T handle) {
        this.handle = handle;
    }

    @Override
    public int read() throws IOException {
        byte[] data = new byte[1];
        int result = read(data, 0, 1);
        return result == -1 ? -1 : data[0];
    }

    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        // Check closed
        if (_isClosed()) {
            return -1;
        }

        // Recv data
        synchronized (bufferLock) {
            // Select buffer
            BytePtr buffer;
            if (len <= bufferSize) {
                buffer = this.buffer;
            } else {
                buffer = PtrFactory.newByteArray(len);
            }

            IntPtr recv_bytes = PtrFactory.newIntReference(0);

            do {
                int err = recvImpl(handle, buffer, len, recv_bytes, 50);
                if (err != idevice_error_t.IDEVICE_E_SUCCESS) {
                    throw new IOException("failed to recv (" + err + ")");
                }
            } while (!_isClosed() && recv_bytes.getValue() == 0);

            // Check closed
            if (_isClosed()) {
                return -1;
            }

            // N > 0 bytes received -> copy from buffer
            buffer.copyTo(0, b, off, len);
            return recv_bytes.getValue();
        }
    }

    /**
     * libimobiledevice implementation of the receive method.
     *
     * @param handle    handle
     * @param buffer    buffer to read into
     * @param len       length of the buffer
     * @param recvBytes number of bytes read into the buffer
     * @param timeout   timeout
     * @return error code
     */
    protected abstract int recvImpl(T handle, BytePtr buffer, int len, IntPtr recvBytes, int timeout);

    /**
     * Returns <code>true</code>if the stream is closed.
     *
     * @return <code>true</code>if the stream is closed
     */
    private boolean _isClosed() {
        synchronized (closeLock) {
            return isClosed;
        }
    }

    @Override
    public void close() throws IOException {
        synchronized (closeLock) {
            isClosed = true;
        }
    }
}
