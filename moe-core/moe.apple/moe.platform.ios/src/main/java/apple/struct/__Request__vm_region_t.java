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
public final class __Request__vm_region_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__vm_region_t() {
        super(__Request__vm_region_t.class);
    }

    @Generated
    protected __Request__vm_region_t(Pointer peer) {
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
    @NUInt
    public native long address();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setAddress(@NUInt long value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int flavor();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setFlavor(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int infoCnt();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setInfoCnt(int value);
}