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

package org.moe.natj.cxx;

import org.moe.natj.cxx.impl.ReferenceManager;
import org.moe.natj.general.NativeRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NLong;
import org.moe.natj.general.ann.NULong;
import org.moe.natj.general.ann.WCharT;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NLongPtr;
import org.moe.natj.general.ptr.NULongPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.WCharTPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.general.ptr.impl.PtrImplementer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * CxxRuntime.
 * <p>
 * <p>
 * {@link NativeRuntime} implementation used for supporting C++ features.
 */
public class CxxRuntime {

    /**
     * Placeholder value for illegal memory address.
     */
    public static final long ILLEGAL_MEMORY_ADDRESS = 0xDEADD00DDEADBEEFL;

    /**
     * Private CxxRuntime constructor.
     */
    private CxxRuntime() {
    }

    /**
     * Object cache map R/W lock.
     */
    private static final ReadWriteLock READ_WRITE_LOCK = new ReentrantReadWriteLock();

    /**
     * Object cache map read lock.
     */
    private static final Lock READ_LOCK = READ_WRITE_LOCK.readLock();

    /**
     * Object cache map write lock.
     */
    private static final Lock WRITE_LOCK = READ_WRITE_LOCK.writeLock();

    /**
     * Object cache map.
     */
    private static final HashMap<Long, CxxObject> NATIVE_OBJECT_MAP = new HashMap<Long, CxxObject>();

    /**
     * Reference manager.
     */
    private static final ReferenceManager REFERENCE_MANAGER = new ReferenceManager();

    /**
     * Initializes the C++ runtime.
     */
    public static void initialize() {
        // Only here to trigger initialization.
    }

    /**
     * Sets up the VM with the C++ runtime.
     */
    private native static void setupVM();

    static {
        setupVM();
    }

    /**
     * Returns the impl class for the specified class.
     *
     * @param className  Base class
     * @param implSuffix Impl class suffix
     * @return Impl class
     */
    public static Class<?> getClassImplForName(String className, String implSuffix) {
        try {
            return Class.forName(className + implSuffix);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Invokes the 'delete' operator on the given object.
     *
     * @param obj Object to delete
     */
    public static void delete(CxxObject obj) {
        CxxObjectBaseImpl impl = (CxxObjectBaseImpl) obj;
        final long peer = impl._cxx_rt_peer();
        WRITE_LOCK.lock();
        try {
            NATIVE_OBJECT_MAP.remove(peer);
        } finally {
            WRITE_LOCK.unlock();
        }
        impl._cxx_rt_delete2();
    }

    /**
     * Interface for releasing C++ objects.
     *
     * @param <T> Type to release
     */
    public interface Releaser<T extends CxxObject> {
        /**
         * Releases the object.
         *
         * @param object Object to release
         */
        void release(T object);
    }

    /**
     * Releases the specified object with the specified releaser.
     *
     * @param object   Object to release
     * @param releaser Releaser instance
     * @param <T>      Type to release
     */
    public static <T extends CxxObject> void deleteWith(T object, Releaser<T> releaser) {
        if (object == null) {
            throw new NullPointerException();
        }
        if (releaser == null) {
            throw new NullPointerException();
        }
        try {
            releaser.release(object);
        } finally {
            final CxxObjectBaseImpl impl = (CxxObjectBaseImpl) object;
            final long peer = impl._cxx_rt_peer();
            impl._cxx_rt_invalidate();
            WRITE_LOCK.lock();
            try {
                NATIVE_OBJECT_MAP.remove(peer);
            } finally {
                WRITE_LOCK.unlock();
            }
        }
    }

    /**
     * Detaches the specified object from the runtime cache.
     *
     * @param object Object to detach
     * @param <T>    Type of object
     */
    public static <T extends CxxObject> void detachOnly(T object) {
        if (object == null) {
            throw new NullPointerException();
        }
        final CxxObjectBaseImpl impl = (CxxObjectBaseImpl) object;
        final long peer = impl._cxx_rt_peer();
        WRITE_LOCK.lock();
        try {
            NATIVE_OBJECT_MAP.remove(peer);
        } finally {
            WRITE_LOCK.unlock();
        }
    }

    /**
     * Returns the cached object for the specified peer.
     *
     * @param peer Native peer
     * @return Cached object or null
     */
    public static CxxObject get(long peer) {
        // Very early exit for mapping 0 to null
        if (peer == 0L) {
            return null;
        }

        // Try to only read lock, maybe the object already exists
        READ_LOCK.lock();
        try {
            return NATIVE_OBJECT_MAP.get(peer);
        } finally {
            READ_LOCK.unlock();
        }
    }

    /**
     * Constructs a Java object with the specified impl Class.
     *
     * @param peer      Native peer
     * @param implClass Impl class
     * @param <T>       Object type
     * @return Constructed object
     */
    @SuppressWarnings("unchecked")
    public static <T extends CxxObject> T construct(long peer, Class<T> implClass) {
        // Very early exit for mapping 0 to null
        if (peer == 0L) {
            return null;
        }

        // Look for the constructor outside of the lock
        final Constructor<?> ctor;
        try {
            ctor = implClass.getConstructor(long.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        // Object was not found, construct a new one
        WRITE_LOCK.lock();
        try {
            // Create the object
            return (T) ctor.newInstance(peer);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } finally {
            WRITE_LOCK.unlock();
        }
    }

    /**
     * Registers the object in the Object cache.
     *
     * @param object Object to register
     */
    public static void register(CxxObject object) {
        if (object == null) throw new NullPointerException();

        WRITE_LOCK.lock();
        try {
            NATIVE_OBJECT_MAP.put(object._cxx_rt_peer(), object);
        } finally {
            WRITE_LOCK.unlock();
        }
    }

    /**
     * Returns a new UID for the specified object.
     *
     * @param object Object to associate with the UID
     * @return UID
     */
    public static long getUIDForObject(Object object) {
        return REFERENCE_MANAGER.put(object);
    }

    /**
     * Returns the object associated with the UID.
     *
     * @param uid UID
     * @return Associated object
     */
    public static Object getObjectForUID(long uid) {
        return REFERENCE_MANAGER.get(uid);
    }

    /**
     * Primitive pointer type map.
     */
    public static final Map<Class<?>, Class<?>> primitivePtrTypeMap;

    static {
        HashMap<Class<?>, Class<?>> ptrMap = new HashMap<Class<?>, Class<?>>(32);
        ptrMap.put(Void.class, VoidPtr.class);
        ptrMap.put(Character.class, CharPtr.class);
        ptrMap.put(Boolean.class, BoolPtr.class);
        ptrMap.put(Byte.class, BytePtr.class);
        ptrMap.put(Short.class, ShortPtr.class);
        ptrMap.put(Integer.class, IntPtr.class);
        ptrMap.put(Long.class, LongPtr.class);
        ptrMap.put(Float.class, FloatPtr.class);
        ptrMap.put(Double.class, DoublePtr.class);
        ptrMap.put(NFloat.class, NFloatPtr.class);
        ptrMap.put(NULong.class, NULongPtr.class);
        ptrMap.put(NLong.class, NLongPtr.class);
        ptrMap.put(WCharT.class, WCharTPtr.class);
        primitivePtrTypeMap = Collections.unmodifiableMap(ptrMap);
    }

    /**
     * Creates a pointer for the specified peer, depth and element Class.
     *
     * @param peer         Native peer
     * @param depth        Indirection depth
     * @param elementClass Element class
     * @return Constructed pointer
     * @throws NoSuchMethodException
     */
    public static ConstVoidPtr constructPtrForPeer(long peer, int depth, Class<?> elementClass) {
        if (peer == 0L) {
            return null;
        }
        if (depth < 1) {
            throw new IllegalArgumentException("depth must be greater than or equal to 1");
        }
        if (elementClass == null) {
            throw new NullPointerException();
        }
        Pointer pointer = new Pointer(peer);

        if (depth == 1) {
            if (CxxObject.class.isAssignableFrom(elementClass)) {
                Class<CxxObject> cls = (Class<CxxObject>) elementClass;
                return PtrImplementer.getCxxObjectPtr(cls, pointer);
            }

            final Class<?> implClass;
            final Class<?> ptrClass = primitivePtrTypeMap.get(elementClass);
            if (ptrClass != null) {
                implClass = PtrImplementer.primitivePtrTypeMap.get(ptrClass);
                if (implClass == null) {
                    throw new RuntimeException("failed to locate impl class");
                }
            } else {
                throw new RuntimeException("failed to locate ptr class");
            }
            final Constructor<?> constructor;
            try {
                constructor = implClass.getDeclaredConstructor(Pointer.class);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            if (constructor == null) {
                throw new RuntimeException("failed to locate impl class constructor");
            }
            constructor.setAccessible(true);
            try {
                return (ConstVoidPtr) constructor.newInstance(pointer);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }

        Class<?> implClass;
        try {
            implClass = Class.forName("org.moe.natj.general.ptr.impl.IndirectPtrImpl");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        final Constructor<?> constructor;
        try {
            constructor = implClass.getDeclaredConstructor(Class.class, int.class, Pointer.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        if (constructor == null) {
            throw new RuntimeException("failed to locate impl class constructor");
        }
        constructor.setAccessible(true);
        try {
            return (ConstVoidPtr) constructor.newInstance(elementClass, depth, pointer);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the native 'sizeof' value for the C++ class/struct represented by the specified object.
     *
     * @param object Binding object
     * @return 'sizeof' value or -1 if the required field does not exist
     */
    public static final long sizeof(CxxObject object) {
        if (object == null) {
            throw new NullPointerException();
        }
        return sizeof(object.getClass());
    }

    /**
     * Returns the native 'sizeof' value for the C++ class/struct represented by the specified Class.
     *
     * @param cls Binding class
     * @param <T> Class type
     * @return 'sizeof' value or -1 if the required field does not exist
     */
    public static final <T extends CxxObject> long sizeof(Class<T> cls) {
        cls = getImplClass(cls);
        final Field cxx_rt_sizeof;
        try {
            cxx_rt_sizeof = cls.getField("_CXX_RT_SIZEOF");
        } catch (NoSuchFieldException e) {
            return -1;
        }
        try {
            return cxx_rt_sizeof.getLong(null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns the 'ptrnewi' method for the specified class.
     *
     * @param cls Owner Class
     * @param <T> Class type
     * @return Method instance or null on failure
     */
    public static final <T extends CxxObject> Method getPtrNewMethod(Class<T> cls) {
        final String methodName = "__cxx_op_6ptrnewi";
        final Class<?>[] parameterTypes = {int.class /* size */};
        return getBridgeMethod(cls, methodName, parameterTypes);
    }

    /**
     * Returns the 'ptrdeletej' method for the specified class.
     *
     * @param cls Owner Class
     * @param <T> Class type
     * @return Method instance or null on failure
     */
    public static final <T extends CxxObject> Method getPtrDeleteMethod(Class<T> cls) {
        final String methodName = "__cxx_op_9ptrdeletej";
        final Class<?>[] parameterTypes = {long.class /* ptr */};
        return getBridgeMethod(cls, methodName, parameterTypes);
    }

    /**
     * Returns the 'ptrsetjij' method for the specified class.
     *
     * @param cls Owner Class
     * @param <T> Class type
     * @return Method instance or null on failure
     */
    public static final <T extends CxxObject> Method getPtrSetMethod(Class<T> cls) {
        final String methodName = "__cxx_op_6ptrsetjij";
        final Class<?>[] parameterTypes = {long.class /* ptr */, int.class /* idx */, long.class /* elem */};
        return getBridgeMethod(cls, methodName, parameterTypes);
    }

    /**
     * Returns the 'ptrgetji' method for the specified class.
     *
     * @param cls Owner Class
     * @param <T> Class type
     * @return Method instance or null on failure
     */
    public static final <T extends CxxObject> Method getPtrGetMethod(Class<T> cls) {
        final String methodName = "__cxx_op_6ptrgetji";
        final Class<?>[] parameterTypes = {long.class /* ptr */, int.class /* idx */};
        return getBridgeMethod(cls, methodName, parameterTypes);
    }

    /**
     * Returns the method for the specified arguments.
     *
     * @param cls            Method owner class
     * @param methodName     Method name
     * @param parameterTypes Method parameter types
     * @param <T>            Class type
     * @return Method instance or null on failure
     */
    private static <T extends CxxObject> Method getBridgeMethod(Class<T> cls, String methodName, Class<?>[] parameterTypes) {
        try {
            return cls.getMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    /**
     * Returns the impl class for the specified class.
     *
     * @param cls Base class
     * @param <T> Class type
     * @return Impl class
     */
    @SuppressWarnings("unchecked")
    public static <T extends CxxObject> Class<T> getImplClass(Class<T> cls) {
        if (cls == null) {
            throw new NullPointerException();
        }
        if (cls.isInterface()) {
            try {
                cls = (Class<T>) Class.forName(cls.getName() + "$__cxx_Impl");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return cls;
    }

    /**
     * Casts the specified object to a VoidPtr.
     *
     * @param object Object to cast
     * @param <T>    Object type
     * @return VoidPtr instance or null
     */
    public static <T extends CxxObject> VoidPtr castToPtr(T object) {
        if (object == null) {
            return null;
        }
        return PtrFactory.newWeakVoidPtr(object._cxx_rt_peer());
    }
}
