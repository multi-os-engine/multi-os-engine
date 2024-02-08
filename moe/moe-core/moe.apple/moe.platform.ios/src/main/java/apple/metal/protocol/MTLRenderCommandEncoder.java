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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLRenderCommandEncoder
 * 
 * MTLRenderCommandEncoder is a container for graphics rendering state and the code to translate the state into a
 * command format that the device can execute.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRenderCommandEncoder")
public interface MTLRenderCommandEncoder extends MTLCommandEncoder {
    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("drawIndexedPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:instanceCount:baseInstance:")
    void drawIndexedPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetControlPointIndexBufferControlPointIndexBufferOffsetInstanceCountBaseInstance(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer controlPointIndexBuffer,
            @NUInt long controlPointIndexBufferOffset, @NUInt long instanceCount, @NUInt long baseInstance);

    /**
     * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:
     * 
     * Draw primitives with an index list.
     * 
     * @param primitiveType     The type of primitives that elements are assembled into.
     * @param indexCount        The number of indexes to read from the index buffer for each instance.
     * @param indexType         The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer       A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from. @a indexBufferOffset
     *                          must be a multiple of the index size.
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffset(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset);

    /**
     * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:
     * 
     * Draw primitives with an index list.
     * 
     * @param primitiveType     The type of primitives that elements are assembled into.
     * @param indexCount        The number of indexes to read from the index buffer for each instance.
     * @param indexType         The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer       A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from. @a indexBufferOffset
     *                          must be a multiple of the index size.
     * @param instanceCount     The number of instances drawn.
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCount(@NUInt long primitiveType,
            @NUInt long indexCount, @NUInt long indexType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NUInt long instanceCount);

    /**
     * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:
     * 
     * Draw primitives with an index list.
     * 
     * @param primitiveType     The type of primitives that elements are assembled into.
     * @param indexCount        The number of indexes to read from the index buffer for each instance.
     * @param indexType         The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer       A buffer object that the device will read indexes from.
     * @param indexBufferOffset Byte offset within @a indexBuffer to start reading indexes from. @a indexBufferOffset
     *                          must be a multiple of the index size.
     * @param instanceCount     The number of instances drawn.
     * @param baseVertex        Offset for vertex_id. NOTE: this can be negative
     * @param baseInstance      Offset for instance_id.
     * 
     *                          API-Since: 9.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
    void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCountBaseVertexBaseInstance(
            @NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

    /**
     * drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:
     * 
     * Draw primitives with an index list using an indirect buffer see MTLDrawIndexedPrimitivesIndirectArguments.
     * 
     * @param primitiveType        The type of primitives that elements are assembled into.
     * @param indexType            The type if indexes, either 16 bit integer or 32 bit integer.
     * @param indexBuffer          A buffer object that the device will read indexes from.
     * @param indexBufferOffset    Byte offset within @a indexBuffer to start reading indexes from. @a indexBufferOffset
     *                             must be a multiple of the index size.
     * @param indirectBuffer       A buffer object that the device will read drawIndexedPrimitives arguments from, see
     *                             MTLDrawIndexedPrimitivesIndirectArguments.
     * @param indirectBufferOffset Byte offset within @a indirectBuffer to start reading indexes from. @a
     *                             indirectBufferOffset must be a multiple of 4.
     * 
     *                             API-Since: 9.0
     */
    @Generated
    @Selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawIndexedPrimitivesIndexTypeIndexBufferIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long primitiveType, @NUInt long indexType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indexBuffer, @NUInt long indexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("drawPatches:patchStart:patchCount:patchIndexBuffer:patchIndexBufferOffset:instanceCount:baseInstance:")
    void drawPatchesPatchStartPatchCountPatchIndexBufferPatchIndexBufferOffsetInstanceCountBaseInstance(
            @NUInt long numberOfPatchControlPoints, @NUInt long patchStart, @NUInt long patchCount,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NUInt long instanceCount, @NUInt long baseInstance);

    /**
     * drawPrimitives:indirectBuffer:indirectBufferOffset:
     * 
     * Draw primitives without an index list using an indirect buffer see MTLDrawPrimitivesIndirectArguments.
     * 
     * @param primitiveType        The type of primitives that elements are assembled into.
     * @param indirectBuffer       A buffer object that the device will read drawPrimitives arguments from, see
     *                             MTLDrawPrimitivesIndirectArguments.
     * @param indirectBufferOffset Byte offset within @a indirectBuffer to start reading indexes from. @a
     *                             indirectBufferOffset must be a multiple of 4.
     * 
     *                             API-Since: 9.0
     */
    @Generated
    @Selector("drawPrimitives:indirectBuffer:indirectBufferOffset:")
    void drawPrimitivesIndirectBufferIndirectBufferOffset(@NUInt long primitiveType,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * drawPrimitives:vertexStart:vertexCount:
     * 
     * Draw primitives without an index list.
     * 
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart   For each instance, the first index to draw
     * @param vertexCount   For each instance, the number of indexes to draw
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:")
    void drawPrimitivesVertexStartVertexCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount);

    /**
     * drawPrimitives:vertexStart:vertexCount:instanceCount:
     * 
     * Draw primitives without an index list.
     * 
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart   For each instance, the first index to draw
     * @param vertexCount   For each instance, the number of indexes to draw
     * @param instanceCount The number of instances drawn.
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:")
    void drawPrimitivesVertexStartVertexCountInstanceCount(@NUInt long primitiveType, @NUInt long vertexStart,
            @NUInt long vertexCount, @NUInt long instanceCount);

    /**
     * drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:
     * 
     * Draw primitives without an index list.
     * 
     * @param primitiveType The type of primitives that elements are assembled into.
     * @param vertexStart   For each instance, the first index to draw
     * @param vertexCount   For each instance, the number of indexes to draw
     * @param instanceCount The number of instances drawn.
     * @param baseInstance  Offset for instance_id.
     * 
     *                      API-Since: 9.0
     */
    @Generated
    @Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
    void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
            @NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);

    /**
     * Constant Blend Color
     * 
     * setBlendColorRed:green:blue:alpha:
     * 
     * Set the constant blend color used across all blending on all render targets
     */
    @Generated
    @Selector("setBlendColorRed:green:blue:alpha:")
    void setBlendColorRedGreenBlueAlpha(float red, float green, float blue, float alpha);

    /**
     * setColorStoreAction:atIndex:
     * 
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreAction:atIndex: must be used to finalize the store action before endEncoding is called.
     * 
     * @param storeAction          The desired store action for the given color attachment. This may be set to any value
     *                             other than MTLStoreActionUnknown.
     * @param colorAttachmentIndex The index of the color attachment
     * 
     *                             API-Since: 10.0
     */
    @Generated
    @Selector("setColorStoreAction:atIndex:")
    void setColorStoreActionAtIndex(@NUInt long storeAction, @NUInt long colorAttachmentIndex);

    /**
     * setCullMode:
     * 
     * Controls if primitives are culled when front facing, back facing, or not culled at all.
     */
    @Generated
    @Selector("setCullMode:")
    void setCullMode(@NUInt long cullMode);

    /**
     * setDepthBias:slopeScale:clamp:
     * 
     * Depth Bias.
     */
    @Generated
    @Selector("setDepthBias:slopeScale:clamp:")
    void setDepthBiasSlopeScaleClamp(float depthBias, float slopeScale, float clamp);

    /**
     * setDepthStencilState:
     * 
     * Set the DepthStencil state object.
     */
    @Generated
    @Selector("setDepthStencilState:")
    void setDepthStencilState(@Nullable @Mapped(ObjCObjectMapper.class) MTLDepthStencilState depthStencilState);

    /**
     * setDepthStoreAction:
     * 
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreAction: must be used to finalize the store action before endEncoding is called.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setDepthStoreAction:")
    void setDepthStoreAction(@NUInt long storeAction);

    /**
     * setFragmentBuffer:offset:atIndex:
     * 
     * Set a global buffer for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentBuffer:offset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setFragmentBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all fragment shaders at the given bind point index.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setFragmentBufferOffset:atIndex:")
    void setFragmentBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setFragmentBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentBuffers:offsets:withRange:")
    void setFragmentBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setFragmentBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given fragment buffer binding point. This will remove any existing MTLBuffer from
     * the binding point.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setFragmentBytes:length:atIndex:")
    void setFragmentBytesLengthAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setFragmentSamplerState:atIndex:
     * 
     * Set a global sampler for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentSamplerState:atIndex:")
    void setFragmentSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            @NUInt long index);

    /**
     * setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setFragmentSamplerStateLodMinClampLodMaxClampAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp,
            @NUInt long index);

    /**
     * setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setFragmentSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @NotNull ConstFloatPtr lodMinClamps, @NotNull ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setFragmentSamplerStates:withRange:
     * 
     * Set an array of global samplers for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentSamplerStates:withRange:")
    void setFragmentSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setFragmentTexture:atIndex:
     * 
     * Set a global texture for all fragment shaders at the given bind point index.
     */
    @Generated
    @Selector("setFragmentTexture:atIndex:")
    void setFragmentTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setFragmentTextures:withRange:
     * 
     * Set an array of global textures for all fragment shaders with the given bind point range.
     */
    @Generated
    @Selector("setFragmentTextures:withRange:")
    void setFragmentTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * setFrontFacingWinding:
     * 
     * The winding order of front-facing primitives.
     */
    @Generated
    @Selector("setFrontFacingWinding:")
    void setFrontFacingWinding(@NUInt long frontFacingWinding);

    /**
     * setRenderPipelineState
     * 
     * Sets the current render pipeline state object.
     */
    @Generated
    @Selector("setRenderPipelineState:")
    void setRenderPipelineState(@NotNull @Mapped(ObjCObjectMapper.class) MTLRenderPipelineState pipelineState);

    /**
     * setScissorRect:
     * 
     * Specifies a rectangle for a fragment scissor test. All fragments outside of this rectangle are discarded.
     */
    @Generated
    @Selector("setScissorRect:")
    void setScissorRect(@ByValue MTLScissorRect rect);

    /**
     * setStencilFrontReferenceValue:backReferenceValue:
     * 
     * Set the stencil reference value for the back and front stencil buffers independently.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setStencilFrontReferenceValue:backReferenceValue:")
    void setStencilFrontReferenceValueBackReferenceValue(int frontReferenceValue, int backReferenceValue);

    /**
     * setStencilReferenceValue:
     * 
     * Set the stencil reference value for both the back and front stencil buffers.
     */
    @Generated
    @Selector("setStencilReferenceValue:")
    void setStencilReferenceValue(int referenceValue);

    /**
     * setStencilStoreAction:
     * 
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreAction: must be used to finalize the store action before endEncoding is called.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("setStencilStoreAction:")
    void setStencilStoreAction(@NUInt long storeAction);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationFactorBuffer:offset:instanceStride:")
    void setTessellationFactorBufferOffsetInstanceStride(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer,
            @NUInt long offset, @NUInt long instanceStride);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("setTessellationFactorScale:")
    void setTessellationFactorScale(float scale);

    /**
     * setTriangleFillMode:
     * 
     * Set how to rasterize triangle and triangle strip primitives.
     */
    @Generated
    @Selector("setTriangleFillMode:")
    void setTriangleFillMode(@NUInt long fillMode);

    /**
     * setVertexBuffer:offset:atIndex:
     * 
     * Set a global buffer for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexBuffer:offset:atIndex:")
    void setVertexBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setVertexBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all vertex shaders at the given bind point index.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setVertexBufferOffset:atIndex:")
    void setVertexBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setVertexBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexBuffers:offsets:withRange:")
    void setVertexBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setVertexBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given vertex buffer binding point. This will remove any existing MTLBuffer from the
     * binding point.
     * 
     * API-Since: 8.3
     */
    @Generated
    @Selector("setVertexBytes:length:atIndex:")
    void setVertexBytesLengthAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setVertexSamplerState:atIndex:
     * 
     * Set a global sampler for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexSamplerState:atIndex:")
    void setVertexSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            @NUInt long index);

    /**
     * setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setVertexSamplerStateLodMinClampLodMaxClampAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp,
            @NUInt long index);

    /**
     * setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setVertexSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @NotNull ConstFloatPtr lodMinClamps, @NotNull ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setVertexSamplerStates:withRange:
     * 
     * Set an array of global samplers for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexSamplerStates:withRange:")
    void setVertexSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setVertexTexture:atIndex:
     * 
     * Set a global texture for all vertex shaders at the given bind point index.
     */
    @Generated
    @Selector("setVertexTexture:atIndex:")
    void setVertexTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setVertexTextures:withRange:
     * 
     * Set an array of global textures for all vertex shaders with the given bind point range.
     */
    @Generated
    @Selector("setVertexTextures:withRange:")
    void setVertexTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * setViewport:
     * 
     * Set the viewport, which is used to transform vertexes from normalized device coordinates to window coordinates.
     * Fragments that lie outside of the viewport are clipped, and optionally clamped for fragments outside of
     * znear/zfar.
     */
    @Generated
    @Selector("setViewport:")
    void setViewport(@ByValue MTLViewport viewport);

    /**
     * setVisibilityResultMode:offset:
     * 
     * Monitor if samples pass the depth and stencil tests.
     * 
     * @param mode   Controls if the counter is disabled or moniters passing samples.
     * @param offset The offset relative to the occlusion query buffer provided when the command encoder was created.
     *               offset must be a multiple of 8.
     */
    @Generated
    @Selector("setVisibilityResultMode:offset:")
    void setVisibilityResultModeOffset(@NUInt long mode, @NUInt long offset);

    /**
     * updateFence:afterStages:
     * 
     * Update the fence to capture all GPU work so far enqueued by this encoder for the given stages.
     * 
     * Unlike <st>updateFence:</st>, this method will update the fence when the given stage(s) complete, allowing for
     * commands to overlap in execution.
     * On iOS, render command encoder fence updates are always delayed until the end of the encoder.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("updateFence:afterStages:")
    void updateFenceAfterStages(@NotNull @Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    /**
     * waitForFence:beforeStages:
     * 
     * Prevent further GPU work until the fence is reached for the given stages.
     * 
     * Unlike <st>waitForFence:</st>, this method will only block commands assoicated with the given stage(s), allowing
     * for commands to overlap in execution.
     * On iOS, render command encoder fence waits always occur the beginning of the encoder.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("waitForFence:beforeStages:")
    void waitForFenceBeforeStages(@NotNull @Mapped(ObjCObjectMapper.class) MTLFence fence, @NUInt long stages);

    /**
     * dispatchThreadsPerTile:
     * 
     * dispatch threads to perform a mid-render compute operation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("dispatchThreadsPerTile:")
    void dispatchThreadsPerTile(@ByValue MTLSize threadsPerTile);

    /**
     * setColorStoreActionOptions:atIndex:
     * 
     * If the the store action for a given color attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setColorStoreActionOptions:atIndex: may be used to finalize the store action options before endEncoding is
     * called.
     * 
     * @param storeActionOptions   The desired store action options for the given color attachment.
     * @param colorAttachmentIndex The index of the color attachment
     * 
     *                             API-Since: 11.0
     */
    @Generated
    @Selector("setColorStoreActionOptions:atIndex:")
    void setColorStoreActionOptionsAtIndex(@NUInt long storeActionOptions, @NUInt long colorAttachmentIndex);

    /**
     * setDepthClipMode:
     * 
     * Controls what is done with fragments outside of the near or far planes.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDepthClipMode:")
    void setDepthClipMode(@NUInt long depthClipMode);

    /**
     * setDepthStoreActionOptions:
     * 
     * If the the store action for the depth attachment was set to MTLStoreActionUnknown when the render command encoder
     * was created,
     * setDepthStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setDepthStoreActionOptions:")
    void setDepthStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * setStencilStoreActionOptions:
     * 
     * If the the store action for the stencil attachment was set to MTLStoreActionUnknown when the render command
     * encoder was created,
     * setStencilStoreActionOptions: may be used to finalize the store action options before endEncoding is called.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setStencilStoreActionOptions:")
    void setStencilStoreActionOptions(@NUInt long storeActionOptions);

    /**
     * setThreadgroupMemoryLength:offset:atIndex:
     * 
     * Set the size of the threadgroup memory argument at the given bind point index and offset.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setThreadgroupMemoryLength:offset:atIndex:")
    void setThreadgroupMemoryLengthOffsetAtIndex(@NUInt long length, @NUInt long offset, @NUInt long index);

    /**
     * setTileBuffer:offset:atIndex:
     * 
     * Set a global buffer for all tile shaders at the given bind point index.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileBuffer:offset:atIndex:")
    void setTileBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setTileBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all tile shaders at the given bind point index.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileBufferOffset:atIndex:")
    void setTileBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setTileBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all tile shaders with the given bind point range.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileBuffers:offsets:withRange:")
    void setTileBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setTileBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given tile buffer binding point. This will remove any existing MTLBuffer from the
     * binding point.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileBytes:length:atIndex:")
    void setTileBytesLengthAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setTileSamplerState:atIndex:
     * 
     * Set a global sampler for all tile shaders at the given bind point index.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileSamplerState:atIndex:")
    void setTileSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            @NUInt long index);

    /**
     * setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all tile shaders at the given bind point index.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setTileSamplerStateLodMinClampLodMaxClampAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp,
            @NUInt long index);

    /**
     * setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all tile shaders with the given bind point range.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setTileSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @NotNull ConstFloatPtr lodMinClamps, @NotNull ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setTileSamplerStates:withRange:
     * 
     * Set an array of global samplers for all fragment shaders with the given bind point range.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileSamplerStates:withRange:")
    void setTileSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setTileTexture:atIndex:
     * 
     * Set a global texture for all tile shaders at the given bind point index.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileTexture:atIndex:")
    void setTileTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setTileTextures:withRange:
     * 
     * Set an array of global textures for all tile shaders with the given bind point range.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setTileTextures:withRange:")
    void setTileTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * [@property] tileHeight:
     * 
     * The height of the tile for this render pass.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("tileHeight")
    @NUInt
    long tileHeight();

    /**
     * [@property] tileWidth:
     * 
     * The width of the tile for this render pass.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("tileWidth")
    @NUInt
    long tileWidth();

    /**
     * useHeap:
     * 
     * Declare that the resources allocated from a heap may be accessed by the render pass through an argument buffer
     * 
     * This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method
     * must be called before encoding any draw commands which may access the resources allocated from the heap through
     * an argument buffer. This method may cause all of the color attachments allocated from the heap to become
     * decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be
     * used for color attachments instead, with a minimal (i.e. read-only) usage.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("useHeap:")
    void useHeap(@NotNull @Mapped(ObjCObjectMapper.class) MTLHeap heap);

    /**
     * useHeaps:count:
     * 
     * Declare that the resources allocated from an array of heaps may be accessed by the render pass through an
     * argument buffer
     * 
     * This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method
     * must be called before encoding any draw commands which may access the resources allocated from the heaps through
     * an argument buffer. This method may cause all of the color attachments allocated from the heaps to become
     * decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be
     * used for color attachments instead, with a minimal (i.e. read-only) usage.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("useHeaps:count:")
    void useHeapsCount(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count);

    /**
     * * @method useResource:usage:
     * * @abstract Declare that a resource may be accessed by the render pass through an argument buffer
     * * @discussion This method does not protect against data hazards; these hazards must be addressed using an
     * MTLFence. This method must be called before encoding any draw commands which may access the resource through an
     * argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method
     * should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e.
     * read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     * Note that calling useResource does not retain the resource. It is the responsiblity of the user to retain the
     * resource until
     * the command buffer has been executed.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("useResource:usage:")
    void useResourceUsage(@NotNull @Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage);

    /**
     * * @method useResources:count:usage:
     * * @abstract Declare that an array of resources may be accessed through an argument buffer by the render pass
     * * @discussion This method does not protect against data hazards; these hazards must be addressed using an
     * MTLFence. This method must be called before encoding any draw commands which may access the resources through an
     * argument buffer. However, this method may cause color attachments to become decompressed. Therefore, this method
     * should be called until as late as possible within a render command encoder. Declaring a minimal usage (i.e.
     * read-only) may prevent color attachments from becoming decompressed on some devices.
     * 
     * Note that calling useResources does not retain the resources. It is the responsiblity of the user to retain the
     * resources until
     * the command buffer has been executed.
     * 
     * API-Since: 11.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("useResources:count:usage:")
    void useResourcesCountUsage(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count, @NUInt long usage);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("drawIndexedPatches:patchIndexBuffer:patchIndexBufferOffset:controlPointIndexBuffer:controlPointIndexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawIndexedPatchesPatchIndexBufferPatchIndexBufferOffsetControlPointIndexBufferControlPointIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long numberOfPatchControlPoints,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer controlPointIndexBuffer,
            @NUInt long controlPointIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("drawPatches:patchIndexBuffer:patchIndexBufferOffset:indirectBuffer:indirectBufferOffset:")
    void drawPatchesPatchIndexBufferPatchIndexBufferOffsetIndirectBufferIndirectBufferOffset(
            @NUInt long numberOfPatchControlPoints,
            @Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer patchIndexBuffer, @NUInt long patchIndexBufferOffset,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset);

    /**
     * executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:
     * 
     * Execute commands in the buffer within the range specified by the indirect range buffer.
     * 
     * The same indirect command buffer may be executed any number of times within the same encoder.
     * 
     * API-Since: 13.0
     * 
     * @param indirectRangeBuffer  An indirect buffer from which the device reads the execution range parameter, as laid
     *                             out in the MTLIndirectCommandBufferExecutionRange structure.
     * @param indirectBufferOffset The byte offset within indirectBuffer where the execution range parameter is located.
     *                             Must be a multiple of 4 bytes.
     */
    @Generated
    @Selector("executeCommandsInBuffer:indirectBuffer:indirectBufferOffset:")
    void executeCommandsInBufferIndirectBufferIndirectBufferOffset(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandbuffer,
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectRangeBuffer, @NUInt long indirectBufferOffset);

    /**
     * executeCommandsInBuffer:withRange:
     * 
     * Execute commands in the buffer within the range specified.
     * 
     * The same indirect command buffer may be executed any number of times within the same encoder.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("executeCommandsInBuffer:withRange:")
    void executeCommandsInBufferWithRange(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLIndirectCommandBuffer indirectCommandBuffer,
            @ByValue NSRange executionRange);

    /**
     * setScissorRects:
     * 
     * Specifies an array of rectangles for a fragment scissor test. The specific rectangle used is based on the [[
     * viewport_array_index ]] value output by the vertex shader. Fragments that lie outside the scissor rectangle are
     * discarded.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setScissorRects:count:")
    void setScissorRectsCount(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLScissorRect scissorRects,
            @NUInt long count);

    /**
     * setVertexAmplificationCount:
     * 
     * Specifies the vertex amplification count and associated view mappings for each amplification ID.
     * 
     * Each mapping element describes how to route the corresponding amplification ID to a specific viewport and render
     * target array index by using offsets from the base array index provided by the [[render_target_array_index]]
     * and/or [[viewport_array_index]] output attributes in the vertex shader. This allows a modicum of programmability
     * for each amplified vertex to be routed to a different [[render_target_array_index]] and [[viewport_array_index]]
     * even though these attribytes cannot be amplified themselves.
     * 
     * API-Since: 13.0
     * 
     * @param count        the amplification count. The maximum value is currently 2.
     * @param viewMappings an array of mapping elements.
     */
    @Generated
    @Selector("setVertexAmplificationCount:viewMappings:")
    void setVertexAmplificationCountViewMappings(@NUInt long count,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") MTLVertexAmplificationViewMapping viewMappings);

    /**
     * setViewports:
     * 
     * Specifies an array of viewports, which are used to transform vertices from normalized device coordinates to
     * window coordinates based on [[ viewport_array_index ]] value specified in the vertex shader.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setViewports:count:")
    void setViewportsCount(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLViewport viewports,
            @NUInt long count);

    /**
     * useHeap:stages:
     * 
     * Declare that the resources allocated from a heap may be accessed by the render pass through an argument buffer
     * 
     * If the heap is tracked, this method protects against hazard tracking; these hazards must be addressed using an
     * MTLFence. This method must be called before encoding any draw commands which may access the resources allocated
     * from the heap through an argument buffer. This method may cause all of the color attachments allocated from the
     * heap to become decompressed. Therefore, it is recommended that the useResource:usage: or
     * useResources:count:usage: methods be used for color attachments instead, with a minimal (i.e. read-only) usage.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("useHeap:stages:")
    void useHeapStages(@NotNull @Mapped(ObjCObjectMapper.class) MTLHeap heap, @NUInt long stages);

    /**
     * useHeaps:count:stages:
     * 
     * Declare that the resources allocated from an array of heaps may be accessed by the render pass through an
     * argument buffer
     * 
     * This method does not protect against data hazards; these hazards must be addressed using an MTLFence. This method
     * must be called before encoding any draw commands which may access the resources allocated from the heaps through
     * an argument buffer. This method may cause all of the color attachments allocated from the heaps to become
     * decompressed. Therefore, it is recommended that the useResource:usage: or useResources:count:usage: methods be
     * used for color attachments instead, with a minimal (i.e. read-only) usage.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("useHeaps:count:stages:")
    void useHeapsCountStages(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> heaps, @NUInt long count,
            @NUInt long stages);

    /**
     * * @method useResources:usage:stage
     * * @abstract Declare that a resource may be accessed by the render pass through an argument buffer
     * * @discussion For hazard tracked resources, this method protects against data hazards. This method must be called
     * before encoding any draw commands which may access the resource through an argument buffer. However, this method
     * may cause color attachments to become decompressed. Therefore, this method should be called until as late as
     * possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color
     * attachments from becoming decompressed on some devices.
     * 
     * Note that calling useResource does not retain the resource. It is the responsiblity of the user to retain the
     * resource until
     * the command buffer has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("useResource:usage:stages:")
    void useResourceUsageStages(@NotNull @Mapped(ObjCObjectMapper.class) MTLResource resource, @NUInt long usage,
            @NUInt long stages);

    /**
     * * @method useResources:count:usage:stages
     * * @abstract Declare that an array of resources may be accessed through an argument buffer by the render pass
     * * @discussion For hazard tracked resources, this method protects against data hazards. This method must be called
     * before encoding any draw commands which may access the resources through an argument buffer. However, this method
     * may cause color attachments to become decompressed. Therefore, this method should be called until as late as
     * possible within a render command encoder. Declaring a minimal usage (i.e. read-only) may prevent color
     * attachments from becoming decompressed on some devices.
     * 
     * Note that calling useResources does not retain the resources. It is the responsiblity of the user to retain the
     * resources until
     * the command buffer has been executed.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("useResources:count:usage:stages:")
    void useResourcesCountUsageStages(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources,
            @NUInt long count, @NUInt long usage, @NUInt long stages);

    /**
     * sampleCountersInBuffer:atSampleIndex:withBarrier:
     * 
     * Sample hardware counters at this point in the render encoder and
     * store the counter sample into the sample buffer at the specified index.
     * 
     * @param sampleBuffer The sample buffer to sample into
     * @param sampleIndex  The index into the counter buffer to write the sample.
     * @param barrier      Insert a barrier before taking the sample. Passing
     *                     YES will ensure that all work encoded before this operation in the encoder is
     *                     complete but does not isolate the work with respect to other encoders. Passing
     *                     NO will allow the sample to be taken concurrently with other operations in this
     *                     encoder.
     *                     In general, passing YES will lead to more repeatable counter results but
     *                     may negatively impact performance. Passing NO will generally be higher performance
     *                     but counter results may not be repeatable.
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("sampleCountersInBuffer:atSampleIndex:withBarrier:")
    void sampleCountersInBufferAtSampleIndexWithBarrier(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLCounterSampleBuffer sampleBuffer, @NUInt long sampleIndex,
            boolean barrier);

    /**
     * setFragmentAccelerationStructure:atBufferIndex:
     * 
     * Set a global acceleration structure for all fragment shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentAccelerationStructure:atBufferIndex:")
    void setFragmentAccelerationStructureAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long bufferIndex);

    /**
     * setFragmentIntersectionFunctionTable:atBufferIndex:
     * 
     * Set a global intersection function table for all fragment shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentIntersectionFunctionTable:atBufferIndex:")
    void setFragmentIntersectionFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long bufferIndex);

    /**
     * setFragmentIntersectionFunctionTables:withBufferRange:
     * 
     * Set an array of global intersection function tables for all fragment shaders with the given buffer bind point
     * range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentIntersectionFunctionTables:withBufferRange:")
    void setFragmentIntersectionFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables,
            @ByValue NSRange range);

    /**
     * setFragmentVisibleFunctionTable:atBufferIndex:
     * 
     * Set a global visible function table for all fragment shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentVisibleFunctionTable:atBufferIndex:")
    void setFragmentVisibleFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable functionTable, @NUInt long bufferIndex);

    /**
     * setFragmentVisibleFunctionTables:withBufferRange:
     * 
     * Set an array of global visible function tables for all fragment shaders with the given buffer bind point range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setFragmentVisibleFunctionTables:withBufferRange:")
    void setFragmentVisibleFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functionTables, @ByValue NSRange range);

    /**
     * setTileAccelerationStructure:atBufferIndex:
     * 
     * Set a global acceleration structure for all tile shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTileAccelerationStructure:atBufferIndex:")
    void setTileAccelerationStructureAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long bufferIndex);

    /**
     * setTileIntersectionFunctionTable:atBufferIndex:
     * 
     * Set a global intersection function table for all tile shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTileIntersectionFunctionTable:atBufferIndex:")
    void setTileIntersectionFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long bufferIndex);

    /**
     * setTileIntersectionFunctionTables:withBufferRange:
     * 
     * Set an array of global intersection function tables for all tile shaders with the given buffer bind point range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTileIntersectionFunctionTables:withBufferRange:")
    void setTileIntersectionFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables,
            @ByValue NSRange range);

    /**
     * setTileVisibleFunctionTable:atBufferIndex:
     * 
     * Set a global visible function table for all tile shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTileVisibleFunctionTable:atBufferIndex:")
    void setTileVisibleFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable functionTable, @NUInt long bufferIndex);

    /**
     * setTileVisibleFunctionTables:withBufferRange:
     * 
     * Set an array of global visible function tables for all tile shaders with the given buffer bind point range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setTileVisibleFunctionTables:withBufferRange:")
    void setTileVisibleFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functionTables, @ByValue NSRange range);

    /**
     * setVertexAccelerationStructure:atBufferIndex:
     * 
     * Set a global acceleration structure for all vertex shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setVertexAccelerationStructure:atBufferIndex:")
    void setVertexAccelerationStructureAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLAccelerationStructure accelerationStructure,
            @NUInt long bufferIndex);

    /**
     * setVertexIntersectionFunctionTable:atBufferIndex:
     * 
     * Set a global intersection function table for all vertex shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setVertexIntersectionFunctionTable:atBufferIndex:")
    void setVertexIntersectionFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLIntersectionFunctionTable intersectionFunctionTable,
            @NUInt long bufferIndex);

    /**
     * setVertexIntersectionFunctionTables:withBufferRange:
     * 
     * Set an array of global intersection function tables for all vertex shaders with the given buffer bind point
     * range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setVertexIntersectionFunctionTables:withBufferRange:")
    void setVertexIntersectionFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> intersectionFunctionTables,
            @ByValue NSRange range);

    /**
     * setVertexVisibleFunctionTable:atBufferIndex:
     * 
     * Set a global visible function table for all vertex shaders at the given buffer bind point index.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setVertexVisibleFunctionTable:atBufferIndex:")
    void setVertexVisibleFunctionTableAtBufferIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLVisibleFunctionTable functionTable, @NUInt long bufferIndex);

    /**
     * setVertexVisibleFunctionTables:withBufferRange:
     * 
     * Set an array of global visible function tables for all vertex shaders with the given buffer bind point range.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("setVertexVisibleFunctionTables:withBufferRange:")
    void setVertexVisibleFunctionTablesWithBufferRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> functionTables, @ByValue NSRange range);

    /**
     * drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:
     * 
     * Enqueue a grid of object (if present) or mesh shader threadgroups.
     * 
     * The dimensions of the threadgroups and the grid are specified directly.
     * 
     * @param threadgroupsPerGrid         The number of threadgroups in the object (if present) or mesh shader grid.
     * @param threadsPerObjectThreadgroup The number of threads in one object shader threadgroup. Ignored if object
     *                                    shader is not present.
     * @param threadsPerMeshThreadgroup   The number of threads in one mesh shader threadgroup.
     * 
     *                                    API-Since: 16.0
     */
    @Generated
    @Selector("drawMeshThreadgroups:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroupsThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * drawMeshThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:
     * 
     * Enqueue a grid of object (if present) or mesh shader threadgroups.
     * 
     * The dimensions of the threadgroups are specified directly, the dimensions of the grid, in threadgroups, are read
     * from a buffer by the GPU.
     * 
     * @param indirectBuffer              A buffer object that the device will read the grid size from, see
     *                                    MTLDispatchThreadgroupsIndirectArguments.
     * @param indirectBufferOffset        Byte offset within @a indirectBuffer to read arguments from. @a
     *                                    indirectBufferOffset must be a multiple of 4.
     * @param threadsPerObjectThreadgroup The number of threads in one object shader threadgroup. Ignored if object
     *                                    shader is not present.
     * @param threadsPerMeshThreadgroup   The number of threads in one mesh shader threadgroup.
     * 
     *                                    API-Since: 16.0
     */
    @Generated
    @Selector("drawMeshThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadgroupsWithIndirectBufferIndirectBufferOffsetThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBuffer indirectBuffer, @NUInt long indirectBufferOffset,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:
     * 
     * Enqueue a grid of object (if present) of mesh shader threadgroups.
     * 
     * The dimensions of the threadgroups and the grid are specified directly.
     * The dimensions of threadsPerGrid does not have to be a multiple of threadsPerThreadgroup for object shaders.
     * For mesh shaders, threadsPerGrid is rounded down to the neareset multiple of threadsPerMeshThreadgroup (in each
     * dimension).
     * 
     * @param threadsPerGrid              The number of threads in the object (if present) or mesh shader grid
     * @param threadsPerObjectThreadgroup The number of threads in one object shader threadgroup. Ignored if object
     *                                    shader is not present.
     * @param threadsPerMeshThreadgroup   The number of threads in one mesh shader threadgroup.
     * 
     *                                    API-Since: 16.0
     */
    @Generated
    @Selector("drawMeshThreads:threadsPerObjectThreadgroup:threadsPerMeshThreadgroup:")
    void drawMeshThreadsThreadsPerObjectThreadgroupThreadsPerMeshThreadgroup(@ByValue MTLSize threadsPerGrid,
            @ByValue MTLSize threadsPerObjectThreadgroup, @ByValue MTLSize threadsPerMeshThreadgroup);

    /**
     * memoryBarrierWithResources:count:afterStages:beforeStages:
     * 
     * Make stores to memory encoded before the barrier coherent with loads from memory encoded after the barrier.
     * 
     * The barrier makes stores coherent that 1) are to resources in given array, and 2) happen at (or before) the stage
     * given by afterStages. Only affects loads that happen at (or after) the stage give by beforeStages.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("memoryBarrierWithResources:count:afterStages:beforeStages:")
    void memoryBarrierWithResourcesCountAfterStagesBeforeStages(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> resources, @NUInt long count,
            @NUInt long after, @NUInt long before);

    /**
     * memoryBarrierWithScope:afterStages:beforeStages:
     * 
     * Make stores to memory encoded before the barrier coherent with loads from memory encoded after the barrier.
     * 
     * The barrier makes stores coherent that 1) are to a resource with a type in the given scope, and 2) happen at (or
     * before) the stage given by afterStages. Only affects loads that happen at (or after) the stage given by
     * beforeStages.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("memoryBarrierWithScope:afterStages:beforeStages:")
    void memoryBarrierWithScopeAfterStagesBeforeStages(@NUInt long scope, @NUInt long after, @NUInt long before);

    /**
     * setMeshBuffer:offset:atIndex:
     * 
     * Set a global buffer for all mesh shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshBuffer:offset:atIndex:")
    void setMeshBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setMeshBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all mesh shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshBufferOffset:atIndex:")
    void setMeshBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setMeshBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all mesh shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshBuffers:offsets:withRange:")
    void setMeshBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setMeshBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given mesh shader buffer binding point. This will remove any existing MTLBuffer from
     * the binding point.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshBytes:length:atIndex:")
    void setMeshBytesLengthAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setMeshSamplerState:atIndex:
     * 
     * Set a global sampler for all mesh shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshSamplerState:atIndex:")
    void setMeshSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            @NUInt long index);

    /**
     * setMeshSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all mesh shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setMeshSamplerStateLodMinClampLodMaxClampAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp,
            @NUInt long index);

    /**
     * setMeshSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all mesh shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setMeshSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @NotNull ConstFloatPtr lodMinClamps, @NotNull ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setMeshSamplerStates:withRange:
     * 
     * Set an array of global samplers for all mesh shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshSamplerStates:withRange:")
    void setMeshSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setMeshTexture:atIndex:
     * 
     * Set a global texture for all mesh shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshTexture:atIndex:")
    void setMeshTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setMeshTextures:withRange:
     * 
     * Set an array of global textures for all mesh shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setMeshTextures:withRange:")
    void setMeshTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * setObjectBuffer:offset:atIndex:
     * 
     * Set a global buffer for all object shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectBuffer:offset:atIndex:")
    void setObjectBufferOffsetAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLBuffer buffer, @NUInt long offset,
            @NUInt long index);

    /**
     * setObjectBufferOffset:atIndex:
     * 
     * Set the offset within the current global buffer for all object shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectBufferOffset:atIndex:")
    void setObjectBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    /**
     * setObjectBuffers:offsets:withRange:
     * 
     * Set an array of global buffers for all object shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectBuffers:offsets:withRange:")
    void setObjectBuffersOffsetsWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> buffers,
            @NotNull ConstNUIntPtr offsets, @ByValue NSRange range);

    /**
     * setObjectBytes:length:atIndex:
     * 
     * Set the data (by copy) for a given object shader buffer binding point. This will remove any existing MTLBuffer
     * from the binding point.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectBytes:length:atIndex:")
    void setObjectBytesLengthAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    /**
     * setObjectSamplerState:atIndex:
     * 
     * Set a global sampler for all object shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectSamplerState:atIndex:")
    void setObjectSamplerStateAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler,
            @NUInt long index);

    /**
     * setObjectSamplerState:lodMinClamp:lodMaxClamp:atIndex:
     * 
     * Set a global sampler for all object shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setObjectSamplerStateLodMinClampLodMaxClampAtIndex(
            @Nullable @Mapped(ObjCObjectMapper.class) MTLSamplerState sampler, float lodMinClamp, float lodMaxClamp,
            @NUInt long index);

    /**
     * setObjectSamplerStates:lodMinClamps:lodMaxClamps:withRange:
     * 
     * Set an array of global samplers for all object shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setObjectSamplerStatesLodMinClampsLodMaxClampsWithRange(
            @NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @NotNull ConstFloatPtr lodMinClamps, @NotNull ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    /**
     * setObjectSamplerStates:withRange:
     * 
     * Set an array of global samplers for all object shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectSamplerStates:withRange:")
    void setObjectSamplerStatesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> samplers,
            @ByValue NSRange range);

    /**
     * setObjectTexture:atIndex:
     * 
     * Set a global texture for all object shaders at the given bind point index.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectTexture:atIndex:")
    void setObjectTextureAtIndex(@Nullable @Mapped(ObjCObjectMapper.class) MTLTexture texture, @NUInt long index);

    /**
     * setObjectTextures:withRange:
     * 
     * Set an array of global textures for all object shaders with the given bind point range.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectTextures:withRange:")
    void setObjectTexturesWithRange(@NotNull @ReferenceInfo(type = ObjCObject.class) Ptr<ObjCObject> textures,
            @ByValue NSRange range);

    /**
     * setObjectThreadgroupMemoryLength:atIndex:
     * 
     * Set the threadgroup memory byte length at the binding point specified by the index for all object shaders.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setObjectThreadgroupMemoryLength:atIndex:")
    void setObjectThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    /**
     * sets vertex buffer at specified index with provided offset and stride. Only
     * call this when the buffer-index is part of the vertexDescriptor and has set
     * its stride to `MTLBufferLayoutStrideDynamic`
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVertexBuffer:offset:attributeStride:atIndex:")
    void setVertexBufferOffsetAttributeStrideAtIndex(@Mapped(ObjCObjectMapper.class) @Nullable MTLBuffer buffer,
            @NUInt long offset, @NUInt long stride, @NUInt long index);

    /**
     * only call this when the buffer-index is part of the vertexDescriptor and
     * has set its stride to `MTLBufferLayoutStrideDynamic`
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVertexBufferOffset:attributeStride:atIndex:")
    void setVertexBufferOffsetAttributeStrideAtIndex(@NUInt long offset, @NUInt long stride, @NUInt long index);

    /**
     * sets an array of vertex buffers with provided offsets and strides with the
     * given bind point range.
     * only call this when at least one buffer is part of the
     * vertexDescriptor, other buffers must set their value relative to the
     * `attributeStrides` array to `MTLAttributeStrideStatic`
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVertexBuffers:offsets:attributeStrides:withRange:")
    void setVertexBuffersOffsetsAttributeStridesWithRange(
            @ReferenceInfo(type = ObjCObject.class) @NotNull Ptr<ObjCObject> buffers, @NotNull ConstNUIntPtr offsets,
            @NotNull ConstNUIntPtr strides, @ByValue NSRange range);

    /**
     * only call this when the buffer-index is part of the vertexDescriptor and
     * has set its stride to `MTLBufferLayoutStrideDynamic`
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVertexBytes:length:attributeStride:atIndex:")
    void setVertexBytesLengthAttributeStrideAtIndex(@NotNull ConstVoidPtr bytes, @NUInt long length, @NUInt long stride,
            @NUInt long index);
}
