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
import org.moe.natj.c.StructObject;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.IGuardedPtr;
import org.moe.natj.general.ptr.Ptr;

class StructPtrImpl<T extends StructObject> extends AbstractNativeObjectPtr<T> {

    /**
     * The native size of the concrete type.
     *
     * <p>
     * Used for calculating the offsets for the indexes.
     */
    protected final long sizeof;

    // Reserved for NatJ runtime
    protected StructPtrImpl(Class<T> type, Pointer peer) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(CRuntime.class), peer);
        sizeof = CRuntime.sizeOfNativeObject(type);
    }

    // For ofs creation only
    private StructPtrImpl(Class<T> type, long peer, Object bufferOwner) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(CRuntime.class), peer, bufferOwner);
        sizeof = CRuntime.sizeOfNativeObject(type);
    }

    // For public creation
    StructPtrImpl(Class<T> type, int capacity, boolean owned) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(CRuntime.class), CRuntime
                .allocNativeObject(type, capacity), owned);
        sizeof = CRuntime.sizeOfNativeObject(type);
    }

    /**
     * Returns the pointer at the given index.
     */
    private final long getPointer(int idx) {
        return getRoot() + sizeof * idx;
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public T get(int idx) {
        long ptr = CRuntime.allocNativeObject(type, 1);
        CRuntime.copyNativeObject(type, ptr, getPointer(idx));
        return getJavaValue(ptr, true);
    }

    final T getRef(int idx) {
        return getJavaValue(getPointer(idx));
    }

    @Override
    public void set(int idx, T obj) {
        CRuntime.copyNativeObject(type, getPointer(idx), getNativeValue(obj));
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public Ptr<T> getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedStructPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public Ptr<T> ofs(int elemOffset) {
        return new StructPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this);
    }

    static class ConstStructPtrImpl<T extends StructObject> extends StructPtrImpl<T> {

        // Reserved for NatJ runtime
        protected ConstStructPtrImpl(Class<T> type, Pointer peer) {
            super(type, peer);
        }

        // For ofs creation only
        private ConstStructPtrImpl(Class<T> type, long peer, Object bufferOwner) {
            super(type, peer, bufferOwner);
        }

        // For public creation
        ConstStructPtrImpl(Class<T> type, int capacity, boolean owned) {
            super(type, capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public final void set(T value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void set(int idx, T value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(T[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final Ptr<T> ofs(int elemOffset) {
            return new ConstStructPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstStructPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedStructPtrImpl<T extends StructObject> extends StructPtrImpl<T>
            implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedStructPtrImpl(Class<T> type, long peer, Object bufferOwner, int low, int hi) {
            super(type, peer, bufferOwner);

            if (low > hi) {
                throw new IllegalArgumentException();
            }

            this.low = low;
            this.hi = hi;
        }

        @Override
        public boolean checkIndex(int index) {
            return index >= low && index < hi;
        }

        @Override
        public boolean isGuarded() {
            return true;
        }

        @Override
        public T get(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public void copyTo(int srcOffset, T[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void set(int idx, T value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(T[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public Ptr<T> ofs(int elemOffset) {
            return new GuardedStructPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedStructPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

        @Override
        public int getGuardLow() {
            return low;
        }

        @Override
        public int getGuardHigh() {
            return hi;
        }

    }

    private static class GuardedConstStructPtrImpl<T extends StructObject> extends
            GuardedStructPtrImpl<T> {

        // For ofs and guarded creation only
        public GuardedConstStructPtrImpl(Class<T> type, long peer, Object bufferOwner, int low,
                int hi) {
            super(type, peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public final void set(T value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void set(int idx, T value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(T[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(T[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final Ptr<T> ofs(int elemOffset) {
            return new GuardedConstStructPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this,
                    low + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstStructPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

}
