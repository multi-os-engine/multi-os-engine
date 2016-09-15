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

import apple.foundation.struct.NSRange;
import apple.metal.struct.MTLRegion;
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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLTexture")
public interface MTLTexture extends MTLResource {
    /**
     * arrayLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/arrayLength">iOS Dev Center</a>
     */
    @Generated
    @Selector("arrayLength")
    @NUInt
    long arrayLength();

    /**
     * depth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/depth">iOS Dev Center</a>
     */
    @Generated
    @Selector("depth")
    @NUInt
    long depth();

    /**
     * getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    void getBytesBytesPerRowBytesPerImageFromRegionMipmapLevelSlice(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @NUInt long bytesPerImage, @ByValue MTLRegion region, @NUInt long level, @NUInt long slice);

    /**
     * getBytes:bytesPerRow:fromRegion:mipmapLevel:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/getBytes:bytesPerRow:fromRegion:mipmapLevel:">iOS Dev Center</a>
     */
    @Generated
    @Selector("getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    void getBytesBytesPerRowFromRegionMipmapLevel(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @ByValue MTLRegion region, @NUInt long level);

    /**
     * height</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/height">iOS Dev Center</a>
     */
    @Generated
    @Selector("height")
    @NUInt
    long height();

    /**
     * framebufferOnly</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/framebufferOnly">iOS Dev Center</a>
     */
    @Generated
    @Selector("isFramebufferOnly")
    boolean isFramebufferOnly();

    /**
     * mipmapLevelCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/mipmapLevelCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    long mipmapLevelCount();

    /**
     * newTextureViewWithPixelFormat:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/newTextureViewWithPixelFormat:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newTextureViewWithPixelFormat:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newTextureViewWithPixelFormat(@NUInt long pixelFormat);

    /**
     * pixelFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/pixelFormat">iOS Dev Center</a>
     */
    @Generated
    @Selector("pixelFormat")
    @NUInt
    long pixelFormat();

    /**
     * replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    void replaceRegionMipmapLevelSliceWithBytesBytesPerRowBytesPerImage(@ByValue MTLRegion region, @NUInt long level,
            @NUInt long slice, ConstVoidPtr pixelBytes, @NUInt long bytesPerRow, @NUInt long bytesPerImage);

    /**
     * replaceRegion:mipmapLevel:withBytes:bytesPerRow:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/replaceRegion:mipmapLevel:withBytes:bytesPerRow:">iOS Dev Center</a>
     */
    @Generated
    @Selector("replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    void replaceRegionMipmapLevelWithBytesBytesPerRow(@ByValue MTLRegion region, @NUInt long level,
            ConstVoidPtr pixelBytes, @NUInt long bytesPerRow);

    /**
     * rootResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/rootResource">iOS Dev Center</a>
     */
    @Generated
    @Selector("rootResource")
    @MappedReturn(ObjCObjectMapper.class)
    Object rootResource();

    /**
     * sampleCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/sampleCount">iOS Dev Center</a>
     */
    @Generated
    @Selector("sampleCount")
    @NUInt
    long sampleCount();

    /**
     * textureType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/textureType">iOS Dev Center</a>
     */
    @Generated
    @Selector("textureType")
    @NUInt
    long textureType();

    /**
     * width</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/width">iOS Dev Center</a>
     */
    @Generated
    @Selector("width")
    @NUInt
    long width();

    /**
     * buffer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/buffer">iOS Dev Center</a>
     */
    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    Object buffer();

    /**
     * bufferBytesPerRow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/bufferBytesPerRow">iOS Dev Center</a>
     */
    @Generated
    @Selector("bufferBytesPerRow")
    @NUInt
    long bufferBytesPerRow();

    /**
     * bufferOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/bufferOffset">iOS Dev Center</a>
     */
    @Generated
    @Selector("bufferOffset")
    @NUInt
    long bufferOffset();

    /**
     * newTextureViewWithPixelFormat:textureType:levels:slices:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfm/MTLTexture/newTextureViewWithPixelFormat:textureType:levels:slices:">iOS Dev Center</a>
     */
    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newTextureViewWithPixelFormatTextureTypeLevelsSlices(@NUInt long pixelFormat, @NUInt long textureType,
            @ByValue NSRange levelRange, @ByValue NSRange sliceRange);

    /**
     * parentRelativeLevel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/parentRelativeLevel">iOS Dev Center</a>
     */
    @Generated
    @Selector("parentRelativeLevel")
    @NUInt
    long parentRelativeLevel();

    /**
     * parentRelativeSlice</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/parentRelativeSlice">iOS Dev Center</a>
     */
    @Generated
    @Selector("parentRelativeSlice")
    @NUInt
    long parentRelativeSlice();

    /**
     * parentTexture</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/parentTexture">iOS Dev Center</a>
     */
    @Generated
    @Selector("parentTexture")
    @MappedReturn(ObjCObjectMapper.class)
    Object parentTexture();

    /**
     * usage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLTexture_Ref/index.html#//apple_ref/occ/intfp/MTLTexture/usage">iOS Dev Center</a>
     */
    @Generated
    @Selector("usage")
    @NUInt
    long usage();
}
