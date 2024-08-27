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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NatJ.NativeObjectConstructionInfo;
import org.moe.natj.general.NativeRuntime;
import org.moe.natj.general.Pointer;

abstract class AbstractNativeObjectPtr<T> extends AbstractTypedPtr<T, T> {

    /**
     * The responsible runtime.
     */
    protected final NativeRuntime runtime;

    /**
     * Construction info for getting referenced values.
     */
    private JavaObjectConstructionInfo toJavaInfo = null;

    /**
     * Construction info for setting referenced values.
     */
    private NativeObjectConstructionInfo toNativeInfo = null;

    protected AbstractNativeObjectPtr(Class<T> type, NativeRuntime runtime, Pointer peer) {
        super(type, peer);
        this.runtime = runtime;
    }

    protected AbstractNativeObjectPtr(Class<T> type, NativeRuntime runtime, long peer,
            boolean owned) {
        super(type, peer, owned);
        this.runtime = runtime;
    }

    protected AbstractNativeObjectPtr(Class<T> type, NativeRuntime runtime, long peer,
            Object bufferOwner) {
        super(type, peer, bufferOwner);
        this.runtime = runtime;
    }

    /**
     * Gets Java value from a native pointer using the {@link #toJavaInfo}.
     */
    protected final T getJavaValue(long peer) {
        return getJavaValue(peer, false);
    }

    /**
     * Gets Java value from a native pointer using the {@link #toJavaInfo}.
     */
    @SuppressWarnings("unchecked")
    protected final T getJavaValue(long peer, boolean owned) {
        try {
            if (toJavaInfo == null) {
                toJavaInfo = NatJ.buildJavaObjectConstructionInfo(runtime, type, null, null, type,
                        owned, false, true);
            }
            return (T) NatJ.toJava(peer, toJavaInfo);
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     * Sets Java value from a native pointer using the {@link #toNativeInfo}.
     */
    protected final long getNativeValue(T value) {
        try {
            if (toNativeInfo == null) {
                toNativeInfo = NatJ.buildNativeObjectConstructionInfo(runtime, type, null, null,
                        false, false, true);
            }
            return NatJ.toNative(value, toNativeInfo);
        } catch (Exception ex) {
            return 0;
        }
    }

}
