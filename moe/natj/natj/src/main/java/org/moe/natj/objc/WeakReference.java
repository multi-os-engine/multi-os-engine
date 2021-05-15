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

package org.moe.natj.objc;

import org.moe.natj.c.CRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.mem.Finalizer;
import org.moe.natj.general.mem.Releaser;
import org.moe.natj.general.mem.ReleaserMetadata;

/**
 * Objective-C weak reference holder, used for weak pointers.
 */
public class WeakReference {
    private final ReleaserMetadata peer;

    /**
     * Releaser for Objective-C weak reference holder.
     */
    private static final Releaser weakReferenceReleaser = new Releaser() {
        @Override
        public void release(long peer) {
            ObjCRuntime.destroyWeak(peer);
            CRuntime.free(peer);
        }

        @Override
        public boolean ifFinalizedExternally() {
            return false;
        }
    };

    /**
     * Creates an weak reference to an Objective-C object.
     *
     * @param object The object object to which we want to make the weak reference
     */
    public WeakReference(long object) {
        peer = new ReleaserMetadata(this, weakReferenceReleaser, CRuntime.allocPointer(1));
        Finalizer.registerForFinalize(peer);
        ObjCRuntime.storeWeak(object, peer.getPeer());
    }

    /**
     * Tries to load a strong reference to the Objective-C object.
     *
     * @return Strong referenced object pointer loaded by Objective-C runtime
     */
    public Pointer getPeer() {
        long peer = getNativePeer();
        if (peer == 0) {
            return null;
        }
        return ObjCRuntime.createStrongPointer(peer, true);
    }

    /**
     * Tries to load a strong reference to the Objective-C object.
     *
     * <p>
     * It does no releasing, so you have to do it manually.
     *
     * @return Weak referenced object pointer
     */
    public long getNativePeer() {
        return ObjCRuntime.loadWeak(peer.getPeer());
    }
}
