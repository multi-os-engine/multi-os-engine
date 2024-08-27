package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLCounterResultTimestamp extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLCounterResultTimestamp() {
        super(MTLCounterResultTimestamp.class);
    }

    @Generated
    protected MTLCounterResultTimestamp(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLCounterResultTimestamp(long timestamp) {
        super(MTLCounterResultTimestamp.class);
        setTimestamp(timestamp);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long timestamp();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTimestamp(long value);
}