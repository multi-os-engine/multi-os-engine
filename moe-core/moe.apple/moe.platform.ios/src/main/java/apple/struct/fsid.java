package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fsid extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public fsid() {
        super(fsid.class);
    }

    @Generated
    protected fsid(Pointer peer) {
        super(peer);
    }

    /**
     * file system id type
     */
    @Generated
    @StructureField(order = 0, isGetter = true, count = 2)
    public native int val(int field_idx);

    /**
     * file system id type
     */
    @Generated
    @StructureField(order = 0, isGetter = false, count = 2)
    public native void setVal(int value, int field_idx);
}