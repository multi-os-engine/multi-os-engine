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
 * Node representing MPSCNNCrossChannelNormalization
 * 
 * The normalized output is given by:
 * Y(i,j,k) = X(i,j,k) / L(i,j,k)^beta,
 * where the normalizing factor is:
 * L(i,j,k) = delta + alpha/N * (sum_{q in Q(k)} X(i,j,q)^2, where
 * N is the kernel size. The window Q(k) itself is defined as:
 * Q(k) = [max(0, k-floor(N/2)), min(D-1, k+floor((N-1)/2)], where
 * 
 * k is the feature channel index (running from 0 to D-1) and
 * D is the number of feature channels, and alpha, beta and delta are paremeters.
 * [@code]
 * Defaults:
 * alpha = 1.0f
 * beta = 5.0f
 * delta = 1.0f
 * kernelHeight = kernelWidth = kernelSize
 * [@endcode]
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNCrossChannelNormalizationNode extends MPSCNNNormalizationNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNCrossChannelNormalizationNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNCrossChannelNormalizationNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNCrossChannelNormalizationNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNCrossChannelNormalizationNode init();

    @Generated
    @Selector("initWithSource:")
    public native MPSCNNCrossChannelNormalizationNode initWithSource(@NotNull MPSNNImageNode sourceNode);

    @Generated
    @Selector("initWithSource:kernelSize:")
    public native MPSCNNCrossChannelNormalizationNode initWithSourceKernelSize(@NotNull MPSNNImageNode sourceNode,
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
    @Selector("kernelSizeInFeatureChannels")
    @NUInt
    public native long kernelSizeInFeatureChannels();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNCrossChannelNormalizationNode new_objc();

    @Generated
    @Selector("nodeWithSource:")
    public static native MPSCNNCrossChannelNormalizationNode nodeWithSource(@NotNull MPSNNImageNode sourceNode);

    @Generated
    @Selector("nodeWithSource:kernelSize:")
    public static native MPSCNNCrossChannelNormalizationNode nodeWithSourceKernelSize(
            @NotNull MPSNNImageNode sourceNode, @NUInt long kernelSize);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setKernelSizeInFeatureChannels:")
    public native void setKernelSizeInFeatureChannels(@NUInt long value);

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
