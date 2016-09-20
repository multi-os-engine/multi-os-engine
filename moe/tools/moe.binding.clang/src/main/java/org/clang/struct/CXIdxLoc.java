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
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;

@Generated
@Structure()
public final class CXIdxLoc extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxLoc() {
        super(CXIdxLoc.class);
    }

    @Generated
    protected CXIdxLoc(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 2)
    public native VoidPtr ptr_data(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 2)
    public native void setPtr_data(VoidPtr value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int int_data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInt_data(int value);

    /* Comfort java methods */
    public VoidPtr getFileLocation() {
        @SuppressWarnings("unchecked") Ptr<VoidPtr> file_ref = (Ptr<VoidPtr>)PtrFactory
                .newPointerPtr(Void.class, 2, 1, true, false);
        clang.clang_indexLoc_getFileLocation(this, null, file_ref, null, null, null);
        return file_ref.get();
    }
}
