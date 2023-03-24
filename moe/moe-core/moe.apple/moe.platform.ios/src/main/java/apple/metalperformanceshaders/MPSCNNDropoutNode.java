package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
public class MPSCNNDropoutNode extends MPSNNFilterNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNDropoutNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNDropoutNode alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNDropoutNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNDropoutNode init();

    @Generated
    @Selector("initWithSource:")
    public native MPSCNNDropoutNode initWithSource(@NotNull MPSNNImageNode source);

    @Generated
    @Selector("initWithSource:keepProbability:")
    public native MPSCNNDropoutNode initWithSourceKeepProbability(@NotNull MPSNNImageNode source,
            float keepProbability);

    @Generated
    @Selector("initWithSource:keepProbability:seed:maskStrideInPixels:")
    public native MPSCNNDropoutNode initWithSourceKeepProbabilitySeedMaskStrideInPixels(@NotNull MPSNNImageNode source,
            float keepProbability, @NUInt long seed, @ByValue MTLSize maskStrideInPixels);

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
    @Selector("keepProbability")
    public native float keepProbability();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("maskStrideInPixels")
    @ByValue
    public native MTLSize maskStrideInPixels();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNDropoutNode new_objc();

    @Generated
    @Selector("nodeWithSource:")
    public static native MPSCNNDropoutNode nodeWithSource(@NotNull MPSNNImageNode source);

    @Generated
    @Selector("nodeWithSource:keepProbability:")
    public static native MPSCNNDropoutNode nodeWithSourceKeepProbability(@NotNull MPSNNImageNode source,
            float keepProbability);

    @Generated
    @Selector("nodeWithSource:keepProbability:seed:maskStrideInPixels:")
    public static native MPSCNNDropoutNode nodeWithSourceKeepProbabilitySeedMaskStrideInPixels(
            @NotNull MPSNNImageNode source, float keepProbability, @NUInt long seed,
            @ByValue MTLSize maskStrideInPixels);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("seed")
    @NUInt
    public native long seed();

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
