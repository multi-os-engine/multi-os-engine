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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLDevice")
public interface MTLDevice {
    @Generated
    @Selector("heapBufferSizeAndAlignWithLength:options:")
    @ByValue
    MTLSizeAndAlign heapBufferSizeAndAlignWithLengthOptions(@NUInt long length, @NUInt long options);

    @Generated
    @Selector("heapTextureSizeAndAlignWithDescriptor:")
    @ByValue
    MTLSizeAndAlign heapTextureSizeAndAlignWithDescriptor(MTLTextureDescriptor desc);

    @Generated
    @Selector("maxThreadsPerThreadgroup")
    @ByValue
    MTLSize maxThreadsPerThreadgroup();

    @Generated
    @Selector("name")
    String name();

    @Generated
    @Selector("newBufferWithBytes:length:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesLengthOptions(ConstVoidPtr pointer, @NUInt long length, @NUInt long options);

    @Generated
    @Selector("newBufferWithBytesNoCopy:length:options:deallocator:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithBytesNoCopyLengthOptionsDeallocator(VoidPtr pointer, @NUInt long length, @NUInt long options,
            @ObjCBlock(name = "call_newBufferWithBytesNoCopyLengthOptionsDeallocator") Block_newBufferWithBytesNoCopyLengthOptionsDeallocator deallocator);

    @Generated
    @Selector("newBufferWithLength:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithLengthOptions(@NUInt long length, @NUInt long options);

    @Generated
    @Selector("newCommandQueue")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueue();

    @Generated
    @Selector("newCommandQueueWithMaxCommandBufferCount:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandQueue newCommandQueueWithMaxCommandBufferCount(@NUInt long maxCommandBufferCount);

    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:completionHandler:")
    void newComputePipelineStateWithDescriptorOptionsCompletionHandler(MTLComputePipelineDescriptor descriptor,
            @NUInt long options,
            @ObjCBlock(name = "call_newComputePipelineStateWithDescriptorOptionsCompletionHandler") Block_newComputePipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newComputePipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithDescriptorOptionsReflectionError(
            MTLComputePipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newComputePipelineStateWithFunction:completionHandler:")
    void newComputePipelineStateWithFunctionCompletionHandler(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @ObjCBlock(name = "call_newComputePipelineStateWithFunctionCompletionHandler") Block_newComputePipelineStateWithFunctionCompletionHandler completionHandler);

    @Generated
    @Selector("newComputePipelineStateWithFunction:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionError(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newComputePipelineStateWithFunction:options:completionHandler:")
    void newComputePipelineStateWithFunctionOptionsCompletionHandler(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @ObjCBlock(name = "call_newComputePipelineStateWithFunctionOptionsCompletionHandler") Block_newComputePipelineStateWithFunctionOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newComputePipelineStateWithFunction:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithFunctionOptionsReflectionError(
            @Mapped(ObjCObjectMapper.class) MTLFunction computeFunction, @NUInt long options,
            @ReferenceInfo(type = MTLComputePipelineReflection.class) Ptr<MTLComputePipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newDefaultLibrary")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibrary();

    @Generated
    @Selector("newDefaultLibraryWithBundle:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newDefaultLibraryWithBundleError(NSBundle bundle,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newDepthStencilStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDepthStencilState newDepthStencilStateWithDescriptor(MTLDepthStencilDescriptor descriptor);

    @Generated
    @Selector("newFence")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFence newFence();

    @Generated
    @Selector("newHeapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap newHeapWithDescriptor(MTLHeapDescriptor descriptor);

    @Generated
    @Selector("newLibraryWithData:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithDataError(NSObject data, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newLibraryWithFile:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithFileError(String filepath, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newLibraryWithSource:options:completionHandler:")
    void newLibraryWithSourceOptionsCompletionHandler(String source, MTLCompileOptions options,
            @ObjCBlock(name = "call_newLibraryWithSourceOptionsCompletionHandler") Block_newLibraryWithSourceOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newLibraryWithSource:options:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithSourceOptionsError(String source, MTLCompileOptions options,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:completionHandler:")
    void newRenderPipelineStateWithDescriptorCompletionHandler(MTLRenderPipelineDescriptor descriptor,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorCompletionHandler") Block_newRenderPipelineStateWithDescriptorCompletionHandler completionHandler);

    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorError(MTLRenderPipelineDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:completionHandler:")
    void newRenderPipelineStateWithDescriptorOptionsCompletionHandler(MTLRenderPipelineDescriptor descriptor,
            @NUInt long options,
            @ObjCBlock(name = "call_newRenderPipelineStateWithDescriptorOptionsCompletionHandler") Block_newRenderPipelineStateWithDescriptorOptionsCompletionHandler completionHandler);

    @Generated
    @Selector("newRenderPipelineStateWithDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithDescriptorOptionsReflectionError(
            MTLRenderPipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newSamplerStateWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSamplerState newSamplerStateWithDescriptor(MTLSamplerDescriptor descriptor);

    @Generated
    @Selector("newTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptor(MTLTextureDescriptor descriptor);

    @Generated
    @Selector("supportsFeatureSet:")
    boolean supportsFeatureSet(@NUInt long featureSet);

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
                @Mapped(ObjCObjectMapper.class) Object computePipelineState, MTLComputePipelineReflection reflection,
                NSError error);
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
                @Mapped(ObjCObjectMapper.class) Object computePipelineState, MTLComputePipelineReflection reflection,
                NSError error);
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
                @Mapped(ObjCObjectMapper.class) Object renderPipelineState, MTLRenderPipelineReflection reflection,
                NSError error);
    }

    @Generated
    @Selector("areProgrammableSamplePositionsSupported")
    boolean areProgrammableSamplePositionsSupported();

    @Generated
    @Selector("areRasterOrderGroupsSupported")
    boolean areRasterOrderGroupsSupported();

    @Generated
    @Selector("argumentBuffersSupport")
    @NUInt
    long argumentBuffersSupport();

    @Generated
    @Selector("currentAllocatedSize")
    @NUInt
    long currentAllocatedSize();

    @Generated
    @Selector("getDefaultSamplePositions:count:")
    void getDefaultSamplePositionsCount(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLSamplePosition positions,
            @NUInt long count);

    @Generated
    @Selector("maxThreadgroupMemoryLength")
    @NUInt
    long maxThreadgroupMemoryLength();

    @Generated
    @Selector("minimumLinearTextureAlignmentForPixelFormat:")
    @NUInt
    long minimumLinearTextureAlignmentForPixelFormat(@NUInt long format);

    @Generated
    @Selector("newArgumentEncoderWithArguments:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithArguments(NSArray<? extends MTLArgumentDescriptor> arguments);

    @Generated
    @Selector("newLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLLibrary newLibraryWithURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
                @Mapped(ObjCObjectMapper.class) Object renderPipelineState, MTLRenderPipelineReflection reflection,
                NSError error);
    }

    @Generated
    @Selector("newRenderPipelineStateWithTileDescriptor:options:reflection:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithTileDescriptorOptionsReflectionError(
            MTLTileRenderPipelineDescriptor descriptor, @NUInt long options,
            @ReferenceInfo(type = MTLRenderPipelineReflection.class) Ptr<MTLRenderPipelineReflection> reflection,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newTextureWithDescriptor:iosurface:plane:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorIosurfacePlane(MTLTextureDescriptor descriptor, IOSurfaceRef iosurface,
            @NUInt long plane);

    @Generated
    @Selector("readWriteTextureSupport")
    @NUInt
    long readWriteTextureSupport();

    @Generated
    @Selector("registryID")
    long registryID();

    @Generated
    @IsOptional
    @Selector("convertSparsePixelRegions:toTileRegions:withTileSize:alignmentMode:numRegions:")
    default void convertSparsePixelRegionsToTileRegionsWithTileSizeAlignmentModeNumRegions(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @ByValue MTLSize tileSize, @NUInt long mode, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("convertSparseTileRegions:toPixelRegions:withTileSize:numRegions:")
    default void convertSparseTileRegionsToPixelRegionsWithTileSizeNumRegions(
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion tileRegions,
            @UncertainArgument("Options: reference, array Fallback: reference") MTLRegion pixelRegions,
            @ByValue MTLSize tileSize, @NUInt long numRegions) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("hasUnifiedMemory")
    boolean hasUnifiedMemory();

    @Generated
    @Selector("maxArgumentBufferSamplerCount")
    @NUInt
    long maxArgumentBufferSamplerCount();

    @Generated
    @Selector("maxBufferLength")
    @NUInt
    long maxBufferLength();

    @Generated
    @Selector("minimumTextureBufferAlignmentForPixelFormat:")
    @NUInt
    long minimumTextureBufferAlignmentForPixelFormat(@NUInt long format);

    @Generated
    @Selector("newEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLEvent newEvent();

    @Generated
    @Selector("newIndirectCommandBufferWithDescriptor:maxCommandCount:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIndirectCommandBuffer newIndirectCommandBufferWithDescriptorMaxCommandCountOptions(
            MTLIndirectCommandBufferDescriptor descriptor, @NUInt long maxCount, @NUInt long options);

    @Generated
    @Selector("newRasterizationRateMapWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRasterizationRateMap newRasterizationRateMapWithDescriptor(MTLRasterizationRateMapDescriptor descriptor);

    @Generated
    @Selector("newSharedEvent")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEvent();

    @Generated
    @Selector("newSharedEventWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLSharedEvent newSharedEventWithHandle(MTLSharedEventHandle sharedEventHandle);

    @Generated
    @Selector("newSharedTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithDescriptor(MTLTextureDescriptor descriptor);

    @Generated
    @Selector("newSharedTextureWithHandle:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newSharedTextureWithHandle(MTLSharedTextureHandle sharedHandle);

    @Generated
    @Selector("sparseTileSizeInBytes")
    @NUInt
    long sparseTileSizeInBytes();

    @Generated
    @Selector("sparseTileSizeWithTextureType:pixelFormat:sampleCount:")
    @ByValue
    MTLSize sparseTileSizeWithTextureTypePixelFormatSampleCount(@NUInt long textureType, @NUInt long pixelFormat,
            @NUInt long sampleCount);

    @Generated
    @Selector("supportsFamily:")
    boolean supportsFamily(@NInt long gpuFamily);

    @Generated
    @Selector("supportsRasterizationRateMapWithLayerCount:")
    boolean supportsRasterizationRateMapWithLayerCount(@NUInt long layerCount);

    @Generated
    @Selector("supportsVertexAmplificationCount:")
    boolean supportsVertexAmplificationCount(@NUInt long count);

    @Generated
    @Selector("accelerationStructureSizesWithDescriptor:")
    @ByValue
    MTLAccelerationStructureSizes accelerationStructureSizesWithDescriptor(
            MTLAccelerationStructureDescriptor descriptor);

    @Generated
    @Selector("areBarycentricCoordsSupported")
    boolean areBarycentricCoordsSupported();

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

    @Generated
    @Selector("newBinaryArchiveWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBinaryArchive newBinaryArchiveWithDescriptorError(MTLBinaryArchiveDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newCounterSampleBufferWithDescriptor:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCounterSampleBuffer newCounterSampleBufferWithDescriptorError(MTLCounterSampleBufferDescriptor descriptor,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newDynamicLibrary:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryError(@Mapped(ObjCObjectMapper.class) MTLLibrary library,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newDynamicLibraryWithURL:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDynamicLibrary newDynamicLibraryWithURLError(NSURL url, @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("sampleTimestamps:gpuTimestamp:")
    void sampleTimestampsGpuTimestamp(LongPtr cpuTimestamp, LongPtr gpuTimestamp);

    @Generated
    @Selector("supportsCounterSampling:")
    boolean supportsCounterSampling(@NUInt long samplingPoint);

    @Generated
    @Selector("supportsDynamicLibraries")
    boolean supportsDynamicLibraries();

    @Generated
    @Selector("supportsFunctionPointers")
    boolean supportsFunctionPointers();

    @Generated
    @Selector("supportsPullModelInterpolation")
    boolean supportsPullModelInterpolation();

    @Generated
    @Selector("supportsRaytracing")
    boolean supportsRaytracing();

    @Generated
    @Selector("supportsShaderBarycentricCoordinates")
    boolean supportsShaderBarycentricCoordinates();
}
