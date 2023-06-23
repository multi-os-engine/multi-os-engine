package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLBuffer;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.metal.struct.MTLRegion;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSImageNormalizedHistogram
 * 
 * The MPSImageNormalizedHistogram computes the normalized histogram of an image.
 * The minimum and maximum pixel values for a given region of an image are first computed.
 * The max(computed minimum pixel value, MPSImageHistogramInfo.minPixelValue) and the
 * min(computed maximum pixel value, MPSImageHistogramInfo.maxPixelValue) are used to
 * compute the normalized histogram.
 * 
 * API-Since: 9.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageNormalizedHistogram extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageNormalizedHistogram(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageNormalizedHistogram alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageNormalizedHistogram allocWithZone(VoidPtr zone);

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
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("clipRectSource")
    @ByValue
    public native MTLRegion clipRectSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode the filter to a command buffer using a MTLComputeCommandEncoder.
     * 
     * The filter will not begin to execute until after the command
     * buffer has been enqueued and committed.
     * 
     * @param commandBuffer   A valid MTLCommandBuffer.
     * @param source          A valid MTLTexture containing the source image for the filter
     * @param minmaxTexture   A valid MTLTexture in which the min/max pixel values from source will be returned
     * @param histogram       A valid MTLBuffer to receive the histogram results.
     * @param histogramOffset Byte offset into histogram buffer at which to write the histogram results. Must be a
     *                        multiple of 32 bytes.
     *                        The histogram results / channel are stored together. The number of channels for which
     *                        histogram results are stored is determined by the number of channels in the image.
     *                        If histogramInfo.histogramForAlpha is false and the source image is RGBA then only
     *                        histogram
     *                        results for RGB channels are stored.
     * 
     *                        The histogram results are stored in the histogram buffer as follows:
     *                        - histogram results for the R channel for all bins followed by
     *                        - histogram results for the G channel for all bins followed by
     *                        - histogram results for the B channel for all bins followed by
     *                        - histogram results for the A channel for all bins
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:minmaxTexture:histogram:histogramOffset:")
    public native void encodeToCommandBufferSourceTextureMinmaxTextureHistogramHistogramOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture source,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture minmaxTexture,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer histogram, @NUInt long histogramOffset);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The amount of space in the output MTLBuffer the histogram will take up.
     * 
     * This convenience function calculates the minimum amount of space
     * needed in the output histogram for the results. The MTLBuffer should
     * be at least this length, longer if histogramOffset is non-zero.
     * 
     * @param sourceFormat The MTLPixelFormat of the source image. This is
     *                     the source parameter of -encodeToCommandBuffer:
     *                     sourceTexture:histogram:histogramOffset
     * @return The number of bytes needed to store the result histograms.
     */
    @Generated
    @Selector("histogramSizeForSourceFormat:")
    @NUInt
    public native long histogramSizeForSourceFormat(@NUInt long sourceFormat);

    @Generated
    @Selector("init")
    public native MPSImageNormalizedHistogram init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageNormalizedHistogram initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageNormalizedHistogram initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageNormalizedHistogram initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to compute the histogram for channels of an image.
     * 
     * @param device        The device the filter will run on
     * @param histogramInfo Pointer to the MPSImageHistogramInfo struct
     * @return A valid MPSImageNormalizedHistogram object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:histogramInfo:")
    public native MPSImageNormalizedHistogram initWithDeviceHistogramInfo(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NotNull VoidPtr histogramInfo);

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
    public static native MPSImageNormalizedHistogram new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     */
    @Generated
    @Selector("setClipRectSource:")
    public native void setClipRectSource(@ByValue MTLRegion value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] zeroHistogram
     * 
     * Zero-initalize the histogram results
     * 
     * Indicates that the memory region in which the histogram results are to be written in the
     * histogram buffer are to be zero-initialized or not. Default: YES.
     */
    @Generated
    @Selector("setZeroHistogram:")
    public native void setZeroHistogram(boolean value);

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

    /**
     * [@property] zeroHistogram
     * 
     * Zero-initalize the histogram results
     * 
     * Indicates that the memory region in which the histogram results are to be written in the
     * histogram buffer are to be zero-initialized or not. Default: YES.
     */
    @Generated
    @Selector("zeroHistogram")
    public native boolean zeroHistogram();
}
