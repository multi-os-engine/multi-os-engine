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

import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NLongPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.NULongPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;

class VoidPtrImpl extends AbstractPtr implements VoidPtr {

    // Reserved for NatJ runtime
    protected VoidPtrImpl(Pointer peer) {
        super(peer);
    }

    // For public creation
    protected VoidPtrImpl(long peer, boolean owned, Object bufferOwner) {
        super(peer, owned, bufferOwner);
    }

    @Override
    public int getDepth() {
        return 1;
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public final void free() {
        releasePointer(false);
    }

    @Override
    public final void forceFree() {
        releasePointer(true);
    }

    @Override
    public final BoolPtr getBoolPtr() {
        if (isConstPtr()) {
            return new BoolPtrImpl.ConstBoolPtrImpl(getRoot(), this);
        } else {
            return new BoolPtrImpl(getRoot(), this);
        }
    }

    @Override
    public final BytePtr getBytePtr() {
        if (isConstPtr()) {
            return new BytePtrImpl.ConstBytePtrImpl(getRoot(), this);
        } else {
            return new BytePtrImpl(getRoot(), this);
        }
    }

    @Override
    public final ShortPtr getShortPtr() {
        if (isConstPtr()) {
            return new ShortPtrImpl.ConstShortPtrImpl(getRoot(), this);
        } else {
            return new ShortPtrImpl(getRoot(), this);
        }
    }

    @Override
    public CharPtr getCharPtr() {
        if (isConstPtr()) {
            return new CharPtrImpl.ConstCharPtrImpl(getRoot(), this);
        } else {
            return new CharPtrImpl(getRoot(), this);
        }
    }

    @Override
    public final IntPtr getIntPtr() {
        if (isConstPtr()) {
            return new IntPtrImpl.ConstIntPtrImpl(getRoot(), this);
        } else {
            return new IntPtrImpl(getRoot(), this);
        }
    }

    @Override
    public final LongPtr getLongPtr() {
        if (isConstPtr()) {
            return new LongPtrImpl.ConstLongPtrImpl(getRoot(), this);
        } else {
            return new LongPtrImpl(getRoot(), this);
        }
    }

    @Override
    public final FloatPtr getFloatPtr() {
        if (isConstPtr()) {
            return new FloatPtrImpl.ConstFloatPtrImpl(getRoot(), this);
        } else {
            return new FloatPtrImpl(getRoot(), this);
        }
    }

    @Override
    public final DoublePtr getDoublePtr() {
        if (isConstPtr()) {
            return new DoublePtrImpl.ConstDoublePtrImpl(getRoot(), this);
        } else {
            return new DoublePtrImpl(getRoot(), this);
        }
    }

    @Override
    public NFloatPtr getNFloatPtr() {
        if (isConstPtr()) {
            return new NFloatPtrImpl.ConstNFloatPtrImpl(getRoot(), this);
        } else {
            return new NFloatPtrImpl(getRoot(), this);
        }
    }

    @Override
    public NUIntPtr getNUIntPtr() {
        if (isConstPtr()) {
            return new NUIntPtrImpl.ConstNUIntPtrImpl(getRoot(), this);
        } else {
            return new NUIntPtrImpl(getRoot(), this);
        }
    }

    @Override
    public NIntPtr getNIntPtr() {
        if (isConstPtr()) {
            return new NIntPtrImpl.ConstNIntPtrImpl(getRoot(), this);
        } else {
            return new NIntPtrImpl(getRoot(), this);
        }
    }

    @Override
    public NULongPtr getNULongPtr() {
        if (isConstPtr()) {
            return new NULongPtrImpl.ConstNULongPtrImpl(getRoot(), this);
        } else {
            return new NULongPtrImpl(getRoot(), this);
        }
    }

    @Override
    public NLongPtr getNLongPtr() {
        if (isConstPtr()) {
            return new NLongPtrImpl.ConstNLongPtrImpl(getRoot(), this);
        } else {
            return new NLongPtrImpl(getRoot(), this);
        }
    }

    static class ConstVoidPtrImpl extends VoidPtrImpl {

        // Reserved for NatJ runtime
        ConstVoidPtrImpl(Pointer peer) {
            super(peer);
        }

        // For public creation
        ConstVoidPtrImpl(long peer, boolean owned, Object bufferOwner) {
            super(peer, owned, bufferOwner);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

    }

}
