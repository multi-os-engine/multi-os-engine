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
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXType extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXType() {
        super(CXType.class);
    }

    @Generated
    protected CXType(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int kind();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKind(int value);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 2)
    public native VoidPtr data(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 2)
    public native void setData(VoidPtr value, int field_idx);

    /* Comfort java methods */
    public CXType getCanonicalType() {
        return clang.clang_getCanonicalType(this);
    }

    public long getAlignOf() {
        return clang.clang_Type_getAlignOf(this);
    }

    public CXString getTypeSpelling() {
        return clang.clang_getTypeSpelling(this);
    }

    public boolean isConstQualifiedType() {
        return clang.clang_isConstQualifiedType(this) != 0;
    }

    public CXCursor getTypeDeclaration() {
        return clang.clang_getTypeDeclaration(this);
    }

    public CXType getPointeeType() {
        return clang.clang_getPointeeType(this);
    }

    public CXType getArrayElementType() {
        return clang.clang_getArrayElementType(this);
    }

    public long getArraySize() {
        return clang.clang_getArraySize(this);
    }

    public CXType getNamedType() {
        return clang.clang_Type_getNamedType(this);
    }

    public int getNumArgTypes() {
        return clang.clang_getNumArgTypes(this);
    }

    public CXType getArgType(int idx) {
        return clang.clang_getArgType(this, idx);
    }

    public CXType getResultType() {
        return clang.clang_getResultType(this);
    }

    public int isFunctionTypeVariadic() {
        return clang.clang_isFunctionTypeVariadic(this);
    }
}
