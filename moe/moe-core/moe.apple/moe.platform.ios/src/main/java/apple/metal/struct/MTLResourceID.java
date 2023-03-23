package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLResourceID extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLResourceID() {
        super(MTLResourceID.class);
    }

    @Generated
    protected MTLResourceID(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLResourceID(long _impl) {
        super(MTLResourceID.class);
        set_impl(_impl);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long _impl();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void set_impl(long value);
}