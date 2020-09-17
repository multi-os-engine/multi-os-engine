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
    @Selector("gradientFilterWithSource:")
    public native MPSNNLossGradientNode gradientFilterWithSource(MPSNNImageNode sourceGradient);

    @Generated
    @Selector("gradientFilterWithSources:")
    public native MPSNNLossGradientNode gradientFilterWithSources(NSArray<? extends MPSNNImageNode> sourceGradient);

    @Generated
    @Selector("gradientFiltersWithSource:")
    public native NSArray<? extends MPSNNLossGradientNode> gradientFiltersWithSource(MPSNNImageNode sourceGradient);

    @Generated
    @Selector("gradientFiltersWithSources:")
    public native NSArray<? extends MPSNNLossGradientNode> gradientFiltersWithSources(
            NSArray<? extends MPSNNImageNode> sourceGradient);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNForwardLossNode init();

    @Generated
    @Selector("initWithSource:labels:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourceLabelsLossDescriptor(MPSNNImageNode source, MPSNNImageNode labels,
            MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("initWithSource:labels:weights:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourceLabelsWeightsLossDescriptor(MPSNNImageNode source,
            MPSNNImageNode labels, MPSNNImageNode weights, MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("initWithSources:lossDescriptor:")
    public native MPSNNForwardLossNode initWithSourcesLossDescriptor(NSArray<? extends MPSNNImageNode> sourceNodes,
            MPSCNNLossDescriptor descriptor);

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
    @Selector("labelSmoothing")
    public native float labelSmoothing();

    @Generated
    @Selector("lossType")
    public native int lossType();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("nodeWithSource:labels:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourceLabelsLossDescriptor(MPSNNImageNode source,
            MPSNNImageNode labels, MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("nodeWithSource:labels:weights:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourceLabelsWeightsLossDescriptor(MPSNNImageNode source,
            MPSNNImageNode labels, MPSNNImageNode weights, MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("nodeWithSources:lossDescriptor:")
    public static native MPSNNForwardLossNode nodeWithSourcesLossDescriptor(
            NSArray<? extends MPSNNImageNode> sourceNodes, MPSCNNLossDescriptor descriptor);

    @Generated
    @Selector("numberOfClasses")
    @NUInt
    public native long numberOfClasses();

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