package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_core_details extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_core_details() {
        super(mach_core_details.class);
    }

    @Generated
    protected mach_core_details(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long gzip_offset();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setGzip_offset(long value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long gzip_length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setGzip_length(long value);

    @Generated
    @StructureField(order = 2, isGetter = true, count = 16)
    public native byte core_name(int field_idx);

    @Generated
    @StructureField(order = 2, isGetter = false, count = 16)
    public native void setCore_name(byte value, int field_idx);
}