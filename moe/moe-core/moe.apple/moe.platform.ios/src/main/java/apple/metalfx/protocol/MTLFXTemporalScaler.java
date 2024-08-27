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
     */
    @Nullable
    @Generated
    @Selector("colorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture colorTexture();

    /**
     * Read-only immutable properties of effect
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    long colorTextureFormat();

    /**
     * Properties return the minimum required MTLTextureUsage bits required
     */
    @Generated
    @Selector("colorTextureUsage")
    @NUInt
    long colorTextureUsage();

    @Nullable
    @Generated
    @Selector("depthTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture depthTexture();

    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    long depthTextureFormat();

    @Generated
    @Selector("depthTextureUsage")
    @NUInt
    long depthTextureUsage();

    /**
     * Method to encode the effect to a command buffer
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    /**
     * Exposure properties
     * Ideally this is a 1x1 R16F texture. Note that only R channel of
     * the texel located at (0, 0) is used for exposure value. The value is used
     * to multiply the input color, use GPU to generate the exposure value.
     */
    @Nullable
    @Generated
    @Selector("exposureTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture exposureTexture();

    /**
     * Property for synchronization when using untracked resources
     */
    @Nullable
    @Generated
    @Selector("fence")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFence fence();

    @Generated
    @Selector("inputContentHeight")
    @NUInt
    long inputContentHeight();

    @Generated
    @Selector("inputContentMaxScale")
    float inputContentMaxScale();

    @Generated
    @Selector("inputContentMinScale")
    float inputContentMinScale();

    /**
     * Dynamic Resolution property
     */
    @Generated
    @Selector("inputContentWidth")
    @NUInt
    long inputContentWidth();

    @Generated
    @Selector("inputHeight")
    @NUInt
    long inputHeight();

    @Generated
    @Selector("inputWidth")
    @NUInt
    long inputWidth();

    /**
     * Set whether the depth buffer uses reversed depth or not. Defaults to YES.
     */
    @Generated
    @Selector("isDepthReversed")
    boolean isDepthReversed();

    /**
     * The jitter offset property indicates the pixel offset to sample in order to
     * return to the frame's reference frame.
     */
    @Generated
    @Selector("jitterOffsetX")
    float jitterOffsetX();

    @Generated
    @Selector("jitterOffsetY")
    float jitterOffsetY();

    @Nullable
    @Generated
    @Selector("motionTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture motionTexture();

    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    long motionTextureFormat();

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
     */
    @Generated
    @Selector("motionVectorScaleX")
    float motionVectorScaleX();

    @Generated
    @Selector("motionVectorScaleY")
    float motionVectorScaleY();

    @Generated
    @Selector("outputHeight")
    @NUInt
    long outputHeight();

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     */
    @Nullable
    @Generated
    @Selector("outputTexture")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture outputTexture();

    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    long outputTextureFormat();

    @Generated
    @Selector("outputTextureUsage")
    @NUInt
    long outputTextureUsage();

    @Generated
    @Selector("outputWidth")
    @NUInt
    long outputWidth();

    /**
     * If the input color is pre-multiplied by fixed value, set this value
     * which MetalFX will use to divide input color, this is not common.
     */
    @Generated
    @Selector("preExposure")
    float preExposure();

    /**
     * Reset. Set to true when history is invalid (scene cut, etc.)
     */
    @Generated
    @Selector("reset")
    boolean reset();

    /**
     * These can change on a frame by frame basis.
     * We don't care about the textures assigned except that they must
     * match the originally specified dimensions and pixel formats.
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Set whether the depth buffer uses reversed depth or not. Defaults to YES.
     */
    @Generated
    @Selector("setDepthReversed:")
    void setDepthReversed(boolean value);

    @Generated
    @Selector("setDepthTexture:")
    void setDepthTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Exposure properties
     * Ideally this is a 1x1 R16F texture. Note that only R channel of
     * the texel located at (0, 0) is used for exposure value. The value is used
     * to multiply the input color, use GPU to generate the exposure value.
     */
    @Generated
    @Selector("setExposureTexture:")
    void setExposureTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * Property for synchronization when using untracked resources
     */
    @Generated
    @Selector("setFence:")
    void setFence(@Nullable @Mapped(ObjCObjectMapper.class) MTLFence value);

    @Generated
    @Selector("setInputContentHeight:")
    void setInputContentHeight(@NUInt long value);

    /**
     * Dynamic Resolution property
     */
    @Generated
    @Selector("setInputContentWidth:")
    void setInputContentWidth(@NUInt long value);

    /**
     * The jitter offset property indicates the pixel offset to sample in order to
     * return to the frame's reference frame.
     */
    @Generated
    @Selector("setJitterOffsetX:")
    void setJitterOffsetX(float value);

    @Generated
    @Selector("setJitterOffsetY:")
    void setJitterOffsetY(float value);

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
     */
    @Generated
    @Selector("setMotionVectorScaleX:")
    void setMotionVectorScaleX(float value);

    @Generated
    @Selector("setMotionVectorScaleY:")
    void setMotionVectorScaleY(float value);

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

    /**
     * If the input color is pre-multiplied by fixed value, set this value
     * which MetalFX will use to divide input color, this is not common.
     */
    @Generated
    @Selector("setPreExposure:")
    void setPreExposure(float value);

    /**
     * Reset. Set to true when history is invalid (scene cut, etc.)
     */
    @Generated
    @Selector("setReset:")
    void setReset(boolean value);
}