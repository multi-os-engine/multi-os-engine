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
@ObjCProtocolName("MTLFXFrameInterpolatorBase")
public interface MTLFXFrameInterpolatorBase {
    /**
     * The ratio between width and height of the screen.
     * 
     * In a 3D game, you set this value to the same aspect ratio you use to create your perspective matrix, which is
     * typically `width/height`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("aspectRatio")
    float aspectRatio();

    /**
     * The color texture that this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``colorTextureUsage`` requests and the pixel format that ``colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture colorTexture();

    /**
     * The pixel format of the input color texture for this frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTextureFormat")
    @NUInt
    long colorTextureFormat();

    /**
     * The minimal texture usage options that your app’s input color texture needs in order to support this frame
     * interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("colorTextureUsage")
    @NUInt
    long colorTextureUsage();

    /**
     * The length of the time interval, in seconds, between time of current and previous frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("deltaTime")
    float deltaTime();

    /**
     * The depth texture this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``depthTextureUsage`` requests and the pixel format that ``depthTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture depthTexture();

    /**
     * The pixel format of the input depth texture for this frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTextureFormat")
    @NUInt
    long depthTextureFormat();

    /**
     * The minimal texture usage options that your app’s input depth texture needs in order to support this frame
     * interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("depthTextureUsage")
    @NUInt
    long depthTextureUsage();

    /**
     * The far plane distance that corresponds to the frustrum that renders the scene into the color buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("farPlane")
    float farPlane();

    /**
     * An optional fence that this frame interpolator waits for and updates.
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
     * The vertical field of view angle, in degrees, of the camera that renders the scene into the color buffer.
     * 
     * In a 3D game, you set this value to the field of view you use to create your perspective matrix.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("fieldOfView")
    float fieldOfView();

    /**
     * The height, in pixels, of the input color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("inputHeight")
    @NUInt
    long inputHeight();

    /**
     * The width, in pixels, of the input color texture for the frame interpolator.
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
     * A Boolean value that controls whether this frame interpolator interprets the color texture to include your game's
     * custom UI.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> when property ``uiTexture``
     * contains
     * a precomposition of any custom UI image on top of the color image.
     * 
     * When you enable this property, the frame interpolator decomposites the color image ``colorTexture`` references
     * from
     * the UI ``uiTexture`` references before compositing the UI on to the ``outputTexture``.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("isUITextureComposited")
    boolean isUITextureComposited();

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this interpolator samples to return to the frame's reference
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("jitterOffsetX")
    float jitterOffsetX();

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this interpolator samples to return to the frame's reference
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("jitterOffsetY")
    float jitterOffsetY();

    /**
     * The motion texture this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``motionTextureUsage`` requests and the pixel format that ``motionTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture motionTexture();

    /**
     * The pixel format of the input motion texture for this frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTextureFormat")
    @NUInt
    long motionTextureFormat();

    /**
     * The minimal texture usage options that your app’s input motion texture needs in order to support this frame
     * interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionTextureUsage")
    @NUInt
    long motionTextureUsage();

    /**
     * The horizontal scale factor the frame interpolator applies to the input motion texture.
     * 
     * The frame interpolator converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this interpolator expects that each pixel's motion vector points
     * to the location where that pixel is in the ``prevColorTexture``. For example, in Metal's standard device
     * coordinates
     * where `(0,0)` represents the upper-left corner of the framebuffer, the motion vectors for an object that moves
     * down
     * and to the right in the ``colorTexture`` by `10` pixels would be `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionVectorScaleX")
    float motionVectorScaleX();

    /**
     * The vertical scale factor the frame interpolator applies to the input motion texture.
     * 
     * The frame interpolator converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this interpolator expects that each pixel's motion vector points
     * to the location where that pixel is in the ``prevColorTexture``. For example, in Metal's standard device
     * coordinates
     * where `(0,0)` represents the upper-left corner of the framebuffer, the motion vectors for an object that moves
     * down
     * and to the right in the ``colorTexture`` by `10` pixels would be `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("motionVectorScaleY")
    float motionVectorScaleY();

    /**
     * The near plane distance that corresponds to the frustrum that renders the scene into the color buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("nearPlane")
    float nearPlane();

    /**
     * The height, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputHeight")
    @NUInt
    long outputHeight();

    /**
     * The output texture into which this frame interpolator writes its output.
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
     * The pixel format of the output color texture for this frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTextureFormat")
    @NUInt
    long outputTextureFormat();

    /**
     * The minimal texture usage options that your app’s output color texture needs in order to support this frame
     * interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputTextureUsage")
    @NUInt
    long outputTextureUsage();

    /**
     * The width, in pixels, of the output color texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("outputWidth")
    @NUInt
    long outputWidth();

    /**
     * The previous color texture for this frame interpolator during the last call to encode work into a command buffer.
     * 
     * The frame interpolator typically uses the previous color texture as part of its operation. When you call
     * ``MTLFXFrameInterpolator/encodeToCommandBuffer:`` and its ``shouldResetHistory`` property is
     * <doc://com.apple.documentation/documentation/swift/false>, then you are responsible for assigning to this
     * property
     * the data that in ``colorTexture`` from the previous call to ``MTLFXFrameInterpolator/encodeToCommandBuffer:``.
     * 
     * Additionally, you are responsible for ensuring the usage and pixel format of the texture you assign to this
     * property matches the
     * texture usage ``colorTextureUsage`` requests and the pixel format that ``colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("prevColorTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture prevColorTexture();

    /**
     * The ratio between width and height of the screen.
     * 
     * In a 3D game, you set this value to the same aspect ratio you use to create your perspective matrix, which is
     * typically `width/height`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setAspectRatio:")
    void setAspectRatio(float value);

    /**
     * The color texture that this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``colorTextureUsage`` requests and the pixel format that ``colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The length of the time interval, in seconds, between time of current and previous frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDeltaTime:")
    void setDeltaTime(float value);

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
     * The depth texture this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``depthTextureUsage`` requests and the pixel format that ``depthTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setDepthTexture:")
    void setDepthTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The far plane distance that corresponds to the frustrum that renders the scene into the color buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFarPlane:")
    void setFarPlane(float value);

    /**
     * An optional fence that this frame interpolator waits for and updates.
     * 
     * Use this property for synchronizing access to untracked resources.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFence:")
    void setFence(@Mapped(ObjCObjectMapper.class) @Nullable MTLFence value);

    /**
     * The vertical field of view angle, in degrees, of the camera that renders the scene into the color buffer.
     * 
     * In a 3D game, you set this value to the field of view you use to create your perspective matrix.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFieldOfView:")
    void setFieldOfView(float value);

    /**
     * A Boolean value that controls whether this frame interpolator interprets the color texture to include your game's
     * custom UI.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> when property ``uiTexture``
     * contains
     * a precomposition of any custom UI image on top of the color image.
     * 
     * When you enable this property, the frame interpolator decomposites the color image ``colorTexture`` references
     * from
     * the UI ``uiTexture`` references before compositing the UI on to the ``outputTexture``.
     * 
     * This property's default value is <doc://com.apple.documentation/documentation/swift/false>.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIsUITextureComposited:")
    void setIsUITextureComposited(boolean value);

    /**
     * The horizontal component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the horizontal pixel offset this interpolator samples to return to the frame's reference
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setJitterOffsetX:")
    void setJitterOffsetX(float value);

    /**
     * The vertical component of the subpixel sampling coordinate you use to generate the color texture input.
     * 
     * This property indicates the vertical pixel offset this interpolator samples to return to the frame's reference
     * frame.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setJitterOffsetY:")
    void setJitterOffsetY(float value);

    /**
     * The motion texture this frame interpolator evaluates.
     * 
     * You are responsible for ensuring the usage and pixel format of the texture you assign to this property matches
     * the
     * texture usage ``motionTextureUsage`` requests and the pixel format that ``motionTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionTexture:")
    void setMotionTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The horizontal scale factor the frame interpolator applies to the input motion texture.
     * 
     * The frame interpolator converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this interpolator expects that each pixel's motion vector points
     * to the location where that pixel is in the ``prevColorTexture``. For example, in Metal's standard device
     * coordinates
     * where `(0,0)` represents the upper-left corner of the framebuffer, the motion vectors for an object that moves
     * down
     * and to the right in the ``colorTexture`` by `10` pixels would be `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionVectorScaleX:")
    void setMotionVectorScaleX(float value);

    /**
     * The vertical scale factor the frame interpolator applies to the input motion texture.
     * 
     * The frame interpolator converts the horizontal component of each value in ``motionTexture`` into fragment (pixel)
     * coordinates by multiplying it by this property’s value.
     * 
     * If you set this property's value to `1.0`, this interpolator expects that each pixel's motion vector points
     * to the location where that pixel is in the ``prevColorTexture``. For example, in Metal's standard device
     * coordinates
     * where `(0,0)` represents the upper-left corner of the framebuffer, the motion vectors for an object that moves
     * down
     * and to the right in the ``colorTexture`` by `10` pixels would be `(-10,-10)`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setMotionVectorScaleY:")
    void setMotionVectorScaleY(float value);

    /**
     * The near plane distance that corresponds to the frustrum that renders the scene into the color buffer.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setNearPlane:")
    void setNearPlane(float value);

    /**
     * The output texture into which this frame interpolator writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The previous color texture for this frame interpolator during the last call to encode work into a command buffer.
     * 
     * The frame interpolator typically uses the previous color texture as part of its operation. When you call
     * ``MTLFXFrameInterpolator/encodeToCommandBuffer:`` and its ``shouldResetHistory`` property is
     * <doc://com.apple.documentation/documentation/swift/false>, then you are responsible for assigning to this
     * property
     * the data that in ``colorTexture`` from the previous call to ``MTLFXFrameInterpolator/encodeToCommandBuffer:``.
     * 
     * Additionally, you are responsible for ensuring the usage and pixel format of the texture you assign to this
     * property matches the
     * texture usage ``colorTextureUsage`` requests and the pixel format that ``colorTextureFormat`` requests.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setPrevColorTexture:")
    void setPrevColorTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean property indicating whether to reset history.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to invalidate history, for example
     * when there is a scene cut in your game.
     * 
     * When you set this property to <doc://com.apple.documentation/documentation/swift/false>, you are responsible for
     * ensuring the property ``prevColorTexture`` contains frame data corresponding to that in ``colorTexture`` during
     * your previous call to ``MTLFXFrameInterpolator/encodeToCommandBuffer:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setShouldResetHistory:")
    void setShouldResetHistory(boolean value);

    /**
     * An optional texture containing your game's custom UI that this frame interpolator evaluates.
     * 
     * The frame interpolator uses this property to overlay your custom UI on any frame data it produces into
     * ``outputTexture``.
     * 
     * Use property ``uiTextureComposited`` to indicate to this frame interpolator if this texture contains a
     * precomposition of
     * ``colorTexture``and UI.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setUITexture:")
    void setUITexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * A Boolean property indicating whether to reset history.
     * 
     * Set this property to <doc://com.apple.documentation/documentation/swift/true> to invalidate history, for example
     * when there is a scene cut in your game.
     * 
     * When you set this property to <doc://com.apple.documentation/documentation/swift/false>, you are responsible for
     * ensuring the property ``prevColorTexture`` contains frame data corresponding to that in ``colorTexture`` during
     * your previous call to ``MTLFXFrameInterpolator/encodeToCommandBuffer:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("shouldResetHistory")
    boolean shouldResetHistory();

    /**
     * An optional texture containing your game's custom UI that this frame interpolator evaluates.
     * 
     * The frame interpolator uses this property to overlay your custom UI on any frame data it produces into
     * ``outputTexture``.
     * 
     * Use property ``uiTextureComposited`` to indicate to this frame interpolator if this texture contains a
     * precomposition of
     * ``colorTexture``and UI.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("uiTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLTexture uiTexture();

    /**
     * The pixel format of the input UI texture for the frame interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("uiTextureFormat")
    @NUInt
    long uiTextureFormat();

    /**
     * The minimal texture usage options that your app’s input UI texture needs in order to support this frame
     * interpolator.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("uiTextureUsage")
    @NUInt
    long uiTextureUsage();
}