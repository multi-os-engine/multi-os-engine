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

import apple.coregraphics.opaque.IOSurfaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSError;
import apple.foundation.NSURL;
import apple.metal.MTLAccelerationStructureDescriptor;
import apple.metal.MTLArgumentDescriptor;
import apple.metal.MTLBinaryArchiveDescriptor;
import apple.metal.MTLCompileOptions;
import apple.metal.MTLComputePipelineDescriptor;
import apple.metal.MTLComputePipelineReflection;
import apple.metal.MTLCounterSampleBufferDescriptor;
import apple.metal.MTLDepthStencilDescriptor;
import apple.metal.MTLHeapDescriptor;
import apple.metal.MTLIndirectCommandBufferDescriptor;
import apple.metal.MTLRasterizationRateMapDescriptor;
import apple.metal.MTLRenderPipelineDescriptor;
import apple.metal.MTLRenderPipelineReflection;
import apple.metal.MTLSamplerDescriptor;
import apple.metal.MTLSharedEventHandle;
import apple.metal.MTLSharedTextureHandle;
import apple.metal.MTLStitchedLibraryDescriptor;
import apple.metal.MTLTextureDescriptor;
import apple.metal.MTLTileRenderPipelineDescriptor;
import apple.metal.struct.MTLAccelerationStructureSizes;
import apple.metal.struct.MTLRegion;
import apple.metal.struct.MTLSamplePosition;
import apple.metal.struct.MTLSize;
import apple.metal.struct.MTLSizeAndAlign;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.MTLIOCommandQueueDescriptor;
import apple.metal.MTLMeshRenderPipelineDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.metal.MTLArchitecture;
import apple.opaque.dispatch_data_t;

/**
 * [@protocol] MTLDevice
 * 
 * MTLDevice represents a processor capable of data parallel computations
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLDevice")
public interface MTLDevice {
    /**
     * heapBufferSizeAndAlignWithLength:options:
     * 
     * Determine the byte size of buffers when sub-allocated from a heap.
     * 
     * This method can be used to help determine the required heap size.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("heapBufferSizeAndAlignWithLength:options:")
    @ByValue
    MTLSizeAndAlign heapBufferSizeAndAlignWithLengthOptions(@NUInt long length, @NUInt long options);

    /**
     * heapTextureSizeAndAlignWithDescriptor:
     * 
     * Determine the byte size of textures when sub-allocated from a heap.
     * 
     * This method can be used to help determine the required heap size.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("heapTextureSizeAndAlignWithDescriptor:")
    @ByValue
    MTLSizeAndAlign heapTextureSizeAndAlignWithDescriptor(@NotNull MTLTextureDescriptor desc);

    /**
     * [@property] maxThreadsPerThreadgroup
     * 
     * The maximum number of threads along each dimension.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("maxThreadsPerThreadgroup")
    @ByValue
    MTLSize maxThreadsPerThreadgroup();

    /**
     * [@property] name
     * 
     * The full name of the vendor device.
     */
    @NotNull
    @Generated
    @Selector("name")
    String name();

    /**
     * newBufferWithBytes:length:options:
     * 
     * Create a buffer by allocating new memory and specifing the initial contents to be copied into it.
     */
    @Nullable
    @Generated
    @Selector("newBufferWithBytes:length:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesLengthOptions(@NotNull ConstVoidPtr pointer, @NUInt long length, @NUInt long options);

    /**
     * newBufferWithBytesNoCopy:length:options:deallocator:
     * 
     * Create a buffer by wrapping an existing part of the address space.
     */
    @Nullable
    @Generated
    @Selector("newBufferWithBytesNoCopy:length:options:deallocator:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesNoCopyLengthOptionsDeallocator(@NotNull VoidPtr pointer, @NUInt long length,
            @NUInt long options,
            @Nullable @ObjCBlock(name = "call_newBufferWithBytesNoCopyLengthOptionsDeallocator") Block_newBufferWithBytesNoCopyLengthOptionsDeallocator deallocator);

    /**
     * newBufferWithLength:options:
     * 
     * Create a buffer by allocating new memory.
     */
    @Nullable
    @Generated
    @Selector("newBufferWithLength:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithLengthOptions(@NUInt long length, @NUInt long options);

    /**
     * newCommandQueue
     * 
     * Create and return a new command queue. Command Queues created via this method will only allow up to 64
     * non-completed command buffers.
     * 
     * @return The new command queue object
     */
    @Nullable
    @Generated
    @Selector("newCommandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueue();

    /**
     * newCommandQueueWithMaxCommandBufferCount
     * 
     * Create and return a new command queue with a given upper bound on non-completed command buffers.
     * 
     * @return The new command queue object
     */
    @Nullable
    @Generated
    @Selector("newCommandQueueWithMaxCommandBufferCount:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueueWithMaxCommandBufferCount(@NUInt long maxCommandBufferCount);

    /**
     * newComputePipelineStateWithDescriptor:options:completionHandler:
     * 
     * Create and compile a new MTLComputePipelineState object asynchronously.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:completionHandler:")
    void newComputePipelineStateWithDescriptorOptionsCompletionHandler(@NotNull MTLComputePipelineDescriptor descriptor,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_newComputePipelineStateWithDescriptorOptionsCompletionHandler") Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:options:reflection:error:
     * 
     * Create and compile a new MTLComputePipelineState object synchronously.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithDescriptorOptionsReflectionError(
            @NotNull MTLComputePipelineDescriptor descriptor, @NUInt long options,
            @Nullable @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newComputePipelineStateWithDescriptor:completionHandler:
     * 
     * Create and compile a new MTLComputePipelineState object asynchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:completionHandler:")
    void newComputePipelineStateWithFunctionCompletionHandler(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @NotNull @ObjCBlock(name = "call_newComputePipelineStateWithFunctionCompletionHandler") Block_newComputePipelineStateWithFunctionCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:error:
     * 
     * Create and compile a new MTLComputePipelineState object synchronously.
     */
    @Nullable
    @Generated
    @Selector("newComputePipelineStateWithFunction:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionError(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newComputePipelineStateWithDescriptor:options:completionHandler:
     * 
     * Create and compile a new MTLComputePipelineState object asynchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:options:completionHandler:")
    void newComputePipelineStateWithFunctionOptionsCompletionHandler(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_newComputePipelineStateWithFunctionOptionsCompletionHandler") Block_newComputePipelineStateWithFunctionOptionsCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:options:reflection:error:
     * 
     * Create and compile a new MTLComputePipelineState object synchronously.
     */
    @Nullable
    @Generated
    @Selector("newComputePipelineStateWithFunction:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionOptionsReflectionError(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @Nullable @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDefaultLibrary
     * 
     * Returns the default library for the main bundle.
     * 
     * use newDefaultLibraryWithBundle:error: to get an NSError in case of failure.
     */
    @Nullable
    @Generated
    @Selector("newDefaultLibrary")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibrary();

    /**
     * newDefaultLibraryWithBundle:error:
     * 
     * Returns the default library for a given bundle.
     * 
     * @return A pointer to the library, nil if an error occurs.
     * 
     *         API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("newDefaultLibraryWithBundle:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibraryWithBundleError(@NotNull NSBundle bundle,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDepthStencilStateWithDescriptor:
     * 
     * Create a depth/stencil test state object.
     */
    @Nullable
    @Generated
    @Selector("newDepthStencilStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDepthStencilState newDepthStencilStateWithDescriptor(@NotNull MTLDepthStencilDescriptor descriptor);

    /**
     * newFence
     * 
     * Create a new MTLFence object
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("newFence")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFence newFence();

    /**
     * newHeapWithDescriptor:
     * 
     * Create a new heap with the given descriptor.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Selector("newHeapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap newHeapWithDescriptor(@NotNull MTLHeapDescriptor descriptor);

    /**
     * newLibraryWithData:
     * 
     * Load a MTLLibrary from a dispatch_data_t
     * 
     * @param data  A metallib file already loaded as data in the form of dispatch_data_t.
     * @param error An error if we fail to open the metallib data.
     */
    @Nullable
    @Generated
    @Selector("newLibraryWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithDataError(@NotNull dispatch_data_t data,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newLibraryWithFile:
     * 
     * Load a MTLLibrary from a metallib file.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use -newLibraryWithURL:error: instead
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("newLibraryWithFile:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithFileError(@NotNull String filepath,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newLibraryWithSource:options:completionHandler:
     * 
     * Load a MTLLibrary from source.
     */
    @Generated
    @Selector("newLibraryWithSource:options:completionHandler:")
    void newLibraryWithSourceOptionsCompletionHandler(@NotNull String source, @Nullable MTLCompileOptions options,
            @NotNull @ObjCBlock(name = "call_newLibraryWithSourceOptionsCompletionHandler") Block_newLibraryWithSourceOptionsCompletionHandler completionHandler);

    /**
     * newLibraryWithSource:options:error:
     * 
     * Load a MTLLibrary from source.
     */
    @Nullable
    @Generated
    @Selector("newLibraryWithSource:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithSourceOptionsError(@NotNull String source, @Nullable MTLCompileOptions options,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineState:completionHandler:
     * 
     * Create and compile a new MTLRenderPipelineState object asynchronously.
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:completionHandler:")
    void newRenderPipelineStateWithDescriptorCompletionHandler(@NotNull MTLRenderPipelineDescriptor descriptor,
            @NotNull @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorCompletionHandler") Block_newRenderPipelineStateWithDescriptorCompletionHandler completionHandler);

    /**
     * newRenderPipelineStateWithDescriptor:error:
     * 
     * Create and compile a new MTLRenderPipelineState object synchronously.
     */
    @Nullable
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorError(@NotNull MTLRenderPipelineDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineState:options:completionHandler:
     * 
     * Create and compile a new MTLRenderPipelineState object asynchronously and returns additional reflection
     * information
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithDescriptorOptionsCompletionHandler(@NotNull MTLRenderPipelineDescriptor descriptor,
            @NUInt long options,
            @NotNull @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    /**
     * newRenderPipelineStateWithDescriptor:options:reflection:error:
     * 
     * Create and compile a new MTLRenderPipelineState object synchronously and returns additional reflection
     * information.
     */
    @Nullable
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorOptionsReflectionError(
            @NotNull MTLRenderPipelineDescriptor descriptor, @NUInt long options,
            @Nullable @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newSamplerStateWithDescriptor:
     * 
     * Create a new sampler.
     */
    @Nullable
    @Generated
    @Selector("newSamplerStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSamplerState newSamplerStateWithDescriptor(@NotNull MTLSamplerDescriptor descriptor);

    /**
     * newTextureWithDescriptor:
     * 
     * Allocate a new texture with privately owned storage.
     */
    @Nullable
    @Generated
    @Selector("newTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptor(@NotNull MTLTextureDescriptor descriptor);

    /**
     * supportsFeatureSet:
     * 
     * Returns TRUE if the feature set is supported by this MTLDevice.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use supportsFamily instead
     */
    @Deprecated
    @Generated
    @Selector("supportsFeatureSet:")
    boolean supportsFeatureSet(@NUInt long featureSet);

    /**
     * supportsTextureSampleCount:
     * 
     * Query device if it support textures with a given sampleCount.
     * 
     * @return BOOL value. If YES, device supports the given sampleCount for textures. If NO, device does not support
     *         the given sampleCount.
     * 
     *         API-Since: 9.0
     */
    @Generated
    @Selector("supportsTextureSampleCount:")
    boolean supportsTextureSampleCount(@NUInt long sampleCount);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newBufferWithBytesNoCopyLengthOptionsDeallocator {
        @Generated
        void call_newBufferWithBytesNoCopyLengthOptionsDeallocator(@NotNull VoidPtr pointer, @NUInt long length);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithDescriptorOptionsCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object computePipelineState,
                @Nullable MTLComputePipelineReflection reflection, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithFunctionCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithFunctionCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object computePipelineState, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithFunctionOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithFunctionOptionsCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object computePipelineState,
                @Nullable MTLComputePipelineReflection reflection, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newLibraryWithSourceOptionsCompletionHandler {
        @Generated
        void call_newLibraryWithSourceOptionsCompletionHandler(@Nullable @Mapped(ObjCObjectMapper.class) Object library,
                @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object renderPipelineState, @Nullable NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object renderPipelineState,
                @Nullable MTLRenderPipelineReflection reflection, @Nullable NSError error);
    }

    /**
     * [@property] programmableSaplePositionsSupported
     * 
     * Query device for programmable sample position support.
     * 
     * @return BOOL value. If YES, the device supports programmable sample positions. If NO, the device does not.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("areProgrammableSamplePositionsSupported")
    boolean areProgrammableSamplePositionsSupported();

    /**
     * [@property] rasterOrderGroupsSupported
     * 
     * Query device for raster order groups support.
     * 
     * @return BOOL value. If YES, the device supports raster order groups. If NO, the device does not.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("areRasterOrderGroupsSupported")
    boolean areRasterOrderGroupsSupported();

    /**
     * [@property] argumentBuffersSupport
     * 
     * Query support tier for Argument Buffers.
     * 
     * @return MTLArgumentBuffersTier enum value.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("argumentBuffersSupport")
    @NUInt
    long argumentBuffersSupport();

    /**
     * [@property] currentAllocatedSize
     * 
     * The current size in bytes of all resources allocated by this device
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("currentAllocatedSize")
    @NUInt
    long currentAllocatedSize();

    /**
     * getDefaultSamplePositions:count:
     * 
     * Retrieve the default sample positions.
     * 
     * @param positions The destination array for default sample position data.
     * @param count     Specifies the sample count for which to retrieve the default positions, the length of the
     *                  positions array, and must be set to a valid sample count.
     * 
     *                  API-Since: 11.0
     */
    @Generated
    @Selector("getDefaultSamplePositions:count:")
    void getDefaultSamplePositionsCount(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    /**
     * [@property] maxThreadgroupMemoryLength
     * 
     * The maximum threadgroup memory available, in bytes.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maxThreadgroupMemoryLength")
    @NUInt
    long maxThreadgroupMemoryLength();

    /**
     * minimumLinearTextureAlignmentForPixelFormat:
     * 
     * Returns the minimum alignment required for offset and rowBytes when creating a linear texture. An error is thrown
     * for queries with invalid pixel formats (depth, stencil, or compressed formats).
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("minimumLinearTextureAlignmentForPixelFormat:")
    @NUInt
    long minimumLinearTextureAlignmentForPixelFormat(@NUInt long format);

    /**
     * newArgumentEncoderWithArguments:count:
     * 
     * Creates an argument encoder for an array of argument descriptors which will be encoded sequentially.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("newArgumentEncoderWithArguments:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithArguments(@NotNull NSArray<? extends MTLArgumentDescriptor> arguments);

    /**
     * newLibraryWithURL:
     * 
     * Load a MTLLibrary from a metallib file.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("newLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineStateWithTileDescriptor:options:completionHandler:
     * 
     * Create and compile a new MTLRenderPipelineState object asynchronously given a MTLTileRenderPipelineDescriptor.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithTileDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler(
            @NotNull MTLTileRenderPipelineDescriptor descriptor, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object renderPipelineState,
                @Nullable MTLRenderPipelineReflection reflection, @Nullable NSError error);
    }

    /**
     * newRenderPipelineStateWithTileDescriptor:options:reflection:error:
     * 
     * Create and compile a new MTLRenderPipelineState object synchronously given a MTLTileRenderPipelineDescriptor.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("newRenderPipelineStateWithTileDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithTileDescriptorOptionsReflectionError(
            @NotNull MTLTileRenderPipelineDescriptor descriptor, @NUInt long options,
            @Nullable @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithDescriptor:iosurface:plane
     * 
     * Create a new texture from an IOSurface.
     * 
     * @param descriptor A description of the properties for the new texture.
     * @param iosurface  The IOSurface to use as storage for the new texture.
     * @param plane      The plane within the IOSurface to use.
     * @return A new texture object.
     * 
     *         API-Since: 11.0
     */
    @Nullable
    @Generated
    @Selector("newTextureWithDescriptor:iosurface:plane:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorIosurfacePlane(@NotNull MTLTextureDescriptor descriptor,
            @NotNull IOSurfaceRef iosurface, @NUInt long plane);

    /**
     * [@property] readWriteTextureSupport
     * 
     * Query support tier for read-write texture formats.
     * 
     * @return MTLReadWriteTextureTier enum value.
     * 
     *         API-Since: 11.0
     */
    @Generated
    @Selector("readWriteTextureSupport")
    @NUInt
    long readWriteTextureSupport();

    /**
     * [@property] registryID
     * 
     * Returns the IORegistry ID for the Metal device
     * 
     * The registryID value for a Metal device is global to all tasks, and may be used
     * to identify the GPU across task boundaries.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("registryID")
    long registryID();

    /**
     * * @method convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:
     * * @abstract Converts regions in pixels to regions in sparse tiles using specified alignment mode.
     * Tile size can be obtained from tileSizeWithTextureType:pixelFormat:sampleCount: method.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:")
    default void convertSparsePixelRegionsToTileRegionsWithTileSizeAlignmentModeNumRegions(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @ByValue MTLSize tileSize, @NUInt long mode, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * * @method convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:
     * * @abstract Convertes region in sparse tiles to region in pixels
     * Tile size can be obtained from tileSizeWithTextureType:pixelFormat:sampleCount: method.
     * 
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:")
    default void convertSparseTileRegionsToPixelRegionsWithTileSizeNumRegions(
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @ByValue MTLSize tileSize, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] hasUnifiedMemory
     * 
     * Returns YES if this GPU shares its memory with the rest of the machine (CPU, etc.)
     * 
     * Some GPU architectures do not have dedicated local memory and instead only use the same memory shared with the
     * rest
     * of the machine. This property will return YES for GPUs that fall into that category.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hasUnifiedMemory")
    boolean hasUnifiedMemory();

    /**
     * [@property] maxArgumentBufferSamplerCount
     * 
     * The maximum number of unique argument buffer samplers per app.
     * 
     * This limit is only applicable to samplers that have their supportArgumentBuffers property set to true. A
     * MTLSamplerState object is considered unique if the configuration of its originating MTLSamplerDescriptor
     * properties is unique. For example, two samplers with equal minFilter values but different magFilter values are
     * considered unique.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("maxArgumentBufferSamplerCount")
    @NUInt
    long maxArgumentBufferSamplerCount();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("maxBufferLength")
    @NUInt
    long maxBufferLength();

    /**
     * minimumTextureBufferAlignmentForPixelFormat:
     * 
     * Returns the minimum alignment required for offset and rowBytes when creating a texture buffer from a buffer.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("minimumTextureBufferAlignmentForPixelFormat:")
    @NUInt
    long minimumTextureBufferAlignmentForPixelFormat(@NUInt long format);

    /**
     * newEvent
     * 
     * Returns a new single-device non-shareable Metal event object
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("newEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLEvent newEvent();

    /**
     * newIndirectCommandBufferWithDescriptor:maxCommandCount:options
     * 
     * Creates a new indirect command buffer with the given descriptor and count.
     * 
     * The returned buffer can be safely executed without first encoding into (but is wasteful).
     * 
     * API-Since: 12.0
     * 
     * @param descriptor The descriptor encodes the maximum logical stride of each command.
     * @param maxCount   The maximum number of commands that this buffer can contain.
     * @param options    The options for the indirect command buffer.
     */
    @Nullable
    @Generated
    @Selector("newIndirectCommandBufferWithDescriptor:maxCommandCount:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIndirectCommandBuffer newIndirectCommandBufferWithDescriptorMaxCommandCountOptions(
            @NotNull MTLIndirectCommandBufferDescriptor descriptor, @NUInt long maxCount, @NUInt long options);

    /**
     * newRasterizationRateMapWithDescriptor:
     * 
     * Creates a new variable rasterization rate map with the given descriptor.
     * 
     * If '[self supportsRasterizationRateMapWithLayerCount:descriptor.layerCount]' returns NO, or descriptor.screenSize
     * describes an empty region, the result will always be nil.
     * 
     * @return A MTLRasterizationRateMap instance that can be used for rendering on this MTLDevice, or nil if the device
     *         does not support the combination of parameters stored in the descriptor.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("newRasterizationRateMapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRasterizationRateMap newRasterizationRateMapWithDescriptor(
            @NotNull MTLRasterizationRateMapDescriptor descriptor);

    /**
     * newSharedEvent
     * 
     * Returns a shareable multi-device event.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("newSharedEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEvent();

    /**
     * newSharedEventWithHandle
     * 
     * Creates a shareable multi-device event from an existing shared event handle.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("newSharedEventWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEventWithHandle(@NotNull MTLSharedEventHandle sharedEventHandle);

    /**
     * newSharedTextureWithDescriptor
     * 
     * Create a new texture that can be shared across process boundaries.
     * 
     * This texture can be shared between process boundaries
     * but not between different GPUs, by passing its MTLSharedTextureHandle.
     * 
     * @param descriptor A description of the properties for the new texture.
     * @return A new texture object.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("newSharedTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithDescriptor(@NotNull MTLTextureDescriptor descriptor);

    /**
     * newSharedTextureWithHandle
     * 
     * Recreate shared texture from received texture handle.
     * 
     * This texture was shared between process boundaries by other
     * process using MTLSharedTextureHandle. Current process will now share
     * it with other processes and will be able to interact with it (but still
     * in scope of the same GPUs).
     * 
     * @param sharedHandle Handle to shared texture in this process space.
     * @return A new texture object.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("newSharedTextureWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithHandle(@NotNull MTLSharedTextureHandle sharedHandle);

    /**
     * [@property] sparseTileSizeInBytes
     * 
     * Returns the number of bytes required to map one sparse texture tile.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("sparseTileSizeInBytes")
    @NUInt
    long sparseTileSizeInBytes();

    /**
     * sparseTileSizeWithTextureType:pixelFormat:sampleCount:
     * 
     * Returns tile size for sparse texture with given type, pixel format and sample count.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:")
    @ByValue
    MTLSize sparseTileSizeWithTextureTypePixelFormatSampleCount(@NUInt long textureType, @NUInt long pixelFormat,
            @NUInt long sampleCount);

    /**
     * supportsFamily:
     * 
     * Returns TRUE if the GPU Family is supported by this MTLDevice.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("supportsFamily:")
    boolean supportsFamily(@NInt long gpuFamily);

    /**
     * supportsRasterizationRateMapWithLayerCount:
     * 
     * Query device for variable rasterization rate support with the given number of layers.
     * 
     * @param layerCount The number of layers for which to query device support.
     * @return YES if the device supports creation of rendering using a MTLRasterizationRateMap with the given number of
     *         layers.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("supportsRasterizationRateMapWithLayerCount:")
    boolean supportsRasterizationRateMapWithLayerCount(@NUInt long layerCount);

    /**
     * [@property] supportsVertexAmplificationCount:
     * 
     * Query device for vertex amplification support.
     * 
     * @param count The amplification count to check
     * @return BOOL value. If YES, the device supports vertex amplification with the given count. If NO, the device does
     *         not.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("supportsVertexAmplificationCount:")
    boolean supportsVertexAmplificationCount(@NUInt long count);

    /**
     * API-Since: 14.0
     */
    @Generated
    @Selector("accelerationStructureSizesWithDescriptor:")
    @ByValue
    MTLAccelerationStructureSizes accelerationStructureSizesWithDescriptor(
            @NotNull MTLAccelerationStructureDescriptor descriptor);

    /**
     * [@property] barycentricsSupported
     * 
     * Query device for Barycentric coordinates support; deprecated, use supportsShaderBarycentricCoordinates
     * 
     * @return BOOL value. If YES, the device barycentric coordinates
     * 
     *         API-Since: 14.0
     *         Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("areBarycentricCoordsSupported")
    boolean areBarycentricCoordsSupported();

    /**
     * [@property] counterSets
     * 
     * Returns the set of Counter Sets exposed by the device.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("counterSets")
    NSArray<?> counterSets();

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newAccelerationStructureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithDescriptor(
            @NotNull MTLAccelerationStructureDescriptor descriptor);

    /**
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newAccelerationStructureWithSize:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithSize(@NUInt long size);

    /**
     * newBinaryArchiveWithDescriptor:error:
     * 
     * Creates a MTLBinaryArchive using the configuration in the descriptor.
     * 
     * @see MTLBinaryArchive
     * @param descriptor The descriptor for the configuration of the binary archive to create.
     * @param error      If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the created MTLBinaryArchive. On failure, nil.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newBinaryArchiveWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBinaryArchive newBinaryArchiveWithDescriptorError(@NotNull MTLBinaryArchiveDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newCounterSampleBufferWithDescriptor:error:
     * 
     * Given a counter sample buffer descriptor, allocate a new counter
     * sample buffer.
     * This may return nil if the counters may not all be collected simultaneously.
     * 
     * @param descriptor The descriptor to create a sample buffer for
     * @param error      An error return on failure.
     * 
     *                   API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newCounterSampleBufferWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCounterSampleBuffer newCounterSampleBufferWithDescriptorError(
            @NotNull MTLCounterSampleBufferDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDynamicLibrary:error:
     * 
     * Creates a MTLDynamicLibrary by compiling the code in a MTLLibrary.
     * 
     * @see MTLDynamicLibrary
     * @param library The MTLLibrary from which to compile code. This library must have .type set to
     *                MTLLibraryTypeDynamic.
     * @param error   If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the MTLDynamicLibrary containing compiled code. On failure, nil.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newDynamicLibrary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryError(@NotNull @Mapped(ObjCObjectMapper.class) MTLLibrary library,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDynamicLibraryWithURL:error:
     * 
     * Creates a MTLDynamicLibrary by loading compiled code from a file.
     * 
     * @see MTLDynamicLibrary
     * @param url   The file URL from which to load. If the file contains no compiled code for this device, compilation
     *              is attempted as with newDynamicLibrary:error:
     * @param error If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the MTLDynamicLibrary containing compiled code (either loaded or compiled). On failure, nil.
     * 
     *         API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("newDynamicLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryWithURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * sampleTimestamps:gpuTimestamp:
     * 
     * Sample the CPU and GPU timestamps as closely as possible.
     * 
     * @param cpuTimestamp The timestamp on the CPU
     * @param gpuTimestamp The timestamp on the GPU
     * 
     *                     API-Since: 14.0
     */
    @Generated
    @Selector("sampleTimestamps:gpuTimestamp:")
    void sampleTimestampsGpuTimestamp(@NotNull LongPtr cpuTimestamp, @NotNull LongPtr gpuTimestamp);

    /**
     * supportsCounterSampling:
     * 
     * Query device for counter sampling points support.
     * 
     * @param samplingPoint Query index
     * @return BOOL value. If YES, the device supports counter sampling at given point.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsCounterSampling:")
    boolean supportsCounterSampling(@NUInt long samplingPoint);

    /**
     * [@property] supportsDynamicLibraries
     * 
     * Query device support for creating and using dynamic libraries in a compute pipeline.
     * 
     * @return BOOL value. If YES, the device supports creating and using dynamic libraries in a compute pipeline. If
     *         NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsDynamicLibraries")
    boolean supportsDynamicLibraries();

    /**
     * [@property] supportsFunctionPointers
     * 
     * Query device support for using function pointers from compute pipelines.
     * 
     * @return BOOL value. If YES, the device supports function pointers from compute pipelines. If NO, the device does
     *         not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsFunctionPointers")
    boolean supportsFunctionPointers();

    /**
     * [@property] supportsPullModelInterpolation
     * 
     * Query device for pull model interpolation support which allows a fragment shader to compute multiple
     * interpolations (at center, at centroid, at offset, at sample) of a fragment input.
     * 
     * @return BOOL value. If YES, the device supports pull model interpolation. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsPullModelInterpolation")
    boolean supportsPullModelInterpolation();

    /**
     * [@property] supportsRaytracing
     * 
     * Query device support for using ray tracing from compute pipelines.
     * 
     * @return BOOL value. If YES, the device supports ray tracing from compute pipelines. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsRaytracing")
    boolean supportsRaytracing();

    /**
     * [@property] supportsShaderBarycentricCoordinates
     * 
     * Query device for Barycentric Coordinates support.
     * 
     * @return BOOL value. If YES, the device supports barycentric coordinates. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsShaderBarycentricCoordinates")
    boolean supportsShaderBarycentricCoordinates();

    /**
     * newLibraryWithStitchedDescriptor:completionHandler:
     * 
     * Generates a new library using the graphs in the descriptor.
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("newLibraryWithStitchedDescriptor:completionHandler:")
    void newLibraryWithStitchedDescriptorCompletionHandler(@NotNull MTLStitchedLibraryDescriptor descriptor,
            @NotNull @ObjCBlock(name = "call_newLibraryWithStitchedDescriptorCompletionHandler") Block_newLibraryWithStitchedDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newLibraryWithStitchedDescriptorCompletionHandler {
        @Generated
        void call_newLibraryWithStitchedDescriptorCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object library, @Nullable NSError error);
    }

    /**
     * newLibraryWithStitchedDescriptor:error:
     * 
     * Returns a library generated using the graphs in the descriptor.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("newLibraryWithStitchedDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithStitchedDescriptorError(@NotNull MTLStitchedLibraryDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] supports32BitFloatFiltering
     * 
     * Query device for 32-bit Float texture filtering support. Specifically, R32Float, RG32Float, and RGBA32Float.
     * 
     * @return BOOL value. If YES, the device supports filtering 32-bit Float textures. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supports32BitFloatFiltering")
    boolean supports32BitFloatFiltering();

    /**
     * [@property] supports32BitMSAA
     * 
     * Query device for 32-bit MSAA texture support. Specifically, added support for allocating 32-bit Integer format
     * textures (R32Uint, R32Sint, RG32Uint, RG32Sint, RGBA32Uint, and RGBA32Sint) and resolving 32-bit Float format
     * textures (R32Float, RG32Float, and RGBA32Float).
     * 
     * @return BOOL value. If YES, the device supports these additional 32-bit MSAA texture capabilities. If NO, the
     *         devices does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supports32BitMSAA")
    boolean supports32BitMSAA();

    /**
     * [@property] supportsFunctionPointersFromRender
     * 
     * Query device support for using function pointers from render pipeline stages.
     * 
     * @return BOOL value. If YES, the device supports function pointers from render pipeline stages. If NO, the device
     *         does not.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @Selector("supportsFunctionPointersFromRender")
    boolean supportsFunctionPointersFromRender();

    /**
     * [@property] supportsPrimitiveMotionBlur
     * 
     * Query device support for using ray tracing primitive motion blur.
     * 
     * @return BOOL value. If YES, the device supports the primitive motion blur api. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsPrimitiveMotionBlur")
    boolean supportsPrimitiveMotionBlur();

    /**
     * [@property] supportsQueryTextureLOD
     * 
     * Query device for whether it supports the `calculate_clampled_lod` and `calculate_unclamped_lod` Metal shading
     * language functionality.
     * 
     * @return BOOL value. If YES, the device supports the calculate LOD functionality. If NO, the device does not.
     * 
     *         API-Since: 14.0
     */
    @Generated
    @Selector("supportsQueryTextureLOD")
    boolean supportsQueryTextureLOD();

    /**
     * [@property] supportsRaytracingFromRender
     * 
     * Query device support for using ray tracing from render pipeline stages.
     * 
     * @return BOOL value. If YES, the device supports ray tracing from render pipeline stages. If NO, the device does
     *         not.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @Selector("supportsRaytracingFromRender")
    boolean supportsRaytracingFromRender();

    /**
     * [@property] supportsRenderDynamicLibraries
     * 
     * Query device support for creating and using dynamic libraries in render pipeline stages.
     * 
     * @return BOOL value. If YES, the device supports creating and using dynamic libraries in render pipeline stages.
     *         If NO, the device does not.
     * 
     *         API-Since: 15.0
     */
    @Generated
    @Selector("supportsRenderDynamicLibraries")
    boolean supportsRenderDynamicLibraries();

    /**
     * heapAccelerationStructureSizeAndAlignWithDescriptor:
     * 
     * Determine the byte size of acceleration structures when sub-allocated from a heap. This is a convenience method
     * which computes the acceleration structure size based on the descriptor.
     * 
     * This method can be used to help determine the required heap size.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("heapAccelerationStructureSizeAndAlignWithDescriptor:")
    @ByValue
    MTLSizeAndAlign heapAccelerationStructureSizeAndAlignWithDescriptor(
            @NotNull MTLAccelerationStructureDescriptor descriptor);

    /**
     * heapAccelerationStructureSizeAndAlignWithSize:
     * 
     * Determine the byte size of acceleration structures when sub-allocated from a heap.
     * 
     * This method can be used to help determine the required heap size.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("heapAccelerationStructureSizeAndAlignWithSize:")
    @ByValue
    MTLSizeAndAlign heapAccelerationStructureSizeAndAlignWithSize(@NUInt long size);

    /**
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("newArgumentEncoderWithBufferBinding:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithBufferBinding(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLBufferBinding bufferBinding);

    /**
     * newIOCommandQueueWithDescriptor:descriptor:error:
     * 
     * Create and return an IO queue. If the creation
     * of the queue fails the return value will be nil and the optional error if passed in will be non-nil
     * with details of the error.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("newIOCommandQueueWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOCommandQueue newIOCommandQueueWithDescriptorError(@NotNull MTLIOCommandQueueDescriptor descriptor,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newIOHandleWithURL:url:compressionMethod:error:
     * 
     * Create and return a handle that points to a compressed file on disk (a file that was
     * created with MTLIOCompressionContext). This object can be used by
     * MTLIOCommandBuffer load commands to source data for MTLResources. If the creation
     * of the handle fails the return value will be nil and the optional error if passed in will be non-nil
     * with details of the error.
     * 
     * API-Since: 16.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("newIOHandleWithURL:compressionMethod:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOFileHandle newIOHandleWithURLCompressionMethodError(@NotNull NSURL url, @NInt long compressionMethod,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newIOHandleWithURL:url:error:
     * 
     * Create and return a handle that points to a raw file on disk. This object can be used by
     * MTLIOCommandBuffer load commands to source data for MTLResources. If the creation
     * of the handle fails the return value will be nil and the optional error if passed in will be non-nil
     * with details of the error.
     * 
     * API-Since: 16.0
     * Deprecated-Since: 17.0
     */
    @Deprecated
    @Nullable
    @Generated
    @Selector("newIOHandleWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIOFileHandle newIOHandleWithURLError(@NotNull NSURL url,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineStateWithMeshDescriptor:options:completionHandler:
     * 
     * Create and compile a new MTLRenderPipelineState object asynchronously given a MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithMeshDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithMeshDescriptorOptionsCompletionHandler(
            @NotNull MTLMeshRenderPipelineDescriptor descriptor, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_newRenderPipelineStateWithMeshDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithMeshDescriptorOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithMeshDescriptorOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithMeshDescriptorOptionsCompletionHandler(
                @Nullable @Mapped(ObjCObjectMapper.class) Object renderPipelineState,
                @Nullable MTLRenderPipelineReflection reflection, @Nullable NSError error);
    }

    /**
     * newRenderPipelineStateWithMeshDescriptor:options:reflection:error:
     * 
     * Create and compile a new MTLRenderPipelineState object synchronously given a MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("newRenderPipelineStateWithMeshDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithMeshDescriptorOptionsReflectionError(
            @NotNull MTLMeshRenderPipelineDescriptor descriptor, @NUInt long options,
            @Nullable @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] sparseTileSizeInBytesForSparsePageSize
     * 
     * Returns the number of bytes required to map one sparse texture tile for a given MTLSparsePageSize
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("sparseTileSizeInBytesForSparsePageSize:")
    @NUInt
    long sparseTileSizeInBytesForSparsePageSize(@NInt long sparsePageSize);

    /**
     * sparseTileSizeWithTextureType:pixelFormat:sampleCount:sparsePageSize
     * 
     * Returns tile size for sparse texture with given type, pixel format and sample count.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:sparsePageSize:")
    @ByValue
    MTLSize sparseTileSizeWithTextureTypePixelFormatSampleCountSparsePageSize(@NUInt long textureType,
            @NUInt long pixelFormat, @NUInt long sampleCount, @NInt long sparsePageSize);

    /**
     * [@property] architecture
     * 
     * Returns the device's architecture information.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("architecture")
    @NotNull
    MTLArchitecture architecture();

    /**
     * newIOFileHandleWithURL:compressionMethod:error:
     * 
     * Create and return a handle that points to a compressed file on disk (a file that was
     * created with MTLIOCompressionContext). This object can be used by
     * MTLIOCommandBuffer load commands to source data for MTLResources. If the creation
     * of the handle fails the return value will be nil and the optional error if passed in will be non-nil
     * with details of the error.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("newIOFileHandleWithURL:compressionMethod:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLIOFileHandle newIOFileHandleWithURLCompressionMethodError(@NotNull NSURL url, @NInt long compressionMethod,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * newIOFileHandleWithURL:error:
     * 
     * Create and return a handle that points to a raw file on disk. This object can be used by
     * MTLIOCommandBuffer load commands to source data for MTLResources. If the creation
     * of the handle fails the return value will be nil and the optional error if passed in will be non-nil
     * with details of the error.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("newIOFileHandleWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLIOFileHandle newIOFileHandleWithURLError(@NotNull NSURL url,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * [@property] recommendedMaxWorkingSetSize
     * 
     * Returns an approximation of how much memory this device can use with good performance.
     * 
     * Performance may be improved by keeping the total size of all resources (texture and buffers)
     * and heaps less than this threshold, beyond which the device is likely to be overcommitted and incur a
     * performance penalty.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("recommendedMaxWorkingSetSize")
    long recommendedMaxWorkingSetSize();

    /**
     * [@property] supportsBCTextureCompression
     * 
     * Query device for BC Texture format support
     * 
     * @return BOOL value. If YES, the device supports compressed BC Texture formats. If NO, the device does not.
     * 
     *         API-Since: 16.4
     */
    @Generated
    @Selector("supportsBCTextureCompression")
    boolean supportsBCTextureCompression();
}
