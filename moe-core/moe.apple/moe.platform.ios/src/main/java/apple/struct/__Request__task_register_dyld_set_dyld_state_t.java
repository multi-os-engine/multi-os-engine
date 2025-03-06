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
public final class __Request__task_register_dyld_set_dyld_state_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__task_register_dyld_set_dyld_state_t() {
        super(__Request__task_register_dyld_set_dyld_state_t.class);
    }

    @Generated
    protected __Request__task_register_dyld_set_dyld_state_t(Pointer peer) {
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
    public native byte dyld_state();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDyld_state(byte value);

    @Generated
    @StructureField(order = 3, isGetter = true, count = 3)
    public native byte dyld_statePad(int field_idx);

    @Generated
    @StructureField(order = 3, isGetter = false, count = 3)
    public native void setDyld_statePad(byte value, int field_idx);
}