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

/**
 * Abstract base class for all binding type objects.
 */
public abstract class CxxBindingObject extends CxxObjectBaseImpl {

    /**
     * The peer of the C++ object.
     */
    private long _cxx_rt_peer;

    /**
     * Creates an instance by passing the peer.
     *
     * @param peer peer
     */
    protected CxxBindingObject(long peer) {
        _cxx_rt_peer = peer;
    }

    /**
     * Returns the object's C++ peer.
     *
     * @return C++ peer
     */
    public final long _cxx_rt_peer() {
        return _cxx_rt_peer;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@peer:" + _cxx_rt_peer;
    }

    @Override
    long _cxx_rt_swapPeer(long newPeer) {
        final long peer = _cxx_rt_peer;
        _cxx_rt_peer = newPeer;
        return peer;
    }
}
