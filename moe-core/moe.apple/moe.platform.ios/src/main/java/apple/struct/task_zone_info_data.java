package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class task_zone_info_data extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public task_zone_info_data() {
        super(task_zone_info_data.class);
    }

    @Generated
    protected task_zone_info_data(Pointer peer) {
        super(peer);
    }

    /**
     * count of elements in use
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long tzi_count();

    /**
     * count of elements in use
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTzi_count(long value);

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long tzi_cur_size();

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTzi_cur_size(long value);

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long tzi_max_size();

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTzi_max_size(long value);

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long tzi_elem_size();

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTzi_elem_size(long value);

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native long tzi_alloc_size();

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setTzi_alloc_size(long value);

    /**
     * sum of all allocs (life of zone)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native long tzi_sum_size();

    /**
     * sum of all allocs (life of zone)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setTzi_sum_size(long value);

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native long tzi_exhaustible();

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setTzi_exhaustible(long value);

    /**
     * garbage collect elements?
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native long tzi_collectable();

    /**
     * garbage collect elements?
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setTzi_collectable(long value);

    /**
     * charged to caller (or kernel)
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native long tzi_caller_acct();

    /**
     * charged to caller (or kernel)
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setTzi_caller_acct(long value);

    /**
     * sum of all allocs by this task
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native long tzi_task_alloc();

    /**
     * sum of all allocs by this task
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setTzi_task_alloc(long value);

    /**
     * sum of all frees by this task
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native long tzi_task_free();

    /**
     * sum of all frees by this task
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setTzi_task_free(long value);
}