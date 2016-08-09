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
import org.moe.natj.general.ptr.NFloatPtr;

class NFloatPtrImpl extends VoidPtrImpl implements NFloatPtr {

    protected static final int ELEM_SIZE = CRuntime.POINTER_SIZE;

    // Reserved for NatJ runtime
    protected NFloatPtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected NFloatPtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    NFloatPtrImpl(int capacity, boolean owned) {
        super(NatJ.is64Bit() ? CRuntime.allocDouble(capacity) : CRuntime.allocFloat(capacity),
                owned, null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Double get() {
        return getValue(0);
    }

    @Override
    public final Double get(int idx) {
        return getValue(idx);
    }

    @Override
    public final double getValue() {
        return getValue(0);
    }

    @Override
    public double getValue(int idx) {
        if (NatJ.is64Bit()) {
            return CRuntime.loadDouble(getRoot(), idx);
        } else {
            return (double) CRuntime.loadFloat(getRoot(), idx);
        }
    }

    @Override
    public final Double[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Double[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Double[] array = new Double[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final double[] toDoubleArray(int length) {
        return toDoubleArray(0, length);
    }

    @Override
    public double[] toDoubleArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        if (NatJ.is64Bit()) {
            return CRuntime.createDoubleArray(getRoot() + fromIndex * ELEM_SIZE, toIndex
                    - fromIndex);
        } else {
            float[] floatArray = CRuntime.createFloatArray(getRoot() + fromIndex * ELEM_SIZE,
                    toIndex - fromIndex);
            double[] doubleArray = new double[floatArray.length];
            for (int i = 0; i < floatArray.length; i++) {
                doubleArray[i] = (double) floatArray[i];
            }
            return doubleArray;
        }
    }

    @Override
    public final void copyTo(Double[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Double[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Double[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        if (NatJ.is64Bit()) {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = CRuntime.loadDouble(root, srcOffset);
            }
        } else {
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (double) CRuntime.loadFloat(root, srcOffset);
            }
        }
    }

    @Override
    public final void copyTo(double[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(double[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, double[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        if (NatJ.is64Bit()) {
            CRuntime.copyFromNativeDoubleArray(dest, destOffset, getRoot(), srcOffset, length);
        } else {
            final long root = getRoot();
            for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
                dest[destOffset] = (double) CRuntime.loadFloat(root, srcOffset);
            }
        }
    }

    @Override
    public void set(Double obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Double obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(double value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, double value) {
        if (NatJ.is64Bit()) {
            CRuntime.storeDouble(getRoot(), idx, value);
        } else {
            CRuntime.storeFloat(getRoot(), idx, (float) value);
        }
    }

    @Override
    public void copyFrom(Double[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Double[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Double[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Double[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        if (NatJ.is64Bit()) {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeDouble(root, destOffset, src[srcOffset]);
            }
        } else {
            for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
                CRuntime.storeFloat(root, destOffset, src[srcOffset].floatValue());
            }
        }
    }

    @Override
    public void copyFrom(double[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(double[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(double[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(double[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        if (NatJ.is64Bit()) {
            CRuntime.copyDoubleArray(getRoot(), destOffset, src, srcOffset, length);
        } else {
            float[] floatArray = new float[length];
            for (int i = 0; i < length; i++) {
                floatArray[i] = (float) src[i + srcOffset];
            }
            CRuntime.copyFloatArray(getRoot(), destOffset, floatArray, 0, length);
        }
    }

    @Override
    public NFloatPtr ofs(int elemOffset) {
        return new NFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final NFloatPtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public NFloatPtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedNFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public int getGuardLow() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getGuardHigh() {
        throw new UnsupportedOperationException();
    }

    static class ConstNFloatPtrImpl extends NFloatPtrImpl {

        // Reserved for NatJ runtime
        protected ConstNFloatPtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstNFloatPtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstNFloatPtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Double obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Double obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(double value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, double value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Double[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(double[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final NFloatPtr ofs(int elemOffset) {
            return new ConstNFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public NFloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstNFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedNFloatPtrImpl extends NFloatPtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedNFloatPtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public double getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Double[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public double[] toDoubleArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toDoubleArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Double[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, double[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, double value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Double[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(double[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public NFloatPtr ofs(int elemOffset) {
            return new GuardedNFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public NFloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedNFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstNFloatPtrImpl extends GuardedNFloatPtrImpl {

        // For ofs and guarded creation only
        public GuardedConstNFloatPtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Double obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Double obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(double value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, double value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Double[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Double[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(double[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final NFloatPtr ofs(int elemOffset) {
            return new GuardedConstNFloatPtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public NFloatPtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstNFloatPtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
