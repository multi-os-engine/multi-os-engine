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
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;

@Generated
@Structure()
public final class CXSourceLocation extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXSourceLocation() {
        super(CXSourceLocation.class);
    }

    @Generated
    protected CXSourceLocation(Pointer peer) {
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
    public native int int_data();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setInt_data(int value);

    /* Comfort java methods */
    public VoidPtr getFile() {
        @SuppressWarnings("unchecked") Ptr<VoidPtr> file_ref = (Ptr<VoidPtr>)PtrFactory.newPointerPtr(Void.class, 2, 1,
                true, false);
        clang.clang_getExpansionLocation(this, file_ref, null, null, null);
        VoidPtr file = file_ref.get();
        return file;
    }

    public CXSourceRange getRange(CXSourceLocation end) {
        return clang.clang_getRange(this, end);
    }

    public void getExpansionLocation(Ptr<VoidPtr> file, IntPtr line, IntPtr column, IntPtr offset) {
        clang.clang_getExpansionLocation(this, file, line, column, offset);
    }

    @Override
    public String toString() {
        @SuppressWarnings("unchecked") Ptr<VoidPtr> fileRef = (Ptr<VoidPtr>)PtrFactory.newPointerPtr(Void.class, 2, 1,
                true, false);
        IntPtr lineRef = PtrFactory.newIntReference();
        IntPtr colRef = PtrFactory.newIntReference();
        getExpansionLocation(fileRef, lineRef, colRef, null);
        CXString fileName = clang.clang_getFileName(fileRef.get());

        return "CXSourceLocation(" + fileName + ":" + lineRef.get() + ":" + colRef.get() + ")";
    }
}
