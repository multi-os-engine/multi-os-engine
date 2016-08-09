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
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.IGuardedPtr;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class BytePtrImpl extends VoidPtrImpl implements BytePtr {

    protected static final int ELEM_SIZE = CRuntime.BYTE_SIZE;

    // Reserved for NatJ runtime
    protected BytePtrImpl(Pointer peer) {
        super(peer);
    }

    // For ofs and java.nio.Buffer creation
    protected BytePtrImpl(long peer, Object bufferOwner) {
        super(peer, false, bufferOwner);
    }

    // For public creation
    BytePtrImpl(int capacity, boolean owned) {
        super(CRuntime.allocByte(capacity), owned, null);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final Byte get() {
        return getValue(0);
    }

    @Override
    public final Byte get(int idx) {
        return getValue(idx);
    }

    @Override
    public final byte getValue() {
        return getValue(0);
    }

    @Override
    public byte getValue(int idx) {
        return CRuntime.loadByte(getRoot(), idx);
    }

    @Override
    public final Byte[] toArray(int length) {
        return toArray(0, length);
    }

    @Override
    public Byte[] toArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        int length = toIndex - fromIndex;
        Byte[] array = new Byte[length];
        copyTo(fromIndex, array, 0, length);
        return array;
    }

    @Override
    public final byte[] toByteArray(int length) {
        return toByteArray(0, length);
    }

    @Override
    public byte[] toByteArray(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return CRuntime.createByteArray(getRoot() + fromIndex * ELEM_SIZE, toIndex - fromIndex);
    }

    @Override
    public final void copyTo(Byte[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(Byte[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, Byte[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int idx = 0; idx < length; ++idx, ++srcOffset, ++destOffset) {
            dest[destOffset] = CRuntime.loadByte(root, srcOffset);
        }
    }

    @Override
    public final void copyTo(byte[] dest) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, dest.length);
    }

    @Override
    public final void copyTo(byte[] dest, int length) {
        if (dest == null) {
            throw new IllegalArgumentException();
        }
        copyTo(0, dest, 0, length);
    }

    @Override
    public void copyTo(int srcOffset, byte[] dest, int destOffset, int length) {
        if (dest == null || destOffset < 0 || length < 0 || destOffset + length > dest.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyFromNativeByteArray(dest, destOffset, getRoot(), srcOffset, length);
    }

    @Override
    public void set(Byte obj) {
        setValue(obj);
    }

    @Override
    public void set(int idx, Byte obj) {
        setValue(idx, obj);
    }

    @Override
    public void setValue(byte value) {
        setValue(0, value);
    }

    @Override
    public void setValue(int idx, byte value) {
        CRuntime.storeByte(getRoot(), idx, value);
    }

    @Override
    public void copyFrom(Byte[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(Byte[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(Byte[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(Byte[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        final long root = getRoot();
        for (int i = 0; i < length; ++i, ++srcOffset, ++destOffset) {
            CRuntime.storeByte(root, destOffset, src[srcOffset]);
        }
    }

    @Override
    public void copyFrom(byte[] src) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, 0, src.length);
    }

    @Override
    public void copyFrom(byte[] src, int destOffset) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, src.length);
    }

    @Override
    public void copyFrom(byte[] src, int destOffset, int length) {
        if (src == null) {
            throw new IllegalArgumentException();
        }
        copyFrom(src, 0, destOffset, length);
    }

    @Override
    public void copyFrom(byte[] src, int srcOffset, int destOffset, int length) {
        if (src == null || srcOffset < 0 || length < 0 || srcOffset + length > src.length) {
            throw new IllegalArgumentException();
        }
        CRuntime.copyByteArray(getRoot(), destOffset, src, srcOffset, length);
    }

    @Override
    public BytePtr ofs(int elemOffset) {
        return new BytePtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public final BytePtr getGuarded(int length) {
        return getGuarded(0, length);
    }

    @Override
    public BytePtr getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedBytePtrImpl(getRoot(), this, fromIndex, toIndex);
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
    public String toUTF8String() {
        int length = 0;
        while (getValue(length) != 0) {
            ++length;
        }
        return new String(toByteArray(length), Charset.forName("UTF-8"));
    }

    @Override
    public String toASCIIString() {
        int length = 0;
        while (getValue(length) != 0) {
            ++length;
        }
        return new String(toByteArray(length), Charset.forName("ASCII"));
    }

    @Override
    public String toString(int length) {
        return new String(toByteArray(length), Charset.forName("UTF-8"));
    }

    @Override
    public String toString(int length, String charset) throws UnsupportedEncodingException {
        return new String(toByteArray(length), charset);
    }

    static class ConstBytePtrImpl extends BytePtrImpl {

        // Reserved for NatJ runtime
        protected ConstBytePtrImpl(Pointer peer) {
            super(peer);
        }

        // For ofs creation only
        protected ConstBytePtrImpl(long peer, Object bufferOwner) {
            super(peer, bufferOwner);
        }

        // For public creation
        ConstBytePtrImpl(int capacity, boolean owned) {
            super(capacity, owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Byte obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Byte obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(byte value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Byte[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(byte[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final BytePtr ofs(int elemOffset) {
            return new ConstBytePtrImpl(getRoot() + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public BytePtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstBytePtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedBytePtrImpl extends BytePtrImpl implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedBytePtrImpl(long peer, Object bufferOwner, int low, int hi) {
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
        public byte getValue(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public Byte[] toArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toArray(fromIndex, toIndex);
        }

        @Override
        public byte[] toByteArray(int fromIndex, int toIndex) {
            if (!checkIndex(fromIndex) || !checkIndex(toIndex)) {
                throw new IndexOutOfBoundsException();
            }
            return super.toByteArray(fromIndex, toIndex);
        }

        @Override
        public void copyTo(int srcOffset, Byte[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void copyTo(int srcOffset, byte[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void setValue(int idx, byte value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(Byte[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public void copyFrom(byte[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public BytePtr ofs(int elemOffset) {
            return new GuardedBytePtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public BytePtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedBytePtrImpl(getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstBytePtrImpl extends GuardedBytePtrImpl {

        // For ofs and guarded creation only
        public GuardedConstBytePtrImpl(long peer, Object bufferOwner, int low, int hi) {
            super(peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public void set(Byte obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void set(int idx, Byte obj) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(byte value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void setValue(int idx, byte value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(Byte[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(Byte[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src, int srcOffset, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(byte[] src, int srcOffset, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final BytePtr ofs(int elemOffset) {
            return new GuardedConstBytePtrImpl(getRoot() + elemOffset * ELEM_SIZE, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public BytePtr getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstBytePtrImpl(getRoot(), this, fromIndex, toIndex);
        }

    }

}
