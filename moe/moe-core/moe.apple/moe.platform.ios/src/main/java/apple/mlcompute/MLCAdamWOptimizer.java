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
 * MLCAdamWOptimizer
 * <p>
 * The MLCAdamWOptimizer specifies the AdamW optimizer.
 */
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property]   beta1
     * <p>
     * Coefficent used for computing running averages of gradient.
     * <p>
     * The default is 0.9.
     */
    @Generated
    @Selector("beta1")
    public native float beta1();

    /**
     * [@property]   beta2
     * <p>
     * Coefficent used for computing running averages of square of gradient.
     * <p>
     * The default is 0.999.
     */
    @Generated
    @Selector("beta2")
    public native float beta2();

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

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   epsilon
     * <p>
     * A term added to improve numerical stability.
     * <p>
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * Create an MLCAdamWOptimizer object with defaults
     *
     * @return A new MLCAdamWOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:")
    public static native MLCAdamWOptimizer optimizerWithDescriptor(MLCOptimizerDescriptor optimizerDescriptor);

    /**
     * Create an MLCAdamWOptimizer object
     *
     * @param optimizerDescriptor The optimizer descriptor object
     * @param beta1               The beta1 value
     * @param beta2               The beta2 value
     * @param epsilon             The epsilon value to use to improve numerical stability
     * @param usesAMSGrad         Whether to use the AMSGrad variant of this algorithm from the paper (https://arxiv.org/abs/1904.09237)
     * @param timeStep            The initial timestep to use for the update
     * @return A new MLCAdamWOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:beta1:beta2:epsilon:usesAMSGrad:timeStep:")
    public static native MLCAdamWOptimizer optimizerWithDescriptorBeta1Beta2EpsilonUsesAMSGradTimeStep(
            MLCOptimizerDescriptor optimizerDescriptor, float beta1, float beta2, float epsilon, boolean usesAMSGrad,
            @NUInt long timeStep);

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
     * [@property]   timeStep
     * <p>
     * The current timestep used for the update.
     * <p>
     * The default is 1.
     */
    @Generated
    @Selector("timeStep")
    @NUInt
    public native long timeStep();

    /**
     * [@property]   usesAMSGrad
     * <p>
     * Whether to use the AMSGrad variant of this algorithm
     * <p>
     * The default is false
     */
    @Generated
    @Selector("usesAMSGrad")
    public native boolean usesAMSGrad();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
