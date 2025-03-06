package apple.metalfx.protocol;

import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLFence;
import apple.metal.protocol.MTLTexture;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * This is the object that gets created from the descriptor
 * 
 * API-Since: 16.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXSpatialScaler")
public interface MTLFXSpatialScaler {
    /**
     * API-Since: 16.0
     */
    @Generated
    @Selector("colorProcessingMode")
    @NInt
    long colorProcessingMode();

    /**
     * These would be all of the "state" needed that is allowed to change on a frame by
     * frame basis. We don't care about the textures assigned except that they must
     * match the required MTLTextureUsage flags.
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
     * Method to encode the effect to a command buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

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
     * Dynamic resolution property
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
     * These would be all of the "state" needed that is allowed to change on a frame by
     * frame basis. We don't care about the textures assigned except that they must
     * match the required MTLTextureUsage flags.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

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
     * Dynamic resolution property
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setInputContentWidth:")
    void setInputContentWidth(@NUInt long value);

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);
}