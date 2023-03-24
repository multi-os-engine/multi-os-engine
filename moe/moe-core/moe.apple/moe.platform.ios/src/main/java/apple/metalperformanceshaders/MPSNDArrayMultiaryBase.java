package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSNDArrayAllocator;
import apple.metalperformanceshaders.struct.MPSNDArrayOffsets;
import apple.metalperformanceshaders.struct.MPSNDArraySizes;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
public class MPSNDArrayMultiaryBase extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNDArrayMultiaryBase(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNDArrayMultiaryBase alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNDArrayMultiaryBase allocWithZone(VoidPtr zone);

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

    /**
     * Create a copy with
     * 
     * @param zone   The NSZone in which to allocate the MPSNDArrayMultiaryKernel object
     * @param device The device on which the new kernel will run. Pass nil for same device.
     * @return A valid MPSNDArrayMultiaryKernel, or nil if allocation failure.
     */
    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSNDArrayMultiaryBase copyWithZoneDevice(@Nullable VoidPtr zone,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @NotNull
    @Generated
    @Selector("destinationArrayAllocator")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSNDArrayAllocator destinationArrayAllocator();

    /**
     * Return a descriptor suitable for allocating a NSArray to receive the result
     * 
     * The object properties (kernelSize, offsets, edgeMode, etc.) should be properly
     * configured as if the -encode call was about to be made, before this method is
     * called. Those properties may affect the results.
     * 
     * @param sources The list of sources passed into the -encode call
     * @param state   The source state object, if any passed to the -encode call
     * @return a valid MPSNDArrayDescriptor that may be used to create a MPSNDArray to used to
     *         hold the results of this kernel.
     */
    @NotNull
    @Generated
    @Selector("destinationArrayDescriptorForSourceArrays:sourceState:")
    public native MPSNDArrayDescriptor destinationArrayDescriptorForSourceArraysSourceState(
            @NotNull NSArray<? extends MPSNDArray> sources, @Nullable MPSState state);

    /**
     * Get the kernel dilation rate for each dimension
     * 
     * @param sourceIndex The index of the source image for which this applies
     * @return The kernel dilation rate for each dimension.
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("dilationRatesForSourceIndex:")
    @ByValue
    public native MPSNDArraySizes dilationRatesForSourceIndex(@NUInt long sourceIndex);

    /**
     * The edge mode used for each source NDArray
     * 
     * @param sourceIndex The index of the source image
     * @return The MPSImageEdgeMode for that image
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("edgeModeAtSourceIndex:")
    @NUInt
    public native long edgeModeAtSourceIndex(@NUInt long sourceIndex);

    /**
     * Initialize a MPSNDArrayMultiaryKernel from a NSCoder
     * 
     * @param coder The NSCoder that contains the serialized object
     */
    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNDArrayMultiaryBase init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNDArrayMultiaryBase initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * Initialize a MPSNDArrayMultiaryKernel from a NSCoder
     * 
     * @param coder  The NSCoder that contains the serialized object
     * @param device The device on which the kernel will run
     * @return A valid MPSNDArrayMultiaryKernel, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNDArrayMultiaryBase initWithCoderDevice(@NotNull NSCoder coder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNDArrayMultiaryBase initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a MPSNDArrayMultiaryKernel
     * 
     * @param device The device on which the kernel will run
     * @param count  The maximum number of NDArrays read by the kernel
     * @return A valid MPSNDArrayMultiaryKernel, or nil if allocation failure.
     */
    @Generated
    @Selector("initWithDevice:sourceCount:")
    public native MPSNDArrayMultiaryBase initWithDeviceSourceCount(
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
     * Get the diameters of the point spread function (PSF) in each dimension
     * 
     * @param sourceIndex The MPSNDArrayMultiaryKernel source NDArray to which the kernel will be applied
     * @return A list of kernel diameters in each dimension
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("kernelSizesForSourceIndex:")
    @ByValue
    public native MPSNDArraySizes kernelSizesForSourceIndex(@NUInt long sourceIndex);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNDArrayMultiaryBase new_objc();

    /**
     * Read offsets to use when addressing a source NDArray
     * 
     * The coordinate of the position read from this source array which is
     * used to calculate the result value at [0,0,0,....]
     * If the position read is actually a contiguous region (e.g. the area covered by
     * a convolution kernel) then this is the center of that region, rounded down, for
     * each dimension.
     * 
     * @param sourceIndex The index of the source MPSNDArray to which the list of offsets is applied
     * 
     *                    API-Since: 13.0
     *                    Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("offsetsAtSourceIndex:")
    @ByValue
    public native MPSNDArrayOffsets offsetsAtSourceIndex(@NUInt long sourceIndex);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("resultStateForSourceArrays:sourceStates:destinationArray:")
    public native MPSState resultStateForSourceArraysSourceStatesDestinationArray(
            @NotNull NSArray<? extends MPSNDArray> sourceArrays, @Nullable NSArray<? extends MPSState> sourceStates,
            @NotNull MPSNDArray destinationArray);

    /**
     * Method to allocate the result image for -encodeToCommandBuffer:sourceImage:
     * 
     * Default: MPSTemporaryImage.defaultAllocator
     */
    @Generated
    @Selector("setDestinationArrayAllocator:")
    public native void setDestinationArrayAllocator(@NotNull @Mapped(ObjCObjectMapper.class) MPSNDArrayAllocator value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Return the downsampling ratio for the kernel in each dimension
     * 
     * If the filter is a "backwards" filter such as a gradient filter
     * or convolution transpose, then this is the upsampling ratio and
     * zeros are inserted in the result.
     * 
     * @param sourceIndex The index of the source for which the strides apply
     * @return The strides from one destination sample to the next in each
     *         dimension of the corresponding source NDArray
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("stridesForSourceIndex:")
    @ByValue
    public native MPSNDArrayOffsets stridesForSourceIndex(@NUInt long sourceIndex);

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
