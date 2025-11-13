package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLDispatchThreadsIndirectArguments extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLDispatchThreadsIndirectArguments() {
        super(MTLDispatchThreadsIndirectArguments.class);
    }

    @Generated
    protected MTLDispatchThreadsIndirectArguments(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 3)
    public native int threadsPerGrid(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 3)
    public native void setThreadsPerGrid(int value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 3)
    public native int threadsPerThreadgroup(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 3)
    public native void setThreadsPerThreadgroup(int value, int field_idx);
}