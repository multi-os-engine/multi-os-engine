package apple.metalperformanceshaders.protocol;

import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLCommandBuffer;
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
    /**
     * Create a new MPSNDArray
     * 
     * See class description for sample implementation
     * 
     * @param cmdBuf     The MTLCommandBuffer on which the array will be initialized.
     *                   cmdBuf.device encodes the MTLDevice.
     * @param descriptor A MPSNDArrayDescriptor containing the array parameters to use.
     *                   This format is the result of your MPSPadding policy.
     * @param kernel     The kernel that will overwrite the array returned by the filter.
     *                   Note that the MPS implementations of this protocol don't need
     *                   this field. It is provided for your convenience.
     * 
     * @return A valid MPSNDArray or MPSTemporaryNDArray. It will be automatically released when the command buffer
     *         completes.
     */
    @Generated
    @Selector("arrayForCommandBuffer:arrayDescriptor:kernel:")
    MPSNDArray arrayForCommandBufferArrayDescriptorKernel(@Mapped(ObjCObjectMapper.class) MTLCommandBuffer cmdBuf,
            MPSNDArrayDescriptor descriptor, MPSKernel kernel);
}
