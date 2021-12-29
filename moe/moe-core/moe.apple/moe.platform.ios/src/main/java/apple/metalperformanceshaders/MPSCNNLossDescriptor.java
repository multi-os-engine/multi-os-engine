package apple.metalperformanceshaders;

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
 * MPSCNNLossDescriptor
 * [@dependency] This depends on Metal.framework.
 * <p>
 * The MPSCNNLossDescriptor specifies a loss filter descriptor.
 * The same descriptor can be used to initialize both the
 * MPSCNNLoss and the MPSNNLossGradient filters.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLossDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLossDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLossDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLossDescriptor allocWithZone(VoidPtr zone);

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

    /**
     * Make a descriptor for a MPSCNNLoss or MPSNNLossGradient object.
     *
     * @param lossType      The type of a loss filter.
     * @param reductionType The type of a reduction operation to apply.
     *                      This argument is ignored in the MPSNNLossGradient filter.
     * @return A valid MPSCNNLossDescriptor object or nil, if failure.
     */
    @Generated
    @Selector("cnnLossDescriptorWithType:reductionType:")
    public static native MPSCNNLossDescriptor cnnLossDescriptorWithTypeReductionType(int lossType, int reductionType);

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property]    delta
     * <p>
     * The delta parameter. The default value is 1.0f.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossTypeHuber.
     * <p>
     * Given predictions and labels (ground truth), it is applied in the following way:
     * if (|predictions - labels| <= delta, loss = 0.5f * predictions^2
     * if (|predictions - labels| >  delta, loss = 0.5 * delta^2 + delta * (|predictions - labels| - delta)
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]    epsilon
     * <p>
     * The epsilon parameter. The default value is 1e-7.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossTypeLog.
     * <p>
     * Given predictions and labels (ground truth), it is applied in the following way:
     * -(labels * log(predictions + epsilon)) - ((1 - labels) * log(1 - predictions + epsilon))
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
    public native MPSCNNLossDescriptor init();

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
     * [@property]    labelSmoothing
     * <p>
     * The label smoothing parameter. The default value is 0.0f.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy, MPSCNNLossFunctionTypeSigmoidCrossEntropy.
     * <p>
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy: given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + labelSmoothing / numberOfClasses : labels
     * <p>
     * MPSCNNLossFunctionTypeSigmoidCrossEntropy: given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + 0.5 * labelSmoothing : labels
     */
    @Generated
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    /**
     * [@property]   lossType
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLossDescriptor new_objc();

    /**
     * [@property]    numberOfClasses
     * <p>
     * The number of classes parameter. The default value is 1.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy.
     * <p>
     * Given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + labelSmoothing / numberOfClasses : labels
     */
    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

    /**
     * [@property]   reductionType
     * <p>
     * The type of a reduction operation performed in the loss filter.
     * <p>
     * This parameter specifies the type of a reduction operation
     * performed in the loss filter.
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

    /**
     * [@property]    delta
     * <p>
     * The delta parameter. The default value is 1.0f.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossTypeHuber.
     * <p>
     * Given predictions and labels (ground truth), it is applied in the following way:
     * if (|predictions - labels| <= delta, loss = 0.5f * predictions^2
     * if (|predictions - labels| >  delta, loss = 0.5 * delta^2 + delta * (|predictions - labels| - delta)
     */
    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

    /**
     * [@property]    epsilon
     * <p>
     * The epsilon parameter. The default value is 1e-7.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossTypeLog.
     * <p>
     * Given predictions and labels (ground truth), it is applied in the following way:
     * -(labels * log(predictions + epsilon)) - ((1 - labels) * log(1 - predictions + epsilon))
     */
    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

    /**
     * [@property]    labelSmoothing
     * <p>
     * The label smoothing parameter. The default value is 0.0f.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy, MPSCNNLossFunctionTypeSigmoidCrossEntropy.
     * <p>
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy: given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + labelSmoothing / numberOfClasses : labels
     * <p>
     * MPSCNNLossFunctionTypeSigmoidCrossEntropy: given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + 0.5 * labelSmoothing : labels
     */
    @Generated
    @Selector("setLabelSmoothing:")
    public native void setLabelSmoothing(float value);

    /**
     * [@property]   lossType
     * <p>
     * The type of a loss filter.
     * <p>
     * This parameter specifies the type of a loss filter.
     */
    @Generated
    @Selector("setLossType:")
    public native void setLossType(int value);

    /**
     * [@property]    numberOfClasses
     * <p>
     * The number of classes parameter. The default value is 1.
     * <p>
     * This parameter is valid only for the loss functions of the following type(s):
     * MPSCNNLossFunctionTypeSoftmaxCrossEntropy.
     * <p>
     * Given labels (ground truth), it is applied in the following way:
     * labels = labelSmoothing > 0 ? labels * (1 - labelSmoothing) + labelSmoothing / numberOfClasses : labels
     */
    @Generated
    @Selector("setNumberOfClasses:")
    public native void setNumberOfClasses(@NUInt long value);

    /**
     * [@property]   reductionType
     * <p>
     * The type of a reduction operation performed in the loss filter.
     * <p>
     * This parameter specifies the type of a reduction operation
     * performed in the loss filter.
     */
    @Generated
    @Selector("setReductionType:")
    public native void setReductionType(int value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   weight
     * <p>
     * The scale factor to apply to each element of a result.
     * <p>
     * Each element of a result is multiplied by the weight value.
     * The default value is 1.0f.
     */
    @Generated
    @Selector("setWeight:")
    public native void setWeight(float value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property]   weight
     * <p>
     * The scale factor to apply to each element of a result.
     * <p>
     * Each element of a result is multiplied by the weight value.
     * The default value is 1.0f.
     */
    @Generated
    @Selector("weight")
    public native float weight();

    /**
     * [@property]   reduceAcrossBatch
     * <p>
     * If set to YES then the reduction operation is applied also across the batch-index dimension,
     * ie. the loss value is summed over images in the batch and the result of the reduction is written
     * on the first loss image in the batch while the other loss images will be set to zero.
     * If set to NO, then no reductions are performed across the batch dimension and each image in the batch
     * will contain the loss value associated with that one particular image.
     * NOTE: If reductionType == MPSCNNReductionTypeNone, then this flag has no effect on results,
     * that is no reductions are done in this case.
     * NOTE: If reduceAcrossBatch is set to YES and reductionType == MPSCNNReductionTypeMean then
     * the final forward loss value is computed by first summing over the components and then by
     * dividing the result with: number of feature channels * width * height * number of images in the batch.
     * The default value is NO.
     */
    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();

    /**
     * [@property]   reduceAcrossBatch
     * <p>
     * If set to YES then the reduction operation is applied also across the batch-index dimension,
     * ie. the loss value is summed over images in the batch and the result of the reduction is written
     * on the first loss image in the batch while the other loss images will be set to zero.
     * If set to NO, then no reductions are performed across the batch dimension and each image in the batch
     * will contain the loss value associated with that one particular image.
     * NOTE: If reductionType == MPSCNNReductionTypeNone, then this flag has no effect on results,
     * that is no reductions are done in this case.
     * NOTE: If reduceAcrossBatch is set to YES and reductionType == MPSCNNReductionTypeMean then
     * the final forward loss value is computed by first summing over the components and then by
     * dividing the result with: number of feature channels * width * height * number of images in the batch.
     * The default value is NO.
     */
    @Generated
    @Selector("setReduceAcrossBatch:")
    public native void setReduceAcrossBatch(boolean value);
}
