package apple.mlcompute;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * MLCOptimizerDescriptor
 * 
 * The MLCOptimizerDescriptor specifies an optimizer descriptor.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCOptimizerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCOptimizerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCOptimizerDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCOptimizerDescriptor allocWithZone(VoidPtr zone);

    /**
     * [@property] appliesGradientClipping
     * 
     * Whether gradient clipping should be applied or not.
     * 
     * The default is false
     */
    @Generated
    @Selector("appliesGradientClipping")
    public native boolean appliesGradientClipping();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * [@property] customGlobalNorm
     * 
     * Used only with MLCGradientClippingTypeByGlobalNorm. If non zero, this norm will be used in place of global norm.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("customGlobalNorm")
    public native float customGlobalNorm();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a MLCOptimizerDescriptor object
     * 
     * @param learningRate            The learning rate
     * @param gradientRescale         The gradient rescale value
     * @param appliesGradientClipping Whether to apply gradient clipping
     * @param gradientClipMax         The maximum gradient value to be used with gradient clipping
     * @param gradientClipMin         The minimum gradient value to be used with gradient clipping
     * @param regularizationType      The regularization type
     * @param regularizationScale     The regularization scale
     * @return A new MLCOptimizerDescriptor object.
     */
    @Generated
    @Selector("descriptorWithLearningRate:gradientRescale:appliesGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public static native MLCOptimizerDescriptor descriptorWithLearningRateGradientRescaleAppliesGradientClippingGradientClipMaxGradientClipMinRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean appliesGradientClipping, float gradientClipMax,
            float gradientClipMin, int regularizationType, float regularizationScale);

    /**
     * Create an MLCOptimizerDescriptor object
     * 
     * @param learningRate            The learning rate
     * @param gradientRescale         The gradient rescale value
     * @param appliesGradientClipping Whether to apply gradient clipping
     * @param gradientClippingType    The type of clipping applied to gradients
     * @param gradientClipMax         The maximum gradient value to be used with gradient clipping
     * @param gradientClipMin         The minimum gradient value to be used with gradient clipping
     * @param maximumClippingNorm     The maximum norm to be used with gradient clipping
     * @param customGlobalNorm        If non-zero, the norm to be used instead of calculating the global norm
     * @param regularizationType      The regularization type
     * @param regularizationScale     The regularization scale
     * @return A new MLCOptimizerDescriptor object.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @Selector("descriptorWithLearningRate:gradientRescale:appliesGradientClipping:gradientClippingType:gradientClipMax:gradientClipMin:maximumClippingNorm:customGlobalNorm:regularizationType:regularizationScale:")
    public static native MLCOptimizerDescriptor descriptorWithLearningRateGradientRescaleAppliesGradientClippingGradientClippingTypeGradientClipMaxGradientClipMinMaximumClippingNormCustomGlobalNormRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean appliesGradientClipping, int gradientClippingType,
            float gradientClipMax, float gradientClipMin, float maximumClippingNorm, float customGlobalNorm,
            int regularizationType, float regularizationScale);

    /**
     * Create a MLCOptimizerDescriptor object
     * 
     * @param learningRate        The learning rate
     * @param gradientRescale     The gradient rescale value
     * @param regularizationType  The regularization type
     * @param regularizationScale The regularization scale
     * @return A new MLCOptimizerDescriptor object.
     */
    @Generated
    @Selector("descriptorWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public static native MLCOptimizerDescriptor descriptorWithLearningRateGradientRescaleRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, int regularizationType, float regularizationScale);

    /**
     * [@property] gradientClipMax
     * 
     * The maximum gradient value if gradient clipping is enabled before gradient is rescaled.
     */
    @Generated
    @Selector("gradientClipMax")
    public native float gradientClipMax();

    /**
     * [@property] gradientClipMin
     * 
     * The minimum gradient value if gradient clipping is enabled before gradient is rescaled.
     */
    @Generated
    @Selector("gradientClipMin")
    public native float gradientClipMin();

    /**
     * [@property] gradientClippingType
     * 
     * The type of clipping applied to gradient
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("gradientClippingType")
    public native int gradientClippingType();

    /**
     * [@property] gradientRescale
     * 
     * The rescale value applied to gradients during optimizer update
     */
    @Generated
    @Selector("gradientRescale")
    public native float gradientRescale();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCOptimizerDescriptor init();

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
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property] learningRate
     * 
     * The learning rate
     */
    @Generated
    @Selector("learningRate")
    public native float learningRate();

    /**
     * [@property] maximumClippingNorm
     * 
     * The maximum clipping value
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("maximumClippingNorm")
    public native float maximumClippingNorm();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCOptimizerDescriptor new_objc();

    /**
     * [@property] regularizationScale
     * 
     * The regularization scale.
     */
    @Generated
    @Selector("regularizationScale")
    public native float regularizationScale();

    /**
     * [@property] regularizationType
     * 
     * The regularization type.
     */
    @Generated
    @Selector("regularizationType")
    public native int regularizationType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
