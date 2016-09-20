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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.ConstPtr;

@Generated
@Structure()
public final class CXIdxObjCProtocolRefListInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public CXIdxObjCProtocolRefListInfo() {
        super(CXIdxObjCProtocolRefListInfo.class);
    }

    @Generated
    protected CXIdxObjCProtocolRefListInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    public CXIdxObjCProtocolRefListInfo(ConstPtr<ConstPtr<CXIdxObjCProtocolRefInfo>> protocols, int numProtocols) {
        super(CXIdxObjCProtocolRefListInfo.class);
        setProtocols(protocols);
        setNumProtocols(numProtocols);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ReferenceInfo(type = CXIdxObjCProtocolRefInfo.class, depth = 2)
    public native ConstPtr<ConstPtr<CXIdxObjCProtocolRefInfo>> protocols();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProtocols(ConstPtr<ConstPtr<CXIdxObjCProtocolRefInfo>> value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int numProtocols();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNumProtocols(int value);
}
