package apple.metal.struct;

import org.moe.natj.c.StructObject;
import org.moe.natj.c.ann.Structure;
import org.moe.natj.c.ann.StructureField;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;

@Generated
@Structure()
public final class MTL4BufferRange extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4BufferRange() {
        super(MTL4BufferRange.class);
    }

    @Generated
    protected MTL4BufferRange(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTL4BufferRange(long bufferAddress, long length) {
        super(MTL4BufferRange.class);
        setBufferAddress(bufferAddress);
        setLength(length);
    }

    /**
     * Buffer address returned by the gpuAddress property of an MTLBuffer plus any offset into the buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    public native long bufferAddress();

    /**
     * Buffer address returned by the gpuAddress property of an MTLBuffer plus any offset into the buffer
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setBufferAddress(long value);

    /**
     * Length of the region which begins at the given address. If the length is not known, a value of
     * (uint64_t)-1 represents the range from the given address to the end of the buffer.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    public native long length();

    /**
     * Length of the region which begins at the given address. If the length is not known, a value of
     * (uint64_t)-1 represents the range from the given address to the end of the buffer.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setLength(long value);
}