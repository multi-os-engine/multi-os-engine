package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class __Request__task_register_dyld_shared_cache_image_info_t extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public __Request__task_register_dyld_shared_cache_image_info_t() {
        super(__Request__task_register_dyld_shared_cache_image_info_t.class);
    }

    @Generated
    protected __Request__task_register_dyld_shared_cache_image_info_t(Pointer peer) {
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
    @ByValue
    public native dyld_kernel_image_info dyld_cache_image();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setDyld_cache_image(@ByValue dyld_kernel_image_info value);

    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int no_cache();

    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setNo_cache(int value);

    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int private_cache();

    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setPrivate_cache(int value);
}