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

package org.moe.natj.general.ptr;

import java.io.UnsupportedEncodingException;

/**
 * Constant Byte pointer interface.
 */
public interface ConstBytePtr extends ConstPtr<Byte> {

    /**
     * Returns the value at location 0 of the pointer. <br>This call is
     * equivalent to <code>get(0)</code>.
     *
     * <p><i>When the pointer is not
     * guarded, accessing elements out of range could result in a program
     * crash!</i>
     *
     * @return the value at location 0 of the pointer
     */
    public byte getValue();

    /**
     * Returns the value at the specified location in this pointer.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param idx
     *            index of the value to return
     * @return the value at the specified location in this pointer
     */
    public byte getValue(int idx);

    /**
     * Returns an array containing all of the elements (from <code>0</code> to
     * <code>length</code>) in this pointer in proper sequence. The array will
     * be newly allocated and no references to it will be maintained. This call
     * is equivalent to <code>toArray(0, length)</code>.
     *
     * <p><i>When the
     * pointer is not guarded, accessing elements out of range could result in a
     * program crash!</i>
     *
     * @param length
     *            number of elements to copy
     * @return an array containing all of the elements (from 0 to length) in
     *         this pointer in proper sequence
     */
    public byte[] toByteArray(int length);

    /**
     * Returns an array containing all of the elements (from
     * <code>fromIndex</code> to <code>toIndex</code>) in this pointer in proper
     * sequence. The array will be newly allocated and no references to it will
     * be maintained.
     *
     * <p><i>When the pointer is not guarded, accessing
     * elements out of range could result in a program crash!</i>
     *
     * @param fromIndex
     *            low endpoint (inclusive) of the pointer
     * @param toIndex
     *            high endpoint (exclusive) of the pointer
     * @return an array containing all of the elements (from fromIndex to
     *         toIndex) in this pointer in proper sequence
     */
    public byte[] toByteArray(int fromIndex, int toIndex);

    /**
     * Copies elements from the pointer to the specified array. The number of
     * elements copied is equal to the size of the array.
     *
     * <p><i>When the
     * pointer is not guarded, accessing elements out of range could result in a
     * program crash!</i>
     *
     * @param dest
     *            non-null array to copy into
     */
    public void copyTo(byte[] dest);

    /**
     * Copies elements from the pointer to the specified array.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param dest
     *            non-null array to copy into
     * @param length
     *            number of elements to copy
     */
    public void copyTo(byte[] dest, int length);

    /**
     * Copies elements from the pointer to the specified array.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param srcOffset
     *            offset of the element in the source
     * @param dest
     *            non-null array to copy to
     * @param destOffset
     *            offset of the first element in the destination
     * @param length
     *            number of elements to copy
     */
    public void copyTo(int srcOffset, byte[] dest, int destOffset, int length);

    @Override
    public ConstBytePtr ofs(int elemOffset);

    @Override
    public ConstBytePtr getGuarded(int length);

    @Override
    public ConstBytePtr getGuarded(int fromIndex, int toIndex);

    /**
     * Creates a new String from this pointer. This method assumes that the
     * string is null terminated and the encoding of it is
     * ASCII.
     *
     * <p><i>When the pointer is not guarded, accessing elements
     * out of range could result in a program crash!</i>
     *
     * @return new String from this pointer
     */
    public String toASCIIString();

    /**
     * Creates a new String from this pointer. This method assumes that the
     * string is null terminated and the encoding of it is
     * UTF-8.
     *
     * <p><i>When the pointer is not guarded, accessing elements
     * out of range could result in a program crash!</i>
     *
     * @return new String from this pointer
     */
    public String toUTF8String();

    /**
     * Creates a new String from this pointer with a given length. This method
     * assumes that the encoding of the string is UTF-8.
     *
     * <p><i>When the
     * pointer is not guarded, accessing elements out of range could result in a
     * program crash!</i>
     *
     * @param length
     *            number of bytes to put into the string
     * @return new String from this pointer
     */
    public String toString(int length);

    /**
     * Creates a new string from this pointer with a given length and
     * charset.
     *
     * <p><i>When the pointer is not guarded, accessing elements
     * out of range could result in a program crash!</i>
     *
     * @param length
     *            number of bytes to put into the string
     * @param charset
     *            the charset to be used to decode the bytes
     * @return new String from this pointer
     * @throws UnsupportedEncodingException In case of not supported charset
     */
    public String toString(int length, String charset)
            throws UnsupportedEncodingException;

}
