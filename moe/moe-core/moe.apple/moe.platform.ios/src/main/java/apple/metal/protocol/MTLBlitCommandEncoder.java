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

/**
 * @protocol MTLBlitCommandEncoder
 * @abstract A command encoder that performs basic copies and blits between buffers and textures.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBlitCommandEncoder")
public interface MTLBlitCommandEncoder extends MTLCommandEncoder {
    /**
     * @method copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:
     * @abstract Copy an image from a buffer into a texture.
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * @method copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:
     * @abstract Copy an image from a buffer into a texture.
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOriginOptions(
            @Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin, @NUInt long options);

    /**
     * @method copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:
     * @abstract Basic memory copy between buffers.
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    void copyFromBufferSourceOffsetToBufferDestinationOffsetSize(@Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer,
            @NUInt long sourceOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer,
            @NUInt long destinationOffset, @NUInt long size);

    /**
     * @method copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:
     * @abstract Copy an image from a texture into a buffer.
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImage(
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage);

    /**
     * @method copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:sourceOptions:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:
     * @abstract Copy an image from a texture into a buffer.
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImageOptions(
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage, @NUInt long options);

    /**
     * @method copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:
     * @abstract Copy a rectangle of pixels between textures.
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * @method fillBuffer:range:value:
     * @abstract Fill a buffer with a fixed value in each byte.
     */
    @Generated
    @Selector("fillBuffer:range:value:")
    void fillBufferRangeValue(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @ByValue NSRange range, byte value);

    /**
     * @method generateMipmapsForTexture:
     * @abstract Generate mipmaps for a texture from the base level up to the max level.
     */
    @Generated
    @Selector("generateMipmapsForTexture:")
    void generateMipmapsForTexture(@Mapped(ObjCObjectMapper.class) MTLTexture texture);

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
     * @method waitForFence:
     * @abstract Prevent further GPU work until the fence is reached.
     * @discussion The fence is evaluated at kernel submision to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * @method copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:
     * @abstract Copy whole surfaces between textures.
     * @discussion Convenience function to copy sliceCount * levelCount whole surfaces between textures
     * The source and destination pixel format must be identical.
     * The source and destination sample count must be identical.
     * The sourceLevel mip in sourceTexture must have the same dimension as the destinationLevel mip in destinationTexture.
     * The sourceTexture must have at least sourceLevel + levelCount mips
     * The destinationTexture must have at least destinationLevel + levelCount mips
     * The sourceTexture must have at least sourceSlice + sliceCount array slices
     * The destinationTexture must have at least destinationSlice + sliceCount array slices
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    void copyFromTextureSourceSliceSourceLevelToTextureDestinationSliceDestinationLevelSliceCountLevelCount(
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice, @NUInt long sourceLevel,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @NUInt long sliceCount, @NUInt long levelCount);

    /**
     * @method copyFromTexture:toTexture:
     * @abstract Copy as many whole surfaces as possible between textures.
     * @discussion Convenience function that calls copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:
     * The source and destination pixel format must be identical.
     * The source and destination sample count must be identical.
     * Either:
     * - sourceTexture must have a mip M with identical dimensions as the first mip of destinationTexture: sourceLevel = M, destinationLevel = 0
     * - destinationTexture must have a mip M with identical dimensions as the first mip of sourceTexture: sourceLevel = 0, destinationLevel = M
     * Computes: levelCount = min(sourceTexture.mipmapLevelCount - sourceLevel, destinationTexture.mipmapLevelCount - destinationLevel)
     *           sliceCount = min(sourceTexture.arrayLength, destinationTexture.arrayLength)
     * Then invokes the method above using the computed parameters.
     */
    @Generated
    @Selector("copyFromTexture:toTexture:")
    void copyFromTextureToTexture(@Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    /**
     * @method copyIndirectCommandBuffer:source:sourceRange:destination:destinationIndex
     * @abstract copy a region of a buffer into a destination buffer starting at destinationIndex using the GPU
     */
    @Generated
    @Selector("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    void copyIndirectCommandBufferSourceRangeDestinationDestinationIndex(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer source, @ByValue NSRange sourceRange,
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer destination, @NUInt long destinationIndex);

    /**
     * @method getTextureAccessCounters:region:mipLevel:slice:type:resetCounters:countersBuffer:countersBufferOffset
     * @abstract Copies tile access counters within specified region into provided buffer
     */
    @Generated
    @Selector("getTextureAccessCounters:region:mipLevel:slice:resetCounters:countersBuffer:countersBufferOffset:")
    void getTextureAccessCountersRegionMipLevelSliceResetCountersCountersBufferCountersBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLTexture texture, @ByValue MTLRegion region, @NUInt long mipLevel,
            @NUInt long slice, boolean resetCounters, @Mapped(ObjCObjectMapper.class) MTLBuffer countersBuffer,
            @NUInt long countersBufferOffset);

    /**
     * @method optimizeContentsForCPUAccess:
     * @abstract Optimizes the texture data to ensure the best possible performance when accessing content on the CPU at the expense of GPU-access performance.
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:")
    void optimizeContentsForCPUAccess(@Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * @method optimizeContentsForCPUAccess:slice:level:
     * @abstract Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the CPU at the expense of GPU-access performance.
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:slice:level:")
    void optimizeContentsForCPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long slice,
            @NUInt long level);

    /**
     * @method optimizeContentsForGPUAccess:
     * @abstract Optimizes the texture data to ensure the best possible performance when accessing content on the GPU at the expense of CPU-access performance.
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:")
    void optimizeContentsForGPUAccess(@Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * @method optimizeContentsForGPUAccess:slice:level:
     * @abstract Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the GPU at the expense of CPU-access performance.
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:slice:level:")
    void optimizeContentsForGPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long slice,
            @NUInt long level);

    /**
     * @method optimizeIndirectCommandBuffer:indirectCommandBuffer:range:
     * @abstract Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the CPU at the expense of GPU-access performance.
     */
    @Generated
    @Selector("optimizeIndirectCommandBuffer:withRange:")
    void optimizeIndirectCommandBufferWithRange(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer, @ByValue NSRange range);

    /**
     * @method resetCommandsInBuffer:buffer:withRange:
     * @abstract reset commands in a indirect command buffer using the GPU
     */
    @Generated
    @Selector("resetCommandsInBuffer:withRange:")
    void resetCommandsInBufferWithRange(@Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer buffer,
            @ByValue NSRange range);

    /**
     * @method resetTextureAccessCounters:region:mipLevel:slice:type:
     * @abstract Resets tile access counters within specified region
     */
    @Generated
    @Selector("resetTextureAccessCounters:region:mipLevel:slice:")
    void resetTextureAccessCountersRegionMipLevelSlice(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);

    /**
     * @method resolveCounters:inRange:destinationBuffer:destinationOffset:
     * @param sampleBuffer The sample buffer to resolve.
     * @param range The range of indices to resolve.
     * @param destinationBuffer The buffer to resolve values into.
     * @param destinationOffset The offset to begin writing values out to.  This must be a multiple of
     * the minimum constant buffer alignment.
     * @abstract Resolve the counters from the raw buffer to a processed buffer.
     * @discussion Samples that encountered an error during resolve will be set to
     * MTLCounterErrorValue.
     */
    @Generated
    @Selector("resolveCounters:inRange:destinationBuffer:destinationOffset:")
    void resolveCountersInRangeDestinationBufferDestinationOffset(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @ByValue NSRange range,
            @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset);

    /**
     * @method sampleCountersInBuffer:atSampleIndex:withBarrier:
     * @abstract Sample hardware counters at this point in the blit encoder and
     * store the counter sample into the sample buffer at the specified index.
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex The index into the counter buffer to write the sample.
     * @param barrier Insert a barrier before taking the sample.  Passing
     * YES will ensure that all work encoded before this operation in the encoder is
     * complete but does not isolate the work with respect to other encoders.  Passing
     * NO will allow the sample to be taken concurrently with other operations in this
     * encoder.
     * In general, passing YES will lead to more repeatable counter results but
     * may negatively impact performance.  Passing NO will generally be higher performance
     * but counter results may not be repeatable.
     * @discussion On devices where MTLCounterSamplingPointAtBlitBoundary is unsupported,
     * this method is not available and will generate an error if called.
     */
    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);
}
