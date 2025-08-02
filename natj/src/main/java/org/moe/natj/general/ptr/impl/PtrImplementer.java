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
import org.moe.natj.general.map.ReferenceMapper.ClassIntPointerConstructor;
import org.moe.natj.general.map.ReferenceMapper.ClassPointerConstructor;
import org.moe.natj.general.map.ReferenceMapper.PointerConstructor;
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

    public static final Map<Class<?>, PointerConstructor<?>> primitivePtrTypeMap;

    static {
        HashMap<Class<?>, PointerConstructor<?>> ptrMap = new HashMap<>(32);
        ptrMap.put(ConstVoidPtr.class, VoidPtrImpl.ConstVoidPtrImpl::new);
        ptrMap.put(VoidPtr.class, VoidPtrImpl::new);
        ptrMap.put(ConstCharPtr.class, CharPtrImpl.ConstCharPtrImpl::new);
        ptrMap.put(CharPtr.class, CharPtrImpl::new);
        ptrMap.put(ConstBoolPtr.class, BoolPtrImpl.ConstBoolPtrImpl::new);
        ptrMap.put(BoolPtr.class, BoolPtrImpl::new);
        ptrMap.put(ConstBytePtr.class, BytePtrImpl.ConstBytePtrImpl::new);
        ptrMap.put(BytePtr.class, BytePtrImpl::new);
        ptrMap.put(ConstShortPtr.class, ShortPtrImpl.ConstShortPtrImpl::new);
        ptrMap.put(ShortPtr.class, ShortPtrImpl::new);
        ptrMap.put(ConstIntPtr.class, IntPtrImpl.ConstIntPtrImpl::new);
        ptrMap.put(IntPtr.class, IntPtrImpl::new);
        ptrMap.put(ConstLongPtr.class, LongPtrImpl.ConstLongPtrImpl::new);
        ptrMap.put(LongPtr.class, LongPtrImpl::new);
        ptrMap.put(ConstFloatPtr.class, FloatPtrImpl.ConstFloatPtrImpl::new);
        ptrMap.put(FloatPtr.class, FloatPtrImpl::new);
        ptrMap.put(ConstDoublePtr.class, DoublePtrImpl.ConstDoublePtrImpl::new);
        ptrMap.put(DoublePtr.class, DoublePtrImpl::new);
        ptrMap.put(ConstNFloatPtr.class, NFloatPtrImpl.ConstNFloatPtrImpl::new);
        ptrMap.put(NFloatPtr.class, NFloatPtrImpl::new);
        ptrMap.put(ConstNUIntPtr.class, NUIntPtrImpl.ConstNUIntPtrImpl::new);
        ptrMap.put(NUIntPtr.class, NUIntPtrImpl::new);
        ptrMap.put(ConstNIntPtr.class, NIntPtrImpl.ConstNIntPtrImpl::new);
        ptrMap.put(NIntPtr.class, NIntPtrImpl::new);
        ptrMap.put(ConstNULongPtr.class, NULongPtrImpl.ConstNULongPtrImpl::new);
        ptrMap.put(NULongPtr.class, NULongPtrImpl::new);
        ptrMap.put(ConstNLongPtr.class, NLongPtrImpl.ConstNLongPtrImpl::new);
        ptrMap.put(NLongPtr.class, NLongPtrImpl::new);
        ptrMap.put(ConstWCharTPtr.class, WCharTPtrImpl.ConstWCharTPtrImpl::new);
        ptrMap.put(WCharTPtr.class, WCharTPtrImpl::new);
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
    public static final ClassPointerConstructor getImplementerClassPointer(Class<?> type, boolean isConst) {
        if (StructObject.class.isAssignableFrom(type)) {
            if (isConst) {
                return StructPtrImpl.ConstStructPtrImpl::new;
            } else {
                return StructPtrImpl::new;
            }
        } else if (ObjCObject.class.isAssignableFrom(type)) {
            if (isConst) {
                return ObjCObjectPtrImpl.ConstObjCObjectPtrImpl::new;
            } else {
                return ObjCObjectPtrImpl::new;
            }
        } else if (CxxObject.class.isAssignableFrom(type)) {
            if (isConst) {
                return CxxObjectPtrImpl.ConstCxxObjectPtrImpl::new;
            } else {
                return CxxObjectPtrImpl::new;
            }
        }

        return null;
    }

    /**
     * Returns implementation for the given reference kind.
     *
     * @param isConst Is Constant pointer
     * @return Class of pointer implementation
     */
    public static final ClassIntPointerConstructor getImplementerClassIntPointer(boolean isConst) {
        if (isConst) {
            return IndirectPtrImpl.ConstIndirectPtrImpl::new;
        } else {
            return IndirectPtrImpl::new;
        }
    }
}
