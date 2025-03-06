package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class ipc_info_space extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ipc_info_space() {
        super(ipc_info_space.class);
    }

    @Generated
    protected ipc_info_space(Pointer peer) {
        super(peer);
    }

    /**
     * generation number mask
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int iis_genno_mask();

    /**
     * generation number mask
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIis_genno_mask(int value);

    /**
     * size of table
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iis_table_size();

    /**
     * size of table
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIis_table_size(int value);

    /**
     * next possible size of table (UNUSED)
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int iis_table_next();

    /**
     * next possible size of table (UNUSED)
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIis_table_next(int value);

    /**
     * size of tree (UNUSED)
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    public native int iis_tree_size();

    /**
     * size of tree (UNUSED)
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setIis_tree_size(int value);

    /**
     * # of small entries in tree (UNUSED)
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    public native int iis_tree_small();

    /**
     * # of small entries in tree (UNUSED)
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setIis_tree_small(int value);

    /**
     * # of hashed entries in tree (UNUSED)
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    public native int iis_tree_hash();

    /**
     * # of hashed entries in tree (UNUSED)
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setIis_tree_hash(int value);
}