package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTLIntersectionFunctionBufferArguments extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTLIntersectionFunctionBufferArguments() {
        super(MTLIntersectionFunctionBufferArguments.class);
    }

    @Generated
    protected MTLIntersectionFunctionBufferArguments(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTLIntersectionFunctionBufferArguments(long intersectionFunctionBuffer, long intersectionFunctionBufferSize,
            long intersectionFunctionStride) {
        super(MTLIntersectionFunctionBufferArguments.class);
        setIntersectionFunctionBuffer(intersectionFunctionBuffer);
        setIntersectionFunctionBufferSize(intersectionFunctionBufferSize);
        setIntersectionFunctionStride(intersectionFunctionStride);
    }

    /**
     * The GPU resource ID of the buffer containing intersection-function handles.
     * Required to be aligned to 8 bytes.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long intersectionFunctionBuffer();

    /**
     * The GPU resource ID of the buffer containing intersection-function handles.
     * Required to be aligned to 8 bytes.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setIntersectionFunctionBuffer(long value);

    /**
     * The maximum range in bytes of intersectionFunctionBuffer that can be used
     * for ray tracing.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long intersectionFunctionBufferSize();

    /**
     * The maximum range in bytes of intersectionFunctionBuffer that can be used
     * for ray tracing.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setIntersectionFunctionBufferSize(long value);

    /**
     * The stride between intersection function entries in intersectionFunctionBuffer.
     * The stride needs to be either 0 or aligned to 8 bytes. Note that only the first 12
     * bits of this value are used by Metal.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    public native long intersectionFunctionStride();

    /**
     * The stride between intersection function entries in intersectionFunctionBuffer.
     * The stride needs to be either 0 or aligned to 8 bytes. Note that only the first 12
     * bits of this value are used by Metal.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setIntersectionFunctionStride(long value);
}