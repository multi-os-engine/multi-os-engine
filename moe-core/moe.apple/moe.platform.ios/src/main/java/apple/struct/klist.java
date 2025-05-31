package apple.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class klist extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public klist() {
        super(klist.class);
    }

    @Generated
    protected klist(Pointer peer) {
        super(peer);
    }

    @Generated
    public klist(VoidPtr slh_first) {
        super(klist.class);
        setSlh_first(slh_first);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native VoidPtr slh_first();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSlh_first(VoidPtr value);
}