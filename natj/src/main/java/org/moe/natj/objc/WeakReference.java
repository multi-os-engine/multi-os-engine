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

/**
 * Objective-C weak reference holder, used for weak pointers.
 */
public class WeakReference {
    private long location;

    /**
     * Creates an weak reference to an Objective-C object.
     *
     * @param object The object object to which we want to make the weak reference
     */
    public WeakReference(long object) {
        location = CRuntime.allocPointer(1);
        ObjCRuntime.storeWeak(object, location);
    }

    /**
     * Cleans up after the weak reference.
     */
    protected void finalize() {
        ObjCRuntime.destroyWeak(location);
        CRuntime.free(location);
    }

    /**
     * Tries to load a strong reference to the Objective-C object.
     *
     * @return Strong referenced object pointer loaded by Objective-C runtime
     */
    public Pointer getPeer() {
        long peer = ObjCRuntime.loadWeak(location);
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
        return ObjCRuntime.loadWeak(location);
    }
}
