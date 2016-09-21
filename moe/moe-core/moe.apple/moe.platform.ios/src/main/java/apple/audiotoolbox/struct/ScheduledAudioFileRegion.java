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

import apple.coreaudio.struct.AudioTimeStamp;
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

@Generated
@Structure()
public final class ScheduledAudioFileRegion extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public ScheduledAudioFileRegion() {
        super(ScheduledAudioFileRegion.class);
    }

    @Generated
    protected ScheduledAudioFileRegion(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native AudioTimeStamp mTimeStamp();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMTimeStamp(@ByValue AudioTimeStamp value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_mCompletionProc")
    public native Function_mCompletionProc mCompletionProc();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMCompletionProc(@FunctionPtr(name = "call_mCompletionProc") Function_mCompletionProc value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr mCompletionProcUserData();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMCompletionProcUserData(VoidPtr value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native VoidPtr mAudioFile();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMAudioFile(VoidPtr value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int mLoopCount();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMLoopCount(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long mStartFrame();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMStartFrame(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int mFramesToPlay();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMFramesToPlay(int value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_mCompletionProc {
        @Generated
        void call_mCompletionProc(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") ScheduledAudioFileRegion arg1,
                int arg2);
    }
}
