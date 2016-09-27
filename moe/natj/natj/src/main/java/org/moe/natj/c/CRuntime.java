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

package org.moe.natj.c;

import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CCallbackMapper;
import org.moe.natj.c.map.CObjectMapper;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.NatJ.JavaObjectConstructionInfo;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.NativeRuntime;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.Pointer.Releaser;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Map;

/**
 * CRuntime.
 *
 * <p>
 * {@link NativeRuntime} implementation used for supporting C features like structures and
 * callbacks.
 */
public class CRuntime extends NativeRuntime {

    static {
        POINTER_SIZE = sizeOfPointer();
        NatJ.registerRuntime(CRuntime.class);
    }

    /** Native size of a pointer in bytes. */
    public static final int POINTER_SIZE;

    /** Native size of a 'native' long in bytes. */
    public static final int NATIVE_LONG_SIZE = sizeOfLong();

    /** Native size of a 'native' wchar_t in bytes. */
    public static final int NATIVE_WCHART_SIZE = sizeOfWCharT();

    /** Native size of a boolean in bytes. */
    public static final int BOOLEAN_SIZE = 1;

    /** Native size of a char in bytes. */
    public static final int CHAR_SIZE = Character.SIZE / 8;

    /** Native size of a byte in bytes. */
    public static final int BYTE_SIZE = Byte.SIZE / 8;

    /** Native size of a short in bytes. */
    public static final int SHORT_SIZE = Short.SIZE / 8;

    /** Native size of an int in bytes. */
    public static final int INT_SIZE = Integer.SIZE / 8;

    /** Native size of a long in bytes. */
    public static final int LONG_SIZE = Long.SIZE / 8;

    /** Native size of a float in bytes. */
    public static final int FLOAT_SIZE = Float.SIZE / 8;

    /** Native size of a double in bytes. */
    public static final int DOUBLE_SIZE = Double.SIZE / 8;

    /**
     * Process the Java class.
     *
     * <p>
     * This will register native handlers for native methods.
     * Handles field getters, setters, checkers and C functions.
     */
    @Override
    protected void doRegistration(Class<?> type) {
        registerClass(type);
    }

    /**
     * CRuntime constructor.
     *
     * <p>
     * Sets the default mappers and calls initialization.
     */
    private CRuntime() {
        super(CObjectMapper.class, CStringMapper.class, CCallbackMapper.class);
        initialize(this);
    }

    /**
     * Releaser for C pointers.
     *
     * <p>
     * Will call free on the pointer.
     */
    private static Releaser strongReleaser = new Releaser() {
        @Override
        public void release(long peer) {
            free(peer);
        }

        @Override
        public boolean ifFinalizedExternally() {
            return false;
        }
    };

    /**
     * Creates a {@link Pointer} object.
     *
     * <p>
     * If {@code owned == true}, then it will create a {@link Pointer} with strongReleaser as its
     * releaser.
     *
     * @param peer The C pointer
     * @param owned Is it a strong ownership?
     * @return The created {@link Pointer} object
     */
    public static Pointer createStrongPointer(long peer, boolean owned) {
        return new Pointer(peer, owned ? strongReleaser : null);
    }

    /**
     * Disposes a callback.
     *
     * <p>
     * Removes the cached callback for a Java instance and does cleanup.
     *
     * @param callback The Java instance
     */
    public void tryToDisposeCallback(Object callback) {
        Object cache = NatJ.getAndRemoveObjectCacheForRuntime(this.getClass(), callback);
        CCallbackMapper.CallbackInfo[] infos;
        if (cache instanceof CCallbackMapper.CallbackInfo[]) {
            infos = (CCallbackMapper.CallbackInfo[]) cache;
        } else {
            Map<Object, CCallbackMapper.CallbackInfo[]> map = ((CCallbackMapper) callbackMapper)
                    .instance2callbacks;
            synchronized (map) {
                infos = map.remove(callback);
            }
        }

        if (infos != null) {
            Map<Long, Long> map = ((CCallbackMapper) callbackMapper).callback2extras;
            for (CCallbackMapper.CallbackInfo info : infos) {
                if (info != null) {
                    synchronized (map) {
                        map.remove(info.callback.getPeer());
                    }
                    deallocNativeCallback(info.extra);
                }
            }
        }
    }

    /**
     * Casts a void pointer to an opaque pointer.
     *
     * @param <T> The opaque pointer type class to cast to
     * @param ptr The void pointer we want to cast
     * @param cls The desired type of the class
     * @return The new opaque pointer
     */
    @SuppressWarnings("unchecked")
    public static <T extends OpaquePtr> T cast(ConstVoidPtr ptr, java.lang.Class<T> cls) {
        JavaObjectConstructionInfo toOpqquePtrInfo =
                NatJ.buildJavaObjectConstructionInfo(null, cls, null, null, null, false, false,
                        false);

        return (T) NatJ.toJava(ptr.getPeer().getPeer(), toOpqquePtrInfo);
    }

    /**
     * Casts an opaque pointer to a void pointer.
     *
     * @param ptr The opaque pointer we want to cast
     * @return The new void pointer
     */
    public static VoidPtr cast(OpaquePtr ptr) {
        return PtrFactory.newWeakVoidPtr(ptr.getPeer().getPeer());
    }

    /**
     * Returns the default unbox policy for variadic arguments.
     *
     * <p>
     * For C Runtime the policy is unboxing, because this runtime does
     * not have any object types.
     *
     * @return The default unbox policy.
     */
    @Override
    public byte getDefaultUnboxPolicy() {
        return Variadic.Unbox;
    }

    // -------------- Native methods -------------- //

    /**
     * Initializes the CRuntime.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param instance CRuntime singleton object
     */
    private static native void initialize(CRuntime instance);

    /**
     * Processes a class.
     *
     * <p>
     * If it is a structure then process every fields at first.
     * If it has any C functions, then they will be processed and registered with JNI.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param type The Java type we want to process
     */
    private native void registerClass(Class<?> type);

    /**
     * Constructs a Java string from a C string.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param pointer The C string
     * @return The Java string
     */
    public static native String createJavaString(long pointer);

    /**
     * Constructs a C string from a Java string.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param string The Java string
     * @return The native string
     */
    public static native long createNativeString(String string);

    /**
     * Method for using C malloc function from java.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param size the size to allocate
     * @return The pointer
     */
    private static native long malloc(long size);

    /**
     * Method for using C free function from java.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param peer The memory space to release
     */
    public static native void free(long peer);

    /**
     * Constructs a native string array from a Java string array.
     *
     * <p>
     * The C string array will be constructed into one continuous memory block:
     * {@code <ptr1>|<ptr2>|...|<first char of first string>|<second char of first string>|...|
     * <first char of second string>|...} Because of this we can release every C string array we
     * created by doing so with only one free call.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param strings Java string array we want to convert
     * @return The native string array
     */
    public static native long createNativeStringArray(String[] strings);

    /**
     * Allocate one continuous memory block with sufficient size for containing {@code count}
     * instances of {@code type}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param type Java class of native object
     * @param count Count of native object
     * @return The pointer of the newly allocated space
     */
    public static native long allocNativeObject(Class<? extends NativeObject> type, int count);

    /**
     * Returns the native size of a NativeObject.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param type The NativeObject we want to get the size of
     * @return The size of the NativeObject
     */
    public static native long sizeOfNativeObject(Class<? extends NativeObject> type);

    /**
     * Copies one instance of {@code type} from {@code src} to {@code dst}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param type The type of the native object
     * @param dst The pointer that points to the memory space to where we want to copy
     * @param src The pointer that points to the memory space from where we want to copy
     */
    public static native void copyNativeObject(Class<? extends NativeObject> type, long dst,
            long src);

    /**
     * Copies the native content of the NativeObject array to a new memory space.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param <T> The element type of the Java array
     * @param array The array we want to copy
     * @return The pointer of the new native array
     */
    public static native <T extends NativeObject> long copyNativeObjectArray(T[] array);

    /**
     * Returns the pointer size for the current architecture.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @return The pointer size
     */
    public static native int sizeOfPointer();

    /**
     * Returns the long size for the current architecture.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @return The long size
     */
    public static native int sizeOfLong();

    /**
     * Returns the wchar_t size for the current architecture.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @return The wchar_t size
     */
    public static native int sizeOfWCharT();

    /**
     * Allocates space for {@code count} pointer.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param count The length of the array we want to create
     * @return The pointer of the allocated space
     */
    public static native long allocPointer(int count);

    /**
     * Copies the native content of the {@code array} to {@code dst}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param dst Where we want to copy
     * @param array The array we want to copy
     */
    public static native void copyPointerArray(long dst, long[] array);

    /**
     * Loads a pointer from {@code ptr} with index {@code idx}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param ptr The pointer from where we want to load
     * @param idx The index we want to offset with
     * @return The loaded pointer.
     */
    public static native long loadPointer(long ptr, int idx);

    /**
     * Stores {@code value} to {@code ptr} with index {@code idx}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param dst The pointer to where we want to store
     * @param idx The index we want to offset with
     * @param value The value we want to store
     */
    public static native void storePointer(long dst, int idx, long value);

    /**
     * Construct a native callback from a Java method.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param instance The Java instance we want to create native callback for
     * @param method The Java method we want to create native callback from
     * @param extra The out parameter used for storing extra informations
     * @return The native callback
     */
    public static native long allocNativeCallback(Object instance, Method method, long[] extra);

    /**
     * Releases a native callback specified by it's extra.
     *
     * <p>
     * Works only with callbacks we create with
     * {@link #allocNativeCallback(Object, Method, long[])}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param extra Extra information needed for the callback
     */
    public static native void deallocNativeCallback(long extra);

    /**
     * Returns a Java instance from a given callback specified by it's extra.
     *
     * <p>
     * Works only with callbacks we create with
     * {@link #allocNativeCallback(Object, Method, long[])}.
     *
     * <p>
     * Also documented in CRuntime.h
     *
     * @param extra Extra info pointer
     * @return The Java instance
     */
    public static native Object createJavaCallback(long extra);

    /**
     * Bride for native memset.
     *
     * <p>
     * Also documented in CRuntime.java
     *
     * @param dst The pointer we want to do memset on
     * @param idx The offset of the memsetting
     * @param length The length of the memsetting
     * @param value The value by we want to overwrite
     */
    public static native void memset(long dst, int idx, int length, byte value);

    /**
     * Bride for native memset.
     *
     * @param ptr the pointer we want to memset
     * @param idx The offset of the memsetting
     * @param length The length of the memsetting
     * @param value The value by we want to overwrite
     */
    public static void memset(VoidPtr ptr, int idx, int length, byte value) {
        memset(ptr.getPeer().getPeer(), idx, length, value);
    }

    /**
     * Bride for native memcpy.
     *
     * <p>
     * Also documented in CRuntime.java
     *
     * @param dst the pointer we want to copy to
     * @param src the pointer we want to copy from
     * @param length number of bytes to copy
     */
    public static native void memcpy(long dst, long src, int length);

    /**
     * Bride for native memcpy.
     *
     * @param dst the pointer we want to copy to
     * @param src the pointer we want to copy from
     * @param length number of bytes to copy
     */
    public static void memcpy(VoidPtr dst, ConstVoidPtr src, int length) {
        memcpy(dst.getPeer().getPeer(), src.getPeer().getPeer(), length);
    }

    // ---------------------- Primitive accessors ---------------------- //

    /**
     * Allocates boolean array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocBoolean(int count);

    /**
     * Copies boolean array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyBooleanArray(long dst, int startOffset, boolean[] array,
            int buffOffset, int length);

    /**
     * Copies boolean array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeBooleanArray(boolean[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native boolean array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeBooleanArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a boolean.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded boolean value
     */
    public static native boolean loadBoolean(long src, int idx);

    /**
     * Stores a boolean value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The boolean value we want to store
     */
    public static native void storeBoolean(long dst, int idx, boolean value);

    /**
     * Creates a boolean array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native boolean[] createBooleanArray(long src, int length);

    /**
     * Gets the native pointer from a CharBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getCharBufferPointer(CharBuffer buffer);

    /**
     * Allocates char array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocChar(int count);

    /**
     * Copies char array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyCharArray(long dst, int startOffset, char[] array,
            int buffOffset, int length);

    /**
     * Copies char array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeCharArray(char[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native char array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeCharArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a char.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded char value
     */
    public static native char loadChar(long src, int idx);

    /**
     * Stores a char value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The char value we want to store
     */
    public static native void storeChar(long dst, int idx, char value);

    /**
     * Creates a char array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native char[] createCharArray(long src, int length);

    /**
     * Gets the native pointer from a ByteBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getByteBufferPointer(ByteBuffer buffer);

    /**
     * Allocates byte array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocByte(int count);

    /**
     * Copies byte array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyByteArray(long dst, int startOffset, byte[] array,
            int buffOffset, int length);

    /**
     * Copies byte array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeByteArray(byte[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native byte array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeByteArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a byte.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded byte value
     */
    public static native byte loadByte(long src, int idx);

    /**
     * Stores a byte value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The byte value we want to store
     */
    public static native void storeByte(long dst, int idx, byte value);

    /**
     * Creates a byte array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native byte[] createByteArray(long src, int length);

    /**
     * Gets the native pointer from a ShortBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getShortBufferPointer(ShortBuffer buffer);

    /**
     * Allocates short array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocShort(int count);

    /**
     * Copies short array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyShortArray(long dst, int startOffset, short[] array,
            int buffOffset, int length);

    /**
     * Copies short array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeShortArray(short[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native short array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeShortArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a short.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded short value
     */
    public static native short loadShort(long src, int idx);

    /**
     * Stores a short value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The short value we want to store
     */
    public static native void storeShort(long dst, int idx, short value);

    /**
     * Creates a short array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native short[] createShortArray(long src, int length);

    /**
     * Gets the native pointer from an IntBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getIntBufferPointer(IntBuffer buffer);

    /**
     * Allocates int array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocInt(int count);

    /**
     * Copies int array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyIntArray(long dst, int startOffset, int[] array, int buffOffset,
            int length);

    /**
     * Copies int array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeIntArray(int[] dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Copies native int array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeIntArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads an int.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded int value
     */
    public static native int loadInt(long src, int idx);

    /**
     * Stores an int value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The int value we want to store
     */
    public static native void storeInt(long dst, int idx, int value);

    /**
     * Creates a int array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native int[] createIntArray(long src, int length);

    /**
     * Gets the native pointer from a LongBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getLongBufferPointer(LongBuffer buffer);

    /**
     * Allocates long array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocLong(int count);

    /**
     * Copies long array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyLongArray(long dst, int startOffset, long[] array,
            int buffOffset, int length);

    /**
     * Copies long array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeLongArray(long[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native long array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeLongArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a long.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded long value
     */
    public static native long loadLong(long src, int idx);

    /**
     * Stores a long value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The long value we want to store
     */
    public static native void storeLong(long dst, int idx, long value);

    /**
     * Creates a long array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native long[] createLongArray(long src, int length);

    /**
     * Gets the native pointer from a FloatBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getFloatBufferPointer(FloatBuffer buffer);

    /**
     * Allocates float array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocFloat(int count);

    /**
     * Copies float array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFloatArray(long dst, int startOffset, float[] array,
            int buffOffset, int length);

    /**
     * Copies float array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeFloatArray(float[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native float array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeFloatArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a float.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded float value
     */
    public static native float loadFloat(long src, int idx);

    /**
     * Stores a float value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The float value we want to store
     */
    public static native void storeFloat(long dst, int idx, float value);

    /**
     * Creates a float array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native float[] createFloatArray(long src, int length);

    /**
     * Gets the native pointer from a DoubleBuffer.
     *
     * @param buffer The buffer
     * @return The pointer
     */
    public static native long getDoubleBufferPointer(DoubleBuffer buffer);

    /**
     * Allocates double array of size {@code count}.
     *
     * @param count The length of the array
     * @return The pointer
     */
    public static native long allocDouble(int count);

    /**
     * Copies double array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyDoubleArray(long dst, int startOffset, double[] array,
            int buffOffset, int length);

    /**
     * Copies double array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyFromNativeDoubleArray(double[] dst, int startOffset,
            long array, int buffOffset, int length);

    /**
     * Copies native double array.
     *
     * @param dst The pointer pointing to where we want to copy
     * @param startOffset The offset for the destination
     * @param array The array we want to copy
     * @param buffOffset The offset of the pointer we want to copy
     * @param length The length of the copy
     */
    public static native void copyNativeDoubleArray(long dst, int startOffset, long array,
            int buffOffset, int length);

    /**
     * Loads a double.
     *
     * @param src From we want to load
     * @param idx Index of the loading
     * @return The loaded double value
     */
    public static native double loadDouble(long src, int idx);

    /**
     * Stores a double value.
     *
     * @param dst The pointer pointing to where we want to store
     * @param idx The index of the storing
     * @param value The double value we want to store
     */
    public static native void storeDouble(long dst, int idx, double value);

    /**
     * Creates a double array from a pointer.
     *
     * @param src The pointer we want to create Java array object from
     * @param length The length of the array
     * @return The Java array.
     */
    public static native double[] createDoubleArray(long src, int length);

}
