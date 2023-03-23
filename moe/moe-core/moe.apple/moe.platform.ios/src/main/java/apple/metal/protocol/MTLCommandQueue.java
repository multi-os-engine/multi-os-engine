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

import apple.metal.MTLCommandBufferDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLCommandQueue
 * 
 * A serial queue of command buffers to be executed by the device.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLCommandQueue")
public interface MTLCommandQueue {
    /**
     * commandBuffer
     * 
     * Returns a new autoreleased command buffer used to encode work into this queue that
     * maintains strong references to resources used within the command buffer.
     */
    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBuffer();

    /**
     * commandBufferWithUnretainedReferences
     * 
     * Returns a new autoreleased command buffer used to encode work into this queue that
     * does not maintain strong references to resources used within the command buffer.
     */
    @Generated
    @Selector("commandBufferWithUnretainedReferences")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithUnretainedReferences();

    /**
     * The device this queue will submit to
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * insertDebugCaptureBoundary
     * 
     * Inform Xcode about when debug capture should start and stop.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use MTLCaptureScope instead
     */
    @Deprecated
    @Generated
    @Selector("insertDebugCaptureBoundary")
    void insertDebugCaptureBoundary();

    /**
     * A string to help identify this object
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * A string to help identify this object
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * commandBufferWithDescriptor
     * 
     * Returns a new autoreleased command buffer used to encode work into this queue.
     * 
     * API-Since: 14.0
     * 
     * @param descriptor The requested properties of the command buffer.
     */
    @Generated
    @Selector("commandBufferWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithDescriptor(MTLCommandBufferDescriptor descriptor);
}
