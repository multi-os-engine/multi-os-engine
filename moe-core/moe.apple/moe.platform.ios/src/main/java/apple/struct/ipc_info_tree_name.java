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
public final class ipc_info_tree_name extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public ipc_info_tree_name() {
        super(ipc_info_tree_name.class);
    }

    @Generated
    protected ipc_info_tree_name(Pointer peer) {
        super(peer);
    }

    @Generated
    public ipc_info_tree_name(@ByValue ipc_info_name iitn_name, int iitn_lchild, int iitn_rchild) {
        super(ipc_info_tree_name.class);
        setIitn_name(iitn_name);
        setIitn_lchild(iitn_lchild);
        setIitn_rchild(iitn_rchild);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native ipc_info_name iitn_name();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIitn_name(@ByValue ipc_info_name value);

    /**
     * name of left child
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int iitn_lchild();

    /**
     * name of left child
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIitn_lchild(int value);

    /**
     * name of right child
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native int iitn_rchild();

    /**
     * name of right child
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIitn_rchild(int value);
}