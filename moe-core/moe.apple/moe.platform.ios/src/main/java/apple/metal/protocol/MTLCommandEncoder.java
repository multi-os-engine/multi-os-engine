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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] MTLCommandEncoder
 * 
 * MTLCommandEncoder is the common interface for objects that write commands into MTLCommandBuffers.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandEncoder")
public interface MTLCommandEncoder {
    /**
     * [@property] device
     * 
     * The device this resource was created against.
     */
    @NotNull
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * endEncoding
     * 
     * Declare that all command generation from this encoder is complete, and detach from the MTLCommandBuffer.
     */
    @Generated
    @Selector("endEncoding")
    void endEncoding();

    /**
     * insertDebugSignpost:
     * 
     * Inserts a debug string into the command buffer. This does not change any API behavior, but can be useful when
     * debugging.
     */
    @Generated
    @Selector("insertDebugSignpost:")
    void insertDebugSignpost(@NotNull String string);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * popDebugGroup
     * 
     * Pop the latest named string off of the stack.
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * pushDebugGroup:
     * 
     * Push a new named string onto a stack of string labels.
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(@NotNull String string);

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);
}
