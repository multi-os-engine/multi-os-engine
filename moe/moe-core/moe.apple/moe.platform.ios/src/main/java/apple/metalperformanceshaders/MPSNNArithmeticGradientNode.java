package apple.metalperformanceshaders;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNArithmeticGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNArithmeticGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNArithmeticGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNArithmeticGradientNode allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("bias")
    public native float bias();

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNArithmeticGradientNode init();

    /**
     * create a new arithmetic gradient node
     * 
     * See also -[MPSCNNNeuronNode gradientFilterNodesWithSources:]
     * for an easier way to do this.
     * 
     * @param gradientImages          The input gradient from the 'downstream' gradient filter and the source input
     *                                image
     *                                from the forward pass (primary or secondary).
     * @param filter                  The matching filter node from the forward pass.
     * @param isSecondarySourceFilter The isSecondarySourceFilter property is used to indicate whether the arithmetic
     *                                gradient filter is operating on the primary or secondary source image from the
     *                                forward pass.
     */
    @Generated
    @Selector("initWithGradientImages:forwardFilter:isSecondarySourceFilter:")
    public native MPSNNArithmeticGradientNode initWithGradientImagesForwardFilterIsSecondarySourceFilter(
            @NotNull NSArray<? extends MPSNNImageNode> gradientImages, @NotNull MPSNNFilterNode filter,
            boolean isSecondarySourceFilter);

    /**
     * create a new arithmetic gradient node
     * 
     * See also -[MPSCNNNeuronNode gradientFilterNodesWithSources:]
     * for an easier way to do this.
     * 
     * @param sourceGradient The input gradient from the 'downstream' gradient filter.
     * @param sourceImage    The source input image from the forward pass (primary or secondary).
     * @param gradientState  The gradient state produced by the concatenation filter, consumed by this filter.
     */
    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:isSecondarySourceFilter:")
    public native MPSNNArithmeticGradientNode initWithSourceGradientSourceImageGradientStateIsSecondarySourceFilter(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNBinaryGradientStateNode gradientState, boolean isSecondarySourceFilter);

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
    @Selector("isSecondarySourceFilter")
    public native boolean isSecondarySourceFilter();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("maximumValue")
    public native float maximumValue();

    @Generated
    @Selector("minimumValue")
    public native float minimumValue();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNArithmeticGradientNode new_objc();

    /**
     * create a new arithmetic gradient node
     * 
     * See also -[MPSCNNNeuronNode gradientFilterNodesWithSources:]
     * for an easier way to do this.
     * 
     * @param sourceGradient The input gradient from the 'downstream' gradient filter.
     * @param sourceImage    The source input image from the forward pass (primary or secondary).
     * @param gradientState  The gradient state produced by the concatenation filter, consumed by this filter.
     */
    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:isSecondarySourceFilter:")
    public static native MPSNNArithmeticGradientNode nodeWithSourceGradientSourceImageGradientStateIsSecondarySourceFilter(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNBinaryGradientStateNode gradientState, boolean isSecondarySourceFilter);

    @Generated
    @Selector("primaryScale")
    public native float primaryScale();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("secondaryScale")
    public native float secondaryScale();

    @Generated
    @Selector("secondaryStrideInFeatureChannels")
    @NUInt
    public native long secondaryStrideInFeatureChannels();

    @Generated
    @Selector("secondaryStrideInPixelsX")
    @NUInt
    public native long secondaryStrideInPixelsX();

    @Generated
    @Selector("secondaryStrideInPixelsY")
    @NUInt
    public native long secondaryStrideInPixelsY();

    @Generated
    @Selector("setBias:")
    public native void setBias(float value);

    @Generated
    @Selector("setMaximumValue:")
    public native void setMaximumValue(float value);

    @Generated
    @Selector("setMinimumValue:")
    public native void setMinimumValue(float value);

    @Generated
    @Selector("setPrimaryScale:")
    public native void setPrimaryScale(float value);

    @Generated
    @Selector("setSecondaryScale:")
    public native void setSecondaryScale(float value);

    @Generated
    @Selector("setSecondaryStrideInFeatureChannels:")
    public native void setSecondaryStrideInFeatureChannels(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsX:")
    public native void setSecondaryStrideInPixelsX(@NUInt long value);

    @Generated
    @Selector("setSecondaryStrideInPixelsY:")
    public native void setSecondaryStrideInPixelsY(@NUInt long value);

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
