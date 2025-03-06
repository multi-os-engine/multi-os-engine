package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ipc_info_space_basic extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ipc_info_space_basic() {
        super(ipc_info_space_basic.class);
    }

    @Generated
    protected ipc_info_space_basic(Pointer peer) {
        super(peer);
    }

    /**
     * generation number mask
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int iisb_genno_mask();

    /**
     * generation number mask
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIisb_genno_mask(int value);

    /**
     * size of table
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iisb_table_size();

    /**
     * size of table
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIisb_table_size(int value);

    /**
     * next possible size of table (UNUSED)
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int iisb_table_next();

    /**
     * next possible size of table (UNUSED)
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIisb_table_next(int value);

    /**
     * number of entries in use
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int iisb_table_inuse();

    /**
     * number of entries in use
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIisb_table_inuse(int value);

    /**
     * future expansion
     */
    @Generated
    @StructureField(order = 4, isGetter = true, count = 2)
    public native int iisb_reserved(int field_idx);

    /**
     * future expansion
     */
    @Generated
    @StructureField(order = 4, isGetter = false, count = 2)
    public native void setIisb_reserved(int value, int field_idx);
}