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

import apple.foundation.struct.NSRange;
import apple.metal.struct.MTLSize;
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

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLComputeCommandEncoder")
public interface MTLComputeCommandEncoder extends MTLCommandEncoder {
    @Generated
    @Selector("dispatchThreadgroups:threadsPerThreadgroup:")
    void dispatchThreadgroupsThreadsPerThreadgroup(@ByValue MTLSize threadgroupsPerGrid,
            @ByValue MTLSize threadsPerThreadgroup);

    @Generated
    @Selector("setBuffer:offset:atIndex:")
    void setBufferOffsetAtIndex(@Mapped(ObjCObjectMapper.class) Object buffer, @NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setBufferOffset:atIndex:")
    void setBufferOffsetAtIndex(@NUInt long offset, @NUInt long index);

    @Generated
    @Selector("setBuffers:offsets:withRange:")
    void setBuffersOffsetsWithRange(Ptr<ObjCObject> buffers, ConstNUIntPtr offsets, @ByValue NSRange range);

    @Generated
    @Selector("setBytes:length:atIndex:")
    void setBytesLengthAtIndex(ConstVoidPtr bytes, @NUInt long length, @NUInt long index);

    @Generated
    @Selector("setComputePipelineState:")
    void setComputePipelineState(@Mapped(ObjCObjectMapper.class) Object state);

    @Generated
    @Selector("setSamplerState:atIndex:")
    void setSamplerStateAtIndex(@Mapped(ObjCObjectMapper.class) Object sampler, @NUInt long index);

    @Generated
    @Selector("setSamplerState:lodMinClamp:lodMaxClamp:atIndex:")
    void setSamplerStateLodMinClampLodMaxClampAtIndex(@Mapped(ObjCObjectMapper.class) Object sampler, float lodMinClamp,
            float lodMaxClamp, @NUInt long index);

    @Generated
    @Selector("setSamplerStates:lodMinClamps:lodMaxClamps:withRange:")
    void setSamplerStatesLodMinClampsLodMaxClampsWithRange(Ptr<ObjCObject> samplers, ConstFloatPtr lodMinClamps,
            ConstFloatPtr lodMaxClamps, @ByValue NSRange range);

    @Generated
    @Selector("setSamplerStates:withRange:")
    void setSamplerStatesWithRange(Ptr<ObjCObject> samplers, @ByValue NSRange range);

    @Generated
    @Selector("setTexture:atIndex:")
    void setTextureAtIndex(@Mapped(ObjCObjectMapper.class) Object texture, @NUInt long index);

    @Generated
    @Selector("setTextures:withRange:")
    void setTexturesWithRange(Ptr<ObjCObject> textures, @ByValue NSRange range);

    @Generated
    @Selector("setThreadgroupMemoryLength:atIndex:")
    void setThreadgroupMemoryLengthAtIndex(@NUInt long length, @NUInt long index);

    @Generated
    @Selector("dispatchThreadgroupsWithIndirectBuffer:indirectBufferOffset:threadsPerThreadgroup:")
    void dispatchThreadgroupsWithIndirectBufferIndirectBufferOffsetThreadsPerThreadgroup(
            @Mapped(ObjCObjectMapper.class) Object indirectBuffer, @NUInt long indirectBufferOffset,
            @ByValue MTLSize threadsPerThreadgroup);
}
