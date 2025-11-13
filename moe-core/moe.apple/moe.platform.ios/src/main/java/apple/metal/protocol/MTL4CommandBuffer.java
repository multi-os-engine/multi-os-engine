package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.MTL4CommandBufferOptions;
import apple.metal.MTL4RenderPassDescriptor;
import apple.metal.struct.MTL4BufferRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Records a sequence of GPU commands.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4CommandBuffer")
public interface MTL4CommandBuffer {
    /**
     * Prepares a command buffer for encoding.
     * 
     * Attaches the command buffer to the specified ``MTL4CommandAllocator`` and declares that the
     * application is ready to encode commands into the command buffer.
     * 
     * Command allocators only service a single command buffer at a time. If you need to issue multiple
     * calls to this method simultaneously, for example, in a multi-threaded command encoding scenario,
     * create multiple instances of ``MTLCommandAllocator`` and use one for each call.
     * 
     * You can safely reuse command allocators after ending the command buffer using it by calling
     * ``endCommandBuffer``.
     * 
     * After calling this method, any prior calls to ``useResidencySet:`` and ``useResidencySets:count:``
     * on this command buffer instance no longer apply. Make sure to call these methods again to signal
     * your residency requirements to Metal.
     * 
     * - Parameter allocator: ``MTL4CommandAllocator`` to attach to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("beginCommandBufferWithAllocator:")
    void beginCommandBufferWithAllocator(@Mapped(ObjCObjectMapper.class) @NotNull MTL4CommandAllocator allocator);

    /**
     * Prepares a command buffer for encoding with additional options.
     * 
     * Attaches the command buffer to the specified ``MTL4CommandAllocator`` and declares that the
     * application is ready to encode commands into the command buffer.
     * 
     * Command allocators only service a single command buffer at a time. If you need to issue multiple
     * calls to this method simultaneously, for example, in a multi-threaded command encoding scenario,
     * create multiple instances of ``MTLCommandAllocator`` and use one for each call.
     * 
     * You can safely reuse command allocators after ending the command buffer using it by calling
     * ``endCommandBuffer``.
     * 
     * After calling this method, any prior calls to ``useResidencySet:`` and ``useResidencySets:count:``
     * on this command buffer instance no longer apply. Make sure to call these methods again to signal
     * your residency requirements to Metal.
     * 
     * The options you provide configure the command buffer only until the command buffer ends, in the
     * next call to ``endCommandBuffer``.
     * 
     * - Parameters:
     * - allocator: ``MTL4CommandAllocator`` to attach to.
     * - options: ``MTL4CommandBufferOptions`` to configure the command buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("beginCommandBufferWithAllocator:options:")
    void beginCommandBufferWithAllocatorOptions(@Mapped(ObjCObjectMapper.class) @NotNull MTL4CommandAllocator allocator,
            @NotNull MTL4CommandBufferOptions options);

    /**
     * Creates a compute command encoder.
     * 
     * - Returns: The created ``MTL4ComputeCommandEncoder`` instance, or `nil` if the function fails.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4ComputeCommandEncoder computeCommandEncoder();

    /**
     * Returns the GPU device that this command buffer belongs to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * Closes a command buffer to prepare it for submission to a command queue.
     * 
     * Explicitly ending the command buffer allows you to reuse the ``MTL4CommandAllocator`` to start servicing other
     * command buffers. It is an error to call ``commit`` on a command buffer previously recording before calling this
     * method.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("endCommandBuffer")
    void endCommandBuffer();

    /**
     * Assigns an optional label with this command buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * Creates a machine learning command encoder.
     * 
     * - Returns: The created ``MTL4MachineLearningCommandEncoder`` instance , or `nil` if the function fails.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("machineLearningCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4MachineLearningCommandEncoder machineLearningCommandEncoder();

    /**
     * Pops the latest string from the stack of debug groups for this command buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * Pushes a string onto a stack of debug groups for this command buffer.
     * 
     * - Parameter string: The string to push.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(@NotNull String string);

    /**
     * Creates a render command encoder from a render pass descriptor.
     * 
     * - Parameters:
     * - descriptor: Descriptor for the render pass.
     * - Returns: The created ``MTL4RenderCommandEncoder`` instance, or `nil` if the function failed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4RenderCommandEncoder renderCommandEncoderWithDescriptor(@NotNull MTL4RenderPassDescriptor descriptor);

    /**
     * Creates a render command encoder from a render pass descriptor with additional options.
     * 
     * This method creates a render command encoder to encode a render pass, whilst providing you the option to define
     * some render pass characteristics via an instance of ``MTL4RenderEncoderOptions``.
     * 
     * Use these options to configure suspending/resuming render command encoders, which allow you to encode render
     * passes
     * from multiple threads simultaneously.
     * 
     * - Parameters:
     * - descriptor: Descriptor for the render pass.
     * - options: ``MTL4RenderEncoderOptions`` instance that provide render pass options.
     * - Returns: The created ``MTL4RenderCommandEncoder`` instance, or `nil` if the function fails.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:options:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTL4RenderCommandEncoder renderCommandEncoderWithDescriptorOptions(@NotNull MTL4RenderPassDescriptor descriptor,
            @NUInt long options);

    /**
     * Encodes a command that resolves an opaque counter heap into a buffer.
     * 
     * The command this method encodes converts the data within `counterHeap` into a common format
     * and stores it into the `bufferRange` parameter.
     * 
     * The command places each entry in the counter heap within `range` sequentially, starting at `alignedOffset`.
     * Each entry needs to be a fixed size that you can query by calling the
     * ``MTLDevice/sizeOfCounterHeapEntry:`` method.
     * 
     * This command runs during the `MTLStageBlit` stage of the GPU timeline. Barrier against this stage
     * to ensure the data is present in the resolve buffer parameter before you access it.
     * 
     * - Note: Your app needs ensure the GPU places data in the heap before you resolve it by
     * synchronizing this stage with other GPU operations.
     * 
     * Similarly, your app needs to synchronize any GPU accesses to `bufferRange` after
     * the command completes with barrier.
     * 
     * If your app needs to access `bufferRange` from the CPU, signal an ``MTLSharedEvent``
     * to notify the CPU when it's ready.
     * Alternatively, you can resolve the heap's data from the CPU by calling
     * the heap's ``MTL4CounterHeap/resolveCounterRange:`` method.
     * 
     * - Parameters:
     * - counterHeap: A heap the command resolves.
     * - range: A range of index values within the heap the command resolves.
     * - bufferRange: The buffer the command saves the data it resolves into.
     * - fenceToWait: A fence the GPU waits for before starting, if applicable; otherwise `nil`.
     * - fenceToUpdate: A fence the system updates after the command finishes resolving the data; otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("resolveCounterHeap:withRange:intoBuffer:waitFence:updateFence:")
    void resolveCounterHeapWithRangeIntoBufferWaitFenceUpdateFence(
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4CounterHeap counterHeap, @ByValue NSRange range,
            @ByValue MTL4BufferRange bufferRange, @Mapped(ObjCObjectMapper.class) @Nullable MTLFence fenceToWait,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLFence fenceToUpdate);

    /**
     * Assigns an optional label with this command buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * Marks a residency set as part of the command buffer's execution.
     * 
     * Ensures that Metal makes resident the resources that residency set contains during execution of this command
     * buffer.
     * 
     * - Parameter residencySet: ``MTLResidencySet`` instance to mark resident.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("useResidencySet:")
    void useResidencySet(@Mapped(ObjCObjectMapper.class) @NotNull MTLResidencySet residencySet);

    /**
     * Marks an array of residency sets as part of the command buffer's execution.
     * 
     * Ensures that Metal makes resident the resources that residency sets contain during execution of this command
     * buffer.
     * 
     * - Parameters:
     * - residencySets: Array of ``MTLResidencySet`` instances to mark resident.
     * - count: Number of ``MTLResidencySet`` instances in the array.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("useResidencySets:count:")
    void useResidencySetsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> residencySets,
            @NUInt long count);

    /**
     * Writes a GPU timestamp into the given counter heap.
     * 
     * This method captures a timestamp after work prior to this command in the command buffer is complete.
     * Work after this call may or may not have started.
     * 
     * You are responsible for ensuring the `counterHeap` is of type
     * ``MTL4CounterHeapType/MTL4CounterHeapTypeTimestamp``.
     * 
     * - Parameters:
     * - counterHeap: ``MTL4CounterHeap`` to write the timestamp into.
     * - index: The index within the ``MTL4CounterHeap`` that Metal writes the timestamp to.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("writeTimestampIntoHeap:atIndex:")
    void writeTimestampIntoHeapAtIndex(@Mapped(ObjCObjectMapper.class) @NotNull MTL4CounterHeap counterHeap,
            @NUInt long index);
}