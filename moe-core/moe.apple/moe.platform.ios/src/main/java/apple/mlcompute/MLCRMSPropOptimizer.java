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
 * MLCRMSPropOptimizer
 * 
 * The MLCRMSPropOptimizer specifies the RMSProp optimizer.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCRMSPropOptimizer extends MLCOptimizer implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCRMSPropOptimizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCRMSPropOptimizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCRMSPropOptimizer allocWithZone(VoidPtr zone);

    /**
     * [@property] alpha
     * 
     * The smoothing constant.
     * 
     * The default is 0.99.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

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
    public native MLCRMSPropOptimizer init();

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

    /**
     * [@property] isCentered
     * 
     * If True, compute the centered RMSProp, the gradient is normalized by an estimation of its variance.
     * 
     * The default is false.
     */
    @Generated
    @Selector("isCentered")
    public native boolean isCentered();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] momentumScale
     * 
     * The momentum factor. A hyper-parameter.
     * 
     * The default is 0.0.
     */
    @Generated
    @Selector("momentumScale")
    public native float momentumScale();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCRMSPropOptimizer new_objc();

    /**
     * Create a MLCRMSPropOptimizer object with defaults
     * 
     * @return A new MLCRMSPropOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:")
    public static native MLCRMSPropOptimizer optimizerWithDescriptor(
            @NotNull MLCOptimizerDescriptor optimizerDescriptor);

    /**
     * Create a MLCRMSPropOptimizer object
     * 
     * @param optimizerDescriptor The optimizer descriptor object
     * @param momentumScale       The momentum scale
     * @param alpha               The smoothing constant value
     * @param epsilon             The epsilon value to use to improve numerical stability
     * @param isCentered          A boolean to specify whether to compute the centered RMSProp or not
     * @return A new MLCRMSPropOptimizer object.
     */
    @Generated
    @Selector("optimizerWithDescriptor:momentumScale:alpha:epsilon:isCentered:")
    public static native MLCRMSPropOptimizer optimizerWithDescriptorMomentumScaleAlphaEpsilonIsCentered(
            @NotNull MLCOptimizerDescriptor optimizerDescriptor, float momentumScale, float alpha, float epsilon,
            boolean isCentered);

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
