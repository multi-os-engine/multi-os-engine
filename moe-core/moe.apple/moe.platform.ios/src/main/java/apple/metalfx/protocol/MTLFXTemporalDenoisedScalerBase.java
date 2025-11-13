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
 * API-Since: 26.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXTemporalDenoisedScalerBase")
public interface MTLFXTemporalDenoisedScalerBase extends MTLFXFrameInterpolatableScaler {
    /**
     * Assigns the color texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``colorTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture colorTexture();

    /**
     * The pixel format of the input color texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    long colorTextureFormat();

    /**
     * The minimal texture usage options that your app’s input color texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTextureUsage")
    @NUInt
    long colorTextureUsage();

    /**
     * The denoise strength mask texture this scaler evaluates.
     * 
     * Use this single-channel texture to mark, at a per-pixel level, areas that this denoiser ignores. To configure a
     * pixel
     * that the denoiser ignores, provide `1.0` as the value at that pixel's corresponding location on this texture.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``denoiseStrengthMaskTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/denoiseStrengthMaskTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("denoiseStrengthMaskTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture denoiseStrengthMaskTexture();

    /**
     * The pixel format of the input denoise strength mask texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("denoiseStrengthMaskTextureFormat")
    @NUInt
    long denoiseStrengthMaskTextureFormat();

    /**
     * The minimal texture usage options that your app’s input denoise strength texture needs in order to support this
     * denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("denoiseStrengthMaskTextureUsage")
    @NUInt
    long denoiseStrengthMaskTextureUsage();

    /**
     * The depth texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``depthTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/depthTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture depthTexture();

    /**
     * The pixel format of the input depth texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    long depthTextureFormat();

    /**
     * The minimal texture usage options that your app’s input depth texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTextureUsage")
    @NUInt
    long depthTextureUsage();

    /**
     * The diffuse albedo texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``diffuseAlbedoTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/diffuseAlbedoTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("diffuseAlbedoTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture diffuseAlbedoTexture();

    /**
     * The pixel format of the input diffuse albedo texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("diffuseAlbedoTextureFormat")
    @NUInt
    long diffuseAlbedoTextureFormat();

    /**
     * The minimal texture usage options that your app’s input diffuse albedo texture needs in order to support this
     * denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("diffuseAlbedoTextureUsage")
    @NUInt
    long diffuseAlbedoTextureUsage();

    /**
     * An exposure texture that this denoiser scaler evaluates.
     * 
     * Create and assign a 1x1 `MTLPixelFormatR16Float` texture to assign to this property. MetalFX reads the R channel
     * of the texel at position `(0,0)` and uses it as the exposure value. It then uses this value to multiply the input
     * color.
     * 
     * For best performance, use the GPU to generate the exposure value and store it into this texture.
     * 
     * * Note: The temporal scaler ignores this property if you create it with a descriptor that has its
     * ``MTLFXTemporalScalerDescriptor/autoExposureEnabled`` property set to
     * <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("exposureTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture exposureTexture();

    /**
     * An optional fence that this denoiser scaler waits for and updates.
     * 
     * Use this property for synchronizing access to untracked resources.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fence")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLFence fence();

    /**
     * The maximum input content scale this scaler supports.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputContentMaxScale")
    float inputContentMaxScale();

    /**
     * The minimum input content scale this scaler supports.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputContentMinScale")
    float inputContentMinScale();

    /**
     * The height, in pixels, of the input color texture for the scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    long inputHeight();

    /**
     * The width, in pixels, of the input color texture for the scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputWidth")
    @NUInt
    long inputWidth();

    /**
     * A Boolean value that indicates whether the depth texture uses zero to represent the farthest distance.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isDepthReversed")
    boolean isDepthReversed();

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this scaler samples to return to the frame's reference frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("jitterOffsetX")
    float jitterOffsetX();

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this scaler samples to return to the frame's reference frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("jitterOffsetY")
    float jitterOffsetY();

    /**
     * The motion texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``motionTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/motionTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture motionTexture();

    /**
     * The pixel format of the input motion texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    long motionTextureFormat();

    /**
     * The minimal texture usage options that your app’s input motion texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTextureUsage")
    @NUInt
    long motionTextureUsage();

    /**
     * The horizontal scale factor the denoiser scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this denoiser scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionVectorScaleX")
    float motionVectorScaleX();

    /**
     * The vertical scale factor the denoiser scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this denoiser scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionVectorScaleY")
    float motionVectorScaleY();

    /**
     * The normal texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``normalTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/normalTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("normalTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture normalTexture();

    /**
     * The pixel format of the input normal texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("normalTextureFormat")
    @NUInt
    long normalTextureFormat();

    /**
     * The minimal texture usage options that your app’s input normal texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("normalTextureUsage")
    @NUInt
    long normalTextureUsage();

    /**
     * The height, in pixels, of the output color texture for the scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    long outputHeight();

    /**
     * The output texture into which this denoiser scaler writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture outputTexture();

    /**
     * The pixel format of the output color texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    long outputTextureFormat();

    /**
     * The minimal texture usage options that your app’s output texture needs in order to support this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTextureUsage")
    @NUInt
    long outputTextureUsage();

    /**
     * The width, in pixels, of the output color texture for the scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    long outputWidth();

    /**
     * A pre-exposure value for this scaler to evaluate.
     * 
     * If the input color texture you assign to ``colorTexture`` is pre-multiplied by fixed value, set this property
     * to that same fixed value so MetalFX divides input color by it. This is not a common situation and you typically
     * don't need to assign a value to this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("preExposure")
    float preExposure();

    /**
     * A reactive-mask texture input for this scaler to evaluate.
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
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reactiveMaskTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture reactiveMaskTexture();

    /**
     * The pixel format of the input reactive mask texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reactiveMaskTextureFormat")
    @NUInt
    long reactiveMaskTextureFormat();

    /**
     * The minimal texture usage options that your app’s input reactive texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reactiveTextureUsage")
    @NUInt
    long reactiveTextureUsage();

    /**
     * The roughness texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``roughnessTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/roughnessTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("roughnessTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture roughnessTexture();

    /**
     * The pixel format of the input normal texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("roughnessTextureFormat")
    @NUInt
    long roughnessTextureFormat();

    /**
     * The minimal texture usage options that your app’s input roughness texture needs in order to support this denoiser
     * scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("roughnessTextureUsage")
    @NUInt
    long roughnessTextureUsage();

    /**
     * Assigns the color texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``colorTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The denoise strength mask texture this scaler evaluates.
     * 
     * Use this single-channel texture to mark, at a per-pixel level, areas that this denoiser ignores. To configure a
     * pixel
     * that the denoiser ignores, provide `1.0` as the value at that pixel's corresponding location on this texture.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``denoiseStrengthMaskTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/denoiseStrengthMaskTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDenoiseStrengthMaskTexture:")
    void setDenoiseStrengthMaskTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean value that indicates whether the depth texture uses zero to represent the farthest distance.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthReversed:")
    void setDepthReversed(boolean value);

    /**
     * The depth texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``depthTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/depthTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthTexture:")
    void setDepthTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The diffuse albedo texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``diffuseAlbedoTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/diffuseAlbedoTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDiffuseAlbedoTexture:")
    void setDiffuseAlbedoTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * An exposure texture that this denoiser scaler evaluates.
     * 
     * Create and assign a 1x1 `MTLPixelFormatR16Float` texture to assign to this property. MetalFX reads the R channel
     * of the texel at position `(0,0)` and uses it as the exposure value. It then uses this value to multiply the input
     * color.
     * 
     * For best performance, use the GPU to generate the exposure value and store it into this texture.
     * 
     * * Note: The temporal scaler ignores this property if you create it with a descriptor that has its
     * ``MTLFXTemporalScalerDescriptor/autoExposureEnabled`` property set to
     * <doc://com.apple.documentation/documentation/swift/true>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setExposureTexture:")
    void setExposureTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * An optional fence that this denoiser scaler waits for and updates.
     * 
     * Use this property for synchronizing access to untracked resources.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFence:")
    void setFence(@Mapped(ObjCObjectMapper.class) @Nullable MTLFence value);

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this scaler samples to return to the frame's reference frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setJitterOffsetX:")
    void setJitterOffsetX(float value);

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this scaler samples to return to the frame's reference frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setJitterOffsetY:")
    void setJitterOffsetY(float value);

    /**
     * The motion texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``motionTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/motionTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTexture:")
    void setMotionTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The horizontal scale factor the denoiser scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this denoiser scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionVectorScaleX:")
    void setMotionVectorScaleX(float value);

    /**
     * The vertical scale factor the denoiser scaler applies to the input motion texture.
     * 
     * The scaler converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this denoiser scaler expects that each pixel's motion vector points
     * to that pixel's location in the ``colorTexture`` at the time of the last call to encode this scaler's work. For
     * example,
     * in Metal's standard device coordinates, where `(0,0)` represents the upper-left corner of the framebuffer, the
     * motion
     * vectors for an object that moves down and to the right in the ``colorTexture`` by `10` pixels would be
     * `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionVectorScaleY:")
    void setMotionVectorScaleY(float value);

    /**
     * The normal texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``normalTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/normalTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setNormalTexture:")
    void setNormalTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The output texture into which this denoiser scaler writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A pre-exposure value for this scaler to evaluate.
     * 
     * If the input color texture you assign to ``colorTexture`` is pre-multiplied by fixed value, set this property
     * to that same fixed value so MetalFX divides input color by it. This is not a common situation and you typically
     * don't need to assign a value to this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPreExposure:")
    void setPreExposure(float value);

    /**
     * A reactive-mask texture input for this scaler to evaluate.
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
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setReactiveMaskTexture:")
    void setReactiveMaskTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The roughness texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``roughnessTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/roughnessTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setRoughnessTexture:")
    void setRoughnessTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean property indicating whether to reset history.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to invalidate history, for example
     * when there is a scene cut in your game.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShouldResetHistory:")
    void setShouldResetHistory(boolean value);

    /**
     * The specular albedo texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``specularAlbedoTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/specularAlbedoTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSpecularAlbedoTexture:")
    void setSpecularAlbedoTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The specular hit texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``specularHitDistanceTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/specularHitDistanceTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSpecularHitDistanceTexture:")
    void setSpecularHitDistanceTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The transparency overlay texture that this scaler evaluates.
     * 
     * Use this RGBA texture to provide to the denoiser an overlay with your transparent pixels, such as the output
     * of your particle systems. MetalFX interprets this to be a texture in linear color space, with the RGB channels
     * ranging between `0` and infinity, and the alpha channel in the range `[0,1]`, representing the opacity of the
     * pixel.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``transparencyOverlayTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/transparencyOverlayTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTransparencyOverlayTexture:")
    void setTransparencyOverlayTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean property indicating whether to reset history.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to invalidate history, for example
     * when there is a scene cut in your game.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldResetHistory")
    boolean shouldResetHistory();

    /**
     * The specular albedo texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``specularAlbedoTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/specularAlbedoTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularAlbedoTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture specularAlbedoTexture();

    /**
     * The pixel format of the input specular albedo for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularAlbedoTextureFormat")
    @NUInt
    long specularAlbedoTextureFormat();

    /**
     * The minimal texture usage options that your app’s input specular albedo texture needs in order to support this
     * denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularAlbedoTextureUsage")
    @NUInt
    long specularAlbedoTextureUsage();

    /**
     * The specular hit texture this scaler evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``specularHitDistanceTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/specularHitDistanceTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularHitDistanceTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture specularHitDistanceTexture();

    /**
     * The pixel format of the input specular hit distance texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularHitDistanceTextureFormat")
    @NUInt
    long specularHitDistanceTextureFormat();

    /**
     * The minimal texture usage options that your app’s input specular hit texture needs in order to support this
     * denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("specularHitDistanceTextureUsage")
    @NUInt
    long specularHitDistanceTextureUsage();

    /**
     * The transparency overlay texture that this scaler evaluates.
     * 
     * Use this RGBA texture to provide to the denoiser an overlay with your transparent pixels, such as the output
     * of your particle systems. MetalFX interprets this to be a texture in linear color space, with the RGB channels
     * ranging between `0` and infinity, and the alpha channel in the range `[0,1]`, representing the opacity of the
     * pixel.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``transparencyOverlayTextureUsage`` requests and the pixel format that
     * ``MTLFXTemporalDenoisedScalerDescriptor/transparencyOverlayTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("transparencyOverlayTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture transparencyOverlayTexture();

    /**
     * The pixel format of the input transparency overlay texture for this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("transparencyOverlayTextureFormat")
    @NUInt
    long transparencyOverlayTextureFormat();

    /**
     * The minimal texture usage options that your app’s input transparency overlay texture needs in order to support
     * this denoiser scaler.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("transparencyOverlayTextureUsage")
    @NUInt
    long transparencyOverlayTextureUsage();
}