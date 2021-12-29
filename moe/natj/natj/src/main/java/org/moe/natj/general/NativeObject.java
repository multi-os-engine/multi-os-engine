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
 * The ascendant of every native object.
 */
public class NativeObject {
    /**
     * The pointer pointing to the native value.
     */
    private Pointer peer;

    /**
     * Returns the native pointer.
     *
     * @return The pointer
     */
    public final Pointer getPeer() {
        return peer;
    }

    public final void setPeer(Pointer peer) {
        this.peer = peer;
    }

    /**
     * Returns the native pointer's peer or 0.
     *
     * @return the pointer's peer or 0
     */
    public final long getPeerPointer() {
        if (peer == null) {
            return 0;
        }
        return peer.getPeer();
    }

    /**
     * Constructs a {@link NativeObject} from a {@link Pointer}.
     *
     * @param peer The pointer pointing to the native peer.
     */
    protected NativeObject(Pointer peer) {
        this.peer = peer;
    }

    @Override
    protected void finalize() throws Throwable {
        if (peer != null) {
            peer.release();
        }
    }
}
