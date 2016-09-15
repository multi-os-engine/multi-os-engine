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

package apple.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;

@Generated
@Structure()
public final class sigvec extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public sigvec() {
        super(sigvec.class);
    }

    @Generated
    protected sigvec(Pointer peer) {
        super(peer);
    }

    @Generated
    public sigvec(@FunctionPtr(name = "call_sv_handler") Function_sv_handler sv_handler, int sv_mask, int sv_flags) {
        super(sigvec.class);
        setSv_handler(sv_handler);
        setSv_mask(sv_mask);
        setSv_flags(sv_flags);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSv_handler(@FunctionPtr(name = "call_sv_handler") Function_sv_handler value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_sv_handler {
        @Generated
        void call_sv_handler(int arg0);
    }

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int sv_mask();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSv_mask(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int sv_flags();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSv_flags(int value);

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_sv_handler")
    public native Function_sv_handler sv_handler();
}
