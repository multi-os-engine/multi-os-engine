package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the type of a ``MTL4CounterHeap`` and the contents of its entries.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4CounterHeapType {
    @Generated
    private MTL4CounterHeapType() {
    }

    /**
     * Specifies that ``MTL4CounterHeap`` entries contain invalid data.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Invalid = 0x0000000000000000L;
    /**
     * Specifies that ``MTL4CounterHeap`` entries contain GPU timestamp data.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Timestamp = 0x0000000000000001L;
}