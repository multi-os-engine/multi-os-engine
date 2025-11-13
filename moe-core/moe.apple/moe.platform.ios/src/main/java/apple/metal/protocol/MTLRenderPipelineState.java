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
import org.moe.natj.general.ann.NInt;
import apple.metal.MTL4PipelineDescriptor;
import apple.metal.MTL4RenderPipelineBinaryFunctionsDescriptor;
import apple.metal.MTLRenderPipelineReflection;

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
public interface MTLRenderPipelineState extends MTLAllocation {
    /**
     * API-Since: 8.0
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * API-Since: 8.0
     */
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

    /**
     * [@property] shaderValidation
     * 
     * Current state of Shader Validation for the pipeline.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("shaderValidation")
    @NInt
    long shaderValidation();

    /**
     * Obtains the function handle for a specific function this pipeline state links at the binary level.
     * 
     * - Parameters:
     * - function: a binary function to retrieve the handle.
     * - stage: The shader stage that uses the function.
     * 
     * - Returns: a function handle representing the function if present, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("functionHandleWithBinaryFunction:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLFunctionHandle functionHandleWithBinaryFunctionStage(
            @Mapped(ObjCObjectMapper.class) @NotNull MTL4BinaryFunction function, @NUInt long stage);

    /**
     * Obtains a function handle for the a specific function this pipeline links at the Metal IR level.
     * 
     * - Parameters:
     * - name: A string containing the name of the function.
     * - stage: The shader stage that uses the function.
     * 
     * - Returns: a function handle representing the function if present, otherwise `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("functionHandleWithName:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLFunctionHandle functionHandleWithNameStage(@NotNull String name, @NUInt long stage);

    /**
     * Creates a render pipeline descriptor from this pipeline that you can use for pipeline specialization.
     * 
     * Use this method to obtain a new ``MTL4PipelineDescriptor`` instance that you can use to specialize any
     * unspecialized
     * properties in this pipeline state object.
     * 
     * The returned descriptor contains every unspecialized field in the current pipeline state object, set to
     * unspecialized.
     * It may, however, not contain valid or accurate properties in any other field.
     * 
     * This descriptor is only valid for the purpose of calling specialization functions on the ``MTL4Compiler`` to
     * specialize this pipeline, for example:
     * ``MTL4Compiler/newRenderPipelineStateBySpecializationWithDescriptor:pipeline:error:``.
     * 
     * Although this method returns the ``MTL4PipelineDescriptor`` base class, the concrete instance this method returns
     * corresponds to the specific descriptor type for the creation of this pipeline state, for example if a
     * ``MTL4Compiler``
     * instance creates this current pipeline form a ``MTLTileRenderPipelineDescriptor``, this method returns a concrete
     * ``MTLTileRenderPipelineDescriptor`` instance.
     * 
     * - Returns: a new pipeline descriptor that you use for pipeline state specialization.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineDescriptorForSpecialization")
    @NotNull
    MTL4PipelineDescriptor newRenderPipelineDescriptorForSpecialization();

    /**
     * Creates a new render pipeline state by adding binary functions to each stage of this pipeline
     * state.
     * 
     * - Parameters:
     * - binaryFunctionsDescriptor: A non-`nil` dynamic linking descriptor.
     * - error: An optional pointer that Metal populates with information in case of an error.
     * 
     * - Returns: A new render pipeline state upon success, otherwise `nil`.
     * 
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("newRenderPipelineStateWithBinaryFunctions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    MTLRenderPipelineState newRenderPipelineStateWithBinaryFunctionsError(
            @NotNull MTL4RenderPipelineBinaryFunctionsDescriptor binaryFunctionsDescriptor,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Obtains a reflection object for this render pipeline.
     * 
     * When you create the pipeline through an ``MTLDevice`` instance, reflection is `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("reflection")
    @Nullable
    MTLRenderPipelineReflection reflection();

    /**
     * [@property] requiredThreadsPerMeshThreadgroup
     * 
     * The required size of every mesh shader threadgroup.
     * 
     * This value is set in MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerMeshThreadgroup")
    @ByValue
    MTLSize requiredThreadsPerMeshThreadgroup();

    /**
     * [@property] requiredThreadsPerObjectThreadgroup
     * 
     * The required size of every object shader threadgroup.
     * 
     * This value is set in MTLMeshRenderPipelineDescriptor.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerObjectThreadgroup")
    @ByValue
    MTLSize requiredThreadsPerObjectThreadgroup();

    /**
     * [@property] requiredThreadsPerTileThreadgroup
     * 
     * The required size of every tile shader threadgroup.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("requiredThreadsPerTileThreadgroup")
    @ByValue
    MTLSize requiredThreadsPerTileThreadgroup();
}
