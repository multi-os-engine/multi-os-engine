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

package apple.audiotoolbox.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class HostCallbackInfo extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public HostCallbackInfo() {
        super(HostCallbackInfo.class);
    }

    @Generated
    protected HostCallbackInfo(Pointer peer) {
        super(peer);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr hostUserData();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHostUserData(@Nullable VoidPtr value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_beatAndTempoProc")
    public native Function_beatAndTempoProc beatAndTempoProc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBeatAndTempoProc(
            @Nullable @FunctionPtr(name = "call_beatAndTempoProc") Function_beatAndTempoProc value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_musicalTimeLocationProc")
    public native Function_musicalTimeLocationProc musicalTimeLocationProc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMusicalTimeLocationProc(
            @Nullable @FunctionPtr(name = "call_musicalTimeLocationProc") Function_musicalTimeLocationProc value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call_transportStateProc")
    public native Function_transportStateProc transportStateProc();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTransportStateProc(
            @Nullable @FunctionPtr(name = "call_transportStateProc") Function_transportStateProc value);

    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_transportStateProc2")
    public native Function_transportStateProc2 transportStateProc2();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTransportStateProc2(
            @Nullable @FunctionPtr(name = "call_transportStateProc2") Function_transportStateProc2 value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_beatAndTempoProc {
        @Generated
        int call_beatAndTempoProc(@Nullable VoidPtr arg0, @Nullable DoublePtr arg1, @Nullable DoublePtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_musicalTimeLocationProc {
        @Generated
        int call_musicalTimeLocationProc(@Nullable VoidPtr arg0, @Nullable IntPtr arg1, @Nullable FloatPtr arg2,
                @Nullable IntPtr arg3, @Nullable DoublePtr arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_transportStateProc {
        @Generated
        int call_transportStateProc(@Nullable VoidPtr arg0, @Nullable BytePtr arg1, @Nullable BytePtr arg2,
                @Nullable DoublePtr arg3, @Nullable BytePtr arg4, @Nullable DoublePtr arg5, @Nullable DoublePtr arg6);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_transportStateProc2 {
        @Generated
        int call_transportStateProc2(@Nullable VoidPtr arg0, @Nullable BytePtr arg1, @Nullable BytePtr arg2,
                @Nullable BytePtr arg3, @Nullable DoublePtr arg4, @Nullable BytePtr arg5, @Nullable DoublePtr arg6,
                @Nullable DoublePtr arg7);
    }
}
