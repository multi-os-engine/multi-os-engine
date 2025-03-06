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
public final class __Request__task_set_info_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__task_set_info_t() {
        super(__Request__task_set_info_t.class);
    }

    @Generated
    protected __Request__task_set_info_t(Pointer peer) {
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
    public native int flavor();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFlavor(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int task_info_inCnt();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTask_info_inCnt(int value);

    @Generated
    @StructureField(order = 4, isGetter = true, count = 94)
    public native int task_info_in(int field_idx);

    @Generated
    @StructureField(order = 4, isGetter = false, count = 94)
    public native void setTask_info_in(int value, int field_idx);
}