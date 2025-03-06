package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class fsobj_id extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public fsobj_id() {
        super(fsobj_id.class);
    }

    @Generated
    protected fsobj_id(Pointer peer) {
        super(peer);
    }

    @Generated
    public fsobj_id(int fid_objno, int fid_generation) {
        super(fsobj_id.class);
        setFid_objno(fid_objno);
        setFid_generation(fid_generation);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int fid_objno();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setFid_objno(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int fid_generation();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setFid_generation(int value);
}