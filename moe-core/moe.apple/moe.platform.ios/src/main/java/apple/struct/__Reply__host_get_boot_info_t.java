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
public final class __Reply__host_get_boot_info_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__host_get_boot_info_t() {
        super(__Reply__host_get_boot_info_t.class);
    }

    @Generated
    protected __Reply__host_get_boot_info_t(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native mach_msg_header_t Head();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setHead(@ByValue mach_msg_header_t value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native NDR_record_t NDR();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setNDR(@ByValue NDR_record_t value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int RetCode();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setRetCode(int value);

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int boot_infoOffset();

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setBoot_infoOffset(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int boot_infoCnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setBoot_infoCnt(int value);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 4096)
    public native byte boot_info(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 4096)
    public native void setBoot_info(byte value, int field_idx);
}