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
import org.clang.opaque.CXTranslationUnit;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CXToken extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXToken() {
        super(CXToken.class);
    }

    @Generated
    protected CXToken(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 4)
    public native int int_data(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 4)
    public native void setInt_data(int value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr ptr_data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setPtr_data(VoidPtr value);

    /* Comfort java methods */
    public int getTokenKind() {
        return clang.clang_getTokenKind(this);
    }

    public CXString getTokenSpelling(CXTranslationUnit tu) {
        return clang.clang_getTokenSpelling(tu, this);
    }
}
