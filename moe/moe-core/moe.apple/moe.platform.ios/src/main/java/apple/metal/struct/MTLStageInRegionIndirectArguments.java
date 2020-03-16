package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLStageInRegionIndirectArguments extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLStageInRegionIndirectArguments() {
        super(MTLStageInRegionIndirectArguments.class);
    }

    @Generated
    protected MTLStageInRegionIndirectArguments(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 3)
    public native int stageInOrigin(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 3)
    public native void setStageInOrigin(int value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true, count = 3)
    public native int stageInSize(int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = false, count = 3)
    public native void setStageInSize(int value, int field_idx);
}