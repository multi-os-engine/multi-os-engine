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

import apple.NSObject;
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

/**
 * [@protocol] MTLDevice
 * <p>
 * MTLDevice represents a processor capable of data parallel computations
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLDevice")
public interface MTLDevice {
    /**
     * heapBufferSizeAndAlignWithLength:options:
     * <p>
     * Determine the byte size of buffers when sub-allocated from a heap.
     * <p>
     * This method can be used to help determine the required heap size.
     */
    @Generated
    @Selector("heapBufferSizeAndAlignWithLength:options:")
    @ByValue
    MTLSizeAndAlign heapBufferSizeAndAlignWithLengthOptions(@NUInt long length, @NUInt long options);

    /**
     * heapTextureSizeAndAlignWithDescriptor:
     * <p>
     * Determine the byte size of textures when sub-allocated from a heap.
     * <p>
     * This method can be used to help determine the required heap size.
     */
    @Generated
    @Selector("heapTextureSizeAndAlignWithDescriptor:")
    @ByValue
    MTLSizeAndAlign heapTextureSizeAndAlignWithDescriptor(MTLTextureDescriptor desc);

    /**
     * [@property] maxThreadsPerThreadgroup
     * <p>
     * The maximum number of threads along each dimension.
     */
    @Generated
    @Selector("maxThreadsPerThreadgroup")
    @ByValue
    MTLSize maxThreadsPerThreadgroup();

    /**
     * [@property] name
     * <p>
     * The full name of the vendor device.
     */
    @Generated
    @Selector("name")
    String name();

    /**
     * newBufferWithBytes:length:options:
     * <p>
     * Create a buffer by allocating new memory and specifing the initial contents to be copied into it.
     */
    @Generated
    @Selector("newBufferWithBytes:length:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesLengthOptions(ConstVoidPtr pointer, @NUInt long length, @NUInt long options);

    /**
     * newBufferWithBytesNoCopy:length:options:deallocator:
     * <p>
     * Create a buffer by wrapping an existing part of the address space.
     */
    @Generated
    @Selector("newBufferWithBytesNoCopy:length:options:deallocator:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesNoCopyLengthOptionsDeallocator(VoidPtr pointer, @NUInt long length, @NUInt long options,
            @ObjCBlock(name = "call_newBufferWithBytesNoCopyLengthOptionsDeallocator") Block_newBufferWithBytesNoCopyLengthOptionsDeallocator deallocator);

    /**
     * newBufferWithLength:options:
     * <p>
     * Create a buffer by allocating new memory.
     */
    @Generated
    @Selector("newBufferWithLength:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithLengthOptions(@NUInt long length, @NUInt long options);

    /**
     * newCommandQueue
     * <p>
     * Create and return a new command queue.   Command Queues created via this method will only allow up to 64 non-completed command buffers.
     *
     * @return The new command queue object
     */
    @Generated
    @Selector("newCommandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueue();

    /**
     * newCommandQueueWithMaxCommandBufferCount
     * <p>
     * Create and return a new command queue with a given upper bound on non-completed command buffers.
     *
     * @return The new command queue object
     */
    @Generated
    @Selector("newCommandQueueWithMaxCommandBufferCount:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueueWithMaxCommandBufferCount(@NUInt long maxCommandBufferCount);

    /**
     * newComputePipelineStateWithDescriptor:options:completionHandler:
     * <p>
     * Create and compile a new MTLComputePipelineState object asynchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:completionHandler:")
    void newComputePipelineStateWithDescriptorOptionsCompletionHandler(MTLComputePipelineDescriptor descriptor,
            @NUInt long options,
            @ObjCBlock(name = "call_newComputePipelineStateWithDescriptorOptionsCompletionHandler") Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:options:reflection:error:
     * <p>
     * Create and compile a new MTLComputePipelineState object synchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithDescriptorOptionsReflectionError(
            MTLComputePipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newComputePipelineStateWithDescriptor:completionHandler:
     * <p>
     * Create and compile a new MTLComputePipelineState object asynchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:completionHandler:")
    void newComputePipelineStateWithFunctionCompletionHandler(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @ObjCBlock(name = "call_newComputePipelineStateWithFunctionCompletionHandler") Block_newComputePipelineStateWithFunctionCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:error:
     * <p>
     * Create and compile a new MTLComputePipelineState object synchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionError(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newComputePipelineStateWithDescriptor:options:completionHandler:
     * <p>
     * Create and compile a new MTLComputePipelineState object asynchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:options:completionHandler:")
    void newComputePipelineStateWithFunctionOptionsCompletionHandler(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @ObjCBlock(name = "call_newComputePipelineStateWithFunctionOptionsCompletionHandler") Block_newComputePipelineStateWithFunctionOptionsCompletionHandler completionHandler);

    /**
     * newComputePipelineStateWithDescriptor:options:reflection:error:
     * <p>
     * Create and compile a new MTLComputePipelineState object synchronously.
     */
    @Generated
    @Selector("newComputePipelineStateWithFunction:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionOptionsReflectionError(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDefaultLibrary
     * <p>
     * Returns the default library for the main bundle.
     * <p>
     * use newDefaultLibraryWithBundle:error: to get an NSError in case of failure.
     */
    @Generated
    @Selector("newDefaultLibrary")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibrary();

    /**
     * newDefaultLibraryWithBundle:error:
     * <p>
     * Returns the default library for a given bundle.
     *
     * @return A pointer to the library, nil if an error occurs.
     */
    @Generated
    @Selector("newDefaultLibraryWithBundle:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibraryWithBundleError(NSBundle bundle,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDepthStencilStateWithDescriptor:
     * <p>
     * Create a depth/stencil test state object.
     */
    @Generated
    @Selector("newDepthStencilStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDepthStencilState newDepthStencilStateWithDescriptor(MTLDepthStencilDescriptor descriptor);

    /**
     * newFence
     * <p>
     * Create a new MTLFence object
     */
    @Generated
    @Selector("newFence")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFence newFence();

    /**
     * newHeapWithDescriptor:
     * <p>
     * Create a new heap with the given descriptor.
     */
    @Generated
    @Selector("newHeapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap newHeapWithDescriptor(MTLHeapDescriptor descriptor);

    /**
     * newLibraryWithData:
     * <p>
     * Load a MTLLibrary from a dispatch_data_t
     *
     * @param data  A metallib file already loaded as data in the form of dispatch_data_t.
     * @param error An error if we fail to open the metallib data.
     */
    @Generated
    @Selector("newLibraryWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithDataError(NSObject data, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newLibraryWithFile:
     * <p>
     * Load a MTLLibrary from a metallib file.
     */
    @Generated
    @Selector("newLibraryWithFile:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithFileError(String filepath, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newLibraryWithSource:options:completionHandler:
     * <p>
     * Load a MTLLibrary from source.
     */
    @Generated
    @Selector("newLibraryWithSource:options:completionHandler:")
    void newLibraryWithSourceOptionsCompletionHandler(String source, MTLCompileOptions options,
            @ObjCBlock(name = "call_newLibraryWithSourceOptionsCompletionHandler") Block_newLibraryWithSourceOptionsCompletionHandler completionHandler);

    /**
     * newLibraryWithSource:options:error:
     * <p>
     * Load a MTLLibrary from source.
     */
    @Generated
    @Selector("newLibraryWithSource:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithSourceOptionsError(String source, MTLCompileOptions options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineState:completionHandler:
     * <p>
     * Create and compile a new MTLRenderPipelineState object asynchronously.
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:completionHandler:")
    void newRenderPipelineStateWithDescriptorCompletionHandler(MTLRenderPipelineDescriptor descriptor,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorCompletionHandler") Block_newRenderPipelineStateWithDescriptorCompletionHandler completionHandler);

    /**
     * newRenderPipelineStateWithDescriptor:error:
     * <p>
     * Create and compile a new MTLRenderPipelineState object synchronously.
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorError(MTLRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineState:options:completionHandler:
     * <p>
     * Create and compile a new MTLRenderPipelineState object asynchronously and returns additional reflection information
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithDescriptorOptionsCompletionHandler(MTLRenderPipelineDescriptor descriptor,
            @NUInt long options,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    /**
     * newRenderPipelineStateWithDescriptor:options:reflection:error:
     * <p>
     * Create and compile a new MTLRenderPipelineState object synchronously and returns additional reflection information.
     */
    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorOptionsReflectionError(
            MTLRenderPipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newSamplerStateWithDescriptor:
     * <p>
     * Create a new sampler.
     */
    @Generated
    @Selector("newSamplerStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSamplerState newSamplerStateWithDescriptor(MTLSamplerDescriptor descriptor);

    /**
     * newTextureWithDescriptor:
     * <p>
     * Allocate a new texture with privately owned storage.
     */
    @Generated
    @Selector("newTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptor(MTLTextureDescriptor descriptor);

    /**
     * supportsFeatureSet:
     * <p>
     * Returns TRUE if the feature set is supported by this MTLDevice.
     */
    @Generated
    @Selector("supportsFeatureSet:")
    boolean supportsFeatureSet(@NUInt long featureSet);

    /**
     * supportsTextureSampleCount:
     * <p>
     * Query device if it support textures with a given sampleCount.
     *
     * @return BOOL value. If YES, device supports the given sampleCount for textures. If NO, device does not support the given sampleCount.
     */
    @Generated
    @Selector("supportsTextureSampleCount:")
    boolean supportsTextureSampleCount(@NUInt long sampleCount);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newBufferWithBytesNoCopyLengthOptionsDeallocator {
        @Generated
        void call_newBufferWithBytesNoCopyLengthOptionsDeallocator(VoidPtr pointer, @NUInt long length);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithDescriptorOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object computePipelineState,
                MTLComputePipelineReflection _Nullable_result);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithFunctionCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithFunctionCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object computePipelineState, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newComputePipelineStateWithFunctionOptionsCompletionHandler {
        @Generated
        void call_newComputePipelineStateWithFunctionOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object computePipelineState,
                MTLComputePipelineReflection _Nullable_result);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newLibraryWithSourceOptionsCompletionHandler {
        @Generated
        void call_newLibraryWithSourceOptionsCompletionHandler(@Mapped(ObjCObjectMapper.class) Object library,
                NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object renderPipelineState, NSError error);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object renderPipelineState,
                MTLRenderPipelineReflection _Nullable_result);
    }

    /**
     * [@property] programmableSaplePositionsSupported
     * <p>
     * Query device for programmable sample position support.
     *
     * @return BOOL value. If YES, the device supports programmable sample positions. If NO, the device does not.
     */
    @Generated
    @Selector("areProgrammableSamplePositionsSupported")
    boolean areProgrammableSamplePositionsSupported();

    /**
     * [@property] rasterOrderGroupsSupported
     * <p>
     * Query device for raster order groups support.
     *
     * @return BOOL value. If YES, the device supports raster order groups. If NO, the device does not.
     */
    @Generated
    @Selector("areRasterOrderGroupsSupported")
    boolean areRasterOrderGroupsSupported();

    /**
     * [@property] argumentBuffersSupport
     * <p>
     * Query support tier for Argument Buffers.
     *
     * @return MTLArgumentBuffersTier enum value.
     */
    @Generated
    @Selector("argumentBuffersSupport")
    @NUInt
    long argumentBuffersSupport();

    /**
     * [@property] currentAllocatedSize
     * <p>
     * The current size in bytes of all resources allocated by this device
     */
    @Generated
    @Selector("currentAllocatedSize")
    @NUInt
    long currentAllocatedSize();

    /**
     * getDefaultSamplePositions:count:
     * <p>
     * Retrieve the default sample positions.
     *
     * @param positions The destination array for default sample position data.
     * @param count     Specifies the sample count for which to retrieve the default positions, the length of the positions array, and must be set to a valid sample count.
     */
    @Generated
    @Selector("getDefaultSamplePositions:count:")
    void getDefaultSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    /**
     * [@property] maxThreadgroupMemoryLength
     * <p>
     * The maximum threadgroup memory available, in bytes.
     */
    @Generated
    @Selector("maxThreadgroupMemoryLength")
    @NUInt
    long maxThreadgroupMemoryLength();

    /**
     * minimumLinearTextureAlignmentForPixelFormat:
     * <p>
     * Returns the minimum alignment required for offset and rowBytes when creating a linear texture. An error is thrown for queries with invalid pixel formats (depth, stencil, or compressed formats).
     */
    @Generated
    @Selector("minimumLinearTextureAlignmentForPixelFormat:")
    @NUInt
    long minimumLinearTextureAlignmentForPixelFormat(@NUInt long format);

    /**
     * newArgumentEncoderWithArguments:count:
     * <p>
     * Creates an argument encoder for an array of argument descriptors which will be encoded sequentially.
     */
    @Generated
    @Selector("newArgumentEncoderWithArguments:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithArguments(NSArray<? extends MTLArgumentDescriptor> arguments);

    /**
     * newLibraryWithURL:
     * <p>
     * Load a MTLLibrary from a metallib file.
     */
    @Generated
    @Selector("newLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newRenderPipelineStateWithTileDescriptor:options:completionHandler:
     * <p>
     * Create and compile a new MTLRenderPipelineState object asynchronously given a MTLTileRenderPipelineDescriptor.
     */
    @Generated
    @Selector("newRenderPipelineStateWithTileDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler(MTLTileRenderPipelineDescriptor descriptor,
            @NUInt long options,
            @ObjCBlock(name = "call_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler {
        @Generated
        void call_newRenderPipelineStateWithTileDescriptorOptionsCompletionHandler(
                @Mapped(ObjCObjectMapper.class) Object renderPipelineState,
                MTLRenderPipelineReflection _Nullable_result);
    }

    /**
     * newRenderPipelineStateWithTileDescriptor:options:reflection:error:
     * <p>
     * Create and compile a new MTLRenderPipelineState object synchronously given a MTLTileRenderPipelineDescriptor.
     */
    @Generated
    @Selector("newRenderPipelineStateWithTileDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithTileDescriptorOptionsReflectionError(
            MTLTileRenderPipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newTextureWithDescriptor:iosurface:plane
     * <p>
     * Create a new texture from an IOSurface.
     *
     * @param descriptor A description of the properties for the new texture.
     * @param iosurface  The IOSurface to use as storage for the new texture.
     * @param plane      The plane within the IOSurface to use.
     * @return A new texture object.
     */
    @Generated
    @Selector("newTextureWithDescriptor:iosurface:plane:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorIosurfacePlane(MTLTextureDescriptor descriptor, IOSurfaceRef iosurface,
            @NUInt long plane);

    /**
     * [@property] readWriteTextureSupport
     * <p>
     * Query support tier for read-write texture formats.
     *
     * @return MTLReadWriteTextureTier enum value.
     */
    @Generated
    @Selector("readWriteTextureSupport")
    @NUInt
    long readWriteTextureSupport();

    /**
     * [@property] registryID
     * <p>
     * Returns the IORegistry ID for the Metal device
     * <p>
     * The registryID value for a Metal device is global to all tasks, and may be used
     * to identify the GPU across task boundaries.
     */
    @Generated
    @Selector("registryID")
    long registryID();

    /**
     * * @method convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:
     * * @abstract Converts regions in pixels to regions in sparse tiles using specified alignment mode.
     * Tile size can be obtained from tileSizeWithTextureType:pixelFormat:sampleCount: method.
     */
    @Generated
    @IsOptional
    @Selector("convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:")
    default void convertSparsePixelRegionsToTileRegionsWithTileSizeAlignmentModeNumRegions(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @ByValue MTLSize tileSize, @NUInt long mode, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * * @method convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:
     * * @abstract Convertes region in sparse tiles to region in pixels
     * Tile size can be obtained from tileSizeWithTextureType:pixelFormat:sampleCount: method.
     */
    @Generated
    @IsOptional
    @Selector("convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:")
    default void convertSparseTileRegionsToPixelRegionsWithTileSizeNumRegions(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @ByValue MTLSize tileSize, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * [@property] hasUnifiedMemory
     * <p>
     * Returns YES if this GPU shares its memory with the rest of the machine (CPU, etc.)
     * <p>
     * Some GPU architectures do not have dedicated local memory and instead only use the same memory shared with the rest
     * of the machine.  This property will return YES for GPUs that fall into that category.
     */
    @Generated
    @Selector("hasUnifiedMemory")
    boolean hasUnifiedMemory();

    /**
     * [@property] maxArgumentBufferSamplerCount
     * <p>
     * The maximum number of unique argument buffer samplers per app.
     * <p>
     * This limit is only applicable to samplers that have their supportArgumentBuffers property set to true. A MTLSamplerState object is considered unique if the configuration of its originating MTLSamplerDescriptor properties is unique. For example, two samplers with equal minFilter values but different magFilter values are considered unique.
     */
    @Generated
    @Selector("maxArgumentBufferSamplerCount")
    @NUInt
    long maxArgumentBufferSamplerCount();

    @Generated
    @Selector("maxBufferLength")
    @NUInt
    long maxBufferLength();

    /**
     * minimumTextureBufferAlignmentForPixelFormat:
     * <p>
     * Returns the minimum alignment required for offset and rowBytes when creating a texture buffer from a buffer.
     */
    @Generated
    @Selector("minimumTextureBufferAlignmentForPixelFormat:")
    @NUInt
    long minimumTextureBufferAlignmentForPixelFormat(@NUInt long format);

    /**
     * newEvent
     * <p>
     * Returns a new single-device non-shareable Metal event object
     */
    @Generated
    @Selector("newEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLEvent newEvent();

    /**
     * newIndirectCommandBufferWithDescriptor:maxCommandCount:options
     * <p>
     * Creates a new indirect command buffer with the given descriptor and count.
     * <p>
     * The returned buffer can be safely executed without first encoding into (but is wasteful).
     *
     * @param descriptor The descriptor encodes the maximum logical stride of each command.
     * @param maxCount   The maximum number of commands that this buffer can contain.
     * @param options    The options for the indirect command buffer.
     */
    @Generated
    @Selector("newIndirectCommandBufferWithDescriptor:maxCommandCount:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIndirectCommandBuffer newIndirectCommandBufferWithDescriptorMaxCommandCountOptions(
            MTLIndirectCommandBufferDescriptor descriptor, @NUInt long maxCount, @NUInt long options);

    /**
     * newRasterizationRateMapWithDescriptor:
     * <p>
     * Creates a new variable rasterization rate map with the given descriptor.
     * <p>
     * If '[self supportsRasterizationRateMapWithLayerCount:descriptor.layerCount]' returns NO, or descriptor.screenSize describes an empty region, the result will always be nil.
     *
     * @return A MTLRasterizationRateMap instance that can be used for rendering on this MTLDevice, or nil if the device does not support the combination of parameters stored in the descriptor.
     */
    @Generated
    @Selector("newRasterizationRateMapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRasterizationRateMap newRasterizationRateMapWithDescriptor(MTLRasterizationRateMapDescriptor descriptor);

    /**
     * newSharedEvent
     * <p>
     * Returns a shareable multi-device event.
     */
    @Generated
    @Selector("newSharedEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEvent();

    /**
     * newSharedEventWithHandle
     * <p>
     * Creates a shareable multi-device event from an existing shared event handle.
     */
    @Generated
    @Selector("newSharedEventWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEventWithHandle(MTLSharedEventHandle sharedEventHandle);

    /**
     * newSharedTextureWithDescriptor
     * <p>
     * Create a new texture that can be shared across process boundaries.
     * <p>
     * This texture can be shared between process boundaries
     * but not between different GPUs, by passing its MTLSharedTextureHandle.
     *
     * @param descriptor A description of the properties for the new texture.
     * @return A new texture object.
     */
    @Generated
    @Selector("newSharedTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithDescriptor(MTLTextureDescriptor descriptor);

    /**
     * newSharedTextureWithHandle
     * <p>
     * Recreate shared texture from received texture handle.
     * <p>
     * This texture was shared between process boundaries by other
     * process using MTLSharedTextureHandle. Current process will now share
     * it with other processes and will be able to interact with it (but still
     * in scope of the same GPUs).
     *
     * @param sharedHandle Handle to shared texture in this process space.
     * @return A new texture object.
     */
    @Generated
    @Selector("newSharedTextureWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithHandle(MTLSharedTextureHandle sharedHandle);

    /**
     * [@property] sparseTileSizeInBytes
     * <p>
     * Returns the number of bytes required to map one sparse texture tile.
     */
    @Generated
    @Selector("sparseTileSizeInBytes")
    @NUInt
    long sparseTileSizeInBytes();

    /**
     * sparseTileSizeWithTextureType:pixelFormat:sampleCount:
     * <p>
     * Returns tile size for sparse texture with given type, pixel format and sample count.
     */
    @Generated
    @Selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:")
    @ByValue
    MTLSize sparseTileSizeWithTextureTypePixelFormatSampleCount(@NUInt long textureType, @NUInt long pixelFormat,
            @NUInt long sampleCount);

    /**
     * supportsFamily:
     * <p>
     * Returns TRUE if the GPU Family is supported by this MTLDevice.
     */
    @Generated
    @Selector("supportsFamily:")
    boolean supportsFamily(@NInt long gpuFamily);

    /**
     * supportsRasterizationRateMapWithLayerCount:
     * <p>
     * Query device for variable rasterization rate support with the given number of layers.
     *
     * @param layerCount The number of layers for which to query device support.
     * @return YES if the device supports creation of rendering using a MTLRasterizationRateMap with the given number of layers.
     */
    @Generated
    @Selector("supportsRasterizationRateMapWithLayerCount:")
    boolean supportsRasterizationRateMapWithLayerCount(@NUInt long layerCount);

    /**
     * [@property] supportsVertexAmplificationCount:
     * <p>
     * Query device for vertex amplification support.
     *
     * @param count The amplification count to check
     * @return BOOL value. If YES, the device supports vertex amplification with the given count. If NO, the device does not.
     */
    @Generated
    @Selector("supportsVertexAmplificationCount:")
    boolean supportsVertexAmplificationCount(@NUInt long count);

    @Generated
    @Selector("accelerationStructureSizesWithDescriptor:")
    @ByValue
    MTLAccelerationStructureSizes accelerationStructureSizesWithDescriptor(
            MTLAccelerationStructureDescriptor descriptor);

    /**
     * [@property] barycentricsSupported
     * <p>
     * Query device for Barycentric coordinates support; deprecated, use supportsShaderBarycentricCoordinates
     *
     * @return BOOL value. If YES, the device barycentric coordinates
     */
    @Generated
    @Selector("areBarycentricCoordsSupported")
    boolean areBarycentricCoordsSupported();

    /**
     * [@property] counterSets
     * <p>
     * Returns the set of Counter Sets exposed by the device.
     */
    @Generated
    @Selector("counterSets")
    NSArray<?> counterSets();

    @Generated
    @Selector("newAccelerationStructureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithDescriptor(MTLAccelerationStructureDescriptor descriptor);

    @Generated
    @Selector("newAccelerationStructureWithSize:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithSize(@NUInt long size);

    /**
     * newBinaryArchiveWithDescriptor:error:
     * <p>
     * Creates a MTLBinaryArchive using the configuration in the descriptor.
     *
     * @param descriptor The descriptor for the configuration of the binary archive to create.
     * @param error      If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the created MTLBinaryArchive. On failure, nil.
     * @see MTLBinaryArchive
     */
    @Generated
    @Selector("newBinaryArchiveWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBinaryArchive newBinaryArchiveWithDescriptorError(MTLBinaryArchiveDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newCounterSampleBufferWithDescriptor:error:
     * <p>
     * Given a counter sample buffer descriptor, allocate a new counter
     * sample buffer.
     * This may return nil if the counters may not all be collected simultaneously.
     *
     * @param descriptor The descriptor to create a sample buffer for
     * @param error      An error return on failure.
     */
    @Generated
    @Selector("newCounterSampleBufferWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCounterSampleBuffer newCounterSampleBufferWithDescriptorError(MTLCounterSampleBufferDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDynamicLibrary:error:
     * <p>
     * Creates a MTLDynamicLibrary by compiling the code in a MTLLibrary.
     *
     * @param library The MTLLibrary from which to compile code. This library must have .type set to MTLLibraryTypeDynamic.
     * @param error   If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the MTLDynamicLibrary containing compiled code. On failure, nil.
     * @see MTLDynamicLibrary
     */
    @Generated
    @Selector("newDynamicLibrary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryError(@Mapped(ObjCObjectMapper.class) MTLLibrary library,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newDynamicLibraryWithURL:error:
     * <p>
     * Creates a MTLDynamicLibrary by loading compiled code from a file.
     *
     * @param url   The file URL from which to load. If the file contains no compiled code for this device, compilation is attempted as with newDynamicLibrary:error:
     * @param error If an error occurs during creation, this parameter is updated to describe the failure.
     * @return On success, the MTLDynamicLibrary containing compiled code (either loaded or compiled). On failure, nil.
     * @see MTLDynamicLibrary
     */
    @Generated
    @Selector("newDynamicLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryWithURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * sampleTimestamps:gpuTimestamp:
     * <p>
     * Sample the CPU and GPU timestamps as closely as possible.
     *
     * @param cpuTimestamp The timestamp on the CPU
     * @param gpuTimestamp The timestamp on the GPU
     */
    @Generated
    @Selector("sampleTimestamps:gpuTimestamp:")
    void sampleTimestampsGpuTimestamp(LongPtr cpuTimestamp, LongPtr gpuTimestamp);

    /**
     * supportsCounterSampling:
     * <p>
     * Query device for counter sampling points support.
     *
     * @param samplingPoint Query index
     * @return BOOL value. If YES, the device supports counter sampling at given point.
     */
    @Generated
    @Selector("supportsCounterSampling:")
    boolean supportsCounterSampling(@NUInt long samplingPoint);

    /**
     * [@property] supportsDynamicLibraries
     * <p>
     * Query device support for creating and using dynamic libraries in a compute pipeline.
     *
     * @return BOOL value. If YES, the device supports creating and using dynamic libraries in a compute pipeline. If NO, the device does not.
     */
    @Generated
    @Selector("supportsDynamicLibraries")
    boolean supportsDynamicLibraries();

    /**
     * [@property] supportsFunctionPointers
     * <p>
     * Query device support for using function pointers from compute pipelines.
     *
     * @return BOOL value. If YES, the device supports function pointers from compute pipelines. If NO, the device does not.
     */
    @Generated
    @Selector("supportsFunctionPointers")
    boolean supportsFunctionPointers();

    /**
     * [@property] supportsPullModelInterpolation
     * <p>
     * Query device for pull model interpolation support which allows a fragment shader to compute multiple interpolations (at center, at centroid, at offset, at sample) of a fragment input.
     *
     * @return BOOL value. If YES, the device supports pull model interpolation. If NO, the device does not.
     */
    @Generated
    @Selector("supportsPullModelInterpolation")
    boolean supportsPullModelInterpolation();

    /**
     * [@property] supportsRaytracing
     * <p>
     * Query device support for using ray tracing from compute pipelines.
     *
     * @return BOOL value. If YES, the device supports ray tracing from compute pipelines. If NO, the device does not.
     */
    @Generated
    @Selector("supportsRaytracing")
    boolean supportsRaytracing();

    /**
     * [@property] supportsShaderBarycentricCoordinates
     * <p>
     * Query device for Barycentric Coordinates support.
     *
     * @return BOOL value. If YES, the device supports barycentric coordinates. If NO, the device does not.
     */
    @Generated
    @Selector("supportsShaderBarycentricCoordinates")
    boolean supportsShaderBarycentricCoordinates();

    /**
     * newLibraryWithStitchedDescriptor:completionHandler:
     * <p>
     * Generates a new library using the graphs in the descriptor.
     */
    @Generated
    @Selector("newLibraryWithStitchedDescriptor:completionHandler:")
    void newLibraryWithStitchedDescriptorCompletionHandler(MTLStitchedLibraryDescriptor descriptor,
            @ObjCBlock(name = "call_newLibraryWithStitchedDescriptorCompletionHandler") Block_newLibraryWithStitchedDescriptorCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_newLibraryWithStitchedDescriptorCompletionHandler {
        @Generated
        void call_newLibraryWithStitchedDescriptorCompletionHandler(@Mapped(ObjCObjectMapper.class) Object library,
                NSError error);
    }

    /**
     * newLibraryWithStitchedDescriptor:error:
     * <p>
     * Returns a library generated using the graphs in the descriptor.
     */
    @Generated
    @Selector("newLibraryWithStitchedDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithStitchedDescriptorError(MTLStitchedLibraryDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * [@property] supports32BitFloatFiltering
     * <p>
     * Query device for 32-bit Float texture filtering support. Specifically, R32Float, RG32Float, and RGBA32Float.
     *
     * @return BOOL value. If YES, the device supports filtering 32-bit Float textures. If NO, the device does not.
     */
    @Generated
    @Selector("supports32BitFloatFiltering")
    boolean supports32BitFloatFiltering();

    /**
     * [@property] supports32BitMSAA
     * <p>
     * Query device for 32-bit MSAA texture support. Specifically, added support for allocating 32-bit Integer format textures (R32Uint, R32Sint, RG32Uint, RG32Sint, RGBA32Uint, and RGBA32Sint) and resolving 32-bit Float format textures (R32Float, RG32Float, and RGBA32Float).
     *
     * @return BOOL value. If YES, the device supports these additional 32-bit MSAA texture capabilities. If NO, the devices does not.
     */
    @Generated
    @Selector("supports32BitMSAA")
    boolean supports32BitMSAA();

    /**
     * [@property] supportsFunctionPointersFromRender
     * <p>
     * Query device support for using function pointers from render pipeline stages.
     *
     * @return BOOL value. If YES, the device supports function pointers from render pipeline stages. If NO, the device does not.
     */
    @Generated
    @Selector("supportsFunctionPointersFromRender")
    boolean supportsFunctionPointersFromRender();

    /**
     * [@property] supportsPrimitiveMotionBlur
     * <p>
     * Query device support for using ray tracing primitive motion blur.
     *
     * @return BOOL value. If YES, the device supports the primitive motion blur api. If NO, the device does not.
     */
    @Generated
    @Selector("supportsPrimitiveMotionBlur")
    boolean supportsPrimitiveMotionBlur();

    /**
     * [@property] supportsQueryTextureLOD
     * <p>
     * Query device for whether it supports the `calculate_clampled_lod` and `calculate_unclamped_lod` Metal shading language functionality.
     *
     * @return BOOL value. If YES, the device supports the calculate LOD functionality. If NO, the device does not.
     */
    @Generated
    @Selector("supportsQueryTextureLOD")
    boolean supportsQueryTextureLOD();

    /**
     * [@property] supportsRaytracingFromRender
     * <p>
     * Query device support for using ray tracing from render pipeline stages.
     *
     * @return BOOL value. If YES, the device supports ray tracing from render pipeline stages. If NO, the device does not.
     */
    @Generated
    @Selector("supportsRaytracingFromRender")
    boolean supportsRaytracingFromRender();

    /**
     * [@property] supportsRenderDynamicLibraries
     * <p>
     * Query device support for creating and using dynamic libraries in render pipeline stages.
     *
     * @return BOOL value. If YES, the device supports creating and using dynamic libraries in render pipeline stages. If NO, the device does not.
     */
    @Generated
    @Selector("supportsRenderDynamicLibraries")
    boolean supportsRenderDynamicLibraries();
}
