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
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NLongPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.NULongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.WCharTPtr;
import org.moe.natj.objc.ObjCObject;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

/**
 * Factory for pointer objects.
 */
public final class PtrFactory {

    private PtrFactory() {

    }

    /**
     * Create a new pointer from a {@link Buffer} object.
     *
     * @param buffer
     *            {@link Buffer} object
     * @return null if buffer is null, new pointer otherwise
     */
    public static final VoidPtr newPtr(Buffer buffer) {
        if (buffer == null) {
            return null;
        }
        if (buffer instanceof ByteBuffer) {
            return newBytePtr((ByteBuffer) buffer);
        } else if (buffer instanceof CharBuffer) {
            return newCharPtr((CharBuffer) buffer);
        } else if (buffer instanceof DoubleBuffer) {
            return newDoublePtr((DoubleBuffer) buffer);
        } else if (buffer instanceof FloatBuffer) {
            return newFloatPtr((FloatBuffer) buffer);
        } else if (buffer instanceof IntBuffer) {
            return newIntPtr((IntBuffer) buffer);
        } else if (buffer instanceof LongBuffer) {
            return newLongPtr((LongBuffer) buffer);
        } else if (buffer instanceof ShortBuffer) {
            return newShortPtr((ShortBuffer) buffer);
        } else {
            throw new IllegalArgumentException(
                    "Could not create offset reference from a non-primitive buffer!");
        }
    }

    /**
     * Create a new void pointer with an address.
     *
     * @param peer
     *            address of the pointer
     * @return new void pointer with an address
     */
    public static final VoidPtr newVoidPtr(long peer) {
        return new VoidPtrImpl(peer, true, null);
    }

    /**
     * Create a new weak void pointer with an address. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param peer
     *            address of the pointer
     * @return new void pointer with an address
     */
    public static final VoidPtr newWeakVoidPtr(long peer) {
        return new VoidPtrImpl(peer, false, null);
    }

    /**
     * Create a new custom char pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created char pointer
     */
    public static final CharPtr newCharPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new CharPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new CharPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new char pointer from a java.nio.CharBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final CharPtr newCharPtr(CharBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new CharPtrImpl(CRuntime.getCharBufferPointer(buffer), buffer);
    }

    /**
     * Create a new char reference.
     *
     * @return newly created char reference
     */
    public static final CharPtr newCharReference() {
        return new CharPtrImpl(1, true);
    }

    /**
     * Create a new char reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created char reference
     */
    public static final CharPtr newCharReference(char value) {
        CharPtr ptr = new CharPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new char pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created char array
     */
    public static final CharPtr newCharArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new CharPtrImpl(capacity, true);
    }

    /**
     * Create a new char pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created char array
     */
    public static final CharPtr newCharArray(int capacity, char value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        CharPtr pointer = new CharPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new char pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created char array
     */
    public static final CharPtr newCharArray(char[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        CharPtr pointer = new CharPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new char reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created char reference
     */
    public static final CharPtr newWeakCharReference() {
        return new CharPtrImpl(1, false);
    }

    /**
     * Create a new char reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created char reference
     */
    public static final CharPtr newWeakCharReference(char value) {
        CharPtr ptr = new CharPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new char pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created char array
     */
    public static final CharPtr newWeakCharArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new CharPtrImpl(capacity, false);
    }

    /**
     * Create a new char pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created char array
     */
    public static final CharPtr newWeakCharArray(int capacity, char value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        CharPtr pointer = new CharPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new char pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created char array
     */
    public static final CharPtr newWeakCharArray(char[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        CharPtr pointer = new CharPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded char reference.
     *
     * @return newly created char reference
     */
    public static final CharPtr newGuardedCharReference() {
        return newCharReference().getGuarded(1);
    }

    /**
     * Create a new guarded char reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created char reference
     */
    public static final CharPtr newGuardedCharReference(char value) {
        return newCharReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded char pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created char array
     */
    public static final CharPtr newGuardedCharArray(int capacity) {
        return newCharArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded char pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created char array
     */
    public static final CharPtr newGuardedCharArray(int capacity, char value) {
        return newCharArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded char pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created char array
     */
    public static final CharPtr newGuardedCharArray(char[] buffer) {
        return newCharArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded char reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created char reference
     */
    public static final CharPtr newGuardedWeakCharReference() {
        return newWeakCharReference().getGuarded(1);
    }

    /**
     * Create a new guarded char reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created char reference
     */
    public static final CharPtr newGuardedWeakCharReference(char value) {
        return newWeakCharReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded char pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created char array
     */
    public static final CharPtr newGuardedWeakCharArray(int capacity) {
        return newWeakCharArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded char pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created char array
     */
    public static final CharPtr newGuardedWeakCharArray(int capacity, char value) {
        return newWeakCharArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded char pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created char array
     */
    public static final CharPtr newGuardedWeakCharArray(char[] buffer) {
        return newWeakCharArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom boolean pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created boolean pointer
     */
    public static final BoolPtr newBoolPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new BoolPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new BoolPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new boolean reference.
     *
     * @return newly created boolean reference
     */
    public static final BoolPtr newBoolReference() {
        return new BoolPtrImpl(1, true);
    }

    /**
     * Create a new boolean reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created boolean reference
     */
    public static final BoolPtr newBoolReference(boolean value) {
        BoolPtr ptr = new BoolPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new boolean pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created boolean array
     */
    public static final BoolPtr newBoolArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new BoolPtrImpl(capacity, true);
    }

    /**
     * Create a new boolean pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created boolean array
     */
    public static final BoolPtr newBoolArray(int capacity, boolean value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        BoolPtr pointer = new BoolPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new boolean pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created boolean array
     */
    public static final BoolPtr newBoolArray(boolean[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        BoolPtr pointer = new BoolPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new boolean reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @return newly created boolean reference
     */
    public static final BoolPtr newWeakBoolReference() {
        return new BoolPtrImpl(1, false);
    }

    /**
     * Create a new boolean reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created boolean reference
     */
    public static final BoolPtr newWeakBoolReference(boolean value) {
        BoolPtr ptr = new BoolPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new boolean pointer with a specified capacity. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created boolean array
     */
    public static final BoolPtr newWeakBoolArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new BoolPtrImpl(capacity, false);
    }

    /**
     * Create a new boolean pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created boolean array
     */
    public static final BoolPtr newWeakBoolArray(int capacity, boolean value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        BoolPtr pointer = new BoolPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new boolean pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created boolean array
     */
    public static final BoolPtr newWeakBoolArray(boolean[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        BoolPtr pointer = new BoolPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded boolean reference.
     *
     * @return newly created boolean reference
     */
    public static final BoolPtr newGuardedBoolReference() {
        return newBoolReference().getGuarded(1);
    }

    /**
     * Create a new guarded boolean reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created boolean reference
     */
    public static final BoolPtr newGuardedBoolReference(boolean value) {
        return newBoolReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded boolean pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedBoolArray(int capacity) {
        return newBoolArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded boolean pointer with a specified capacity and
     * default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedBoolArray(int capacity, boolean value) {
        return newBoolArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded boolean pointer with buffer as it's initial
     * contents, this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedBoolArray(boolean[] buffer) {
        return newBoolArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded boolean reference. The freeing of the allocated
     * memory will not happen automatically!
     *
     * @return newly created boolean reference
     */
    public static final BoolPtr newGuardedWeakBoolReference() {
        return newWeakBoolReference().getGuarded(1);
    }

    /**
     * Create a new guarded boolean reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created boolean reference
     */
    public static final BoolPtr newGuardedWeakBoolReference(boolean value) {
        return newWeakBoolReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded boolean pointer with a specified capacity. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedWeakBoolArray(int capacity) {
        return newWeakBoolArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded boolean pointer with a specified capacity and
     * default value. The freeing of the allocated memory will not happen
     * automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedWeakBoolArray(int capacity, boolean value) {
        return newWeakBoolArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded boolean pointer with buffer as it's initial
     * contents, this will completely copy the buffer. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created boolean array
     */
    public static final BoolPtr newGuardedWeakBoolArray(boolean[] buffer) {
        return newWeakBoolArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom byte pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created byte pointer
     */
    public static final BytePtr newBytePtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new BytePtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new BytePtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new byte pointer from a java.nio.ByteBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final BytePtr newBytePtr(ByteBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new BytePtrImpl(CRuntime.getByteBufferPointer(buffer), buffer);
    }

    /**
     * Create a new byte reference.
     *
     * @return newly created byte reference
     */
    public static final BytePtr newByteReference() {
        return new BytePtrImpl(1, true);
    }

    /**
     * Create a new byte reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created byte reference
     */
    public static final BytePtr newByteReference(byte value) {
        BytePtr ptr = new BytePtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new byte pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created byte array
     */
    public static final BytePtr newByteArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new BytePtrImpl(capacity, true);
    }

    /**
     * Create a new byte pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created byte array
     */
    public static final BytePtr newByteArray(int capacity, byte value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        BytePtr pointer = new BytePtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new byte pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created byte array
     */
    public static final BytePtr newByteArray(byte[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        BytePtr pointer = new BytePtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new byte reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created byte reference
     */
    public static final BytePtr newWeakByteReference() {
        return new BytePtrImpl(1, false);
    }

    /**
     * Create a new byte reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created byte reference
     */
    public static final BytePtr newWeakByteReference(byte value) {
        BytePtr ptr = new BytePtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new byte pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created byte array
     */
    public static final BytePtr newWeakByteArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new BytePtrImpl(capacity, false);
    }

    /**
     * Create a new byte pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created byte array
     */
    public static final BytePtr newWeakByteArray(int capacity, byte value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        BytePtr pointer = new BytePtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new byte pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created byte array
     */
    public static final BytePtr newWeakByteArray(byte[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        BytePtr pointer = new BytePtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded byte reference.
     *
     * @return newly created byte reference
     */
    public static final BytePtr newGuardedByteReference() {
        return newByteReference().getGuarded(1);
    }

    /**
     * Create a new guarded byte reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created byte reference
     */
    public static final BytePtr newGuardedByteReference(byte value) {
        return newByteReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded byte pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created byte array
     */
    public static final BytePtr newGuardedByteArray(int capacity) {
        return newByteArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded byte pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created byte array
     */
    public static final BytePtr newGuardedByteArray(int capacity, byte value) {
        return newByteArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded byte pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created byte array
     */
    public static final BytePtr newGuardedByteArray(byte[] buffer) {
        return newByteArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded byte reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created byte reference
     */
    public static final BytePtr newGuardedWeakByteReference() {
        return newWeakByteReference().getGuarded(1);
    }

    /**
     * Create a new guarded byte reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created byte reference
     */
    public static final BytePtr newGuardedWeakByteReference(byte value) {
        return newWeakByteReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded byte pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created byte array
     */
    public static final BytePtr newGuardedWeakByteArray(int capacity) {
        return newWeakByteArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded byte pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created byte array
     */
    public static final BytePtr newGuardedWeakByteArray(int capacity, byte value) {
        return newWeakByteArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded byte pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created byte array
     */
    public static final BytePtr newGuardedWeakByteArray(byte[] buffer) {
        return newWeakByteArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom short pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created short pointer
     */
    public static final ShortPtr newShortPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new ShortPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new ShortPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new short pointer from a java.nio.ShortBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final ShortPtr newShortPtr(ShortBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new ShortPtrImpl(CRuntime.getShortBufferPointer(buffer), buffer);
    }

    /**
     * Create a new short reference.
     *
     * @return newly created short reference
     */
    public static final ShortPtr newShortReference() {
        return new ShortPtrImpl(1, true);
    }

    /**
     * Create a new short reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created short reference
     */
    public static final ShortPtr newShortReference(short value) {
        ShortPtr ptr = new ShortPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new short pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created short array
     */
    public static final ShortPtr newShortArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ShortPtrImpl(capacity, true);
    }

    /**
     * Create a new short pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created short array
     */
    public static final ShortPtr newShortArray(int capacity, short value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        ShortPtr pointer = new ShortPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new short pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created short array
     */
    public static final ShortPtr newShortArray(short[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        ShortPtr pointer = new ShortPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new short reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @return newly created short reference
     */
    public static final ShortPtr newWeakShortReference() {
        return new ShortPtrImpl(1, false);
    }

    /**
     * Create a new short reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created short reference
     */
    public static final ShortPtr newWeakShortReference(short value) {
        ShortPtr ptr = new ShortPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new short pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created short array
     */
    public static final ShortPtr newWeakShortArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ShortPtrImpl(capacity, false);
    }

    /**
     * Create a new short pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created short array
     */
    public static final ShortPtr newWeakShortArray(int capacity, short value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        ShortPtr pointer = new ShortPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new short pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created short array
     */
    public static final ShortPtr newWeakShortArray(short[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        ShortPtr pointer = new ShortPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded short reference.
     *
     * @return newly created short reference
     */
    public static final ShortPtr newGuardedShortReference() {
        return newShortReference().getGuarded(1);
    }

    /**
     * Create a new guarded short reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created short reference
     */
    public static final ShortPtr newGuardedShortReference(short value) {
        return newShortReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded short pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created short array
     */
    public static final ShortPtr newGuardedShortArray(int capacity) {
        return newShortArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded short pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created short array
     */
    public static final ShortPtr newGuardedShortArray(int capacity, short value) {
        return newShortArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded short pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created short array
     */
    public static final ShortPtr newGuardedShortArray(short[] buffer) {
        return newShortArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded short reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created short reference
     */
    public static final ShortPtr newGuardedWeakShortReference() {
        return newWeakShortReference().getGuarded(1);
    }

    /**
     * Create a new guarded short reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created short reference
     */
    public static final ShortPtr newGuardedWeakShortReference(short value) {
        return newWeakShortReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded short pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created short array
     */
    public static final ShortPtr newGuardedWeakShortArray(int capacity) {
        return newWeakShortArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded short pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created short array
     */
    public static final ShortPtr newGuardedWeakShortArray(int capacity, short value) {
        return newWeakShortArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded short pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created short array
     */
    public static final ShortPtr newGuardedWeakShortArray(short[] buffer) {
        return newWeakShortArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom int pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created int pointer
     */
    public static final IntPtr newIntPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new IntPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new IntPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new int pointer from a java.nio.IntBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final IntPtr newIntPtr(IntBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new IntPtrImpl(CRuntime.getIntBufferPointer(buffer), buffer);
    }

    /**
     * Create a new int reference.
     *
     * @return newly created int reference
     */
    public static final IntPtr newIntReference() {
        return new IntPtrImpl(1, true);
    }

    /**
     * Create a new int reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created int reference
     */
    public static final IntPtr newIntReference(int value) {
        IntPtr ptr = new IntPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new int pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final IntPtr newIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new IntPtrImpl(capacity, true);
    }

    /**
     * Create a new int pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final IntPtr newIntArray(int capacity, int value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        IntPtr pointer = new IntPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new int pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final IntPtr newIntArray(int[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        IntPtr pointer = new IntPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new int reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created int reference
     */
    public static final IntPtr newWeakIntReference() {
        return new IntPtrImpl(1, false);
    }

    /**
     * Create a new int reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created int reference
     */
    public static final IntPtr newWeakIntReference(int value) {
        IntPtr ptr = new IntPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new int pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final IntPtr newWeakIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new IntPtrImpl(capacity, false);
    }

    /**
     * Create a new int pointer with a specified capacity and default value. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final IntPtr newWeakIntArray(int capacity, int value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        IntPtr pointer = new IntPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new int pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final IntPtr newWeakIntArray(int[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        IntPtr pointer = new IntPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded int reference.
     *
     * @return newly created int reference
     */
    public static final IntPtr newGuardedIntReference() {
        return newIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded int reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created int reference
     */
    public static final IntPtr newGuardedIntReference(int value) {
        return newIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded int pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final IntPtr newGuardedIntArray(int capacity) {
        return newIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded int pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final IntPtr newGuardedIntArray(int capacity, int value) {
        return newIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded int pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final IntPtr newGuardedIntArray(int[] buffer) {
        return newIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded int reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created int reference
     */
    public static final IntPtr newGuardedWeakIntReference() {
        return newWeakIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded int reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created int reference
     */
    public static final IntPtr newGuardedWeakIntReference(int value) {
        return newWeakIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded int pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final IntPtr newGuardedWeakIntArray(int capacity) {
        return newWeakIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded int pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final IntPtr newGuardedWeakIntArray(int capacity, int value) {
        return newWeakIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded int pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final IntPtr newGuardedWeakIntArray(int[] buffer) {
        return newWeakIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom long pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created long pointer
     */
    public static final LongPtr newLongPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new LongPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new LongPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new long pointer from a java.nio.LongBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final LongPtr newLongPtr(LongBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new LongPtrImpl(CRuntime.getLongBufferPointer(buffer), buffer);
    }

    /**
     * Create a new long reference.
     *
     * @return newly created long reference
     */
    public static final LongPtr newLongReference() {
        return new LongPtrImpl(1, true);
    }

    /**
     * Create a new long reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created long reference
     */
    public static final LongPtr newLongReference(long value) {
        LongPtr ptr = new LongPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new long pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created long array
     */
    public static final LongPtr newLongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new LongPtrImpl(capacity, true);
    }

    /**
     * Create a new long pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created long array
     */
    public static final LongPtr newLongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        LongPtr pointer = new LongPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new long pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created long array
     */
    public static final LongPtr newLongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        LongPtr pointer = new LongPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new long reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created long reference
     */
    public static final LongPtr newWeakLongReference() {
        return new LongPtrImpl(1, false);
    }

    /**
     * Create a new long reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created long reference
     */
    public static final LongPtr newWeakLongReference(long value) {
        LongPtr ptr = new LongPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new long pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created long array
     */
    public static final LongPtr newWeakLongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new LongPtrImpl(capacity, false);
    }

    /**
     * Create a new long pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created long array
     */
    public static final LongPtr newWeakLongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        LongPtr pointer = new LongPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new long pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created long array
     */
    public static final LongPtr newWeakLongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        LongPtr pointer = new LongPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded long reference.
     *
     * @return newly created long reference
     */
    public static final LongPtr newGuardedLongReference() {
        return newLongReference().getGuarded(1);
    }

    /**
     * Create a new guarded long reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created long reference
     */
    public static final LongPtr newGuardedLongReference(long value) {
        return newLongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded long pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created long array
     */
    public static final LongPtr newGuardedLongArray(int capacity) {
        return newLongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded long pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created long array
     */
    public static final LongPtr newGuardedLongArray(int capacity, long value) {
        return newLongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded long pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created long array
     */
    public static final LongPtr newGuardedLongArray(long[] buffer) {
        return newLongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded long reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created long reference
     */
    public static final LongPtr newGuardedWeakLongReference() {
        return newWeakLongReference().getGuarded(1);
    }

    /**
     * Create a new guarded long reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created long reference
     */
    public static final LongPtr newGuardedWeakLongReference(long value) {
        return newWeakLongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded long pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created long array
     */
    public static final LongPtr newGuardedWeakLongArray(int capacity) {
        return newWeakLongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded long pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created long array
     */
    public static final LongPtr newGuardedWeakLongArray(int capacity, long value) {
        return newWeakLongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded long pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created long array
     */
    public static final LongPtr newGuardedWeakLongArray(long[] buffer) {
        return newWeakLongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom float pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created float pointer
     */
    public static final FloatPtr newFloatPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new FloatPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new FloatPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new float pointer from a java.nio.FloatBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final FloatPtr newFloatPtr(FloatBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new FloatPtrImpl(CRuntime.getFloatBufferPointer(buffer), buffer);
    }

    /**
     * Create a new float reference.
     *
     * @return newly created float reference
     */
    public static final FloatPtr newFloatReference() {
        return new FloatPtrImpl(1, true);
    }

    /**
     * Create a new float reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created float reference
     */
    public static final FloatPtr newFloatReference(float value) {
        FloatPtr ptr = new FloatPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new float pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created float array
     */
    public static final FloatPtr newFloatArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new FloatPtrImpl(capacity, true);
    }

    /**
     * Create a new float pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created float array
     */
    public static final FloatPtr newFloatArray(int capacity, float value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        FloatPtr pointer = new FloatPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new float pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created float array
     */
    public static final FloatPtr newFloatArray(float[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        FloatPtr pointer = new FloatPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new float reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @return newly created float reference
     */
    public static final FloatPtr newWeakFloatReference() {
        return new FloatPtrImpl(1, false);
    }

    /**
     * Create a new float reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created float reference
     */
    public static final FloatPtr newWeakFloatReference(float value) {
        FloatPtr ptr = new FloatPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new float pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created float array
     */
    public static final FloatPtr newWeakFloatArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new FloatPtrImpl(capacity, false);
    }

    /**
     * Create a new float pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created float array
     */
    public static final FloatPtr newWeakFloatArray(int capacity, float value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        FloatPtr pointer = new FloatPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new float pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created float array
     */
    public static final FloatPtr newWeakFloatArray(float[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        FloatPtr pointer = new FloatPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded float reference.
     *
     * @return newly created float reference
     */
    public static final FloatPtr newGuardedFloatReference() {
        return newFloatReference().getGuarded(1);
    }

    /**
     * Create a new guarded float reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created float reference
     */
    public static final FloatPtr newGuardedFloatReference(float value) {
        return newFloatReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded float pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created float array
     */
    public static final FloatPtr newGuardedFloatArray(int capacity) {
        return newFloatArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded float pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created float array
     */
    public static final FloatPtr newGuardedFloatArray(int capacity, float value) {
        return newFloatArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded float pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created float array
     */
    public static final FloatPtr newGuardedFloatArray(float[] buffer) {
        return newFloatArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded float reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created float reference
     */
    public static final FloatPtr newGuardedWeakFloatReference() {
        return newWeakFloatReference().getGuarded(1);
    }

    /**
     * Create a new guarded float reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created float reference
     */
    public static final FloatPtr newGuardedWeakFloatReference(float value) {
        return newWeakFloatReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded float pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created float array
     */
    public static final FloatPtr newGuardedWeakFloatArray(int capacity) {
        return newWeakFloatArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded float pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created float array
     */
    public static final FloatPtr newGuardedWeakFloatArray(int capacity, float value) {
        return newWeakFloatArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded float pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created float array
     */
    public static final FloatPtr newGuardedWeakFloatArray(float[] buffer) {
        return newWeakFloatArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom double pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created double pointer
     */
    public static final DoublePtr newDoublePtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new DoublePtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new DoublePtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new double pointer from a java.nio.DoubleBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final DoublePtr newDoublePtr(DoubleBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new DoublePtrImpl(CRuntime.getDoubleBufferPointer(buffer), buffer);
    }

    /**
     * Create a new double reference.
     *
     * @return newly created double reference
     */
    public static final DoublePtr newDoubleReference() {
        return new DoublePtrImpl(1, true);
    }

    /**
     * Create a new double reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created double reference
     */
    public static final DoublePtr newDoubleReference(double value) {
        DoublePtr ptr = new DoublePtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new double pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created double array
     */
    public static final DoublePtr newDoubleArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new DoublePtrImpl(capacity, true);
    }

    /**
     * Create a new double pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created double array
     */
    public static final DoublePtr newDoubleArray(int capacity, double value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        DoublePtr pointer = new DoublePtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new double pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created double array
     */
    public static final DoublePtr newDoubleArray(double[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        DoublePtr pointer = new DoublePtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new double reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @return newly created double reference
     */
    public static final DoublePtr newWeakDoubleReference() {
        return new DoublePtrImpl(1, false);
    }

    /**
     * Create a new double reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created double reference
     */
    public static final DoublePtr newWeakDoubleReference(double value) {
        DoublePtr ptr = new DoublePtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new double pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created double array
     */
    public static final DoublePtr newWeakDoubleArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new DoublePtrImpl(capacity, false);
    }

    /**
     * Create a new double pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created double array
     */
    public static final DoublePtr newWeakDoubleArray(int capacity, double value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        DoublePtr pointer = new DoublePtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new double pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created double array
     */
    public static final DoublePtr newWeakDoubleArray(double[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        DoublePtr pointer = new DoublePtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded double reference.
     *
     * @return newly created double reference
     */
    public static final DoublePtr newGuardedDoubleReference() {
        return newDoubleReference().getGuarded(1);
    }

    /**
     * Create a new guarded double reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created double reference
     */
    public static final DoublePtr newGuardedDoubleReference(double value) {
        return newDoubleReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded double pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created double array
     */
    public static final DoublePtr newGuardedDoubleArray(int capacity) {
        return newDoubleArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded double pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created double array
     */
    public static final DoublePtr newGuardedDoubleArray(int capacity, double value) {
        return newDoubleArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded double pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created double array
     */
    public static final DoublePtr newGuardedDoubleArray(double[] buffer) {
        return newDoubleArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded double reference. The freeing of the allocated
     * memory will not happen automatically!
     *
     * @return newly created double reference
     */
    public static final DoublePtr newGuardedWeakDoubleReference() {
        return newWeakDoubleReference().getGuarded(1);
    }

    /**
     * Create a new guarded double reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created double reference
     */
    public static final DoublePtr newGuardedWeakDoubleReference(double value) {
        return newWeakDoubleReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded double pointer with a specified capacity. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created double array
     */
    public static final DoublePtr newGuardedWeakDoubleArray(int capacity) {
        return newWeakDoubleArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded double pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created double array
     */
    public static final DoublePtr newGuardedWeakDoubleArray(int capacity, double value) {
        return newWeakDoubleArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded double pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created double array
     */
    public static final DoublePtr newGuardedWeakDoubleArray(double[] buffer) {
        return newWeakDoubleArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom NFloat pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created NFloat pointer
     */
    public static final NFloatPtr newNFloatPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new NFloatPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new NFloatPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new NFloat reference.
     *
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newNFloatReference() {
        return new NFloatPtrImpl(1, true);
    }

    /**
     * Create a new NFloat reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newNFloatReference(double value) {
        NFloatPtr ptr = new NFloatPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NFloat pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NFloat array
     */
    public static final NFloatPtr newNFloatArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NFloatPtrImpl(capacity, true);
    }

    /**
     * Create a new NFloat pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NFloat array
     */
    public static final NFloatPtr newNFloatArray(int capacity, double value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NFloatPtr pointer = new NFloatPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NFloat pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NFloat array
     */
    public static final NFloatPtr newNFloatArray(double[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NFloatPtr pointer = new NFloatPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new NFloat reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newWeakNFloatReference() {
        return new NFloatPtrImpl(1, false);
    }

    /**
     * Create a new NFloat reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newWeakNFloatReference(double value) {
        NFloatPtr ptr = new NFloatPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NFloat pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NFloat array
     */
    public static final NFloatPtr newWeakNFloatArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NFloatPtrImpl(capacity, false);
    }

    /**
     * Create a new NFloat pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NFloat array
     */
    public static final NFloatPtr newWeakNFloatArray(int capacity, double value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NFloatPtr pointer = new NFloatPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NFloat pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NFloat array
     */
    public static final NFloatPtr newWeakNFloatArray(double[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NFloatPtr pointer = new NFloatPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded NFloat reference.
     *
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newGuardedNFloatReference() {
        return newNFloatReference().getGuarded(1);
    }

    /**
     * Create a new guarded NFloat reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newGuardedNFloatReference(double value) {
        return newNFloatReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NFloat pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedNFloatArray(int capacity) {
        return newNFloatArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NFloat pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedNFloatArray(int capacity, double value) {
        return newNFloatArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NFloat pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedNFloatArray(double[] buffer) {
        return newNFloatArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded NFloat reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newGuardedWeakNFloatReference() {
        return newWeakNFloatReference().getGuarded(1);
    }

    /**
     * Create a new guarded NFloat reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NFloat reference
     */
    public static final NFloatPtr newGuardedWeakNFloatReference(double value) {
        return newWeakNFloatReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NFloat pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedWeakNFloatArray(int capacity) {
        return newWeakNFloatArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NFloat pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedWeakNFloatArray(int capacity, double value) {
        return newWeakNFloatArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NFloat pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NFloat array
     */
    public static final NFloatPtr newGuardedWeakNFloatArray(double[] buffer) {
        return newWeakNFloatArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom NUInt pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created NUInt pointer
     */
    public static final NUIntPtr newNUIntPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new NUIntPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new NUIntPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new NUInt reference.
     *
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newNUIntReference() {
        return new NUIntPtrImpl(1, true);
    }

    /**
     * Create a new NUInt reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newNUIntReference(long value) {
        NUIntPtr ptr = new NUIntPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NUInt pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NUInt array
     */
    public static final NUIntPtr newNUIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NUIntPtrImpl(capacity, true);
    }

    /**
     * Create a new NUInt pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NUInt array
     */
    public static final NUIntPtr newNUIntArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NUIntPtr pointer = new NUIntPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NUInt pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NUInt array
     */
    public static final NUIntPtr newNUIntArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NUIntPtr pointer = new NUIntPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new NUInt reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newWeakNUIntReference() {
        return new NUIntPtrImpl(1, false);
    }

    /**
     * Create a new NUInt reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newWeakNUIntReference(long value) {
        NUIntPtr ptr = new NUIntPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NUInt pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NUInt array
     */
    public static final NUIntPtr newWeakNUIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NUIntPtrImpl(capacity, false);
    }

    /**
     * Create a new NUInt pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NUInt array
     */
    public static final NUIntPtr newWeakNUIntArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NUIntPtr pointer = new NUIntPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NUInt pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NUInt array
     */
    public static final NUIntPtr newWeakNUIntArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NUIntPtr pointer = new NUIntPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded NUInt reference.
     *
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newGuardedNUIntReference() {
        return newNUIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded NUInt reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newGuardedNUIntReference(long value) {
        return newNUIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NUInt pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedNUIntArray(int capacity) {
        return newNUIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NUInt pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedNUIntArray(int capacity, long value) {
        return newNUIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NUInt pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedNUIntArray(long[] buffer) {
        return newNUIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded NUInt reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newGuardedWeakNUIntReference() {
        return newWeakNUIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded NUInt reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NUInt reference
     */
    public static final NUIntPtr newGuardedWeakNUIntReference(long value) {
        return newWeakNUIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NUInt pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedWeakNUIntArray(int capacity) {
        return newWeakNUIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NUInt pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedWeakNUIntArray(int capacity, long value) {
        return newWeakNUIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NUInt pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NUInt array
     */
    public static final NUIntPtr newGuardedWeakNUIntArray(long[] buffer) {
        return newWeakNUIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom NInt pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created NInt pointer
     */
    public static final NIntPtr newNIntPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new NIntPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new NIntPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new NInt reference.
     *
     * @return newly created NInt reference
     */
    public static final NIntPtr newNIntReference() {
        return new NIntPtrImpl(1, true);
    }

    /**
     * Create a new NInt reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NInt reference
     */
    public static final NIntPtr newNIntReference(long value) {
        NIntPtr ptr = new NIntPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NInt pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NInt array
     */
    public static final NIntPtr newNIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NIntPtrImpl(capacity, true);
    }

    /**
     * Create a new NInt pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NInt array
     */
    public static final NIntPtr newNIntArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NIntPtr pointer = new NIntPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NInt pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NInt array
     */
    public static final NIntPtr newNIntArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NIntPtr pointer = new NIntPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new NInt reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created NInt reference
     */
    public static final NIntPtr newWeakNIntReference() {
        return new NIntPtrImpl(1, false);
    }

    /**
     * Create a new NInt reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NInt reference
     */
    public static final NIntPtr newWeakNIntReference(long value) {
        NIntPtr ptr = new NIntPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NInt pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NInt array
     */
    public static final NIntPtr newWeakNIntArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NIntPtrImpl(capacity, false);
    }

    /**
     * Create a new NInt pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NInt array
     */
    public static final NIntPtr newWeakNIntArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NIntPtr pointer = new NIntPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NInt pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NInt array
     */
    public static final NIntPtr newWeakNIntArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NIntPtr pointer = new NIntPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded NInt reference.
     *
     * @return newly created NInt reference
     */
    public static final NIntPtr newGuardedNIntReference() {
        return newNIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded NInt reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NInt reference
     */
    public static final NIntPtr newGuardedNIntReference(long value) {
        return newNIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NInt pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedNIntArray(int capacity) {
        return newNIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NInt pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedNIntArray(int capacity, long value) {
        return newNIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NInt pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedNIntArray(long[] buffer) {
        return newNIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded NInt reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created NInt reference
     */
    public static final NIntPtr newGuardedWeakNIntReference() {
        return newWeakNIntReference().getGuarded(1);
    }

    /**
     * Create a new guarded NInt reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NInt reference
     */
    public static final NIntPtr newGuardedWeakNIntReference(long value) {
        return newWeakNIntReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NInt pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedWeakNIntArray(int capacity) {
        return newWeakNIntArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NInt pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedWeakNIntArray(int capacity, long value) {
        return newWeakNIntArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NInt pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NInt array
     */
    public static final NIntPtr newGuardedWeakNIntArray(long[] buffer) {
        return newWeakNIntArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom NULong pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created NULong pointer
     */
    public static final NULongPtr newNULongPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new NULongPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new NULongPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new NULong reference.
     *
     * @return newly created NULong reference
     */
    public static final NULongPtr newNULongReference() {
        return new NULongPtrImpl(1, true);
    }

    /**
     * Create a new NULong reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NULong reference
     */
    public static final NULongPtr newNULongReference(long value) {
        NULongPtr ptr = new NULongPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NULong pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NULong array
     */
    public static final NULongPtr newNULongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NULongPtrImpl(capacity, true);
    }

    /**
     * Create a new NULong pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NULong array
     */
    public static final NULongPtr newNULongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NULongPtr pointer = new NULongPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NULong pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NULong array
     */
    public static final NULongPtr newNULongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NULongPtr pointer = new NULongPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new NULong reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created NULong reference
     */
    public static final NULongPtr newWeakNULongReference() {
        return new NULongPtrImpl(1, false);
    }

    /**
     * Create a new NULong reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NULong reference
     */
    public static final NULongPtr newWeakNULongReference(long value) {
        NULongPtr ptr = new NULongPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NULong pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NULong array
     */
    public static final NULongPtr newWeakNULongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NULongPtrImpl(capacity, false);
    }

    /**
     * Create a new NULong pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NULong array
     */
    public static final NULongPtr newWeakNULongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NULongPtr pointer = new NULongPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NULong pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NULong array
     */
    public static final NULongPtr newWeakNULongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NULongPtr pointer = new NULongPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded NULong reference.
     *
     * @return newly created NULong reference
     */
    public static final NULongPtr newGuardedNULongReference() {
        return newNULongReference().getGuarded(1);
    }

    /**
     * Create a new guarded NULong reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NULong reference
     */
    public static final NULongPtr newGuardedNULongReference(long value) {
        return newNULongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NULong pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedNULongArray(int capacity) {
        return newNULongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NULong pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedNULongArray(int capacity, long value) {
        return newNULongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NULong pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedNULongArray(long[] buffer) {
        return newNULongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded NULong reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created NULong reference
     */
    public static final NULongPtr newGuardedWeakNULongReference() {
        return newWeakNULongReference().getGuarded(1);
    }

    /**
     * Create a new guarded NULong reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NULong reference
     */
    public static final NULongPtr newGuardedWeakNULongReference(long value) {
        return newWeakNULongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NULong pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedWeakNULongArray(int capacity) {
        return newWeakNULongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NULong pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedWeakNULongArray(int capacity, long value) {
        return newWeakNULongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NULong pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NULong array
     */
    public static final NULongPtr newGuardedWeakNULongArray(long[] buffer) {
        return newWeakNULongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom NLong pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created NLong pointer
     */
    public static final NLongPtr newNLongPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new NLongPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new NLongPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new NLong reference.
     *
     * @return newly created NLong reference
     */
    public static final NLongPtr newNLongReference() {
        return new NLongPtrImpl(1, true);
    }

    /**
     * Create a new NLong reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NLong reference
     */
    public static final NLongPtr newNLongReference(long value) {
        NLongPtr ptr = new NLongPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NLong pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NLong array
     */
    public static final NLongPtr newNLongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NLongPtrImpl(capacity, true);
    }

    /**
     * Create a new NLong pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NLong array
     */
    public static final NLongPtr newNLongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NLongPtr pointer = new NLongPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NLong pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NLong array
     */
    public static final NLongPtr newNLongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NLongPtr pointer = new NLongPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new NLong reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created NLong reference
     */
    public static final NLongPtr newWeakNLongReference() {
        return new NLongPtrImpl(1, false);
    }

    /**
     * Create a new NLong reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NLong reference
     */
    public static final NLongPtr newWeakNLongReference(long value) {
        NLongPtr ptr = new NLongPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new NLong pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NLong array
     */
    public static final NLongPtr newWeakNLongArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new NLongPtrImpl(capacity, false);
    }

    /**
     * Create a new NLong pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NLong array
     */
    public static final NLongPtr newWeakNLongArray(int capacity, long value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        NLongPtr pointer = new NLongPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new NLong pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NLong array
     */
    public static final NLongPtr newWeakNLongArray(long[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        NLongPtr pointer = new NLongPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded NLong reference.
     *
     * @return newly created NLong reference
     */
    public static final NLongPtr newGuardedNLongReference() {
        return newNLongReference().getGuarded(1);
    }

    /**
     * Create a new guarded NLong reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created NLong reference
     */
    public static final NLongPtr newGuardedNLongReference(long value) {
        return newNLongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NLong pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedNLongArray(int capacity) {
        return newNLongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NLong pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedNLongArray(int capacity, long value) {
        return newNLongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NLong pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedNLongArray(long[] buffer) {
        return newNLongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded NLong reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created NLong reference
     */
    public static final NLongPtr newGuardedWeakNLongReference() {
        return newWeakNLongReference().getGuarded(1);
    }

    /**
     * Create a new guarded NLong reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created NLong reference
     */
    public static final NLongPtr newGuardedWeakNLongReference(long value) {
        return newWeakNLongReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded NLong pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedWeakNLongArray(int capacity) {
        return newWeakNLongArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded NLong pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedWeakNLongArray(int capacity, long value) {
        return newWeakNLongArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded NLong pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created NLong array
     */
    public static final NLongPtr newGuardedWeakNLongArray(long[] buffer) {
        return newWeakNLongArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom wchar_t pointer.
     *
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created wchar_t pointer
     */
    public static final WCharTPtr newWCharTPtr(int capacity, boolean owned, boolean guarded) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new WCharTPtrImpl(capacity, owned).getGuarded(capacity);
        } else {
            return new WCharTPtrImpl(capacity, owned);
        }
    }

    /**
     * Create a new wchar_t pointer from a java.nio.IntBuffer.
     *
     * @param buffer
     *            object to create the pointer from
     * @return newly created pointer representing the same memory as the
     *         specified buffer
     */
    public static final WCharTPtr newWCharTPtr(IntBuffer buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        return new WCharTPtrImpl(CRuntime.getIntBufferPointer(buffer), buffer);
    }

    /**
     * Create a new wchar_t reference.
     *
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newWCharTReference() {
        return new WCharTPtrImpl(1, true);
    }

    /**
     * Create a new wchar_t reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newWCharTReference(int value) {
        WCharTPtr ptr = new WCharTPtrImpl(1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new wchar_t pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final WCharTPtr newWCharTArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new WCharTPtrImpl(capacity, true);
    }

    /**
     * Create a new wchar_t pointer with a specified capacity and default value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final WCharTPtr newWCharTArray(int capacity, int value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        WCharTPtr pointer = new WCharTPtrImpl(capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new wchar_t pointer with buffer as it's initial contents, this will
     * completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final WCharTPtr newWCharTArray(int[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        WCharTPtr pointer = new WCharTPtrImpl(size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new wchar_t reference. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newWeakWCharTReference() {
        return new WCharTPtrImpl(1, false);
    }

    /**
     * Create a new wchar_t reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newWeakWCharTReference(int value) {
        WCharTPtr ptr = new WCharTPtrImpl(1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new wchar_t pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final WCharTPtr newWeakWCharTArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new WCharTPtrImpl(capacity, false);
    }

    /**
     * Create a new wchar_t pointer with a specified capacity and default value. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final WCharTPtr newWeakWCharTArray(int capacity, int value) {
        if (capacity < 0) {
            throw new IllegalArgumentException();
        }
        WCharTPtr pointer = new WCharTPtrImpl(capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new wchar_t pointer with buffer as it's initial contents, this will
     * completely copy the buffer. The freeing of the allocated memory will not
     * happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final WCharTPtr newWeakWCharTArray(int[] buffer) {
        if (buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        WCharTPtr pointer = new WCharTPtrImpl(size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded wchar_t reference.
     *
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newGuardedWCharTReference() {
        return newWCharTReference().getGuarded(1);
    }

    /**
     * Create a new guarded wchar_t reference with an initial value.
     *
     * @param value
     *            initial value
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newGuardedWCharTReference(int value) {
        return newWCharTReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded wchar_t pointer with a specified capacity.
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWCharTArray(int capacity) {
        return newWCharTArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded wchar_t pointer with a specified capacity and default
     * value.
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWCharTArray(int capacity, int value) {
        return newWCharTArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded wchar_t pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWCharTArray(int[] buffer) {
        return newWCharTArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded wchar_t reference. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newGuardedWeakWCharTReference() {
        return newWeakWCharTReference().getGuarded(1);
    }

    /**
     * Create a new guarded wchar_t reference with an initial value. The freeing of
     * the allocated memory will not happen automatically!
     *
     * @param value
     *            initial value
     * @return newly created wchar_t reference
     */
    public static final WCharTPtr newGuardedWeakWCharTReference(int value) {
        return newWeakWCharTReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded wchar_t pointer with a specified capacity. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWeakWCharTArray(int capacity) {
        return newWeakWCharTArray(capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded wchar_t pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWeakWCharTArray(int capacity, int value) {
        return newWeakWCharTArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded wchar_t pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param buffer
     *            array to copy
     * @return newly created int array
     */
    public static final WCharTPtr newGuardedWeakWCharTArray(int[] buffer) {
        return newWeakWCharTArray(buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom struct pointer.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created struct pointer
     */
    public static final <T extends StructObject> Ptr<T> newStructPtr(Class<T> type, int capacity,
                                                                     boolean owned,
                                                                     boolean guarded) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new StructPtrImpl<T>(type, capacity, owned).getGuarded(capacity);
        } else {
            return new StructPtrImpl<T>(type, capacity, owned);
        }
    }

    /**
     * Create a new struct reference.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newStructReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return new StructPtrImpl<T>(type, 1, true);
    }

    /**
     * Create a new struct reference with an initial value.
     *
     * @param <T>
     *            struct's class
     * @param value
     *            initial value
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newStructReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = new StructPtrImpl<T>((Class<T>) value.getClass(), 1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new struct pointer with a specified capacity.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param capacity
     *            number of elements to hold
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newStructArray(Class<T> type,
            int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new StructPtrImpl<T>(type, capacity, true);
    }

    /**
     * Create a new struct pointer with a specified capacity and default value.
     *
     * @param <T>
     *            struct's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newStructArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = new StructPtrImpl<T>((Class<T>) value.getClass(), capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new struct pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param buffer
     *            array to copy
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newStructArray(Class<T> type, T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = new StructPtrImpl<T>(type, size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new struct reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newWeakStructReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return new StructPtrImpl<T>(type, 1, false);
    }

    /**
     * Create a new struct reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param value
     *            initial value
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newWeakStructReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = new StructPtrImpl<T>((Class<T>) value.getClass(), 1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new struct pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param capacity
     *            number of elements to hold
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newWeakStructArray(Class<T> type,
            int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new StructPtrImpl<T>(type, capacity, false);
    }

    /**
     * Create a new struct pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newWeakStructArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = new StructPtrImpl<T>((Class<T>) value.getClass(), capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new struct pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param buffer
     *            array to copy
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newWeakStructArray(Class<T> type,
            T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = new StructPtrImpl<T>(type, size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded struct reference.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newGuardedStructReference(Class<T> type) {
        return (Ptr<T>) newStructReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded struct reference with an initial value.
     *
     * @param <T>
     *            struct's class
     * @param value
     *            initial value
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newGuardedStructReference(T value) {
        return (Ptr<T>) newStructReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded struct pointer with a specified capacity.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param capacity
     *            number of elements to hold
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedStructArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newStructArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded struct pointer with a specified capacity and default
     * value.
     *
     * @param <T>
     *            struct's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedStructArray(int capacity,
            T value) {
        return (Ptr<T>) newStructArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded struct pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param buffer
     *            array to copy
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedStructArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newStructArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded struct reference. The freeing of the allocated
     * memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T>
            newGuardedWeakStructReference(Class<T> type) {
        return (Ptr<T>) newWeakStructReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded struct reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param value
     *            initial value
     * @return newly created struct reference
     */
    public static final <T extends StructObject> Ptr<T> newGuardedWeakStructReference(T value) {
        return (Ptr<T>) newWeakStructReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded struct pointer with a specified capacity. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param capacity
     *            number of elements to hold
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedWeakStructArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newWeakStructArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded struct pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedWeakStructArray(int capacity,
            T value) {
        return (Ptr<T>) newWeakStructArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded struct pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param <T>
     *            struct's class
     * @param type
     *            type of the struct
     * @param buffer
     *            array to copy
     * @return newly created struct array
     */
    public static final <T extends StructObject> Ptr<T> newGuardedWeakStructArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newWeakStructArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom opaque reference pointer.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created opaque reference pointer
     */
    @SuppressWarnings("unchecked")
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrPtr(Class<T> type, int capacity,
                                                                     boolean owned,
                                                                     boolean guarded) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return (Ptr<T>) newPointerPtr(type, 2, capacity, owned, guarded);
    }

    /**
     * Create a new opaque reference reference.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return newOpaquePtrPtr(type, 1, true, false);
    }

    /**
     * Create a new opaque reference reference with an initial value.
     *
     * @param <T>
     *            opaque pointer's class
     * @param value
     *            initial value
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = newOpaquePtrPtr((Class<T>) value.getClass(), 1, true, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new opaque reference pointer with a specified capacity.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param capacity
     *            number of elements to hold
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrArray(Class<T> type,
            int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return newOpaquePtrPtr(type, capacity, true, false);
    }

    /**
     * Create a new opaque reference pointer with a specified capacity and default value.
     *
     * @param <T>
     *            opaque pointer's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = newOpaquePtrPtr((Class<T>) value.getClass(), capacity, true, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new opaque reference pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param buffer
     *            array to copy
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newOpaquePtrArray(Class<T> type, T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = newOpaquePtrPtr(type, size, true, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new opaque reference reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newWeakOpaquePtrReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return newOpaquePtrPtr(type, 1, false, false);
    }

    /**
     * Create a new opaque reference reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param value
     *            initial value
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newWeakOpaquePtrReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = newOpaquePtrPtr((Class<T>) value.getClass(), 1, false, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new opaque reference pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param capacity
     *            number of elements to hold
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newWeakOpaquePtrArray(Class<T> type,
            int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return newOpaquePtrPtr(type, capacity, false, false);
    }

    /**
     * Create a new opaque reference pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newWeakOpaquePtrArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = newOpaquePtrPtr((Class<T>) value.getClass(), capacity, false, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new opaque reference pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param buffer
     *            array to copy
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newWeakOpaquePtrArray(Class<T> type,
            T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = newOpaquePtrPtr(type, size, false, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded opaque reference reference.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedOpaquePtrReference(Class<T> type) {
        return (Ptr<T>) newOpaquePtrReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded opaque reference reference with an initial value.
     *
     * @param <T>
     *            opaque pointer's class
     * @param value
     *            initial value
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedOpaquePtrReference(T value) {
        return (Ptr<T>) newOpaquePtrReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded opaque reference pointer with a specified capacity.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param capacity
     *            number of elements to hold
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedOpaquePtrArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newOpaquePtrArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded opaque reference pointer with a specified capacity and default
     * value.
     *
     * @param <T>
     *            opaque pointer's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedOpaquePtrArray(int capacity,
            T value) {
        return (Ptr<T>) newOpaquePtrArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded opaque reference pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param buffer
     *            array to copy
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedOpaquePtrArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newOpaquePtrArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded opaque reference reference. The freeing of the allocated
     * memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T>
            newGuardedWeakOpaquePtrReference(Class<T> type) {
        return (Ptr<T>) newWeakOpaquePtrReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded opaque reference reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param value
     *            initial value
     * @return newly created opaque reference reference
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedWeakOpaquePtrReference(T value) {
        return (Ptr<T>) newWeakOpaquePtrReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded opaque reference pointer with a specified capacity. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param capacity
     *            number of elements to hold
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedWeakOpaquePtrArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newWeakOpaquePtrArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded opaque reference pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedWeakOpaquePtrArray(int capacity,
            T value) {
        return (Ptr<T>) newWeakOpaquePtrArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded opaque reference pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param <T>
     *            opaque pointer's class
     * @param type
     *            type of the opaque reference
     * @param buffer
     *            array to copy
     * @return newly created opaque reference array
     */
    public static final <T extends OpaquePtr> Ptr<T> newGuardedWeakOpaquePtrArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newWeakOpaquePtrArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new custom object pointer.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer object should manage memory
     * @param guarded
     *            <code>true</code> if the pointer object should be guarded
     * @return newly created object pointer
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectPtr(Class<T> type, int capacity,
            boolean owned,
            boolean guarded) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return new ObjCObjectPtrImpl<T>(type, capacity, owned).getGuarded(capacity);
        } else {
            return new ObjCObjectPtrImpl<T>(type, capacity, owned);
        }
    }

    /**
     * Create a new object reference.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return new ObjCObjectPtrImpl<T>(type, 1, true);
    }

    /**
     * Create a new object reference with an initial value.
     *
     * @param <T>
     *            Objective-C object's class
     * @param value
     *            initial value
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = new ObjCObjectPtrImpl<T>((Class<T>) value.getClass(), 1, true);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new object pointer with a specified capacity.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectArray(Class<T> type, int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ObjCObjectPtrImpl<T>(type, capacity, true);
    }

    /**
     * Create a new object pointer with a specified capacity and default value.
     *
     * @param <T>
     *            Objective-C object's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = new ObjCObjectPtrImpl<T>((Class<T>) value.getClass(), capacity, true);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new object pointer with buffer as it's initial contents, this
     * will completely copy the buffer.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param buffer
     *            array to copy
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newObjectArray(Class<T> type, T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = new ObjCObjectPtrImpl<T>(type, size, true);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new object reference. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newWeakObjectReference(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException();
        }
        return new ObjCObjectPtrImpl<T>(type, 1, false);
    }

    /**
     * Create a new object reference with an initial value. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param value
     *            initial value
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newWeakObjectReference(T value) {
        if (value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> ptr = new ObjCObjectPtrImpl<T>((Class<T>) value.getClass(), 1, false);
        ptr.set(value);
        return ptr;
    }

    /**
     * Create a new object pointer with a specified capacity. The freeing of the
     * allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newWeakObjectArray(Class<T> type,
            int capacity) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new ObjCObjectPtrImpl<T>(type, capacity, false);
    }

    /**
     * Create a new object pointer with a specified capacity and default value.
     * The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newWeakObjectArray(int capacity, T value) {
        if (capacity < 0 || value == null) {
            throw new IllegalArgumentException();
        }
        @SuppressWarnings("unchecked")
        Ptr<T> pointer = new ObjCObjectPtrImpl<T>((Class<T>) value.getClass(), capacity, false);
        for (int idx = 0; idx < capacity; ++idx) {
            pointer.set(idx, value);
        }
        return pointer;
    }

    /**
     * Create a new object pointer with buffer as it's initial contents, this
     * will completely copy the buffer. The freeing of the allocated memory will
     * not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param buffer
     *            array to copy
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newWeakObjectArray(Class<T> type,
            T[] buffer) {
        if (type == null || buffer == null) {
            throw new IllegalArgumentException();
        }
        int size = buffer.length;
        Ptr<T> pointer = new ObjCObjectPtrImpl<T>(type, size, false);
        pointer.copyFrom(buffer);
        return pointer;
    }

    /**
     * Create a new guarded object reference.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedObjectReference(Class<T> type) {
        return (Ptr<T>) newObjectReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded object reference with an initial value.
     *
     * @param <T>
     *            Objective-C object's class
     * @param value
     *            initial value
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedObjectReference(T value) {
        return (Ptr<T>) newObjectReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded object pointer with a specified capacity.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedObjectArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newObjectArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded object pointer with a specified capacity and default
     * value.
     *
     * @param <T>
     *            Objective-C object's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedObjectArray(int capacity,
            T value) {
        return (Ptr<T>) newObjectArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded object pointer with buffer as it's initial contents,
     * this will completely copy the buffer.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param buffer
     *            array to copy
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedObjectArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newObjectArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new guarded object reference. The freeing of the allocated
     * memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T>
            newGuardedWeakObjectReference(Class<T> type) {
        return (Ptr<T>) newWeakObjectReference(type).getGuarded(1);
    }

    /**
     * Create a new guarded object reference with an initial value. The freeing
     * of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param value
     *            initial value
     * @return newly created object reference
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedWeakObjectReference(T value) {
        return (Ptr<T>) newWeakObjectReference(value).getGuarded(1);
    }

    /**
     * Create a new guarded object pointer with a specified capacity. The
     * freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedWeakObjectArray(Class<T> type,
            int capacity) {
        return (Ptr<T>) newWeakObjectArray(type, capacity).getGuarded(capacity);
    }

    /**
     * Create a new guarded object pointer with a specified capacity and default
     * value. The freeing of the allocated memory will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param capacity
     *            number of elements to hold
     * @param value
     *            initial value for the elements
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedWeakObjectArray(int capacity,
            T value) {
        return (Ptr<T>) newWeakObjectArray(capacity, value).getGuarded(capacity);
    }

    /**
     * Create a new guarded object pointer with buffer as it's initial contents,
     * this will completely copy the buffer. The freeing of the allocated memory
     * will not happen automatically!
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param buffer
     *            array to copy
     * @return newly created object array
     */
    public static final <T extends ObjCObject> Ptr<T> newGuardedWeakObjectArray(Class<T> type,
            T[] buffer) {
        return (Ptr<T>) newWeakObjectArray(type, buffer).getGuarded(buffer.length);
    }

    /**
     * Create a new C++ object pointer with a specified capacity, weakness.
     *
     * @param <T>
     *            Objective-C object's class
     * @param type
     *            type of the object
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer pointer should manage memory
     * @return newly created object array
     */
    public static final <T extends CxxObject> Ptr<T> newCxxObjectPtr(Class<T> type, int capacity, boolean owned) {
        if (type == null || capacity < 0) {
            throw new IllegalArgumentException();
        }
        return new CxxObjectPtrImpl<T>(type, capacity, owned);
    }

    /**
     * Create a new custom pointer pointer.
     *
     * @param <T>
     *            Pointer's root element class
     * @param type
     *            type of the pointer
     * @param depth
     *            numbers of indirections
     * @param capacity
     *            number of elements to hold
     * @param owned
     *            <code>true</code> if the pointer pointer should manage memory
     * @param guarded
     *            <code>true</code> if the pointer pointer should be guarded
     * @return newly created pointer pointer
     */
    public static final <T> Ptr<?> newPointerPtr(Class<T> type, int depth, int capacity,
            boolean owned, boolean guarded) {
        if (type == null || capacity < 0 || depth < 2) {
            throw new IllegalArgumentException();
        }
        if (guarded) {
            return (Ptr<?>) new IndirectPtrImpl<ConstVoidPtr, T>(type, depth, capacity, owned)
                    .getGuarded(capacity);
        } else {
            return (Ptr<?>) new IndirectPtrImpl<ConstVoidPtr, T>(type, depth, capacity, owned);
        }
    }

}
