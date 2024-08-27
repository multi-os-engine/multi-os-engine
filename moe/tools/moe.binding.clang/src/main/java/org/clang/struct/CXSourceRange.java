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

package org.clang.struct;

import org.clang.c.clang;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.ConstVoidPtr;

@Generated
@Structure()
public final class CXSourceRange extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXSourceRange() {
        super(CXSourceRange.class);
    }

    @Generated
    protected CXSourceRange(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 2)
    public native ConstVoidPtr ptr_data(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 2)
    public native void setPtr_data(ConstVoidPtr value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int begin_int_data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBegin_int_data(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int end_int_data();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setEnd_int_data(int value);

    public CXSourceLocation getStartLocation() {
        return clang.clang_getRangeStart(this);
    }

    public CXSourceLocation getEndLocation() {
        return clang.clang_getRangeEnd(this);
    }

    @Override
    public String toString() {
        CXSourceLocation start = getStartLocation();
        CXSourceLocation end = getEndLocation();
        return "CXSourceRange(start=" + start + ", end=" + end + ")";
    }
}
