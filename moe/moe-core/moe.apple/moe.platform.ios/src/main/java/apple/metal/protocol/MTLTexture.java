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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @protocol MTLTexture
 * @abstract MTLTexture represents a collection of 1D, 2D, or 3D images.
 * @discussion
 * Each image in a texture is a 1D, 2D, 2DMultisample, or 3D image. The texture contains one or more images arranged in a mipmap stack. If there are multiple mipmap stacks, each one is referred to as a slice of the texture. 1D, 2D, 2DMultisample, and 3D textures have a single slice. In 1DArray and 2DArray textures, every slice is an array element. A Cube texture always has 6 slices, one for each face. In a CubeArray texture, each set of six slices is one element in the array.
 * 
 * Most APIs that operate on individual images in a texture address those images via a tuple of a Slice, and Mipmap Level within that slice.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTexture")
public interface MTLTexture extends MTLResource {
    /**
     * @property arrayLength
     * @abstract The number of array elements in this MTLTexture.
     * @discussion For non-Array texture types, arrayLength is 1.
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    long arrayLength();

    /**
     * @property buffer
     * @abstract The buffer this texture view was created from, or nil if this is not a texture view or it was not created from a buffer.
     */
    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer buffer();

    /**
     * @property bufferBytesPerRow
     * @abstract The bytesPerRow of the buffer this texture view was created from, or 0 if this is not a texture view.
     */
    @Generated
    @Selector("bufferBytesPerRow")
    @NUInt
    long bufferBytesPerRow();

    /**
     * @property bufferOffset
     * @abstract The offset of the buffer this texture view was created from, or 0 if this is not a texture view.
     */
    @Generated
    @Selector("bufferOffset")
    @NUInt
    long bufferOffset();

    /**
     * @property depth
     * @abstract The depth of this MTLTexture instance in pixels.
     * @discussion If this MTLTexture is not a 3D texture, the depth is 1
     */
    @Generated
    @Selector("depth")
    @NUInt
    long depth();

    /**
     * @method getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:
     * @abstract Copies a block of pixels from a texture slice into the application's memory.
     */
    @Generated
    @Selector("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    void getBytesBytesPerRowBytesPerImageFromRegionMipmapLevelSlice(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @NUInt long bytesPerImage, @ByValue MTLRegion region, @NUInt long level, @NUInt long slice);

    /**
     * @method getBytes:bytesPerRow:fromRegion:mipmapLevel:
     * @abstract Convenience for getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice: that doesn't require slice related arguments
     */
    @Generated
    @Selector("getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    void getBytesBytesPerRowFromRegionMipmapLevel(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @ByValue MTLRegion region, @NUInt long level);

    /**
     * @property height
     * @abstract The height of the MTLTexture instance in pixels.
     * @discussion. height is 1 if the texture is 1D.
     */
    @Generated
    @Selector("height")
    @NUInt
    long height();

    /**
     * @property framebufferOnly
     * @abstract If YES, this texture can only be used with a MTLAttachmentDescriptor, and cannot be used as a texture argument for MTLRenderCommandEncoder, MTLBlitCommandEncoder, or MTLComputeCommandEncoder. Furthermore, when this property's value is YES, readPixels/writePixels may not be used with this texture.
     * @discussion Textures obtained from CAMetalDrawables may have this property set to YES, depending on the value of frameBufferOnly passed to their parent CAMetalLayer. Textures created directly by the application will not have any restrictions.
     */
    @Generated
    @Selector("isFramebufferOnly")
    boolean isFramebufferOnly();

    /**
     * @property mipmapLevelCount
     * @abstract The number of mipmap levels in each slice of this MTLTexture.
     */
    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    long mipmapLevelCount();

    /**
     * @method newTextureViewWithPixelFormat:
     * @abstract Create a new texture which shares the same storage as the source texture, but with a different (but compatible) pixel format.
     */
    @Generated
    @Selector("newTextureViewWithPixelFormat:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormat(@NUInt long pixelFormat);

    /**
     * @method newTextureViewWithPixelFormat:textureType:levels:slices:
     * @abstract Create a new texture which shares the same storage as the source texture, but with a different (but compatible) pixel format, texture type, levels and slices.
     */
    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormatTextureTypeLevelsSlices(@NUInt long pixelFormat, @NUInt long textureType,
            @ByValue NSRange levelRange, @ByValue NSRange sliceRange);

    /**
     * @property parentRelativeLevel
     * @abstract The base level of the texture this texture view was created from, or 0 if this is not a texture view.
     */
    @Generated
    @Selector("parentRelativeLevel")
    @NUInt
    long parentRelativeLevel();

    /**
     * @property parentRelativeSlice
     * @abstract The base slice of the texture this texture view was created from, or 0 if this is not a texture view.
     */
    @Generated
    @Selector("parentRelativeSlice")
    @NUInt
    long parentRelativeSlice();

    /**
     * @property parentTexture
     * @abstract The texture this texture view was created from, or nil if this is not a texture view or it was not created from a texture.
     */
    @Generated
    @Selector("parentTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture parentTexture();

    /**
     * @property pixelFormat
     * @abstract The MTLPixelFormat that is used to interpret this texture's contents.
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    long pixelFormat();

    /**
     * @method replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:
     * @abstract Copy a block of pixel data from the caller's pointer into a texture slice.
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    void replaceRegionMipmapLevelSliceWithBytesBytesPerRowBytesPerImage(@ByValue MTLRegion region, @NUInt long level,
            @NUInt long slice, ConstVoidPtr pixelBytes, @NUInt long bytesPerRow, @NUInt long bytesPerImage);

    /**
     * @method replaceRegion:mipmapLevel:withBytes:bytesPerRow:
     * @abstract Convenience for replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage: that doesn't require slice related arguments
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    void replaceRegionMipmapLevelWithBytesBytesPerRow(@ByValue MTLRegion region, @NUInt long level,
            ConstVoidPtr pixelBytes, @NUInt long bytesPerRow);

    /**
     * @property rootResource
     * @abstract The resource this texture was created from. It may be a texture or a buffer. If this texture is not reusing storage of another MTLResource, then nil is returned.
     */
    @Generated
    @Selector("rootResource")
    @MappedReturn(ObjCObjectMapper.class)
    MTLResource rootResource();

    /**
     * @property sampleCount
     * @abstract The number of samples in each pixel of this MTLTexture.
     * @discussion If this texture is any type other than 2DMultisample, samples is 1.
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    long sampleCount();

    /**
     * @property type
     * @abstract The type of this texture.
     */
    @Generated
    @Selector("textureType")
    @NUInt
    long textureType();

    /**
     * @property usage
     * @abstract Description of texture usage.
     */
    @Generated
    @Selector("usage")
    @NUInt
    long usage();

    /**
     * @property width
     * @abstract The width of the MTLTexture instance in pixels.
     */
    @Generated
    @Selector("width")
    @NUInt
    long width();

    /**
     * @property iosurface
     * @abstract If this texture was created from an IOSurface, this returns a reference to that IOSurface. iosurface is nil if this texture was not created from an IOSurface.
     */
    @Generated
    @Selector("iosurface")
    IOSurfaceRef iosurface();

    /**
     * @property iosurfacePlane
     * @abstract If this texture was created from an IOSurface, this returns the plane of the IOSurface from which the texture was created. iosurfacePlane is 0 if this texture was not created from an IOSurface.
     */
    @Generated
    @Selector("iosurfacePlane")
    @NUInt
    long iosurfacePlane();

    /**
     * @property allowGPUOptimizedContents
     * @abstract Allow GPU-optimization for the contents texture. The default value is true.
     * @discussion Useful for opting-out of GPU-optimization when implicit optimization (e.g. RT writes) is regressing CPU-read-back performance. See the documentation for optimizeContentsForGPUAccess: and optimizeContentsForCPUAccess: APIs.
     */
    @Generated
    @Selector("allowGPUOptimizedContents")
    boolean allowGPUOptimizedContents();

    /**
     * @property firstMipmapInTail
     * @abstract For sparse textures this property returns index of first mipmap that is packed in tail.
     * Mapping this mipmap level will map all subsequent mipmap levels.
     */
    @Generated
    @Selector("firstMipmapInTail")
    @NUInt
    long firstMipmapInTail();

    /**
     * @property shareable
     * @abstract If YES, this texture can be shared with other processes.
     * @discussion Texture can be shared across process addres space boundaries through use of sharedTextureHandle and XPC.
     */
    @Generated
    @Selector("isShareable")
    boolean isShareable();

    @Generated
    @Selector("isSparse")
    boolean isSparse();

    /**
     * @method newSharedTextureHandle
     * @abstract Create a new texture handle, that can be shared across process addres space boundaries.
     */
    @Generated
    @Selector("newSharedTextureHandle")
    MTLSharedTextureHandle newSharedTextureHandle();

    /**
     * @method newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:
     * @abstract Create a new texture which shares the same storage as the source texture, but with a different (but compatible) pixel format, texture type, levels, slices and swizzle. 
     */
    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:swizzle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureViewWithPixelFormatTextureTypeLevelsSlicesSwizzle(@NUInt long pixelFormat,
            @NUInt long textureType, @ByValue NSRange levelRange, @ByValue NSRange sliceRange,
            @ByValue MTLTextureSwizzleChannels swizzle);

    /**
     * @property swizzle
     * @abstract The channel swizzle used when reading or sampling from this texture
     */
    @Generated
    @Selector("swizzle")
    @ByValue
    MTLTextureSwizzleChannels swizzle();

    /**
     * @property tailSizeInBytes
     * @abstract Amount of memory in bytes required to map sparse texture tail.
     */
    @Generated
    @Selector("tailSizeInBytes")
    @NUInt
    long tailSizeInBytes();
}
