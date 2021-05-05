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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLIndirectCommandBuffer")
public interface MTLIndirectCommandBuffer extends MTLResource {
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
}