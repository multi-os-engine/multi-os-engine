package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLComputeCommandEncoder;
import apple.metal.protocol.MTLDevice;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNDArrayIdentityKernel
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * An efficient kernel to handle copies, transposed-copies and reshapes.
 * 
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayIdentity extends MPSNDArrayUnaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayIdentity(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayIdentity alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSNDArrayIdentity allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
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
    public native MPSNDArrayIdentity init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayIdentity initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayIdentity initWithCoderDevice(@NotNull NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) @NotNull Object device);

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayIdentity initWithDevice(@Mapped(ObjCObjectMapper.class) @NotNull Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayIdentity initWithDeviceSourceCount(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device, @NUInt long count);

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNDArrayIdentity new_objc();

    /**
     * Variant with MPS dimension-ordering
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("reshapeWithCommandBuffer:sourceArray:dimensionCount:dimensionSizes:destinationArray:")
    @Nullable
    public native MPSNDArray reshapeWithCommandBufferSourceArrayDimensionCountDimensionSizesDestinationArray(
            @Mapped(ObjCObjectMapper.class) @Nullable MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray,
            @NUInt long numberOfDimensions, @NotNull NUIntPtr dimensionSizes, @Nullable MPSNDArray destinationArray);

    /**
     * Variant with MPS dimension-ordering
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("reshapeWithCommandEncoder:commandBuffer:sourceArray:dimensionCount:dimensionSizes:destinationArray:")
    @Nullable
    public native MPSNDArray reshapeWithCommandEncoderCommandBufferSourceArrayDimensionCountDimensionSizesDestinationArray(
            @Mapped(ObjCObjectMapper.class) @Nullable MTLComputeCommandEncoder encoder,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray,
            @NUInt long numberOfDimensions, @NotNull NUIntPtr dimensionSizes, @Nullable MPSNDArray destinationArray);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}