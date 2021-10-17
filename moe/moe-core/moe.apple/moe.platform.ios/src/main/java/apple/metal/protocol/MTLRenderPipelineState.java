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

/**
 * [@protocol] MTLRenderPipelineState
 * <p>
 * MTLRenderPipelineState represents a compiled render pipeline
 * <p>
 * MTLRenderPipelineState is a compiled render pipeline and can be set on a MTLRenderCommandEncoder.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLRenderPipelineState")
public interface MTLRenderPipelineState {
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("label")
    String label();

    /**
     * imageblockMemoryLengthForDimensions:sampleCount:
     * <p>
     * Returns imageblock memory length for given image block dimensions. Dimensions must be valid tile dimensions.
     */
    @Generated
    @Selector("imageblockMemoryLengthForDimensions:")
    @NUInt
    long imageblockMemoryLengthForDimensions(@ByValue MTLSize imageblockDimensions);

    /**
     * [@property] imageblockSampleLength
     * <p>
     * Returns imageblock memory length used by a single sample when rendered using this pipeline.
     */
    @Generated
    @Selector("imageblockSampleLength")
    @NUInt
    long imageblockSampleLength();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * <p>
     * The maximum total number of threads that can be in a single tile shader threadgroup.
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    long maxTotalThreadsPerThreadgroup();

    /**
     * [@property] threadgroupSizeMatchesTileSize
     * <p>
     * Returns true when the pipeline state requires a tile shader threadgroup size equal to the tile size
     */
    @Generated
    @Selector("threadgroupSizeMatchesTileSize")
    boolean threadgroupSizeMatchesTileSize();

    @Generated
    @Selector("supportIndirectCommandBuffers")
    boolean supportIndirectCommandBuffers();

    /**
     * functionHandleWithFunction:stage:
     * <p>
     * Gets the function handle for the specified function on the specified stage of the pipeline.
     */
    @Generated
    @Selector("functionHandleWithFunction:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunctionHandle functionHandleWithFunctionStage(@Mapped(ObjCObjectMapper.class) MTLFunction function,
            @NUInt long stage);

    /**
     * newIntersectionFunctionTableWithDescriptor:stage:
     * <p>
     * Allocate an intersection function table for the specified stage of the pipeline with the provided descriptor.
     */
    @Generated
    @Selector("newIntersectionFunctionTableWithDescriptor:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIntersectionFunctionTable newIntersectionFunctionTableWithDescriptorStage(
            MTLIntersectionFunctionTableDescriptor descriptor, @NUInt long stage);

    /**
     * newRenderPipelineStateWithAdditionalBinaryFunctions:error:
     * <p>
     * Allocate a new render pipeline state by adding binary functions for each stage of this pipeline state.
     */
    @Generated
    @Selector("newRenderPipelineStateWithAdditionalBinaryFunctions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLRenderPipelineState newRenderPipelineStateWithAdditionalBinaryFunctionsError(
            MTLRenderPipelineFunctionsDescriptor additionalBinaryFunctions,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * newVisibleFunctionTableWithDescriptor:stage:
     * <p>
     * Allocate a visible function table for the specified stage of the pipeline with the provided descriptor.
     */
    @Generated
    @Selector("newVisibleFunctionTableWithDescriptor:stage:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLVisibleFunctionTable newVisibleFunctionTableWithDescriptorStage(MTLVisibleFunctionTableDescriptor descriptor,
            @NUInt long stage);
}
