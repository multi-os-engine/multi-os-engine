package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.MTL4AccelerationStructureDescriptor;
import apple.metal.MTLTensorExtents;
import apple.metal.struct.MTL4BufferRange;
import apple.metal.struct.MTLOrigin;
import apple.metal.struct.MTLSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Encodes a compute pass and other memory operations into a command buffer.
 * 
 * Use instances of this abstraction to encode a compute pass into ``MTL4CommandBuffer`` instances, as well as commands
 * that copy and modify the underlying memory of various Metal resources, and commands that build or refit acceleration
 * structures.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4ComputeCommandEncoder")
public interface MTL4ComputeCommandEncoder extends MTL4CommandEncoder {
    /**
     * Encodes an acceleration structure build into the command buffer.
     * 
     * Before you build an instance acceleration structure, you are responsible for ensuring the build operations for
     * all
     * primitive acceleration structures is complete. The built acceleration structure doesn't retain any references to
     * the input buffers of the descriptor, such as the vertex buffer or instance buffer, among others.
     * 
     * The acceleration structure build process may continue as long as the command buffer is not completed. However,
     * you can safely encode ray tracing work against the acceleration structure if you schedule and synchronize the
     * command buffers that contain this ray tracing work such that the command buffer with the build command is
     * complete
     * by the time ray tracing starts.
     * 
     * You are responsible for ensuring that the acceleration structure and scratch buffer are at least the size
     * that the query ``MTLDevice/accelerationStructureSizesWithDescriptor:`` returns.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the scratch buffer the `scratchBuffer` parameter
     * references,
     * as well as for all the primitive acceleration structures you directly and indirectly reference.
     * 
     * - Parameters:
     * - accelerationStructure: Acceleration structure storage to build into.
     * - descriptor: A descriptor for the acceleration structure Metal builds.
     * - scratchBuffer: Scratch buffer Metal can use while building the acceleration structure.
     * Metal may overwrite the contents of this buffer, and you should consider
     * them "undefined" after the refit operation starts and completes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("buildAccelerationStructure:descriptor:scratchBuffer:")
    void buildAccelerationStructureDescriptorScratchBuffer(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure accelerationStructure,
            @NotNull MTL4AccelerationStructureDescriptor descriptor, @ByValue MTL4BufferRange scratchBuffer);

    /**
     * Encodes an acceleration structure copy operation into the command buffer.
     * 
     * You are responsible for ensuring the source and destination acceleration structures don't overlap in memory.
     * If this is an instance acceleration structure, Metal preserves references to the primitive acceleration
     * structures
     * it references.
     * 
     * Typically, the destination acceleration structure is at least as large as the source acceleration structure,
     * except in cases where you compact the source acceleration structure. In this case, you need to allocate the
     * destination acceleration to be at least as large as the compacted size of the source acceleration structure.
     * 
     * - Parameters:
     * - sourceAccelerationStructure: Acceleration structure to copy from.
     * - destinationAccelerationStructure: Acceleration structure to copy to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyAccelerationStructure:toAccelerationStructure:")
    void copyAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure destinationAccelerationStructure);

    /**
     * Encodes a command to copy and compact an acceleration structure.
     * 
     * You are responsible for ensuring that the source and destination acceleration structures don't overlap in memory.
     * If this is an instance acceleration structure, Metal preserves references to primitive acceleration structures it
     * references.
     * 
     * This operation requires that the destination acceleration structure is at least as large as the compacted size of
     * the source acceleration structure. You can compute this size by calling the
     * ``writeCompactedAccelerationStructureSize:toBuffer:`` method.
     * 
     * - Parameters:
     * - sourceAccelerationStructure: Acceleration structure to copy and compact.
     * - destinationAccelerationStructure: Acceleration structure to copy to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyAndCompactAccelerationStructure:toAccelerationStructure:")
    void copyAndCompactAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure destinationAccelerationStructure);

    /**
     * Encodes a command to copy image data from a buffer instance into a texture.
     * 
     * - Parameters:
     * - sourceBuffer: A ``MTLBuffer`` instance the command copies data from.
     * - sourceOffset: A byte offset within `sourceBuffer` the command copies from. Set this value to
     * a multiple of `destinationTexture's` pixel size, in bytes.
     * - sourceBytesPerRow: The number of bytes between adjacent rows of pixels in `sourceBuffer`. Set this value to
     * a multiple of `destinationTexture's` pixel size, in bytes, and less than or equal to
     * the product of `destinationTexture's` pixel size, in bytes, and the largest pixel width
     * `destinationTexture's` type allows. If `destinationTexture` uses a compressed pixel format,
     * set `sourceBytesPerRow` to the number of bytes between the starts of two row blocks.
     * - sourceBytesPerImage: The number of bytes between each 2D image of a 3D texture. Set this value to a
     * multiple of `destinationTexture's` pixel size, in bytes, or `0`
     * if `sourceSize's` ``MTLSize/depth`` value is `1`.
     * - sourceSize: A ``MTLSize`` instance that represents the size of the region in
     * `destinationTexture`, in pixels, that the command copies data to, starting at
     * `destinationOrigin`. Assign `1` to each dimension that’s not relevant to
     * `destinationTexture`. If `destinationTexture` uses a compressed pixel format,
     * set `sourceSize` to a multiple of `destinationTexture's` ``MTLTexture/pixelFormat``
     * block size. If the block extends outside the bounds of the texture, clamp
     * `sourceSize` to the edge of the texture.
     * - destinationTexture: An ``MTLTexture`` instance the command copies data to. In order to copy the contents into
     * the destination texture, set its ``MTLTexture/framebufferOnly`` property to
     * <doc://com.apple.documentation/documentation/swift/false> and don't
     * use a combined depth/stencil ``MTLTexture/pixelFormat``.
     * - destinationSlice: A slice within `destinationTexture` the command uses as its starting point for
     * copying data to. Set this to `0` if `destinationTexture` isn’t a texture array
     * or a cube texture.
     * - destinationLevel: A mipmap level within `destinationTexture` the command copies data to.
     * - destinationOrigin: An ``MTLOrigin`` instance that represents a location within `destinationTexture`
     * that the command begins copying data to. Assign `0` to each dimension that’s not
     * relevant to `destinationTexture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * Encodes a command to copy image data from a buffer into a texture with options for special texture formats.
     * 
     * - Parameters:
     * - sourceBuffer: An ``MTLBuffer`` instance the command copies data from.
     * - sourceOffset: A byte offset within `sourceBuffer` the command copies from. Set this value to
     * a multiple of `destinationTexture's` pixel size, in bytes.
     * - sourceBytesPerRow: The number of bytes between adjacent rows of pixels in `sourceBuffer`. Set this value to
     * a multiple of `destinationTexture's` pixel size, in bytes, and less than or equal to
     * the product of `destinationTexture's` pixel size, in bytes, and the largest pixel width
     * `destinationTexture's` type allows. If `destinationTexture` uses a compressed pixel format,
     * set `sourceBytesPerRow` to the number of bytes between the starts of two row blocks.
     * - sourceBytesPerImage: The number of bytes between each 2D image of a 3D texture. Set this value to a
     * multiple of `destinationTexture's` pixel size, in bytes, or `0`
     * if `sourceSize's` ``MTLSize/depth`` value is `1`.
     * - sourceSize: An ``MTLSize`` instance that represents the size of the region in
     * `destinationTexture`, in pixels, that the command copies data to, starting at
     * `destinationOrigin`. Assign `1` to each dimension that’s not relevant to
     * `destinationTexture`. If `destinationTexture` uses a compressed pixel format,
     * set `sourceSize` to a multiple of `destinationTexture's` ``MTLTexture/pixelFormat``
     * block size. If the block extends outside the bounds of the texture, clamp
     * `sourceSize` to the edge of the texture.
     * - destinationTexture: An ``MTLTexture`` instance the command copies data to. In order to copy the contents into
     * the destination texture, set its ``MTLTexture/framebufferOnly`` property to
     * <doc://com.apple.documentation/documentation/swift/false> and don't
     * use a combined depth/stencil ``MTLTexture/pixelFormat``.
     * - destinationSlice: A slice within `destinationTexture` the command uses as its starting point for
     * copying data to. Set this to `0` if `destinationTexture` isn’t a texture array
     * or a cube texture.
     * - destinationLevel: A mipmap level within `destinationTexture` the command copies data to.
     * - destinationOrigin: An ``MTLOrigin`` instance that represents a location within `destinationTexture`
     * that the command begins copying data to. Assign `0` to each dimension that’s not
     * relevant to `destinationTexture`.
     * - options: An ``MTLBlitOption`` value that applies to textures with applicable pixel formats,
     * such as combined depth/stencil or PVRTC formats. If `destinationTexture's`
     * ``MTLTexture/pixelFormat`` is a combined depth/stencil format, set `options` to
     * either ``MTLBlitOption/MTLBlitOptionDepthFromDepthStencil`` or
     * ``MTLBlitOption/MTLBlitOptionStencilFromDepthStencil``, but not both.
     * If `destinationTexture's` ``MTLTexture/pixelFormat`` is a PVRTC format, set
     * `options` to ``MTLBlitOption/MTLBlitOptionRowLinearPVRTC``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:sourceBytesPerRow:sourceBytesPerImage:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:options:")
    void copyFromBufferSourceOffsetSourceBytesPerRowSourceBytesPerImageSourceSizeToTextureDestinationSliceDestinationLevelDestinationOriginOptions(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @NUInt long sourceBytesPerRow, @NUInt long sourceBytesPerImage, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin, @NUInt long options);

    /**
     * Encodes a command that copies data from a buffer instance into another.
     * 
     * - Parameters:
     * - sourceBuffer: An ``MTLBuffer`` instance the command copies data from.
     * - sourceOffset: A byte offset within `sourceBuffer` the command copies from.
     * - destinationBuffer: An ``MTLBuffer`` instance the command copies data to.
     * - destinationOffset: A byte offset within `destinationBuffer` the command copies to.
     * - size: The number of bytes the command copies from `sourceBuffer` to `destinationBuffer`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromBuffer:sourceOffset:toBuffer:destinationOffset:size:")
    void copyFromBufferSourceOffsetToBufferDestinationOffsetSize(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer sourceBuffer, @NUInt long sourceOffset,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long size);

    /**
     * Encodes a command to copy data from a tensor instance into another.
     * 
     * If the `sourceTensor` and `destinationTensor` instances are not aliasable, this command applies the correct
     * reshapes
     * to enable this operation.
     * 
     * - Parameters:
     * - sourceTensor: An ``MTLTensor`` instance the command copies data from.
     * - sourceSlice: The slice of `sourceTensor` from which Metal copies data.
     * - destinationTensor: An ``MTLTensor`` instance the command copies data to.
     * - destinationSlice: The slice of `destinationTensor` to which Metal copies data.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTensor:sourceOrigin:sourceDimensions:toTensor:destinationOrigin:destinationDimensions:")
    void copyFromTensorSourceOriginSourceDimensionsToTensorDestinationOriginDestinationDimensions(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTensor sourceTensor, @NotNull MTLTensorExtents sourceOrigin,
            @NotNull MTLTensorExtents sourceDimensions,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTensor destinationTensor,
            @NotNull MTLTensorExtents destinationOrigin, @NotNull MTLTensorExtents destinationDimensions);

    /**
     * Encodes a command that copies image data from a slice of an ``MTLTexture`` instance to an ``MTLBuffer`` instance.
     * 
     * - Parameters:
     * - sourceTexture: An ``MTLTexture`` texture that the command copies data from. To read the source
     * texture contents, you need to set its ``MTLTexture/framebufferOnly`` property
     * to <doc://com.apple.documentation/documentation/swift/false> prior to drawing into it.
     * - sourceSlice: A slice within `sourceTexture` the command uses as a starting point to copy
     * data from. Set this to `0` if `sourceTexture` isn’t a texture array or a
     * cube texture.
     * - sourceLevel: A mipmap level within `sourceTexture`.
     * - sourceOrigin: An ``MTLOrigin`` instance that represents a location within `sourceTexture`
     * that the command begins copying data from. Assign `0` to each dimension
     * that’s not relevant to `sourceTexture`.
     * - sourceSize: An ``MTLSize`` instance that represents the size of the region, in pixels,
     * that the command copies from `sourceTexture`, starting at `sourceOrigin`.
     * Assign `1` to each dimension that’s not relevant to `sourceTexture`.
     * If `sourceTexture` uses a compressed pixel format, set `sourceSize` to a
     * multiple of the `sourceTexture's` ``MTLTexture/pixelFormat`` block size.
     * If the block extends outside the bounds of the texture, clamp `sourceSize`
     * to the edge of the texture.
     * - destinationBuffer: An ``MTLBuffer`` instance the command copies data to.
     * - destinationOffset: A byte offset within `destinationBuffer` the command copies to. The value
     * you provide as this argument needs to be a multiple of `sourceTexture's` pixel size,
     * in bytes.
     * - destinationBytesPerRow: The number of bytes between adjacent rows of pixels in `destinationBuffer`.
     * This value must be a multiple of `sourceTexture's` pixel size, in bytes,
     * and less than or equal to the product of `sourceTexture's` pixel size,
     * in bytes, and the largest pixel width `sourceTexture’s` type allows. If
     * `sourceTexture` uses a compressed pixel format, set `destinationBytesPerRow`
     * to the number of bytes between the starts of two row blocks.
     * - destinationBytesPerImage: The number of bytes between each 2D image of a 3D texture. This value must
     * be a multiple of `sourceTexture's` pixel size, in bytes. Set this value to
     * `0` if `sourceSize's` ``MTLSize/depth`` value is `1`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImage(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage);

    /**
     * Encodes a command that copies image data from a slice of a texture instance to a buffer, with
     * options for special texture formats.
     * 
     * - Parameters:
     * - sourceTexture: An ``MTLTexture`` texture that the command copies data from. To read the source
     * texture contents, you need to set its ``MTLTexture/framebufferOnly`` property
     * to <doc://com.apple.documentation/documentation/swift/false> prior to drawing into it.
     * - sourceSlice: A slice within `sourceTexture` the command uses as a starting point to copy
     * data from. Set this to `0` if `sourceTexture` isn’t a texture array or a
     * cube texture.
     * - sourceLevel: A mipmap level within `sourceTexture`.
     * - sourceOrigin: An ``MTLOrigin`` instance that represents a location within `sourceTexture`
     * that the command begins copying data from. Assign `0` to each dimension
     * that’s not relevant to `sourceTexture`.
     * - sourceSize: An ``MTLSize`` instance that represents the size of the region, in pixels,
     * that the command copies from `sourceTexture`, starting at `sourceOrigin`.
     * Assign `1` to each dimension that’s not relevant to `sourceTexture`.
     * If `sourceTexture` uses a compressed pixel format, set `sourceSize` to a
     * multiple of the `sourceTexture's` ``MTLTexture/pixelFormat`` block size.
     * If the block extends outside the bounds of the texture, clamp `sourceSize`
     * to the edge of the texture.
     * - destinationBuffer: An ``MTLBuffer`` instance the command copies data to.
     * - destinationOffset: A byte offset within `destinationBuffer` the command copies to. The value
     * you provide as this argument needs to be a multiple of `sourceTexture's` pixel size,
     * in bytes.
     * - destinationBytesPerRow: The number of bytes between adjacent rows of pixels in `destinationBuffer`.
     * This value must be a multiple of `sourceTexture's` pixel size, in bytes,
     * and less than or equal to the product of `sourceTexture's` pixel size,
     * in bytes, and the largest pixel width `sourceTexture’s` type allows. If
     * `sourceTexture` uses a compressed pixel format, set `destinationBytesPerRow`
     * to the number of bytes between the starts of two row blocks.
     * - destinationBytesPerImage: The number of bytes between each 2D image of a 3D texture. This value must
     * be a multiple of `sourceTexture's` pixel size, in bytes. Set this value to
     * `0` if `sourceSize's` ``MTLSize/depth`` value is `1`.
     * - options: A ``MTLBlitOption`` value that applies to textures with applicable pixel
     * formats, such as combined depth/stencil or PVRTC formats. If `sourceTexture's`
     * ``MTLTexture/pixelFormat`` is a combined depth/stencil format, set `options`
     * to either ``MTLBlitOption/MTLBlitOptionDepthFromDepthStencil`` or
     * ``MTLBlitOption/MTLBlitOptionStencilFromDepthStencil``, but not both.
     * If `sourceTexture's` ``MTLTexture/pixelFormat`` is a PVRTC format, set
     * `options` to ``MTLBlitOption/MTLBlitOptionRowLinearPVRTC``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toBuffer:destinationOffset:destinationBytesPerRow:destinationBytesPerImage:options:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToBufferDestinationOffsetDestinationBytesPerRowDestinationBytesPerImageOptions(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer destinationBuffer, @NUInt long destinationOffset,
            @NUInt long destinationBytesPerRow, @NUInt long destinationBytesPerImage, @NUInt long options);

    /**
     * Encodes a command that copies image data from a slice of a texture into a slice of another texture.
     * 
     * - Parameters:
     * - sourceTexture: An ``MTLTexture`` texture that the command copies data from. To read the source
     * texture contents, you need to set its ``MTLTexture/framebufferOnly`` property
     * to <doc://com.apple.documentation/documentation/swift/false> prior to drawing into it.
     * - sourceSlice: A slice within `sourceTexture` the command uses as a starting point to copy
     * data from. Set this to `0` if `sourceTexture` isn’t a texture array or a
     * cube texture.
     * - sourceLevel: A mipmap level within `sourceTexture`.
     * - sourceOrigin: An ``MTLOrigin`` instance that represents a location within `sourceTexture`
     * that the command begins copying data from. Assign `0` to each dimension
     * that’s not relevant to `sourceTexture`.
     * - sourceSize: An ``MTLSize`` instance that represents the size of the region, in pixels,
     * that the command copies from `sourceTexture`, starting at `sourceOrigin`.
     * Assign `1` to each dimension that’s not relevant to `sourceTexture`. If
     * sourceTexture uses a compressed pixel format, set `sourceSize` to a multiple
     * of the pixel format’s block size. If the block extends outside the bounds of
     * the texture, clamp `sourceSize` to the edge of the texture.
     * - destinationTexture: Another ``MTLTexture`` the command copies the data to that has the same
     * ``MTLTexture/pixelFormat`` and ``MTLTexture/sampleCount`` as `sourceTexture`.
     * To write the contents into this texture, you need to set its ``MTLTexture/framebufferOnly``
     * property to <doc://com.apple.documentation/documentation/swift/false>.
     * - destinationSlice: A slice within `destinationTexture` the command uses as its starting point
     * for copying data to. Set this to `0` if `destinationTexture` isn’t a texture
     * array or a cube texture.
     * - destinationLevel: A mipmap level within `destinationTexture`. The mipmap level you reference needs to
     * have the same size as the `sourceTexture` slice's mipmap at `sourceLevel`.
     * - destinationOrigin: An ``MTLOrigin`` instance that represents a location within `destinationTexture`
     * that the command begins copying data to. Assign `0` to each dimension that’s
     * not relevant to `destinationTexture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:sourceOrigin:sourceSize:toTexture:destinationSlice:destinationLevel:destinationOrigin:")
    void copyFromTextureSourceSliceSourceLevelSourceOriginSourceSizeToTextureDestinationSliceDestinationLevelDestinationOrigin(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @ByValue MTLOrigin sourceOrigin, @ByValue MTLSize sourceSize,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture, @NUInt long destinationSlice,
            @NUInt long destinationLevel, @ByValue MTLOrigin destinationOrigin);

    /**
     * Encodes a command that copies slices of a texture to slices of another texture.
     * 
     * - Parameters:
     * - sourceTexture: A ``MTLTexture`` texture that the command copies data from. To read the source
     * texture contents, you need to set its ``MTLTexture/framebufferOnly`` property
     * to <doc://com.apple.documentation/documentation/swift/false> prior to drawing into it.
     * - sourceSlice: A slice within `sourceTexture` the command uses as a starting point to copy
     * data from. Set this to `0` if `sourceTexture` isn’t a texture array or a
     * cube texture.
     * - sourceLevel: A mipmap level within `sourceTexture`.
     * - destinationTexture: Another ``MTLTexture`` the command copies the data to that has the same
     * ``MTLTexture/pixelFormat`` and ``MTLTexture/sampleCount`` as `sourceTexture`.
     * To write the contents into this texture, you need to set its ``MTLTexture/framebufferOnly``
     * property to <doc://com.apple.documentation/documentation/swift/false>.
     * - destinationSlice: A slice within `destinationTexture` the command uses as its starting point
     * for copying data to. Set this to `0` if `destinationTexture` isn’t a texture
     * array or a cube texture.
     * - destinationLevel: A mipmap level within `destinationTexture`. The mipmap level you reference needs to
     * have the same size as the `sourceTexture` slice's mipmap at `sourceLevel`.
     * - sliceCount: The number of slices the command copies so that it satisfies the conditions
     * that the sum of `sourceSlice` and `sliceCount` doesn’t exceed the number of
     * slices in `sourceTexture` and the sum of `destinationSlice` and `sliceCount`
     * doesn’t exceed the number of slices in `destinationTexture`.
     * - levelCount: The number of mipmap levels the command copies so that it satisfies the
     * conditions that the sum of `sourceLevel` and `levelCount` doesn’t exceed the
     * number of mipmap levels in `sourceTexture` and the sum of `destinationLevel`
     * and `levelCount` doesn’t exceed the number of mipmap levels in `destinationTexture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTexture:sourceSlice:sourceLevel:toTexture:destinationSlice:destinationLevel:sliceCount:levelCount:")
    void copyFromTextureSourceSliceSourceLevelToTextureDestinationSliceDestinationLevelSliceCountLevelCount(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture, @NUInt long sourceSlice,
            @NUInt long sourceLevel, @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture,
            @NUInt long destinationSlice, @NUInt long destinationLevel, @NUInt long sliceCount, @NUInt long levelCount);

    /**
     * Encodes a command that copies data from a texture to another.
     * 
     * - Parameters:
     * - sourceTexture: An ``MTLTexture`` instance the command copies data from.
     * - destinationTexture: Another ``MTLTexture`` instance the command copies the data into that has the same
     * ``MTLTexture/pixelFormat`` and ``MTLTexture/sampleCount`` as `sourceTexture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyFromTexture:toTexture:")
    void copyFromTextureToTexture(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture);

    /**
     * Encodes a command that copies commands from an indirect command buffer into another.
     * 
     * - Parameters:
     * - source: An ``MTLIndirectCommandBuffer`` instance from where the command copies.
     * - sourceRange: The range of commands in `source` to copy.
     * The copy operation requires that the source range starts at a valid execution point.
     * - destination: Another ``MTLIndirectCommandBuffer`` instance into which the command copies.
     * - destinationIndex: An index in `destination` into where the command copies content to. The copy operation
     * requires
     * that the destination index is a valid execution point with enough space left in `destination`
     * to accommodate `sourceRange.count` commands.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyIndirectCommandBuffer:sourceRange:destination:destinationIndex:")
    void copyIndirectCommandBufferSourceRangeDestinationDestinationIndex(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer source, @ByValue NSRange sourceRange,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer destination,
            @NUInt long destinationIndex);

    /**
     * Encodes a compute dispatch command with a grid that aligns to threadgroup boundaries.
     * 
     * - Parameters:
     * - threadgroupsPerGrid: An ``MTLSize`` instance that represents the number of threadgroups in the grid,
     * in each dimension.
     * - threadsPerThreadgroup: An ``MTLSize`` instance that represents the number of threads in one
     * threadgroup, in each dimension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchThreadgroups:threadsPerThreadgroup:")
    void dispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * Encodes a compute dispatch command with a grid that aligns to threadgroup boundaries, using an indirect buffer
     * for arguments.
     * 
     * This method allows you to supply the threadgroups-per-grid counts indirectly via an ``MTLBuffer`` index. This
     * enables you to calculate this value in the GPU timeline from a shader function, enabling GPU-driven workflows.
     * 
     * Metal assumes that the buffer contents correspond to the layout of struct
     * ``MTLDispatchThreadgroupsIndirectArguments``.
     * You are responsible for ensuring this address aligns to 4-bytes.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectBuffer`
     * parameter references.
     * 
     * - Parameters:
     * - indirectBuffer: GPUAddress of a ``MTLBuffer`` instance providing compute parameters.
     * Lay out the data in this buffer as described in the
     * ``MTLDispatchThreadgroupsIndirectArguments`` structure. This address
     * requires 4-byte alignment.
     * - threadsPerThreadgroup: A ``MTLSize`` instance that represents the number of threads in one
     * threadgroup, in each dimension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchThreadgroupsWithIndirectBuffer:threadsPerThreadgroup:")
    void dispatchThreadgroupsWithIndirectBufferThreadsPerThreadgroup(long indirectBuffer,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * Encodes a compute dispatch command using an arbitrarily-sized grid.
     * 
     * - Parameters:
     * - threadsPerGrid: An ``MTLSize`` instance that represents the number of threads in the grid,
     * in each dimension.
     * - threadsPerThreadgroup: An ``MTLSize`` instance that represents the number of threads in one
     * threadgroup, in each dimension.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchThreads:threadsPerThreadgroup:")
    void dispatchThreadsThreadsPerThreadgroup(@ByValue MTLSize threadsPerGrid, @ByValue MTLSize threadsPerThreadgroup);

    /**
     * Encodes a compute dispatch command with an arbitrarily sized grid, using an indirect buffer for arguments.
     * 
     * - Parameters:
     * - indirectBuffer: GPUAddress of a ``MTLBuffer`` instance providing arguments. Lay out the data
     * in this buffer as described in the ``MTLDispatchThreadsIndirectArguments``
     * structure. This address requires 4-byte alignment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("dispatchThreadsWithIndirectBuffer:")
    void dispatchThreadsWithIndirectBuffer(long indirectBuffer);

    /**
     * Encodes an instruction to execute commands from an indirect command buffer, using an indirect buffer for
     * arguments.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the indirect buffer that the `indirectRangeBuffer`
     * parameter references.
     * 
     * - Parameters:
     * - indirectCommandbuffer: ``MTLIndirectCommandBuffer`` instance containing the commands to execute.
     * - indirectRangeBuffer: GPUAddress of a ``MTLBuffer`` containing the execution range. Lay out the data
     * in this buffer as described in the ``MTLIndirectCommandBufferExecutionRange``
     * structure. This address requires 4-byte alignment.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:")
    void executeCommandsInBufferIndirectBuffer(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer indirectCommandbuffer,
            long indirectRangeBuffer);

    /**
     * Encodes a command to execute a series of commands from an indirect command buffer.
     * 
     * - Parameters:
     * - indirectCommandBuffer: ``MTLIndirectCommandBuffer`` instance containing the commands to execute.
     * - executionRange: The range of commands to execute.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    /**
     * Encodes a command that fills a buffer with a constant value for each byte.
     * 
     * - Parameters:
     * - buffer: A ``MTLBuffer`` instance for which this command assigns each byte in a range to a value.
     * - range: A range of bytes within `buffer` the command assigns value to. When calling this method, pass in a
     * range with a length greater than `0`.
     * - value: The value to write to each byte.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fillBuffer:range:value:")
    void fillBufferRangeValue(@Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer buffer, @ByValue NSRange range,
            byte value);

    /**
     * Encodes a command that generates mipmaps for a texture instance from the base mipmap level up to the highest
     * mipmap level.
     * 
     * This method generates mipmaps for a mipmapped texture. The texture you provide needs to have a
     * ``MTLTexture/mipmapLevelCount`` greater than `1`, and a color-renderable or color-filterable
     * ``MTLTexture/pixelFormat``.
     * 
     * - Parameter texture: A mipmapped, color-renderable or color-filterable ``MTLTexture`` instance the command
     * generates mipmaps for.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("generateMipmapsForTexture:")
    void generateMipmapsForTexture(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture);

    /**
     * Encodes a command that modifies the contents of a texture to improve the performance of CPU accesses to
     * its contents.
     * 
     * Optimizing a texture for CPU access may affect the performance of GPU accesses, however, the data the GPU
     * retrieves from the texture remains consistent.
     * 
     * You typically use this command for:
     * * Textures the CPU accesses for an extended period of time.
     * * Textures with a ``MTLTextureDescriptor/storageMode`` property that's ``MTLStorageMode/MTLStorageModeShared`` or
     * ``MTLStorageMode/MTLStorageModeManaged``.
     * 
     * - Parameter texture: A ``MTLTexture`` instance the command optimizes for CPU access.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:")
    void optimizeContentsForCPUAccess(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture);

    /**
     * Encodes a command that modifies the contents of a texture to improve the performance of CPU accesses
     * to its contents in a specific region.
     * 
     * Optimizing a texture for CPU access may affect the performance of GPU accesses, however, the data the GPU
     * retrieves from the texture remains consistent.
     * 
     * You typically use this command for:
     * * Textures the CPU accesses for an extended period of time.
     * * Textures with a ``MTLTextureDescriptor/storageMode`` property that's ``MTLStorageMode/MTLStorageModeShared`` or
     * ``MTLStorageMode/MTLStorageModeManaged``.
     * 
     * - Parameters:
     * - texture: A ``MTLTexture`` the command optimizes for CPU access.
     * - slice: A slice within `texture`.
     * - level: A mipmap level within `texture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("optimizeContentsForCPUAccess:slice:level:")
    void optimizeContentsForCPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture,
            @NUInt long slice, @NUInt long level);

    /**
     * Encodes a command that modifies the contents of a texture to improve the performance of GPU accesses
     * to its contents.
     * 
     * Optimizing a texture for GPU access may affect the performance of CPU accesses, however, the data the CPU
     * retrieves from the texture remains consistent.
     * 
     * You typically run this command for:
     * * Textures the GPU accesses for an extended period of time.
     * * Textures with a ``MTLTextureDescriptor/storageMode`` property that's ``MTLStorageMode/MTLStorageModeShared`` or
     * ``MTLStorageMode/MTLStorageModeManaged``.
     * 
     * - Parameter texture: A ``MTLTexture`` instance the command optimizes for GPU access.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:")
    void optimizeContentsForGPUAccess(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture);

    /**
     * Encodes a command that modifies the contents of a texture instance to improve the performance of GPU accesses
     * to its contents in a specific region.
     * 
     * Optimizing a texture for GPU access may affect the performance of CPU accesses, however, the data the CPU
     * retrieves from the texture remains consistent.
     * 
     * You typically run this command for:
     * * Textures the GPU accesses for an extended period of time.
     * * Textures with a ``MTLTextureDescriptor/storageMode`` property that's ``MTLStorageMode/MTLStorageModeShared`` or
     * ``MTLStorageMode/MTLStorageModeManaged``.
     * 
     * - Parameters:
     * - texture: A ``MTLTexture`` the command optimizes for GPU access.
     * - slice: A slice within `texture`.
     * - level: A mipmap level within `texture`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("optimizeContentsForGPUAccess:slice:level:")
    void optimizeContentsForGPUAccessSliceLevel(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture,
            @NUInt long slice, @NUInt long level);

    /**
     * Encode a command to attempt to improve the performance of a range of commands within an indirect command buffer.
     * 
     * - Parameters:
     * - indirectCommandBuffer: An ``MTLIndirectCommandBuffer`` instance that this command optimizes.
     * - range: A range of commands within `indirectCommandBuffer`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("optimizeIndirectCommandBuffer:withRange:")
    void optimizeIndirectCommandBufferWithRange(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange range);

    /**
     * Encodes an acceleration structure refit into the command buffer.
     * 
     * You refit an acceleration structure to update it when the geometry it references changes. This operation is
     * typically
     * much faster than rebuilding the acceleration structure from scratch. The trade off is that after you refit the
     * acceleration structure, its quality, as well as the performance of any subsequent ray tracing operation degrades,
     * depending on how much the geometry changes.
     * 
     * After certain operations, refitting an acceleration structure may not be possible, for example, after adding or
     * removing geometry.
     * 
     * When you refit an acceleration structure, you can do so in place, by specifying the same source and destination
     * acceleration structures, or by providing a `nil` destination acceleration structure. If the source and
     * destination
     * acceleration structures aren't the same, then you are responsible for ensuring they don't overlap in memory.
     * 
     * Typically, the destination acceleration structure is at least as large as the source acceleration structure,
     * except in cases where you compact the source acceleration structure. In this case, you need to allocate the
     * destination acceleration to be at least as large as the compacted size of the source acceleration structure.
     * 
     * The scratch buffer you provide for the refit operation needs to be at least as large as the size that the query
     * ``MTLDevice/accelerationStructureSizesWithDescriptor:`` returns. If the size this query returns is zero, you
     * can omit providing a scratch buffer by passing `0` as the address to the `scratchBuffer` parameter.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the scratch buffer the `scratchBuffer` parameter
     * references,
     * as well as for all the instance and primitive acceleration structures you directly and indirectly reference.
     * 
     * - Parameters:
     * - sourceAccelerationStructure: Acceleration structure to refit.
     * - descriptor: A descriptor for the acceleration structure to refit.
     * - destinationAccelerationStructure: Acceleration structure to store the refit result into.
     * If `destinationAccelerationStructure` is `nil`, Metal performs an in-place
     * refit operation of the `sourceAccelerationStructure`.
     * - scratchBuffer: Scratch buffer Metal can use while refitting the acceleration structure.
     * Metal may overwrite the contents of this buffer, and you should consider
     * them "undefined" after the refit operation starts and completes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:")
    void refitAccelerationStructureDescriptorDestinationScratchBuffer(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure sourceAccelerationStructure,
            @NotNull MTL4AccelerationStructureDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLAccelerationStructure destinationAccelerationStructure,
            @ByValue MTL4BufferRange scratchBuffer);

    /**
     * Encodes an acceleration structure refit operation into the command buffer, providing additional options.
     * 
     * You refit an acceleration structure to update it when the geometry it references changes. This operation is
     * typically
     * much faster than rebuilding the acceleration structure from scratch. The trade off is that after you refit the
     * acceleration structure, its quality, as well as the performance of any subsequent ray tracing operation degrades,
     * depending on how much the geometry changes.
     * 
     * After certain operations, refitting an acceleration structure may not be possible, for example, after adding or
     * removing geometry.
     * 
     * When you refit an acceleration structure, you can do so in place, by specifying the same source and destination
     * acceleration structures, or by providing a `nil` destination acceleration structure. If the source and
     * destination
     * acceleration structures aren't the same, then you are responsible for ensuring they don't overlap in memory.
     * 
     * Typically, the destination acceleration structure is at least as large as the source acceleration structure,
     * except in cases where you compact the source acceleration structure. In this case, you need to allocate the
     * destination acceleration to be at least as large as the compacted size of the source acceleration structure.
     * 
     * The scratch buffer you provide for the refit operation needs to be at least as large as the size that the query
     * ``MTLDevice/accelerationStructureSizesWithDescriptor:`` returns. If the size this query returns is zero, you
     * can omit providing a scratch buffer by passing `0` as the address to the `scratchBuffer` parameter.
     * 
     * Use an instance of ``MTLResidencySet`` to mark residency of the scratch buffer the `scratchBuffer` parameter
     * references,
     * as well as for all the instance and primitive acceleration structures you directly and indirectly reference.
     * 
     * - Parameters:
     * - sourceAccelerationStructure: Acceleration structure to refit.
     * - descriptor: A descriptor for the acceleration structure to refit.
     * - destinationAccelerationStructure: Acceleration structure to store the refit result into.
     * If `destinationAccelerationStructure` is `nil`, Metal performs an in-place
     * refit operation of the `sourceAccelerationStructure`.
     * - scratchBuffer: Scratch buffer Metal can use while refitting the acceleration structure.
     * Metal may overwrite the contents of this buffer, and you should consider
     * them "undefined" after the refit operation starts and completes.
     * - options: Options specifying the elements of the acceleration structure to refit.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:options:")
    void refitAccelerationStructureDescriptorDestinationScratchBufferOptions(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure sourceAccelerationStructure,
            @NotNull MTL4AccelerationStructureDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLAccelerationStructure destinationAccelerationStructure,
            @ByValue MTL4BufferRange scratchBuffer, @NUInt long options);

    /**
     * Encodes a command that resets a range of commands in an indirect command buffer.
     * 
     * - Parameters:
     * - buffer: An ``MTLIndirectCommandBuffer`` the command resets.
     * - range: A range of commands within `buffer`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resetCommandsInBuffer:withRange:")
    void resetCommandsInBufferWithRange(@Mapped(ObjCObjectMapper.class) @NotNull MTLIndirectCommandBuffer buffer,
            @ByValue NSRange range);

    /**
     * Sets an argument table for the compute shader stage of this pipeline.
     * 
     * Metal takes a snapshot of the resources in the argument table when you make dispatch or execute calls on
     * this encoder instance. Metal makes the snapshot contents available to the compute shader function of the
     * current pipeline state.
     * 
     * - Parameters:
     * - argumentTable: A ``MTL4ArgumentTable`` to set on the command encoder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setArgumentTable:")
    void setArgumentTable(@Mapped(ObjCObjectMapper.class) @Nullable MTL4ArgumentTable argumentTable);

    /**
     * Configures this encoder with a compute pipeline state that applies to your subsequent dispatch commands.
     * 
     * - Parameter state: a non-`nil` ``MTLComputePipelineState``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@Mapped(ObjCObjectMapper.class) @NotNull MTLComputePipelineState state);

    /**
     * Specifies the size, in pixels, of imageblock data in tile memory.
     * 
     * - Parameters:
     * - width: The width of the imageblock, in pixels.
     * - height: The height of the imageblock, in pixels.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setImageblockWidth:height:")
    void setImageblockWidthHeight(@NUInt long width, @NUInt long height);

    /**
     * Configures the size of a threadgroup memory buffer for a threadgroup argument in the compute shader function.
     * 
     * - Parameters:
     * - length: The size of the threadgroup memory, in bytes. Use a multiple of `16` bytes.
     * - index: An integer that corresponds to the index of the argument you annotate with attribute
     * `[[threadgroup(index)]]`
     * in the shader function.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * Queries a bitmask representing the shader stages on which commands currently present in this command encoder
     * operate.
     * 
     * Metal dynamically updates this property based on the commands you encode into the command encoder, for example,
     * it sets the bit ``MTLStages/MTLStageDispatch`` if this encoder contains any commands that dispatch a compute
     * kernel.
     * 
     * Similarly, it sets the bit ``MTLStages/MTLStageBlit`` if this encoder contains any commands to copy or modify
     * buffers,
     * textures, or indirect command buffers.
     * 
     * Finally, Metal sets the bit ``MTLStages/MTLStageAccelerationStructure`` if this encoder contains any commands
     * that
     * build, copy, or refit acceleration structures.
     * 
     * - Returns: a bitmask representing shader stages that commands currently present in this command encoder operate
     * on.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("stages")
    @NUInt
    long stages();

    /**
     * Encodes a command to compute the size an acceleration structure can compact into, writing the result
     * into a buffer.
     * 
     * This size is potentially smaller than the acceleration structure. To perform compaction, you typically read
     * this size from the buffer once the command buffer completes. You then use it to allocate a new, potentially
     * smaller acceleration structure. Finally, you call the
     * ``copyAndCompactAccelerationStructure:toAccelerationStructure:``
     * method to perform the copy.
     * 
     * - Parameters:
     * - accelerationStructure: Source acceleration structure.
     * - buffer: Destination size buffer. Metal writes the compacted size as a 64-bit unsigned integer
     * value, representing the compacted size in bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("writeCompactedAccelerationStructureSize:toBuffer:")
    void writeCompactedAccelerationStructureSizeToBuffer(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLAccelerationStructure accelerationStructure,
            @ByValue MTL4BufferRange buffer);

    /**
     * Writes a GPU timestamp into a heap.
     * 
     * The method ensures that any prior work finishes, but doesn't delay any subsequent work.
     * 
     * You can alter this command's behavior through the `granularity` parameter.
     * - Pass ``MTL4TimestampGranularity/MTL4TimestampGranularityRelaxed`` to allow Metal to provide timestamps with
     * minimal impact to runtime performance, but with less detail. For example, the command may group all timestamps
     * for
     * a pass together.
     * - Pass ``MTL4TimestampGranularity/MTL4TimestampGranularityPrecise`` to request that Metal provides timestamps
     * with the most detail. This can affect runtime performance.
     * 
     * - Parameters:
     * - granularity: ``MTL4TimestampGranularity`` hint to Metal about acceptable the level of precision.
     * - counterHeap: ``MTL4CounterHeap`` to write timestamps into.
     * - index: The index value into which Metal writes the timestamp.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("writeTimestampWithGranularity:intoHeap:atIndex:")
    void writeTimestampWithGranularityIntoHeapAtIndex(@NInt long granularity,
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4CounterHeap counterHeap, @NUInt long index);
}