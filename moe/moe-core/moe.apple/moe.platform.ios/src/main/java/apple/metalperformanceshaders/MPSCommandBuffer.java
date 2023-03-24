package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLBlitPassDescriptor;
import apple.metal.MTLComputePassDescriptor;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.MTLResourceStatePassDescriptor;
import apple.metal.protocol.MTLAccelerationStructureCommandEncoder;
import apple.metal.protocol.MTLBlitCommandEncoder;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLComputeCommandEncoder;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLDrawable;
import apple.metal.protocol.MTLEvent;
import apple.metal.protocol.MTLLogContainer;
import apple.metal.protocol.MTLParallelRenderCommandEncoder;
import apple.metal.protocol.MTLRenderCommandEncoder;
import apple.metal.protocol.MTLResourceStateCommandEncoder;
import apple.metalperformanceshaders.protocol.MPSHeapProvider;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.MTLAccelerationStructurePassDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCommandBuffer
 * [@dependency] This depends on Metal.framework
 * 
 * A MPSCommandBuffer object is used to wrap an existing command buffer with MPS specific options.
 * 
 * A MPS kernel typically operates between a fixed set of inputs and outputs.
 * The MPSCommandBuffer class provides a way to add further encode-time parameters
 * to the encode call using the command buffer. Currently the only parameter included in the
 * MPSCommandBuffer that all MPS kernels support is the the predicate option,
 * which can be used to pre-empt the kernel from the GPU side.
 * NOTE: the options that contain metal resources will be referenced by this object and
 * therefore it is advisable to make the lifetime of this object as short as possible as is the
 * case for all command buffers.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCommandBuffer extends NSObject implements MTLCommandBuffer {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCommandBuffer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("GPUEndTime")
    public native double GPUEndTime();

    @Generated
    @Selector("GPUStartTime")
    public native double GPUStartTime();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("addCompletedHandler:")
    public native void addCompletedHandler(
            @NotNull @ObjCBlock(name = "call_addCompletedHandler") MTLCommandBuffer.Block_addCompletedHandler block);

    @Generated
    @Selector("addScheduledHandler:")
    public native void addScheduledHandler(
            @NotNull @ObjCBlock(name = "call_addScheduledHandler") MTLCommandBuffer.Block_addScheduledHandler block);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCommandBuffer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCommandBuffer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBlitCommandEncoder blitCommandEncoder();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] commandBuffer
     * 
     * The Metal Command Buffer that was used to initialize this object.
     */
    @NotNull
    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandBuffer commandBuffer();

    /**
     * Initializes a MPSCommandBuffer object from a given command queue.
     * 
     * @return A pointer to the newly initialized MPSCommandBuffer object.
     */
    @Generated
    @Selector("commandBufferFromCommandQueue:")
    public static native MPSCommandBuffer commandBufferFromCommandQueue(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    /**
     * Initializes a MPSCommandBuffer object with given MTLCommandBuffer.
     * Once we create this MPSCommandBuffer, any methods utilizing it could call commitAndContinue and so the users
     * original commandBuffer may have been committed.
     * Please use the rootCommandBuffer method to get the current alive underlying MTLCommandBuffer.
     * 
     * @return A pointer to the newly initialized MPSCommandBuffer object.
     */
    @Generated
    @Selector("commandBufferWithCommandBuffer:")
    public static native MPSCommandBuffer commandBufferWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @NotNull
    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandQueue commandQueue();

    @Generated
    @Selector("commit")
    public native void commit();

    /**
     * Commit work encoded so far and continue with a new underlying command buffer
     * 
     * This method commits the underlying root MTLCommandBuffer, and makes
     * a new one on the same command queue. The MPS heap is moved forward
     * to the new command buffer such that temporary objects used by
     * the previous command buffer can be still be used with the new one.
     * 
     * This provides a way to move work already encoded into consideration
     * by the Metal back end sooner. For large workloads, e.g. a neural networking graph
     * periodically calling -commitAndContinue may allow you to improve CPU / GPU parallelism
     * without the substantial memory increases associated with double buffering.
     * It will also help decrease overall latency.
     * 
     * Any Metal schedule or completion callbacks previously attached to this
     * object will remain attached to the old command buffer and
     * will fire as expected as the old command buffer is scheduled and
     * completes. If your application is relying on such callbacks to coordinate
     * retain / release of important objects that are needed for work encoded after
     * -commitAndContinue, your application should retain these objects before
     * calling commitAndContinue, and attach new release callbacks to this
     * object with a new completion handler so that they persist through the
     * lifetime of the new underlying command buffer. You may do this, for example
     * by adding the objects to a mutable array before calling -commitAndContinue, then
     * release the mutable array in a new completion callback added after -commitAndContinue.
     * 
     * Because -commitAndContinue commits the old command buffer then switches to a new one,
     * some aspects of command buffer completion may surprise unwary developers. For example,
     * -waitUntilCompleted called immediately after -commitAndContinue asks Metal to wait for
     * the new command buffer to finish, not the old one. Since the new command buffer presumably
     * hasn't been committed yet, it is formally a deadlock, resources may leak and Metal may
     * complain. Your application should ether call -commit before -waitUntilCompleted, or
     * capture the -rootCommandBuffer from before the call to -commitAndContinue and wait
     * on that. Similarly, your application should be sure to use the appropriate command buffer
     * when querying the [MTLCommandBuffer status] property.
     * 
     * If the underlying MTLCommandBuffer also implements -commitAndContinue, then the message
     * will be forwarded to that object instead. In this way, underlying predicate objects and
     * other state will be preserved.
     */
    @Generated
    @Selector("commitAndContinue")
    public native void commitAndContinue();

    @Nullable
    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLComputeCommandEncoder computeCommandEncoder();

    @Nullable
    @Generated
    @Selector("computeCommandEncoderWithDispatchType:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLComputeCommandEncoder computeCommandEncoderWithDispatchType(@NUInt long dispatchType);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("encodeSignalEvent:value:")
    public native void encodeSignalEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    @Generated
    @Selector("encodeWaitForEvent:value:")
    public native void encodeWaitForEventValue(@NotNull @Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    @Generated
    @Selector("enqueue")
    public native void enqueue();

    @Nullable
    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] heapProvider
     * 
     * A application supplied object to allocate MTLHeaps for MPS
     * 
     * By default this is nil, which will use MPS' device level global heap cache to
     * allocate the heaps. This is a reasonable choice. However, it may be inefficient
     * if you are keeping your own MTLHeap, since there will be two pessimistically
     * sized free stores which may be larger than is strictly necessary, and of course
     * fragmentation across multiple heaps. In such cases, the problem may be solved
     * either by using MPS' automatically managed heap (simple) or having MPS use
     * your heap. The heapProvider allows you to implement the second case. To use
     * the MPS heap, simply make temporary MPSImages, vectors and matrices.
     * 
     * If multiple MPSCommandBuffers reference the same MTLCommandBuffer, changing
     * the heapProvider on one will change the heap provider for all of them.
     */
    @Nullable
    @Generated
    @Selector("heapProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSHeapProvider heapProvider();

    @Generated
    @Selector("init")
    public native MPSCommandBuffer init();

    /**
     * Initializes an empty MPSCommandBuffer object with given MTLCommandBuffer.
     * Once we create this MPSCommandBuffer, any methods utilizing it could call commitAndContinue and so the users
     * original commandBuffer may have been committed.
     * Please use the rootCommandBuffer method to get the current alive underlying MTLCommandBuffer.
     * 
     * @return A pointer to the newly initialized MPSCommandBuffer object.
     */
    @Generated
    @Selector("initWithCommandBuffer:")
    public native MPSCommandBuffer initWithCommandBuffer(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("kernelEndTime")
    public native double kernelEndTime();

    @Generated
    @Selector("kernelStartTime")
    public native double kernelStartTime();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Nullable
    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCommandBuffer new_objc();

    @Nullable
    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLParallelRenderCommandEncoder parallelRenderCommandEncoderWithDescriptor(
            @NotNull MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("popDebugGroup")
    public native void popDebugGroup();

    /**
     * [@property] predicate
     * 
     * A GPU predicate object. Default: nil.
     */
    @Nullable
    @Generated
    @Selector("predicate")
    public native MPSPredicate predicate();

    /**
     * Prefetch heap into the MPS command buffer heap cache.
     * 
     * If there is not sufficient free storage in the MPS heap for the command buffer for allocations of total size
     * size,
     * pre-warm the MPS heap with a new MTLHeap allocation of sufficient size. If this size turns out to be too small
     * MPS may ask for more heaps later to cover additional allocations. If heapProvider is not nil, the heapProvider
     * will be used.
     * 
     * @param size The minimum size of the free store needed
     */
    @Generated
    @Selector("prefetchHeapForWorkloadSize:")
    public native void prefetchHeapForWorkloadSize(@NUInt long size);

    @Generated
    @Selector("presentDrawable:")
    public native void presentDrawable(@NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable);

    @Generated
    @Selector("presentDrawable:afterMinimumDuration:")
    public native void presentDrawableAfterMinimumDuration(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable, double duration);

    @Generated
    @Selector("presentDrawable:atTime:")
    public native void presentDrawableAtTime(@NotNull @Mapped(ObjCObjectMapper.class) MTLDrawable drawable,
            double presentationTime);

    @Generated
    @Selector("pushDebugGroup:")
    public native void pushDebugGroup(@NotNull String string);

    @Nullable
    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLRenderCommandEncoder renderCommandEncoderWithDescriptor(
            @NotNull MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("resourceStateCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLResourceStateCommandEncoder resourceStateCommandEncoder();

    @Generated
    @Selector("retainedReferences")
    public native boolean retainedReferences();

    /**
     * [@property] rootCommandBuffer
     * 
     * The base MTLCommandBuffer underlying the MPSCommandBuffer
     * 
     * MPSCommandBuffers may wrap other MPSCommandBuffers, in the process
     * creating what is in effect a stack of predicate objects that may be
     * pushed or popped by making new MPSCommandBuffers or by calling -commandBuffer.
     * In some circumstances, it is preferable to use the root command buffer,
     * particularly when trying to identify the command buffer that will be commited
     * by -commitAndContinue.
     */
    @NotNull
    @Generated
    @Selector("rootCommandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandBuffer rootCommandBuffer();

    /**
     * [@property] heapProvider
     * 
     * A application supplied object to allocate MTLHeaps for MPS
     * 
     * By default this is nil, which will use MPS' device level global heap cache to
     * allocate the heaps. This is a reasonable choice. However, it may be inefficient
     * if you are keeping your own MTLHeap, since there will be two pessimistically
     * sized free stores which may be larger than is strictly necessary, and of course
     * fragmentation across multiple heaps. In such cases, the problem may be solved
     * either by using MPS' automatically managed heap (simple) or having MPS use
     * your heap. The heapProvider allows you to implement the second case. To use
     * the MPS heap, simply make temporary MPSImages, vectors and matrices.
     * 
     * If multiple MPSCommandBuffers reference the same MTLCommandBuffer, changing
     * the heapProvider on one will change the heap provider for all of them.
     */
    @Generated
    @Selector("setHeapProvider:")
    public native void setHeapProvider(@Nullable @Mapped(ObjCObjectMapper.class) MPSHeapProvider value);

    @Generated
    @Selector("setLabel:")
    public native void setLabel(@Nullable String value);

    /**
     * [@property] predicate
     * 
     * A GPU predicate object. Default: nil.
     */
    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(@Nullable MPSPredicate value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("status")
    @NUInt
    public native long status();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("waitUntilCompleted")
    public native void waitUntilCompleted();

    @Generated
    @Selector("waitUntilScheduled")
    public native void waitUntilScheduled();

    @Nullable
    @Generated
    @Selector("accelerationStructureCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoder();

    @Nullable
    @Generated
    @Selector("blitCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBlitCommandEncoder blitCommandEncoderWithDescriptor(
            @NotNull MTLBlitPassDescriptor blitPassDescriptor);

    @Nullable
    @Generated
    @Selector("computeCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLComputeCommandEncoder computeCommandEncoderWithDescriptor(
            @NotNull MTLComputePassDescriptor computePassDescriptor);

    @Generated
    @Selector("errorOptions")
    @NUInt
    public native long errorOptions();

    @NotNull
    @Generated
    @Selector("logs")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLLogContainer logs();

    @Nullable
    @Generated
    @Selector("resourceStateCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLResourceStateCommandEncoder resourceStateCommandEncoderWithDescriptor(
            @NotNull MTLResourceStatePassDescriptor resourceStatePassDescriptor);

    @NotNull
    @Generated
    @Selector("accelerationStructureCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLAccelerationStructureCommandEncoder accelerationStructureCommandEncoderWithDescriptor(
            @NotNull MTLAccelerationStructurePassDescriptor descriptor);
}
