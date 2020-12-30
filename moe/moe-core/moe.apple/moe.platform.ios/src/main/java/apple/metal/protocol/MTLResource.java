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
 * @protocol MTLResource
 * @abstract Common APIs available for MTLBuffer and MTLTexture instances
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResource")
public interface MTLResource {
    /**
     * @property cpuCacheMode
     * @abstract The cache mode used for the CPU mapping for this resource
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    long cpuCacheMode();

    /**
     * @property device
     * @abstract The device this resource was created against.  This resource can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * @property heap
     * @abstract The heap from which this resouce was created.
     * @discussion Nil when this resource is not backed by a heap.
     */
    @Generated
    @Selector("heap")
    @MappedReturn(ObjCObjectMapper.class)
    MTLHeap heap();

    /**
     * @method isAliasable
     * @abstract Returns whether future heap sub-allocations may alias against this resource's memory.
     * @return YES if <st>makeAliasable</st> was previously successfully called on this resource. NO otherwise.
     * If resource is sub-allocated from other resource created on the heap, isAliasable returns 
     * aliasing state of that base resource. Also returns NO when storage mode is memoryless.
     */
    @Generated
    @Selector("isAliasable")
    boolean isAliasable();

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * @method makeAliasable
     * @abstract Allow future heap sub-allocations to alias against this resource's memory.
     * @discussion It is illegal to call this method on a non heap-based resource. 
     * It is also illegal to call this method on texture views created from heap-based textures.
     * The debug layer will raise an exception. Calling this method on textures sub-allocated
     * from Buffers backed by heap memory has no effect.
     * Once a resource is made aliasable, the decision cannot be reverted.
     */
    @Generated
    @Selector("makeAliasable")
    void makeAliasable();

    /**
     * @property label
     * @abstract A string to help identify this object.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * @method setPurgeableState
     * @abstract Set (or query) the purgeability state of a resource
     * @discussion Synchronously set the purgeability state of a resource and return what the prior (or current) state is.
     * FIXME: If the device is keeping a cached copy of the resource, both the shared copy and cached copy are made purgeable.  Any access to the resource by either the CPU or device will be undefined.
     */
    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    long setPurgeableState(@NUInt long state);

    /**
     * @property storageMode
     * @abstract The resource storage mode used for the CPU mapping for this resource
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    long storageMode();

    /**
     * @property allocatedSize
     * @abstrace The size in bytes occupied by this resource
     */
    @Generated
    @Selector("allocatedSize")
    @NUInt
    long allocatedSize();

    /**
     * @property hazardTrackingMode
     * @abstract Whether or not the resource is hazard tracked.
     * @discussion This value can be either MTLHazardTrackingModeUntracked or MTLHazardTrackingModeTracked.
     * Resources created from heaps are by default untracked, whereas resources created from the device are by default tracked.
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    long hazardTrackingMode();

    /**
     * @property heapOffset
     * @abstract The offset inside the heap at which this resource was created.
     * @discussion Zero when this resource was not created on a heap with MTLHeapTypePlacement.
     */
    @Generated
    @Selector("heapOffset")
    @NUInt
    long heapOffset();

    /**
     * @property resourceOptions
     * @abstract A packed tuple of the storageMode, cpuCacheMode and hazardTrackingMode properties.
     */
    @Generated
    @Selector("resourceOptions")
    @NUInt
    long resourceOptions();
}
