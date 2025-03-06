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
public final class __Reply__mach_port_peek_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__mach_port_peek_t() {
        super(__Reply__mach_port_peek_t.class);
    }

    @Generated
    protected __Reply__mach_port_peek_t(Pointer peer) {
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
    public native int request_seqnop();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setRequest_seqnop(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int msg_sizep();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMsg_sizep(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int msg_idp();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMsg_idp(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int trailer_infopCnt();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setTrailer_infopCnt(int value);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 68)
    public native byte trailer_infop(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 68)
    public native void setTrailer_infop(byte value, int field_idx);
}