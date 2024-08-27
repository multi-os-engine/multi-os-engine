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
 * Interface for offsetble pointer objects.
 */
public interface IElementPtr<T> {

    /**
     * Create a new pointer from a specified element offset.
     *
     * <p><i>When
     * the pointer is not guarded, accessing elements out of range could result
     * in a program crash!</i>
     *
     * @param elemOffset
     *            low endpoint of the new pointer
     * @return new pointer with the specified low endpoint
     */
    public T ofs(int elemOffset);

}
