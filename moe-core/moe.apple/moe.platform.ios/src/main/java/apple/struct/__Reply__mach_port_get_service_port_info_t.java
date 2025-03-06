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
public final class __Reply__mach_port_get_service_port_info_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__mach_port_get_service_port_info_t() {
        super(__Reply__mach_port_get_service_port_info_t.class);
    }

    @Generated
    protected __Reply__mach_port_get_service_port_info_t(Pointer peer) {
        super(peer);
    }

    @Generated
    public __Reply__mach_port_get_service_port_info_t(@ByValue mach_msg_header_t Head, @ByValue NDR_record_t NDR,
            int RetCode, @ByValue mach_service_port_info sp_info_out) {
        super(__Reply__mach_port_get_service_port_info_t.class);
        setHead(Head);
        setNDR(NDR);
        setRetCode(RetCode);
        setSp_info_out(sp_info_out);
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
    @ByValue
    public native mach_service_port_info sp_info_out();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setSp_info_out(@ByValue mach_service_port_info value);
}