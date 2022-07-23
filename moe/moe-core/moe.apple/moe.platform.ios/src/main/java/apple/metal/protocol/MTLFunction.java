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

/**
 * [@protocol] MTLFunction
 * <p>
 * A handle to intermediate code used as inputs for either a MTLComputePipelineState or a MTLRenderPipelineState.
 * <p>
 * MTLFunction is a single vertex shader, fragment shader, or compute function. A Function can only be used with the
 * device that it was created against.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLFunction")
public interface MTLFunction {
    /**
     * [@property] device
     * <p>
     * The device this resource was created against. This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] functionConstantsDictionary
     * <p>
     * A dictionary containing information about all function contents, keyed by the constant names.
     */
    @Generated
    @Selector("functionConstantsDictionary")
    NSDictionary<String, ? extends MTLFunctionConstant> functionConstantsDictionary();

    /**
     * [@property] functionType
     * <p>
     * The overall kind of entry point: compute, vertex, or fragment.
     */
    @Generated
    @Selector("functionType")
    @NUInt
    long functionType();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * [@property] name
     * <p>
     * The name of the function in the shading language.
     */
    @Generated
    @Selector("name")
    String name();

    /**
     * [@property] patchControlPointCount
     * <p>
     * Returns the number of patch control points if it was specified in the shader. Returns -1 if it
     * was not specified.
     */
    @Generated
    @Selector("patchControlPointCount")
    @NInt
    long patchControlPointCount();

    /**
     * [@property] patchType
     * <p>
     * Returns the patch type. MTLPatchTypeNone if it is not a post tessellation vertex shader.
     */
    @Generated
    @Selector("patchType")
    @NUInt
    long patchType();

    /**
     * [@property] label
     * <p>
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * [@property] stageInputAttributes
     * <p>
     * Returns an array describing the attributes
     */
    @Generated
    @Selector("stageInputAttributes")
    NSArray<? extends MTLAttribute> stageInputAttributes();

    @Generated
    @Selector("vertexAttributes")
    NSArray<? extends MTLVertexAttribute> vertexAttributes();

    /**
     * newArgumentEncoderWithBufferIndex:
     * <p>
     * Creates an argument encoder which will encode arguments matching the layout of the argument buffer at the given
     * bind point index.
     */
    @Generated
    @Selector("newArgumentEncoderWithBufferIndex:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithBufferIndex(@NUInt long bufferIndex);

    /**
     * newArgumentEncoderWithBufferIndex:
     * <p>
     * Creates an argument encoder which will encode arguments matching the layout of the argument buffer at the given
     * bind point index.
     */
    @Generated
    @Selector("newArgumentEncoderWithBufferIndex:reflection:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLArgumentEncoder newArgumentEncoderWithBufferIndexReflection(@NUInt long bufferIndex,
            @ReferenceInfo(type = MTLArgument.class) Ptr<MTLArgument> reflection);

    /**
     * [@property] options
     * <p>
     * The options this function was created with.
     */
    @Generated
    @Selector("options")
    @NUInt
    long options();
}
