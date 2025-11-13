package apple.metalfx.protocol;

import apple.metal.protocol.MTLCommandBuffer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * An upscaling effect that generates a higher resolution texture in a render pass by spatially analyzing an input
 * texture.
 * 
 * You create instances of this class by calling ``MTLFXSpatialScalerDescriptor/newSpatialScalerWithDevice:``.
 * 
 * When using instances of objects conforming to this protocol, you configure the different properties it
 * inherits from protocol ``MTLFXSpatialScalerBase`` and then call ``encodeToCommandBuffer:`` to
 * encode its work into a Metal command buffer.
 * 
 * See ``MTLFXSpatialScalerBase`` for more details on configuring and using spatial scalers.
 * 
 * 
 * API-Since: 16.0
 */
@Generated
@Library("MetalFX")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFXSpatialScaler")
public interface MTLFXSpatialScaler extends MTLFXSpatialScalerBase {
    /**
     * Encode this spatial scaler work into a command buffer.
     * 
     * - Parameters:
     * - commandBuffer: A command buffer into which this spatial scaler encodes work.
     * 
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("encodeToCommandBuffer:")
    void encodeToCommandBuffer(@NotNull @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);
}