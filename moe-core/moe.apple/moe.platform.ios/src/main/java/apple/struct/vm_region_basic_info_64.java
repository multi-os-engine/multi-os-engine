package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class vm_region_basic_info_64 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_region_basic_info_64() {
        super(vm_region_basic_info_64.class);
    }

    @Generated
    protected vm_region_basic_info_64(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int protection();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProtection(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int max_protection();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMax_protection(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int inheritance();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInheritance(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int shared();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setShared(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int reserved();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setReserved(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long offset();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setOffset(long value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int behavior();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setBehavior(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native char user_wired_count();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setUser_wired_count(char value);
}