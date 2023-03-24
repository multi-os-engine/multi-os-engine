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
 * MPSNNConcatenationGradientNode
 * 
 * A MPSNNSlice filter that operates as the conjugate computation for concatentation operators during training
 * 
 * As concatenation is formally just a copy and not a computation, there isn't a lot of arithmetic for
 * the slice operator to do, but we still need to extract out the relevant portion
 * of the gradient of the input signal that went into the corresponding concatenation
 * destination image.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNConcatenationGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNConcatenationGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNConcatenationGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNConcatenationGradientNode allocWithZone(VoidPtr zone);

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
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNConcatenationGradientNode init();

    /**
     * Init a MPSNNConcatenationGradientNode
     * 
     * Generally you should use [MPSNNConcatenationNode gradientFiltersWithSources:] instead.
     * 
     * @param gradientSourceNode The gradient image functioning as input for the operator
     * @param sourceImage        The particular input image to the concatentation, if any, that the slice corresponds
     *                           with
     * @param gradientState      The gradient state produced by the concatenation filter, consumed by this filter
     */
    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:")
    public native MPSNNConcatenationGradientNode initWithSourceGradientSourceImageGradientState(
            @NotNull MPSNNImageNode gradientSourceNode, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState);

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
    @Owned
    @Selector("new")
    public static native MPSNNConcatenationGradientNode new_objc();

    /**
     * create a MPSNNConcatenationGradientNode
     * 
     * Generally you should use [MPSNNConcatenationNode gradientFiltersWithSources:] instead.
     * 
     * @param gradientSourceNode The gradient image functioning as input for the operator
     * @param sourceImage        The particular input image to the concatentation, if any, that the slice corresponds
     *                           with
     * @param gradientState      The gradient state produced by the concatenation filter, consumed by this filter
     */
    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:")
    public static native MPSNNConcatenationGradientNode nodeWithSourceGradientSourceImageGradientState(
            @NotNull MPSNNImageNode gradientSourceNode, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState);

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
}
