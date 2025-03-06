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
public final class __Reply__processor_set_stack_usage_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__processor_set_stack_usage_t() {
        super(__Reply__processor_set_stack_usage_t.class);
    }

    @Generated
    protected __Reply__processor_set_stack_usage_t(Pointer peer) {
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
    public native int ltotal();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setLtotal(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long space();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setSpace(@NUInt long value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long resident();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setResident(@NUInt long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    @NUInt
    public native long maxusage();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMaxusage(@NUInt long value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    @NUInt
    public native long maxstack();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMaxstack(@NUInt long value);
}