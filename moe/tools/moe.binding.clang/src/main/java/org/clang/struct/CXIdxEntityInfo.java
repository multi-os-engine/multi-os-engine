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

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.ConstPtr;

@Generated
@Structure()
public final class CXIdxEntityInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxEntityInfo() {
        super(CXIdxEntityInfo.class);
    }

    @Generated
    protected CXIdxEntityInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int kind();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setKind(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int templateKind();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTemplateKind(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int lang();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLang(int value);

    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native String name();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setName(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native String USR();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUSR(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @ByValue
    public native CXCursor cursor();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCursor(@ByValue CXCursor value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @ReferenceInfo(type = CXIdxAttrInfo.class, depth = 2)
    public native ConstPtr<ConstPtr<CXIdxAttrInfo>> attributes();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setAttributes(ConstPtr<ConstPtr<CXIdxAttrInfo>> value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int numAttributes();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setNumAttributes(int value);
}
