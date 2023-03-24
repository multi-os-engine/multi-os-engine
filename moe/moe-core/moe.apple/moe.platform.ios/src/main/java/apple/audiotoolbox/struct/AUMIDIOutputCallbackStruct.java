package apple.audiotoolbox.struct;

import apple.coreaudiotypes.struct.AudioTimeStamp;
import apple.coremidi.struct.MIDIPacketList;
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
public final class AUMIDIOutputCallbackStruct extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public AUMIDIOutputCallbackStruct() {
        super(AUMIDIOutputCallbackStruct.class);
    }

    @Generated
    protected AUMIDIOutputCallbackStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    public AUMIDIOutputCallbackStruct(
            @FunctionPtr(name = "call_midiOutputCallback") @NotNull Function_midiOutputCallback midiOutputCallback,
            @Nullable VoidPtr userData) {
        super(AUMIDIOutputCallbackStruct.class);
        setMidiOutputCallback(midiOutputCallback);
        setUserData(userData);
    }

    @NotNull
    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_midiOutputCallback")
    public native Function_midiOutputCallback midiOutputCallback();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_midiOutputCallback {
        @Generated
        int call_midiOutputCallback(@Nullable VoidPtr arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") AudioTimeStamp arg1,
                int arg2,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MIDIPacketList arg3);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMidiOutputCallback(
            @NotNull @FunctionPtr(name = "call_midiOutputCallback") Function_midiOutputCallback value);

    @Nullable
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native VoidPtr userData();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUserData(@Nullable VoidPtr value);
}