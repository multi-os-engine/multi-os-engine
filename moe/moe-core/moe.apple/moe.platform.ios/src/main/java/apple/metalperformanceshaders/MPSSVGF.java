package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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

/**
 * Reduces noise in images rendered with Monte Carlo ray tracing methods
 * <p>
 * This filter uses temporal reprojection to accumulate samples over time, followed by
 * an edge-avoiding blur to smooth out the noise. It uses depth and surface normal textures to
 * detect edges in the image(s) to be denoised. The filter also computes an estimate of the
 * luminance variance of the accumulated samples for each pixel to reject neighboring pixels whose
 * luminance is too dissimilar while blurring.
 * <p>
 * This filter requires noise-free depth and normal textures, so it is not compatible with
 * stochastic visibility effects such as depth of field, motion blur, or pixel subsampling. These
 * effects need to be applied as a post-process instead. Furthermore, because the depth and normal
 * textures can only represent directly visible geometry, the filter may over-blur reflections.
 * The use of temporal reprojection may introduce artifacts such as ghosting or streaking, as well
 * as a temporal lag for changes in luminance such as moving shadows. However, the filter is
 * relatively fast as it is intended for realtime use. Slower but higher quality filters are
 * available in the literature.
 * <p>
 * This filter can process up to two images simultaneously assuming they share the same depth and
 * normal textures. This is typically faster than processing the two images independently because
 * memory bandwidth spent fetching depth and normal values and ALU time spent computing various
 * weighting functions can be shared by both images. This is useful if e.g. you want to denoise
 * direct and indirect lighting terms separately to avoid mixing the two terms. The filter is also
 * optimized for processing single-channel images for effects such as shadows and ambient
 * occlusion. Denoising these images can be much faster than denoising a full RGB image, so it may
 * be useful to separate out these terms and denoise them specifically.
 * <p>
 * This filter operates in three stages: temporal reprojection, variance estimation, and finally a
 * series of edge-avoiding bilateral blurs. The temporal reprojection stage accepts the image to
 * be denoised for the current frame and the denoised image from the previous frame, the depth and
 * normal textures from the current and previous frame and, finally, a motion vector texture. It
 * uses the motion vector texture to look up the accumulated samples from the previous frame. It
 * then compares the depth and normals to determine if those samples are consistent with the
 * current frame. If so, the previous frame is blended with the current frame. This stage also
 * accumulates the first and second moments of the sample luminance which is used to compute the
 * luminance variance in the next stage.
 * <p>
 * The variance estimation stage computes an estimate of the variance of the luminance of the
 * accumulated samples for each pixel. This stage may fall back to a spatial estimate if not enough
 * samples have been accumulated. The luminance variance is used in the final stage to reject
 * outlying neighboring pixels while blurring to avoid blurring across luminance discontinuities
 * such as shadow boundaries.
 * <p>
 * The final stage performs consecutive edge-avoiding bilateral blurs to smooth out noise in the
 * image. The blurs are dilated with increasing power of two step distances starting from 1,
 * which cheaply approximates a very large radius bilateral blur. Each iteration blurs both the
 * input image and the variance image as variance is reduced after each iteration. It is
 * recommended that the output of the first iteration be used as the input to the next frame's
 * reprojection stage to further reduce noise.
 * <p>
 * Tips:
 * <p>
 * - It may be helpful to further divide out texture details such as surface albedo before
 * denoising to avoid blurring texture detail and to preserve any careful texture filtering that
 * may have been performed. The albedo can be reapplied after denoising.
 * - High frequency geometry and normal maps may cause excessive disocclusions during reprojection
 * manifesting as noise.
 * - Jittering sample positions from frame to frame for temporal antialiasing may also cause
 * disocclusions. However, this can be partially hidden by the temporal antialiasing algorithm
 * itself.
 * - This kernel, like many convolutions, requires quite a bit of bandwidth. Use the texture pixel
 * formats with the smallest number of bits-per-pixel and the lowest resolution possible for the
 * required quality level. Lower resolution images can be combined with a bilateral upsampling
 * filter, especially if the image being denoised is mostly low frequency lighting or ambient
 * occlusion.
 * - The increasing dilation during the bilateral blurring stage can introduce ringing artifacts
 * around geometric discontinuities. These can be partially hidden at the cost of potentially
 * increased noise by reducing the bilateral blur's sigma value slightly after each iteration.
 * - Use lower precision pixel formats if possible to reduce memory bandwidth.
 * <p>
 * Refer to "Spatiotemporal Variance-Guided Filtering: Real-Time Reconstruction for Path-Traced
 * Global Illumination" for more information.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSSVGF extends MPSKernel implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSSVGF(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSSVGF alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSSVGF allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * The radius of the bilateral filter. Defaults to 2 resulting in a 5x5 filter.
     */
    @Generated
    @Selector("bilateralFilterRadius")
    @NUInt
    public native long bilateralFilterRadius();

    /**
     * The sigma value of the Gaussian function used by the bilateral filter. Must be greater
     * than zero. Defaults to 1.2.
     */
    @Generated
    @Selector("bilateralFilterSigma")
    public native float bilateralFilterSigma();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * The number of channels to filter in the source image. Must be at least one and at most
     * three. Defaults to 3.
     */
    @Generated
    @Selector("channelCount")
    @NUInt
    public native long channelCount();

    /**
     * The number of channels to filter in the second source image. Must be at least one and at
     * most three. Defaults to 3.
     */
    @Generated
    @Selector("channelCount2")
    @NUInt
    public native long channelCount2();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Owned
    @Selector("copyWithZone:device:")
    public native MPSSVGF copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * Controls how samples' depths are compared during reprojection, variance estimation, and
     * bilateral filtering. The final weight is given by exp(-abs(Z1 - Z2) / depthWeight). Must be
     * greater than zero. Defaults to 1.0.
     */
    @Generated
    @Selector("depthWeight")
    public native float depthWeight();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode bilateral filter into a command buffer
     * <p>
     * Performs an edge avoiding blur with radius given by the bilateraFilterRadius
     * property with sampling weighted by a Gaussian filter with sigma given by the bilteralFilterSigma
     * property. Normal and depth values from neighboring pixels will be compared with depth and normal
     * values of the center pixel to determine if they are similar enough to include in the blur. These
     * values are weighted by the depthWeight, normalWeight, and luminanceWeight properties.
     * <p>
     * Before the variance values are used for luminance weighting, the variance is prefiltered with a
     * small Gaussian blur with radius given by the variancePrefilterRadius property and sigma given by
     * the variancePrefilterSigma property.
     * <p>
     * This kernel should be run multiple times with a step distance of pow(2, i), starting with i = 0.
     * It is recommended that the output of the first iteration be used as the image to be reprojected
     * in the next frame. Then several more iterations should be run to compute the denoised image for
     * the current frame. 5 total iterations is reasonable.
     * <p>
     * The bilateral filter can operate on two sets of source and destination textures simultaneously
     * to share costs such as loading depth and normal values from memory, computing various weights,
     * etc. The second set of textures may be nil. The two images are assumed to share the same normal
     * and depth values.
     * <p>
     * The number of channels to filter in the source image(s) are given by the channelCount and
     * channelCount2 properties. Furthermore, the luminance variance is packed into the final channel
     * of the source image(s) to reduce the number of texture sample instructions required. The
     * filtered color and variance values are packed the same way in the destination image(s).
     * Therefore, the source and destination images must have at least channelCount + 1 and
     * channelCount2 + 1 channels. Channels beyond the required number are ignored when reading from
     * source images and set to zero when writing to destination images. The source image should be
     * produced by either the variance estimation kernel or a previous iteration of the bilateral
     * filter.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     *
     * @param commandBuffer      Command buffer to encode into
     * @param stepDistance       Number of pixels to skip between samples
     * @param sourceTexture      Source packed color and variance texture
     * @param destinationTexture Destination packed color and variance texture
     * @param depthNormalTexture The depth and normal values for the current frame
     */
    @Generated
    @Selector("encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:depthNormalTexture:")
    public native void encodeBilateralFilterToCommandBufferStepDistanceSourceTextureDestinationTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long stepDistance,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    /**
     * Encode bilateral filter into a command buffer
     * <p>
     * Performs an edge avoiding blur with radius given by the bilateraFilterRadius
     * property with sampling weighted by a Gaussian filter with sigma given by the bilteralFilterSigma
     * property. Normal and depth values from neighboring pixels will be compared with depth and normal
     * values of the center pixel to determine if they are similar enough to include in the blur. These
     * values are weighted by the depthWeight, normalWeight, and luminanceWeight properties.
     * <p>
     * Before the variance values are used for luminance weighting, the variance is prefiltered with a
     * small Gaussian blur with radius given by the variancePrefilterRadius property and sigma given by
     * the variancePrefilterSigma property.
     * <p>
     * This kernel should be run multiple times with a step distance of pow(2, i), starting with i = 0.
     * It is recommended that the output of the first iteration be used as the image to be reprojected
     * in the next frame. Then several more iterations should be run to compute the denoised image for
     * the current frame. 5 total iterations is reasonable.
     * <p>
     * The bilateral filter can operate on two sets of source and destination textures simultaneously
     * to share costs such as loading depth and normal values from memory, computing various weights,
     * etc. The second set of textures may be nil. The two images are assumed to share the same normal
     * and depth values.
     * <p>
     * The number of channels to filter in the source image(s) are given by the channelCount and
     * channelCount2 properties. Furthermore, the luminance variance is packed into the final channel
     * of the source image(s) to reduce the number of texture sample instructions required. The
     * filtered color and variance values are packed the same way in the destination image(s).
     * Therefore, the source and destination images must have at least channelCount + 1 and
     * channelCount2 + 1 channels. Channels beyond the required number are ignored when reading from
     * source images and set to zero when writing to destination images. The source image should be
     * produced by either the variance estimation kernel or a previous iteration of the bilateral
     * filter.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     *
     * @param commandBuffer       Command buffer to encode into
     * @param stepDistance        Number of pixels to skip between samples
     * @param sourceTexture       Source packed color and variance texture
     * @param destinationTexture  Destination packed color and variance texture
     * @param sourceTexture2      Second source image
     * @param destinationTexture2 Second destination image
     * @param depthNormalTexture  The depth and normal values for the current frame
     */
    @Generated
    @Selector("encodeBilateralFilterToCommandBuffer:stepDistance:sourceTexture:destinationTexture:sourceTexture2:destinationTexture2:depthNormalTexture:")
    public native void encodeBilateralFilterToCommandBufferStepDistanceSourceTextureDestinationTextureSourceTexture2DestinationTexture2DepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, @NUInt long stepDistance,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    /**
     * Encode reprojection into a command buffer
     * <p>
     * Normal and depth values from the previous frame will be compared with normal and
     * depth values from the current frame to determine if they are similar enough to reproject into
     * the current frame. These values are weighted by the depthWeight and normalWeight properties.
     * If the combined weight exceeds the reprojectionThreshold property's value, the previous frame
     * will be blended with the current frame according to the temporalWeighting and
     * temporalReprojectionBlendFactor properties.
     * <p>
     * The reprojection kernel can operate on two sets of source and destination textures
     * simultaneously to share costs such as loading depth and normal values from memory, computing
     * various weights, etc. The second set of textures may be nil. The two images are assumed to share
     * the same depth and normal values.
     * <p>
     * The number of channels in the source image(s), previous frame's image(s), and destination
     * image(s) are given by the channelCount and channelCount2 properties. These images must have at
     * least as many channels as given by these properties. Channels beyond the required number are
     * ignored when reading from source images and set to zero when writing to the destination images,
     * except the alpha channel which will be set to one if present. The previous frame's image will
     * be ignored on the first frame.
     * <p>
     * The source and destination luminance moments textures must be at least two-channel textures,
     * which will be set to the accumulated first and second moments of luminance. Channels beyond the
     * first two will be ignored when reading from the previous frame's texture and set to zero when
     * writing to the destination texture. The previous frame's luminance moments will be ignored on
     * the first frame.
     * <p>
     * The frame count textures track the number of accumulated frames and must be at least R32Uint
     * textures. The remaining channels will be ignored when reading from the source texture and set to
     * zero when writing to the destination texture, if present. The previous frame count texture must
     * be cleared to zero on the first frame or to reset the accumulated images to the current frame's
     * image.
     * <p>
     * The motion vector texture must be at least a two channel texture representing how many texels
     * each texel in the source image(s) have moved since the previous frame. The remaining channels
     * will be ignored if present. This texture may be nil, in which case the motion vector is assumed
     * to be zero, which is suitable for static images.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     * The depth and normal values are not required if the motion vector texture is nil.
     * <p>
     * The destination texture, destination luminance moments texture, and destination frame count
     * texture are used by subsequent stages of the denoising filter. The destination frame count
     * texture is also used as the source frame count texture the reprojection kernel in the next
     * frame.
     *
     * @param commandBuffer                      Command buffer to encode into
     * @param sourceTexture                      Current frame to denoise
     * @param previousTexture                    Previous denoised frame to reproject into current
     *                                           frame
     * @param destinationTexture                 Output blended image
     * @param previousLuminanceMomentsTexture    Previous accumulated luminance moments image
     * @param destinationLuminanceMomentsTexture Output accumulated luminance moments image
     * @param previousFrameCountTexture          The number of frames accumulated in the previous
     *                                           source image
     * @param destinationFrameCountTexture       The number of frames accumulated in the destination
     *                                           texture(s) including the current frame
     * @param motionVectorTexture                Motion vector texture
     * @param depthNormalTexture                 The depth and normal values for the current frame
     * @param previousDepthNormalTexture         The depth and normal values for the previous frame
     */
    @Generated
    @Selector("encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojectionToCommandBufferSourceTexturePreviousTextureDestinationTexturePreviousLuminanceMomentsTextureDestinationLuminanceMomentsTexturePreviousFrameCountTextureDestinationFrameCountTextureMotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    /**
     * Encode reprojection into a command buffer
     * <p>
     * Normal and depth values from the previous frame will be compared with normal and
     * depth values from the current frame to determine if they are similar enough to reproject into
     * the current frame. These values are weighted by the depthWeight and normalWeight properties.
     * If the combined weight exceeds the reprojectionThreshold property's value, the previous frame
     * will be blended with the current frame according to the temporalWeighting and
     * temporalReprojectionBlendFactor properties.
     * <p>
     * The reprojection kernel can operate on two sets of source and destination textures
     * simultaneously to share costs such as loading depth and normal values from memory, computing
     * various weights, etc. The second set of textures may be nil. The two images are assumed to share
     * the same depth and normal values.
     * <p>
     * The number of channels in the source image(s), previous frame's image(s), and destination
     * image(s) are given by the channelCount and channelCount2 properties. These images must have at
     * least as many channels as given by these properties. Channels beyond the required number are
     * ignored when reading from source images and set to zero when writing to the destination images,
     * except the alpha channel which will be set to one if present. The previous frame's image will
     * be ignored on the first frame.
     * <p>
     * The source and destination luminance moments textures must be at least two-channel textures,
     * which will be set to the accumulated first and second moments of luminance. Channels beyond the
     * first two will be ignored when reading from the previous frame's texture and set to zero when
     * writing to the destination texture. The previous frame's luminance moments will be ignored on
     * the first frame.
     * <p>
     * The frame count textures track the number of accumulated frames and must be at least R32Uint
     * textures. The remaining channels will be ignored when reading from the source texture and set to
     * zero when writing to the destination texture, if present. The previous frame count texture must
     * be cleared to zero on the first frame or to reset the accumulated images to the current frame's
     * image.
     * <p>
     * The motion vector texture must be at least a two channel texture representing how many texels
     * each texel in the source image(s) have moved since the previous frame. The remaining channels
     * will be ignored if present. This texture may be nil, in which case the motion vector is assumed
     * to be zero, which is suitable for static images.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     * The depth and normal values are not required if the motion vector texture is nil.
     * <p>
     * The destination texture, destination luminance moments texture, and destination frame count
     * texture are used by subsequent stages of the denoising filter. The destination frame count
     * texture is also used as the source frame count texture the reprojection kernel in the next
     * frame.
     *
     * @param commandBuffer                       Command buffer to encode into
     * @param sourceTexture                       Current frame to denoise
     * @param previousTexture                     Previous denoised frame to reproject into current
     *                                            frame
     * @param destinationTexture                  Output blended image
     * @param previousLuminanceMomentsTexture     Previous accumulated luminance moments image
     * @param destinationLuminanceMomentsTexture  Output accumulated luminance moments image
     * @param sourceTexture2                      Second source image
     * @param previousTexture2                    Second previous image
     * @param destinationTexture2                 Second destination image
     * @param previousLuminanceMomentsTexture2    Second previous luminance moments texture
     * @param destinationLuminanceMomentsTexture2 Second destination luminance moments texture
     * @param previousFrameCountTexture           The number of frames accumulated in the previous
     *                                            source image
     * @param destinationFrameCountTexture        The number of frames accumulated in the destination
     *                                            texture(s) including the current frame
     * @param motionVectorTexture                 Motion vector texture
     * @param depthNormalTexture                  The depth and normal values for the current frame
     * @param previousDepthNormalTexture          The depth and normal values for the previous frame
     */
    @Generated
    @Selector("encodeReprojectionToCommandBuffer:sourceTexture:previousTexture:destinationTexture:previousLuminanceMomentsTexture:destinationLuminanceMomentsTexture:sourceTexture2:previousTexture2:destinationTexture2:previousLuminanceMomentsTexture2:destinationLuminanceMomentsTexture2:previousFrameCountTexture:destinationFrameCountTexture:motionVectorTexture:depthNormalTexture:previousDepthNormalTexture:")
    public native void encodeReprojectionToCommandBufferSourceTexturePreviousTextureDestinationTexturePreviousLuminanceMomentsTextureDestinationLuminanceMomentsTextureSourceTexture2PreviousTexture2DestinationTexture2PreviousLuminanceMomentsTexture2DestinationLuminanceMomentsTexture2PreviousFrameCountTextureDestinationFrameCountTextureMotionVectorTextureDepthNormalTexturePreviousDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousLuminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationLuminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationFrameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture motionVectorTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture previousDepthNormalTexture);

    /**
     * Encode variance estimation into a command buffer
     * <p>
     * Variance is computed from the accumulated first and second luminance moments. If the
     * number of accumulated frames is below the minimumFramesForVarianceEstimation property, the
     * luminance variance will be computed using a spatial estimate instead. The spatial estimate is
     * computed using a bilateral filter with radius given by the varianceEstimationRadius property.
     * Neighboring samples will be weighted according to a gaussian function with sigma given by the
     * varianceEstimationSigma property. Normal and depth values from neighboring pixels will be
     * compared with depth and normal values of the center pixel to determine if they are similar
     * enough to include in the spatial blur. These values are weighted by the depthWeight and
     * normalWeight properties.
     * <p>
     * The variance kernel can operate on two sets of source and destination textures
     * simultaneously to share costs such as loading depth and normal values from memory, computing
     * various weights, etc. The second set of textures may be nil. The two images are assumed to share
     * the same depth and normal values.
     * <p>
     * The reprojected source texture, luminance moments texture and frame count texture are computed
     * by the reprojection kernel.
     * <p>
     * The computed variance will be stored in the last channel of the destination image, while the
     * source image will be copied into the previous channels, to reduce the number of texture sample
     * instructured required by the bilateral filter in the final stage of the denoising kernel. The
     * number of channels in the source image(s) are given by the channelCount and channelCount2
     * properties. Therefore, the destination image(s) must have at least channelCount + 1 and
     * channelCount2 + 1 channels and the source image(s) must have at least channelCount and
     * channelCount2 channels. Channels beyond the required number are ignored when reading from
     * source textures and set to zero when writing to destination textures.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     * If the minimumFramesForVarianceEstimation property is less than or equal to one, variance will
     * be estimated directly from the accumulated luminance moments so the depth/normal texture may be
     * nil.
     *
     * @param commandBuffer           Command buffer to encode into
     * @param sourceTexture           Current reprojected frame to denoise
     * @param luminanceMomentsTexture Luminance moments texture
     * @param destinationTexture      Output packed color and variance image
     * @param frameCountTexture       Number of frames accumulated into the source image
     * @param depthNormalTexture      The depth and normal values for the current frame
     */
    @Generated
    @Selector("encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimationToCommandBufferSourceTextureLuminanceMomentsTextureDestinationTextureFrameCountTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture frameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    /**
     * Encode variance estimation into a command buffer
     * <p>
     * Variance is computed from the accumulated first and second luminance moments. If the
     * number of accumulated frames is below the minimumFramesForVarianceEstimation property, the
     * luminance variance will be computed using a spatial estimate instead. The spatial estimate is
     * computed using a bilateral filter with radius given by the varianceEstimationRadius property.
     * Neighboring samples will be weighted according to a gaussian function with sigma given by the
     * varianceEstimationSigma property. Normal and depth values from neighboring pixels will be
     * compared with depth and normal values of the center pixel to determine if they are similar
     * enough to include in the spatial blur. These values are weighted by the depthWeight and
     * normalWeight properties.
     * <p>
     * The variance kernel can operate on two sets of source and destination textures
     * simultaneously to share costs such as loading depth and normal values from memory, computing
     * various weights, etc. The second set of textures may be nil. The two images are assumed to share
     * the same depth and normal values.
     * <p>
     * The reprojected source texture, luminance moments texture and frame count texture are computed
     * by the reprojection kernel.
     * <p>
     * The computed variance will be stored in the last channel of the destination image, while the
     * source image will be copied into the previous channels, to reduce the number of texture sample
     * instructured required by the bilateral filter in the final stage of the denoising kernel. The
     * number of channels in the source image(s) are given by the channelCount and channelCount2
     * properties. Therefore, the destination image(s) must have at least channelCount + 1 and
     * channelCount2 + 1 channels and the source image(s) must have at least channelCount and
     * channelCount2 channels. Channels beyond the required number are ignored when reading from
     * source textures and set to zero when writing to destination textures.
     * <p>
     * The depth/normal texture must contain the depth and normal values for directly visible geometry
     * for the current frame for each pixel. These values are packed into a four channel texture to
     * reduce the number of texture sampling instructions required to load them. The first channel must
     * store the depth value from zero to infinity. The normals must be stored in the last three
     * channels as the three signed X, Y, and z components each between negative one and one.
     * If the minimumFramesForVarianceEstimation property is less than or equal to one, variance will
     * be estimated directly from the accumulated luminance moments so the depth/normal texture may be
     * nil.
     *
     * @param commandBuffer            Command buffer to encode into
     * @param sourceTexture            Current reprojected frame to denoise
     * @param luminanceMomentsTexture  Luminance moments texture
     * @param destinationTexture       Output packed color and variance image
     * @param sourceTexture2           Second source image
     * @param luminanceMomentsTexture2 Second luminance moments image
     * @param destinationTexture2      Second destination image
     * @param frameCountTexture        Number of frames accumulated into the source image
     * @param depthNormalTexture       The depth and normal values for the current frame
     */
    @Generated
    @Selector("encodeVarianceEstimationToCommandBuffer:sourceTexture:luminanceMomentsTexture:destinationTexture:sourceTexture2:luminanceMomentsTexture2:destinationTexture2:frameCountTexture:depthNormalTexture:")
    public native void encodeVarianceEstimationToCommandBufferSourceTextureLuminanceMomentsTextureDestinationTextureSourceTexture2LuminanceMomentsTexture2DestinationTexture2FrameCountTextureDepthNormalTexture(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture sourceTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture luminanceMomentsTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture destinationTexture2,
            @Mapped(ObjCObjectMapper.class) MTLTexture frameCountTexture,
            @Mapped(ObjCObjectMapper.class) MTLTexture depthNormalTexture);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSSVGF init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSSVGF initWithCoder(NSCoder coder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSSVGF initWithCoderDevice(NSCoder aDecoder, @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSSVGF initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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

    /**
     * Controls how samples' luminance values are compared during bilateral filtering. The final
     * weight is given by exp(-abs(L1 - L2) / (luminanceWeight * luminanceVariance + EPSILON)). Must be
     * greater than or equal to zero. Defaults to 4.
     */
    @Generated
    @Selector("luminanceWeight")
    public native float luminanceWeight();

    /**
     * The minimum number of frames which must be accumulated before variance can be computed
     * directly from the accumulated luminance moments. If enough frames have not been accumulated,
     * variance will be estimated with a spatial filter instead. Defaults to 4.
     */
    @Generated
    @Selector("minimumFramesForVarianceEstimation")
    @NUInt
    public native long minimumFramesForVarianceEstimation();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSSVGF new_objc();

    /**
     * Controls how samples' normals are compared during reprojection, variance estimation, and
     * bilateral filtering. The final weight is given by pow(max(dot(N1, N2)), normalWeight). Must be
     * greater than or equal to zero. Defaults to 128.
     */
    @Generated
    @Selector("normalWeight")
    public native float normalWeight();

    /**
     * During reprojection, minimum combined depth and normal weight needed to consider a pixel
     * from the previous frame consistent with a pixel from the current frame. Must be greater than or
     * equal to zero. Defaults to 0.01.
     */
    @Generated
    @Selector("reprojectionThreshold")
    public native float reprojectionThreshold();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The radius of the bilateral filter. Defaults to 2 resulting in a 5x5 filter.
     */
    @Generated
    @Selector("setBilateralFilterRadius:")
    public native void setBilateralFilterRadius(@NUInt long value);

    /**
     * The sigma value of the Gaussian function used by the bilateral filter. Must be greater
     * than zero. Defaults to 1.2.
     */
    @Generated
    @Selector("setBilateralFilterSigma:")
    public native void setBilateralFilterSigma(float value);

    /**
     * The number of channels to filter in the second source image. Must be at least one and at
     * most three. Defaults to 3.
     */
    @Generated
    @Selector("setChannelCount2:")
    public native void setChannelCount2(@NUInt long value);

    /**
     * The number of channels to filter in the source image. Must be at least one and at most
     * three. Defaults to 3.
     */
    @Generated
    @Selector("setChannelCount:")
    public native void setChannelCount(@NUInt long value);

    /**
     * Controls how samples' depths are compared during reprojection, variance estimation, and
     * bilateral filtering. The final weight is given by exp(-abs(Z1 - Z2) / depthWeight). Must be
     * greater than zero. Defaults to 1.0.
     */
    @Generated
    @Selector("setDepthWeight:")
    public native void setDepthWeight(float value);

    /**
     * Controls how samples' luminance values are compared during bilateral filtering. The final
     * weight is given by exp(-abs(L1 - L2) / (luminanceWeight * luminanceVariance + EPSILON)). Must be
     * greater than or equal to zero. Defaults to 4.
     */
    @Generated
    @Selector("setLuminanceWeight:")
    public native void setLuminanceWeight(float value);

    /**
     * The minimum number of frames which must be accumulated before variance can be computed
     * directly from the accumulated luminance moments. If enough frames have not been accumulated,
     * variance will be estimated with a spatial filter instead. Defaults to 4.
     */
    @Generated
    @Selector("setMinimumFramesForVarianceEstimation:")
    public native void setMinimumFramesForVarianceEstimation(@NUInt long value);

    /**
     * Controls how samples' normals are compared during reprojection, variance estimation, and
     * bilateral filtering. The final weight is given by pow(max(dot(N1, N2)), normalWeight). Must be
     * greater than or equal to zero. Defaults to 128.
     */
    @Generated
    @Selector("setNormalWeight:")
    public native void setNormalWeight(float value);

    /**
     * During reprojection, minimum combined depth and normal weight needed to consider a pixel
     * from the previous frame consistent with a pixel from the current frame. Must be greater than or
     * equal to zero. Defaults to 0.01.
     */
    @Generated
    @Selector("setReprojectionThreshold:")
    public native void setReprojectionThreshold(float value);

    /**
     * When using MPSTemporalWeightingExponentialMovingAverage, how much to blend
     * the current frame with the previous frame during reprojection. The final value is given by
     * current * temporalReprojectionBlendFactor + previous * (1 - temporalReprojectionBlendFactor).
     * Must be between zero and one, inclusive. Defaults to 0.2.
     */
    @Generated
    @Selector("setTemporalReprojectionBlendFactor:")
    public native void setTemporalReprojectionBlendFactor(float value);

    /**
     * How to weight samples during temporal reprojection. Defaults to
     * MPSTemporalWeightingAverage.
     */
    @Generated
    @Selector("setTemporalWeighting:")
    public native void setTemporalWeighting(@NUInt long value);

    /**
     * The radius of the spatial filter used when not enough frames have been accumulated to
     * compute variance from accumulated luminance moments. Defaults to 3 resulting in a 7x7 filter.
     */
    @Generated
    @Selector("setVarianceEstimationRadius:")
    public native void setVarianceEstimationRadius(@NUInt long value);

    /**
     * The sigma value of the Gaussian function used by the spatial filter used when not enough
     * frames have been accumulated to compute variance from accumulated luminance moments. Must be
     * greater than zero. Defaults to 2.0.
     */
    @Generated
    @Selector("setVarianceEstimationSigma:")
    public native void setVarianceEstimationSigma(float value);

    /**
     * The radius of the variance pre-filter of the bilateral filter. Defaults to 1 resulting in
     * a 3x3 filter.
     */
    @Generated
    @Selector("setVariancePrefilterRadius:")
    public native void setVariancePrefilterRadius(@NUInt long value);

    /**
     * The sigma value of the Gaussian function used by the variance pre-filter of the
     * bilateral filter. Must be greater than zero. Defaults to 1.33.
     */
    @Generated
    @Selector("setVariancePrefilterSigma:")
    public native void setVariancePrefilterSigma(float value);

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

    /**
     * When using MPSTemporalWeightingExponentialMovingAverage, how much to blend
     * the current frame with the previous frame during reprojection. The final value is given by
     * current * temporalReprojectionBlendFactor + previous * (1 - temporalReprojectionBlendFactor).
     * Must be between zero and one, inclusive. Defaults to 0.2.
     */
    @Generated
    @Selector("temporalReprojectionBlendFactor")
    public native float temporalReprojectionBlendFactor();

    /**
     * How to weight samples during temporal reprojection. Defaults to
     * MPSTemporalWeightingAverage.
     */
    @Generated
    @Selector("temporalWeighting")
    @NUInt
    public native long temporalWeighting();

    /**
     * The radius of the spatial filter used when not enough frames have been accumulated to
     * compute variance from accumulated luminance moments. Defaults to 3 resulting in a 7x7 filter.
     */
    @Generated
    @Selector("varianceEstimationRadius")
    @NUInt
    public native long varianceEstimationRadius();

    /**
     * The sigma value of the Gaussian function used by the spatial filter used when not enough
     * frames have been accumulated to compute variance from accumulated luminance moments. Must be
     * greater than zero. Defaults to 2.0.
     */
    @Generated
    @Selector("varianceEstimationSigma")
    public native float varianceEstimationSigma();

    /**
     * The radius of the variance pre-filter of the bilateral filter. Defaults to 1 resulting in
     * a 3x3 filter.
     */
    @Generated
    @Selector("variancePrefilterRadius")
    @NUInt
    public native long variancePrefilterRadius();

    /**
     * The sigma value of the Gaussian function used by the variance pre-filter of the
     * bilateral filter. Must be greater than zero. Defaults to 1.33.
     */
    @Generated
    @Selector("variancePrefilterSigma")
    public native float variancePrefilterSigma();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
