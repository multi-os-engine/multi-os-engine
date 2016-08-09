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
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IGuardedPtr;

class FloatPtrImpl extends VoidPtrImpl implements FloatPtr {

    protected static final int ELEM_SIZE = CRuntime.FLOAT_SIZE;

    // Reserved for NatJ runtime
    protected FloatPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected FloatPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    FloatPtrImpl(int capacity, boolean owned) {
        super(CRuntime.allocFloat(capacity), owned, null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Float get() {
        return getValue(0);
    }

    @Override
    public final Float get(int idx) {
        return getValue(idx);
    }

    @Override
    public final float getValue() {
        return getValue(0);
    }

    @Override
    public float getValue(int idx) {
        return CRuntime.loadFloat(getRoot(), idx);
    }

    @Override
    public final Float[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Float[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Float[] array = new Float[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final float[] toFloatArray(int length) {
        return toFloatArray(0, length);
    }

    @Override
    public float[] toFloatArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return CRuntime.createFloatArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
    }

    @Override
    public final void copyTo(Float[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Float[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Float[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
            dest[destOffset] = CRuntime.loadFloat(root, srcOffset);
        }
    }

    @Override
    public final void copyTo(float[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(float[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, float[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyFromNativeFloatArray(dest, destOffset, getRoot(), srcOffset, length);
    }

    @Override
    public void set(Float obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Float obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(float value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, float value) {
        CRuntime.storeFloat(getRoot(), idx, value);
    }

    @Override
    public void copyFrom(Float[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Float[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Float[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Float[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
            CRuntime.storeFloat(root, destOffset, src[srcOffset]);
        }
    }

    @Override
    public void copyFrom(float[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(float[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(float[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(float[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyFloatArray(getRoot(), destOffset, src, srcOffset, length);
    }

    @Override
    public FloatPtr ofs(int elemOffset) {
        return new FloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final FloatPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public FloatPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstFloatPtrImpl extends FloatPtrImpl {

        // Reserved for NatJ runtime
        protected ConstFloatPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstFloatPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstFloatPtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Float obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Float obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(float value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, float value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Float[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(float[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final FloatPtr ofs(int elemOffset) {
            return new ConstFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public FloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedFloatPtrImpl extends FloatPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedFloatPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public float getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Float[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public float[] toFloatArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toFloatArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Float[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, float[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, float value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Float[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(float[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public FloatPtr ofs(int elemOffset) {
            return new GuardedFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public FloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstFloatPtrImpl extends GuardedFloatPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstFloatPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Float obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Float obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(float value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, float value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Float[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Float[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(float[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final FloatPtr ofs(int elemOffset) {
            return new GuardedConstFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public FloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
