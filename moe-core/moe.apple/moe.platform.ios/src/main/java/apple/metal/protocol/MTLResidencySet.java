package apple.metal.protocol;

import apple.foundation.NSArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * [@protocol] MTLResidencySet
 * 
 * A residency set is responsible for managing resource and heap residency and is referenced
 * by a command buffer or command queue in order to ensure that resources and heaps are resident.
 * Resources and heaps are added and removed uncommitted and a subsequent commit call applies all
 * of the changes in bulk.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLResidencySet")
public interface MTLResidencySet {
    /**
     * addAllocation
     * 
     * Adds one allocation to the set, leaving it uncommitted until commit is called.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addAllocation:")
    void addAllocation(@Mapped(ObjCObjectMapper.class) @NotNull MTLAllocation allocation);

    /**
     * addAllocations
     * 
     * Adds allocations to the set, leaving them uncommitted until commit is called.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("addAllocations:count:")
    void addAllocationsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> allocations,
            @NUInt long count);

    /**
     * [@property] allAllocations
     * 
     * Array of all allocations associated with the set.
     * 
     * This property includes non-committed allocations in the set.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allAllocations")
    @NotNull
    NSArray<?> allAllocations();

    /**
     * [@property] allocatedSize
     * 
     * The memory footprint of the set in bytes at the last commit operation. This may include internal allocations as
     * well.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allocatedSize")
    long allocatedSize();

    /**
     * [@property] allocationCount
     * 
     * Returns the current number of unique allocations present in the set.
     * 
     * This property includes non-committed allocations in the set.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("allocationCount")
    @NUInt
    long allocationCount();

    /**
     * commit
     * 
     * Commits any pending adds/removes.
     * 
     * If the residency set is resident, this will try to make added resources and heaps resident instantly, and make
     * removed resources and heaps non-resident.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("commit")
    void commit();

    /**
     * containsAllocation
     * 
     * Returns a boolean indicating whether the allocation is present in the set or not.
     * 
     * This check includes non-committed allocations in the set.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("containsAllocation:")
    boolean containsAllocation(@Mapped(ObjCObjectMapper.class) @NotNull MTLAllocation anAllocation);

    /**
     * [@property] device
     * 
     * The device that created the residency set
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("device")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    MTLDevice device();

    /**
     * endResidency
     * 
     * Requests that the set and all the committed resources and heaps are made non-resident.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("endResidency")
    void endResidency();

    /**
     * [@property] label
     * 
     * The label specified at creation.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("label")
    @Nullable
    String label();

    /**
     * removeAllAllocations
     * 
     * Marks all allocations to be removed from the set on the next commit call.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeAllAllocations")
    void removeAllAllocations();

    /**
     * removeAllocation
     * 
     * Marks an allocation to be removed from the set on the next commit call.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeAllocation:")
    void removeAllocation(@Mapped(ObjCObjectMapper.class) @NotNull MTLAllocation allocation);

    /**
     * removeAllocations
     * 
     * Marks allocations to be removed from the set on the next commit call.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("removeAllocations:count:")
    void removeAllocationsCount(@ReferenceInfo(type = ObjCObject.class) @NotNull ConstPtr<ObjCObject> allocations,
            @NUInt long count);

    /**
     * requestResidency
     * 
     * Requests that the set and all the committed resources and heaps are made resident.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("requestResidency")
    void requestResidency();
}