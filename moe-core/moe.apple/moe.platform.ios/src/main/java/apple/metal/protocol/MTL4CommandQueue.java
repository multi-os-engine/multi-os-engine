package apple.metal.protocol;

import apple.metal.MTL4CommitOptions;
import apple.metal.struct.MTL4CopySparseBufferMappingOperation;
import apple.metal.struct.MTL4CopySparseTextureMappingOperation;
import apple.metal.struct.MTL4UpdateSparseBufferMappingOperation;
import apple.metal.struct.MTL4UpdateSparseTextureMappingOperation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An abstraction representing a command queue that you use commit and synchronize command buffers and to
 * perform other GPU operations.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CommandQueue")
public interface MTL4CommandQueue {
    /**
     * Marks a residency set as part of this command queue.
     * 
     * Ensures that Metal makes the residency set resident during the execution of all command buffers you commit to
     * this
     * command queue.
     * 
     * Each command queue supports up to 32 unique residency set instances.
     * 
     * - Parameter residencySet: ``MTLResidencySet`` to add to the command queue.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addResidencySet:")
    void addResidencySet(@Mapped(ObjCObjectMapper.class) @NotNull MTLResidencySet residencySet);

    /**
     * Marks an array of residency sets as part of this command queue.
     * 
     * Ensures that Metal makes the residency set resident during the execution of all command buffers you commit to
     * this
     * command queue.
     * 
     * Each command queue supports up to 32 unique residency set instances.
     * 
     * - Parameters:
     * - residencySets: Array of ``MTLResidencySet`` instances to add to the command queue.
     * - count: Number of ``MTLResidencySet`` instances in the array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("addResidencySets:count:")
    void addResidencySetsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> residencySets,
            @NUInt long count);

    /**
     * Enqueues an array of command buffers for execution.
     * 
     * The order in which you sort the command buffers in the array is meaningful, especially when it contains
     * suspending/resuming
     * render passes. A suspending/resuming render pass is a render pass you create by calling
     * ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:``,
     * and provide `MTL4RenderEncoderOptionSuspending` or `MTL4RenderEncoderOptionResuming` for the `options` parameter.
     * 
     * If your command buffers contain suspend/resume render passes, ensure that the first command buffer only suspends,
     * and the last one only resumes. Additionally, make sure that all intermediate command buffers are both suspending
     * and resuming.
     * 
     * - Parameters:
     * - commandBuffers: an array of ``MTL4CommandBuffer``.
     * - count: the number of ``MTL4CommandBuffer`` instances in the `commandBuffers` array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("commit:count:")
    void commitCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> commandBuffers,
            @NUInt long count);

    /**
     * Enqueues an array of command buffer instances for execution with a set of options.
     * 
     * Provide an ``MTL4CommitOptions`` instance to configure the commit operation.
     * 
     * The order in which you sort the command buffers in the array is meaningful, especially when it contains
     * suspending/resuming
     * render passes. A suspending/resuming render pass is a render pass you create by calling
     * ``MTL4CommandBuffer/renderCommandEncoderWithDescriptor:options:``,
     * and provide `MTL4RenderEncoderOptionSuspending` or `MTL4RenderEncoderOptionResuming` for the `options` parameter.
     * 
     * If your command buffers contain suspend/resume render passes, ensure that the first command buffer only suspends,
     * and the last one only resumes. Additionally, make sure that all intermediate command buffers are both suspending
     * and resuming.
     * 
     * When you commit work from multiple threads, modifying and reusing the same options instance,
     * you are responsible for externally synchronizing access to it.
     * 
     * - Parameters:
     * - commandBuffers: an array of ``MTL4CommandBuffer``.
     * - count: the number of ``MTL4CommandBuffer`` instances in the `commandBuffers` array.
     * - options: an instance of ``MTL4CommitOptions`` that configures the commit operation.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("commit:count:options:")
    void commitCountOptions(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> commandBuffers,
            @NUInt long count, @NotNull MTL4CommitOptions options);

    /**
     * Copies multiple offsets within a source placement sparse buffer to a destination placement sparse buffer.
     * 
     * You are responsible for ensuring the source destination sparse buffers have the same `placementSparsePageSize`
     * when
     * you create them via ``MTLDevice/newBufferWithLength:options:placementSparsePageSize:``.
     * 
     * Additionally, you are responsible for ensuring both the source and destination sparse buffers don't use the same
     * aliased
     * tiles at the same time.
     * 
     * - Note: If a sparse texture and a sparse buffer share the same backing tiles, these don't provide you
     * with meaningful views of the other resource’s data.
     * 
     * - Parameters:
     * - sourceBuffer: The source placement sparse ``MTLBuffer``.
     * - destinationBuffer: The destination placement sparse ``MTLBuffer``.
     * - operations: An array of ``MTL4CopySparseBufferMappingOperation`` instances to perform.
     * - count: Number of operations to perform.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyBufferMappingsFromBuffer:toBuffer:operations:count:")
    void copyBufferMappingsFromBufferToBufferOperationsCount(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer sourceBuffer,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer destinationBuffer,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTL4CopySparseBufferMappingOperation operations,
            @NUInt long count);

    /**
     * Copies multiple regions within a source placement sparse texture to a destination placement sparse texture.
     * 
     * You are responsible for ensuring the source and destination textures have the same
     * ``MTLTextureDescriptor/placementSparsePageSize``.
     * 
     * Additionally, you are responsible for ensuring that the source and destination textures don't use the same
     * aliased tiles
     * at the same time.
     * 
     * - Note: If a sparse texture and a sparse buffer share the same backing tiles, these don't provide you
     * you with meaningful views of the other resource’s data.
     * 
     * - Parameters:
     * - sourceTexture: The source placement sparse ``MTLTexture``.
     * - destinationTexture: The destination placement sparse ``MTLTexture``.
     * - operations: An array of ``MTL4CopySparseTextureMappingOperation`` instances to perform.
     * - count: Number of operations to perform.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("copyTextureMappingsFromTexture:toTexture:operations:count:")
    void copyTextureMappingsFromTextureToTextureOperationsCount(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture destinationTexture,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTL4CopySparseTextureMappingOperation operations,
            @NUInt long count);

    /**
     * Returns the GPU device that the command queue belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Obtains this queue's optional label for debugging purposes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Removes a residency set from the command queue.
     * 
     * After calling this method ensures only the remaining residency sets remain resident during the execution of the
     * command buffers you commit this command queue.
     * 
     * - Parameter residencySet: ``MTLResidencySet`` instance to remove from the command queue.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeResidencySet:")
    void removeResidencySet(@Mapped(ObjCObjectMapper.class) @NotNull MTLResidencySet residencySet);

    /**
     * Removes multiple residency sets from the command queue.
     * 
     * After calling this method ensures only the remaining residency sets remain resident during the execution of the
     * command buffers you commit this command queue.
     * 
     * - Parameters:
     * - residencySets: Array of ``MTLResidencySet`` instances to remove from the command queue.
     * - count: Number of ``MTLResidencySet`` instances in the array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("removeResidencySets:count:")
    void removeResidencySetsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> residencySets,
            @NUInt long count);

    /**
     * Schedules a signal operation on the command queue to indicate when rendering to a Metal drawable is complete.
     * 
     * Signaling when rendering to a ``MTLDrawable`` instance is complete indicates that it's safe to present it to the
     * display.
     * 
     * You are responsible for calling this method after committing all command buffers that contain commands targeting
     * this drawable, and before calling ``MTLDrawable/present``, ``MTLDrawable/presentAtTime:``, or
     * ``MTLDrawable/presentAfterMinimumDuration:``.
     * 
     * - Note: This method doesn't trigger the presentation of the drawable, and fails if you call it after any of the
     * present methods, or if you call it multiple times.
     * 
     * Metal doesn't guarantee that command buffers you commit to the command queue after calling this method execute
     * before presentation.
     * 
     * - Parameters:
     * - drawable: ``MTLDrawable`` instance to signal.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("signalDrawable:")
    void signalDrawable(@Mapped(ObjCObjectMapper.class) @NotNull MTLDrawable drawable);

    /**
     * Schedules an operation to signal a GPU event with a specific value after all GPU work prior to this point is
     * complete.
     * 
     * - Parameters:
     * - event: ``MTLEvent`` to signal.
     * - value: the value to signal the ``MTLEvent`` with.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("signalEvent:value:")
    void signalEventValue(@Mapped(ObjCObjectMapper.class) @NotNull MTLEvent event, long value);

    /**
     * Updates multiple regions within a placement sparse buffer to alias specific tiles from a Metal heap.
     * 
     * You can provide a `nil` parameter to the `heap` argument only when you perform unmap operations. Otherwise, you
     * are
     * responsible for ensuring parameter `heap` references an ``MTLHeap`` that has a
     * ``MTLHeapDescriptor/maxCompatiblePlacementSparsePageSize``
     * of at least the buffer's `placementSparsePageSize` you assign when creating the sparse buffer via
     * ``MTLDevice/newBufferWithLength:options:placementSparsePageSize:``.
     * 
     * - Parameters:
     * - buffer: A placement sparse ``MTLBuffer``.
     * - heap: An ``MTLHeap`` you allocate with type ``MTLHeapType/MTLHeapTypePlacement``.
     * - operations: An array of ``MTL4UpdateSparseBufferMappingOperation`` instances to perform.
     * - count: Number of operations to perform.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("updateBufferMappings:heap:operations:count:")
    void updateBufferMappingsHeapOperationsCount(@Mapped(ObjCObjectMapper.class) @NotNull MTLBuffer buffer,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLHeap heap,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTL4UpdateSparseBufferMappingOperation operations,
            @NUInt long count);

    /**
     * Updates multiple regions within a placement sparse texture to alias specific tiles of a Metal heap.
     * 
     * You can provide a `nil` parameter to the `heap` argument only if when you perform unmap operations. Otherwise,
     * you are
     * responsible for ensuring the heap is non-nil and has a
     * ``MTLHeapDescriptor/maxCompatiblePlacementSparsePageSize`` of at least the texture's
     * ``MTLTextureDescriptor/placementSparsePageSize``.
     * 
     * When performing a sparse mapping update, you are responsible for issuing a barrier against stage
     * `MTLStageResourceState`.
     * 
     * You can determine the sparse texture tier by calling `MTLTexture/sparseTextureTier`.
     * 
     * - Parameters:
     * - texture: A placement sparse ``MTLTexture``.
     * - heap: ``MTLHeap`` you allocate with type ``MTLHeapType/MTLHeapTypePlacement``.
     * - operations: An array of ``MTL4UpdateSparseTextureMappingOperation`` instances to perform.
     * - count: Number of operations to perform.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("updateTextureMappings:heap:operations:count:")
    void updateTextureMappingsHeapOperationsCount(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLHeap heap,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull MTL4UpdateSparseTextureMappingOperation operations,
            @NUInt long count);

    /**
     * Schedules a wait operation on the command queue to ensure the display is no longer using a specific Metal
     * drawable.
     * 
     * Use this method to ensure the display is no longer using a ``MTLDrawable`` instance before executing any
     * subsequent
     * commands.
     * 
     * This method returns immediately and doesn't perform any synchronization on the current thread. You are
     * responsible
     * for calling this method before committing any command buffers containing commands that target this drawable.
     * 
     * Call this method multiple times if you commit your command buffers to multiple command queues.
     * 
     * - Parameters:
     * - drawable: ``MTLDrawable`` instance to signal.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("waitForDrawable:")
    void waitForDrawable(@Mapped(ObjCObjectMapper.class) @NotNull MTLDrawable drawable);

    /**
     * Schedules an operation to wait for a GPU event of a specific value before continuing to execute any future GPU
     * work.
     * 
     * - Parameters:
     * - event: ``MTLEvent`` to wait on.
     * - value: the specific value to wait for.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("waitForEvent:value:")
    void waitForEventValue(@Mapped(ObjCObjectMapper.class) @NotNull MTLEvent event, long value);
}