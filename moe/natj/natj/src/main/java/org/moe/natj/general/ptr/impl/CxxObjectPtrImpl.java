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

import org.moe.natj.cxx.CxxObject;
import org.moe.natj.cxx.CxxRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ptr.IGuardedPtr;
import org.moe.natj.general.ptr.Ptr;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

class CxxObjectPtrImpl<T extends CxxObject> extends AbstractTypedPtr<T, T> {

    private static final ConcurrentHashMap<Class<?>, Method> CREATE_METHODS = new ConcurrentHashMap<Class<?>, Method>();
    private static final ConcurrentHashMap<Class<?>, Method> DELETE_METHODS = new ConcurrentHashMap<Class<?>, Method>();
    private static final ConcurrentHashMap<Class<?>, Method> GETTER_METHODS = new ConcurrentHashMap<Class<?>, Method>();
    private static final ConcurrentHashMap<Class<?>, Method> SETTER_METHODS = new ConcurrentHashMap<Class<?>, Method>();

    private Method getter;
    private Method setter;

    protected final long sizeof;

    // Reserved for NatJ runtime
    protected CxxObjectPtrImpl(Class<T> type, Pointer peer) {
        super(initMethods(type), peer);
        sizeof = CxxRuntime.sizeof(type);
        getter = GETTER_METHODS.get(type);
        setter = SETTER_METHODS.get(type);
    }

    // For ofs creation only
    private CxxObjectPtrImpl(Class<T> type, long peer, Object bufferOwner) {
        super(initMethods(type), peer, bufferOwner);
        sizeof = CxxRuntime.sizeof(type);
        getter = GETTER_METHODS.get(type);
        setter = SETTER_METHODS.get(type);
    }

    // For public creation
    CxxObjectPtrImpl(Class<T> type, int capacity, boolean owned) {
        super(type, createPointer(initMethods(type), capacity, owned));
        sizeof = CxxRuntime.sizeof(type);
        getter = GETTER_METHODS.get(type);
        setter = SETTER_METHODS.get(type);
    }

    private static <T extends CxxObject> Pointer createPointer(Class<T> type, int capacity, boolean owned) {
        final Method create = CREATE_METHODS.get(type);
        final Method delete = DELETE_METHODS.get(type);
        if (create == null || delete == null) {
            throw new UnsupportedOperationException();
        }
        final Long peer;
        try {
            peer = (Long) create.invoke(null, capacity);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                throw (UnsupportedOperationException) e.getCause();
            }
            throw new RuntimeException(e);
        }
        if (owned) {
            return new Pointer(peer, new CxxObjectReleaser(delete));
        } else {
            return new Pointer(peer);
        }
    }

    private static <T extends CxxObject> Class<T> initMethods(final Class<T> type) {
        final Class<T> impl = CxxRuntime.getImplClass(type);
        Method create = CREATE_METHODS.get(type);
        if (create == null) {
            create = CxxRuntime.getPtrNewMethod(impl);
            if (create != null) {
                CREATE_METHODS.putIfAbsent(type, create);
            }
        }
        Method delete = DELETE_METHODS.get(type);
        if (delete == null) {
            delete = CxxRuntime.getPtrDeleteMethod(impl);
            if (delete != null) {
                DELETE_METHODS.putIfAbsent(type, delete);
            }
        }
        Method getter = GETTER_METHODS.get(type);
        if (getter == null) {
            getter = CxxRuntime.getPtrGetMethod(impl);
            if (getter != null) {
                GETTER_METHODS.putIfAbsent(type, getter);
            }
        }
        Method setter = SETTER_METHODS.get(type);
        if (setter == null) {
            setter = CxxRuntime.getPtrSetMethod(impl);
            if (setter != null) {
                SETTER_METHODS.putIfAbsent(type, setter);
            }
        }
        return type;
    }

    @Override
    public boolean isConstPtr() {
        return false;
    }

    @Override
    public T get(int idx) {
        if (getter == null) {
            throw new UnsupportedOperationException();
        }
        long ptr;
        try {
            ptr = (Long) getter.invoke(null, getRoot(), idx);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                throw (UnsupportedOperationException) e.getCause();
            }
            throw new RuntimeException(e);
        }
        final Class<T> implClass = CxxRuntime.getImplClass(type);
        if (ptr == 0L) {
            return null;
        }
        final CxxObject t = CxxRuntime.get(ptr);
        if (t != null && implClass.isAssignableFrom(t.getClass())) {
            return (T) t;
        } else {
            return CxxRuntime.construct(ptr, implClass);
        }
    }

    final T getRef(int idx) {
        final long ptr = getRoot() + idx * sizeof;
        final Class<T> implClass = CxxRuntime.getImplClass(type);
        final CxxObject t = CxxRuntime.get(ptr);
        if (t != null && implClass.isAssignableFrom(t.getClass())) {
            return (T) t;
        } else {
            return CxxRuntime.construct(ptr, implClass);
        }
    }

    @Override
    public void set(int idx, T obj) {
        if (setter == null) {
            throw new UnsupportedOperationException();
        }
        if (obj == null) {
            throw new NullPointerException();
        }
        try {
            setter.invoke(null, getRoot(), idx, obj._cxx_rt_peer());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                throw (UnsupportedOperationException) e.getCause();
            }
            throw new RuntimeException(e);
        }
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
        return new GuardedCxxObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
    }

    @Override
    public Ptr<T> ofs(int elemOffset) {
        return new CxxObjectPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this);
    }

    public void invokeDeletePointer() {
        final Method delete = DELETE_METHODS.get(type);
        if (delete == null) {
            throw new UnsupportedOperationException();
        }
        try {
            delete.invoke(null, getRoot());
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                throw (UnsupportedOperationException) e.getCause();
            }
            throw new RuntimeException(e);
        }
    }

    static class ConstCxxObjectPtrImpl<T extends CxxObject> extends CxxObjectPtrImpl<T> {

        // Reserved for NatJ runtime
        protected ConstCxxObjectPtrImpl(Class<T> type, Pointer peer) {
            super(type, peer);
        }

        // For ofs creation only
        private ConstCxxObjectPtrImpl(Class<T> type, long peer, Object bufferOwner) {
            super(type, peer, bufferOwner);
        }

        // For public creation
        ConstCxxObjectPtrImpl(Class<T> type, int capacity, boolean owned) {
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
            return new ConstCxxObjectPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstCxxObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class GuardedCxxObjectPtrImpl<T extends CxxObject> extends CxxObjectPtrImpl<T>
            implements IGuardedPtr {

        protected final int low;
        protected final int hi;

        // For ofs and guarded creation only
        public GuardedCxxObjectPtrImpl(Class<T> type, long peer, Object bufferOwner, int low, int hi) {
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
            return new GuardedCxxObjectPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this, low
                    + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedCxxObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
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

    private static class GuardedConstCxxObjectPtrImpl<T extends CxxObject> extends
            GuardedCxxObjectPtrImpl<T> {

        // For ofs and guarded creation only
        public GuardedConstCxxObjectPtrImpl(Class<T> type, long peer, Object bufferOwner, int low,
                                            int hi) {
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
            return new GuardedConstCxxObjectPtrImpl<T>(type, getRoot() + elemOffset * sizeof, this,
                    low + elemOffset, hi + elemOffset);
        }

        @Override
        public Ptr<T> getGuarded(int fromIndex, int toIndex) {
            if (toIndex < fromIndex) {
                throw new IllegalArgumentException();
            }
            return new GuardedConstCxxObjectPtrImpl<T>(type, getRoot(), this, fromIndex, toIndex);
        }

    }

    private static class CxxObjectReleaser implements Pointer.Releaser {
        private final Method delete;

        public CxxObjectReleaser(Method delete) {
            this.delete = delete;
        }

        @Override
        public void release(long peer) {
            try {
                delete.invoke(null, peer);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof UnsupportedOperationException) {
                    throw (UnsupportedOperationException) e.getCause();
                }
                throw new RuntimeException(e);
            }
        }

        @Override
        public boolean ifFinalizedExternally() {
            return false;
        }
    }
}
