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

package ios.metal.protocol;


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
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

import ios.foundation.struct.NSRange;
import ios.metal.struct.MTLScissorRect;
import ios.metal.struct.MTLViewport;
import org.moe.natj.general.ann.NInt;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRenderCommandEncoder")
public interface MTLRenderCommandEncoder extends MTLCommandEncoder {
	/**
	 * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:")
	void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffset(
			@NUInt long primitiveType, @NUInt long indexCount,
			@NUInt long indexType,
			@Mapped(ObjCObjectMapper.class) Object indexBuffer,
			@NUInt long indexBufferOffset);

	/**
	 * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:")
	void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCount(
			@NUInt long primitiveType, @NUInt long indexCount,
			@NUInt long indexType,
			@Mapped(ObjCObjectMapper.class) Object indexBuffer,
			@NUInt long indexBufferOffset, @NUInt long instanceCount);

	/**
	 * drawPrimitives:vertexStart:vertexCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawPrimitives:vertexStart:vertexCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPrimitives:vertexStart:vertexCount:")
	void drawPrimitivesVertexStartVertexCount(@NUInt long primitiveType,
			@NUInt long vertexStart, @NUInt long vertexCount);

	/**
	 * drawPrimitives:vertexStart:vertexCount:instanceCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawPrimitives:vertexStart:vertexCount:instanceCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:")
	void drawPrimitivesVertexStartVertexCountInstanceCount(
			@NUInt long primitiveType, @NUInt long vertexStart,
			@NUInt long vertexCount, @NUInt long instanceCount);

	/**
	 * setBlendColorRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setBlendColorRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBlendColorRed:green:blue:alpha:")
	void setBlendColorRedGreenBlueAlpha(float red, float green,
			float blue, float alpha);

	/**
	 * setCullMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setCullMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setCullMode:")
	void setCullMode(@NUInt long cullMode);

	/**
	 * setDepthBias:slopeScale:clamp:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setDepthBias:slopeScale:clamp:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDepthBias:slopeScale:clamp:")
	void setDepthBiasSlopeScaleClamp(float depthBias, float slopeScale,
			float clamp);

	/**
	 * setDepthStencilState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setDepthStencilState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDepthStencilState:")
	void setDepthStencilState(
			@Mapped(ObjCObjectMapper.class) Object depthStencilState);

	/**
	 * setFragmentBuffer:offset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentBuffer:offset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentBuffer:offset:atIndex:")
	void setFragmentBufferOffsetAtIndex(
			@Mapped(ObjCObjectMapper.class) Object buffer, @NUInt long offset,
			@NUInt long index);

	/**
	 * setFragmentBufferOffset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentBufferOffset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentBufferOffset:atIndex:")
	void setFragmentBufferOffsetAtIndex(@NUInt long offset,
			@NUInt long index);

	/**
	 * setFragmentBuffers:offsets:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentBuffers:offsets:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentBuffers:offsets:withRange:")
	void setFragmentBuffersOffsetsWithRange(
			Ptr<ObjCObject> buffers, ConstNUIntPtr offset,
			@ByValue NSRange range);

	/**
	 * setFragmentBytes:length:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentBytes:length:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentBytes:length:atIndex:")
	void setFragmentBytesLengthAtIndex(ConstVoidPtr bytes,
			@NUInt long length, @NUInt long index);

	/**
	 * setFragmentSamplerState:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentSamplerState:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentSamplerState:atIndex:")
	void setFragmentSamplerStateAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, @NUInt long index);

	/**
	 * setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
	void setFragmentSamplerStateLodMinClampLodMaxClampAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, float lodMinClamp,
			float lodMaxClamp, @NUInt long index);

	/**
	 * setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
	void setFragmentSamplerStatesLodMinClampsLodMaxClampsWithRange(
			Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
			ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

	/**
	 * setFragmentSamplerStates:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentSamplerStates:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentSamplerStates:withRange:")
	void setFragmentSamplerStatesWithRange(
			Ptr<ObjCObject> samplers, @ByValue NSRange range);

	/**
	 * setFragmentTexture:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentTexture:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentTexture:atIndex:")
	void setFragmentTextureAtIndex(
			@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long index);

	/**
	 * setFragmentTextures:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFragmentTextures:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFragmentTextures:withRange:")
	void setFragmentTexturesWithRange(Ptr<ObjCObject> textures,
			@ByValue NSRange range);

	/**
	 * setFrontFacingWinding:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setFrontFacingWinding:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFrontFacingWinding:")
	void setFrontFacingWinding(@NUInt long frontFacingWinding);

	/**
	 * setRenderPipelineState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setRenderPipelineState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRenderPipelineState:")
	void setRenderPipelineState(
			@Mapped(ObjCObjectMapper.class) Object pipelineState);

	/**
	 * setScissorRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setScissorRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setScissorRect:")
	void setScissorRect(@ByValue MTLScissorRect rect);

	/**
	 * setStencilReferenceValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setStencilReferenceValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStencilReferenceValue:")
	void setStencilReferenceValue(int referenceValue);

	/**
	 * setTriangleFillMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setTriangleFillMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTriangleFillMode:")
	void setTriangleFillMode(@NUInt long fillMode);

	/**
	 * setVertexBuffer:offset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexBuffer:offset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexBuffer:offset:atIndex:")
	void setVertexBufferOffsetAtIndex(
			@Mapped(ObjCObjectMapper.class) Object buffer, @NUInt long offset,
			@NUInt long index);

	/**
	 * setVertexBufferOffset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexBufferOffset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexBufferOffset:atIndex:")
	void setVertexBufferOffsetAtIndex(@NUInt long offset,
			@NUInt long index);

	/**
	 * setVertexBuffers:offsets:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexBuffers:offsets:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexBuffers:offsets:withRange:")
	void setVertexBuffersOffsetsWithRange(Ptr<ObjCObject> buffers,
			ConstNUIntPtr offsets, @ByValue NSRange range);

	/**
	 * setVertexBytes:length:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexBytes:length:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexBytes:length:atIndex:")
	void setVertexBytesLengthAtIndex(ConstVoidPtr bytes,
			@NUInt long length, @NUInt long index);

	/**
	 * setVertexSamplerState:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexSamplerState:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexSamplerState:atIndex:")
	void setVertexSamplerStateAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, @NUInt long index);

	/**
	 * setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
	void setVertexSamplerStateLodMinClampLodMaxClampAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, float lodMinClamp,
			float lodMaxClamp, @NUInt long index);

	/**
	 * setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
	void setVertexSamplerStatesLodMinClampsLodMaxClampsWithRange(
			Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
			ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

	/**
	 * setVertexSamplerStates:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexSamplerStates:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexSamplerStates:withRange:")
	void setVertexSamplerStatesWithRange(Ptr<ObjCObject> samplers,
			@ByValue NSRange range);

	/**
	 * setVertexTexture:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexTexture:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexTexture:atIndex:")
	void setVertexTextureAtIndex(
			@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long index);

	/**
	 * setVertexTextures:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVertexTextures:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVertexTextures:withRange:")
	void setVertexTexturesWithRange(Ptr<ObjCObject> textures,
			@ByValue NSRange range);

	/**
	 * setViewport:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setViewport:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setViewport:")
	void setViewport(@ByValue MTLViewport viewport);

	/**
	 * setVisibilityResultMode:offset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setVisibilityResultMode:offset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setVisibilityResultMode:offset:")
	void setVisibilityResultModeOffset(@NUInt long mode,
			@NUInt long offset);

	/**
	 * setDepthClipMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setDepthClipMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDepthClipMode:")
	void setDepthClipMode(@NUInt long depthClipMode);

	/**
	 * setStencilFrontReferenceValue:backReferenceValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/setStencilFrontReferenceValue:backReferenceValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStencilFrontReferenceValue:backReferenceValue:")
	void setStencilFrontReferenceValueBackReferenceValue(int frontReferenceValue, int backReferenceValue);

	/**
	 * drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawIndexedPrimitives:indexCount:indexType:indexBuffer:indexBufferOffset:instanceCount:baseVertex:baseInstance:")
	void drawIndexedPrimitivesIndexCountIndexTypeIndexBufferIndexBufferOffsetInstanceCountBaseVertexBaseInstance(
			@NUInt long primitiveType, @NUInt long indexCount, @NUInt long indexType,
			@Mapped(ObjCObjectMapper.class) Object indexBuffer, @NUInt long indexBufferOffset,
			@NUInt long instanceCount, @NInt long baseVertex, @NUInt long baseInstance);

	/**
	 * drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawIndexedPrimitives:indexType:indexBuffer:indexBufferOffset:indirectBuffer:indirectBufferOffset:")
	void drawIndexedPrimitivesIndexTypeIndexBufferIndexBufferOffsetIndirectBufferIndirectBufferOffset(
			@NUInt long primitiveType, @NUInt long indexType, @Mapped(ObjCObjectMapper.class) Object indexBuffer,
			@NUInt long indexBufferOffset, @Mapped(ObjCObjectMapper.class) Object indirectBuffer,
			@NUInt long indirectBufferOffset);

	/**
	 * drawPrimitives:indirectBuffer:indirectBufferOffset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawPrimitives:indirectBuffer:indirectBufferOffset:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPrimitives:indirectBuffer:indirectBufferOffset:")
	void drawPrimitivesIndirectBufferIndirectBufferOffset(@NUInt long primitiveType,
			@Mapped(ObjCObjectMapper.class) Object indirectBuffer, @NUInt long indirectBufferOffset);

	/**
	 * drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLRenderCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLRenderCommandEncoder/drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawPrimitives:vertexStart:vertexCount:instanceCount:baseInstance:")
	void drawPrimitivesVertexStartVertexCountInstanceCountBaseInstance(@NUInt long primitiveType,
			@NUInt long vertexStart, @NUInt long vertexCount, @NUInt long instanceCount, @NUInt long baseInstance);
}
