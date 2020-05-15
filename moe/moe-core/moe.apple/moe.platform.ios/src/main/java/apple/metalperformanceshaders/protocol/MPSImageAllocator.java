package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metalperformanceshaders.MPSImage;
import apple.metalperformanceshaders.MPSImageDescriptor;
import apple.metalperformanceshaders.MPSKernel;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPSImageAllocator")
public interface MPSImageAllocator extends NSSecureCoding {
    @Generated
    @Selector("imageForCommandBuffer:imageDescriptor:kernel:")
    MPSImage imageForCommandBufferImageDescriptorKernel(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            MPSImageDescriptor descriptor, MPSKernel kernel);
}