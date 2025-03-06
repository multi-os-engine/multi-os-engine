package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class vm_info_region extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public vm_info_region() {
        super(vm_info_region.class);
    }

    @Generated
    protected vm_info_region(Pointer peer) {
        super(peer);
    }

    /**
     * start of region
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int vir_start();

    /**
     * start of region
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setVir_start(int value);

    /**
     * end of region
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int vir_end();

    /**
     * end of region
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setVir_end(int value);

    /**
     * the mapped object
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int vir_object();

    /**
     * the mapped object
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setVir_object(int value);

    /**
     * offset into object
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int vir_offset();

    /**
     * offset into object
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setVir_offset(int value);

    /**
     * does object need to be copied?
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int vir_needs_copy();

    /**
     * does object need to be copied?
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setVir_needs_copy(int value);

    /**
     * protection code
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int vir_protection();

    /**
     * protection code
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setVir_protection(int value);

    /**
     * maximum protection
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int vir_max_protection();

    /**
     * maximum protection
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setVir_max_protection(int value);

    /**
     * inheritance
     */
    @Generated
    @StructureField(order = 7, isGetter = true)
    public native int vir_inheritance();

    /**
     * inheritance
     */
    @Generated
    @StructureField(order = 7, isGetter = false)
    public native void setVir_inheritance(int value);

    /**
     * number of times wired
     */
    @Generated
    @StructureField(order = 8, isGetter = true)
    public native int vir_wired_count();

    /**
     * number of times wired
     */
    @Generated
    @StructureField(order = 8, isGetter = false)
    public native void setVir_wired_count(int value);

    /**
     * number of times user has wired
     */
    @Generated
    @StructureField(order = 9, isGetter = true)
    public native int vir_user_wired_count();

    /**
     * number of times user has wired
     */
    @Generated
    @StructureField(order = 9, isGetter = false)
    public native void setVir_user_wired_count(int value);
}