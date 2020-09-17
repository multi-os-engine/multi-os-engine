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
import apple.foundation.NSDictionary;
import apple.metal.MTLArgument;
import apple.metal.MTLAttribute;
import apple.metal.MTLFunctionConstant;
import apple.metal.MTLVertexAttribute;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunction")
public interface MTLFunction {
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    @Generated
    @Selector("functionConstantsDictionary")
    NSDictionary<String, ? extends MTLFunctionConstant> functionConstantsDictionary();

    @Generated
    @Selector("functionType")
    @NUInt
    long functionType();

    @Generated
    @Selector("label")
    String label();

    @Generated
    @Selector("name")
    String name();

    @Generated
    @Selector("patchControlPointCount")
    @NInt
    long patchControlPointCount();

    @Generated
    @Selector("patchType")
    @NUInt
    long patchType();

    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    @Generated
    @Selector("stageInputAttributes")
    NSArray<? extends MTLAttribute> stageInputAttributes();

    @Generated
    @Selector("vertexAttributes")
    NSArray<? extends MTLVertexAttribute> vertexAttributes();

    @Generated
    @Selector("newArgumentEncoderWithBufferIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithBufferIndex(@NUInt long bufferIndex);

    @Generated
    @Selector("newArgumentEncoderWithBufferIndex:reflection:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithBufferIndexReflection(@NUInt long bufferIndex,
            @ReferenceInfo(type = MTLArgument.class) Ptr<MTLArgument> reflection);

    @Generated
    @Selector("options")
    @NUInt
    long options();
}
