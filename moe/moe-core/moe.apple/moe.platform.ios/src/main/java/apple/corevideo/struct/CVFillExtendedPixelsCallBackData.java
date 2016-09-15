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

package apple.corevideo.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class CVFillExtendedPixelsCallBackData extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public CVFillExtendedPixelsCallBackData() {
        super(CVFillExtendedPixelsCallBackData.class);
    }

    @Generated
    protected CVFillExtendedPixelsCallBackData(Pointer peer) {
        super(peer);
    }

    @Generated
    public CVFillExtendedPixelsCallBackData(@NInt long version,
            @FunctionPtr(name = "call_fillCallBack") Function_fillCallBack fillCallBack, VoidPtr refCon) {
        super(CVFillExtendedPixelsCallBackData.class);
        setVersion(version);
        setFillCallBack(fillCallBack);
        setRefCon(refCon);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @NInt
    public native long version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(@NInt long value);

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFillCallBack(@FunctionPtr(name = "call_fillCallBack") Function_fillCallBack value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_fillCallBack {
        @Generated
        byte call_fillCallBack(VoidPtr arg0, VoidPtr arg1);
    }

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr refCon();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRefCon(VoidPtr value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_fillCallBack")
    public native Function_fillCallBack fillCallBack();
}
