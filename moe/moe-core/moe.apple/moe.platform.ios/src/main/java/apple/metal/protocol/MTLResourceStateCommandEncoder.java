package apple.metal.protocol;

import apple.metal.struct.MTLRegion;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLSize;

/**
 * API-Since: 13.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResourceStateCommandEncoder")
public interface MTLResourceStateCommandEncoder extends MTLCommandEncoder {
    /**
     * updateFence:
     * 
     * Update the fence to capture all GPU work so far enqueued by this encoder.
     * 
     * The fence is updated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of
     * an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * updateTextureMapping:indirectBuffer:indirectBufferOffset:
     * 
     * Updates mapping for given sparse texture. Updates are driven via a MTLBuffer with the structure format defined by
     * MTLMapIndirectBufferFormat.
     * 
     * struct MTLMapIndirectBufferFormat{
     * uint32_t numMappings;
     * MTLMapIndirectArguments mappings[numMappings];
     * }
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:")
    void updateTextureMappingModeIndirectBufferIndirectBufferOffset(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer,
            @NUInt long indirectBufferOffset);

    /**
     * updateTextureMapping:region:mipLevel:slice:mode:
     * 
     * Updates mapping for given sparse texture
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("updateTextureMapping:mode:region:mipLevel:slice:")
    void updateTextureMappingModeRegionMipLevelSlice(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);

    /**
     * updateTextureMappings:regions:mipLevels:slices:numRegions:mode:
     * 
     * Updates multiple regions within a sparse texture.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("updateTextureMappings:mode:regions:mipLevels:slices:numRegions:")
    void updateTextureMappingsModeRegionsMipLevelsSlicesNumRegions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion regions,
            ConstNUIntPtr mipLevels, ConstNUIntPtr slices, @NUInt long numRegions);

    /**
     * waitForFence:
     * 
     * Prevent further GPU work until the fence is reached.
     * 
     * The fence is evaluated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of
     * an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * moveTextureMappingsFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:
     * 
     * Move sparse page mappings from one sparse texture to another from the same heap.
     * 
     * The tile mapping is moved from the source texture only if the destination texture tile is unmapped. The textures
     * must also have matching a texture format,
     * texture type, sample count, usage and resource options.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("moveTextureMappingsFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void moveTextureMappingsFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);
}
