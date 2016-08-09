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
import java.io.OutputStream;

/**
 * Abstract class for libimobiledevice connection sending.
 *
 * @param <T> handle's class
 */
public abstract class ConnectionOutputStream<T> extends OutputStream {

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
     * Creates a new {@link ConnectionOutputStream} with a native handle.
     *
     * @param handle handle
     */
    public ConnectionOutputStream(T handle) {
        this.handle = handle;
    }

    @Override
    public void write(int b) throws IOException {
        write(new byte[]{(byte) (b & 0xFF)}, 0, 1);
    }

    @Override
    public void write(byte[] b) throws IOException {
        write(b, 0, b.length);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        // Check closed
        if (_isClosed()) {
            throw new IOException("stream is closed");
        }

        // Send data
        synchronized (bufferLock) {
            // Select buffer
            BytePtr buffer;
            if (len <= bufferSize) {
                buffer = this.buffer;
            } else {
                buffer = PtrFactory.newByteArray(len);
            }

            // Copy array to buffer
            buffer.copyFrom(b, off, 0, len);

            // Try to send
            IntPtr sent_bytes = PtrFactory.newIntReference();
            int err;

            // Check closed & send
            synchronized (closeLock) {
                if (_isClosed()) {
                    throw new IOException("stream is closed");
                }
                err = sendImpl(handle, buffer, len, sent_bytes);
            }

            // Failure
            if (err != idevice_error_t.IDEVICE_E_SUCCESS) {
                // Check closed
                if (_isClosed()) {
                    throw new IOException("stream is closed");
                }

                // Not closed -> real failure
                throw new IOException("failed to send (" + err + ")");
            }

            // Bytes send is invalid -> failure
            if (len != sent_bytes.getValue()) {
                // Check closed
                if (_isClosed()) {
                    throw new IOException("stream is closed");
                }

                // Not closed -> real failure
                throw new IOException("idevice_connection_send failed, sent "
                        + sent_bytes.getValue() + " bytes instead of " + len);
            }
        }
    }

    /**
     * libimobiledevice implementation of the send method.
     *
     * @param handle    handle
     * @param buffer    buffer to read from
     * @param len       number of bytes to send
     * @param sentBytes number of bytes sent
     * @return error code
     */
    protected abstract int sendImpl(T handle, BytePtr buffer, int len, IntPtr sentBytes);

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
