package apple.metal.protocol;

import apple.metal.MTLAccelerationStructureDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLAccelerationStructureCommandEncoder")
public interface MTLAccelerationStructureCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("buildAccelerationStructure:descriptor:scratchBuffer:scratchBufferOffset:")
    void buildAccelerationStructureDescriptorScratchBufferScratchBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            MTLAccelerationStructureDescriptor descriptor, @Mapped(ObjCObjectMapper.class) MTLBuffer scratchBuffer,
            @NUInt long scratchBufferOffset);

    @Generated
    @Selector("copyAccelerationStructure:toAccelerationStructure:")
    void copyAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure);

    @Generated
    @Selector("copyAndCompactAccelerationStructure:toAccelerationStructure:")
    void copyAndCompactAccelerationStructureToAccelerationStructure(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure);

    @Generated
    @Selector("refitAccelerationStructure:descriptor:destination:scratchBuffer:scratchBufferOffset:")
    void refitAccelerationStructureDescriptorDestinationScratchBufferScratchBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure sourceAccelerationStructure,
            MTLAccelerationStructureDescriptor descriptor,
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure destinationAccelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLBuffer scratchBuffer, @NUInt long scratchBufferOffset);

    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);

    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    @Generated
    @Selector("useHeap:")
    void useHeap(@Mapped(ObjCObjectMapper.class) MTLHeap heap);

    @Generated
    @Selector("useHeaps:count:")
    void useHeapsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count);

    @Generated
    @Selector("useResource:usage:")
    void useResourceUsage(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage);

    @Generated
    @Selector("useResources:count:usage:")
    void useResourcesCountUsage(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources, @NUInt long count,
            @NUInt long usage);

    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    @Generated
    @Selector("writeCompactedAccelerationStructureSize:toBuffer:offset:")
    void writeCompactedAccelerationStructureSizeToBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset);
}