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
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class CXIdxAttrInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxAttrInfo() {
        super(CXIdxAttrInfo.class);
    }

    @Generated
    protected CXIdxAttrInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXIdxAttrInfo(int kind, @ByValue CXCursor cursor, @ByValue CXIdxLoc loc) {
        super(CXIdxAttrInfo.class);
        setKind(kind);
        setCursor(cursor);
        setLoc(loc);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int kind();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKind(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native CXCursor cursor();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setCursor(@ByValue CXCursor value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native CXIdxLoc loc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLoc(@ByValue CXIdxLoc value);

    /* Comfort java methods */
    public CXIdxIBOutletCollectionAttrInfo getIBOutletCollectionAttrInfo() {
        return clang.clang_index_getIBOutletCollectionAttrInfo(this);
    }
}
