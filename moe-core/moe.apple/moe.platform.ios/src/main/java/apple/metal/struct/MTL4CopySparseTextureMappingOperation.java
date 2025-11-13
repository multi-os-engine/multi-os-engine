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
public final class MTL4CopySparseTextureMappingOperation extends StructObject {
    static {
        NatJ.register();
    }
    private static long __natjCache;

    @Generated
    public MTL4CopySparseTextureMappingOperation() {
        super(MTL4CopySparseTextureMappingOperation.class);
    }

    @Generated
    protected MTL4CopySparseTextureMappingOperation(Pointer peer) {
        super(peer);
    }

    /**
     * The region in the source texture, in tiles.
     * 
     * The tiles remain mapped in the source texture.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set `origin.y` to `0` and `size.height` to `1`.
     */
    @Generated
    @StructureField(order = 0, isGetter = true)
    @ByValue
    public native MTLRegion sourceRegion();

    /**
     * The region in the source texture, in tiles.
     * 
     * The tiles remain mapped in the source texture.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set `origin.y` to `0` and `size.height` to `1`.
     */
    @Generated
    @StructureField(order = 0, isGetter = false)
    public native void setSourceRegion(@ByValue MTLRegion value);

    /**
     * The index of the mipmap level in the source texture.
     * 
     * Provide a value between `0` and the source texture's ``MTLTexture/firstMipmapInTail``.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set ``destinationLevel`` to the destination texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 1, isGetter = true)
    @NUInt
    public native long sourceLevel();

    /**
     * The index of the mipmap level in the source texture.
     * 
     * Provide a value between `0` and the source texture's ``MTLTexture/firstMipmapInTail``.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set ``destinationLevel`` to the destination texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 1, isGetter = false)
    public native void setSourceLevel(@NUInt long value);

    /**
     * The index of the array slice in the texture source of the copy operation.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 2, isGetter = true)
    @NUInt
    public native long sourceSlice();

    /**
     * The index of the array slice in the texture source of the copy operation.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 2, isGetter = false)
    public native void setSourceSlice(@NUInt long value);

    /**
     * The origin in the destination texture to copy into, in tiles.
     * 
     * The X, Y and Z coordinates of the tiles relative to the origin match the same
     * coordinates in the source region.
     * 
     * When ``destinationLevel`` is equal to the destination texture's ``MTLTexture/firstMipmapInTail``,
     * set `destinationOrigin.y` to `0`.
     */
    @Generated
    @StructureField(order = 3, isGetter = true)
    @ByValue
    public native MTLOrigin destinationOrigin();

    /**
     * The origin in the destination texture to copy into, in tiles.
     * 
     * The X, Y and Z coordinates of the tiles relative to the origin match the same
     * coordinates in the source region.
     * 
     * When ``destinationLevel`` is equal to the destination texture's ``MTLTexture/firstMipmapInTail``,
     * set `destinationOrigin.y` to `0`.
     */
    @Generated
    @StructureField(order = 3, isGetter = false)
    public native void setDestinationOrigin(@ByValue MTLOrigin value);

    /**
     * The index of the mipmap level in the destination texture.
     * 
     * Provide a value between `0` and the destination texture's ``MTLTexture/firstMipmapInTail``.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set ``destinationLevel`` to the destination texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 4, isGetter = true)
    @NUInt
    public native long destinationLevel();

    /**
     * The index of the mipmap level in the destination texture.
     * 
     * Provide a value between `0` and the destination texture's ``MTLTexture/firstMipmapInTail``.
     * 
     * When ``sourceLevel`` is equal to the source texture's ``MTLTexture/firstMipmapInTail``,
     * set ``destinationLevel`` to the destination texture's ``MTLTexture/firstMipmapInTail``.
     */
    @Generated
    @StructureField(order = 4, isGetter = false)
    public native void setDestinationLevel(@NUInt long value);

    /**
     * The index of the array slice in the destination texture to copy into.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 5, isGetter = true)
    @NUInt
    public native long destinationSlice();

    /**
     * The index of the array slice in the destination texture to copy into.
     * 
     * Provide `0` in this member if the texture type is not an array.
     */
    @Generated
    @StructureField(order = 5, isGetter = false)
    public native void setDestinationSlice(@NUInt long value);
}