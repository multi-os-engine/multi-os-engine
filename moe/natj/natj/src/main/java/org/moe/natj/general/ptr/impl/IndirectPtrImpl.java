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
import org.moe.natj.c.OpaquePtr;
import org.moe.natj.c.StructObject;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IGuardedPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;

import java.lang.reflect.Constructor;

class IndirectPtrImpl<E extends ConstVoidPtr, T> extends AbstractTypedPtr<T, E> {

    protected static final int ELEM_SIZE = CRuntime.POINTER_SIZE;

    protected final int depth;

    // Reserved for NatJ runtime
    protected IndirectPtrImpl(Class<T> type, int depth, Pointer peer) {
        super(type, peer);
        this.depth = depth;
    }

    // For ofs creation only
    private IndirectPtrImpl(Class<T> cls, int depth, long peer,
            Object bufferOwner) {
        super(cls, peer, bufferOwner);
        this.depth = depth;
    }

    // For public creation
    IndirectPtrImpl(Class<T> cls, int depth, int capacity, boolean owned) {
        super(cls, CRuntime.allocPointer(capacity), owned);
        this.depth = depth;
    }

    @Override
    public int getDepth() {
        return depth;
    }

    private final Pointer getPointer(int idx) {
        long peer = CRuntime.loadPointer(getRoot(), idx);
        if (peer == 0) {
            return null;
        }
        return new Pointer(peer);
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    // TODO: Add support for NFloat, NUInt and NInt.
    @SuppressWarnings("unchecked")
    @Override
    public E get(int idx) {
        if (depth <= 1) {
            throw new RuntimeException("Invalid reference depth!");
        } else if (depth == 2) {
            Class<?> cls = type;
            Pointer pointer = getPointer(idx);
            if (pointer == null) {
                return null;
            }
            if (cls == Void.class) {
                return (E) new VoidPtrImpl(pointer);
            } else if (cls == Boolean.class) {
                return (E) new BoolPtrImpl(pointer);
            } else if (cls == Byte.class) {
                return (E) new BytePtrImpl(pointer);
            } else if (cls == Short.class) {
                return (E) new ShortPtrImpl(pointer);
            } else if (cls == Character.class) {
                return (E) new CharPtrImpl(pointer);
            } else if (cls == Integer.class) {
                return (E) new IntPtrImpl(pointer);
            } else if (cls == Long.class) {
                return (E) new LongPtrImpl(pointer);
            } else if (cls == Float.class) {
                return (E) new FloatPtrImpl(pointer);
            } else if (cls == Double.class) {
                return (E) new DoublePtrImpl(pointer);
            } else if (cls == NInt.class) {
                return (E) new NIntPtrImpl(pointer);
            } else if (cls == NUInt.class) {
                return (E) new NUIntPtrImpl(pointer);
            } else if (cls == NLong.class) {
                return (E) new NLongPtrImpl(pointer);
            } else if (cls == NULong.class) {
                return (E) new NULongPtrImpl(pointer);
            } else if (cls == NFloat.class) {
                return (E) new NFloatPtrImpl(pointer);
            } else if (StructObject.class.isAssignableFrom(cls)) {
                return (E) new StructPtrImpl<StructObject>(
                        (Class<StructObject>) cls, pointer);
            } else if (ObjCObject.class.isAssignableFrom(cls)) {
                return (E) new ObjCObjectPtrImpl<ObjCObject>(
                        (Class<ObjCObject>) cls, pointer);
            } else if (CxxObject.class.isAssignableFrom(cls)) {
                return (E) new CxxObjectPtrImpl<CxxObject>(
                        (Class<CxxObject>) cls, pointer);
            } else if (OpaquePtr.class.isAssignableFrom(cls)) {
                try {
                    Class<?> impl = null;
                    for (Class<?> declared : cls.getDeclaredClasses()) {
                        if ("Impl".equals(declared.getSimpleName())) {
                            impl = declared;
                            break;
                        }
                    }
                    if (impl == null) throw new RuntimeException("No suitable indirect ptr impl was found");
                    Constructor<?> constructor = impl.getDeclaredConstructor(Pointer.class);
                    constructor.setAccessible(true);
                    return (E) constructor.newInstance(new Object[] {
                            pointer
                    });
                } catch (Exception e) {
                    throw new RuntimeException("Unable to construct pointer", e);
                }
            } else {
                throw new RuntimeException("Invalid reference core type!");
            }
        } else {
            Pointer pointer = getPointer(idx);
            if (pointer == null) {
                return null;
            }
            return (E) new IndirectPtrImpl<E, T>(type, depth - 1, pointer);
        }
    }

    @Override
    public void set(int idx, E obj) {
        if (obj == null) {
            CRuntime.storePointer(getRoot(), idx, 0);
        } else {
            CRuntime.storePointer(getRoot(), idx, ((AbstractPtr) obj).getRoot());
        }
    }

    @Override
    public Ptr<E> ofs(int elemOffset) {
        return new IndirectPtrImpl<E, T>(type, depth, getRoot() + elemOffset
                * ELEM_SIZE, this);
    }

    @Override
    public boolean isGuarded() {
        return false;
    }

    @Override
    public Ptr<E> getGuarded(int fromIndex, int toIndex) {
        if (toIndex < fromIndex) {
            throw new IllegalArgumentException();
        }
        return new GuardedIndirectPtrImpl<E, T>(type, depth, getRoot(), this,
                fromIndex, toIndex);
    }

    static class ConstIndirectPtrImpl<E extends ConstVoidPtr, T> extends
            IndirectPtrImpl<E, T> {

        // Reserved for NatJ runtime
        protected ConstIndirectPtrImpl(Class<T> type, int depth, Pointer peer) {
            super(type, depth, peer);
        }

        // For ofs creation only
        private ConstIndirectPtrImpl(Class<T> cls, int depth, long peer,
                Object bufferOwner) {
            super(cls, depth, peer, bufferOwner);
        }

        // For public creation
        ConstIndirectPtrImpl(Class<T> cls, int depth, int capacity,
                boolean owned) {
            super(cls, depth, CRuntime.allocPointer(capacity), owned);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public final void set(E value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void set(int idx, E value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(E[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src, int srcOffset, int destOffset,
                int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final Ptr<E> ofs(int elemOffset) {
            return new ConstIndirectPtrImpl<E, T>(type, depth, getRoot()
                    + elemOffset * ELEM_SIZE, this);
        }

        @Override
        public Ptr<E> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstIndirectPtrImpl<E, T>(type, depth,
                    getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedIndirectPtrImpl<E extends ConstVoidPtr, T>
            extends IndirectPtrImpl<E, T> implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedIndirectPtrImpl(Class<T> type, int depth, long peer,
                Object bufferOwner, int low, int hi) {
            super(type, depth, peer, bufferOwner);

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
        public E get(int idx) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            return super.get(idx);
        }

        @Override
        public void copyTo(int srcOffset, E[] dest, int destOffset, int length) {
            if (!checkIndex(srcOffset) || !checkIndex(srcOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyTo(srcOffset, dest, destOffset, length);
        }

        @Override
        public void set(int idx, E value) {
            if (!checkIndex(idx)) {
                throw new IndexOutOfBoundsException();
            }
            super.set(idx, value);
        }

        @Override
        public void copyFrom(E[] src, int srcOffset, int destOffset, int length) {
            if (!checkIndex(destOffset) || !checkIndex(destOffset + length - 1)) {
                throw new IndexOutOfBoundsException();
            }
            super.copyFrom(src, srcOffset, destOffset, length);
        }

        @Override
        public Ptr<E> ofs(int elemOffset) {
            return new GuardedIndirectPtrImpl<E, T>(type, depth, getRoot()
                    + elemOffset * ELEM_SIZE, this, low + elemOffset, hi
                    + elemOffset);
        }

        @Override
        public Ptr<E> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedIndirectPtrImpl<E, T>(type, depth, getRoot(),
                    this, fromIndex, toIndex);
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

    private static class GuardedConstIndirectPtrImpl<E extends ConstVoidPtr, T>
            extends GuardedIndirectPtrImpl<E, T> {

        // For ofs and guarded creation only
        public GuardedConstIndirectPtrImpl(Class<T> type, int depth, long peer,
                Object bufferOwner, int low, int hi) {
            super(type, depth, peer, bufferOwner, low, hi);
        }

        @Override
        public boolean isConstPtr() {
            return true;
        }

        @Override
        public final void set(E value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void set(int idx, E value) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src, int destOffset) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void copyFrom(E[] src, int destOffset, int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void copyFrom(E[] src, int srcOffset, int destOffset,
                int length) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final Ptr<E> ofs(int elemOffset) {
            return new GuardedConstIndirectPtrImpl<E, T>(type, depth, getRoot()
                    + elemOffset * ELEM_SIZE, this, low + elemOffset, hi
                    + elemOffset);
        }

        @Override
        public Ptr<E> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstIndirectPtrImpl<E, T>(type, depth,
                    getRoot(), this, fromIndex, toIndex);
        }

    }

}
