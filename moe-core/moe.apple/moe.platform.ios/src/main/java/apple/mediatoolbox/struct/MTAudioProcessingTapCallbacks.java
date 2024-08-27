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

package apple.mediatoolbox.struct;

import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioStreamBasicDescription;
import apple.mediatoolbox.opaque.MTAudioProcessingTapRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure(alignment = 4)
public final class MTAudioProcessingTapCallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public MTAudioProcessingTapCallbacks() {
        super(MTAudioProcessingTapCallbacks.class);
    }

    @Generated
    protected MTAudioProcessingTapCallbacks(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int version();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVersion(int value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr clientInfo();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setClientInfo(@Nullable VoidPtr value);

    @Nullable
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_init")
    public native Function_init init();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInit(@Nullable @FunctionPtr(name = "call_init") Function_init value);

    @Nullable
    @Generated
    @StructureField(order = 3, isGetter = true)
    @FunctionPtr(name = "call__finalize")
    public native Function__finalize _finalize();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void set_finalize(@Nullable @FunctionPtr(name = "call__finalize") Function__finalize value);

    @Nullable
    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_prepare")
    public native Function_prepare prepare();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPrepare(@Nullable @FunctionPtr(name = "call_prepare") Function_prepare value);

    @Nullable
    @Generated
    @StructureField(order = 5, isGetter = true)
    @FunctionPtr(name = "call_unprepare")
    public native Function_unprepare unprepare();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setUnprepare(@Nullable @FunctionPtr(name = "call_unprepare") Function_unprepare value);

    @NotNull
    @Generated
    @StructureField(order = 6, isGetter = true)
    @FunctionPtr(name = "call_process")
    public native Function_process process();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setProcess(@NotNull @FunctionPtr(name = "call_process") Function_process value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_init {
        @Generated
        void call_init(@NotNull MTAudioProcessingTapRef arg0, @Nullable VoidPtr arg1,
                @NotNull @ReferenceInfo(type = Void.class, depth = 2) Ptr<VoidPtr> arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function__finalize {
        @Generated
        void call__finalize(@NotNull MTAudioProcessingTapRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_prepare {
        @Generated
        void call_prepare(@NotNull MTAudioProcessingTapRef arg0, @NInt long arg1,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioStreamBasicDescription arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_unprepare {
        @Generated
        void call_unprepare(@NotNull MTAudioProcessingTapRef arg0);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_process {
        @Generated
        void call_process(@NotNull MTAudioProcessingTapRef arg0, @NInt long arg1, int arg2,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioBufferList arg3,
                @NotNull NIntPtr arg4, @NotNull IntPtr arg5);
    }
}
