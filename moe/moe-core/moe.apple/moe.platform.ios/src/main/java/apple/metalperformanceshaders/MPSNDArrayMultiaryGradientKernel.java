package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayMultiaryGradientKernel extends MPSNDArrayMultiaryBase {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayMultiaryGradientKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayMultiaryGradientKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayMultiaryGradientKernel allocWithZone(VoidPtr zone);

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

    /**
     * Gradient encode methods
     * Inference encode calls.
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:sourceGradient:gradientState:")
    public native MPSNDArray encodeToCommandBufferSourceArraysSourceGradientGradientState(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            @NotNull NSArray<? extends MPSNDArray> sources, @NotNull MPSNDArray gradient, @NotNull MPSState state);

    @Generated
    @Selector("encodeToCommandBuffer:sourceArrays:sourceGradient:gradientState:destinationArray:")
    public native void encodeToCommandBufferSourceArraysSourceGradientGradientStateDestinationArray(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            @NotNull NSArray<? extends MPSNDArray> sources, @NotNull MPSNDArray gradient, @NotNull MPSState state,
            @NotNull MPSNDArray destination);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayMultiaryGradientKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayMultiaryGradientKernel initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayMultiaryGradientKernel initWithCoderDevice(@NotNull NSCoder coder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayMultiaryGradientKernel initWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayMultiaryGradientKernel initWithDeviceSourceCount(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count);

    /**
     * Initialize a MPSNDArrayMultiaryKernel
     * 
     * @param device              The device on which the kernel will run
     * @param count               The maximum number of NDArrays read by the kernel
     * @param sourceGradientIndex The source index for which gradient will be calculated
     * @return A valid MPSNDArrayMultiaryKernel, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithDevice:sourceCount:sourceGradientIndex:")
    public native MPSNDArrayMultiaryGradientKernel initWithDeviceSourceCountSourceGradientIndex(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count,
            @NUInt long sourceGradientIndex);

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
    public static native MPSNDArrayMultiaryGradientKernel new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
