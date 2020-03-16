package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLRegion;
import apple.metalperformanceshaders.protocol.MPSImageAllocator;
import apple.metalperformanceshaders.protocol.MPSNNPadding;
import apple.metalperformanceshaders.struct.MPSOffset;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNMultiaryKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNMultiaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNMultiaryKernel alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("appendBatchBarrier")
    public native boolean appendBatchBarrier();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

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
    @Selector("clipRect")
    @ByValue
    public native MTLRegion clipRect();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("destinationFeatureChannelOffset")
    @NUInt
    public native long destinationFeatureChannelOffset();

    @Generated
    @Selector("destinationImageAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSImageAllocator destinationImageAllocator();

    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStates(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates);

    @Generated
    @Selector("dilationRateXatIndex:")
    @NUInt
    public native long dilationRateXatIndex(@NUInt long index);

    @Generated
    @Selector("dilationRateYatIndex:")
    @NUInt
    public native long dilationRateYatIndex(@NUInt long index);

    @Generated
    @Selector("edgeModeAtIndex:")
    @NUInt
    public native long edgeModeAtIndex(@NUInt long index);

    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:")
    public native MPSImage encodeToCommandBufferSourceImages(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages);

    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:destinationImage:")
    public native void encodeToCommandBufferSourceImagesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            MPSImage destinationImage);

    @Generated
    @Selector("encodeToCommandBuffer:sourceImages:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferSourceImagesDestinationStateDestinationStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImages,
            @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNMultiaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNMultiaryKernel initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNMultiaryKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNMultiaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSCNNMultiaryKernel initWithDeviceSourceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long sourceCount);

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
    @Selector("isBackwards")
    public native boolean isBackwards();

    @Generated
    @Selector("isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();

    @Generated
    @Selector("isStateModified")
    public native boolean isStateModified();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("kernelHeightAtIndex:")
    @NUInt
    public native long kernelHeightAtIndex(@NUInt long index);

    @Generated
    @Selector("kernelWidthAtIndex:")
    @NUInt
    public native long kernelWidthAtIndex(@NUInt long index);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("offsetAtIndex:")
    @ByValue
    public native MPSOffset offsetAtIndex(@NUInt long index);

    @Generated
    @Selector("padding")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding padding();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resultStateForSourceImages:sourceStates:destinationImage:")
    public native MPSState resultStateForSourceImagesSourceStatesDestinationImage(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates,
            MPSImage destinationImage);

    @Generated
    @Selector("setClipRect:")
    public native void setClipRect(@ByValue MTLRegion value);

    @Generated
    @Selector("setDestinationFeatureChannelOffset:")
    public native void setDestinationFeatureChannelOffset(@NUInt long value);

    @Generated
    @Selector("setDestinationImageAllocator:")
    public native void setDestinationImageAllocator(@Mapped(ObjCObjectMapper.class) MPSImageAllocator value);

    @Generated
    @Selector("setDilationRateX:atIndex:")
    public native void setDilationRateXAtIndex(@NUInt long dilationRate, @NUInt long index);

    @Generated
    @Selector("setDilationRateY:atIndex:")
    public native void setDilationRateYAtIndex(@NUInt long dilationRate, @NUInt long index);

    @Generated
    @Selector("setEdgeMode:atIndex:")
    public native void setEdgeModeAtIndex(@NUInt long edgeMode, @NUInt long index);

    @Generated
    @Selector("setKernelHeight:atIndex:")
    public native void setKernelHeightAtIndex(@NUInt long height, @NUInt long index);

    @Generated
    @Selector("setKernelWidth:atIndex:")
    public native void setKernelWidthAtIndex(@NUInt long width, @NUInt long index);

    @Generated
    @Selector("setOffset:atIndex:")
    public native void setOffsetAtIndex(@ByValue MPSOffset offset, @NUInt long index);

    @Generated
    @Selector("setPadding:")
    public native void setPadding(@Mapped(ObjCObjectMapper.class) MPSNNPadding value);

    @Generated
    @Selector("setSourceFeatureChannelMaxCount:atIndex:")
    public native void setSourceFeatureChannelMaxCountAtIndex(@NUInt long count, @NUInt long index);

    @Generated
    @Selector("setSourceFeatureChannelOffset:atIndex:")
    public native void setSourceFeatureChannelOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setStrideInPixelsX:atIndex:")
    public native void setStrideInPixelsXAtIndex(@NUInt long stride, @NUInt long index);

    @Generated
    @Selector("setStrideInPixelsY:atIndex:")
    public native void setStrideInPixelsYAtIndex(@NUInt long stride, @NUInt long index);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("sourceCount")
    @NUInt
    public native long sourceCount();

    @Generated
    @Selector("sourceFeatureChannelMaxCountAtIndex:")
    @NUInt
    public native long sourceFeatureChannelMaxCountAtIndex(@NUInt long index);

    @Generated
    @Selector("sourceFeatureChannelOffsetAtIndex:")
    @NUInt
    public native long sourceFeatureChannelOffsetAtIndex(@NUInt long index);

    @Generated
    @Selector("strideInPixelsXatIndex:")
    @NUInt
    public native long strideInPixelsXatIndex(@NUInt long index);

    @Generated
    @Selector("strideInPixelsYatIndex:")
    @NUInt
    public native long strideInPixelsYatIndex(@NUInt long index);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("temporaryResultStateForCommandBuffer:sourceImages:sourceStates:destinationImage:")
    public native MPSState temporaryResultStateForCommandBufferSourceImagesSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSImage> sourceImage,
            NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}