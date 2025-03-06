package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class zone_name extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public zone_name() {
        super(zone_name.class);
    }

    @Generated
    protected zone_name(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 80)
    public native byte zn_name(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 80)
    public native void setZn_name(byte value, int field_idx);
}