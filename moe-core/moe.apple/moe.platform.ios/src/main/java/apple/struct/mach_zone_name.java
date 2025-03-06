package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_zone_name extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_zone_name() {
        super(mach_zone_name.class);
    }

    @Generated
    protected mach_zone_name(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 80)
    public native byte mzn_name(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 80)
    public native void setMzn_name(byte value, int field_idx);
}