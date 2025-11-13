package apple.metal.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Base class for Metal allocations.
 * 
 * This protocol provides a common interface for adding Metal resources to ``MTLResidencySet`` instances. Call
 * ``MTLResidencySet/addAllocation:`` to add a Metal resource allocation to a residency set.
 * 
 * <doc:simplifying-gpu-resource-management-with-residency-sets.md>
 * 
 * API-Since: 18.0
 */
@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTLAllocation")
public interface MTLAllocation {
    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("allocatedSize")
    @NUInt
    long allocatedSize();
}