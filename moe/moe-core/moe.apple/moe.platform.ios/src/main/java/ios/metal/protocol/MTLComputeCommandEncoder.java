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
import ios.metal.struct.MTLSize;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLComputeCommandEncoder")
public interface MTLComputeCommandEncoder extends MTLCommandEncoder {
	/**
	 * dispatchThreadgroups:threadsPerThreadgroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/dispatchThreadgroups:threadsPerThreadgroup:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dispatchThreadgroups:threadsPerThreadgroup:")
	void dispatchThreadgroupsThreadsPerThreadgroup(
			@ByValue MTLSize threadgroupsPerGrid,
			@ByValue MTLSize threadsPerThreadgroup);

	/**
	 * setBuffer:offset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setBuffer:offset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBuffer:offset:atIndex:")
	void setBufferOffsetAtIndex(
			@Mapped(ObjCObjectMapper.class) Object buffer, @NUInt long offset,
			@NUInt long index);

	/**
	 * setBufferOffset:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setBufferOffset:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBufferOffset:atIndex:")
	void setBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

	/**
	 * setBuffers:offsets:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setBuffers:offsets:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBuffers:offsets:withRange:")
	void setBuffersOffsetsWithRange(Ptr<ObjCObject> buffers,
			ConstNUIntPtr offsets, @ByValue NSRange range);

	/**
	 * setBytes:length:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setBytes:length:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setBytes:length:atIndex:")
	void setBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length,
			@NUInt long index);

	/**
	 * setComputePipelineState:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setComputePipelineState:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setComputePipelineState:")
	void setComputePipelineState(
			@Mapped(ObjCObjectMapper.class) Object state);

	/**
	 * setSamplerState:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setSamplerState:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSamplerState:atIndex:")
	void setSamplerStateAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, @NUInt long index);

	/**
	 * setSamplerState:lodMinClamp:lodMaxClamp:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setSamplerState:lodMinClamp:lodMaxClamp:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
	void setSamplerStateLodMinClampLodMaxClampAtIndex(
			@Mapped(ObjCObjectMapper.class) Object sampler, float lodMinClamp,
			float lodMaxClamp, @NUInt long index);

	/**
	 * setSamplerStates:lodMinClamps:lodMaxClamps:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setSamplerStates:lodMinClamps:lodMaxClamps:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
	void setSamplerStatesLodMinClampsLodMaxClampsWithRange(
			Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
			ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

	/**
	 * setSamplerStates:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setSamplerStates:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSamplerStates:withRange:")
	void setSamplerStatesWithRange(Ptr<ObjCObject> samplers,
			@ByValue NSRange range);

	/**
	 * setTexture:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setTexture:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTexture:atIndex:")
	void setTextureAtIndex(
			@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long index);

	/**
	 * setTextures:withRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setTextures:withRange:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setTextures:withRange:")
	void setTexturesWithRange(Ptr<ObjCObject> textures,
			@ByValue NSRange range);

	/**
	 * setThreadgroupMemoryLength:atIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/setThreadgroupMemoryLength:atIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setThreadgroupMemoryLength:atIndex:")
	void setThreadgroupMemoryLengthAtIndex(@NUInt long length,
			@NUInt long index);

	/**
	 * dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLComputeCommandEncoder_Ref/index.html#//apple_ref/occ/intfm/MTLComputeCommandEncoder/dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:")
	void dispatchThreadgroupsWithIndirectBufferIndirectBufferOffsetThreadsPerThreadgroup(
			@Mapped(ObjCObjectMapper.class) Object indirectBuffer, @NUInt long indirectBufferOffset,
			@ByValue MTLSize threadsPerThreadgroup);
}
