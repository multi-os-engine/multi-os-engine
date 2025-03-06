package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class __Reply__vm_remap_new_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__vm_remap_new_t() {
        super(__Reply__vm_remap_new_t.class);
    }

    @Generated
    protected __Reply__vm_remap_new_t(Pointer peer) {
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
    @NUInt
    public native long target_address();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTarget_address(@NUInt long value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int cur_protection();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setCur_protection(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int max_protection();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMax_protection(int value);
}