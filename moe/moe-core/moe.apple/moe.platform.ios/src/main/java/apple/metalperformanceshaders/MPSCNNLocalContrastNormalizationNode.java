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
 * Node representing MPSCNNLocalContrastNormalization
 * 
 * The result is computed for each element of X as follows:
 * 
 * Y(i,j) = pm + ps * ( X(i,j) - p0 * M(i,j)) / pow((delta + alpha * variance(i,j)), beta),
 * 
 * where kw and kh are the kernelWidth and the kernelHeight and pm, ps and p0 are parameters that
 * can be used to offset and scale the result in various ways. *
 * [@code]
 * Defaults:
 * alpha = 1.0f
 * beta = 0.5f
 * delta = 2^-10
 * pm = 0
 * ps = 1
 * p0 = 1
 * kernelHeight = kernelWidth = kernelSize
 * [@endcode]
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNLocalContrastNormalizationNode extends MPSCNNNormalizationNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNLocalContrastNormalizationNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNLocalContrastNormalizationNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNLocalContrastNormalizationNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNLocalContrastNormalizationNode init();

    @Generated
    @Selector("initWithSource:")
    public native MPSCNNLocalContrastNormalizationNode initWithSource(@NotNull MPSNNImageNode sourceNode);

    @Generated
    @Selector("initWithSource:kernelSize:")
    public native MPSCNNLocalContrastNormalizationNode initWithSourceKernelSize(@NotNull MPSNNImageNode sourceNode,
            @NUInt long kernelSize);

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
    public static native MPSCNNLocalContrastNormalizationNode new_objc();

    @Generated
    @Selector("nodeWithSource:")
    public static native MPSCNNLocalContrastNormalizationNode nodeWithSource(@NotNull MPSNNImageNode sourceNode);

    @Generated
    @Selector("nodeWithSource:kernelSize:")
    public static native MPSCNNLocalContrastNormalizationNode nodeWithSourceKernelSize(
            @NotNull MPSNNImageNode sourceNode, @NUInt long kernelSize);

    @Generated
    @Selector("p0")
    public native float p0();

    @Generated
    @Selector("pm")
    public native float pm();

    @Generated
    @Selector("ps")
    public native float ps();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setKernelHeight:")
    public native void setKernelHeight(@NUInt long value);

    @Generated
    @Selector("setKernelWidth:")
    public native void setKernelWidth(@NUInt long value);

    @Generated
    @Selector("setP0:")
    public native void setP0(float value);

    @Generated
    @Selector("setPm:")
    public native void setPm(float value);

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
}
