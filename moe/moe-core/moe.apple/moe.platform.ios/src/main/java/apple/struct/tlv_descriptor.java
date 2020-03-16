package apple.struct;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class tlv_descriptor extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public tlv_descriptor() {
        super(tlv_descriptor.class);
    }

    @Generated
    protected tlv_descriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    public tlv_descriptor(@FunctionPtr(name = "call_thunk") Function_thunk thunk, @NUInt long key, @NUInt long offset) {
        super(tlv_descriptor.class);
        setThunk(thunk);
        setKey(key);
        setOffset(offset);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @FunctionPtr(name = "call_thunk")
    public native Function_thunk thunk();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_thunk {
        @Generated
        VoidPtr call_thunk(@UncertainArgument("Options: reference, array Fallback: reference") tlv_descriptor arg0);
    }

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setThunk(@FunctionPtr(name = "call_thunk") Function_thunk value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long key();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setKey(@NUInt long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long offset();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setOffset(@NUInt long value);
}