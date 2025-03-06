package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ipc_info_name extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ipc_info_name() {
        super(ipc_info_name.class);
    }

    @Generated
    protected ipc_info_name(Pointer peer) {
        super(peer);
    }

    /**
     * port name, including gen number
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int iin_name();

    /**
     * port name, including gen number
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIin_name(int value);

    /**
     * collision at this entry?
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iin_collision();

    /**
     * collision at this entry?
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIin_collision(int value);

    /**
     * straight port type
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int iin_type();

    /**
     * straight port type
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIin_type(int value);

    /**
     * user-references
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int iin_urefs();

    /**
     * user-references
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIin_urefs(int value);

    /**
     * object pointer/identifier
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int iin_object();

    /**
     * object pointer/identifier
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIin_object(int value);

    /**
     * marequest/next in free list
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int iin_next();

    /**
     * marequest/next in free list
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIin_next(int value);

    /**
     * hash index
     */
    @Generated
    @StructureField(order = 6, isGetter = true)
    public native int iin_hash();

    /**
     * hash index
     */
    @Generated
    @StructureField(order = 6, isGetter = false)
    public native void setIin_hash(int value);
}