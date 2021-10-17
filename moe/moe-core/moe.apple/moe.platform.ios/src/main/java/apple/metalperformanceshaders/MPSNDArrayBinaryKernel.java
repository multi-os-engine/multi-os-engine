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

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNDArrayBinaryKernel extends MPSNDArrayMultiaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayBinaryKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayBinaryKernel alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayBinaryKernel allocWithZone(VoidPtr zone);

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

    /**
     * Inference encode calls
     * <p>
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf               The command buffer into which to encode the kernel
     * @param primarySourceArray   The primary source for the filter in an NSArray.
     * @param secondarySourceArray The secondary source for the filter in an NSArray.
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     * when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:primarySourceArray:secondarySourceArray:")
    public native MPSNDArray encodeToCommandBufferPrimarySourceArraySecondarySourceArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray,
            MPSNDArray secondarySourceArray);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf               The command buffer into which to encode the kernel
     * @param primarySourceArray   The primary source for the filter in an NSArray.
     * @param secondarySourceArray The secondary source for the filter in an NSArray.
     * @param destination          The NDArray to receive the result
     */
    @Generated
    @Selector("encodeToCommandBuffer:primarySourceArray:secondarySourceArray:destinationArray:")
    public native void encodeToCommandBufferPrimarySourceArraySecondarySourceArrayDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray,
            MPSNDArray secondarySourceArray, MPSNDArray destination);

    /**
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf               The command buffer into which to encode the kernel
     * @param primarySourceArray   The primary source for the filter in an NSArray.
     * @param secondarySourceArray The secondary source for the filter in an NSArray.
     * @param outGradientState     The output gradient state to record the operation for later use by gradient
     * @param destination          A destination array to contain the result of the calculation
     *                             when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:primarySourceArray:secondarySourceArray:resultState:destinationArray:")
    public native void encodeToCommandBufferPrimarySourceArraySecondarySourceArrayResultStateDestinationArray(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray,
            MPSNDArray secondarySourceArray, MPSState outGradientState, MPSNDArray destination);

    /**
     * Forward training encode calls
     * <p>
     * Encode a simple inference NDArray kernel and return a NDArray to hold the result
     *
     * @param cmdBuf                 The command buffer into which to encode the kernel
     * @param primarySourceArray     The primary source for the filter in an NSArray.
     * @param secondarySourceArray   The secondary source for the filter in an NSArray.
     * @param outGradientState       If non-nil, the address output gradient state is written to this address
     * @param outputStateIsTemporary If YES, the state if any will be allocated to contain temporary textures and buffers as needed
     * @return A newly allocated MPSNDArray that will contain the result of the calculation
     * when the command buffer completes successfully.
     */
    @Generated
    @Selector("encodeToCommandBuffer:primarySourceArray:secondarySourceArray:resultState:outputStateIsTemporary:")
    public native MPSNDArray encodeToCommandBufferPrimarySourceArraySecondarySourceArrayResultStateOutputStateIsTemporary(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf, MPSNDArray primarySourceArray,
            MPSNDArray secondarySourceArray, @ReferenceInfo(type = MPSState.class) Ptr<MPSState> outGradientState,
            boolean outputStateIsTemporary);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayBinaryKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayBinaryKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding support
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayBinaryKernel initWithCoderDevice(NSCoder coder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayBinaryKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayBinaryKernel initWithDeviceSourceCount(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @NUInt long count);

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
    public static native MPSNDArrayBinaryKernel new_objc();

    /**
     * [@property]  primaryDilationRate
     * <p>
     * The stride in each dimension from one PSF tap to an adjacent
     * PSF tap. Default: 1
     */
    @Generated
    @Selector("primaryDilationRates")
    @ByValue
    public native MPSNDArraySizes primaryDilationRates();

    /**
     * [@property]  primaryEdgeMode
     * <p>
     * The edge mode used for a source NDArray
     * Default: MPSImageEdgeModeZero
     */
    @Generated
    @Selector("primaryEdgeMode")
    @NUInt
    public native long primaryEdgeMode();

    /**
     * [@property]  primaryKernelSizes
     * <p>
     * The diameters of the point spread function in each dimension for a source NDArray
     * Default: 1
     */
    @Generated
    @Selector("primaryKernelSizes")
    @ByValue
    public native MPSNDArraySizes primaryKernelSizes();

    /**
     * [@property]  primaryOffsets
     * <p>
     * The coordinate of the position read from this source array which is
     * used to calculate the result value at [0,0,0,....]
     * If the position read is actually a contiguous region (e.g. the area covered by
     * a convolution kernel) then this is the center of that region, rounded down, for
     * each dimension.
     * Default: 0,0,0...
     */
    @Generated
    @Selector("primaryOffsets")
    @ByValue
    public native MPSNDArrayOffsets primaryOffsets();

    /**
     * [@property]  primaryStrides
     * <p>
     * If the filter is a "backwards" filter such as a gradient filter
     * or convolution transpose, then this is the upsampling ratio and
     * zeros are inserted in the result.
     * Default: 1
     */
    @Generated
    @Selector("primaryStrides")
    @ByValue
    public native MPSNDArrayOffsets primaryStrides();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]  secondaryDilationRate
     * <p>
     * The stride in each dimension from one PSF tap to an adjacent
     * PSF tap. Default: 1
     */
    @Generated
    @Selector("secondaryDilationRates")
    @ByValue
    public native MPSNDArraySizes secondaryDilationRates();

    /**
     * [@property]  secondaryEdgeMode
     * <p>
     * The edge mode used for a source NDArray
     * Default: MPSImageEdgeModeZero
     */
    @Generated
    @Selector("secondaryEdgeMode")
    @NUInt
    public native long secondaryEdgeMode();

    /**
     * [@property]  secondaryKernelSizes
     * <p>
     * The diameters of the point spread function in each dimension for a source NDArray
     * Default: 1
     */
    @Generated
    @Selector("secondaryKernelSizes")
    @ByValue
    public native MPSNDArraySizes secondaryKernelSizes();

    /**
     * [@property]  secondaryOffsets
     * <p>
     * The coordinate of the position read from this source array which is
     * used to calculate the result value at [0,0,0,....]
     * If the position read is actually a contiguous region (e.g. the area covered by
     * a convolution kernel) then this is the center of that region, rounded down, for
     * each dimension.
     * Default: 0,0,0...
     */
    @Generated
    @Selector("secondaryOffsets")
    @ByValue
    public native MPSNDArrayOffsets secondaryOffsets();

    /**
     * [@property]  secondaryStrides
     * <p>
     * If the filter is a "backwards" filter such as a gradient filter
     * or convolution transpose, then this is the upsampling ratio and
     * zeros are inserted in the result.
     * Default: 1
     */
    @Generated
    @Selector("secondaryStrides")
    @ByValue
    public native MPSNDArrayOffsets secondaryStrides();

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
}
