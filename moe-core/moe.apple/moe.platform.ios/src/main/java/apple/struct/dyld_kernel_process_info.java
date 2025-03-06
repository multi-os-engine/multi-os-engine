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
public final class dyld_kernel_process_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public dyld_kernel_process_info() {
        super(dyld_kernel_process_info.class);
    }

    @Generated
    protected dyld_kernel_process_info(Pointer peer) {
        super(peer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native dyld_kernel_image_info cache_image_info();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setCache_image_info(@ByValue dyld_kernel_image_info value);

    /**
     * mach_absolute_time of last time dyld change to image list
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long timestamp();

    /**
     * mach_absolute_time of last time dyld change to image list
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTimestamp(long value);

    /**
     * number of images currently loaded into process
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int imageCount();

    /**
     * number of images currently loaded into process
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setImageCount(int value);

    /**
     * number of images statically loaded into process (before any dlopen() calls)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int initialImageCount();

    /**
     * number of images statically loaded into process (before any dlopen() calls)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setInitialImageCount(int value);

    /**
     * one of dyld_process_state_* values
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native byte dyldState();

    /**
     * one of dyld_process_state_* values
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDyldState(byte value);

    /**
     * process is running without a dyld cache
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int no_cache();

    /**
     * process is running without a dyld cache
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setNo_cache(int value);

    /**
     * process is using a private copy of its dyld cache
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int private_cache();

    /**
     * process is using a private copy of its dyld cache
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setPrivate_cache(int value);
}