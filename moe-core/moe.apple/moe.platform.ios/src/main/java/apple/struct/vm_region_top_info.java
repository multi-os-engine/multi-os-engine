package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_region_top_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_region_top_info() {
        super(vm_region_top_info.class);
    }

    @Generated
    protected vm_region_top_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int obj_id();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setObj_id(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int ref_count();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setRef_count(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int private_pages_resident();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setPrivate_pages_resident(int value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int shared_pages_resident();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setShared_pages_resident(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte share_mode();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setShare_mode(byte value);
}