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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Structure()
public final class AudioOutputUnitMIDICallbacks extends StructObject {
    private static long __natjCache;

    static {
        NatJ.register();
    }

    @Generated
    public AudioOutputUnitMIDICallbacks() {
        super(AudioOutputUnitMIDICallbacks.class);
    }

    @Generated
    protected AudioOutputUnitMIDICallbacks(Pointer peer) {
        super(peer);
    }

    @Generated
    public AudioOutputUnitMIDICallbacks(@Nullable VoidPtr userData,
            @FunctionPtr(name = "call_MIDIEventProc") @NotNull Function_MIDIEventProc MIDIEventProc,
            @FunctionPtr(name = "call_MIDISysExProc") @NotNull Function_MIDISysExProc MIDISysExProc) {
        super(AudioOutputUnitMIDICallbacks.class);
        setUserData(userData);
        setMIDIEventProc(MIDIEventProc);
        setMIDISysExProc(MIDISysExProc);
    }

    @Nullable
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr userData();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setUserData(@Nullable VoidPtr value);

    /**
     * see MusicDeviceMIDIEvent, MusicDeviceSysEx
     */
    @NotNull
    @Generated
    @StructureField(order = 1, isGetter = true)
    @FunctionPtr(name = "call_MIDIEventProc")
    public native Function_MIDIEventProc MIDIEventProc();

    /**
     * see MusicDeviceMIDIEvent, MusicDeviceSysEx
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMIDIEventProc(
            @NotNull @FunctionPtr(name = "call_MIDIEventProc") Function_MIDIEventProc value);

    @NotNull
    @Generated
    @StructureField(order = 2, isGetter = true)
    @FunctionPtr(name = "call_MIDISysExProc")
    public native Function_MIDISysExProc MIDISysExProc();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMIDISysExProc(
            @NotNull @FunctionPtr(name = "call_MIDISysExProc") Function_MIDISysExProc value);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MIDIEventProc {
        @Generated
        void call_MIDIEventProc(@Nullable VoidPtr arg0, int arg1, int arg2, int arg3, int arg4);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_MIDISysExProc {
        @Generated
        void call_MIDISysExProc(@Nullable VoidPtr arg0,
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg1,
                int arg2);
    }
}
