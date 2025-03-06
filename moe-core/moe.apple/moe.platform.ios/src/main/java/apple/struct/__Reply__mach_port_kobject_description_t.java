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
public final class __Reply__mach_port_kobject_description_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Reply__mach_port_kobject_description_t() {
        super(__Reply__mach_port_kobject_description_t.class);
    }

    @Generated
    protected __Reply__mach_port_kobject_description_t(Pointer peer) {
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
    public native int object_type();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setObject_type(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long object_addr();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setObject_addr(@NUInt long value);

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int descriptionOffset();

    /**
     * MiG doesn't use it
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setDescriptionOffset(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int descriptionCnt();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setDescriptionCnt(int value);

    @Generated
    @StructureField(order = 7, isGetter = true, count = 512)
    public native byte description(int field_idx);

    @Generated
    @StructureField(order = 7, isGetter = false, count = 512)
    public native void setDescription(byte value, int field_idx);
}