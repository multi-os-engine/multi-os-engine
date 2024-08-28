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

package org.moe.natj.general;

/**
 * Abstract native exception class.
 *
 * <p>
 * Implement this to support new kinds of native exceptions.
 */
public abstract class NativeException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    /**
     * The native exception itself.
     */
    protected final NativeObject peer;

    /**
     * Construct a {@link NativeException} object from a native exception.
     *
     * @param peer The native peer of the exception.
     */
    protected NativeException(NativeObject peer) {
        this.peer = peer;
    }

    /**
     * Returns the native exception.
     *
     * @return The native exception.
     */
    public NativeObject getNativeException() {
        return peer;
    }

    /**
     * Returns the description of the exception.
     *
     * @return The description of the exception.
     */
    public abstract String getMessage();
}
