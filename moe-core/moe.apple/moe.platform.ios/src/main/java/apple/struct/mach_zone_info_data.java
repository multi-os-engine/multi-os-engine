package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class mach_zone_info_data extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public mach_zone_info_data() {
        super(mach_zone_info_data.class);
    }

    @Generated
    protected mach_zone_info_data(Pointer peer) {
        super(peer);
    }

    /**
     * count of elements in use
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long mzi_count();

    /**
     * count of elements in use
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMzi_count(long value);

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long mzi_cur_size();

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMzi_cur_size(long value);

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long mzi_max_size();

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setMzi_max_size(long value);

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long mzi_elem_size();

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setMzi_elem_size(long value);

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long mzi_alloc_size();

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setMzi_alloc_size(long value);

    /**
     * sum of all allocs (life of zone)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long mzi_sum_size();

    /**
     * sum of all allocs (life of zone)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setMzi_sum_size(long value);

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long mzi_exhaustible();

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setMzi_exhaustible(long value);

    /**
     * garbage collect elements? and how much?
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long mzi_collectable();

    /**
     * garbage collect elements? and how much?
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setMzi_collectable(long value);
}