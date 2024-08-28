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

package org.moe.natj.cxx;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Abstract base class for all inherited type objects.
 */
public class CxxInheritedObject extends CxxObjectBaseImpl {

    /**
     * Set for retained objects.
     */
    private static final Set<CxxInheritedObject> RETAINED = Collections.newSetFromMap(new ConcurrentHashMap<CxxInheritedObject, Boolean>());

    /**
     * The peer of the C++ object.
     */
    private long _cxx_rt_peer;

    /**
     * Native constructor interface.
     */
    public interface ICxxConstructor {
        /**
         * Constructs the native object with the specified Java reference.
         *
         * @param javaReference Java object UID
         * @return Native peer
         */
        long construct(long javaReference);
    }

    /**
     * Creates a new CxxInheritedObject instance.
     *
     * @param constructor Constructor instance
     */
    protected CxxInheritedObject(ICxxConstructor constructor) {
        if (constructor == null) {
            throw new NullPointerException();
        }
        final long javaReference = CxxRuntime.getUIDForObject(this);
        _cxx_rt_peer = constructor.construct(javaReference);
        CxxRuntime.register(this);
        RETAINED.add(this);
    }

    @Override
    public void _cxx_rt_delete() {
        throw new CxxExpectedGeneratedCodeException();
    }

    @Override
    public long _cxx_rt_peer() {
        return _cxx_rt_peer;
    }

    @Override
    long _cxx_rt_swapPeer(long newPeer) {
        final long peer = _cxx_rt_peer;
        _cxx_rt_peer = newPeer;
        return peer;
    }

    /**
     * Releases the Java part of this object.
     */
    public final void _cxx_rt_release_java() {
        RETAINED.remove(this);
        CxxRuntime.detachOnly(this);
    }
}
