/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.metal.protocol;

import apple.foundation.struct.NSRange;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstFloatPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLComputeCommandEncoder")
public interface MTLComputeCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("dispatchThreadgroups:threadsPerThreadgroup:")
    void dispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:")
    void dispatchThreadgroupsWithIndirectBufferIndirectBufferOffsetThreadsPerThreadgroup(
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset,
            @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setBufferOffset:atIndex:")
    void setBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setBytes:length:atIndex:")
    void setBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@Mapped(ObjCObjectMapper.class) MTLComputePipelineState state);

    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    @Generated
    @Selector("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    @Generated
    @Selector("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setStageInRegion:")
    void setStageInRegion(@ByValue MTLRegion region);

    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures, @ByValue NSRange range);

    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    @Generated
    @Selector("dispatchThreads:threadsPerThreadgroup:")
    void dispatchThreadsThreadsPerThreadgroup(@ByValue MTLSize threadsPerGrid, @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("setImageblockWidth:height:")
    void setImageblockWidthHeight(@NUInt long width, @NUInt long height);

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
    @Selector("dispatchType")
    @NUInt
    long dispatchType();

    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:")
    void executeCommandsInBufferIndirectBufferIndirectBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandbuffer,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectRangeBuffer, @NUInt long indirectBufferOffset);

    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    @Generated
    @Selector("memoryBarrierWithResources:count:")
    void memoryBarrierWithResourcesCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count);

    @Generated
    @Selector("memoryBarrierWithScope:")
    void memoryBarrierWithScope(@NUInt long scope);

    @Generated
    @Selector("setStageInRegionWithIndirectBuffer:indirectBufferOffset:")
    void setStageInRegionWithIndirectBufferIndirectBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);

    @Generated
    @Selector("setAccelerationStructure:atBufferIndex:")
    void setAccelerationStructureAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure, @NUInt long bufferIndex);

    @Generated
    @Selector("setIntersectionFunctionTable:atBufferIndex:")
    void setIntersectionFunctionTableAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long bufferIndex);

    @Generated
    @Selector("setIntersectionFunctionTables:withBufferRange:")
    void setIntersectionFunctionTablesWithBufferRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables, @ByValue NSRange range);

    @Generated
    @Selector("setVisibleFunctionTable:atBufferIndex:")
    void setVisibleFunctionTableAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable visibleFunctionTable, @NUInt long bufferIndex);

    @Generated
    @Selector("setVisibleFunctionTables:withBufferRange:")
    void setVisibleFunctionTablesWithBufferRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> visibleFunctionTables, @ByValue NSRange range);
}
