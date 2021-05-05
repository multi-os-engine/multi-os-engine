package apple.metalperformanceshaders.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MPSNDArrayOffsets extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MPSNDArrayOffsets() {
        super(MPSNDArrayOffsets.class);
    }

    @Generated
    protected MPSNDArrayOffsets(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native long dimensions(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setDimensions(long value, int field_idx);
}