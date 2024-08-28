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
 * Base class for all C++ classes.
 */
public abstract class CxxObjectBaseImpl implements CxxObject {

    static {
        CxxRuntime.initialize();
    }

    /**
     * Invokes the _cxx_rt_delete method and invalidates the native peer.
     */
    final synchronized void _cxx_rt_delete2() {
        if (_cxx_rt_peer() == CxxRuntime.ILLEGAL_MEMORY_ADDRESS) {
            throw new CxxIllegalInvocationException("Object was already deleted");
        }
        _cxx_rt_delete();
        _cxx_rt_invalidate();
    }

    /**
     * Invalidates the native peer.
     */
    final void _cxx_rt_invalidate() {
        _cxx_rt_swapPeer(CxxRuntime.ILLEGAL_MEMORY_ADDRESS);
    }

    /**
     * Swaps the current peer with the specified.
     *
     * @param newPeer New peer
     * @return Old peer
     */
    abstract long _cxx_rt_swapPeer(long newPeer);

    @Override
    public final boolean cxxIsConstInterface() {
        return this instanceof CxxConstImpl;
    }

    @Override
    public boolean cxxIsDirectInterface() {
        return this instanceof CxxDirectImpl;
    }

    @Override
    public final boolean cxxIsIdenticalTo(Object other) {
        if (other == null) {
            return false;
        }
        if (!(other instanceof CxxObject)) {
            return false;
        }
        CxxObject inst = (CxxObject) other;
        return _cxx_rt_peer() == inst._cxx_rt_peer();
    }

    @Override
    public final <T extends CxxObject> T cxxGetDirectInterface(Class<T> cls) {
        if (!cls.isAssignableFrom(getClass())) {
            throw new IllegalArgumentException("interface " + cls.getName() + " is not implemented");
        }
        try {
            @SuppressWarnings("unchecked")
            Class<T> direct = (Class<T>) Class.forName(cls.getName() + "$__cxx_Direct");
            return direct.getConstructor(long.class).newInstance(_cxx_rt_peer());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final <T extends CxxObject> T cxxGetUnsafeDirectInterface(Class<T> cls) {
        try {
            @SuppressWarnings("unchecked")
            Class<T> direct = (Class<T>) Class.forName(cls.getName() + "$__cxx_Direct");
            return direct.getConstructor(long.class).newInstance(_cxx_rt_peer());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public final <T extends CxxObject> T cxxGetUnsafeImplInterface(Class<T> cls) {
        try {
            @SuppressWarnings("unchecked")
            Class<T> direct = (Class<T>) Class.forName(cls.getName() + "$__cxx_Impl");
            return direct.getConstructor(long.class).newInstance(_cxx_rt_peer());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
