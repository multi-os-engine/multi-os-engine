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
 * MLCOptimizer
 * <p>
 * The MLCOptimizer specifies a base optimizer.
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCOptimizer extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCOptimizer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCOptimizer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCOptimizer allocWithZone(VoidPtr zone);

    /**
     * [@property] appliesGradientClipping
     * <p>
     * Whether gradient clipping should be applied or not.
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
     * <p>
     * Used only with MLCGradientClippingTypeByGlobalNorm. If non zero, this norm will be used in place of global norm.
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
     * [@property] gradientClipMax
     * <p>
     * The maximum gradient value if gradient clipping is enabled before gradient is rescaled.
     */
    @Generated
    @Selector("gradientClipMax")
    public native float gradientClipMax();

    /**
     * [@property] gradientClipMin
     * <p>
     * The minimum gradient value if gradient clipping is enabled before gradient is rescaled.
     */
    @Generated
    @Selector("gradientClipMin")
    public native float gradientClipMin();

    /**
     * [@property] gradientClippingType
     * <p>
     * The type of clipping applied to gradient
     */
    @Generated
    @Selector("gradientClippingType")
    public native int gradientClippingType();

    /**
     * [@property] gradientRescale
     * <p>
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
    public native MLCOptimizer init();

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
     * <p>
     * The learning rate. This property is 'readwrite' so that callers can implement a 'decay' during training
     */
    @Generated
    @Selector("learningRate")
    public native float learningRate();

    /**
     * [@property] maximumClippingNorm
     * <p>
     * The maximum clipping value
     */
    @Generated
    @Selector("maximumClippingNorm")
    public native float maximumClippingNorm();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCOptimizer new_objc();

    /**
     * [@property] regularizationScale
     * <p>
     * The regularization scale.
     */
    @Generated
    @Selector("regularizationScale")
    public native float regularizationScale();

    /**
     * [@property] regularizationType
     * <p>
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

    /**
     * [@property] appliesGradientClipping
     * <p>
     * Whether gradient clipping should be applied or not.
     */
    @Generated
    @Selector("setAppliesGradientClipping:")
    public native void setAppliesGradientClipping(boolean value);

    /**
     * [@property] learningRate
     * <p>
     * The learning rate. This property is 'readwrite' so that callers can implement a 'decay' during training
     */
    @Generated
    @Selector("setLearningRate:")
    public native void setLearningRate(float value);

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
