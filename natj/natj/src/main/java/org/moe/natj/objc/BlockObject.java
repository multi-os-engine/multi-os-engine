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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.map.ObjCCallbackMapper;

/**
 * Wrapper class used for wrapping callbacks.
 *
 * <p>
 * A wrapped callback can be used like an Objective-C block code.
 */
public class BlockObject extends ObjCObject {

    /**
     * Construct a block object from a pointer.
     *
     * @param peer Block pointer
     */
    protected BlockObject(Pointer peer) {
        super(peer);
    }

    /**
     * Wraps an instance as a callback.
     *
     * @param callback The instance we want to wrap
     * @param name The name specifies the method
     * @return The constructed  block object
     */
    public static BlockObject wrap(Object callback, String name) {
        Pointer peer = getJavaCallback(callback, name, null);
        if (peer == null) {
            return null;
        } else {
            return new BlockObject(peer);
        }
    }

    /**
     * Wraps an instance as a callback.
     *
     * @param callback The instance we want to wrap
     * @param name The method name specifies the method
     * @param argTypes The method argument types specifies the method
     * @return The constructed  block object
     */
    public static BlockObject wrap(Object callback, String name, java.lang.Class<?>[] argTypes) {
        Pointer peer = getJavaCallback(callback, name, argTypes);
        if (peer == null) {
            return null;
        } else {
            return new BlockObject(peer);
        }
    }

    /**
     * Wraps an instance as a callback.
     *
     * @param callback The instance we want to wrap
     * @return The constructed  block object
     */
    public static BlockObject wrap(Object callback) {
        Pointer peer = getObjCCallback(callback);
        if (peer == null) {
            return null;
        } else {
            return new BlockObject(peer);
        }
    }

    /**
     *  Returns the pointer of the Java callback.
     *
     * @param callback The instance we want to get callback for
     * @param name The name of one of the methods of the instance
     * @param argTypes The argument types of the method we want to create native callback from
     * @return The pointer
     */
    private static Pointer getJavaCallback(Object callback, String name,
            java.lang.Class<?>[] argTypes) {
        return ((ObjCCallbackMapper) NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class)
                .getCallbackMapper()).getJavaBlockPeer(callback, name, argTypes);
    }

    /**
     *  Returns the pointer of the Objective-C callback.
     *
     * @param callback The instance we want to get callback for
     * @return The pointer
     */
    private static Pointer getObjCCallback(Object callback) {
        return ((ObjCCallbackMapper) NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class)
                .getCallbackMapper()).getNativeBlockPeer(callback);
    }
}
