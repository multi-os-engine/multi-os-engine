package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure(alignment = 4)
public final class MTLPackedFloat3 extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    protected MTLPackedFloat3(Pointer peer) {
        super(peer);
    }
}