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

import org.moe.natj.c.StructObject;
import org.moe.natj.cxx.CxxObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstBoolPtr;
import org.moe.natj.general.ptr.ConstBytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstDoublePtr;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstIntPtr;
import org.moe.natj.general.ptr.ConstLongPtr;
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNLongPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstNULongPtr;
import org.moe.natj.general.ptr.ConstShortPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.ConstWCharTPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NLongPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.NULongPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.WCharTPtr;
import org.moe.natj.objc.ObjCObject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PtrImplementer {

    private PtrImplementer() {

    }

    public static final Map<Class<?>, Class<?>> primitivePtrTypeMap;

    static {
        HashMap<Class<?>, Class<?>> ptrMap = new HashMap<Class<?>, Class<?>>(32);
        ptrMap.put(ConstVoidPtr.class, VoidPtrImpl.ConstVoidPtrImpl.class);
        ptrMap.put(VoidPtr.class, VoidPtrImpl.class);
        ptrMap.put(ConstCharPtr.class, CharPtrImpl.ConstCharPtrImpl.class);
        ptrMap.put(CharPtr.class, CharPtrImpl.class);
        ptrMap.put(ConstBoolPtr.class, BoolPtrImpl.ConstBoolPtrImpl.class);
        ptrMap.put(BoolPtr.class, BoolPtrImpl.class);
        ptrMap.put(ConstBytePtr.class, BytePtrImpl.ConstBytePtrImpl.class);
        ptrMap.put(BytePtr.class, BytePtrImpl.class);
        ptrMap.put(ConstShortPtr.class, ShortPtrImpl.ConstShortPtrImpl.class);
        ptrMap.put(ShortPtr.class, ShortPtrImpl.class);
        ptrMap.put(ConstIntPtr.class, IntPtrImpl.ConstIntPtrImpl.class);
        ptrMap.put(IntPtr.class, IntPtrImpl.class);
        ptrMap.put(ConstLongPtr.class, LongPtrImpl.ConstLongPtrImpl.class);
        ptrMap.put(LongPtr.class, LongPtrImpl.class);
        ptrMap.put(ConstFloatPtr.class, FloatPtrImpl.ConstFloatPtrImpl.class);
        ptrMap.put(FloatPtr.class, FloatPtrImpl.class);
        ptrMap.put(ConstDoublePtr.class, DoublePtrImpl.ConstDoublePtrImpl.class);
        ptrMap.put(DoublePtr.class, DoublePtrImpl.class);
        ptrMap.put(ConstNFloatPtr.class, NFloatPtrImpl.ConstNFloatPtrImpl.class);
        ptrMap.put(NFloatPtr.class, NFloatPtrImpl.class);
        ptrMap.put(ConstNUIntPtr.class, NUIntPtrImpl.ConstNUIntPtrImpl.class);
        ptrMap.put(NUIntPtr.class, NUIntPtrImpl.class);
        ptrMap.put(ConstNIntPtr.class, NIntPtrImpl.ConstNIntPtrImpl.class);
        ptrMap.put(NIntPtr.class, NIntPtrImpl.class);
        ptrMap.put(ConstNULongPtr.class, NULongPtrImpl.ConstNULongPtrImpl.class);
        ptrMap.put(NULongPtr.class, NULongPtrImpl.class);
        ptrMap.put(ConstNLongPtr.class, NLongPtrImpl.ConstNLongPtrImpl.class);
        ptrMap.put(NLongPtr.class, NLongPtrImpl.class);
        ptrMap.put(ConstWCharTPtr.class, WCharTPtrImpl.ConstWCharTPtrImpl.class);
        ptrMap.put(WCharTPtr.class, WCharTPtrImpl.class);
        primitivePtrTypeMap = Collections.unmodifiableMap(ptrMap);
    }

    /**
     * Returns a C++ pointer instance.
     *
     * @param elem    Element type
     * @param pointer Pointer
     * @param <T>     Element type
     * @return C++ pointer instance for the specified element type
     */
    public static final <T extends CxxObject> CxxObjectPtrImpl<T> getCxxObjectPtr(Class<T> elem, Pointer pointer) {
        return new CxxObjectPtrImpl<T>(elem, pointer);
    }

    /**
     * Returns a const C++ pointer instance.
     *
     * @param elem    Element type
     * @param pointer Pointer
     * @param <T>     Element type
     * @return Const C++ pointer instance for the specified element type
     */
    public static final <T extends CxxObject> CxxObjectPtrImpl<T> getConstCxxObjectPtr(Class<T> elem, Pointer pointer) {
        return new CxxObjectPtrImpl.ConstCxxObjectPtrImpl<T>(elem, pointer);
    }

    /**
     * Returns implementation for the given reference kind.
     *
     * @param info    Reference info
     * @param isConst Is Constant pointer
     * @return Class of pointer implementation
     */
    public static final Class<?> getImplementer(ReferenceInfo info, boolean isConst) {
        if (info != null && info.depth() == 1) {
            if (StructObject.class.isAssignableFrom(info.type())) {
                if (isConst) {
                    return StructPtrImpl.ConstStructPtrImpl.class;
                } else {
                    return StructPtrImpl.class;
                }
            } else if (ObjCObject.class.isAssignableFrom(info.type())) {
                if (isConst) {
                    return ObjCObjectPtrImpl.ConstObjCObjectPtrImpl.class;
                } else {
                    return ObjCObjectPtrImpl.class;
                }
            } else if (CxxObject.class.isAssignableFrom(info.type())) {
                if (isConst) {
                    return CxxObjectPtrImpl.ConstCxxObjectPtrImpl.class;
                } else {
                    return CxxObjectPtrImpl.class;
                }
            }
        } else {
            if (isConst) {
                return IndirectPtrImpl.ConstIndirectPtrImpl.class;
            } else {
                return IndirectPtrImpl.class;
            }
        }
        return null;
    }

}
