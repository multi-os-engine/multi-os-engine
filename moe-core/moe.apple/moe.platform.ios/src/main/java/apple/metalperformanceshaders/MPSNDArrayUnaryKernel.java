package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.struct.MPSNDArrayOffsets;
import apple.metalperformanceshaders.struct.MPSNDArraySizes;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
public class MPSNDArrayUnaryKernel extends MPSNDArrayMultiaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayUnaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayUnaryKernel alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayUnaryKernel allocWithZone(VoidPtr zone);

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
     * [@property] dilationRate
     * 
     * The stride in each dimension from one PSF tap to an adjacent
     * PSF tap. Default: 1
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("dilationRates")
    @ByValue
    public native MPSNDArraySizes dilationRates();

    /**
     * [@property] edgeMode
     * 
     * The edge mode used for a source NDArray
     * Default: MPSImageEdgeModeZero
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("edgeMode")
    @NUInt
    public native long edgeMode();

    /**
     * Inference encode calls
     * 
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     * 
     * @param cmdBuf      The command buffer into which to encode the kernel
     * @param sourceArray The source for the filter in an NSArray.
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     *         when the command buffer completes successfully.
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:")
    public native MPSNDArray encodeToCommandBufferSourceArray(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     * 
     * @param cmdBuf      The command buffer into which to encode the kernel
     * @param sourceArray The source for the filter in an NSArray.
     * @param destination The NDArray to receive the result
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:destinationArray:")
    public native void encodeToCommandBufferSourceArrayDestinationArray(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray,
            @NotNull MPSNDArray destination);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     * 
     * @param cmdBuf           The command buffer into which to encode the kernel
     * @param sourceArray      The source for the filter in an NSArray.
     * @param outGradientState The output gradient state to record the operation for later use by gradient
     * @param destination      A destination array to contain the result of the calculation
     *                         when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:resultState:destinationArray:")
    public native void encodeToCommandBufferSourceArrayResultStateDestinationArray(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray,
            @Nullable MPSState outGradientState, @NotNull MPSNDArray destination);

    /**
     * Forward training encode calls
     * 
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     * 
     * @param cmdBuf                 The command buffer into which to encode the kernel
     * @param sourceArray            The source for the filter in an NSArray.
     * @param outGradientState       If non-nil, the address output gradient state is written to this address
     * @param outputStateIsTemporary If YES, the state if any will be allocated to contain temporary textures and
     *                               buffers as needed
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     *         when the command buffer completes successfully.
     */
    @NotNull
    @Generated
    @Selector("encodeToCommandBuffer:sourceArray:resultState:outputStateIsTemporary:")
    public native MPSNDArray encodeToCommandBufferSourceArrayResultStateOutputStateIsTemporary(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, @NotNull MPSNDArray sourceArray,
            @Nullable @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outGradientState,
            boolean outputStateIsTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayUnaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayUnaryKernel initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayUnaryKernel initWithCoderDevice(@NotNull NSCoder coder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayUnaryKernel initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayUnaryKernel initWithDeviceSourceCount(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long count);

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

    /**
     * [@property] kernelSizes
     * 
     * The diameters of the point spread function in each dimension for a source NDArray
     * Default: 1
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("kernelSizes")
    @ByValue
    public native MPSNDArraySizes kernelSizes();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNDArrayUnaryKernel new_objc();

    /**
     * [@property] offsets
     * 
     * The coordinate of the position read from this source array which is
     * used to calculate the result value at [0,0,0,....]
     * If the position read is actually a contiguous region (e.g. the area covered by
     * a convolution kernel) then this is the center of that region, rounded down, for
     * each dimension.
     * Default: 0,0,0...
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("offsets")
    @ByValue
    public native MPSNDArrayOffsets offsets();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] kernelStrides
     * 
     * If the filter is a "backwards" filter such as a gradient filter
     * or convolution transpose, then this is the upsampling ratio and
     * zeros are inserted in the result.
     * Default: 1
     * 
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("strides")
    @ByValue
    public native MPSNDArrayOffsets strides();

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
