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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResourceStateCommandEncoder")
public interface MTLResourceStateCommandEncoder extends MTLCommandEncoder {
    /**
     * @method updateFence:
     * @abstract Update the fence to capture all GPU work so far enqueued by this encoder.
     * @discussion The fence is updated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * @method updateTextureMapping:indirectBuffer:indirectBufferOffset:
     * @abstract Updates mapping for given sparse texture. Updates are driven via a MTLBuffer with the structure format defined by MTLMapIndirectBufferFormat.
     * 
     *  struct MTLMapIndirectBufferFormat{
     *      uint32_t numMappings;
     *      MTLMapIndirectArguments mappings[numMappings]; 
     *  }
     */
    @Generated
    @Selector("updateTextureMapping:mode:indirectBuffer:indirectBufferOffset:")
    void updateTextureMappingModeIndirectBufferIndirectBufferOffset(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer,
            @NUInt long indirectBufferOffset);

    /**
     * @method updateTextureMapping:region:mipLevel:slice:mode:
     * @abstract Updates mapping for given sparse texture
     */
    @Generated
    @Selector("updateTextureMapping:mode:region:mipLevel:slice:")
    void updateTextureMappingModeRegionMipLevelSlice(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);

    /**
     * @method updateTextureMappings:regions:mipLevels:slices:numRegions:mode:
     * @abstract Updates multiple regions within a sparse texture.
     */
    @Generated
    @Selector("updateTextureMappings:mode:regions:mipLevels:slices:numRegions:")
    void updateTextureMappingsModeRegionsMipLevelsSlicesNumRegions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long mode, @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion regions,
            ConstNUIntPtr mipLevels, ConstNUIntPtr slices, @NUInt long numRegions);

    /**
     * @method waitForFence:
     * @abstract Prevent further GPU work until the fence is reached.
     * @discussion The fence is evaluated at kernel submision to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);
}