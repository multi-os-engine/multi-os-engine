package apple.metal.struct;

import apple.foundation.struct.NSRange;
import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
@Structure()
public final class MTL4CopySparseBufferMappingOperation extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4CopySparseBufferMappingOperation() {
        super(MTL4CopySparseBufferMappingOperation.class);
    }

    @Generated
    protected MTL4CopySparseBufferMappingOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTL4CopySparseBufferMappingOperation(@ByValue NSRange sourceRange, @NUInt long destinationOffset) {
        super(MTL4CopySparseBufferMappingOperation.class);
        setSourceRange(sourceRange);
        setDestinationOffset(destinationOffset);
    }

    /**
     * The range in the source buffer, in tiles.
     * 
     * The tiles remain mapped in the source buffer.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native NSRange sourceRange();

    /**
     * The range in the source buffer, in tiles.
     * 
     * The tiles remain mapped in the source buffer.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSourceRange(@ByValue NSRange value);

    /**
     * The origin in the destination buffer, in tiles.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long destinationOffset();

    /**
     * The origin in the destination buffer, in tiles.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setDestinationOffset(@NUInt long value);
}