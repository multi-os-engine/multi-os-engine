package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSNNLossCallback;
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
 * Node representing a @ref MPSNNLossGradient kernel
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNLossGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNLossGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNLossGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNLossGradientNode allocWithZone(VoidPtr zone);

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
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNLossGradientNode init();

    @Generated
    @Selector("initWithSourceGradient:sourceImage:labels:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public native MPSNNLossGradientNode initWithSourceGradientSourceImageLabelsGradientStateLossDescriptorIsLabelsGradientFilter(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels,
            MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

    @Generated
    @Selector("initWithSourceGradient:sourceImage:labels:weights:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public native MPSNNLossGradientNode initWithSourceGradientSourceImageLabelsWeightsGradientStateLossDescriptorIsLabelsGradientFilter(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNImageNode weights,
            MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

    /**
     * Init a gradient loss node from multiple images
     *
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     *                    Node0: input gradients, Node1: logits, Node2: labels, Node3: weights
     * @return A new MPSNNFilter node.
     */
    @Generated
    @Selector("initWithSources:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public native MPSNNLossGradientNode initWithSourcesGradientStateLossDescriptorIsLabelsGradientFilter(
            NSArray<? extends MPSNNImageNode> sourceNodes, MPSNNGradientStateNode gradientState,
            MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

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
    @Selector("isLabelsGradientFilter")
    public native boolean isLabelsGradientFilter();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNLossGradientNode new_objc();

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:labels:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public static native MPSNNLossGradientNode nodeWithSourceGradientSourceImageLabelsGradientStateLossDescriptorIsLabelsGradientFilter(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels,
            MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:labels:weights:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public static native MPSNNLossGradientNode nodeWithSourceGradientSourceImageLabelsWeightsGradientStateLossDescriptorIsLabelsGradientFilter(
            MPSNNImageNode sourceGradient, MPSNNImageNode sourceImage, MPSNNImageNode labels, MPSNNImageNode weights,
            MPSNNGradientStateNode gradientState, MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

    /**
     * Init a gradient loss node from multiple images
     *
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     *                    Node0: logits, Node1: labels, Node2: weights
     * @return A new MPSNNFilter node.
     */
    @Generated
    @Selector("nodeWithSources:gradientState:lossDescriptor:isLabelsGradientFilter:")
    public static native MPSNNLossGradientNode nodeWithSourcesGradientStateLossDescriptorIsLabelsGradientFilter(
            NSArray<? extends MPSNNImageNode> sourceNodes, MPSNNGradientStateNode gradientState,
            MPSCNNLossDescriptor descriptor, boolean isLabelsGradientFilter);

    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

    /**
     * [@property] propertyCallBack
     * <p>
     * Optional callback option - setting this allows the scalar weight value to be changed dynamically at encode time.
     * Default value: nil.
     */
    @Generated
    @Selector("propertyCallBack")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNNLossCallback propertyCallBack();

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
     * [@property] propertyCallBack
     * <p>
     * Optional callback option - setting this allows the scalar weight value to be changed dynamically at encode time.
     * Default value: nil.
     */
    @Generated
    @Selector("setPropertyCallBack:")
    public native void setPropertyCallBack(@Mapped(ObjCObjectMapper.class) MPSNNLossCallback value);

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
    @Selector("weight")
    public native float weight();

    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();
}
