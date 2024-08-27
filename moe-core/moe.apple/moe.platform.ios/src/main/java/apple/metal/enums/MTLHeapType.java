package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLHeapType
 * 
 * Describes the mode of operation for an MTLHeap.
 * [@constant] MTLHeapTypeAutomatic
 * In this mode, resources are placed in the heap automatically.
 * Automatically placed resources have optimal GPU-specific layout, and may perform better than MTLHeapTypePlacement.
 * This heap type is recommended when the heap primarily contains temporary write-often resources.
 * [@constant] MTLHeapTypePlacement
 * In this mode, the app places resources in the heap.
 * Manually placed resources allow the app to control memory usage and heap fragmentation directly.
 * This heap type is recommended when the heap primarily contains persistent write-rarely resources.
 * 
 * API-Since: 13.0
 */
@Generated
public final class MTLHeapType {
    @Generated
    private MTLHeapType() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Placement = 0x0000000000000001L;
    @Generated @NInt public static final long Sparse = 0x0000000000000002L;
}
