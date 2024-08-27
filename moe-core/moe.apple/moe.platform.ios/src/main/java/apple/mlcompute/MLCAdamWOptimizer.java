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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MLCAdamWOptimizer
 * 
 * The MLCAdamWOptimizer specifies the AdamW optimizer.
 * 
 * API-Since: 15.0
 * Deprecated-Since: 100000.0
 * Deprecated-Message: Use Metal Performance Shaders Graph or BNNS instead.
 */
@Deprecated
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCAdamWOptimizer extends MLCOptimizer implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCAdamWOptimizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCAdamWOptimizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCAdamWOptimizer allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beta1
     * 
     * Coefficent used for computing running averages of gradient.
     * 
     * The default is 0.9.
     */
    @Generated
    @Selector("beta1")
    public native float beta1();

    /**
     * [@property] beta2
     * 
     * Coefficent used for computing running averages of square of gradient.
     * 
     * The default is 0.999.
     */
    @Generated
    @Selector("beta2")
    public native float beta2();

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] epsilon
     * 
     * A term added to improve numerical stability.
     * 
     * The default is 1e-8.
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MLCAdamWOptimizer init();

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

    @Generated
    @Owned
    @Selector("new")
    public static native MLCAdamWOptimizer new_objc();

    /**
     * Create an MLCAdamWOptimizer object with defaults
     * 
     * @return A new MLCAdamWOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:")
    public static native MLCAdamWOptimizer optimizerWithDescriptor(@NotNull MLCOptimizerDescriptor optimizerDescriptor);

    /**
     * Create an MLCAdamWOptimizer object
     * 
     * @param optimizerDescriptor The optimizer descriptor object
     * @param beta1               The beta1 value
     * @param beta2               The beta2 value
     * @param epsilon             The epsilon value to use to improve numerical stability
     * @param usesAMSGrad         Whether to use the AMSGrad variant of this algorithm from the paper
     *                            (https://arxiv.org/abs/1904.09237)
     * @param timeStep            The initial timestep to use for the update
     * @return A new MLCAdamWOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:beta1:beta2:epsilon:usesAMSGrad:timeStep:")
    public static native MLCAdamWOptimizer optimizerWithDescriptorBeta1Beta2EpsilonUsesAMSGradTimeStep(
            @NotNull MLCOptimizerDescriptor optimizerDescriptor, float beta1, float beta2, float epsilon,
            boolean usesAMSGrad, @NUInt long timeStep);

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

    /**
     * [@property] timeStep
     * 
     * The current timestep used for the update.
     * 
     * The default is 1.
     */
    @Generated
    @Selector("timeStep")
    @NUInt
    public native long timeStep();

    /**
     * [@property] usesAMSGrad
     * 
     * Whether to use the AMSGrad variant of this algorithm
     * 
     * The default is false
     */
    @Generated
    @Selector("usesAMSGrad")
    public native boolean usesAMSGrad();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
