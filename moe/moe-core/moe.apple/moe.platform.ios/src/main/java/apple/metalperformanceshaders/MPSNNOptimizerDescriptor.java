package apple.metalperformanceshaders;

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

/**
 * MPSNNOptimizerDescriptor
 * <p>
 * The MPSNNOptimizerDescriptor base class. Optimizers are generally used to update trainable neural network parameters.
 * Users are usually expected to call these MPSKernels from the update methods on their Convolution or BatchNormalization data sources.
 * <p>
 * Before the gradient is used to update the original value, some preprocessing occurs on each gradient where it is scaled or clipped
 * If regularization is chosen the appropriate regularization loss gradient is added to the value gradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizerDescriptor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNOptimizerDescriptor allocWithZone(VoidPtr zone);

    /**
     * [@property]   applyGradientClipping
     * <p>
     * A bool which decides if gradient will be clipped
     * <p>
     * The default value is NO
     */
    @Generated
    @Selector("applyGradientClipping")
    public native boolean applyGradientClipping();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   gradientClipMax
     * <p>
     * The maximum value at which incoming gradient will be clipped before rescaling, applyGradientClipping must be true
     */
    @Generated
    @Selector("gradientClipMax")
    public native float gradientClipMax();

    /**
     * [@property]   gradientClipMin
     * <p>
     * The minimum value at which incoming gradient will be clipped before rescaling, applyGradientClipping must be true
     */
    @Generated
    @Selector("gradientClipMin")
    public native float gradientClipMin();

    /**
     * [@property]   gradientRescale
     * <p>
     * The gradientRescale at which we apply to incoming gradient values
     * <p>
     * The default value is 1.0
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
    public native MPSNNOptimizerDescriptor init();

    /**
     * Initialization for the MPSNNOptimizerDescriptor object
     *
     * @param learningRate          The learningRate which will be applied
     * @param gradientRescale       The gradientRescale which will be applied
     * @param applyGradientClipping The BOOL which sets if gradientClipping would be applied to the gradient
     * @param gradientClipMax       The gradientClipMax which will be applied
     * @param gradientClipMin       The gradientClipMin which will be applied
     * @param regularizationType    The regularizationType which will be applied
     * @param regularizationScale   The regularizationScale which will be applied
     * @return A valid MPSNNOptimizerDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("initWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public native MPSNNOptimizerDescriptor initWithLearningRateGradientRescaleApplyGradientClippingGradientClipMaxGradientClipMinRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax,
            float gradientClipMin, @NUInt long regularizationType, float regularizationScale);

    /**
     * Initialization for the MPSNNOptimizerDescriptor object, no gradient clipping would be applied
     *
     * @param learningRate        The learningRate which will be applied
     * @param gradientRescale     The gradientRescale which will be applied
     * @param regularizationType  The regularizationType which will be applied
     * @param regularizationScale The regularizationScale which will be applied
     * @return A valid MPSNNOptimizerDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("initWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public native MPSNNOptimizerDescriptor initWithLearningRateGradientRescaleRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, @NUInt long regularizationType, float regularizationScale);

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
     * [@property]   learningRate
     * <p>
     * The learningRate at which we update values
     * <p>
     * The default value is 0.001f
     */
    @Generated
    @Selector("learningRate")
    public native float learningRate();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNOptimizerDescriptor new_objc();

    /**
     * Creates a descriptor on autoreleaspool for the MPSNNOptimizerDescriptor object
     *
     * @param learningRate          The learningRate which will be applied
     * @param gradientRescale       The gradientRescale which will be applied
     * @param applyGradientClipping The BOOL which sets if gradientClipping would be applied to the gradient
     * @param gradientClipMax       The gradientClipMax which will be applied
     * @param gradientClipMin       The gradientClipMin which will be applied
     * @param regularizationType    The regularizationType which will be applied
     * @param regularizationScale   The regularizationScale which will be applied
     * @return A valid MPSNNOptimizerDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("optimizerDescriptorWithLearningRate:gradientRescale:applyGradientClipping:gradientClipMax:gradientClipMin:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptorWithLearningRateGradientRescaleApplyGradientClippingGradientClipMaxGradientClipMinRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, boolean applyGradientClipping, float gradientClipMax,
            float gradientClipMin, @NUInt long regularizationType, float regularizationScale);

    /**
     * Creates a descriptor on autoreleaspool for the MPSNNOptimizerDescriptor object, no gradient clipping would be applied
     *
     * @param learningRate        The learningRate which will be applied
     * @param gradientRescale     The gradientRescale which will be applied
     * @param regularizationType  The regularizationType which will be applied
     * @param regularizationScale The regularizationScale which will be applied
     * @return A valid MPSNNOptimizerDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("optimizerDescriptorWithLearningRate:gradientRescale:regularizationType:regularizationScale:")
    public static native MPSNNOptimizerDescriptor optimizerDescriptorWithLearningRateGradientRescaleRegularizationTypeRegularizationScale(
            float learningRate, float gradientRescale, @NUInt long regularizationType, float regularizationScale);

    /**
     * [@property]   regularizationScale
     * <p>
     * The regularizationScale at which we apply L1 or L2 regularization, it gets ignored if regularization is None
     * <p>
     * The default value is 0.0
     */
    @Generated
    @Selector("regularizationScale")
    public native float regularizationScale();

    /**
     * [@property]   regularizationType
     * <p>
     * The regularizationType which we apply.
     * <p>
     * The default value is MPSRegularizationTypeNone
     */
    @Generated
    @Selector("regularizationType")
    @NUInt
    public native long regularizationType();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   applyGradientClipping
     * <p>
     * A bool which decides if gradient will be clipped
     * <p>
     * The default value is NO
     */
    @Generated
    @Selector("setApplyGradientClipping:")
    public native void setApplyGradientClipping(boolean value);

    /**
     * [@property]   gradientClipMax
     * <p>
     * The maximum value at which incoming gradient will be clipped before rescaling, applyGradientClipping must be true
     */
    @Generated
    @Selector("setGradientClipMax:")
    public native void setGradientClipMax(float value);

    /**
     * [@property]   gradientClipMin
     * <p>
     * The minimum value at which incoming gradient will be clipped before rescaling, applyGradientClipping must be true
     */
    @Generated
    @Selector("setGradientClipMin:")
    public native void setGradientClipMin(float value);

    /**
     * [@property]   gradientRescale
     * <p>
     * The gradientRescale at which we apply to incoming gradient values
     * <p>
     * The default value is 1.0
     */
    @Generated
    @Selector("setGradientRescale:")
    public native void setGradientRescale(float value);

    /**
     * [@property]   learningRate
     * <p>
     * The learningRate at which we update values
     * <p>
     * The default value is 0.001f
     */
    @Generated
    @Selector("setLearningRate:")
    public native void setLearningRate(float value);

    /**
     * [@property]   regularizationScale
     * <p>
     * The regularizationScale at which we apply L1 or L2 regularization, it gets ignored if regularization is None
     * <p>
     * The default value is 0.0
     */
    @Generated
    @Selector("setRegularizationScale:")
    public native void setRegularizationScale(float value);

    /**
     * [@property]   regularizationType
     * <p>
     * The regularizationType which we apply.
     * <p>
     * The default value is MPSRegularizationTypeNone
     */
    @Generated
    @Selector("setRegularizationType:")
    public native void setRegularizationType(@NUInt long value);

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
