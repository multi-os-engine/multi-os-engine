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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Node representing a @ref MPSNNForwardLoss kernel
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNForwardLossNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNForwardLossNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNForwardLossNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNForwardLossNode allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("gradientFilterWithSource:")
    public native MPSNNLossGradientNode gradientFilterWithSource(@NotNull MPSNNImageNode sourceGradient);

    /**
     * ! @abstract Returns the gradient filter for predictions, if you want also gradients for labels then use
     * -gradientFiltersWithSource(s):
     */
    @NotNull
    @Generated
    @Selector("gradientFilterWithSources:")
    public native MPSNNLossGradientNode gradientFilterWithSources(
            @NotNull NSArray<? extends MPSNNImageNode> sourceGradient);

    @NotNull
    @Generated
    @Selector("gradientFiltersWithSource:")
    public native NSArray<? extends MPSNNLossGradientNode> gradientFiltersWithSource(
            @NotNull MPSNNImageNode sourceGradient);

    @NotNull
    @Generated
    @Selector("gradientFiltersWithSources:")
    public native NSArray<? extends MPSNNLossGradientNode> gradientFiltersWithSources(
            @NotNull NSArray<? extends MPSNNImageNode> sourceGradient);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNForwardLossNode init();

    @Generated
    @Selector("initWithSource:labels:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourceLabelsLossDescriptor(@NotNull MPSNNImageNode source,
            @NotNull MPSNNImageNode labels, @NotNull MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("initWithSource:labels:weights:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourceLabelsWeightsLossDescriptor(@NotNull MPSNNImageNode source,
            @NotNull MPSNNImageNode labels, @Nullable MPSNNImageNode weights, @NotNull MPSCNNLossDescriptor descriptor);

    /**
     * Init a forward loss node from multiple images
     * 
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     *                    Node0: logits, Node1: labels, Node2: weights
     * @return A new MPSNNFilter node.
     */
    @Generated
    @Selector("initWithSources:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourcesLossDescriptor(
            @NotNull NSArray<? extends MPSNNImageNode> sourceNodes, @NotNull MPSCNNLossDescriptor descriptor);

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
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNForwardLossNode new_objc();

    @Generated
    @Selector("nodeWithSource:labels:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourceLabelsLossDescriptor(@NotNull MPSNNImageNode source,
            @NotNull MPSNNImageNode labels, @NotNull MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("nodeWithSource:labels:weights:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourceLabelsWeightsLossDescriptor(@NotNull MPSNNImageNode source,
            @NotNull MPSNNImageNode labels, @NotNull MPSNNImageNode weights, @NotNull MPSCNNLossDescriptor descriptor);

    /**
     * Init a forward loss node from multiple images
     * 
     * @param sourceNodes The MPSNNImageNode representing the source MPSImages for the filter
     *                    Node0: logits, Node1: labels, Node2: weights
     * @return A new MPSNNFilter node.
     */
    @Generated
    @Selector("nodeWithSources:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourcesLossDescriptor(
            @NotNull NSArray<? extends MPSNNImageNode> sourceNodes, @NotNull MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

    /**
     * [@property] propertyCallBack
     * 
     * Optional callback option - setting this allows the scalar weight value to be changed dynamically at encode time.
     * Default value: nil.
     */
    @Nullable
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
     * 
     * Optional callback option - setting this allows the scalar weight value to be changed dynamically at encode time.
     * Default value: nil.
     */
    @Generated
    @Selector("setPropertyCallBack:")
    public native void setPropertyCallBack(@Nullable @Mapped(ObjCObjectMapper.class) MPSNNLossCallback value);

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

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("reduceAcrossBatch")
    public native boolean reduceAcrossBatch();
}
