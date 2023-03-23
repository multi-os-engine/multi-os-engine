package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MLCPoolingDescriptor
 * 
 * The MLCPoolingDescriptor specifies a pooling descriptor.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCPoolingDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCPoolingDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCPoolingDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCPoolingDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Create a MLCPoolingDescriptor object for an average pooling function
     * 
     * @param kernelSizes          The kernel sizes in x and y
     * @param strides              The kernel strides in x and y
     * @param dilationRates        The kernel dilation rates in x and y
     * @param paddingPolicy        The padding policy
     * @param paddingSizes         The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @param countIncludesPadding Whether to include zero padding in the averaging calculation
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("averagePoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:countIncludesPadding:")
    public static native MLCPoolingDescriptor averagePoolingDescriptorWithKernelSizesStridesDilationRatesPaddingPolicyPaddingSizesCountIncludesPadding(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides,
            NSArray<? extends NSNumber> dilationRates, int paddingPolicy, NSArray<? extends NSNumber> paddingSizes,
            boolean countIncludesPadding);

    /**
     * Create a MLCPoolingDescriptor object for an average pooling function
     * 
     * @param kernelSizes          The kernel sizes in x and y
     * @param strides              The kernel strides in x and y
     * @param paddingPolicy        The padding policy
     * @param paddingSizes         The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @param countIncludesPadding Whether to include zero padding in the averaging calculation
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("averagePoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:countIncludesPadding:")
    public static native MLCPoolingDescriptor averagePoolingDescriptorWithKernelSizesStridesPaddingPolicyPaddingSizesCountIncludesPadding(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides, int paddingPolicy,
            NSArray<? extends NSNumber> paddingSizes, boolean countIncludesPadding);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] countIncludesPadding
     * 
     * Include the zero-padding in the averaging calculation if true. Used only with average pooling.
     */
    @Generated
    @Selector("countIncludesPadding")
    public native boolean countIncludesPadding();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] dilationRateInX
     * 
     * The dilation rate i.e. stride of elements in the kernel in x.
     */
    @Generated
    @Selector("dilationRateInX")
    @NUInt
    public native long dilationRateInX();

    /**
     * [@property] dilationRateInY
     * 
     * The dilation rate i.e. stride of elements in the kernel in y.
     */
    @Generated
    @Selector("dilationRateInY")
    @NUInt
    public native long dilationRateInY();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCPoolingDescriptor init();

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

    /**
     * [@property] kernelHeight
     * 
     * The pooling kernel size in y.
     */
    @Generated
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    /**
     * [@property] kernelWidth
     * 
     * The pooling kernel size in x.
     */
    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * Create a MLCPoolingDescriptor object for a L2 norm pooling function
     * 
     * @param kernelSizes   The kernel sizes in x and y
     * @param strides       The kernel strides in x and y
     * @param dilationRates The kernel dilation rates in x and y
     * @param paddingPolicy The padding policy
     * @param paddingSizes  The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("l2NormPoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor l2NormPoolingDescriptorWithKernelSizesStridesDilationRatesPaddingPolicyPaddingSizes(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides,
            NSArray<? extends NSNumber> dilationRates, int paddingPolicy, NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCPoolingDescriptor object for a L2 norm pooling function
     * 
     * @param kernelSizes   The kernel sizes in x and y
     * @param strides       The kernel strides in x and y
     * @param paddingPolicy The padding policy
     * @param paddingSizes  The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("l2NormPoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor l2NormPoolingDescriptorWithKernelSizesStridesPaddingPolicyPaddingSizes(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides, int paddingPolicy,
            NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCPoolingDescriptor object for a max pooling function
     * 
     * @param kernelSizes   The kernel sizes in x and y
     * @param strides       The kernel strides in x and y
     * @param dilationRates The kernel dilation rates in x and y
     * @param paddingPolicy The padding policy
     * @param paddingSizes  The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("maxPoolingDescriptorWithKernelSizes:strides:dilationRates:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor maxPoolingDescriptorWithKernelSizesStridesDilationRatesPaddingPolicyPaddingSizes(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides,
            NSArray<? extends NSNumber> dilationRates, int paddingPolicy, NSArray<? extends NSNumber> paddingSizes);

    /**
     * Create a MLCPoolingDescriptor object for a max pooling function
     * 
     * @param kernelSizes   The kernel sizes in x and y
     * @param strides       The kernel strides in x and y
     * @param paddingPolicy The padding policy
     * @param paddingSizes  The padding sizes in x and y if padding policy is MLCPaddingPolicyUsePaddingSIze
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("maxPoolingDescriptorWithKernelSizes:strides:paddingPolicy:paddingSizes:")
    public static native MLCPoolingDescriptor maxPoolingDescriptorWithKernelSizesStridesPaddingPolicyPaddingSizes(
            NSArray<? extends NSNumber> kernelSizes, NSArray<? extends NSNumber> strides, int paddingPolicy,
            NSArray<? extends NSNumber> paddingSizes);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCPoolingDescriptor new_objc();

    /**
     * [@property] paddingPolicy
     * 
     * The padding policy to use.
     */
    @Generated
    @Selector("paddingPolicy")
    public native int paddingPolicy();

    /**
     * [@property] paddingSizeInX
     * 
     * The padding size in x (left and right) to use if paddingPolicy is MLCPaddingPolicyUsePaddingSize
     */
    @Generated
    @Selector("paddingSizeInX")
    @NUInt
    public native long paddingSizeInX();

    /**
     * [@property] paddingSizeInY
     * 
     * The padding size in y (top and bottom) to use if paddingPolicy is MLCPaddingPolicyUsePaddingSize
     */
    @Generated
    @Selector("paddingSizeInY")
    @NUInt
    public native long paddingSizeInY();

    /**
     * Create a MLCPoolingDescriptor object
     * 
     * @param poolingType The pooling function
     * @param kernelSize  The kernel sizes in x and y
     * @param stride      The kernel strides in x and y
     * @return A new MLCPoolingDescriptor object.
     */
    @Generated
    @Selector("poolingDescriptorWithType:kernelSize:stride:")
    public static native MLCPoolingDescriptor poolingDescriptorWithTypeKernelSizeStride(int poolingType,
            @NUInt long kernelSize, @NUInt long stride);

    /**
     * [@property] poolingType
     * 
     * The pooling operation
     */
    @Generated
    @Selector("poolingType")
    public native int poolingType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] strideInX
     * 
     * The stride of the kernel in x.
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * [@property] strideInY
     * 
     * The stride of the kernel in y.
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
