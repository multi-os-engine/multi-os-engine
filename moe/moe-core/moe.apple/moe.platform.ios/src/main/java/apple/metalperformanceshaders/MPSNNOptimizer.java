package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNOptimizer
 * <p>
 * The MPSNNOptimizer base class, use one of the child classes, not to be directly used. Optimizers are generally used to update trainable neural network parameters.
 * Users are usually expected to call these MPSKernels from the update methods on their Convolution or BatchNormalization data sources.
 * <p>
 * Before the gradient is used to update the original value, some preprocessing occurs on each gradient where it is scaled or clipped
 * If regularization is chosen the appropriate regularization loss gradient is added to the value gradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizer extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNOptimizer allocWithZone(VoidPtr zone);

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
    public native MPSNNOptimizer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNOptimizer initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNOptimizer initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNOptimizer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
     * The default value is 1e-3
     */
    @Generated
    @Selector("learningRate")
    public native float learningRate();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNOptimizer new_objc();

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

    @Generated
    @Selector("setLearningRate:")
    public native void setLearningRate(float newLearningRate);

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
}
