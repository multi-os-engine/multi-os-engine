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
public final class __Reply__mach_port_get_attributes_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__mach_port_get_attributes_t() {
        super(__Reply__mach_port_get_attributes_t.class);
    }

    @Generated
    protected __Reply__mach_port_get_attributes_t(Pointer peer) {
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

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int port_info_outCnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPort_info_outCnt(int value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 17)
    public native int port_info_out(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 17)
    public native void setPort_info_out(int value, int field_idx);
}