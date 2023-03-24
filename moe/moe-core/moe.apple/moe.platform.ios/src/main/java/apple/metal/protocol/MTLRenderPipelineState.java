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

import apple.foundation.NSError;
import apple.metal.MTLIntersectionFunctionTableDescriptor;
import apple.metal.MTLRenderPipelineFunctionsDescriptor;
import apple.metal.MTLVisibleFunctionTableDescriptor;
import apple.metal.struct.MTLSize;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.struct.MTLResourceID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLRenderPipelineState
 * 
 * MTLRenderPipelineState represents a compiled render pipeline
 * 
 * MTLRenderPipelineState is a compiled render pipeline and can be set on a MTLRenderCommandEncoder.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRenderPipelineState")
public interface MTLRenderPipelineState {
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * imageblockMemoryLengthForDimensions:sampleCount:
     * 
     * Returns imageblock memory length for given image block dimensions. Dimensions must be valid tile dimensions.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("imageblockMemoryLengthForDimensions:")
    @NUInt
    long imageblockMemoryLengthForDimensions(@ByValue MTLSize imageblockDimensions);

    /**
     * [@property] imageblockSampleLength
     * 
     * Returns imageblock memory length used by a single sample when rendered using this pipeline.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("imageblockSampleLength")
    @NUInt
    long imageblockSampleLength();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * The maximum total number of threads that can be in a single tile shader threadgroup.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    long maxTotalThreadsPerThreadgroup();

    /**
     * [@property] threadgroupSizeMatchesTileSize
     * 
     * Returns true when the pipeline state requires a tile shader threadgroup size equal to the tile size
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("threadgroupSizeMatchesTileSize")
    boolean threadgroupSizeMatchesTileSize();

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    boolean supportIndirectCommandBuffers();

    /**
     * functionHandleWithFunction:stage:
     * 
     * Gets the function handle for the specified function on the specified stage of the pipeline.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("functionHandleWithFunction:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunctionHandle functionHandleWithFunctionStage(@NotNull @Mapped(ObjCObjectMapper.class) MTLFunction function,
            @NUInt long stage);

    /**
     * newIntersectionFunctionTableWithDescriptor:stage:
     * 
     * Allocate an intersection function table for the specified stage of the pipeline with the provided descriptor.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("newIntersectionFunctionTableWithDescriptor:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIntersectionFunctionTable newIntersectionFunctionTableWithDescriptorStage(
            @NotNull MTLIntersectionFunctionTableDescriptor descriptor, @NUInt long stage);

    /**
     * newRenderPipelineStateWithAdditionalBinaryFunctions:error:
     * 
     * Allocate a new render pipeline state by adding binary functions for each stage of this pipeline state.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("newRenderPipelineStateWithAdditionalBinaryFunctions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithAdditionalBinaryFunctionsError(
            @NotNull MTLRenderPipelineFunctionsDescriptor additionalBinaryFunctions,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newVisibleFunctionTableWithDescriptor:stage:
     * 
     * Allocate a visible function table for the specified stage of the pipeline with the provided descriptor.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("newVisibleFunctionTableWithDescriptor:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLVisibleFunctionTable newVisibleFunctionTableWithDescriptorStage(
            @NotNull MTLVisibleFunctionTableDescriptor descriptor, @NUInt long stage);

    /**
     * [@property] gpuResourceID
     * 
     * Handle of the GPU resource suitable for storing in an Argument Buffer
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("gpuResourceID")
    @ByValue
    MTLResourceID gpuResourceID();

    /**
     * [@property] maxTotalThreadgroupsPerMeshGrid
     * 
     * The maximum total number of threadgroups that can be in a single mesh shader grid.
     * 
     * This value is set in MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("maxTotalThreadgroupsPerMeshGrid")
    @NUInt
    long maxTotalThreadgroupsPerMeshGrid();

    /**
     * [@property] maxTotalThreadsPerMeshThreadgroup
     * 
     * The maximum total number of threads that can be in a single mesh shader threadgroup.
     * 
     * This value is set in MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("maxTotalThreadsPerMeshThreadgroup")
    @NUInt
    long maxTotalThreadsPerMeshThreadgroup();

    /**
     * [@property] maxTotalThreadsPerObjectThreadgroup
     * 
     * The maximum total number of threads that can be in a single object shader threadgroup.
     * 
     * This value is set in MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("maxTotalThreadsPerObjectThreadgroup")
    @NUInt
    long maxTotalThreadsPerObjectThreadgroup();

    /**
     * [@property] meshThreadExecutionWidth
     * 
     * The number of threads in a SIMD group of the mesh shader.
     * 
     * This value is also available in the shader with the [[threads_per_simdgroup]] attribute.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("meshThreadExecutionWidth")
    @NUInt
    long meshThreadExecutionWidth();

    /**
     * [@property] objectThreadExecutionWidth
     * 
     * The number of threads in a SIMD group of the object shader.
     * 
     * This value is also available in the shader with the [[threads_per_simdgroup]] attribute.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("objectThreadExecutionWidth")
    @NUInt
    long objectThreadExecutionWidth();
}
