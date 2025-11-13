package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class vm_region_submap_short_info_64 extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_region_submap_short_info_64() {
        super(vm_region_submap_short_info_64.class);
    }

    @Generated
    protected vm_region_submap_short_info_64(Pointer peer) {
        super(peer);
    }

    /**
     * present access protection
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int protection();

    /**
     * present access protection
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setProtection(int value);

    /**
     * max avail through vm_prot
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int max_protection();

    /**
     * max avail through vm_prot
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMax_protection(int value);

    /**
     * behavior of map/obj on fork
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int inheritance();

    /**
     * behavior of map/obj on fork
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setInheritance(int value);

    /**
     * offset into object/map
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native long offset();

    /**
     * offset into object/map
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setOffset(long value);

    /**
     * user tag on map entry
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int user_tag();

    /**
     * user tag on map entry
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setUser_tag(int value);

    /**
     * obj/map mappers, etc
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int ref_count();

    /**
     * obj/map mappers, etc
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setRef_count(int value);

    /**
     * only for obj
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native char shadow_depth();

    /**
     * only for obj
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setShadow_depth(char value);

    /**
     * only for obj
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native byte external_pager();

    /**
     * only for obj
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setExternal_pager(byte value);

    /**
     * see enumeration
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native byte share_mode();

    /**
     * see enumeration
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setShare_mode(byte value);

    /**
     * submap vs obj
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int is_submap();

    /**
     * submap vs obj
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setIs_submap(int value);

    /**
     * access behavior hint
     */
    @Generated
    @StructureField(order = 10, isGetter = true)
    public native int behavior();

    /**
     * access behavior hint
     */
    @Generated
    @StructureField(order = 10, isGetter = false)
    public native void setBehavior(int value);

    /**
     * obj/map name, not a handle
     */
    @Generated
    @StructureField(order = 11, isGetter = true)
    public native int object_id();

    /**
     * obj/map name, not a handle
     */
    @Generated
    @StructureField(order = 11, isGetter = false)
    public native void setObject_id(int value);

    @Generated
    @StructureField(order = 12, isGetter = true)
    public native char user_wired_count();

    @Generated
    @StructureField(order = 12, isGetter = false)
    public native void setUser_wired_count(char value);

    @Generated
    @StructureField(order = 13, isGetter = true)
    public native char flags();

    @Generated
    @StructureField(order = 13, isGetter = false)
    public native void setFlags(char value);
}