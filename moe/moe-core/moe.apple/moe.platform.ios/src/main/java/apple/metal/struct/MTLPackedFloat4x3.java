package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLPackedFloat4x3 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLPackedFloat4x3() {
        super(MTLPackedFloat4x3.class);
    }

    @Generated
    protected MTLPackedFloat4x3(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 4)
    @ByValue
    public native MTLPackedFloat3 columns(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 4)
    public native void setColumns(@ByValue MTLPackedFloat3 value, int field_idx);
}