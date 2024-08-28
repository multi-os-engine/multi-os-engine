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
public final class MTLAxisAlignedBoundingBox extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLAxisAlignedBoundingBox() {
        super(MTLAxisAlignedBoundingBox.class);
    }

    @Generated
    protected MTLAxisAlignedBoundingBox(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLAxisAlignedBoundingBox(@ByValue MTLPackedFloat3 min, @ByValue MTLPackedFloat3 max) {
        super(MTLAxisAlignedBoundingBox.class);
        setMin(min);
        setMax(max);
    }

    /**
     * Minimum point
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 min();

    /**
     * Minimum point
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMin(@ByValue MTLPackedFloat3 value);

    /**
     * Maximum point
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MTLPackedFloat3 max();

    /**
     * Maximum point
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMax(@ByValue MTLPackedFloat3 value);
}