package apple.metalfx.protocol;

import apple.metal.protocol.MTLFence;
import apple.metal.protocol.MTLTexture;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An upscaling effect that generates a higher resolution texture in a render pass by spatially analyzing an input
 * texture.
 * 
 * The MetalFX spatial scaler increases the size of your input texture to a larger output texture. You can use the
 * scaler to upscale every frame of your app’s scene or rendering in real time. With a scaler, you can draw more
 * complicated scenes in less time by intentionally rendering to a lower resolution to save time before upscaling.
 * 
 * Create an ``MTLFXSpatialScaler`` instance following these steps:
 * 1. Create and configure an ``MTLFXSpatialScalerDescriptor`` instance.
 * 2. Call the descriptor’s ``newSpatialScalerWithDevice:`` method.
 * 
 * Upscale a rendering by following these steps for every render pass:
 * 1. Set the spatial scaler’s ``colorTexture`` property to the input texture.
 * 2. Set the scaler’s ``inputContentWidth`` and ``inputContentHeight`` properties.
 * 3. Set the scaler’s ``outputTexture`` property to your destination texture.
 * 
 * Encode the upscale commands to a command buffer by calling the spatial scaler’s ``encodeToCommandBuffer:`` method.
 * 
 * ## Conforming to texture usage requirements
 * 
 * Spatial scalers expose properties, such as ``colorTextureUsage``, that indicate requirements for
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
 * ``MTLFXSpatialScalerDescriptor`` descriptor instance that creates the scaler instance.
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXSpatialScalerBase")
public interface MTLFXSpatialScalerBase {
    /**
     * The color processing mode you set in this spatial scaler’s descriptor.
     */
    @Generated
    @Selector("colorProcessingMode")
    @NInt
    long colorProcessingMode();

    /**
     * Input color texture you set for the scaler that supports the correct color texture usage options.
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
     * The minimal texture usage options that your app’s output color texture needs in order to support this scaler.
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
     * Input color texture you set for the scaler that supports the correct color texture usage options.
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

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
     * The output texture into which this scaler writes its output.
     * 
     * You are responsible for providing a texture with a private `storageMode` to this property.
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);
}