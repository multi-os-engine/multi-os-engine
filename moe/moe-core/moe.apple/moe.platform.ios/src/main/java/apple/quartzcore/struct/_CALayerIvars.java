package apple.quartzcore.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class _CALayerIvars extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public _CALayerIvars() {
        super(_CALayerIvars.class);
    }

    @Generated
    protected _CALayerIvars(Pointer peer) {
        super(peer);
    }

    @Generated
    public _CALayerIvars(int refcount, int magic, VoidPtr layer) {
        super(_CALayerIvars.class);
        setRefcount(refcount);
        setMagic(magic);
        setLayer(layer);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int refcount();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setRefcount(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int magic();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setMagic(int value);

    @Generated
    @StructureField(order = 2, isGetter = true)
    public native VoidPtr layer();

    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setLayer(VoidPtr value);
}