package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.struct.MTLResourceID;

/**
 * API-Since: 12.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIndirectCommandBuffer")
public interface MTLIndirectCommandBuffer extends MTLResource {
    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("indirectComputeCommandAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIndirectComputeCommand indirectComputeCommandAtIndex(@NUInt long commandIndex);

    @Generated
    @Selector("indirectRenderCommandAtIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIndirectRenderCommand indirectRenderCommandAtIndex(@NUInt long commandIndex);

    @Generated
    @Selector("resetWithRange:")
    void resetWithRange(@ByValue NSRange range);

    @Generated
    @Selector("size")
    @NUInt
    long size();

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Argument Buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();
}