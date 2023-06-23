package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLDispatchType
 * 
 * MTLDispatchType Describes how a command encoder will execute dispatched work.
 * 
 * [@constant] MTLDispatchTypeSerial
 * Command encoder dispatches are executed in dispatched order.
 * 
 * [@constant] MTLDispatchTypeConcurrent
 * Command encoder dispatches are executed in parallel with each other.
 * 
 * API-Since: 12.0
 */
@Generated
public final class MTLDispatchType {
    @Generated
    private MTLDispatchType() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Serial = 0x0000000000000000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Concurrent = 0x0000000000000001L;
}
