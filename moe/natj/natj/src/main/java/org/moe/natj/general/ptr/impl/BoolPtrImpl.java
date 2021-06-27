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
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.IGuardedPtr;

class BoolPtrImpl extends VoidPtrImpl implements BoolPtr {

    protected static final int ELEM_SIZE = CRuntime.BOOLEAN_SIZE;

    // Reserved for NatJ runtime
    protected BoolPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected BoolPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    BoolPtrImpl(int capacity, boolean owned) {
        super(CRuntime.allocBoolean(capacity), owned, null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Boolean get() {
        return getValue(0);
    }

    @Override
    public final Boolean get(int idx) {
        return getValue(idx);
    }

    @Override
    public final boolean getValue() {
        return getValue(0);
    }

    @Override
    public boolean getValue(int idx) {
        return CRuntime.loadBoolean(getRoot(), idx);
    }

    @Override
    public final Boolean[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Boolean[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Boolean[] array = new Boolean[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final boolean[] toBoolArray(int length) {
        return toBoolArray(0, length);
    }

    @Override
    public boolean[] toBoolArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return CRuntime.createBooleanArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
    }

    @Override
    public final void copyTo(Boolean[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Boolean[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Boolean[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
            dest[destOffset] = CRuntime.loadBoolean(root, srcOffset);
        }
    }

    @Override
    public final void copyTo(boolean[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(boolean[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, boolean[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyFromNativeBooleanArray(dest, destOffset, getRoot(), srcOffset, length);
    }

    @Override
    public void set(Boolean obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Boolean obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(boolean value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, boolean value) {
        CRuntime.storeBoolean(getRoot(), idx, value);
    }

    @Override
    public void copyFrom(Boolean[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Boolean[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Boolean[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Boolean[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
            CRuntime.storeBoolean(root, destOffset, src[srcOffset]);
        }
    }

    @Override
    public void copyFrom(boolean[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(boolean[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(boolean[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(boolean[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyBooleanArray(getRoot(), destOffset, src, srcOffset, length);
    }

    @Override
    public BoolPtr ofs(int elemOffset) {
        return new BoolPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final BoolPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public BoolPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedBoolPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstBoolPtrImpl extends BoolPtrImpl {

        // Reserved for NatJ runtime
        protected ConstBoolPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstBoolPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstBoolPtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Boolean obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Boolean obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(boolean value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, boolean value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Boolean[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(boolean[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final BoolPtr ofs(int elemOffset) {
            return new ConstBoolPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public BoolPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstBoolPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedBoolPtrImpl extends BoolPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedBoolPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner);

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
        public boolean getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Boolean[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public boolean[] toBoolArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toBoolArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Boolean[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, boolean[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, boolean value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Boolean[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(boolean[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public BoolPtr ofs(int elemOffset) {
            return new GuardedBoolPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public BoolPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedBoolPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstBoolPtrImpl extends GuardedBoolPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstBoolPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Boolean obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Boolean obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(boolean value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, boolean value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Boolean[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Boolean[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(boolean[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final BoolPtr ofs(int elemOffset) {
            return new GuardedConstBoolPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public BoolPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstBoolPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
