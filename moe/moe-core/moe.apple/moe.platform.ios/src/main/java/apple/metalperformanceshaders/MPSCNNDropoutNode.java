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

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNDropoutNode allocWithZone(VoidPtr zone);

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
    public native MPSCNNDropoutNode initWithSource(MPSNNImageNode source);

    @Generated
    @Selector("initWithSource:keepProbability:")
    public native MPSCNNDropoutNode initWithSourceKeepProbability(MPSNNImageNode source, float keepProbability);

    @Generated
    @Selector("initWithSource:keepProbability:seed:maskStrideInPixels:")
    public native MPSCNNDropoutNode initWithSourceKeepProbabilitySeedMaskStrideInPixels(MPSNNImageNode source,
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

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
    public static native MPSCNNDropoutNode nodeWithSource(MPSNNImageNode source);

    @Generated
    @Selector("nodeWithSource:keepProbability:")
    public static native MPSCNNDropoutNode nodeWithSourceKeepProbability(MPSNNImageNode source, float keepProbability);

    @Generated
    @Selector("nodeWithSource:keepProbability:seed:maskStrideInPixels:")
    public static native MPSCNNDropoutNode nodeWithSourceKeepProbabilitySeedMaskStrideInPixels(MPSNNImageNode source,
            float keepProbability, @NUInt long seed, @ByValue MTLSize maskStrideInPixels);

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
