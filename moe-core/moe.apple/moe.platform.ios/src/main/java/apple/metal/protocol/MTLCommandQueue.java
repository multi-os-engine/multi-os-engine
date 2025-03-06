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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCObject;

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
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("commandBuffer")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBuffer();

    /**
     * commandBufferWithUnretainedReferences
     * 
     * Returns a new autoreleased command buffer used to encode work into this queue that
     * does not maintain strong references to resources used within the command buffer.
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("commandBufferWithUnretainedReferences")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithUnretainedReferences();

    /**
     * The device this queue will submit to
     * 
     * API-Since: 8.0
     */
    @NotNull
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
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("label")
    String label();

    /**
     * A string to help identify this object
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(@Nullable String value);

    /**
     * commandBufferWithDescriptor
     * 
     * Returns a new autoreleased command buffer used to encode work into this queue.
     * 
     * API-Since: 14.0
     * 
     * @param descriptor The requested properties of the command buffer.
     */
    @Nullable
    @Generated
    @Selector("commandBufferWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLCommandBuffer commandBufferWithDescriptor(@NotNull MTLCommandBufferDescriptor descriptor);

    /**
     * addResidencySet
     * 
     * Marks the residency set as part of the command queue execution. This ensures that the residency set is resident
     * during execution of all the command buffers within the queue.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addResidencySet:")
    void addResidencySet(@Mapped(ObjCObjectMapper.class) @NotNull MTLResidencySet residencySet);

    /**
     * addResidencySets
     * 
     * Marks the residency sets as part of the command queue execution. This ensures that the residency sets are
     * resident during execution of all the command buffers within the queue.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addResidencySets:count:")
    void addResidencySetsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> residencySets,
            @NUInt long count);

    /**
     * removeResidencySet
     * 
     * Removes the residency set from the command queue execution. This ensures that only the remaining residency sets
     * are resident during execution of all the command buffers within the queue.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeResidencySet:")
    void removeResidencySet(@Mapped(ObjCObjectMapper.class) @NotNull MTLResidencySet residencySet);

    /**
     * removeResidencySets
     * 
     * Removes the residency sets from the command queue execution. This ensures that only the remaining residency sets
     * are resident during execution of all the command buffers within the queue.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeResidencySets:count:")
    void removeResidencySetsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> residencySets,
            @NUInt long count);
}
