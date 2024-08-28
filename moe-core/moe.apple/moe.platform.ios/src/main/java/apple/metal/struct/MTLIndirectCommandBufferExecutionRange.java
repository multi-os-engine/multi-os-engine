package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLIndirectCommandBufferExecutionRange extends StructObject {
    static {
        NatJ.register();
    }

    private static long __natjCache;

    @Generated
    public MTLIndirectCommandBufferExecutionRange() {
        super(MTLIndirectCommandBufferExecutionRange.class);
    }

    @Generated
    protected MTLIndirectCommandBufferExecutionRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLIndirectCommandBufferExecutionRange(int location, int length) {
        super(MTLIndirectCommandBufferExecutionRange.class);
        setLocation(location);
        setLength(length);
    }

    @Generated
    @StructureField(order = 0, isGetter = true)
    public native int location();

    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setLocation(int value);

    @Generated
    @StructureField(order = 1, isGetter = true)
    public native int length();

    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(int value);
}