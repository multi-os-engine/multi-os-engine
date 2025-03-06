package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class zone_info extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public zone_info() {
        super(zone_info.class);
    }

    @Generated
    protected zone_info(Pointer peer) {
        super(peer);
    }

    /**
     * Number of elements used now
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int zi_count();

    /**
     * Number of elements used now
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setZi_count(int value);

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long zi_cur_size();

    /**
     * current memory utilization
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setZi_cur_size(@NUInt long value);

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long zi_max_size();

    /**
     * how large can this zone grow
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setZi_max_size(@NUInt long value);

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long zi_elem_size();

    /**
     * size of an element
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setZi_elem_size(@NUInt long value);

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long zi_alloc_size();

    /**
     * size used for more memory
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setZi_alloc_size(@NUInt long value);

    /**
     * zone pageable?
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int zi_pageable();

    /**
     * zone pageable?
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setZi_pageable(int value);

    /**
     * sleep if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int zi_sleepable();

    /**
     * sleep if empty?
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setZi_sleepable(int value);

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int zi_exhaustible();

    /**
     * merely return if empty?
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setZi_exhaustible(int value);

    /**
     * garbage collect elements?
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int zi_collectable();

    /**
     * garbage collect elements?
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setZi_collectable(int value);
}