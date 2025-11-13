package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Provides a hint to the system about the desired accuracy when writing GPU counter timestamps.
 * 
 * Pass these values to ``MTL4ComputeCommandEncoder/writeTimestampWithGranularity:intoHeap:atIndex:`` and
 * ``MTL4RenderCommandEncoder/writeTimestampWithGranularity:afterStage:intoHeap:atIndex:`` to control the
 * desired accurracy of the counter sampling operation.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4TimestampGranularity {
    @Generated
    private MTL4TimestampGranularity() {
    }

    /**
     * A minimally-invasive timestamp which may be less precise.
     * 
     * Using this granularity incurs in the lowest overhead, at the cost of precision. For example, it may sample at
     * command encoder boundaries.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Relaxed = 0x0000000000000000L;
    /**
     * A timestamp as precise as possible.
     * 
     * Using this granularity may incur in a performance penalty, for example, it may cause splitting of command
     * encoders.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Precise = 0x0000000000000001L;
}