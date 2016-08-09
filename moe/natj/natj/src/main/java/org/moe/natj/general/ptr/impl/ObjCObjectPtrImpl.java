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
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.IGuardedPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;

class ObjCObjectPtrImpl<T extends ObjCObject> extends AbstractNativeObjectPtr<T> {

    protected static final int ELEM_SIZE = CRuntime.POINTER_SIZE;

    protected Object[] retainList;

    @SuppressWarnings("unchecked")
    private int computeRetainIndex(int idx) {
        if (bufferOwner == null) {
            return idx;
        } else {
            ObjCObjectPtrImpl<T> root = this;
            while (root.bufferOwner != null) {
                root = (ObjCObjectPtrImpl<T>) root.bufferOwner;
            }
            int offs = (int) ((getRoot() - root.getRoot()) / ELEM_SIZE);
            return idx + offs;
        }
    }

    protected void refreshRetainList() {
        if (retainList != null) {
            for (int i = 0, idx = computeRetainIndex(0), n = retainList.length;
                idx < n; i++, idx++) {
                retainList[idx] = getJavaValue(getPointer(i));
            }
        }
    }

    // Reserved for NatJ runtime
    protected ObjCObjectPtrImpl(Class<T> type, Pointer peer) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), peer);
    }

    // For ofs creation only
    private ObjCObjectPtrImpl(Class<T> type, long peer, ObjCObjectPtrImpl<T> bufferOwner) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), peer, bufferOwner);
        retainList = bufferOwner.retainList;
    }

    // For public creation
    ObjCObjectPtrImpl(Class<T> type, int capacity, boolean owned) {
        super(type, NatJ.getOrCreateInstanceOfRuntimeClass(ObjCRuntime.class), CRuntime
                .allocPointer(capacity), owned);
        retainList = new Object[capacity];
    }

    /**
     * Returns the pointer at the given index.
     */
    private final long getPointer(int idx) {
        return CRuntime.loadPointer(getRoot(), idx);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(int idx) {
        if (retainList != null) {
            return (T) retainList[computeRetainIndex(idx)];
        } else {
            return getJavaValue(getPointer(idx));
        }
    }

    @Override
    public void set(int idx, T obj) {
        if (retainList != null) {
            retainList[computeRetainIndex(idx)] = obj;
        }
        CRuntime.storePointer(getRoot(), idx, getNativeValue(obj));
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
        return new GuardedObjCObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public Ptr<T> ofs(int elemOffset) {
        return new ObjCObjectPtrImpl<T>(type, getRoot() + elemOffset * ELEM_SIZE, this);
    }

    static class ConstObjCObjectPtrImpl<T extends ObjCObject> extends ObjCObjectPtrImpl<T> {

        // Reserved for NatJ runtime
        protected ConstObjCObjectPtrImpl(Class<T> type, Pointer peer) {
            super(type, peer);
        }

        // For ofs creation only
        private ConstObjCObjectPtrImpl(Class<T> type, long peer, ObjCObjectPtrImpl<T> bufferOwner) {
            super(type, peer, bufferOwner);
        }

        // For public creation
        ConstObjCObjectPtrImpl(Class<T> type, int capacity, boolean owned) {
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
            return new ConstObjCObjectPtrImpl<T>(type, getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstObjCObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedObjCObjectPtrImpl<T extends ObjCObject> extends
            ObjCObjectPtrImpl<T> implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedObjCObjectPtrImpl(Class<T> type, long peer,
                ObjCObjectPtrImpl<T> bufferOwner, int low, int hi) {
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
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
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
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public Ptr<T> ofs(int elemOffset) {
            return new GuardedObjCObjectPtrImpl<T>(type, getRoot() + elemOffset * ELEM_SIZE, this,
                    low + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedObjCObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstObjCObjectPtrImpl<T extends ObjCObject> extends
            GuardedObjCObjectPtrImpl<T> {

        // For ofs and guarded creation only
        public GuardedConstObjCObjectPtrImpl(Class<T> type, long peer,
                ObjCObjectPtrImpl<T> bufferOwner, int low, int hi) {
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
            return new GuardedConstObjCObjectPtrImpl<T>(type, getRoot() + elemOffset * ELEM_SIZE,
                    this, low + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstObjCObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

}
