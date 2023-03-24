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
    @Generated
    @Selector("colorProcessingMode")
    @NInt
    long colorProcessingMode();

    /**
     * These would be all of the "state" needed that is allowed to change on a frame by
     * frame basis. We don't care about the textures assigned except that they must
     * match the required MTLTextureUsage flags.
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

    /**
     * Method to encode the effect to a command buffer
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

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

    /**
     * Dynamic resolution property
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
     * These would be all of the "state" needed that is allowed to change on a frame by
     * frame basis. We don't care about the textures assigned except that they must
     * match the required MTLTextureUsage flags.
     */
    @Generated
    @Selector("setColorTexture:")
    void setColorTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);

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
     * Dynamic resolution property
     */
    @Generated
    @Selector("setInputContentWidth:")
    void setInputContentWidth(@NUInt long value);

    /**
     * outputTexture is required to have MTLStorageModePrivate for storageMode
     */
    @Generated
    @Selector("setOutputTexture:")
    void setOutputTexture(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture value);
}