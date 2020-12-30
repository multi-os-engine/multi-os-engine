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

import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.metal.MTLIntersectionFunctionTableDescriptor;
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
 * [@protocol] MTLComputePipelineState
 * 
 * A handle to compiled code for a compute function.
 * 
 * MTLComputePipelineState is a single compute function.  It can only be used with the device that it was created against.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLComputePipelineState")
public interface MTLComputePipelineState {
    /**
     * [@property] device
     * 
     * The device this resource was created against.  This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] maxTotalThreadsPerThreadgroup
     * 
     * The maximum total number of threads that can be in a single compute threadgroup.
     */
    @Generated
    @Selector("maxTotalThreadsPerThreadgroup")
    @NUInt
    long maxTotalThreadsPerThreadgroup();

    /**
     * [@property] threadExecutionWidth
     * 
     * For most efficient execution, the threadgroup size should be a multiple of this when executing the kernel.
     */
    @Generated
    @Selector("threadExecutionWidth")
    @NUInt
    long threadExecutionWidth();

    /**
     * imageblockMemoryLengthForDimensions:
     * 
     * Returns imageblock memory length for given image block dimensions.
     */
    @Generated
    @Selector("imageblockMemoryLengthForDimensions:")
    @NUInt
    long imageblockMemoryLengthForDimensions(@ByValue MTLSize imageblockDimensions);

    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] staticThreadgroupMemoryLength
     * 
     * The length in bytes of threadgroup memory that is statically allocated.
     */
    @Generated
    @Selector("staticThreadgroupMemoryLength")
    @NUInt
    long staticThreadgroupMemoryLength();

    /**
     * [@property] supportIndirectCommandBuffers
     * 
     * Tells whether this pipeline state is usable through an Indirect Command Buffer.
     */
    @Generated
    @Selector("supportIndirectCommandBuffers")
    boolean supportIndirectCommandBuffers();

    @Generated
    @Selector("functionHandleWithFunction:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLFunctionHandle functionHandleWithFunction(@Mapped(ObjCObjectMapper.class) MTLFunction function);

    @Generated
    @Selector("newComputePipelineStateWithAdditionalBinaryFunctions:error:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLComputePipelineState newComputePipelineStateWithAdditionalBinaryFunctionsError(NSArray<?> functions,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("newIntersectionFunctionTableWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLIntersectionFunctionTable newIntersectionFunctionTableWithDescriptor(
            MTLIntersectionFunctionTableDescriptor descriptor);

    @Generated
    @Selector("newVisibleFunctionTableWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLVisibleFunctionTable newVisibleFunctionTableWithDescriptor(MTLVisibleFunctionTableDescriptor descriptor);
}
