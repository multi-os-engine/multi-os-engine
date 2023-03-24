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
 * MLCLossDescriptor
 * 
 * The MLCLossDescriptor specifies a loss filter descriptor.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCLossDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCLossDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCLossDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCLossDescriptor allocWithZone(VoidPtr zone);

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
     * [@property] numberOfClasses
     * 
     * The number of classes parameter. The default value is 1.
     * 
     * This parameter is valid only for the loss function MLCLossTypeSoftmaxCrossEntropy.
     */
    @Generated
    @Selector("classCount")
    @NUInt
    public native long classCount();

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

    /**
     * [@property] delta
     * 
     * The delta parameter. The default value is 1.0f.
     * 
     * This parameter is valid only for the loss function MLCLossTypeHuber.
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Create a loss descriptor object
     * 
     * @param lossType      The loss function.
     * @param reductionType The reduction operation
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:")
    public static native MLCLossDescriptor descriptorWithTypeReductionType(int lossType, int reductionType);

    /**
     * Create a loss descriptor object
     * 
     * @param lossType      The loss function.
     * @param reductionType The reduction operation
     * @param weight        The scale factor to apply to each element of a result.
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeight(int lossType, int reductionType,
            float weight);

    /**
     * Create a loss descriptor object
     * 
     * @param lossType       The loss function.
     * @param reductionType  The reduction operation
     * @param weight         The scale factor to apply to each element of a result.
     * @param labelSmoothing The label smoothing parameter.
     * @param classCount     The number of classes parameter.
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:labelSmoothing:classCount:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeightLabelSmoothingClassCount(int lossType,
            int reductionType, float weight, float labelSmoothing, @NUInt long classCount);

    /**
     * Create a loss descriptor object
     * 
     * @param lossType       The loss function.
     * @param reductionType  The reduction operation
     * @param weight         The scale factor to apply to each element of a result.
     * @param labelSmoothing The label smoothing parameter.
     * @param classCount     The number of classes parameter.
     * @param epsilon        The epsilon used by LogLoss
     * @param delta          The delta parameter used by Huber loss
     * @return A new MLCLossDescriptor object
     */
    @Generated
    @Selector("descriptorWithType:reductionType:weight:labelSmoothing:classCount:epsilon:delta:")
    public static native MLCLossDescriptor descriptorWithTypeReductionTypeWeightLabelSmoothingClassCountEpsilonDelta(
            int lossType, int reductionType, float weight, float labelSmoothing, @NUInt long classCount, float epsilon,
            float delta);

    /**
     * [@property] epsilon
     * 
     * The epsilon parameter. The default value is 1e-7.
     * 
     * This parameter is valid only for the loss function MLCLossTypeLog.
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
    public native MLCLossDescriptor init();

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
     * [@property] labelSmoothing
     * 
     * The label smoothing parameter. The default value is 0.0.
     * 
     * This parameter is valid only for the loss functions of the following type(s):
     * MLCLossTypeSoftmaxCrossEntropy and MLCLossTypeSigmoidCrossEntropy.
     */
    @Generated
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    /**
     * [@property] lossType
     * 
     * Specifies the loss function.
     */
    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    public static native MLCLossDescriptor new_objc();

    /**
     * [@property] reductionType
     * 
     * The reduction operation performed by the loss function.
     */
    @Generated
    @Selector("reductionType")
    public native int reductionType();

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

    /**
     * [@property] weight
     * 
     * The scale factor to apply to each element of a result. The default value is 1.0.
     */
    @Generated
    @Selector("weight")
    public native float weight();
}
