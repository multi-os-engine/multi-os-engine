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

import org.moe.natj.general.ptr.Ptr;

/**
 * Utility for pointer objects.
 */
public class PtrUtils {

    /**
     * Returns the element's reference instead of a copy.
     *
     * @param ptr
     *            pointer
     * @param idx
     *            index
     * @return Element's reference
     */
    @SuppressWarnings("unchecked")
    public static <T> T getElemRef(Ptr<T> ptr, int idx) {
        if (ptr == null) {
            throw new NullPointerException();
        }
        if (ptr instanceof StructPtrImpl<?>) {
            return (T) ((StructPtrImpl<?>) ptr).getRef(idx);
        } else if (ptr instanceof CxxObjectPtrImpl<?>) {
            return (T) ((CxxObjectPtrImpl<?>) ptr).getRef(idx);
        } else {
            return ptr.get(idx);
        }
    }

}
