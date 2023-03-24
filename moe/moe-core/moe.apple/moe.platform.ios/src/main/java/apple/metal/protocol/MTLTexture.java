/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metal.protocol;

import apple.coregraphics.opaque.IOSurfaceRef;
import apple.foundation.struct.NSRange;
import apple.metal.MTLSharedTextureHandle;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLTextureSwizzleChannels;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLTexture
 * 
 * MTLTexture represents a collection of 1D, 2D, or 3D images.
 * 
 * Each image in a texture is a 1D, 2D, 2DMultisample, or 3D image. The texture contains one or more images arranged in
 * a mipmap stack. If there are multiple mipmap stacks, each one is referred to as a slice of the texture. 1D, 2D,
 * 2DMultisample, and 3D textures have a single slice. In 1DArray and 2DArray textures, every slice is an array element.
 * A Cube texture always has 6 slices, one for each face. In a CubeArray texture, each set of six slices is one element
 * in the array.
 * 
 * Most APIs that operate on individual images in a texture address those images via a tuple of a Slice, and Mipmap
 * Level within that slice.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTexture")
public interface MTLTexture extends MTLResource {
    /**
     * [@property] arrayLength
     * 
     * The number of array elements in this MTLTexture.
     * 
     * For non-Array texture types, arrayLength is 1.
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    long arrayLength();

    /**
     * [@property] buffer
     * 
     * The buffer this texture view was created from, or nil if this is not a texture view or it was not created from a
     * buffer.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer buffer();

    /**
     * [@property] bufferBytesPerRow
     * 
     * The bytesPerRow of the buffer this texture view was created from, or 0 if this is not a texture view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("bufferBytesPerRow")
    @NUInt
    long bufferBytesPerRow();

    /**
     * [@property] bufferOffset
     * 
     * The offset of the buffer this texture view was created from, or 0 if this is not a texture view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("bufferOffset")
    @NUInt
    long bufferOffset();

    /**
     * [@property] depth
     * 
     * The depth of this MTLTexture instance in pixels.
     * 
     * If this MTLTexture is not a 3D texture, the depth is 1
     */
    @Generated
    @Selector("depth")
    @NUInt
    long depth();

    /**
     * getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:
     * 
     * Copies a block of pixels from a texture slice into the application's memory.
     */
    @Generated
    @Selector("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    void getBytesBytesPerRowBytesPerImageFromRegionMipmapLevelSlice(@NotNull VoidPtr pixelBytes,
            @NUInt long bytesPerRow, @NUInt long bytesPerImage, @ByValue MTLRegion region, @NUInt long level,
            @NUInt long slice);

    /**
     * getBytes:bytesPerRow:fromRegion:mipmapLevel:
     * 
     * Convenience for getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice: that doesn't require slice
     * related arguments
     */
    @Generated
    @Selector("getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    void getBytesBytesPerRowFromRegionMipmapLevel(@NotNull VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @ByValue MTLRegion region, @NUInt long level);

    /**
     * [@property] height
     * 
     * The height of the MTLTexture instance in pixels.
     * @discussion. height is 1 if the texture is 1D.
     */
    @Generated
    @Selector("height")
    @NUInt
    long height();

    /**
     * [@property] framebufferOnly
     * 
     * If YES, this texture can only be used with a MTLAttachmentDescriptor, and cannot be used as a texture argument
     * for MTLRenderCommandEncoder, MTLBlitCommandEncoder, or MTLComputeCommandEncoder. Furthermore, when this
     * property's value is YES, readPixels/writePixels may not be used with this texture.
     * 
     * Textures obtained from CAMetalDrawables may have this property set to YES, depending on the value of
     * frameBufferOnly passed to their parent CAMetalLayer. Textures created directly by the application will not have
     * any restrictions.
     */
    @Generated
    @Selector("isFramebufferOnly")
    boolean isFramebufferOnly();

    /**
     * [@property] mipmapLevelCount
     * 
     * The number of mipmap levels in each slice of this MTLTexture.
     */
    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    long mipmapLevelCount();

    /**
     * newTextureViewWithPixelFormat:
     * 
     * Create a new texture which shares the same storage as the source texture, but with a different (but compatible)
     * pixel format.
     */
    @Nullable
    @Generated
    @Selector("newTextureViewWithPixelFormat:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormat(@NUInt long pixelFormat);

    /**
     * newTextureViewWithPixelFormat:textureType:levels:slices:
     * 
     * Create a new texture which shares the same storage as the source texture, but with a different (but compatible)
     * pixel format, texture type, levels and slices.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormatTextureTypeLevelsSlices(@NUInt long pixelFormat, @NUInt long textureType,
            @ByValue NSRange levelRange, @ByValue NSRange sliceRange);

    /**
     * [@property] parentRelativeLevel
     * 
     * The base level of the texture this texture view was created from, or 0 if this is not a texture view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("parentRelativeLevel")
    @NUInt
    long parentRelativeLevel();

    /**
     * [@property] parentRelativeSlice
     * 
     * The base slice of the texture this texture view was created from, or 0 if this is not a texture view.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("parentRelativeSlice")
    @NUInt
    long parentRelativeSlice();

    /**
     * [@property] parentTexture
     * 
     * The texture this texture view was created from, or nil if this is not a texture view or it was not created from a
     * texture.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("parentTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture parentTexture();

    /**
     * [@property] pixelFormat
     * 
     * The MTLPixelFormat that is used to interpret this texture's contents.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    long pixelFormat();

    /**
     * replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:
     * 
     * Copy a block of pixel data from the caller's pointer into a texture slice.
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    void replaceRegionMipmapLevelSliceWithBytesBytesPerRowBytesPerImage(@ByValue MTLRegion region, @NUInt long level,
            @NUInt long slice, @NotNull ConstVoidPtr pixelBytes, @NUInt long bytesPerRow, @NUInt long bytesPerImage);

    /**
     * replaceRegion:mipmapLevel:withBytes:bytesPerRow:
     * 
     * Convenience for replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage: that doesn't require slice
     * related arguments
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    void replaceRegionMipmapLevelWithBytesBytesPerRow(@ByValue MTLRegion region, @NUInt long level,
            @NotNull ConstVoidPtr pixelBytes, @NUInt long bytesPerRow);

    /**
     * [@property] rootResource
     * 
     * The resource this texture was created from. It may be a texture or a buffer. If this texture is not reusing
     * storage of another MTLResource, then nil is returned.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use parentTexture or buffer instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("rootResource")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResource rootResource();

    /**
     * [@property] sampleCount
     * 
     * The number of samples in each pixel of this MTLTexture.
     * 
     * If this texture is any type other than 2DMultisample, samples is 1.
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    long sampleCount();

    /**
     * [@property] type
     * 
     * The type of this texture.
     */
    @Generated
    @Selector("textureType")
    @NUInt
    long textureType();

    /**
     * [@property] usage
     * 
     * Description of texture usage.
     */
    @Generated
    @Selector("usage")
    @NUInt
    long usage();

    /**
     * [@property] width
     * 
     * The width of the MTLTexture instance in pixels.
     */
    @Generated
    @Selector("width")
    @NUInt
    long width();

    /**
     * [@property] iosurface
     * 
     * If this texture was created from an IOSurface, this returns a reference to that IOSurface. iosurface is nil if
     * this texture was not created from an IOSurface.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("iosurface")
    IOSurfaceRef iosurface();

    /**
     * [@property] iosurfacePlane
     * 
     * If this texture was created from an IOSurface, this returns the plane of the IOSurface from which the texture was
     * created. iosurfacePlane is 0 if this texture was not created from an IOSurface.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("iosurfacePlane")
    @NUInt
    long iosurfacePlane();

    /**
     * [@property] allowGPUOptimizedContents
     * 
     * Allow GPU-optimization for the contents texture. The default value is true.
     * 
     * Useful for opting-out of GPU-optimization when implicit optimization (e.g. RT writes) is regressing CPU-read-back
     * performance. See the documentation for optimizeContentsForGPUAccess: and optimizeContentsForCPUAccess: APIs.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("allowGPUOptimizedContents")
    boolean allowGPUOptimizedContents();

    /**
     * [@property] firstMipmapInTail
     * 
     * For sparse textures this property returns index of first mipmap that is packed in tail.
     * Mapping this mipmap level will map all subsequent mipmap levels.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("firstMipmapInTail")
    @NUInt
    long firstMipmapInTail();

    /**
     * [@property] shareable
     * 
     * If YES, this texture can be shared with other processes.
     * 
     * Texture can be shared across process addres space boundaries through use of sharedTextureHandle and XPC.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("isShareable")
    boolean isShareable();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("isSparse")
    boolean isSparse();

    /**
     * newSharedTextureHandle
     * 
     * Create a new texture handle, that can be shared across process addres space boundaries.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("newSharedTextureHandle")
    MTLSharedTextureHandle newSharedTextureHandle();

    /**
     * newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:
     * 
     * Create a new texture which shares the same storage as the source texture, but with a different (but compatible)
     * pixel format, texture type, levels, slices and swizzle.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormatTextureTypeLevelsSlicesSwizzle(@NUInt long pixelFormat,
            @NUInt long textureType, @ByValue NSRange levelRange, @ByValue NSRange sliceRange,
            @ByValue MTLTextureSwizzleChannels swizzle);

    /**
     * [@property] swizzle
     * 
     * The channel swizzle used when reading or sampling from this texture
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("swizzle")
    @ByValue
    MTLTextureSwizzleChannels swizzle();

    /**
     * [@property] tailSizeInBytes
     * 
     * Amount of memory in bytes required to map sparse texture tail.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("tailSizeInBytes")
    @NUInt
    long tailSizeInBytes();

    /**
     * [@property] compressionType
     * 
     * Returns the compression type of the texture
     * 
     * See the compressionType property on MTLTextureDescriptor
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("compressionType")
    @NInt
    long compressionType();

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Argument Buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();
}
