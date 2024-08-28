package apple.coremidi.struct;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class MIDISysexSendRequestUMP extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MIDISysexSendRequestUMP() {
        super(MIDISysexSendRequestUMP.class);
    }

    @Generated
    protected MIDISysexSendRequestUMP(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int destination();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setDestination(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NotNull
    public native IntPtr words();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setWords(@NotNull IntPtr value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int wordsToSend();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setWordsToSend(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native byte complete();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setComplete(byte value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @FunctionPtr(name = "call_completionProc")
    @NotNull
    public native Function_completionProc completionProc();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_completionProc {
        @Generated
        void call_completionProc(
                @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MIDISysexSendRequestUMP arg0);
    }

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCompletionProc(
            @FunctionPtr(name = "call_completionProc") @NotNull Function_completionProc value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @Nullable
    public native VoidPtr completionRefCon();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setCompletionRefCon(@Nullable VoidPtr value);
}