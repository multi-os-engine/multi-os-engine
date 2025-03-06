package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class rpc_signature extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public rpc_signature() {
        super(rpc_signature.class);
    }

    @Generated
    protected rpc_signature(Pointer peer) {
        super(peer);
    }

    @Generated
    public rpc_signature(@ByValue rpc_routine_descriptor rd, @ByValue rpc_routine_arg_descriptor rad) {
        super(rpc_signature.class);
        setRd(rd);
        setRad(rad);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native rpc_routine_descriptor rd();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRd(@ByValue rpc_routine_descriptor value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native rpc_routine_arg_descriptor rad();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRad(@ByValue rpc_routine_arg_descriptor value);
}