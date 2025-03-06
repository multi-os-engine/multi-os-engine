package apple.metalfx.protocol;

import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLFence;
import apple.metal.protocol.MTLTexture;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 16.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXTemporalScaler")
public interface MTLFXTemporalScaler {
    /**
     * These can change on a frame by frame basis.
     * We don't care about the textures assigned except that they must
     * match the originally specified dimensions and pixel formats.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("colorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture colorTexture();

    /**
     * Read-only immutable properties of effect
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    long colorTextureFormat();

    /**
     * Properties return the minimum required MTLTextureUsage bits required
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("colorTextureUsage")
    @NUInt
    long colorTextureUsage();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("depthTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture depthTexture();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    long depthTextureFormat();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("depthTextureUsage")
    @NUInt
    long depthTextureUsage();

    /**
     * Method to encode the effect to a command buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * Exposure properties
     * Ideally this is a 1x1 R16F texture. Note that only R channel of
     * the texel located at (0, 0) is used for exposure value. The value is used
     * to multiply the input color, use GPU to generate the exposure value.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("exposureTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture exposureTexture();

    /**
     * Property for synchronization when using untracked resources
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("fence")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFence fence();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentHeight")
    @NUInt
    long inputContentHeight();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMaxScale")
    float inputContentMaxScale();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentMinScale")
    float inputContentMinScale();

    /**
     * Dynamic Resolution property
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputContentWidth")
    @NUInt
    long inputContentWidth();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    long inputHeight();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("inputWidth")
    @NUInt
    long inputWidth();

    /**
     * Set whether the depth buffer uses reversed depth or not. Defaults to YES.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("isDepthReversed")
    boolean isDepthReversed();

    /**
     * The jitter offset property indicates the pixel offset to sample in order to
     * return to the frame's reference frame.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("jitterOffsetX")
    float jitterOffsetX();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("jitterOffsetY")
    float jitterOffsetY();

    /**
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("motionTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture motionTexture();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    long motionTextureFormat();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("motionTextureUsage")
    @NUInt
    long motionTextureUsage();

    /**
     * Scale factor to be applied to motion vectors to convert to pixel/fragment
     * coordinates in the input data. The expectation for a 1.0 scale factor is
     * that each pixel's motion vector will point to where that pixel was in the
     * prior frame. Assuming standard Metal device coordinates (0,0 is upper left
     * in the framebuffer), the motion vectors for an object that moved down and
     * to the right in the framebuffer texture by 10 pixels would be -10,-10.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("motionVectorScaleX")
    float motionVectorScaleX();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("motionVectorScaleY")
    float motionVectorScaleY();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    long outputHeight();

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("outputTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture outputTexture();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    long outputTextureFormat();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputTextureUsage")
    @NUInt
    long outputTextureUsage();

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    long outputWidth();

    /**
     * If the input color is pre-multiplied by fixed value, set this value
     * which MetalFX will use to divide input color, this is not common.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("preExposure")
    float preExposure();

    /**
     * Reset. Set to true when history is invalid (scene cut, etc.)
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("reset")
    boolean reset();

    /**
     * These can change on a frame by frame basis.
     * We don't care about the textures assigned except that they must
     * match the originally specified dimensions and pixel formats.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Set whether the depth buffer uses reversed depth or not. Defaults to YES.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDepthReversed:")
    void setDepthReversed(boolean value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDepthTexture:")
    void setDepthTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Exposure properties
     * Ideally this is a 1x1 R16F texture. Note that only R channel of
     * the texel located at (0, 0) is used for exposure value. The value is used
     * to multiply the input color, use GPU to generate the exposure value.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setExposureTexture:")
    void setExposureTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Property for synchronization when using untracked resources
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setFence:")
    void setFence(@Nullable @Mapped(ObjCObjectMapper.class) MTLFence value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentHeight:")
    void setInputContentHeight(@NUInt long value);

    /**
     * Dynamic Resolution property
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentWidth:")
    void setInputContentWidth(@NUInt long value);

    /**
     * The jitter offset property indicates the pixel offset to sample in order to
     * return to the frame's reference frame.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setJitterOffsetX:")
    void setJitterOffsetX(float value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setJitterOffsetY:")
    void setJitterOffsetY(float value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMotionTexture:")
    void setMotionTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Scale factor to be applied to motion vectors to convert to pixel/fragment
     * coordinates in the input data. The expectation for a 1.0 scale factor is
     * that each pixel's motion vector will point to where that pixel was in the
     * prior frame. Assuming standard Metal device coordinates (0,0 is upper left
     * in the framebuffer), the motion vectors for an object that moved down and
     * to the right in the framebuffer texture by 10 pixels would be -10,-10.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMotionVectorScaleX:")
    void setMotionVectorScaleX(float value);

    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMotionVectorScaleY:")
    void setMotionVectorScaleY(float value);

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * If the input color is pre-multiplied by fixed value, set this value
     * which MetalFX will use to divide input color, this is not common.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setPreExposure:")
    void setPreExposure(float value);

    /**
     * Reset. Set to true when history is invalid (scene cut, etc.)
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setReset:")
    void setReset(boolean value);

    /**
     * Reactive mask
     * An optional single channel texture that contains values in the range
     * 0.0f-1.0f. A value of 0.0f applies the default temporal effect treatment.
     * A value greater than 0.0f applies a bias towards the current frame for
     * the pixel.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("reactiveMaskTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture reactiveMaskTexture();

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("reactiveTextureUsage")
    @NUInt
    long reactiveTextureUsage();

    /**
     * Reactive mask
     * An optional single channel texture that contains values in the range
     * 0.0f-1.0f. A value of 0.0f applies the default temporal effect treatment.
     * A value greater than 0.0f applies a bias towards the current frame for
     * the pixel.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("setReactiveMaskTexture:")
    void setReactiveMaskTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);
}