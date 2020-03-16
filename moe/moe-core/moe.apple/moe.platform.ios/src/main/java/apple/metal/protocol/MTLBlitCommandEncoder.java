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
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBlitCommandEncoder")
public interface MTLBlitCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) Object sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) Object destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOriginOptions(
            @Mapped(ObjCObjectMapper.class) Object sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) Object destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin, @NUInt long options);

    @Generated
    @Selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    void copyFromBufferSourceOffsetToBufferDestinationOffsetSize(@Mapped(ObjCObjectMapper.class) Object sourceBuffer,
            @NUInt long sourceOffset, @Mapped(ObjCObjectMapper.class) Object destinationBuffer,
            @NUInt long destinationOffset, @NUInt long size);

    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImage(
            @Mapped(ObjCObjectMapper.class) Object sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) Object destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage);

    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImageOptions(
            @Mapped(ObjCObjectMapper.class) Object sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) Object destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage, @NUInt long options);

    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) Object sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) Object destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    @Generated
    @Selector("fillBuffer:range:value:")
    void fillBufferRangeValue(@Mapped(ObjCObjectMapper.class) Object buffer, @ByValue NSRange range, byte value);

    @Generated
    @Selector("generateMipmapsForTexture:")
    void generateMipmapsForTexture(@Mapped(ObjCObjectMapper.class) Object texture);

    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) Object fence);

    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) Object fence);

    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    void copyFromTextureSourceSliceSourceLevelToTextureDestinationSliceDestinationLevelSliceCountLevelCount(
            @Mapped(ObjCObjectMapper.class) Object sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @Mapped(ObjCObjectMapper.class) Object destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @NUInt long sliceCount, @NUInt long levelCount);

    @Generated
    @Selector("copyFromTexture:toTexture:")
    void copyFromTextureToTexture(@Mapped(ObjCObjectMapper.class) Object sourceTexture,
            @Mapped(ObjCObjectMapper.class) Object destinationTexture);

    @Generated
    @Selector("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    void copyIndirectCommandBufferSourceRangeDestinationDestinationIndex(@Mapped(ObjCObjectMapper.class) Object source,
            @ByValue NSRange sourceRange, @Mapped(ObjCObjectMapper.class) Object destination,
            @NUInt long destinationIndex);

    @Generated
    @Selector("getTextureAccessCounters:region:mipLevel:slice:resetCounters:countersBuffer:countersBufferOffset:")
    void getTextureAccessCountersRegionMipLevelSliceResetCountersCountersBufferCountersBufferOffset(
            @Mapped(ObjCObjectMapper.class) Object texture, @ByValue MTLRegion region, @NUInt long mipLevel,
            @NUInt long slice, boolean resetCounters, @Mapped(ObjCObjectMapper.class) Object countersBuffer,
            @NUInt long countersBufferOffset);

    @Generated
    @Selector("optimizeContentsForCPUAccess:")
    void optimizeContentsForCPUAccess(@Mapped(ObjCObjectMapper.class) Object texture);

    @Generated
    @Selector("optimizeContentsForCPUAccess:slice:level:")
    void optimizeContentsForCPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long slice,
            @NUInt long level);

    @Generated
    @Selector("optimizeContentsForGPUAccess:")
    void optimizeContentsForGPUAccess(@Mapped(ObjCObjectMapper.class) Object texture);

    @Generated
    @Selector("optimizeContentsForGPUAccess:slice:level:")
    void optimizeContentsForGPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long slice,
            @NUInt long level);

    @Generated
    @Selector("optimizeIndirectCommandBuffer:withRange:")
    void optimizeIndirectCommandBufferWithRange(@Mapped(ObjCObjectMapper.class) Object indirectCommandBuffer,
            @ByValue NSRange range);

    @Generated
    @Selector("resetCommandsInBuffer:withRange:")
    void resetCommandsInBufferWithRange(@Mapped(ObjCObjectMapper.class) Object buffer, @ByValue NSRange range);

    @Generated
    @Selector("resetTextureAccessCounters:region:mipLevel:slice:")
    void resetTextureAccessCountersRegionMipLevelSlice(@Mapped(ObjCObjectMapper.class) Object texture,
            @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);
}
