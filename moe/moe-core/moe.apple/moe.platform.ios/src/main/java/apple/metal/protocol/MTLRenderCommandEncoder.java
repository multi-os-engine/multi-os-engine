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

/**
 * @protocol MTLRenderCommandEncoder
 * @discussion MTLRenderCommandEncoder is a container for graphics rendering state and the code to translate the state into a command format that the device can execute. 
 */
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

    /**
     * @method drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:
     * @brief Draw primitives with an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param indexCount The number of indexes to read from the index buffer for each instance.
     * @param indexType The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from.  @a indexBufferOffset must be a multiple of the index size.
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffset(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer,
            @NUInt long indexBufferOffset);

    /**
     * @method drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:
     * @brief Draw primitives with an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param indexCount The number of indexes to read from the index buffer for each instance.
     * @param indexType The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from.  @a indexBufferOffset must be a multiple of the index size.
     * @param instanceCount The number of instances drawn.
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCount(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer,
            @NUInt long indexBufferOffset, @NUInt long instanceCount);

    /**
     * @method drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:
     * @brief Draw primitives with an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param indexCount The number of indexes to read from the index buffer for each instance.
     * @param indexType The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from.  @a indexBufferOffset must be a multiple of the index size.
     * @param instanceCount The number of instances drawn.
     * @param baseVertex Offset for vertex_id. NOTE: this can be negative
     * @param baseInstance Offset for instance_id.
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCountBaseVertexBaseInstance(
            @NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

    /**
     * @method drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:
     * @brief Draw primitives with an index list using an indirect buffer see MTLDrawIndexedPrimitivesIndirectArguments.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param indexType The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from.  @a indexBufferOffset must be a multiple of the index size.
     * @param indirectBuffer A buffer object that the device will read drawIndexedPrimitives arguments from, see MTLDrawIndexedPrimitivesIndirectArguments.
     * @param indirectBufferOffset Byte offset within @a indirectBuffer to start reading indexes from.  @a indirectBufferOffset must be a multiple of 4.
     */
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

    /**
     * @method drawPrimitives:indirectBuffer:indirectBufferOffset:
     * @brief Draw primitives without an index list using an indirect buffer see MTLDrawPrimitivesIndirectArguments.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param indirectBuffer A buffer object that the device will read drawPrimitives arguments from, see MTLDrawPrimitivesIndirectArguments.
     * @param indirectBufferOffset Byte offset within @a indirectBuffer to start reading indexes from.  @a indirectBufferOffset must be a multiple of 4.
     */
    @Generated
    @Selector("drawPrimitives:indirectBuffer:indirectBufferOffset:")
    void drawPrimitivesIndirectBufferIndirectBufferOffset(@NUInt long primitiveType,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * @method drawPrimitives:vertexStart:vertexCount:
     * @brief Draw primitives without an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart For each instance, the first index to draw
     * @param vertexCount For each instance, the number of indexes to draw
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:")
    void drawPrimitivesVertexStartVertexCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount);

    /**
     * @method drawPrimitives:vertexStart:vertexCount:instanceCount:
     * @brief Draw primitives without an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart For each instance, the first index to draw
     * @param vertexCount For each instance, the number of indexes to draw
     * @param instanceCount The number of instances drawn.
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    void drawPrimitivesVertexStartVertexCountInstanceCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount, @NUInt long instanceCount);

    /**
     * @method drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:
     * @brief Draw primitives without an index list.
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart For each instance, the first index to draw
     * @param vertexCount For each instance, the number of indexes to draw
     * @param instanceCount The number of instances drawn.
     * @param baseInstance Offset for instance_id.
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
            @NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);

    /**
     * Constant Blend Color
     * @method setBlendColorRed:green:blue:alpha:
     * @brief Set the constant blend color used across all blending on all render targets
     */
    @Generated
    @Selector("setBlendColorRed:green:blue:alpha:")
    void setBlendColorRedGreenBlueAlpha(float red, float green, float blue, float alpha);

    /**
     * @method setColorStoreAction:atIndex:
     * @brief If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setColorStoreAction:atIndex: must be used to finalize the store action before endEncoding is called.
     * @param storeAction The desired store action for the given color attachment.  This may be set to any value other than MTLStoreActionUnknown.
     * @param colorAttachmentIndex The index of the color attachment
     */
    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    /**
     * @method setCullMode:
     * @brief Controls if primitives are culled when front facing, back facing, or not culled at all.
     */
    @Generated
    @Selector("setCullMode:")
    void setCullMode(@NUInt long cullMode);

    /**
     * @method setDepthBias:slopeScale:clamp:
     * @brief Depth Bias.
     */
    @Generated
    @Selector("setDepthBias:slopeScale:clamp:")
    void setDepthBiasSlopeScaleClamp(float depthBias, float slopeScale, float clamp);

    /**
     * @method setDepthStencilState:
     * @brief Set the DepthStencil state object.
     */
    @Generated
    @Selector("setDepthStencilState:")
    void setDepthStencilState(@Mapped(ObjCObjectMapper.class) MTLDepthStencilState depthStencilState);

    /**
     * @method setDepthStoreAction:
     * @brief If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setDepthStoreAction: must be used to finalize the store action before endEncoding is called.
     */
    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    /**
     * @method setFragmentBuffer:offset:atIndex:
     * @brief Set a global buffer for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentBuffer:offset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * @method setFragmentBufferOffset:atIndex:
     * @brief Set the offset within the current global buffer for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentBufferOffset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * @method setFragmentBuffers:offsets:withRange:
     * @brief Set an array of global buffers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentBuffers:offsets:withRange:")
    void setFragmentBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * @method setFragmentBytes:length:atIndex:
     * @brief Set the data (by copy) for a given fragment buffer binding point.  This will remove any existing MTLBuffer from the binding point.
     */
    @Generated
    @Selector("setFragmentBytes:length:atIndex:")
    void setFragmentBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * @method setFragmentSamplerState:atIndex:
     * @brief Set a global sampler for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentSamplerState:atIndex:")
    void setFragmentSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * @method setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * @brief Set a global sampler for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setFragmentSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    /**
     * @method setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * @brief Set an array of global samplers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setFragmentSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * @method setFragmentSamplerStates:withRange:
     * @brief Set an array of global samplers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentSamplerStates:withRange:")
    void setFragmentSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * @method setFragmentTexture:atIndex:
     * @brief Set a global texture for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentTexture:atIndex:")
    void setFragmentTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * @method setFragmentTextures:withRange:
     * @brief Set an array of global textures for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentTextures:withRange:")
    void setFragmentTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * @method setFrontFacingWinding:
     * @brief The winding order of front-facing primitives.
     */
    @Generated
    @Selector("setFrontFacingWinding:")
    void setFrontFacingWinding(@NUInt long frontFacingWinding);

    /**
     * @method setRenderPipelineState
     * @brief Sets the current render pipeline state object.
     */
    @Generated
    @Selector("setRenderPipelineState:")
    void setRenderPipelineState(@Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipelineState);

    /**
     * @method setScissorRect:
     * @brief Specifies a rectangle for a fragment scissor test.  All fragments outside of this rectangle are discarded.
     */
    @Generated
    @Selector("setScissorRect:")
    void setScissorRect(@ByValue MTLScissorRect rect);

    /**
     * @method setStencilFrontReferenceValue:backReferenceValue:
     * @brief Set the stencil reference value for the back and front stencil buffers independently.
     */
    @Generated
    @Selector("setStencilFrontReferenceValue:backReferenceValue:")
    void setStencilFrontReferenceValueBackReferenceValue(int frontReferenceValue, int backReferenceValue);

    /**
     * @method setStencilReferenceValue:
     * @brief Set the stencil reference value for both the back and front stencil buffers.
     */
    @Generated
    @Selector("setStencilReferenceValue:")
    void setStencilReferenceValue(int referenceValue);

    /**
     * @method setStencilStoreAction:
     * @brief If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setStencilStoreAction: must be used to finalize the store action before endEncoding is called.
     */
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

    /**
     * @method setTriangleFillMode:
     * @brief Set how to rasterize triangle and triangle strip primitives.
     */
    @Generated
    @Selector("setTriangleFillMode:")
    void setTriangleFillMode(@NUInt long fillMode);

    /**
     * @method setVertexBuffer:offset:atIndex:
     * @brief Set a global buffer for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexBuffer:offset:atIndex:")
    void setVertexBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * @method setVertexBufferOffset:atIndex:
     * @brief Set the offset within the current global buffer for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexBufferOffset:atIndex:")
    void setVertexBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * @method setVertexBuffers:offsets:withRange:
     * @brief Set an array of global buffers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexBuffers:offsets:withRange:")
    void setVertexBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * @method setVertexBytes:length:atIndex:
     * @brief Set the data (by copy) for a given vertex buffer binding point.  This will remove any existing MTLBuffer from the binding point.
     */
    @Generated
    @Selector("setVertexBytes:length:atIndex:")
    void setVertexBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * @method setVertexSamplerState:atIndex:
     * @brief Set a global sampler for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexSamplerState:atIndex:")
    void setVertexSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * @method setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * @brief Set a global sampler for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setVertexSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    /**
     * @method setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * @brief Set an array of global samplers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setVertexSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * @method setVertexSamplerStates:withRange:
     * @brief Set an array of global samplers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexSamplerStates:withRange:")
    void setVertexSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * @method setVertexTexture:atIndex:
     * @brief Set a global texture for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexTexture:atIndex:")
    void setVertexTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * @method setVertexTextures:withRange:
     * @brief Set an array of global textures for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexTextures:withRange:")
    void setVertexTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * @method setViewport:
     * @brief Set the viewport, which is used to transform vertexes from normalized device coordinates to window coordinates.  Fragments that lie outside of the viewport are clipped, and optionally clamped for fragments outside of znear/zfar.
     */
    @Generated
    @Selector("setViewport:")
    void setViewport(@ByValue MTLViewport viewport);

    /**
     * @method setVisibilityResultMode:offset:
     * @abstract Monitor if samples pass the depth and stencil tests.
     * @param mode Controls if the counter is disabled or moniters passing samples.
     * @param offset The offset relative to the occlusion query buffer provided when the command encoder was created.  offset must be a multiple of 8.
     */
    @Generated
    @Selector("setVisibilityResultMode:offset:")
    void setVisibilityResultModeOffset(@NUInt long mode, @NUInt long offset);

    /**
     * @method updateFence:afterStages:
     * @abstract Update the fence to capture all GPU work so far enqueued by this encoder for the given stages.
     * @discussion Unlike <st>updateFence:</st>, this method will update the fence when the given stage(s) complete, allowing for commands to overlap in execution.
     * On iOS, render command encoder fence updates are always delayed until the end of the encoder.
     */
    @Generated
    @Selector("updateFence:afterStages:")
    void updateFenceAfterStages(@Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    /**
     * @method waitForFence:beforeStages:
     * @abstract Prevent further GPU work until the fence is reached for the given stages.
     * @discussion Unlike <st>waitForFence:</st>, this method will only block commands assoicated with the given stage(s), allowing for commands to overlap in execution.
     * On iOS, render command encoder fence waits always occur the beginning of the encoder.
     */
    @Generated
    @Selector("waitForFence:beforeStages:")
    void waitForFenceBeforeStages(@Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    /**
     * @method dispatchThreadsPerTile:
     * @brief dispatch threads to perform a mid-render compute operation.
     */
    @Generated
    @Selector("dispatchThreadsPerTile:")
    void dispatchThreadsPerTile(@ByValue MTLSize threadsPerTile);

    /**
     * @method setColorStoreActionOptions:atIndex:
     * @brief If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setColorStoreActionOptions:atIndex: may be used to finalize the store action options before endEncoding is called.
     * @param storeActionOptions The desired store action options for the given color attachment.
     * @param colorAttachmentIndex The index of the color attachment
     */
    @Generated
    @Selector("setColorStoreActionOptions:atIndex:")
    void setColorStoreActionOptionsAtIndex(@NUInt long storeActionOptions, @NUInt long colorAttachmentIndex);

    /**
     * @method setDepthClipMode:
     * @brief Controls what is done with fragments outside of the near or far planes.
     */
    @Generated
    @Selector("setDepthClipMode:")
    void setDepthClipMode(@NUInt long depthClipMode);

    /**
     * @method setDepthStoreActionOptions:
     * @brief If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setDepthStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     */
    @Generated
    @Selector("setDepthStoreActionOptions:")
    void setDepthStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * @method setStencilStoreActionOptions:
     * @brief If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command encoder was created,
     * setStencilStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     */
    @Generated
    @Selector("setStencilStoreActionOptions:")
    void setStencilStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * @method setThreadgroupMemoryLength:offset:atIndex:
     * @brief Set the size of the threadgroup memory argument at the given bind point index and offset.
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:offset:atIndex:")
    void setThreadgroupMemoryLengthOffsetAtIndex(@NUInt long length, @NUInt long offset, @NUInt long index);

    /**
     * @method setTileBuffer:offset:atIndex:
     * @brief Set a global buffer for all tile shaders at the given bind point index.
     */
    @Generated
    @Selector("setTileBuffer:offset:atIndex:")
    void setTileBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * @method setTileBufferOffset:atIndex:
     * @brief Set the offset within the current global buffer for all tile shaders at the given bind point index.
     */
    @Generated
    @Selector("setTileBufferOffset:atIndex:")
    void setTileBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * @method setTileBuffers:offsets:withRange:
     * @brief Set an array of global buffers for all tile shaders with the given bind point range.
     */
    @Generated
    @Selector("setTileBuffers:offsets:withRange:")
    void setTileBuffersOffsetsWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * @method setTileBytes:length:atIndex:
     * @brief Set the data (by copy) for a given tile buffer binding point.  This will remove any existing MTLBuffer from the binding point.
     */
    @Generated
    @Selector("setTileBytes:length:atIndex:")
    void setTileBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * @method setTileSamplerState:atIndex:
     * @brief Set a global sampler for all tile shaders at the given bind point index.
     */
    @Generated
    @Selector("setTileSamplerState:atIndex:")
    void setTileSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, @NUInt long index);

    /**
     * @method setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * @brief Set a global sampler for all tile shaders at the given bind point index.
     */
    @Generated
    @Selector("setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setTileSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            float lodMinClamp, float lodMaxClamp, @NUInt long index);

    /**
     * @method setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * @brief Set an array of global samplers for all tile shaders with the given bind point range.
     */
    @Generated
    @Selector("setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setTileSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * @method setTileSamplerStates:withRange:
     * @brief Set an array of global samplers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setTileSamplerStates:withRange:")
    void setTileSamplerStatesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * @method setTileTexture:atIndex:
     * @brief Set a global texture for all tile shaders at the given bind point index.
     */
    @Generated
    @Selector("setTileTexture:atIndex:")
    void setTileTextureAtIndex(@Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * @method setTileTextures:withRange:
     * @brief Set an array of global textures for all tile shaders with the given bind point range.
     */
    @Generated
    @Selector("setTileTextures:withRange:")
    void setTileTexturesWithRange(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * @property tileHeight:
     * @abstract The height of the tile for this render pass.
     */
    @Generated
    @Selector("tileHeight")
    @NUInt
    long tileHeight();

    /**
     * @property tileWidth:
     * @abstract The width of the tile for this render pass.
     */
    @Generated
    @Selector("tileWidth")
    @NUInt
    long tileWidth();

    /**
     * @method useHeap:
     * @abstract Declare that the resources allocated from a heap may be accessed by the render pass through an argument buffer
     * @discussion This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resources allocated from the heap through an argument buffer. This method may cause all of the color attachments allocated from the heap to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     */
    @Generated
    @Selector("useHeap:")
    void useHeap(@Mapped(ObjCObjectMapper.class) MTLHeap heap);

    /**
     * @method useHeaps:count:
     * @abstract Declare that the resources allocated from an array of heaps may be accessed by the render pass through an argument buffer
     * @discussion This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resources allocated from the heaps through an argument buffer. This method may cause all of the color attachments allocated from the heaps to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     */
    @Generated
    @Selector("useHeaps:count:")
    void useHeapsCount(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count);

    /**
     * * @method useResource:usage:
     * * @abstract Declare that a resource may be accessed by the render pass through an argument buffer
     * * @discussion This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resource through an argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     *     Note that calling useResource does not retain the resource. It is the responsiblity of the user to retain the resource until
     *     the command buffer has been executed.
     */
    @Generated
    @Selector("useResource:usage:")
    void useResourceUsage(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage);

    /**
     * * @method useResources:count:usage:
     * * @abstract Declare that an array of resources may be accessed through an argument buffer by the render pass
     * * @discussion This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resources through an argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     *   Note that calling useResources does not retain the resources. It is the responsiblity of the user to retain the resources until
     *   the command buffer has been executed.
     */
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

    /**
     * @method executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:
     * @abstract Execute commands in the buffer within the range specified by the indirect range buffer.
     * @param indirectRangeBuffer An indirect buffer from which the device reads the execution range parameter, as laid out in the MTLIndirectCommandBufferExecutionRange structure.
     * @param indirectBufferOffset The byte offset within indirectBuffer where the execution range parameter is located. Must be a multiple of 4 bytes.
     * @discussion The same indirect command buffer may be executed any number of times within the same encoder.
     */
    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:")
    void executeCommandsInBufferIndirectBufferIndirectBufferOffset(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandbuffer,
            @Mapped(ObjCObjectMapper.class) MTLBuffer indirectRangeBuffer, @NUInt long indirectBufferOffset);

    /**
     * @method executeCommandsInBuffer:withRange:
     * @abstract Execute commands in the buffer within the range specified.
     * @discussion The same indirect command buffer may be executed any number of times within the same encoder.
     */
    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    /**
     * @method setScissorRects:
     * @brief Specifies an array of rectangles for a fragment scissor test. The specific rectangle used is based on the [[ viewport_array_index ]] value output by the vertex shader. Fragments that lie outside the scissor rectangle are discarded.
     */
    @Generated
    @Selector("setScissorRects:count:")
    void setScissorRectsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLScissorRect scissorRects,
            @NUInt long count);

    /**
     * @method setVertexAmplificationCount:
     * @brief Specifies the vertex amplification count and associated view mappings for each amplification ID.
     * @param count the amplification count. The maximum value is currently 2.
     * @param viewMappings an array of mapping elements.
     * @discussion Each mapping element describes how to route the corresponding amplification ID to a specific viewport and render target array index by using offsets from the base array index provided by the [[render_target_array_index]] and/or [[viewport_array_index]] output attributes in the vertex shader. This allows a modicum of programmability for each amplified vertex to be routed to a different [[render_target_array_index]] and [[viewport_array_index]] even though these attribytes cannot be amplified themselves.
     */
    @Generated
    @Selector("setVertexAmplificationCount:viewMappings:")
    void setVertexAmplificationCountViewMappings(@NUInt long count,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLVertexAmplificationViewMapping viewMappings);

    /**
     * @method setViewports:
     * @brief Specifies an array of viewports, which are used to transform vertices from normalized device coordinates to window coordinates based on [[ viewport_array_index ]] value specified in the vertex shader.
     */
    @Generated
    @Selector("setViewports:count:")
    void setViewportsCount(@UncertainArgument("Options: reference, array Fallback: reference") MTLViewport viewports,
            @NUInt long count);

    /**
     * @method useHeap:stages
     * @abstract Declare that the resources allocated from a heap may be accessed by the render pass through an argument buffer
     * @discussion If the heap is tracked, this method protects against hazard tracking; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resources allocated from the heap through an argument buffer. This method may cause all of the color attachments allocated from the heap to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     */
    @Generated
    @Selector("useHeap:stages:")
    void useHeapStages(@Mapped(ObjCObjectMapper.class) MTLHeap heap, @NUInt long stages);

    /**
     * @method useHeaps:count:stages
     * @abstract Declare that the resources allocated from an array of heaps may be accessed by the render pass through an argument buffer
     * @discussion This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method must be called before encoding any draw commands which may access the resources allocated from the heaps through an argument buffer. This method may cause all of the color attachments allocated from the heaps to become decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     */
    @Generated
    @Selector("useHeaps:count:stages:")
    void useHeapsCountStages(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count,
            @NUInt long stages);

    /**
     * * @method useResources:usage:stage
     * * @abstract Declare that a resource may be accessed by the render pass through an argument buffer
     * * @For hazard tracked resources, this method protects against data hazards. This method must be called before encoding any draw commands which may access the resource through an argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     *    Note that calling useResource does not retain the resource. It is the responsiblity of the user to retain the resource until
     *    the command buffer has been executed.
     */
    @Generated
    @Selector("useResource:usage:stages:")
    void useResourceUsageStages(@Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage,
            @NUInt long stages);

    /**
     * * @method useResources:count:usage:stages
     * * @abstract Declare that an array of resources may be accessed through an argument buffer by the render pass
     * * @discussion For hazard tracked resources, this method protects against data hazards.  This method must be called before encoding any draw commands which may access the resources through an argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     *   Note that calling useResources does not retain the resources. It is the responsiblity of the user to retain the resources until
     *   the command buffer has been executed.
     */
    @Generated
    @Selector("useResources:count:usage:stages:")
    void useResourcesCountUsageStages(@ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count, @NUInt long usage, @NUInt long stages);

    /**
     * @method sampleCountersInBuffer:atSampleIndex:withBarrier:
     * @abstract Sample hardware counters at this point in the render encoder and
     * store the counter sample into the sample buffer at the specified index.
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex The index into the counter buffer to write the sample.
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
}
