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
import org.moe.natj.general.ptr.IGuardedPtr;
import org.moe.natj.general.ptr.LongPtr;

class LongPtrImpl extends VoidPtrImpl implements LongPtr {

    protected static final int ELEM_SIZE = CRuntime.LONG_SIZE;

    // Reserved for NatJ runtime
    protected LongPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected LongPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    LongPtrImpl(int capacity, boolean owned) {
        super(CRuntime.allocLong(capacity), owned, null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Long get() {
        return getValue(0);
    }

    @Override
    public final Long get(int idx) {
        return getValue(idx);
    }

    @Override
    public final long getValue() {
        return getValue(0);
    }

    @Override
    public long getValue(int idx) {
        return CRuntime.loadLong(getRoot(), idx);
    }

    @Override
    public final Long[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Long[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Long[] array = new Long[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final long[] toLongArray(int length) {
        return toLongArray(0, length);
    }

    @Override
    public long[] toLongArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return CRuntime.createLongArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
    }

    @Override
    public final void copyTo(Long[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Long[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Long[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
            dest[destOffset] = CRuntime.loadLong(root, srcOffset);
        }
    }

    @Override
    public final void copyTo(long[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(long[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, long[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyFromNativeLongArray(dest, destOffset, getRoot(), srcOffset, length);
    }

    @Override
    public void set(Long obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Long obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(long value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, long value) {
        CRuntime.storeLong(getRoot(), idx, value);
    }

    @Override
    public void copyFrom(Long[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Long[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Long[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Long[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
            CRuntime.storeLong(root, destOffset, src[srcOffset]);
        }
    }

    @Override
    public void copyFrom(long[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(long[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(long[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(long[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyLongArray(getRoot(), destOffset, src, srcOffset, length);
    }

    @Override
    public LongPtr ofs(int elemOffset) {
        return new LongPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final LongPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public LongPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedLongPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstLongPtrImpl extends LongPtrImpl {

        // Reserved for NatJ runtime
        protected ConstLongPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstLongPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstLongPtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Long obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Long obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(long value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, long value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Long[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(long[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final LongPtr ofs(int elemOffset) {
            return new ConstLongPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public LongPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstLongPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedLongPtrImpl extends LongPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedLongPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public long getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Long[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public long[] toLongArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toLongArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Long[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, long[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, long value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Long[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(long[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public LongPtr ofs(int elemOffset) {
            return new GuardedLongPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public LongPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedLongPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstLongPtrImpl extends GuardedLongPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstLongPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Long obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Long obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(long value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, long value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Long[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Long[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(long[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final LongPtr ofs(int elemOffset) {
            return new GuardedConstLongPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public LongPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstLongPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
