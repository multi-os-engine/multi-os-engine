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

import apple.coreaudiotypes.struct.AudioBufferList;
import apple.coreaudiotypes.struct.AudioTimeStamp;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class ScheduledAudioSlice extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public ScheduledAudioSlice() {
        super(ScheduledAudioSlice.class);
    }

    @Generated
    protected ScheduledAudioSlice(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AudioTimeStamp mTimeStamp();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMTimeStamp(@ByValue AudioTimeStamp value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_mCompletionProc")
    public native Function_mCompletionProc mCompletionProc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMCompletionProc(
            @Nullable @FunctionPtr(name = "call_mCompletionProc") Function_mCompletionProc value);

    @NotNull
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr mCompletionProcUserData();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMCompletionProcUserData(@NotNull VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int mFlags();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMFlags(int value);

    /**
     * must be 0
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mReserved();

    /**
     * must be 0
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMReserved(int value);

    /**
     * for internal use
     */
    @Nullable
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native VoidPtr mReserved2();

    /**
     * for internal use
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMReserved2(@Nullable VoidPtr value);

    /**
     * must be consistent with byte count of mBufferList
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mNumberFrames();

    /**
     * must be consistent with byte count of mBufferList
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMNumberFrames(int value);

    /**
     * must contain deinterleaved Float32
     */
    @NotNull
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native AudioBufferList mBufferList();

    /**
     * must contain deinterleaved Float32
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMBufferList(@NotNull AudioBufferList value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mCompletionProc {
        @Generated
        void call_mCompletionProc(@Nullable VoidPtr arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") ScheduledAudioSlice arg1);
    }
}
