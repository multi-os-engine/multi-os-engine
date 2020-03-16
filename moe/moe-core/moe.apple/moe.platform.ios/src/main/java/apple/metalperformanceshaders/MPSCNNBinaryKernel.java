package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
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
public class MPSCNNBinaryKernel extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBinaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBinaryKernel alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:")
    public native MPSImage encodeToCommandBufferPrimaryImageSecondaryImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage);

    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:destinationImage:")
    public native void encodeToCommandBufferPrimaryImageSecondaryImageDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, MPSImage destinationImage);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBinaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBinaryKernel initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBinaryKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBinaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("padding")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNPadding padding();

    @Generated
    @Selector("primaryEdgeMode")
    @NUInt
    public native long primaryEdgeMode();

    @Generated
    @Selector("primaryOffset")
    @ByValue
    public native MPSOffset primaryOffset();

    @Generated
    @Selector("primaryStrideInPixelsX")
    @NUInt
    public native long primaryStrideInPixelsX();

    @Generated
    @Selector("primaryStrideInPixelsY")
    @NUInt
    public native long primaryStrideInPixelsY();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondaryEdgeMode")
    @NUInt
    public native long secondaryEdgeMode();

    @Generated
    @Selector("secondaryOffset")
    @ByValue
    public native MPSOffset secondaryOffset();

    @Generated
    @Selector("secondaryStrideInPixelsX")
    @NUInt
    public native long secondaryStrideInPixelsX();

    @Generated
    @Selector("secondaryStrideInPixelsY")
    @NUInt
    public native long secondaryStrideInPixelsY();

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
    @Selector("setPadding:")
    public native void setPadding(@Mapped(ObjCObjectMapper.class) MPSNNPadding value);

    @Generated
    @Selector("setPrimaryEdgeMode:")
    public native void setPrimaryEdgeMode(@NUInt long value);

    @Generated
    @Selector("setPrimaryOffset:")
    public native void setPrimaryOffset(@ByValue MPSOffset value);

    @Generated
    @Selector("setSecondaryEdgeMode:")
    public native void setSecondaryEdgeMode(@NUInt long value);

    @Generated
    @Selector("setSecondaryOffset:")
    public native void setSecondaryOffset(@ByValue MPSOffset value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("appendBatchBarrier")
    public native boolean appendBatchBarrier();

    @Generated
    @Selector("destinationImageDescriptorForSourceImages:sourceStates:")
    public native MPSImageDescriptor destinationImageDescriptorForSourceImagesSourceStates(
            NSArray<? extends MPSImage> sourceImages, NSArray<? extends MPSState> sourceStates);

    @Generated
    @Selector("encodeToCommandBuffer:primaryImage:secondaryImage:destinationState:destinationStateIsTemporary:")
    public native MPSImage encodeToCommandBufferPrimaryImageSecondaryImageDestinationStateDestinationStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outState, boolean isTemporary);

    @Generated
    @Selector("encodingStorageSizeForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    @NUInt
    public native long encodingStorageSizeForPrimaryImageSecondaryImageSourceStatesDestinationImage(
            MPSImage primaryImage, MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates,
            MPSImage destinationImage);

    @Generated
    @Selector("isResultStateReusedAcrossBatch")
    public native boolean isResultStateReusedAcrossBatch();

    @Generated
    @Selector("isStateModified")
    public native boolean isStateModified();

    @Generated
    @Selector("primaryDilationRateX")
    @NUInt
    public native long primaryDilationRateX();

    @Generated
    @Selector("primaryDilationRateY")
    @NUInt
    public native long primaryDilationRateY();

    @Generated
    @Selector("primaryKernelHeight")
    @NUInt
    public native long primaryKernelHeight();

    @Generated
    @Selector("primaryKernelWidth")
    @NUInt
    public native long primaryKernelWidth();

    @Generated
    @Selector("primarySourceFeatureChannelMaxCount")
    @NUInt
    public native long primarySourceFeatureChannelMaxCount();

    @Generated
    @Selector("primarySourceFeatureChannelOffset")
    @NUInt
    public native long primarySourceFeatureChannelOffset();

    @Generated
    @Selector("resultStateForPrimaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState resultStateForPrimaryImageSecondaryImageSourceStatesDestinationImage(MPSImage primaryImage,
            MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("secondaryDilationRateX")
    @NUInt
    public native long secondaryDilationRateX();

    @Generated
    @Selector("secondaryDilationRateY")
    @NUInt
    public native long secondaryDilationRateY();

    @Generated
    @Selector("secondaryKernelHeight")
    @NUInt
    public native long secondaryKernelHeight();

    @Generated
    @Selector("secondaryKernelWidth")
    @NUInt
    public native long secondaryKernelWidth();

    @Generated
    @Selector("secondarySourceFeatureChannelMaxCount")
    @NUInt
    public native long secondarySourceFeatureChannelMaxCount();

    @Generated
    @Selector("secondarySourceFeatureChannelOffset")
    @NUInt
    public native long secondarySourceFeatureChannelOffset();

    @Generated
    @Selector("setPrimarySourceFeatureChannelMaxCount:")
    public native void setPrimarySourceFeatureChannelMaxCount(@NUInt long value);

    @Generated
    @Selector("setPrimarySourceFeatureChannelOffset:")
    public native void setPrimarySourceFeatureChannelOffset(@NUInt long value);

    @Generated
    @Selector("setPrimaryStrideInPixelsX:")
    public native void setPrimaryStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setPrimaryStrideInPixelsY:")
    public native void setPrimaryStrideInPixelsY(@NUInt long value);

    @Generated
    @Selector("setSecondarySourceFeatureChannelMaxCount:")
    public native void setSecondarySourceFeatureChannelMaxCount(@NUInt long value);

    @Generated
    @Selector("setSecondarySourceFeatureChannelOffset:")
    public native void setSecondarySourceFeatureChannelOffset(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@NUInt long value);

    @Generated
    @Selector("temporaryResultStateForCommandBuffer:primaryImage:secondaryImage:sourceStates:destinationImage:")
    public native MPSState temporaryResultStateForCommandBufferPrimaryImageSecondaryImageSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage primaryImage,
            MPSImage secondaryImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);
}