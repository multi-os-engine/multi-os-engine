package apple.metalfx.protocol;

import apple.metal.protocol.MTL4CommandBuffer;
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
 * API-Since: 26.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTL4FXFrameInterpolator")
public interface MTL4FXFrameInterpolator extends MTLFXFrameInterpolatorBase {
    /**
     * Encode this frame interpolator's work into a command buffer.
     * 
     * - Parameters:
     * - commandBuffer: A command buffer into which this frame interpolator encodes work.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@Mapped(ObjCObjectMapper.class) @NotNull MTL4CommandBuffer commandBuffer);
}