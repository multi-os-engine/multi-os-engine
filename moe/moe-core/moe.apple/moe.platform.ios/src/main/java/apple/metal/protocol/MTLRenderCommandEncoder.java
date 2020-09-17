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
import apple.metal.struct.MTLScissorRect;
import apple.metal.struct.MTLSize;
import apple.metal.struct.MTLVertexAmplificationViewMapping;
import apple.metal.struct.MTLViewport;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
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
@ObjCProtocolName("MTLRenderCommandEncoder")
public interface MTLRenderCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:")
    void drawIndexedPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetControlPointIndexBufferControlPointIndexBufferOffsetInstanceCountBaseInstance(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @Mapped(ObjCObjectMapper.class) MTLBuffer controlPointIndexBuffer,
            @NUInt long controlPointIndexBufferOffset, @NUInt long instanceCount, @NUInt long baseInstance);

    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffset(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer,
            @NUInt long indexBufferOffset);

    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCount(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer,
            @NUInt long indexBufferOffset, @NUInt long instanceCount);

    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCountBaseVertexBaseInstance(
            @NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

    @Generated
    @Selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawIndexedPrimitivesIndexTypeIndexBufferIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long primitiveType, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer,
            @NUInt long indexBufferOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer,
            @NUInt long indirectBufferOffset);

    @Generated
    @Selector("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:")
    void drawPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetInstanceCountBaseInstance(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NUInt long instanceCount, @NUInt long baseInstance);

    @Generated
    @Selector("drawPrimitives:indirectBuffer:indirectBufferOffset:")
    void drawPrimitivesIndirectBufferIndirectBufferOffset(@NUInt long primitiveType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:")
    void drawPrimitivesVertexStartVertexCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount);

    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    void drawPrimitivesVertexStartVertexCountInstanceCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount, @NUInt long instanceCount);

    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
            @NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);

    @Generated
    @Selector("setBlendColorRed:green:blue:alpha:")
    void setBlendColorRedGreenBlueAlpha(float red, float green, float blue, float alpha);

    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    @Generated
    @Selector("setCullMode:")
    void setCullMode(@NUInt long cullMode);

    @Generated
    @Selector("setDepthBias:slopeScale:clamp:")
    void setDepthBiasSlopeScaleClamp(float depthBias, float slopeScale, float clamp);

    @Generated
    @Selector("setDepthStencilState:")
    void setDepthStencilState(@Mapped(ObjCObjectMapper.class) MTLDepthStencilState depthStencilState);

    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    @Generated
    @Selector("setFragmentBuffer:offset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setFragmentBufferOffset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setFragmentBuffers:offsets:withRange:")
    void setFragmentBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setFragmentBytes:length:atIndex:")
    void setFragmentBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    @Generated
    @Selector("setFragmentSamplerState:atIndex:")
    void setFragmentSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    @Generated
    @Selector("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setFragmentSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    @Generated
    @Selector("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setFragmentSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    @Generated
    @Selector("setFragmentSamplerStates:withRange:")
    void setFragmentSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setFragmentTexture:atIndex:")
    void setFragmentTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    @Generated
    @Selector("setFragmentTextures:withRange:")
    void setFragmentTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    @Generated
    @Selector("setFrontFacingWinding:")
    void setFrontFacingWinding(@NUInt long frontFacingWinding);

    @Generated
    @Selector("setRenderPipelineState:")
    void setRenderPipelineState(@Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipelineState);

    @Generated
    @Selector("setScissorRect:")
    void setScissorRect(@ByValue MTLScissorRect rect);

    @Generated
    @Selector("setStencilFrontReferenceValue:backReferenceValue:")
    void setStencilFrontReferenceValueBackReferenceValue(int frontReferenceValue, int backReferenceValue);

    @Generated
    @Selector("setStencilReferenceValue:")
    void setStencilReferenceValue(int referenceValue);

    @Generated
    @Selector("setStencilStoreAction:")
    void setStencilStoreAction(@NUInt long storeAction);

    @Generated
    @Selector("setTessellationFactorBuffer:offset:instanceStride:")
    void setTessellationFactorBufferOffsetInstanceStride(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset, @NUInt long instanceStride);

    @Generated
    @Selector("setTessellationFactorScale:")
    void setTessellationFactorScale(float scale);

    @Generated
    @Selector("setTriangleFillMode:")
    void setTriangleFillMode(@NUInt long fillMode);

    @Generated
    @Selector("setVertexBuffer:offset:atIndex:")
    void setVertexBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setVertexBufferOffset:atIndex:")
    void setVertexBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setVertexBuffers:offsets:withRange:")
    void setVertexBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setVertexBytes:length:atIndex:")
    void setVertexBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    @Generated
    @Selector("setVertexSamplerState:atIndex:")
    void setVertexSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    @Generated
    @Selector("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setVertexSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    @Generated
    @Selector("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setVertexSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    @Generated
    @Selector("setVertexSamplerStates:withRange:")
    void setVertexSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setVertexTexture:atIndex:")
    void setVertexTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    @Generated
    @Selector("setVertexTextures:withRange:")
    void setVertexTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    @Generated
    @Selector("setViewport:")
    void setViewport(@ByValue MTLViewport viewport);

    @Generated
    @Selector("setVisibilityResultMode:offset:")
    void setVisibilityResultModeOffset(@NUInt long mode, @NUInt long offset);

    @Generated
    @Selector("updateFence:afterStages:")
    void updateFenceAfterStages(@Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    @Generated
    @Selector("waitForFence:beforeStages:")
    void waitForFenceBeforeStages(@Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    @Generated
    @Selector("dispatchThreadsPerTile:")
    void dispatchThreadsPerTile(@ByValue MTLSize threadsPerTile);

    @Generated
    @Selector("setColorStoreActionOptions:atIndex:")
    void setColorStoreActionOptionsAtIndex(@NUInt long storeActionOptions, @NUInt long colorAttachmentIndex);

    @Generated
    @Selector("setDepthClipMode:")
    void setDepthClipMode(@NUInt long depthClipMode);

    @Generated
    @Selector("setDepthStoreActionOptions:")
    void setDepthStoreActionOptions(@NUInt long storeActionOptions);

    @Generated
    @Selector("setStencilStoreActionOptions:")
    void setStencilStoreActionOptions(@NUInt long storeActionOptions);

    @Generated
    @Selector("setThreadgroupMemoryLength:offset:atIndex:")
    void setThreadgroupMemoryLengthOffsetAtIndex(@NUInt long length, @NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setTileBuffer:offset:atIndex:")
    void setTileBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    @Generated
    @Selector("setTileBufferOffset:atIndex:")
    void setTileBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setTileBuffers:offsets:withRange:")
    void setTileBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setTileBytes:length:atIndex:")
    void setTileBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    @Generated
    @Selector("setTileSamplerState:atIndex:")
    void setTileSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    @Generated
    @Selector("setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setTileSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    @Generated
    @Selector("setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setTileSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    @Generated
    @Selector("setTileSamplerStates:withRange:")
    void setTileSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    @Generated
    @Selector("setTileTexture:atIndex:")
    void setTileTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    @Generated
    @Selector("setTileTextures:withRange:")
    void setTileTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    @Generated
    @Selector("tileHeight")
    @NUInt
    long tileHeight();

    @Generated
    @Selector("tileWidth")
    @NUInt
    long tileWidth();

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
    @Selector("drawIndexedPatches:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawIndexedPatchesPatchIndexBufferPatchIndexBufferOffsetControlPointIndexBufferControlPointIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long numberOfPatchControlPoints, @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer,
            @NUInt long patchIndexBufferOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer controlPointIndexBuffer,
            @NUInt long controlPointIndexBufferOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer,
            @NUInt long indirectBufferOffset);

    @Generated
    @Selector("drawPatches:patchIndexBuffer:patchIndexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawPatchesPatchIndexBufferPatchIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long numberOfPatchControlPoints, @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer,
            @NUInt long patchIndexBufferOffset, @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer,
            @NUInt long indirectBufferOffset);

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
    @Selector("setScissorRects:count:")
    void setScissorRectsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLScissorRect scissorRects,
            @NUInt long count);

    @Generated
    @Selector("setVertexAmplificationCount:viewMappings:")
    void setVertexAmplificationCountViewMappings(@NUInt long count,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLVertexAmplificationViewMapping viewMappings);

    @Generated
    @Selector("setViewports:count:")
    void setViewportsCount(@UncertainArgument("Options: reference, array Fallback: reference") MTLViewport viewports,
            @NUInt long count);

    @Generated
    @Selector("useHeap:stages:")
    void useHeapStages(@Mapped(ObjCObjectMapper.class) MTLHeap heap, @NUInt long stages);

    @Generated
    @Selector("useHeaps:count:stages:")
    void useHeapsCountStages(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count,
            @NUInt long stages);

    @Generated
    @Selector("useResource:usage:stages:")
    void useResourceUsageStages(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage,
            @NUInt long stages);

    @Generated
    @Selector("useResources:count:usage:stages:")
    void useResourcesCountUsageStages(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count, @NUInt long usage, @NUInt long stages);

    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);
}
