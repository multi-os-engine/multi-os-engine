package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure(alignment = 4)
public final class vm_info_object extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_info_object() {
        super(vm_info_object.class);
    }

    @Generated
    protected vm_info_object(Pointer peer) {
        super(peer);
    }

    /**
     * this object
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int vio_object();

    /**
     * this object
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVio_object(int value);

    /**
     * object size (valid if internal - but too small)
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int vio_size();

    /**
     * object size (valid if internal - but too small)
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVio_size(int value);

    /**
     * number of references
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int vio_ref_count();

    /**
     * number of references
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setVio_ref_count(int value);

    /**
     * number of resident pages
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int vio_resident_page_count();

    /**
     * number of resident pages
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setVio_resident_page_count(int value);

    /**
     * number requested but not filled
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int vio_absent_count();

    /**
     * number requested but not filled
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setVio_absent_count(int value);

    /**
     * copy object
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int vio_copy();

    /**
     * copy object
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setVio_copy(int value);

    /**
     * shadow object
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int vio_shadow();

    /**
     * shadow object
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setVio_shadow(int value);

    /**
     * offset into shadow object
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int vio_shadow_offset();

    /**
     * offset into shadow object
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setVio_shadow_offset(int value);

    /**
     * offset into memory object
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int vio_paging_offset();

    /**
     * offset into memory object
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setVio_paging_offset(int value);

    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int vio_copy_strategy();

    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setVio_copy_strategy(int value);

    /**
     * offset of last allocation
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    @NUInt
    public native long vio_last_alloc();

    /**
     * offset of last allocation
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setVio_last_alloc(@NUInt long value);

    /**
     * many random attributes
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int vio_paging_in_progress();

    /**
     * many random attributes
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setVio_paging_in_progress(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native int vio_pager_created();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setVio_pager_created(int value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native int vio_pager_initialized();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setVio_pager_initialized(int value);

    @Generated
    @StructureField(order = 14, isGetter = true)
    public native int vio_pager_ready();

    @Generated
    @StructureField(order = 14, isGetter = false)
    public native void setVio_pager_ready(int value);

    @Generated
    @StructureField(order = 15, isGetter = true)
    public native int vio_can_persist();

    @Generated
    @StructureField(order = 15, isGetter = false)
    public native void setVio_can_persist(int value);

    @Generated
    @StructureField(order = 16, isGetter = true)
    public native int vio_internal();

    @Generated
    @StructureField(order = 16, isGetter = false)
    public native void setVio_internal(int value);

    @Generated
    @StructureField(order = 17, isGetter = true)
    public native int vio_temporary();

    @Generated
    @StructureField(order = 17, isGetter = false)
    public native void setVio_temporary(int value);

    @Generated
    @StructureField(order = 18, isGetter = true)
    public native int vio_alive();

    @Generated
    @StructureField(order = 18, isGetter = false)
    public native void setVio_alive(int value);

    @Generated
    @StructureField(order = 19, isGetter = true)
    public native int vio_purgable();

    @Generated
    @StructureField(order = 19, isGetter = false)
    public native void setVio_purgable(int value);

    @Generated
    @StructureField(order = 20, isGetter = true)
    public native int vio_purgable_volatile();

    @Generated
    @StructureField(order = 20, isGetter = false)
    public native void setVio_purgable_volatile(int value);
}