package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metalperformanceshaders.MPSKernel;
import apple.metalperformanceshaders.MPSNDArray;
import apple.metalperformanceshaders.MPSNDArrayDescriptor;
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
@ObjCProtocolName("MPSNDArrayAllocator")
public interface MPSNDArrayAllocator extends NSSecureCoding, NSCopying {
    @Generated
    @Selector("arrayForCommandBuffer:arrayDescriptor:kernel:")
    MPSNDArray arrayForCommandBufferArrayDescriptorKernel(@Mapped(ObjCObjectMapper.class) Object cmdBuf,
            MPSNDArrayDescriptor descriptor, MPSKernel kernel);
}