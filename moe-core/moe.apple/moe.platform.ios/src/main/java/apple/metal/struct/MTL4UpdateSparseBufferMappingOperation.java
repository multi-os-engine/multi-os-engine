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
public final class MTL4UpdateSparseBufferMappingOperation extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4UpdateSparseBufferMappingOperation() {
        super(MTL4UpdateSparseBufferMappingOperation.class);
    }

    @Generated
    protected MTL4UpdateSparseBufferMappingOperation(Pointer peer) {
        super(peer);
    }

    @Generated
    public MTL4UpdateSparseBufferMappingOperation(@NUInt long mode, @ByValue NSRange bufferRange,
            @NUInt long heapOffset) {
        super(MTL4UpdateSparseBufferMappingOperation.class);
        setMode(mode);
        setBufferRange(bufferRange);
        setHeapOffset(heapOffset);
    }

    /**
     * The mode of the mapping operation to perform.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeMap``,
     * Metal walks the tiles in the range in buffer offset order, assigning the
     * next tile from the heap in increasing order, starting at ``heapOffset``.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeUnmap``,
     * Metal unmaps the tiles in the range, and ignores the value of member ``heapOffset``.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long mode();

    /**
     * The mode of the mapping operation to perform.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeMap``,
     * Metal walks the tiles in the range in buffer offset order, assigning the
     * next tile from the heap in increasing order, starting at ``heapOffset``.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeUnmap``,
     * Metal unmaps the tiles in the range, and ignores the value of member ``heapOffset``.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMode(@NUInt long value);

    /**
     * The range in the buffer, in tiles.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native NSRange bufferRange();

    /**
     * The range in the buffer, in tiles.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setBufferRange(@ByValue NSRange value);

    /**
     * The starting offset in the heap, in tiles.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long heapOffset();

    /**
     * The starting offset in the heap, in tiles.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setHeapOffset(@NUInt long value);
}