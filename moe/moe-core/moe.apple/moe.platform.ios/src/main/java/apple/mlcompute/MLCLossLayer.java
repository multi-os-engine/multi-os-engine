package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCLossLayer
 * 
 * A loss layer
 * 
 * API-Since: 14.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLossLayer extends MLCLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLossLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLossLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCLossLayer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param classCount     Number of classes
     * @param weight         A scalar floating point value
     * @return A new categorical cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCLossLayer categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param classCount     Number of classes
     * @param weights        The loss label weights tensor
     * @return A new categorical cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCLossLayer categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
            int reductionType, float labelSmoothing, @NUInt long classCount, @Nullable MLCTensor weights);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weight        A scalar floating-point value
     * @return A new cosine distance loss layer.
     */
    @NotNull
    @Generated
    @Selector("cosineDistanceLossWithReductionType:weight:")
    public static native MLCLossLayer cosineDistanceLossWithReductionTypeWeight(int reductionType, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weights       The loss label weights tensor
     * @return A new cosine distance loss layer.
     */
    @NotNull
    @Generated
    @Selector("cosineDistanceLossWithReductionType:weights:")
    public static native MLCLossLayer cosineDistanceLossWithReductionTypeWeights(int reductionType,
            @Nullable MLCTensor weights);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] descriptor
     * 
     * The loss descriptor
     */
    @NotNull
    @Generated
    @Selector("descriptor")
    public native MLCLossDescriptor descriptor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weight        A scalar floating-point value
     * @return A new hinge loss layer.
     */
    @NotNull
    @Generated
    @Selector("hingeLossWithReductionType:weight:")
    public static native MLCLossLayer hingeLossWithReductionTypeWeight(int reductionType, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weights       The loss label weights tensor
     * @return A new hinge loss layer.
     */
    @NotNull
    @Generated
    @Selector("hingeLossWithReductionType:weights:")
    public static native MLCLossLayer hingeLossWithReductionTypeWeights(int reductionType, @Nullable MLCTensor weights);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param delta         The delta parameter
     * @param weight        A scalar floating-point value
     * @return A new huber loss layer.
     */
    @NotNull
    @Generated
    @Selector("huberLossWithReductionType:delta:weight:")
    public static native MLCLossLayer huberLossWithReductionTypeDeltaWeight(int reductionType, float delta,
            float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param delta         The delta parameter
     * @param weights       The loss label weights tensor
     * @return A new huber loss layer.
     */
    @NotNull
    @Generated
    @Selector("huberLossWithReductionType:delta:weights:")
    public static native MLCLossLayer huberLossWithReductionTypeDeltaWeights(int reductionType, float delta,
            @Nullable MLCTensor weights);

    @Generated
    @Selector("init")
    public native MLCLossLayer init();

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Create a loss layer
     * 
     * @param lossDescriptor The loss descriptor
     * @return A new loss layer.
     */
    @Generated
    @Selector("layerWithDescriptor:")
    public static native MLCLossLayer layerWithDescriptor(@NotNull MLCLossDescriptor lossDescriptor);

    /**
     * Create a MLComputeLoss layer
     * 
     * @param lossDescriptor The loss descriptor
     * @param weights        The loss label weights tensor
     * @return A new loss layer.
     */
    @Generated
    @Selector("layerWithDescriptor:weights:")
    public static native MLCLossLayer layerWithDescriptorWeights(@NotNull MLCLossDescriptor lossDescriptor,
            @NotNull MLCTensor weights);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param epsilon       The epsilon parameter
     * @param weight        A scalar floating-point value
     * @return A new log loss layer.
     */
    @NotNull
    @Generated
    @Selector("logLossWithReductionType:epsilon:weight:")
    public static native MLCLossLayer logLossWithReductionTypeEpsilonWeight(int reductionType, float epsilon,
            float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param epsilon       The epsilon parameter
     * @param weights       The loss label weights tensor
     * @return A new log loss layer.
     */
    @NotNull
    @Generated
    @Selector("logLossWithReductionType:epsilon:weights:")
    public static native MLCLossLayer logLossWithReductionTypeEpsilonWeights(int reductionType, float epsilon,
            @Nullable MLCTensor weights);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weight        A scalar floating-point value
     * @return A new L1 i.e. mean absolute error loss layer.
     */
    @NotNull
    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weight:")
    public static native MLCLossLayer meanAbsoluteErrorLossWithReductionTypeWeight(int reductionType, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weights       The loss label weights tensor
     * @return A new L1 i.e. mean absolute error loss layer.
     */
    @NotNull
    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weights:")
    public static native MLCLossLayer meanAbsoluteErrorLossWithReductionTypeWeights(int reductionType,
            @Nullable MLCTensor weights);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weight        A scalar floating-point value
     * @return A new L2 i.e. mean squared error loss layer.
     */
    @NotNull
    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weight:")
    public static native MLCLossLayer meanSquaredErrorLossWithReductionTypeWeight(int reductionType, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType The reduction type to use
     * @param weights       The loss label weights tensor
     * @return A new L2 i.e. mean squared error loss layer.
     */
    @NotNull
    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weights:")
    public static native MLCLossLayer meanSquaredErrorLossWithReductionTypeWeights(int reductionType,
            @Nullable MLCTensor weights);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLossLayer new_objc();

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
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param weight         A scalar floating-point value
     * @return A new sigmoid cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weight:")
    public static native MLCLossLayer sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeight(int reductionType,
            float labelSmoothing, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param weights        The loss label weights tensor
     * @return A new sigmoid cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weights:")
    public static native MLCLossLayer sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeights(int reductionType,
            float labelSmoothing, @Nullable MLCTensor weights);

    /**
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param classCount     Number of classes
     * @param weight         A scalar floating point value
     * @return A new softmax cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCLossLayer softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    /**
     * Create a loss layer
     * 
     * @param reductionType  The reduction type to use
     * @param labelSmoothing Label smoothing value
     * @param classCount     Number of classes
     * @param weights        The loss label weights tensor
     * @return A new softmax cross entropy loss layer.
     */
    @NotNull
    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCLossLayer softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
            int reductionType, float labelSmoothing, @NUInt long classCount, @Nullable MLCTensor weights);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, @NotNull MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] weights
     * 
     * The loss label weights tensor
     */
    @Nullable
    @Generated
    @Selector("weights")
    public native MLCTensor weights();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
