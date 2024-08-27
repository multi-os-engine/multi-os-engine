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
 * MPSImageEDLines
 * 
 * The MPSImageEDLInes class implements the EDLines line segmenting algorithm using edge-drawing (ED)
 * described here
 * https://ieeexplore.ieee.org/document/6116138
 * 
 * The EDLInes algorithm consists of 5 steps, the first 4 of which describe the ED algorithm:
 * 1. Blur the source image using a Gaussian blur with a sigma parameter
 * 2. Use horizontal and vertical Sobel filters to find a gradient magnitude and
 * direction.
 * G = sqrt(Sx^2 + Sy^2)
 * G_ang = arctan(Sy / Sx)
 * 3. Compute anchor points, points with a high probability of being edge pixels.
 * Anchor points are local maxima, in the gradient image that lie on row and column
 * multiples of the detailRatio. This parameter effectively downsamples the gradient
 * image, and directly influences the density of anchor points. A larger detailRatio results
 * in fewer fine grained details, leaving long, main lines.
 * 4. Anchor points are traced in a forward and backward direction along the gradient direction, until
 * the gradient falls below some gradientThreshold parameter or the edge of the image is reached.
 * The paths traced become an edge map of the image.
 * 5. Points in the edges are fit to a line), and extended along the edge until the line error crosses a
 * lineErrorThreshold. Lines which are beyond a minimum length are labelled line segments and
 * will be outputs of the algorithm.
 * 
 * API-Since: 13.4
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageEDLines extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageEDLines(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageEDLines alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageEDLines allocWithZone(VoidPtr zone);

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
     * [@property] detailRatio
     * 
     * Read-write value used to set the detailRatio to use in the EDLines algorithm
     * Default is 32
     */
    @Generated
    @Selector("detailRatio")
    public native char detailRatio();

    /**
     * Encode the filter to a command buffer using a MTLComputeCommandEncoder.
     * 
     * The filter will not begin to execute until after the command
     * buffer has been enqueued and committed.
     * 
     * @param commandBuffer  A valid MTLCommandBuffer.
     * @param source         A valid MTLTexture containing the source image for the filter
     * @param dest           A valid MTLTexture containing the destination image for the filter. If not nil, the output
     *                       will be the edges
     *                       found through the Edge Drawing algorithm.
     * @param endpointBuffer A valid MTLBuffer to receive the line segment count and endpoint results.
     * @param endpointOffset Byte offset into endpoint buffer at which to write the line segment endpoint results. Must
     *                       be a multiple of 32 bytes.
     *                       The total line segment count and the line segment endpoints are written to the endpoint
     *                       buffer. The count
     *                       is written as a uint32_t at the start of the buffer. The line segments are written to the
     *                       endpoint buffer as
     *                       start and end pixel coordinates of the segment. Coordinates are stored as unsigned short
     *                       pairs, and a
     *                       single line segment will consist of two pairs, or four total unsigned shorts. The endpoint
     *                       buffer size must
     *                       be >= 4 * maxLines * sizeof(unsigned short) + sizeof(uint32_t).
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceTexture:destinationTexture:endpointBuffer:endpointOffset:")
    public native void encodeToCommandBufferSourceTextureDestinationTextureEndpointBufferEndpointOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLTexture source,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLTexture dest,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer endpointBuffer, @NUInt long endpointOffset);

    /**
     * [@property] sigma
     * 
     * Read-only sigma value used in performing Gaussian blur of the image.
     * Default is 2.0
     */
    @Generated
    @Selector("gaussianSigma")
    public native float gaussianSigma();

    /**
     * [@property] gradientThreshold
     * 
     * Read-write value used to set the threshold for a pixel to be considered an edge
     * Default is 0.2
     */
    @Generated
    @Selector("gradientThreshold")
    public native float gradientThreshold();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSImageEDLines init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageEDLines initWithCoder(@NotNull NSCoder aDecoder);

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
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSImageEDLines initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSImageEDLines initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize an EDLines kernel on a given device with specified parameters.
     * [@code]
     * w(i) = 1/sqrt(2*pi*sigma) * exp(-i^2/(2*sigma^2))
     * [@endcode]
     * If we take cut off at 1% of w(0) (max weight) beyond which weights
     * are considered 0, we have
     * [@code]
     * ceil (sqrt(-log(0.01)*2)*sigma) ~ ceil(3.7*sigma)
     * [@endcode]
     * as rough estimate of filter width
     * 
     * @param device                 The device the filter will run on
     * @param gaussianSigma          The standard deviation of gaussian blur filter.
     *                               Gaussian weight, centered at 0, at integer grid i is given as
     * @param minLineLength          The minimum length of output line segments.
     * @param maxLines               The maximum amount of lines for the EDLines algorithm to output. The size of the
     *                               endpointBuffer supplied at encode must be >= maxLines * 4 * sizeof(unsigned short)
     *                               + sizeof(uint32_t).
     * @param detailRatio            The detailRatio to use in the EDLines algorithm, which
     *                               inversely effects the number of anchor points
     * @param gradientThreshold      Any pixel with a gradient below the gradientThreshold will
     *                               not be considerd an edge
     * @param lineErrorThreshold     The limit of how much error a line segment can have relative
     *                               to the edge it represents
     * @param mergeLocalityThreshold Determines how many pixels apart two lines can deviate spatially and still be
     *                               merged.
     *                               This value is normalized to the diagonal length of the image.
     * @return A valid object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:gaussianSigma:minLineLength:maxLines:detailRatio:gradientThreshold:lineErrorThreshold:mergeLocalityThreshold:")
    public native MPSImageEDLines initWithDeviceGaussianSigmaMinLineLengthMaxLinesDetailRatioGradientThresholdLineErrorThresholdMergeLocalityThreshold(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, float gaussianSigma, char minLineLength,
            @NUInt long maxLines, char detailRatio, float gradientThreshold, float lineErrorThreshold,
            float mergeLocalityThreshold);

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

    /**
     * [@property] lineErrorThreshold
     * 
     * Read-write value used to set the limit on error for a line segment relative to the edge it fits
     * Default is 0.05
     */
    @Generated
    @Selector("lineErrorThreshold")
    public native float lineErrorThreshold();

    /**
     * [@property] maxLines
     * 
     * Read-write value used to set the max number of line segments to be written out.
     * The endpointBuffer at encode must be >= maxLines * 4 * sizeof(unsigned short) + sizeof(uint32_t).
     * Default is 256
     */
    @Generated
    @Selector("maxLines")
    @NUInt
    public native long maxLines();

    /**
     * [@property] mergeLocalityThreshold
     * 
     * Read-write value used to set how many pixels apart two lines can deviate spatially and still be merged.
     * Default is 0.0025
     */
    @Generated
    @Selector("mergeLocalityThreshold")
    public native float mergeLocalityThreshold();

    /**
     * [@property] minLineLength
     * 
     * Read-write value used to set the minimum length of a line segment.
     * Default is 32
     */
    @Generated
    @Selector("minLineLength")
    public native char minLineLength();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSImageEDLines new_objc();

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

    /**
     * [@property] detailRatio
     * 
     * Read-write value used to set the detailRatio to use in the EDLines algorithm
     * Default is 32
     */
    @Generated
    @Selector("setDetailRatio:")
    public native void setDetailRatio(char value);

    /**
     * [@property] gradientThreshold
     * 
     * Read-write value used to set the threshold for a pixel to be considered an edge
     * Default is 0.2
     */
    @Generated
    @Selector("setGradientThreshold:")
    public native void setGradientThreshold(float value);

    /**
     * [@property] lineErrorThreshold
     * 
     * Read-write value used to set the limit on error for a line segment relative to the edge it fits
     * Default is 0.05
     */
    @Generated
    @Selector("setLineErrorThreshold:")
    public native void setLineErrorThreshold(float value);

    /**
     * [@property] maxLines
     * 
     * Read-write value used to set the max number of line segments to be written out.
     * The endpointBuffer at encode must be >= maxLines * 4 * sizeof(unsigned short) + sizeof(uint32_t).
     * Default is 256
     */
    @Generated
    @Selector("setMaxLines:")
    public native void setMaxLines(@NUInt long value);

    /**
     * [@property] mergeLocalityThreshold
     * 
     * Read-write value used to set how many pixels apart two lines can deviate spatially and still be merged.
     * Default is 0.0025
     */
    @Generated
    @Selector("setMergeLocalityThreshold:")
    public native void setMergeLocalityThreshold(float value);

    /**
     * [@property] minLineLength
     * 
     * Read-write value used to set the minimum length of a line segment.
     * Default is 32
     */
    @Generated
    @Selector("setMinLineLength:")
    public native void setMinLineLength(char value);

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
