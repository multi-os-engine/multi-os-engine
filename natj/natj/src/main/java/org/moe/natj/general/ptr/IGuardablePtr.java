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

/**
 * Interface for pointer objects that can be converted to guarded pointer objects.
 */
public interface IGuardablePtr<T> {

    /**
     * Returns <code>true</code> if this pointer's read/write methods are index
     * guarded. When a pointer is guarded, the index parameter of read/write
     * calls is checked. Accessing elements which are out of bounds will result
     * in an {@link IndexOutOfBoundsException} exception.
     *
     * @return <code>true</code> if this pointer's read/write methods are index
     *         guarded
     */
    public boolean isGuarded();

    /**
     * Returns the guarded version of this pointer. <br>This call is equivalent
     * to <code>getGuarded(0, length)</code>.
     *
     * @param length
     *            number of elements to enable access to
     * @return guarded version of this pointer
     */
    public T getGuarded(int length);

    /**
     * Returns the guarded version of this pointer.
     *
     * @param fromIndex
     *            low endpoint (inclusive) of the pointer
     * @param toIndex
     *            high endpoint (exclusive) of the pointer
     * @return guarded version of this pointer
     */
    public T getGuarded(int fromIndex, int toIndex);

    /**
     * Returns the guarded pointer's low endpoint (inclusive). Calling this
     * method on a non-guarded pointer will result in an
     * {@link UnsupportedOperationException} exception!
     *
     * @return the guarded pointer's low endpoint (inclusive)
     */
    public int getGuardLow();

    /**
     * Returns the guarded pointer's high endpoint (exclusive). Calling this
     * method on a non-guarded pointer will result in an
     * {@link UnsupportedOperationException} exception!
     *
     * @return the guarded pointer's high endpoint (exclusive)
     */
    public int getGuardHigh();

}
