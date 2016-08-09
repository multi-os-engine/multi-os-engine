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

package org.moe.natj.general.ptr.impl;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.Pointer;

abstract class AbstractPtr {

    /**
     * Pointer of the object.
     */
    private Pointer peer;

    /**
     * Owner of the buffer.
     */
    protected final Object bufferOwner;

    protected AbstractPtr(Pointer peer) {
        if (peer == null) {
            throw new IllegalArgumentException();
        }
        this.peer = peer;
        this.bufferOwner = null;
    }

    protected AbstractPtr(long peer, boolean owned, Object bufferOwner) {
        this.peer = CRuntime.createStrongPointer(peer, owned);
        this.bufferOwner = bufferOwner;
    }

    public Pointer getPeer() {
        return peer;
    }

    /**
     * Returns the raw pointer associated with this pointer.
     *
     * @return the raw pointer associated with this pointer
     */
    protected final long getRoot() {
        if (peer == null) {
            throw new UnsupportedOperationException("accessing a pointer which was freed");
        }
        return peer.getPeer();
    }

    /**
     * Tries to release the memory space associated with this pointer.
     *
     * @param force
     *            <code>true</code> to force the freeing
     */
    protected final void releasePointer(boolean force) {
        if (peer == null) {
            throw new UnsupportedOperationException("pointer was already freed");
        }
        synchronized (this) {
            if (peer == null) {
                throw new UnsupportedOperationException("pointer was already freed");
            }
            if (!force) {
                if (peer.hasReleaser()) {
                    throw new UnsupportedOperationException(
                            "pointer has a releaser, should not be freed explicitly");
                }
                if (bufferOwner != null) {
                    throw new UnsupportedOperationException(
                            "pointer has an owner, should not be freed explicitly");
                }
            }
            if (this instanceof CxxObjectPtrImpl) {
                ((CxxObjectPtrImpl)this).invokeDeletePointer();
                peer = null;
            } else {
                long ptr = getRoot();
                peer = null;
                CRuntime.free(ptr);
            }
        }
    }

}
