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
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] MTLBlitCommandEncoder
 * 
 * A command encoder that performs basic copies and blits between buffers and textures.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLBlitCommandEncoder")
public interface MTLBlitCommandEncoder extends MTLCommandEncoder {
    /**
     * copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:
     * 
     * Copy an image from a buffer into a texture.
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:
     * 
     * Copy an image from a buffer into a texture.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOriginOptions(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin, @NUInt long options);

    /**
     * copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:
     * 
     * Basic memory copy between buffers.
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    void copyFromBufferSourceOffsetToBufferDestinationOffsetSize(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long size);

    /**
     * copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:
     * 
     * Copy an image from a texture into a buffer.
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImage(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage);

    /**
     * copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:sourceOptions:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:
     * 
     * Copy an image from a texture into a buffer.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImageOptions(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage, @NUInt long options);

    /**
     * copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:
     * 
     * Copy a rectangle of pixels between textures.
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * fillBuffer:range:value:
     * 
     * Fill a buffer with a fixed value in each byte.
     */
    @Generated
    @Selector("fillBuffer:range:value:")
    void fillBufferRangeValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @ByValue NSRange range,
            byte value);

    /**
     * generateMipmapsForTexture:
     * 
     * Generate mipmaps for a texture from the base level up to the max level.
     */
    @Generated
    @Selector("generateMipmapsForTexture:")
    void generateMipmapsForTexture(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * updateFence:
     * 
     * Update the fence to capture all GPU work so far enqueued by this encoder.
     * 
     * The fence is updated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of
     * an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("updateFence:")
    void updateFence(@NotNull @Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * waitForFence:
     * 
     * Prevent further GPU work until the fence is reached.
     * 
     * The fence is evaluated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of
     * an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@NotNull @Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:
     * 
     * Copy whole surfaces between textures.
     * 
     * Convenience function to copy sliceCount * levelCount whole surfaces between textures
     * The source and destination pixel format must be identical.
     * The source and destination sample count must be identical.
     * The sourceLevel mip in sourceTexture must have the same dimension as the destinationLevel mip in
     * destinationTexture.
     * The sourceTexture must have at least sourceLevel + levelCount mips
     * The destinationTexture must have at least destinationLevel + levelCount mips
     * The sourceTexture must have at least sourceSlice + sliceCount array slices
     * The destinationTexture must have at least destinationSlice + sliceCount array slices
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    void copyFromTextureSourceSliceSourceLevelToTextureDestinationSliceDestinationLevelSliceCountLevelCount(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @NUInt long destinationSlice, @NUInt long destinationLevel, @NUInt long sliceCount, @NUInt long levelCount);

    /**
     * copyFromTexture:toTexture:
     * 
     * Copy as many whole surfaces as possible between textures.
     * 
     * Convenience function that calls
     * copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:
     * The source and destination pixel format must be identical.
     * The source and destination sample count must be identical.
     * Either:
     * - sourceTexture must have a mip M with identical dimensions as the first mip of destinationTexture: sourceLevel =
     * M, destinationLevel = 0
     * - destinationTexture must have a mip M with identical dimensions as the first mip of sourceTexture: sourceLevel =
     * 0, destinationLevel = M
     * Computes: levelCount = min(sourceTexture.mipmapLevelCount - sourceLevel, destinationTexture.mipmapLevelCount -
     * destinationLevel)
     * sliceCount = min(sourceTexture.arrayLength, destinationTexture.arrayLength)
     * Then invokes the method above using the computed parameters.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("copyFromTexture:toTexture:")
    void copyFromTextureToTexture(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture);

    /**
     * copyIndirectCommandBuffer:source:sourceRange:destination:destinationIndex
     * 
     * copy a region of a buffer into a destination buffer starting at destinationIndex using the GPU
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    void copyIndirectCommandBufferSourceRangeDestinationDestinationIndex(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer source, @ByValue NSRange sourceRange,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer destination,
            @NUInt long destinationIndex);

    /**
     * getTextureAccessCounters:region:mipLevel:slice:type:resetCounters:countersBuffer:countersBufferOffset
     * 
     * Copies tile access counters within specified region into provided buffer
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("getTextureAccessCounters:region:mipLevel:slice:resetCounters:countersBuffer:countersBufferOffset:")
    void getTextureAccessCountersRegionMipLevelSliceResetCountersCountersBufferCountersBufferOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture, @ByValue MTLRegion region,
            @NUInt long mipLevel, @NUInt long slice, boolean resetCounters,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer countersBuffer, @NUInt long countersBufferOffset);

    /**
     * optimizeContentsForCPUAccess:
     * 
     * Optimizes the texture data to ensure the best possible performance when accessing content on the CPU at the
     * expense of GPU-access performance.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:")
    void optimizeContentsForCPUAccess(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * optimizeContentsForCPUAccess:slice:level:
     * 
     * Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the CPU
     * at the expense of GPU-access performance.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:slice:level:")
    void optimizeContentsForCPUAccessSliceLevel(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long slice, @NUInt long level);

    /**
     * optimizeContentsForGPUAccess:
     * 
     * Optimizes the texture data to ensure the best possible performance when accessing content on the GPU at the
     * expense of CPU-access performance.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:")
    void optimizeContentsForGPUAccess(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture);

    /**
     * optimizeContentsForGPUAccess:slice:level:
     * 
     * Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the GPU
     * at the expense of CPU-access performance.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:slice:level:")
    void optimizeContentsForGPUAccessSliceLevel(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @NUInt long slice, @NUInt long level);

    /**
     * optimizeIndirectCommandBuffer:withRange:
     * 
     * Optimizes a subset of the texture data to ensure the best possible performance when accessing content on the CPU
     * at the expense of GPU-access performance.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("optimizeIndirectCommandBuffer:withRange:")
    void optimizeIndirectCommandBufferWithRange(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange range);

    /**
     * resetCommandsInBuffer:withRange:
     * 
     * reset commands in a indirect command buffer using the GPU
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("resetCommandsInBuffer:withRange:")
    void resetCommandsInBufferWithRange(@NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer buffer,
            @ByValue NSRange range);

    /**
     * resetTextureAccessCounters:region:mipLevel:slice:type:
     * 
     * Resets tile access counters within specified region
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("resetTextureAccessCounters:region:mipLevel:slice:")
    void resetTextureAccessCountersRegionMipLevelSlice(@NotNull @Mapped(ObjCObjectMapper.class) MTLTexture texture,
            @ByValue MTLRegion region, @NUInt long mipLevel, @NUInt long slice);

    /**
     * resolveCounters:inRange:destinationBuffer:destinationOffset:
     * 
     * Resolve the counters from the raw buffer to a processed buffer.
     * 
     * Samples that encountered an error during resolve will be set to
     * MTLCounterErrorValue.
     * 
     * API-Since: 14.0
     * 
     * @param sampleBuffer      The sample buffer to resolve.
     * @param range             The range of indices to resolve.
     * @param destinationBuffer The buffer to resolve values into.
     * @param destinationOffset The offset to begin writing values out to. This must be a multiple of
     *                          the minimum constant buffer alignment.
     */
    @Generated
    @Selector("resolveCounters:inRange:destinationBuffer:destinationOffset:")
    void resolveCountersInRangeDestinationBufferDestinationOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @ByValue NSRange range,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer destinationBuffer, @NUInt long destinationOffset);

    /**
     * sampleCountersInBuffer:atSampleIndex:withBarrier:
     * 
     * Sample hardware counters at this point in the blit encoder and
     * store the counter sample into the sample buffer at the specified index.
     * 
     * On devices where MTLCounterSamplingPointAtBlitBoundary is unsupported,
     * this method is not available and will generate an error if called.
     * 
     * API-Since: 14.0
     * 
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex  The index into the counter buffer to write the sample.
     * @param barrier      Insert a barrier before taking the sample. Passing
     *                     YES will ensure that all work encoded before this operation in the encoder is
     *                     complete but does not isolate the work with respect to other encoders. Passing
     *                     NO will allow the sample to be taken concurrently with other operations in this
     *                     encoder.
     *                     In general, passing YES will lead to more repeatable counter results but
     *                     may negatively impact performance. Passing NO will generally be higher performance
     *                     but counter results may not be repeatable.
     */
    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);
}
