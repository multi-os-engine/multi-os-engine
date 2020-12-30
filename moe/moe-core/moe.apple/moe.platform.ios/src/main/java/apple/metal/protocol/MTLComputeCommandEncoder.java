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

/**
 * [@protocol] MTLComputeCommandEncoder
 * 
 * A command encoder that writes data parallel compute commands.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLComputeCommandEncoder")
public interface MTLComputeCommandEncoder extends MTLCommandEncoder {
    /**
     * dispatchThreadgroups:threadsPerThreadgroup:
     * 
     * Enqueue a compute function dispatch as a multiple of the threadgroup size.
     */
    @Generated
    @Selector("dispatchThreadgroups:threadsPerThreadgroup:")
    void dispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:
     * 
     * Enqueue a compute function dispatch using an indirect buffer for threadgroupsPerGrid see MTLDispatchThreadgroupsIndirectArguments.
     * 
     * @param indirectBuffer A buffer object that the device will read dispatchThreadgroups arguments from, see MTLDispatchThreadgroupsIndirectArguments.
     * @param indirectBufferOffset Byte offset within @a indirectBuffer to read arguments from.  @a indirectBufferOffset must be a multiple of 4.
     */
    @Generated
    @Selector("dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:")
    void dispatchThreadgroupsWithIndirectBufferIndirectBufferOffsetThreadsPerThreadgroup(
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset,
            @ByValue MTLSize threadsPerThreadgroup);

    /**
     * setBuffer:offset:atIndex:
     * 
     * Set a global buffer for all compute kernels at the given bind point index.
     */
    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all compute kernels at the given bind point index.
     */
    @Generated
    @Selector("setBufferOffset:atIndex:")
    void setBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all compute kernels with the given bind point range.
     */
    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given buffer binding point.  This will remove any existing MTLBuffer from the binding point.
     */
    @Generated
    @Selector("setBytes:length:atIndex:")
    void setBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setComputePipelineState:
     * 
     * Set the compute pipeline state that will be used.
     */
    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@Mapped(ObjCObjectMapper.class) MTLComputePipelineState state);

    /**
     * setSamplerState:atIndex:
     * 
     * Set a global sampler for all compute kernels at the given bind point index.
     */
    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * setSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all compute kernels at the given bind point index.
     */
    @Generated
    @Selector("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    /**
     * setSamplers:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all compute kernels with the given bind point range.
     */
    @Generated
    @Selector("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setSamplers:withRange:
     * 
     * Set an array of global samplers for all compute kernels with the given bind point range.
     */
    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setStageInRegion:region:
     * 
     * Set the region of the stage_in attributes to apply the compute kernel.
     */
    @Generated
    @Selector("setStageInRegion:")
    void setStageInRegion(@ByValue MTLRegion region);

    /**
     * setTexture:atIndex:
     * 
     * Set a global texture for all compute kernels at the given bind point index.
     */
    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setTextures:withRange:
     * 
     * Set an array of global textures for all compute kernels with the given bind point range.
     */
    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures, @ByValue NSRange range);

    /**
     * setThreadgroupMemoryLength:atIndex:
     * 
     * Set the threadgroup memory byte length at the binding point specified by the index. This applies to all compute kernels.
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * updateFence:
     * 
     * Update the fence to capture all GPU work so far enqueued by this encoder.
     * 
     * The fence is updated at kernel submission to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("updateFence:")
    void updateFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * waitForFence:
     * 
     * Prevent further GPU work until the fence is reached.
     * 
     * The fence is evaluated at kernel submision to maintain global order and prevent deadlock.
     * Drivers may delay fence updates until the end of the encoder. Drivers may also wait on fences at the beginning of an encoder. It is therefore illegal to wait on a fence after it has been updated in the same encoder.
     */
    @Generated
    @Selector("waitForFence:")
    void waitForFence(@Mapped(ObjCObjectMapper.class) MTLFence fence);

    /**
     * dispatchThreads:threadsPerThreadgroup:
     * 
     * Enqueue a compute function dispatch using an arbitrarily-sized grid.
     * 
     * threadsPerGrid does not have to be a multiple of the  threadGroup size
     */
    @Generated
    @Selector("dispatchThreads:threadsPerThreadgroup:")
    void dispatchThreadsThreadsPerThreadgroup(@ByValue MTLSize threadsPerGrid, @ByValue MTLSize threadsPerThreadgroup);

    /**
     * setImageblockWidth:height:
     * 
     * Set imageblock sizes.
     */
    @Generated
    @Selector("setImageblockWidth:height:")
    void setImageblockWidthHeight(@NUInt long width, @NUInt long height);

    /**
     * useHeap:
     * 
     * Declare that the resources allocated from a heap may be accessed as readonly by the render pass through an argument buffer
     * 
     * For tracked MTLHeaps, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources allocated from the heap through an argument buffer. This method may cause all of the color attachments allocated from the heap to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useHeap:")
    void useHeap(@Mapped(ObjCObjectMapper.class) MTLHeap heap);

    /**
     * useHeaps:count:
     * 
     * Declare that the resources allocated from an array of heaps may be accessed as readonly by the render pass through an argument buffer
     * 
     * For tracked MTLHeaps, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources allocated from the heaps through an argument buffer. This method may cause all of the color attachments allocated from the heaps to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useHeaps:count:")
    void useHeapsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count);

    /**
     * useResource:usage:
     * 
     * Declare that a resource may be accessed by the command encoder through an argument buffer
     * 
     * For tracked MTLResources, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resource through an argument buffer.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useResource:usage:")
    void useResourceUsage(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage);

    /**
     * useResources:count:usage:
     * 
     * Declare that an array of resources may be accessed through an argument buffer by the command encoder
     * 
     * For tracked MTL Resources, this method protects against data hazards. This method must be called before encoding any dispatch commands which may access the resources through an argument buffer.
     * [@warning] Prior to iOS 13, macOS 10.15, this method does not protect against data hazards. If you are deploying to older versions of macOS or iOS, use fences to ensure data hazards are resolved.
     */
    @Generated
    @Selector("useResources:count:usage:")
    void useResourcesCountUsage(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources, @NUInt long count,
            @NUInt long usage);

    /**
     * [@property] dispatchType
     * 
     * The dispatch type of the compute command encoder.
     */
    @Generated
    @Selector("dispatchType")
    @NUInt
    long dispatchType();

    /**
     * executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:
     * 
     * Execute commands in the buffer within the range specified by the indirect range buffer.
     * 
     * The same indirect command buffer may be executed any number of times within the same encoder.
     * 
     * @param indirectRangeBuffer An indirect buffer from which the device reads the execution range parameter, as laid out in the MTLIndirectCommandBufferExecutionRange structure.
     * @param indirectBufferOffset The byte offset within indirectBuffer where the execution range parameter is located. Must be a multiple of 4 bytes.
     */
    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:")
    void executeCommandsInBufferIndirectBufferIndirectBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandbuffer,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectRangeBuffer, @NUInt long indirectBufferOffset);

    /**
     * executeCommandsInBuffer:withRange:
     * 
     * Execute commands in the buffer within the range specified.
     * 
     * The same indirect command buffer may be executed any number of times within the same encoder.
     */
    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    /**
     * memoryBarrierWithResources
     * 
     * Encodes a barrier between currently dispatched kernels in a concurrent compute command encoder and any subsequent ones on an array of resources.
     * 
     * This API ensures that all dispatches in the encoder have completed execution and side effects on the specified resources are visible to subsequent dispatches in that encoder. Calling barrier on a serial encoder is allowed, but ignored.
     */
    @Generated
    @Selector("memoryBarrierWithResources:count:")
    void memoryBarrierWithResourcesCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count);

    /**
     * memoryBarrierWithScope
     * 
     * Encodes a barrier between currently dispatched kernels in a concurrent compute command encoder and any subsequent ones on a specified resource group
     * 
     * This API ensures that all dispatches in the encoder have completed execution and their side effects are visible to subsequent dispatches in that encoder. Calling barrier on a serial encoder is allowed, but ignored.
     */
    @Generated
    @Selector("memoryBarrierWithScope:")
    void memoryBarrierWithScope(@NUInt long scope);

    /**
     * setStageInRegionWithIndirectBuffer:indirectBufferOffset:
     * 
     * sets the stage in region indirectly for the following indirect dispatch calls.
     * 
     * @param indirectBuffer A buffer object that the device will read the stageIn region arguments from, see MTLStageInRegionIndirectArguments.
     * @param indirectBufferOffset Byte offset within indirectBuffer to read arguments from. indirectBufferOffset must be a multiple of 4.
     */
    @Generated
    @Selector("setStageInRegionWithIndirectBuffer:indirectBufferOffset:")
    void setStageInRegionWithIndirectBufferIndirectBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * sampleCountersInBuffer:atSampleIndex:withBarrier:
     * 
     * Sample hardware counters at this point in the compute encoder and
     * store the counter sample into the sample buffer at the specified index.
     * 
     * On devices where MTLCounterSamplingPointAtDispatchBoundary is unsupported,
     * this method is not available and will generate an error if called.
     * 
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex The index into the counter buffer to write the sample
     * @param barrier Insert a barrier before taking the sample.  Passing
     * YES will ensure that all work encoded before this operation in the encoder is
     * complete but does not isolate the work with respect to other encoders.  Passing
     * NO will allow the sample to be taken concurrently with other operations in this
     * encoder.
     * In general, passing YES will lead to more repeatable counter results but
     * may negatively impact performance.  Passing NO will generally be higher performance
     * but counter results may not be repeatable.
     */
    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);

    /**
     * setAccelerationStructure:atBufferIndex:
     * 
     * Set a global raytracing acceleration structure for all compute kernels at the given buffer bind point index.
     */
    @Generated
    @Selector("setAccelerationStructure:atBufferIndex:")
    void setAccelerationStructureAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure, @NUInt long bufferIndex);

    /**
     * setIntersectionFunctionTable:atBufferIndex:
     * 
     * Set a visible function table at the given buffer index
     */
    @Generated
    @Selector("setIntersectionFunctionTable:atBufferIndex:")
    void setIntersectionFunctionTableAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long bufferIndex);

    /**
     * setIntersectionFunctionTables:withBufferRange:
     * 
     * Set visible function tables at the given buffer index range
     */
    @Generated
    @Selector("setIntersectionFunctionTables:withBufferRange:")
    void setIntersectionFunctionTablesWithBufferRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables, @ByValue NSRange range);

    /**
     * setVisibleFunctionTable:atBufferIndex:
     * 
     * Set a visible function table at the given buffer index
     */
    @Generated
    @Selector("setVisibleFunctionTable:atBufferIndex:")
    void setVisibleFunctionTableAtBufferIndex(
            @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable visibleFunctionTable, @NUInt long bufferIndex);

    /**
     * setVisibleFunctionTables:withBufferRange:
     * 
     * Set visible function tables at the given buffer index range
     */
    @Generated
    @Selector("setVisibleFunctionTables:withBufferRange:")
    void setVisibleFunctionTablesWithBufferRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> visibleFunctionTables, @ByValue NSRange range);
}
