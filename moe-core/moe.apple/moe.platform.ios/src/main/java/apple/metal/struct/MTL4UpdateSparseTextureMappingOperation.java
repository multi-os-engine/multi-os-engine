package apple.metal.struct;

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
public final class MTL4UpdateSparseTextureMappingOperation extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4UpdateSparseTextureMappingOperation() {
        super(MTL4UpdateSparseTextureMappingOperation.class);
    }

    @Generated
    protected MTL4UpdateSparseTextureMappingOperation(Pointer peer) {
        super(peer);
    }

    /**
     * The mode of the mapping operation to perform.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeMap``,
     * Metal walks the tiles in the region in X, Y, then Z order, assigning the next
     * tile from the heap in increasing order, starting at ``heapOffset``.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeUnmap``,
     * Metal unmaps the tiles in the region, ignoring the contents of member ``heapOffset``.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @NUInt
    public native long mode();

    /**
     * The mode of the mapping operation to perform.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeMap``,
     * Metal walks the tiles in the region in X, Y, then Z order, assigning the next
     * tile from the heap in increasing order, starting at ``heapOffset``.
     * 
     * When mode is ``MTLSparseTextureMappingMode/MTLSparseTextureMappingModeUnmap``,
     * Metal unmaps the tiles in the region, ignoring the contents of member ``heapOffset``.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setMode(@NUInt long value);

    /**
     * The region in the texture to update, in tiles.
     * 
     * When ``textureLevel`` is equal to the texture's ``MTLTexture/firstMipmapInTail``,
     * set `origin.y` to `0` and `size.height` to `1`.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @ByValue
    public native MTLRegion textureRegion();

    /**
     * The region in the texture to update, in tiles.
     * 
     * When ``textureLevel`` is equal to the texture's ``MTLTexture/firstMipmapInTail``,
     * set `origin.y` to `0` and `size.height` to `1`.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setTextureRegion(@ByValue MTLRegion value);

    /**
     * The index of the mipmap level in the texture to update.
     * 
     * Provide a value between `0` and the texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long textureLevel();

    /**
     * The index of the mipmap level in the texture to update.
     * 
     * Provide a value between `0` and the texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setTextureLevel(@NUInt long value);

    /**
     * The index of the array slice in the texture to update.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @NUInt
    public native long textureSlice();

    /**
     * The index of the array slice in the texture to update.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setTextureSlice(@NUInt long value);

    /**
     * The starting offset in the heap, in tiles.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long heapOffset();

    /**
     * The starting offset in the heap, in tiles.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setHeapOffset(@NUInt long value);
}