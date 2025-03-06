package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class host_load_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public host_load_info() {
        super(host_load_info.class);
    }

    @Generated
    protected host_load_info(Pointer peer) {
        super(peer);
    }

    /**
     * scaled by LOAD_SCALE
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 3)
    public native int avenrun(int field_idx);

    /**
     * scaled by LOAD_SCALE
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 3)
    public native void setAvenrun(int value, int field_idx);

    /**
     * scaled by LOAD_SCALE
     */
    @Generated
    @StructureField(order = 1, isGetter = true, count = 3)
    public native int mach_factor(int field_idx);

    /**
     * scaled by LOAD_SCALE
     */
    @Generated
    @StructureField(order = 1, isGetter = false, count = 3)
    public native void setMach_factor(int value, int field_idx);
}