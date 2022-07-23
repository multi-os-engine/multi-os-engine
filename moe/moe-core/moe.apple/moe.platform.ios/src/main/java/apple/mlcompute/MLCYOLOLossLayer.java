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

/**
 * MLCYOLOLossLayer
 * <p>
 * A YOLO loss layer
 */
@Generated
@Library("MLCompute")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MLCYOLOLossLayer extends MLCLossLayer {
    static {
        NatJ.register();
    }

    @Generated
    protected MLCYOLOLossLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MLCYOLOLossLayer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MLCYOLOLossLayer allocWithZone(VoidPtr zone);

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
    @Selector("categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCYOLOLossLayer categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    @Generated
    @Selector("categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCYOLOLossLayer categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
            int reductionType, float labelSmoothing, @NUInt long classCount, MLCTensor weights);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("cosineDistanceLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer cosineDistanceLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("cosineDistanceLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer cosineDistanceLossWithReductionTypeWeights(int reductionType,
            MLCTensor weights);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("hingeLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer hingeLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("hingeLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer hingeLossWithReductionTypeWeights(int reductionType, MLCTensor weights);

    @Generated
    @Selector("huberLossWithReductionType:delta:weight:")
    public static native MLCYOLOLossLayer huberLossWithReductionTypeDeltaWeight(int reductionType, float delta,
            float weight);

    @Generated
    @Selector("huberLossWithReductionType:delta:weights:")
    public static native MLCYOLOLossLayer huberLossWithReductionTypeDeltaWeights(int reductionType, float delta,
            MLCTensor weights);

    @Generated
    @Selector("init")
    public native MLCYOLOLossLayer init();

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
     * Create a YOLO loss layer
     *
     * @param lossDescriptor The loss descriptor
     * @return A new YOLO loss layer.
     */
    @Generated
    @Selector("layerWithDescriptor:")
    public static native MLCYOLOLossLayer layerWithDescriptor(MLCYOLOLossDescriptor lossDescriptor);

    @Generated
    @Selector("layerWithDescriptor:weights:")
    public static native MLCYOLOLossLayer layerWithDescriptorWeights(MLCLossDescriptor lossDescriptor,
            MLCTensor weights);

    @Generated
    @Selector("logLossWithReductionType:epsilon:weight:")
    public static native MLCYOLOLossLayer logLossWithReductionTypeEpsilonWeight(int reductionType, float epsilon,
            float weight);

    @Generated
    @Selector("logLossWithReductionType:epsilon:weights:")
    public static native MLCYOLOLossLayer logLossWithReductionTypeEpsilonWeights(int reductionType, float epsilon,
            MLCTensor weights);

    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer meanAbsoluteErrorLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer meanAbsoluteErrorLossWithReductionTypeWeights(int reductionType,
            MLCTensor weights);

    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weight:")
    public static native MLCYOLOLossLayer meanSquaredErrorLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weights:")
    public static native MLCYOLOLossLayer meanSquaredErrorLossWithReductionTypeWeights(int reductionType,
            MLCTensor weights);

    @Generated
    @Owned
    @Selector("new")
    public static native MLCYOLOLossLayer new_objc();

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
    @Selector("sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weight:")
    public static native MLCYOLOLossLayer sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeight(
            int reductionType, float labelSmoothing, float weight);

    @Generated
    @Selector("sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weights:")
    public static native MLCYOLOLossLayer sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeights(
            int reductionType, float labelSmoothing, MLCTensor weights);

    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    public static native MLCYOLOLossLayer softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    public static native MLCYOLOLossLayer softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
            int reductionType, float labelSmoothing, @NUInt long classCount, MLCTensor weights);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsDataType:onDevice:")
    public static native boolean supportsDataTypeOnDevice(int dataType, MLCDevice device);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] yoloLossDescriptor
     * <p>
     * The YOLO loss descriptor
     */
    @Generated
    @Selector("yoloLossDescriptor")
    public native MLCYOLOLossDescriptor yoloLossDescriptor();
}
