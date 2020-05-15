package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.MTLRenderPassDescriptor;
import apple.metal.protocol.MTLBlitCommandEncoder;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLCommandQueue;
import apple.metal.protocol.MTLComputeCommandEncoder;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLDrawable;
import apple.metal.protocol.MTLEvent;
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
            @ObjCBlock(name = "call_addCompletedHandler") MTLCommandBuffer.Block_addCompletedHandler block);

    @Generated
    @Selector("addScheduledHandler:")
    public native void addScheduledHandler(
            @ObjCBlock(name = "call_addScheduledHandler") MTLCommandBuffer.Block_addScheduledHandler block);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCommandBuffer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("blitCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLBlitCommandEncoder blitCommandEncoder();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandBuffer commandBuffer();

    @Generated
    @Selector("commandBufferFromCommandQueue:")
    public static native MPSCommandBuffer commandBufferFromCommandQueue(
            @Mapped(ObjCObjectMapper.class) MTLCommandQueue commandQueue);

    @Generated
    @Selector("commandBufferWithCommandBuffer:")
    public static native MPSCommandBuffer commandBufferWithCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("commandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandQueue commandQueue();

    @Generated
    @Selector("commit")
    public native void commit();

    @Generated
    @Selector("commitAndContinue")
    public native void commitAndContinue();

    @Generated
    @Selector("computeCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLComputeCommandEncoder computeCommandEncoder();

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

    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLDevice device();

    @Generated
    @Selector("encodeSignalEvent:value:")
    public native void encodeSignalEventValue(@Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    @Generated
    @Selector("encodeWaitForEvent:value:")
    public native void encodeWaitForEventValue(@Mapped(ObjCObjectMapper.class) MTLEvent event, long value);

    @Generated
    @Selector("enqueue")
    public native void enqueue();

    @Generated
    @Selector("error")
    public native NSError error();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("heapProvider")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSHeapProvider heapProvider();

    @Generated
    @Selector("init")
    public native MPSCommandBuffer init();

    @Generated
    @Selector("initWithCommandBuffer:")
    public native MPSCommandBuffer initWithCommandBuffer(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("parallelRenderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLParallelRenderCommandEncoder parallelRenderCommandEncoderWithDescriptor(
            MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("popDebugGroup")
    public native void popDebugGroup();

    @Generated
    @Selector("predicate")
    public native MPSPredicate predicate();

    @Generated
    @Selector("prefetchHeapForWorkloadSize:")
    public native void prefetchHeapForWorkloadSize(@NUInt long size);

    @Generated
    @Selector("presentDrawable:")
    public native void presentDrawable(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable);

    @Generated
    @Selector("presentDrawable:afterMinimumDuration:")
    public native void presentDrawableAfterMinimumDuration(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable,
            double duration);

    @Generated
    @Selector("presentDrawable:atTime:")
    public native void presentDrawableAtTime(@Mapped(ObjCObjectMapper.class) MTLDrawable drawable,
            double presentationTime);

    @Generated
    @Selector("pushDebugGroup:")
    public native void pushDebugGroup(String string);

    @Generated
    @Selector("renderCommandEncoderWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLRenderCommandEncoder renderCommandEncoderWithDescriptor(
            MTLRenderPassDescriptor renderPassDescriptor);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resourceStateCommandEncoder")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLResourceStateCommandEncoder resourceStateCommandEncoder();

    @Generated
    @Selector("retainedReferences")
    public native boolean retainedReferences();

    @Generated
    @Selector("rootCommandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLCommandBuffer rootCommandBuffer();

    @Generated
    @Selector("setHeapProvider:")
    public native void setHeapProvider(@Mapped(ObjCObjectMapper.class) MPSHeapProvider value);

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setPredicate:")
    public native void setPredicate(MPSPredicate value);

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
}