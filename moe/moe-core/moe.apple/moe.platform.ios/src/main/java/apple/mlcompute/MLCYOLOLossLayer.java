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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    @Generated
    @Selector("categoricalCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object categoricalCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
            int reductionType, float labelSmoothing, @NUInt long classCount, MLCTensor weights);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("cosineDistanceLossWithReductionType:weight:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cosineDistanceLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("cosineDistanceLossWithReductionType:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object cosineDistanceLossWithReductionTypeWeights(int reductionType, MLCTensor weights);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hingeLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("hingeLossWithReductionType:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object hingeLossWithReductionTypeWeights(int reductionType, MLCTensor weights);

    @Generated
    @Selector("huberLossWithReductionType:delta:weight:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object huberLossWithReductionTypeDeltaWeight(int reductionType, float delta, float weight);

    @Generated
    @Selector("huberLossWithReductionType:delta:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object huberLossWithReductionTypeDeltaWeights(int reductionType, float delta,
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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object logLossWithReductionTypeEpsilonWeight(int reductionType, float epsilon, float weight);

    @Generated
    @Selector("logLossWithReductionType:epsilon:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object logLossWithReductionTypeEpsilonWeights(int reductionType, float epsilon,
            MLCTensor weights);

    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weight:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meanAbsoluteErrorLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("meanAbsoluteErrorLossWithReductionType:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meanAbsoluteErrorLossWithReductionTypeWeights(int reductionType, MLCTensor weights);

    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weight:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meanSquaredErrorLossWithReductionTypeWeight(int reductionType, float weight);

    @Generated
    @Selector("meanSquaredErrorLossWithReductionType:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object meanSquaredErrorLossWithReductionTypeWeights(int reductionType, MLCTensor weights);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeight(int reductionType,
            float labelSmoothing, float weight);

    @Generated
    @Selector("sigmoidCrossEntropyLossWithReductionType:labelSmoothing:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object sigmoidCrossEntropyLossWithReductionTypeLabelSmoothingWeights(int reductionType,
            float labelSmoothing, MLCTensor weights);

    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weight:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeight(
            int reductionType, float labelSmoothing, @NUInt long classCount, float weight);

    @Generated
    @Selector("softmaxCrossEntropyLossWithReductionType:labelSmoothing:classCount:weights:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object softmaxCrossEntropyLossWithReductionTypeLabelSmoothingClassCountWeights(
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
     * [@property]   yoloLossDescriptor
     * <p>
     * The YOLO loss descriptor
     */
    @Generated
    @Selector("yoloLossDescriptor")
    public native MLCYOLOLossDescriptor yoloLossDescriptor();
}
