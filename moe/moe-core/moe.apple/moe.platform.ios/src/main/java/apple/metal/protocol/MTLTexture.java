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
    @Generated
    @Selector("arrayLength")
    @NUInt
    long arrayLength();

    @Generated
    @Selector("depth")
    @NUInt
    long depth();

    @Generated
    @Selector("getBytes:bytesPerRow:bytesPerImage:fromRegion:mipmapLevel:slice:")
    void getBytesBytesPerRowBytesPerImageFromRegionMipmapLevelSlice(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @NUInt long bytesPerImage, @ByValue MTLRegion region, @NUInt long level, @NUInt long slice);

    @Generated
    @Selector("getBytes:bytesPerRow:fromRegion:mipmapLevel:")
    void getBytesBytesPerRowFromRegionMipmapLevel(VoidPtr pixelBytes, @NUInt long bytesPerRow,
            @ByValue MTLRegion region, @NUInt long level);

    @Generated
    @Selector("height")
    @NUInt
    long height();

    @Generated
    @Selector("isFramebufferOnly")
    boolean isFramebufferOnly();

    @Generated
    @Selector("mipmapLevelCount")
    @NUInt
    long mipmapLevelCount();

    @Generated
    @Selector("newTextureViewWithPixelFormat:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newTextureViewWithPixelFormat(@NUInt long pixelFormat);

    @Generated
    @Selector("pixelFormat")
    @NUInt
    long pixelFormat();

    @Generated
    @Selector("replaceRegion:mipmapLevel:slice:withBytes:bytesPerRow:bytesPerImage:")
    void replaceRegionMipmapLevelSliceWithBytesBytesPerRowBytesPerImage(@ByValue MTLRegion region, @NUInt long level,
            @NUInt long slice, ConstVoidPtr pixelBytes, @NUInt long bytesPerRow, @NUInt long bytesPerImage);

    @Generated
    @Selector("replaceRegion:mipmapLevel:withBytes:bytesPerRow:")
    void replaceRegionMipmapLevelWithBytesBytesPerRow(@ByValue MTLRegion region, @NUInt long level,
            ConstVoidPtr pixelBytes, @NUInt long bytesPerRow);

    @Generated
    @Selector("rootResource")
    @MappedReturn(ObjCObjectMapper.class)
    Object rootResource();

    @Generated
    @Selector("sampleCount")
    @NUInt
    long sampleCount();

    @Generated
    @Selector("textureType")
    @NUInt
    long textureType();

    @Generated
    @Selector("width")
    @NUInt
    long width();

    @Generated
    @Selector("buffer")
    @MappedReturn(ObjCObjectMapper.class)
    Object buffer();

    @Generated
    @Selector("bufferBytesPerRow")
    @NUInt
    long bufferBytesPerRow();

    @Generated
    @Selector("bufferOffset")
    @NUInt
    long bufferOffset();

    @Generated
    @Selector("newTextureViewWithPixelFormat:textureType:levels:slices:")
    @MappedReturn(ObjCObjectMapper.class)
    Object newTextureViewWithPixelFormatTextureTypeLevelsSlices(@NUInt long pixelFormat, @NUInt long textureType,
            @ByValue NSRange levelRange, @ByValue NSRange sliceRange);

    @Generated
    @Selector("parentRelativeLevel")
    @NUInt
    long parentRelativeLevel();

    @Generated
    @Selector("parentRelativeSlice")
    @NUInt
    long parentRelativeSlice();

    @Generated
    @Selector("parentTexture")
    @MappedReturn(ObjCObjectMapper.class)
    Object parentTexture();

    @Generated
    @Selector("usage")
    @NUInt
    long usage();
}
