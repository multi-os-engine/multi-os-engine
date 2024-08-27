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
public class MPSCNNLocalContrastNormalizationGradientNode extends MPSNNGradientFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLocalContrastNormalizationGradientNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLocalContrastNormalizationGradientNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLocalContrastNormalizationGradientNode allocWithZone(VoidPtr zone);

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 0.0
     * 
     * The default value 0.0 is not recommended and is
     * preserved for backwards compatibility. With alpha 0,
     * it performs a local mean subtraction. The
     * MPSCNNLocalContrastNormalizationNode used with
     * the MPSNNGraph uses 1.0 as a default.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 0.5
     */
    @Generated
    @Selector("beta")
    public native float beta();

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

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1/1024
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNLocalContrastNormalizationGradientNode init();

    @Generated
    @Selector("initWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:")
    public native MPSCNNLocalContrastNormalizationGradientNode initWithSourceGradientSourceImageGradientStateKernelWidthKernelHeight(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState, @NUInt long kernelWidth, @NUInt long kernelHeight);

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
    @Selector("kernelHeight")
    @NUInt
    public native long kernelHeight();

    @Generated
    @Selector("kernelWidth")
    @NUInt
    public native long kernelWidth();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNLocalContrastNormalizationGradientNode new_objc();

    @Generated
    @Selector("nodeWithSourceGradient:sourceImage:gradientState:kernelWidth:kernelHeight:")
    public static native MPSCNNLocalContrastNormalizationGradientNode nodeWithSourceGradientSourceImageGradientStateKernelWidthKernelHeight(
            @NotNull MPSNNImageNode sourceGradient, @NotNull MPSNNImageNode sourceImage,
            @NotNull MPSNNGradientStateNode gradientState, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * [@property] p0
     * 
     * The value of p0. Default is 1.0
     */
    @Generated
    @Selector("p0")
    public native float p0();

    /**
     * [@property] pm
     * 
     * The value of pm. Default is 0.0
     */
    @Generated
    @Selector("pm")
    public native float pm();

    /**
     * [@property] ps
     * 
     * The value of ps. Default is 1.0
     */
    @Generated
    @Selector("ps")
    public native float ps();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 0.0
     * 
     * The default value 0.0 is not recommended and is
     * preserved for backwards compatibility. With alpha 0,
     * it performs a local mean subtraction. The
     * MPSCNNLocalContrastNormalizationNode used with
     * the MPSNNGraph uses 1.0 as a default.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 0.5
     */
    @Generated
    @Selector("setBeta:")
    public native void setBeta(float value);

    /**
     * [@property] delta
     * 
     * The value of delta. Default is 1/1024
     */
    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

    /**
     * [@property] p0
     * 
     * The value of p0. Default is 1.0
     */
    @Generated
    @Selector("setP0:")
    public native void setP0(float value);

    /**
     * [@property] pm
     * 
     * The value of pm. Default is 0.0
     */
    @Generated
    @Selector("setPm:")
    public native void setPm(float value);

    /**
     * [@property] ps
     * 
     * The value of ps. Default is 1.0
     */
    @Generated
    @Selector("setPs:")
    public native void setPs(float value);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
