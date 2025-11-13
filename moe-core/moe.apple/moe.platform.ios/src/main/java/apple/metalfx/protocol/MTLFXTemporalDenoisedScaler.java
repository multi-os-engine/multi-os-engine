package apple.metalfx.protocol;

import apple.metal.protocol.MTLCommandBuffer;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 18.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXTemporalDenoisedScaler")
public interface MTLFXTemporalDenoisedScaler extends MTLFXTemporalDenoisedScalerBase {
    /**
     * Encode this scaler denoiser's work into a command buffer.
     * 
     * - Parameters:
     * - commandBuffer: A command buffer into which this scaler denoiser encodes work.
     * 
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@Mapped(ObjCObjectMapper.class) @NotNull MTLCommandBuffer commandBuffer);
}