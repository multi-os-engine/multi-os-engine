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
import org.moe.natj.general.ptr.NIntPtr;

class NIntPtrImpl extends VoidPtrImpl implements NIntPtr {

    protected static final int ELEM_SIZE = CRuntime.POINTER_SIZE;

    // Reserved for NatJ runtime
    protected NIntPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected NIntPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    NIntPtrImpl(int capacity, boolean owned) {
        super(NatJ.is64Bit() ? CRuntime.allocLong(capacity) : CRuntime.allocInt(capacity), owned,
                null);
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
        if (NatJ.is64Bit()) {
            return CRuntime.loadLong(getRoot(), idx);
        } else {
            return (long) CRuntime.loadInt(getRoot(), idx);
        }
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
        if (NatJ.is64Bit()) {
            return CRuntime.createLongArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
        } else {
            int[] intArray = CRuntime.createIntArray(getRoot() + fromIndex * ELEM_SIZE, toIndex
                    - fromIndex);
            long[] longArray = new long[intArray.length];
            for (int i = 0; i < intArray.length; i++) {
                longArray[i] = (long) intArray[i];
            }
            return longArray;
        }
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
        if (NatJ.is64Bit()) {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = CRuntime.loadLong(root, srcOffset);
            }
        } else {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (long) CRuntime.loadInt(root, srcOffset);
            }
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
        if (NatJ.is64Bit()) {
            CRuntime.copyFromNativeLongArray(dest, destOffset, getRoot(), srcOffset, length);
        } else {
            final long root = getRoot();
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (long) CRuntime.loadInt(root, srcOffset);
            }
        }
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
        if (NatJ.is64Bit()) {
            CRuntime.storeLong(getRoot(), idx, value);
        } else {
            CRuntime.storeInt(getRoot(), idx, (int) value);
        }
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
        if (NatJ.is64Bit()) {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeLong(root, destOffset, src[srcOffset]);
            }
        } else {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeInt(root, destOffset, src[srcOffset].intValue());
            }
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
        if (NatJ.is64Bit()) {
            CRuntime.copyLongArray(getRoot(), destOffset, src, srcOffset, length);
        } else {
            int[] intArray = new int[length];
            for (int i = 0; i < length; i++) {
                intArray[i] = (int) src[i + srcOffset];
            }
            CRuntime.copyIntArray(getRoot(), destOffset, intArray, 0, length);
        }
    }

    @Override
    public NIntPtr ofs(int elemOffset) {
        return new NIntPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final NIntPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public NIntPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedNIntPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstNIntPtrImpl extends NIntPtrImpl {

        // Reserved for NatJ runtime
        protected ConstNIntPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstNIntPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstNIntPtrImpl(int capacity, boolean owned) {
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
        public final NIntPtr ofs(int elemOffset) {
            return new ConstNIntPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public NIntPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstNIntPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedNIntPtrImpl extends NIntPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedNIntPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, long[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
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
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(long[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public NIntPtr ofs(int elemOffset) {
            return new GuardedNIntPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public NIntPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedNIntPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstNIntPtrImpl extends GuardedNIntPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstNIntPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public final NIntPtr ofs(int elemOffset) {
            return new GuardedConstNIntPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public NIntPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstNIntPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
