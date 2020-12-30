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

/**
 * @protocol MTLCommandEncoder
 * @abstract MTLCommandEncoder is the common interface for objects that write commands into MTLCommandBuffers.
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandEncoder")
public interface MTLCommandEncoder {
    /**
     * @property device
     * @abstract The device this resource was created against.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * @method endEncoding
     * @abstract Declare that all command generation from this encoder is complete, and detach from the MTLCommandBuffer.
     */
    @Generated
    @Selector("endEncoding")
    void endEncoding();

    /**
     * @method insertDebugSignpost:
     * @abstract Inserts a debug string into the command buffer.  This does not change any API behavior, but can be useful when debugging.
     */
    @Generated
    @Selector("insertDebugSignpost:")
    void insertDebugSignpost(String string);

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * @method popDebugGroup
     * @abstract Pop the latest named string off of the stack.
     */
    @Generated
    @Selector("popDebugGroup")
    void popDebugGroup();

    /**
     * @method pushDebugGroup:
     * @abstract Push a new named string onto a stack of string labels.
     */
    @Generated
    @Selector("pushDebugGroup:")
    void pushDebugGroup(String string);

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);
}
