package apple.metalperformanceshaders.protocol;

import apple.metal.protocol.MTLTexture;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Protocol dictating how texture allocator objects should operate so that they can be used
 * by an MPSSVGFDenoiser object to allocate and reuse intermediate and output textures during the
 * denoising process.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSSVGFTextureAllocator")
public interface MPSSVGFTextureAllocator {
    /**
     * Return a texture to the allocator. The allocator operate in such a way as to reduce the
     * allocation cost should another texture be requested with the same width, height, and pixel
     * format.
     */
    @Generated
    @Selector("returnTexture:")
    void returnTexture(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * Returns an autoreleased Metal 2D texture with a matching pixel format, width, and height.
     */
    @Nullable
    @Generated
    @Selector("textureWithPixelFormat:width:height:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture textureWithPixelFormatWidthHeight(@NUInt long pixelFormat, @NUInt long width, @NUInt long height);
}