package apple.metalfx.protocol;

import apple.metal.protocol.MTLFence;
import apple.metal.protocol.MTLTexture;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An upscaling effect that generates a higher resolution texture in a render pass by analyzing multiple input
 * textures over time.
 * 
 * The MetalFX temporal scaler increases the size of your input texture to a larger output texture. You can use the
 * scaler to upscale every frame of your app’s scene or rendering in real time. With a scaler, you can draw more
 * complicated scenes in less time by intentionally rendering to a lower resolution to save time before upscaling.
 * 
 * Create an ``MTLFXTemporalScaler`` instance by following these steps:
 * 1. Create and configure an ``MTLFXTemporalScalerDescriptor`` instance.
 * 2. Call the descriptor’s ``newTemporalScalerWithDevice:`` method.
 * 
 * Upscale a rendering by following these steps for every render pass:
 * 1. Set the temporal scaler’s ``colorTexture`` property to the input texture.
 * 2. Set the scaler’s ``inputContentWidth`` and ``inputContentHeight`` properties.
 * 3. Set the scaler’s ``outputTexture`` property to your destination texture.
 * 4. Encode the upscale commands to a command buffer by calling the temporal scaler’s
 * ``MTLFXTemporalScaler/encodeToCommandBuffer:`` method.
 * 
 * ## Conforming to texture usage requirements
 * 
 * Temporal scalers expose properties, such as ``colorTextureUsage``, that indicate requirements for
 * your textures to be compatible with it. These properties indicate the minimum set of ``MTLTextureUsage`` bits
 * that you are responsible for setting in your texture descriptors for this spatial scaler to use them.
 * 
 * Your game or app can set extra usage bits on your textures without losing compatibility, as long at its maintains
 * the minimum set the scaler requests.
 * 
 * ## Assigning input and output textures
 * 
 * When you use an instance of a class that conforms to this protocol, you typically set its input and output textures,
 * as well as other properties, and then encode its work to a command buffer.
 * 
 * MetalFX doesn't track that you assign the same texture instances to each property across different batches of work,
 * the only requirement is that you provide textures that match the pixel formats and dimensions you specify in the
 * ``MTLFXTemporalScalerDescriptor`` descriptor instance that creates the scaler instance.
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXTemporalScalerBase")
public interface MTLFXTemporalScalerBase extends MTLFXFrameInterpolatableScaler {
    /**
     * An input color texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("colorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture colorTexture();

    /**
     * The pixel format of the input color texture for this this scaler.
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    long colorTextureFormat();

    /**
     * The minimal texture usage options that your app’s input color texture needs in order to support this scaler.
     */
    @Generated
    @Selector("colorTextureUsage")
    @NUInt
    long colorTextureUsage();

    /**
     * An input depth texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("depthTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture depthTexture();

    /**
     * The pixel format of the input depth texture for this this scaler.
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    long depthTextureFormat();

    /**
     * The minimal texture usage options that your app’s input depth texture needs in order to support this scaler.
     */
    @Generated
    @Selector("depthTextureUsage")
    @NUInt
    long depthTextureUsage();

    /**
     * The exposure texture this scaler uses.
     * 
     * Create and assign a 1x1 ``MTLPixelFormatR16Float`` texture to assign to this property. MetalFX reads the R
     * channel
     * of the texel at position `(0,0)` and uses it as the exposure value. It then uses this value to multiply the input
     * color.
     * 
     * For best performance, use the GPU to generate the exposure value and store it into this texture.
     * 
     * * Note: The temporal scaler ignores this property if you create it with a descriptor that has its
     * ``MTLFXTemporalScalerDescriptor/autoExposureEnabled`` property set to
     * <doc://com.apple.documentation/documentation/swift/true>.
     */
    @Generated
    @Selector("exposureTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture exposureTexture();

    /**
     * An optional fence that you provide to synchronize your app’s untracked resources.
     */
    @Generated
    @Selector("fence")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLFence fence();

    /**
     * The height, in pixels, of the region within the color texture the scaler uses as its input.
     */
    @Generated
    @Selector("inputContentHeight")
    @NUInt
    long inputContentHeight();

    /**
     * The largest scale factor the temporal scaler can use to generate output textures.
     */
    @Generated
    @Selector("inputContentMaxScale")
    float inputContentMaxScale();

    /**
     * The smallest scale factor the temporal scaler can use to generate output textures.
     */
    @Generated
    @Selector("inputContentMinScale")
    float inputContentMinScale();

    /**
     * The width, in pixels, of the region within the color texture the scaler uses as its input.
     */
    @Generated
    @Selector("inputContentWidth")
    @NUInt
    long inputContentWidth();

    /**
     * The height, in pixels, of the input color texture for this scaler.
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    long inputHeight();

    /**
     * The width, in pixels, of the input color texture for this scaler.
     */
    @Generated
    @Selector("inputWidth")
    @NUInt
    long inputWidth();

    /**
     * A Boolean value that indicates whether the depth texture uses zero to represent the farthest distance.
     */
    @Generated
    @Selector("isDepthReversed")
    boolean isDepthReversed();

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this scaler samples to return to the frame's reference frame.
     */
    @Generated
    @Selector("jitterOffsetX")
    float jitterOffsetX();

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this scaler samples to return to the frame's reference frame.
     */
    @Generated
    @Selector("jitterOffsetY")
    float jitterOffsetY();

    /**
     * An input motion texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("motionTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture motionTexture();

    /**
     * The pixel format of the input motion texture for this this scaler.
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    long motionTextureFormat();

    /**
     * The minimal texture usage options that your app’s motion texture needs in order to support this scaler.
     */
    @Generated
    @Selector("motionTextureUsage")
    @NUInt
    long motionTextureUsage();

    /**
     * The horizontal scale factor the scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this temporal scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     */
    @Generated
    @Selector("motionVectorScaleX")
    float motionVectorScaleX();

    /**
     * The vertical scale factor the scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this temporal scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     */
    @Generated
    @Selector("motionVectorScaleY")
    float motionVectorScaleY();

    /**
     * The height, in pixels, of the output color texture for this scaler.
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    long outputHeight();

    /**
     * The output texture into which this scaler writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     */
    @Generated
    @Selector("outputTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture outputTexture();

    /**
     * The pixel format of the output color texture for this this scaler.
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    long outputTextureFormat();

    /**
     * The minimal texture usage options that your output texture needs in order to support this scaler.
     */
    @Generated
    @Selector("outputTextureUsage")
    @NUInt
    long outputTextureUsage();

    /**
     * The width, in pixels, of the output color texture for this scaler.
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    long outputWidth();

    /**
     * A pre-exposure value this scaler evaluates.
     * 
     * If the input color texture you assign to ``colorTexture`` is pre-multiplied by fixed value, set this property
     * to that same fixed value so MetalFX divides input color by it. This is not a common situation and you typically
     * don't need to assign a value to this property.
     */
    @Generated
    @Selector("preExposure")
    float preExposure();

    /**
     * The reactive-mask texture input this scaler uses.
     * 
     * This texture helps guide the denoiser when objects move quickly in a scene with inaccurate motion information,
     * such as when they involve alpha blending. In these situations, you can get better results by guiding MetalFX
     * whether
     * to favor the current frame on a per-pixel basis with a reactive mask texture.
     * 
     * When providing this texture, you are responsible for ensuring each pixel is in the range `[0.0, 1.0]`, where a
     * value:
     * * Equal to `0.0` tells MetalFX to follow its normal behavior for the corresponding pixel
     * * Equal to `1.0` tells MetalFX to ignore temporal history for the corresponding pixel
     * * In the range `(0.0, 1.0)` proportionally blends the effect for the corresponding pixel
     */
    @Generated
    @Selector("reactiveMaskTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture reactiveMaskTexture();

    /**
     * The pixel format of the input reactive mask texture for this this scaler.
     */
    @Generated
    @Selector("reactiveMaskTextureFormat")
    @NUInt
    long reactiveMaskTextureFormat();

    /**
     * The minimal texture usage options that your app’s reactive texture needs in order to support this scaler.
     */
    @Generated
    @Selector("reactiveTextureUsage")
    @NUInt
    long reactiveTextureUsage();

    /**
     * A Boolean that indicates whether the temporal scaler discards historical data from previous frames.
     */
    @Generated
    @Selector("reset")
    boolean reset();

    /**
     * An input color texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean value that indicates whether the depth texture uses zero to represent the farthest distance.
     */
    @Generated
    @Selector("setDepthReversed:")
    void setDepthReversed(boolean value);

    /**
     * An input depth texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("setDepthTexture:")
    void setDepthTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The exposure texture this scaler uses.
     * 
     * Create and assign a 1x1 ``MTLPixelFormatR16Float`` texture to assign to this property. MetalFX reads the R
     * channel
     * of the texel at position `(0,0)` and uses it as the exposure value. It then uses this value to multiply the input
     * color.
     * 
     * For best performance, use the GPU to generate the exposure value and store it into this texture.
     * 
     * * Note: The temporal scaler ignores this property if you create it with a descriptor that has its
     * ``MTLFXTemporalScalerDescriptor/autoExposureEnabled`` property set to
     * <doc://com.apple.documentation/documentation/swift/true>.
     */
    @Generated
    @Selector("setExposureTexture:")
    void setExposureTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * An optional fence that you provide to synchronize your app’s untracked resources.
     */
    @Generated
    @Selector("setFence:")
    void setFence(@Mapped(ObjCObjectMapper.class) @Nullable MTLFence value);

    /**
     * The height, in pixels, of the region within the color texture the scaler uses as its input.
     */
    @Generated
    @Selector("setInputContentHeight:")
    void setInputContentHeight(@NUInt long value);

    /**
     * The width, in pixels, of the region within the color texture the scaler uses as its input.
     */
    @Generated
    @Selector("setInputContentWidth:")
    void setInputContentWidth(@NUInt long value);

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this scaler samples to return to the frame's reference frame.
     */
    @Generated
    @Selector("setJitterOffsetX:")
    void setJitterOffsetX(float value);

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this scaler samples to return to the frame's reference frame.
     */
    @Generated
    @Selector("setJitterOffsetY:")
    void setJitterOffsetY(float value);

    /**
     * An input motion texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("setMotionTexture:")
    void setMotionTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The horizontal scale factor the scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this temporal scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     */
    @Generated
    @Selector("setMotionVectorScaleX:")
    void setMotionVectorScaleX(float value);

    /**
     * The vertical scale factor the scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this temporal scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     */
    @Generated
    @Selector("setMotionVectorScaleY:")
    void setMotionVectorScaleY(float value);

    /**
     * The output texture into which this scaler writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A pre-exposure value this scaler evaluates.
     * 
     * If the input color texture you assign to ``colorTexture`` is pre-multiplied by fixed value, set this property
     * to that same fixed value so MetalFX divides input color by it. This is not a common situation and you typically
     * don't need to assign a value to this property.
     */
    @Generated
    @Selector("setPreExposure:")
    void setPreExposure(float value);

    /**
     * The reactive-mask texture input this scaler uses.
     * 
     * This texture helps guide the denoiser when objects move quickly in a scene with inaccurate motion information,
     * such as when they involve alpha blending. In these situations, you can get better results by guiding MetalFX
     * whether
     * to favor the current frame on a per-pixel basis with a reactive mask texture.
     * 
     * When providing this texture, you are responsible for ensuring each pixel is in the range `[0.0, 1.0]`, where a
     * value:
     * * Equal to `0.0` tells MetalFX to follow its normal behavior for the corresponding pixel
     * * Equal to `1.0` tells MetalFX to ignore temporal history for the corresponding pixel
     * * In the range `(0.0, 1.0)` proportionally blends the effect for the corresponding pixel
     */
    @Generated
    @Selector("setReactiveMaskTexture:")
    void setReactiveMaskTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean that indicates whether the temporal scaler discards historical data from previous frames.
     */
    @Generated
    @Selector("setReset:")
    void setReset(boolean value);
}