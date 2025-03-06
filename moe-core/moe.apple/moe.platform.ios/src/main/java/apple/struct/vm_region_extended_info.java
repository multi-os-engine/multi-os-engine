package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_region_extended_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_region_extended_info() {
        super(vm_region_extended_info.class);
    }

    @Generated
    protected vm_region_extended_info(Pointer peer) {
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
    public native int user_tag();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setUser_tag(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int pages_resident();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPages_resident(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int pages_shared_now_private();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setPages_shared_now_private(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int pages_swapped_out();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPages_swapped_out(int value);

    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int pages_dirtied();

    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setPages_dirtied(int value);

    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int ref_count();

    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setRef_count(int value);

    @Generated
    @StructureField(order = 7, isGetter = true)
    public native char shadow_depth();

    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setShadow_depth(char value);

    @Generated
    @StructureField(order = 8, isGetter = true)
    public native byte external_pager();

    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setExternal_pager(byte value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native byte share_mode();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setShare_mode(byte value);

    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int pages_reusable();

    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setPages_reusable(int value);
}