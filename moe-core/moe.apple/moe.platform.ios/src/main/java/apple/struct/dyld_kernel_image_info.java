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
public final class dyld_kernel_image_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public dyld_kernel_image_info() {
        super(dyld_kernel_image_info.class);
    }

    @Generated
    protected dyld_kernel_image_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true, count = 16)
    public native byte uuid(int field_idx);

    @Generated
    @StructureField(order = 0, isGetter = false, count = 16)
    public native void setUuid(byte value, int field_idx);

    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native fsobj_id fsobjid();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFsobjid(@ByValue fsobj_id value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    @ByValue
    public native fsid fsid();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setFsid(@ByValue fsid value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long load_addr();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setLoad_addr(long value);
}