package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLSize;
import apple.metalperformanceshaders.protocol.MPSImageTransformProvider;
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

/**
 * A MPSNNScale object that uses the Lanczos resampling filter
 * <p>
 * This method does not require a low pass filter for downsampling
 * by more than a factor of two. Caution: may cause ringing, which
 * could prove distracting to a neural network unused to seeing it.
 * You should use the resampling method that was used to train the
 * network.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNLanczosScaleNode extends MPSNNScaleNode {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNLanczosScaleNode(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNLanczosScaleNode alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNLanczosScaleNode allocWithZone(VoidPtr zone);

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
    public native MPSNNLanczosScaleNode init();

    @Generated
    @Selector("initWithSource:outputSize:")
    public native MPSNNLanczosScaleNode initWithSourceOutputSize(MPSNNImageNode sourceNode, @ByValue MTLSize size);

    @Generated
    @Selector("initWithSource:transformProvider:outputSize:")
    public native MPSNNLanczosScaleNode initWithSourceTransformProviderOutputSize(MPSNNImageNode sourceNode,
            @Mapped(ObjCObjectMapper.class) MPSImageTransformProvider transformProvider, @ByValue MTLSize size);

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
    @Owned
    @Selector("new")
    public static native MPSNNLanczosScaleNode new_objc();

    @Generated
    @Selector("nodeWithSource:outputSize:")
    public static native MPSNNLanczosScaleNode nodeWithSourceOutputSize(MPSNNImageNode sourceNode,
            @ByValue MTLSize size);

    @Generated
    @Selector("nodeWithSource:transformProvider:outputSize:")
    public static native MPSNNLanczosScaleNode nodeWithSourceTransformProviderOutputSize(MPSNNImageNode sourceNode,
            @Mapped(ObjCObjectMapper.class) MPSImageTransformProvider transformProvider, @ByValue MTLSize size);

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
