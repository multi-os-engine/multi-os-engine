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

import apple.metal.MTLTextureDescriptor;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.metal.MTLAccelerationStructureDescriptor;

/**
 * [@protocol] MTLHeap
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLHeap")
public interface MTLHeap {
    /**
     * [@property] cpuCacheMode
     * 
     * CPU cache mode for the heap. Default is MTLCPUCacheModeDefaultCache.
     * 
     * All resources created from this heap share the same cache mode.
     */
    @Generated
    @Selector("cpuCacheMode")
    @NUInt
    long cpuCacheMode();

    /**
     * [@property] device
     * 
     * The device this heap was created against. This heap can only be used with this device.
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    MTLDevice device();

    /**
     * [@property] label
     * 
     * A string to help identify this heap.
     */
    @Generated
    @Selector("label")
    String label();

    /**
     * maxAvailableSizeWithAlignment:
     * 
     * The maximum size that can be successfully allocated from the heap in bytes, taking into notice given alignment.
     * Alignment needs to be zero, or power of two.
     * 
     * Provides a measure of fragmentation within the heap.
     */
    @Generated
    @Selector("maxAvailableSizeWithAlignment:")
    @NUInt
    long maxAvailableSizeWithAlignment(@NUInt long alignment);

    /**
     * newBufferWithLength:options:
     * 
     * Create a new buffer backed by heap memory.
     * 
     * The requested storage and CPU cache modes must match the storage and CPU cache modes of the heap.
     * 
     * @return The buffer or nil if heap is full.
     */
    @Generated
    @Selector("newBufferWithLength:options:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithLengthOptions(@NUInt long length, @NUInt long options);

    /**
     * newTextureWithDescriptor:
     * 
     * Create a new texture backed by heap memory.
     * 
     * The requested storage and CPU cache modes must match the storage and CPU cache modes of the heap, with the
     * exception that the requested storage mode can be MTLStorageModeMemoryless.
     * 
     * @return The texture or nil if heap is full.
     */
    @Generated
    @Selector("newTextureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptor(MTLTextureDescriptor desc);

    /**
     * [@property] label
     * 
     * A string to help identify this heap.
     */
    @Generated
    @Selector("setLabel:")
    void setLabel(String value);

    /**
     * setPurgeabilityState:
     * 
     * Set or query the purgeability state of the heap.
     */
    @Generated
    @Selector("setPurgeableState:")
    @NUInt
    long setPurgeableState(@NUInt long state);

    /**
     * [@property] size
     * 
     * Heap size in bytes, specified at creation time and rounded up to device specific alignment.
     */
    @Generated
    @Selector("size")
    @NUInt
    long size();

    /**
     * [@property] storageMode
     * 
     * Current heap storage mode, default is MTLStorageModePrivate.
     * 
     * All resources created from this heap share the same storage mode.
     */
    @Generated
    @Selector("storageMode")
    @NUInt
    long storageMode();

    /**
     * [@property] usedSize
     * 
     * The size in bytes, of all resources allocated from the heap.
     */
    @Generated
    @Selector("usedSize")
    @NUInt
    long usedSize();

    /**
     * [@property] currentAllocatedSize
     * 
     * The size in bytes of the current heap allocation.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("currentAllocatedSize")
    @NUInt
    long currentAllocatedSize();

    /**
     * [@property] hazardTrackingMode
     * 
     * Whether or not the heap is hazard tracked.
     * 
     * When a resource on a hazard tracked heap is modified, reads and writes from any other resource on that heap will
     * be delayed until the modification is complete.
     * Similarly, modifying heap resources will be delayed until all in-flight reads and writes from resources
     * suballocated on that heap have completed.
     * For optimal performance, perform hazard tracking manually through MTLFence or MTLEvent instead.
     * Resources on the heap may opt-out of hazard tracking individually when the heap is hazard tracked,
     * however resources cannot opt-in to hazard tracking when the heap is not hazard tracked.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("hazardTrackingMode")
    @NUInt
    long hazardTrackingMode();

    /**
     * newBufferWithLength:options:offset:
     * 
     * Create a new buffer backed by heap memory at the specified placement offset.
     * 
     * This method can only be used when heapType is set to MTLHeapTypePlacement.
     * Use "MTLDevice heapBufferSizeAndAlignWithLength:options:" to determine requiredSize and requiredAlignment.
     * Any resources that exist in this heap at overlapping half-open range [offset, offset + requiredSize) are
     * implicitly aliased with the new resource.
     * 
     * @param length  The requested size of the buffer, in bytes.
     * @param options The requested options of the buffer, of which the storage and CPU cache mode must match these of
     *                the heap.
     * @param offset  The requested offset of the buffer inside the heap, in bytes. Behavior is undefined if "offset +
     *                requiredSize > heap.size" or "offset % requiredAlignment != 0".
     * @return The buffer, or nil if the heap is not a placement heap
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("newBufferWithLength:options:offset:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLBuffer newBufferWithLengthOptionsOffset(@NUInt long length, @NUInt long options, @NUInt long offset);

    /**
     * newTextureWithDescriptor:offset:
     * 
     * Create a new texture backed by heap memory at the specified placement offset.
     * 
     * This method can only be used when heapType is set to MTLHeapTypePlacement.
     * Use "MTLDevice heapTextureSizeAndAlignWithDescriptor:" to determine requiredSize and requiredAlignment.
     * Any resources that exist in this heap at overlapping half-open range [offset, offset + requiredSize) are
     * implicitly aliased with the new resource.
     * 
     * @param descriptor The requested properties of the texture, of which the storage and CPU cache mode must match
     *                   those of the heap.
     * @param offset     The requested offset of the texture inside the heap, in bytes. Behavior is undefined if "offset
     *                   + requiredSize > heap.size" and "offset % requiredAlignment != 0".
     * @return The texture, or nil if the heap is not a placement heap.
     * 
     *         API-Since: 13.0
     */
    @Generated
    @Selector("newTextureWithDescriptor:offset:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLTexture newTextureWithDescriptorOffset(MTLTextureDescriptor descriptor, @NUInt long offset);

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

    /**
     * [@property] type
     * 
     * The type of the heap. The default value is MTLHeapTypeAutomatic.
     * 
     * This constrains the resource creation functions that are available on the heap.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("type")
    @NInt
    long type();

    /**
     * newAccelerationStructureWithDescriptor:
     * 
     * Create a new acceleration structure backed by heap memory.
     * 
     * This is a convenience method which creates the acceleration structure backed by heap memory. The acceleration
     * structure size is inferred based on the descriptor.
     * 
     * @return The acceleration structure or nil if heap is full. Note that the MTLAccelerationStructure merely
     *         represents storage for an acceleration structure. It will still need to be populated via a build, copy,
     *         refit, etc.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("newAccelerationStructureWithDescriptor:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithDescriptor(MTLAccelerationStructureDescriptor descriptor);

    /**
     * newAccelerationStructureWithDescriptor:offset:
     * 
     * Create a new acceleration structure backed by heap memory at the specified placement offset.
     * 
     * This is a convenience method which computes the acceleration structure size based on the descriptor.
     * This method can only be used when heapType is set to MTLHeapTypePlacement.
     * Use "MTLDevice heapAccelerationStructureSizeAndAlignWithSize:" or "MTLDevice
     * heapAccelerationStructureSizeAndAlignWithDescriptor:" to determine requiredSize and requiredAlignment.
     * Any resources that exist in this heap at overlapping half-open range [offset, offset + requiredSize) are
     * implicitly aliased with the new resource.
     * 
     * @param descriptor The acceleration structure descriptor
     * @param offset     The requested offset of the acceleration structure inside the heap, in bytes. Behavior is
     *                   undefined if "offset + requiredSize > heap.size" or "offset % requiredAlignment != 0".
     * @return The acceleration structure, or nil if the heap is not a placement heap
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("newAccelerationStructureWithDescriptor:offset:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithDescriptorOffset(MTLAccelerationStructureDescriptor descriptor,
            @NUInt long offset);

    /**
     * newAccelerationStructureWithSize:
     * 
     * Create a new acceleration structure backed by heap memory.
     * 
     * @return The acceleration structure or nil if heap is full. Note that the MTLAccelerationStructure merely
     *         represents storage for an acceleration structure. It will still need to be populated via a build, copy,
     *         refit, etc.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("newAccelerationStructureWithSize:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithSize(@NUInt long size);

    /**
     * newAccelerationStructureWithSize:offset:
     * 
     * Create a new acceleration structure backed by heap memory at the specified placement offset.
     * 
     * This method can only be used when heapType is set to MTLHeapTypePlacement.
     * Use "MTLDevice heapAccelerationStructureSizeAndAlignWithSize:" or "MTLDevice
     * heapAccelerationStructureSizeAndAlignWithDescriptor:" to determine requiredSize and requiredAlignment.
     * Any resources that exist in this heap at overlapping half-open range [offset, offset + requiredSize) are
     * implicitly aliased with the new resource.
     * 
     * @param size   The requested size of the acceleration structure, in bytes.
     * @param offset The requested offset of the acceleration structure inside the heap, in bytes. Behavior is undefined
     *               if "offset + requiredSize > heap.size" or "offset % requiredAlignment != 0".
     * @return The acceleration structure, or nil if the heap is not a placement heap
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("newAccelerationStructureWithSize:offset:")
    @MappedReturn(ObjCObjectMapper.class)
    MTLAccelerationStructure newAccelerationStructureWithSizeOffset(@NUInt long size, @NUInt long offset);
}
