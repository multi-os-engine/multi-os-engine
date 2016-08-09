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
import org.moe.natj.general.ptr.WCharTPtr;

class WCharTPtrImpl extends VoidPtrImpl implements WCharTPtr {

    protected static final int ELEM_SIZE = CRuntime.NATIVE_WCHART_SIZE;

    static {
        if (ELEM_SIZE != 4 && ELEM_SIZE != 2) {
            throw new RuntimeException("Unexpected wchar_t size");
        }
    }

    // Reserved for NatJ runtime
    protected WCharTPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected WCharTPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    WCharTPtrImpl(int capacity, boolean owned) {
        super(ELEM_SIZE == 4 ? CRuntime.allocInt(capacity) : CRuntime.allocChar(capacity), owned,
                null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Integer get() {
        return getValue(0);
    }

    @Override
    public final Integer get(int idx) {
        return getValue(idx);
    }

    @Override
    public final int getValue() {
        return getValue(0);
    }

    @Override
    public int getValue(int idx) {
        if (ELEM_SIZE == 4) {
            return CRuntime.loadInt(getRoot(), idx);
        } else {
            return (int) CRuntime.loadChar(getRoot(), idx);
        }
    }

    @Override
    public final Integer[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Integer[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Integer[] array = new Integer[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final int[] toIntArray(int length) {
        return toIntArray(0, length);
    }

    @Override
    public int[] toIntArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        if (ELEM_SIZE == 4) {
            return CRuntime.createIntArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
        } else {
            char[] charArray = CRuntime.createCharArray(getRoot() + fromIndex * ELEM_SIZE, toIndex
                    - fromIndex);
            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = (int) charArray[i];
            }
            return intArray;
        }
    }

    @Override
    public final void copyTo(Integer[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Integer[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Integer[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        if (ELEM_SIZE == 4) {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = CRuntime.loadInt(root, srcOffset);
            }
        } else {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (int) CRuntime.loadChar(root, srcOffset);
            }
        }
    }

    @Override
    public final void copyTo(int[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(int[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, int[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        if (ELEM_SIZE == 4) {
            CRuntime.copyFromNativeIntArray(dest, destOffset, getRoot(), srcOffset, length);
        } else {
            final long root = getRoot();
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (int) CRuntime.loadChar(root, srcOffset);
            }
        }
    }

    @Override
    public void set(Integer obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Integer obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(int value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, int value) {
        if (ELEM_SIZE == 4) {
            CRuntime.storeInt(getRoot(), idx, value);
        } else {
            CRuntime.storeChar(getRoot(), idx, (char) value);
        }
    }

    @Override
    public void copyFrom(Integer[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Integer[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Integer[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Integer[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        if (ELEM_SIZE == 4) {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeInt(root, destOffset, src[srcOffset]);
            }
        } else {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeChar(root, destOffset, (char) src[srcOffset].intValue());
            }
        }
    }

    @Override
    public void copyFrom(int[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(int[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(int[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(int[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        if (ELEM_SIZE == 4) {
            CRuntime.copyIntArray(getRoot(), destOffset, src, srcOffset, length);
        } else {
            char[] charArray = new char[length];
            for (int i = 0; i < length; i++) {
                charArray[i] = (char) src[i + srcOffset];
            }
            CRuntime.copyCharArray(getRoot(), destOffset, charArray, 0, length);
        }
    }

    @Override
    public WCharTPtr ofs(int elemOffset) {
        return new WCharTPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final WCharTPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public WCharTPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedWCharTPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstWCharTPtrImpl extends WCharTPtrImpl {

        // Reserved for NatJ runtime
        protected ConstWCharTPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstWCharTPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstWCharTPtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Integer obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Integer obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, int value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Integer[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(int[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final WCharTPtr ofs(int elemOffset) {
            return new ConstWCharTPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public WCharTPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstWCharTPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedWCharTPtrImpl extends WCharTPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedWCharTPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public int getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Integer[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public int[] toIntArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toIntArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Integer[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, int[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, int value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Integer[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(int[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public WCharTPtr ofs(int elemOffset) {
            return new GuardedWCharTPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public WCharTPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedWCharTPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstWCharTPtrImpl extends GuardedWCharTPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstWCharTPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Integer obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Integer obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, int value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Integer[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Integer[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(int[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final WCharTPtr ofs(int elemOffset) {
            return new GuardedConstWCharTPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public WCharTPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstWCharTPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
