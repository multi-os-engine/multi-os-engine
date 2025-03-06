package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_core_details_v2 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_core_details_v2() {
        super(mach_core_details_v2.class);
    }

    @Generated
    protected mach_core_details_v2(Pointer peer) {
        super(peer);
    }

    /**
     * See the MACH_CORE_DETAILS_V2_FLAG_* definitions
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long flags();

    /**
     * See the MACH_CORE_DETAILS_V2_FLAG_* definitions
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFlags(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long offset();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setOffset(long value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long length();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLength(long value);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 16)
    public native byte core_name(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 16)
    public native void setCore_name(byte value, int field_idx);
}