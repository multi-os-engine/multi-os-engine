package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTL4TimestampHeapEntry extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4TimestampHeapEntry() {
        super(MTL4TimestampHeapEntry.class);
    }

    @Generated
    protected MTL4TimestampHeapEntry(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTL4TimestampHeapEntry(long timestamp) {
        super(MTL4TimestampHeapEntry.class);
        setTimestamp(timestamp);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long timestamp();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setTimestamp(long value);
}