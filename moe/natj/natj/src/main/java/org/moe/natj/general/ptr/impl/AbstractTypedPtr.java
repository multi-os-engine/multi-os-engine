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

import org.moe.natj.c.OpaquePtr;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.Ptr;

import java.lang.reflect.Array;

abstract class AbstractTypedPtr<T, E> extends VoidPtrImpl implements Ptr<E> {

    /**
     * The concrete referenced type.
     */
    protected final Class<T> type;

    protected AbstractTypedPtr(Class<T> type, Pointer peer) {
        super(peer);
        this.type = type;
        checkType(type);
    }

    protected AbstractTypedPtr(Class<T> type, long peer, boolean owned) {
        super(peer, owned, null);
        this.type = type;
        checkType(type);
    }

    protected AbstractTypedPtr(Class<T> type, long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
        this.type = type;
        checkType(type);
    }

    protected static final void checkType(Class<?> type) {
        if (type == null) {
            throw new NullPointerException();
        }
        if (Void.class.isAssignableFrom(type)) {
            return;
        }
        if (NativeObject.class.isAssignableFrom(type)) {
            return;
        }
        if (Boolean.class.isAssignableFrom(type)) {
            return;
        }
        if (Byte.class.isAssignableFrom(type)) {
            return;
        }
        if (Short.class.isAssignableFrom(type)) {
            return;
        }
        if (Character.class.isAssignableFrom(type)) {
            return;
        }
        if (Integer.class.isAssignableFrom(type)) {
            return;
        }
        if (Long.class.isAssignableFrom(type)) {
            return;
        }
        if (Float.class.isAssignableFrom(type)) {
            return;
        }
        if (Double.class.isAssignableFrom(type)) {
            return;
        }
        if (OpaquePtr.class.isAssignableFrom(type)) {
            return;
        }
        if (CxxObject.class.isAssignableFrom(type)) {
            return;
        }
        throw new IllegalArgumentException("unsupported class");
    }

    @Override
    public final E get() {
        return get(0);
    }

    @Override
    public final E[] toArray(int length) {
        return toArray(0, length);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final E[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        E[] array = (E[]) Array.newInstance(type, length);
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final void copyTo(E[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(E[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, E[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
            dest[destOffset] = get(srcOffset);
        }
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Ptr<E> getGuarded(int length) {
        return (Ptr<E>) getGuarded(0, length);
    }

    @Override
    public void set(E obj) {
        set(0, obj);
    }

    @Override
    public void copyFrom(E[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(E[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(E[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(E[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
            set(destOffset, src[srcOffset]);
        }
    }

}
