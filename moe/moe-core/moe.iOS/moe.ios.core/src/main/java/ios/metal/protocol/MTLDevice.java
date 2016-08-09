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
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSError;
import ios.metal.MTLCompileOptions;
import ios.metal.MTLComputePipelineDescriptor;
import ios.metal.MTLComputePipelineReflection;
import ios.metal.MTLDepthStencilDescriptor;
import ios.metal.MTLRenderPipelineDescriptor;
import ios.metal.MTLRenderPipelineReflection;
import ios.metal.MTLSamplerDescriptor;
import ios.metal.MTLTextureDescriptor;
import ios.metal.struct.MTLSize;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLDevice")
public interface MTLDevice {
	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfp/MTLDevice/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	String name();

	/**
	 * newBufferWithBytes:length:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newBufferWithBytes:length:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newBufferWithBytes:length:options:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newBufferWithBytesLengthOptions(ConstVoidPtr pointer,
			@NUInt long length, @NUInt long options);

	/**
	 * newBufferWithBytesNoCopy:length:options:deallocator:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newBufferWithBytesNoCopy:length:options:deallocator:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newBufferWithBytesNoCopy:length:options:deallocator:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newBufferWithBytesNoCopyLengthOptionsDeallocator(
			VoidPtr pointer,
			@NUInt long length,
			@NUInt long options,
			@ObjCBlock(name = "call_newBufferWithBytesNoCopyLengthOptionsDeallocator") Block_newBufferWithBytesNoCopyLengthOptionsDeallocator deallocator);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newBufferWithBytesNoCopyLengthOptionsDeallocator {
		@Generated
		void call_newBufferWithBytesNoCopyLengthOptionsDeallocator(
				VoidPtr arg0, @NUInt long arg1);
	}

	/**
	 * newBufferWithLength:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newBufferWithLength:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newBufferWithLength:options:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newBufferWithLengthOptions(@NUInt long length,
			@NUInt long options);

	/**
	 * newCommandQueue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newCommandQueue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newCommandQueue")
	@MappedReturn(ObjCObjectMapper.class)
	Object newCommandQueue();

	/**
	 * newCommandQueueWithMaxCommandBufferCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newCommandQueueWithMaxCommandBufferCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newCommandQueueWithMaxCommandBufferCount:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newCommandQueueWithMaxCommandBufferCount(
			@NUInt long maxCommandBufferCount);

	/**
	 * newComputePipelineStateWithFunction:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithFunction:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithFunction:completionHandler:")
	void newComputePipelineStateWithFunctionCompletionHandler(
			@Mapped(ObjCObjectMapper.class) Object computeFunction,
			@ObjCBlock(name = "call_newComputePipelineStateWithFunctionCompletionHandler") Block_newComputePipelineStateWithFunctionCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newComputePipelineStateWithFunctionCompletionHandler {
		@Generated
		void call_newComputePipelineStateWithFunctionCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
	}

	/**
	 * newComputePipelineStateWithFunction:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithFunction:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithFunction:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newComputePipelineStateWithFunctionError(
			@Mapped(ObjCObjectMapper.class) Object computeFunction,
			Ptr<NSError> error);

	/**
	 * newComputePipelineStateWithFunction:options:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithFunction:options:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithFunction:options:completionHandler:")
	void newComputePipelineStateWithFunctionOptionsCompletionHandler(
			@Mapped(ObjCObjectMapper.class) Object computeFunction,
			@NUInt long options,
			@ObjCBlock(name = "call_newComputePipelineStateWithFunctionOptionsCompletionHandler") Block_newComputePipelineStateWithFunctionOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newComputePipelineStateWithFunctionOptionsCompletionHandler {
		@Generated
		void call_newComputePipelineStateWithFunctionOptionsCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				MTLComputePipelineReflection arg1, NSError arg2);
	}

	/**
	 * newComputePipelineStateWithFunction:options:reflection:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithFunction:options:reflection:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithFunction:options:reflection:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newComputePipelineStateWithFunctionOptionsReflectionError(
			@Mapped(ObjCObjectMapper.class) Object computeFunction,
			@NUInt long options, Ptr<MTLComputePipelineReflection> reflection,
			Ptr<NSError> error);

	/**
	 * newDefaultLibrary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newDefaultLibrary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newDefaultLibrary")
	@MappedReturn(ObjCObjectMapper.class)
	Object newDefaultLibrary();

	/**
	 * newDepthStencilStateWithDescriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newDepthStencilStateWithDescriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newDepthStencilStateWithDescriptor:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newDepthStencilStateWithDescriptor(
			MTLDepthStencilDescriptor descriptor);

	/**
	 * newLibraryWithData:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newLibraryWithData:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newLibraryWithData:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newLibraryWithDataError(
			NSObject data, Ptr<NSError> error);

	/**
	 * newLibraryWithFile:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newLibraryWithFile:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newLibraryWithFile:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newLibraryWithFileError(String filepath, Ptr<NSError> error);

	/**
	 * newLibraryWithSource:options:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newLibraryWithSource:options:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newLibraryWithSource:options:completionHandler:")
	void newLibraryWithSourceOptionsCompletionHandler(
			String source,
			MTLCompileOptions options,
			@ObjCBlock(name = "call_newLibraryWithSourceOptionsCompletionHandler") Block_newLibraryWithSourceOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newLibraryWithSourceOptionsCompletionHandler {
		@Generated
		void call_newLibraryWithSourceOptionsCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
	}

	/**
	 * newLibraryWithSource:options:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newLibraryWithSource:options:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newLibraryWithSource:options:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newLibraryWithSourceOptionsError(String source,
			MTLCompileOptions options, Ptr<NSError> error);

	/**
	 * newRenderPipelineStateWithDescriptor:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newRenderPipelineStateWithDescriptor:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newRenderPipelineStateWithDescriptor:completionHandler:")
	void newRenderPipelineStateWithDescriptorCompletionHandler(
			MTLRenderPipelineDescriptor descriptor,
			@ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorCompletionHandler") Block_newRenderPipelineStateWithDescriptorCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newRenderPipelineStateWithDescriptorCompletionHandler {
		@Generated
		void call_newRenderPipelineStateWithDescriptorCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0, NSError arg1);
	}

	/**
	 * newRenderPipelineStateWithDescriptor:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newRenderPipelineStateWithDescriptor:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newRenderPipelineStateWithDescriptor:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newRenderPipelineStateWithDescriptorError(
			MTLRenderPipelineDescriptor descriptor, Ptr<NSError> error);

	/**
	 * newRenderPipelineStateWithDescriptor:options:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newRenderPipelineStateWithDescriptor:options:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newRenderPipelineStateWithDescriptor:options:completionHandler:")
	void newRenderPipelineStateWithDescriptorOptionsCompletionHandler(
			MTLRenderPipelineDescriptor descriptor,
			@NUInt long options,
			@ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler {
		@Generated
		void call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0,
				MTLRenderPipelineReflection arg1, NSError arg2);
	}

	/**
	 * newRenderPipelineStateWithDescriptor:options:reflection:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newRenderPipelineStateWithDescriptor:options:reflection:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newRenderPipelineStateWithDescriptor:options:reflection:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newRenderPipelineStateWithDescriptorOptionsReflectionError(
			MTLRenderPipelineDescriptor descriptor, @NUInt long options,
			Ptr<MTLRenderPipelineReflection> reflection, Ptr<NSError> error);

	/**
	 * newSamplerStateWithDescriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newSamplerStateWithDescriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newSamplerStateWithDescriptor:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newSamplerStateWithDescriptor(MTLSamplerDescriptor descriptor);

	/**
	 * newTextureWithDescriptor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newTextureWithDescriptor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newTextureWithDescriptor:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newTextureWithDescriptor(MTLTextureDescriptor descriptor);

	/**
	 * supportsFeatureSet:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/supportsFeatureSet:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportsFeatureSet:")
	boolean supportsFeatureSet(@NUInt long featureSet);

	/**
	 * maxThreadsPerThreadgroup</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfp/MTLDevice/maxThreadsPerThreadgroup">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maxThreadsPerThreadgroup")
	@ByValue
	MTLSize maxThreadsPerThreadgroup();

	/**
	 * newComputePipelineStateWithDescriptor:options:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithDescriptor:options:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithDescriptor:options:completionHandler:")
	void newComputePipelineStateWithDescriptorOptionsCompletionHandler(MTLComputePipelineDescriptor descriptor,
			@NUInt long options,
			@ObjCBlock(name = "call_newComputePipelineStateWithDescriptorOptionsCompletionHandler") Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler {
		@Generated
		void call_newComputePipelineStateWithDescriptorOptionsCompletionHandler(
				@Mapped(ObjCObjectMapper.class) Object arg0, MTLComputePipelineReflection arg1, NSError arg2);
	}

	/**
	 * newComputePipelineStateWithDescriptor:options:reflection:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/newComputePipelineStateWithDescriptor:options:reflection:error:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("newComputePipelineStateWithDescriptor:options:reflection:error:")
	@MappedReturn(ObjCObjectMapper.class)
	Object newComputePipelineStateWithDescriptorOptionsReflectionError(MTLComputePipelineDescriptor descriptor,
			@NUInt long options, Ptr<MTLComputePipelineReflection> reflection, Ptr<NSError> error);

	/**
	 * supportsTextureSampleCount:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLDevice_Ref/index.html#//apple_ref/occ/intfm/MTLDevice/supportsTextureSampleCount:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("supportsTextureSampleCount:")
	boolean supportsTextureSampleCount(@NUInt long sampleCount);
}
