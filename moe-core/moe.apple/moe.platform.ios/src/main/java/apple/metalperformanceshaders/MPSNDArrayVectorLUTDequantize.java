package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNDArrayVectorLUTDequantize
 * 
 * [@dependency] This depends on Metal.framework.
 * 
 * A kernel which dequantizes a lookup-table based NDArray with vector LUT support.
 * 
 * The kernel works with 2 inputs: 1) The quantized input, 2) The LookUp table array.
 * 
 * 
 * API-Since: 18.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayVectorLUTDequantize extends MPSNDArrayMultiaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayVectorLUTDequantize(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayVectorLUTDequantize alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MPSNDArrayVectorLUTDequantize allocWithZone(VoidPtr zone);

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
    public native MPSNDArrayVectorLUTDequantize init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayVectorLUTDequantize initWithCoder(@NotNull NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayVectorLUTDequantize initWithCoderDevice(@NotNull NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) @NotNull Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayVectorLUTDequantize initWithDevice(@Mapped(ObjCObjectMapper.class) @NotNull Object device);

    /**
     * Initializes a kernel for vector-based LUT dequantization.
     * 
     * @param device The Metal device to be used with this kernel.
     * @param axis   The vector axis in the output.
     * @return A new vector LUT dequantization kernel.
     * 
     * 
     *         API-Since: 18.0
     */
    @Generated
    @Selector("initWithDevice:axis:")
    public native MPSNDArrayVectorLUTDequantize initWithDeviceAxis(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device, @NUInt long axis);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayVectorLUTDequantize initWithDeviceSourceCount(
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
    public static native MPSNDArrayVectorLUTDequantize new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] vectorAxis
     * 
     * Which axis in the destination will receive the vector component, must be less than 4.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("setVectorAxis:")
    public native void setVectorAxis(@NUInt long value);

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

    /**
     * [@property] vectorAxis
     * 
     * Which axis in the destination will receive the vector component, must be less than 4.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("vectorAxis")
    @NUInt
    public native long vectorAxis();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}