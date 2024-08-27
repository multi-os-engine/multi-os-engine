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

/**
 * Exception caused by libimobiledevice.
 */
public class DeviceException extends Exception {

    /**
     * libimobiledevice error code.
     */
    private final int code;
    /**
     * libimobiledevice function name.
     */
    private final String call;

    /**
     * Create a new DeviceException instance.
     *
     * @param message error message
     */
    public DeviceException(String message) {
        this(message, null, 0, null);
    }

    /**
     * Create a new DeviceException instance.
     *
     * @param message error message
     * @param cause   cause
     */
    public DeviceException(String message, Throwable cause) {
        this(message, null, 0, cause);
    }

    /**
     * Create a new DeviceException instance.
     *
     * @param message error message
     * @param call    libimobiledevice function name
     * @param code    libimobiledevice error code
     */
    public DeviceException(String message, String call, int code) {
        super(message);
        this.code = code;
        this.call = call;
    }

    /**
     * Create a new DeviceException instance.
     *
     * @param message error message
     * @param call    libimobiledevice function name
     * @param code    libimobiledevice error code
     * @param cause   cause
     */
    public DeviceException(String message, String call, int code, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.call = call;
    }

    /**
     * Returns the libimobiledevice error code.
     *
     * @return error code
     */
    public int getCode() {
        return code;
    }

    /**
     * Returns the libimobiledevice function name.
     *
     * @return function name
     */
    public String getCall() {
        return call;
    }
}
