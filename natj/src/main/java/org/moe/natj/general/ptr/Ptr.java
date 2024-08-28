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

public interface Ptr<T> extends VoidPtr, ConstPtr<T> {

    /**
     * Replaces the object at location 0 with the specified object. <br>This
     * call is equivalent to <code>set(0, obj)</code>.
     *
     * <p><i>When the
     * pointer is not guarded, accessing elements out of range could result in a
     * program crash!</i>
     *
     * @param obj
     *            object to be stored
     */
    public void set(T obj);

    /**
     * Replaces the object at the specified location with the specified object.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param idx
     *            index of the object to replace
     * @param obj
     *            object to be stored
     */
    public void set(int idx, T obj);

    /**
     * Copies elements from the specified array to this pointer. The number of
     * elements copied is equal to the size of the source array. <br>This call
     * is equivalent to <code>copyFrom(src, 0, 0, src.length)</code>.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param src
     *            non-null array to copy from
     */
    public void copyFrom(T[] src);

    /**
     * Copies elements from the specified array to this pointer. The offset of
     * the first value to be replaced is specified with the
     * <code>destOffset</code> argument. The number of elements copied is equal
     * to the size of the source array. <br>This call is equivalent to
     * <code>copyFrom(src, 0, destOffset, src.length)</code>.
     *
     * <p><i>When
     * the pointer is not guarded, accessing elements out of range could result
     * in a program crash!</i>
     *
     * @param src
     *            non-null array to copy from
     * @param destOffset
     *            index of the first value to replace in this pointer
     */
    public void copyFrom(T[] src, int destOffset);

    /**
     * Copies elements from the specified array from the specified index to this
     * pointer. The offset of the first value to be replaced is specified with
     * the <code>destOffset</code> argument. The number of elements copied is
     * equal to the size of the source array. <br>This call is equivalent to
     * <code>copyFrom(src, srcOffset, destOffset, src.length)</code>.
     *
     * <p><i>When the pointer is not guarded, accessing elements out of
     * range could result in a program crash!</i>
     *
     * @param src
     *            non-null array to copy from
     * @param destOffset
     *            index of the first value to replace in this pointer
     * @param length
     *            number of elements to copy
     */
    public void copyFrom(T[] src, int destOffset, int length);

    /**
     * Copies elements from the specified array from the specified index to this
     * pointer. The offset of the first value to be replaced is specified with
     * the <code>destOffset</code> argument.
     *
     * <p><i>When the pointer is
     * not guarded, accessing elements out of range could result in a program
     * crash!</i>
     *
     * @param src
     *            non-null array to copy from
     * @param srcOffset
     *            index of the first value to copy to this pointer
     * @param destOffset
     *            index of the first value to replace in this pointer
     * @param length
     *            number of elements to copy
     */
    public void copyFrom(T[] src, int srcOffset, int destOffset, int length);

    /*@Override
    public Ptr<T> ofs(int elemOffset);

    @Override
    public Ptr<T> getGuarded(int length);

    @Override
    public Ptr<T> getGuarded(int fromIndex, int toIndex);*/

}
