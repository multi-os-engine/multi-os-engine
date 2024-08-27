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

import org.moe.natj.general.Pointer;

/**
 * Constant Void pointer interface.
 */
public interface ConstVoidPtr {

    /**
     * Returns the underlying pointer object.
     *
     * @return the underlying pointer object
     */
    public Pointer getPeer();

    /**
     * Returns <code>true</code> if the pointer is constant type. Calling
     * methods which would write to the pointer will result in an
     * {@link UnsupportedOperationException} exception.
     *
     * @return <code>true</code> if the pointer is constant type
     */
    public boolean isConstPtr();

    /**
     * Returns the indirection count of the pointer. For example IntPtr will
     * return 1, Ptr&lt;IntPtr&gt; will return 2.
     *
     * @return the indirection count of the pointer
     */
    public int getDepth();

    /**
     * Frees the memory space pointed to by this pointer. Calling this method on
     * a pointer which was already freed or the owner is a different object will
     * result in an {@link UnsupportedOperationException} exception. Freeing a
     * pointer which is not owned by the caller will result in undefined
     * behavior! <br>This method is only necessary when working with weak - not
     * owned - pointers.
     */
    public void free();

    /**
     * Frees the memory space pointed to by this pointer without doing any
     * security checks on the pointer's state and ownership. Calling this method
     * on a pointer which was already freed will result in an
     * {@link UnsupportedOperationException} exception. Freeing a pointer which
     * is not owned by the caller will result in undefined behavior!
     */
    public void forceFree();

    /**
     * Returns a boolean pointer pointing to the same location.
     *
     * @return new boolean pointer <i>(NON-GUARDED)</i>
     */
    public ConstBoolPtr getBoolPtr();

    /**
     * Returns a boolean pointer pointing to the same location.
     *
     * @return new boolean pointer <i>(NON-GUARDED)</i>
     */
    public ConstBytePtr getBytePtr();

    /**
     * Returns a byte pointer pointing to the same location.
     *
     * @return new byte pointer <i>(NON-GUARDED)</i>
     */
    public ConstShortPtr getShortPtr();

    /**
     * Returns a short pointer pointing to the same location.
     *
     * @return new short pointer <i>(NON-GUARDED)</i>
     */
    public ConstCharPtr getCharPtr();

    /**
     * Returns a character pointer pointing to the same location.
     *
     * @return new character pointer <i>(NON-GUARDED)</i>
     */
    public ConstIntPtr getIntPtr();

    /**
     * Returns a long pointer pointing to the same location.
     *
     * @return new long pointer <i>(NON-GUARDED)</i>
     */
    public ConstLongPtr getLongPtr();

    /**
     * Returns a float pointer pointing to the same location.
     *
     * @return new float pointer <i>(NON-GUARDED)</i>
     */
    public ConstFloatPtr getFloatPtr();

    /**
     * Returns a double pointer pointing to the same location.
     *
     * @return new double pointer <i>(NON-GUARDED)</i>
     */
    public ConstDoublePtr getDoublePtr();

    /**
     * Returns a NFloat pointer pointing to the same location.
     *
     * @return new NFloat pointer <i>(NON-GUARDED)</i>
     */
    public ConstNFloatPtr getNFloatPtr();

    /**
     * Returns a NUInt pointer pointing to the same location.
     *
     * @return new NUInt pointer <i>(NON-GUARDED)</i>
     */
    public ConstNUIntPtr getNUIntPtr();

    /**
     * Returns a NInt pointer pointing to the same location.
     *
     * @return new NInt pointer <i>(NON-GUARDED)</i>
     */
    public ConstNIntPtr getNIntPtr();

    /**
     * Returns a NULong pointer pointing to the same location.
     *
     * @return new NULong pointer <i>(NON-GUARDED)</i>
     */
    public ConstNULongPtr getNULongPtr();

    /**
     * Returns a NLong pointer pointing to the same location.
     *
     * @return new NLong pointer <i>(NON-GUARDED)</i>
     */
    public ConstNLongPtr getNLongPtr();

}
