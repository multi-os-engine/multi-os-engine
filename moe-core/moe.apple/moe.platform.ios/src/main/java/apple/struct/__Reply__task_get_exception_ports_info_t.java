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
public final class __Reply__task_get_exception_ports_info_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__task_get_exception_ports_info_t() {
        super(__Reply__task_get_exception_ports_info_t.class);
    }

    @Generated
    protected __Reply__task_get_exception_ports_info_t(Pointer peer) {
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
    public native int masksCnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMasksCnt(int value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 32)
    public native int masks(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 32)
    public native void setMasks(int value, int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = true, count = 32)
    @ByValue
    public native ipc_info_port old_handlers_info(int field_idx);

    @Generated
    @StructureField(order = 5, isGetter = false, count = 32)
    public native void setOld_handlers_info(@ByValue ipc_info_port value, int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = true, count = 32)
    public native int old_behaviors(int field_idx);

    @Generated
    @StructureField(order = 6, isGetter = false, count = 32)
    public native void setOld_behaviors(int value, int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 32)
    public native int old_flavors(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 32)
    public native void setOld_flavors(int value, int field_idx);
}