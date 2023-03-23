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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLResource
 * 
 * Common APIs available for MTLBuffer and MTLTexture instances
 * 
 * API-Since: 8.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResource")
public interface MTLResource {
    /**
     * [@property] cpuCacheMode
     * 
     * The cache mode used for the CPU mapping for this resource
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    long cpuCacheMode();

    /**
     * [@property] device
     * 
     * The device this resource was created against. This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] heap
     * 
     * The heap from which this resouce was created.
     * 
     * Nil when this resource is not backed by a heap.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("heap")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap heap();

    /**
     * isAliasable
     * 
     * Returns whether future heap sub-allocations may alias against this resource's memory.
     * 
     * @return YES if <st>makeAliasable</st> was previously successfully called on this resource. NO otherwise.
     *         If resource is sub-allocated from other resource created on the heap, isAliasable returns
     *         aliasing state of that base resource. Also returns NO when storage mode is memoryless.
     * 
     *         API-Since: 10.0
     */
    @Generated
    @Selector("isAliasable")
    boolean isAliasable();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * makeAliasable
     * 
     * Allow future heap sub-allocations to alias against this resource's memory.
     * 
     * It is illegal to call this method on a non heap-based resource.
     * It is also illegal to call this method on texture views created from heap-based textures.
     * The debug layer will raise an exception. Calling this method on textures sub-allocated
     * from Buffers backed by heap memory has no effect.
     * Once a resource is made aliasable, the decision cannot be reverted.
     * 
     * API-Since: 10.0
     */
    @Generated
    @Selector("makeAliasable")
    void makeAliasable();

    /**
     * [@property] label
     * 
     * A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * setPurgeableState
     * 
     * Set (or query) the purgeability state of a resource
     * 
     * Synchronously set the purgeability state of a resource and return what the prior (or current) state is.
     * FIXME: If the device is keeping a cached copy of the resource, both the shared copy and cached copy are made
     * purgeable. Any access to the resource by either the CPU or device will be undefined.
     */
    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    long setPurgeableState(@NUInt long state);

    /**
     * [@property] storageMode
     * 
     * The resource storage mode used for the CPU mapping for this resource
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    long storageMode();

    /**
     * [@property] allocatedSize
     * 
     * The size in bytes occupied by this resource
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("allocatedSize")
    @NUInt
    long allocatedSize();

    /**
     * [@property] hazardTrackingMode
     * 
     * Whether or not the resource is hazard tracked.
     * 
     * This value can be either MTLHazardTrackingModeUntracked or MTLHazardTrackingModeTracked.
     * Resources created from heaps are by default untracked, whereas resources created from the device are by default
     * tracked.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    long hazardTrackingMode();

    /**
     * [@property] heapOffset
     * 
     * The offset inside the heap at which this resource was created.
     * 
     * Zero when this resource was not created on a heap with MTLHeapTypePlacement.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("heapOffset")
    @NUInt
    long heapOffset();

    /**
     * [@property] resourceOptions
     * 
     * A packed tuple of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    long resourceOptions();
}
