package apple.avrouting.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Values that indicate the reason for a routing event.
 */
@Generated
public final class AVCustomRoutingEventReason {
    @Generated
    private AVCustomRoutingEventReason() {
    }

    /**
     * A value that indicates that a user selects a route in the picker.
     */
    @Generated @NInt public static final long Activate = 0x0000000000000000L;
    /**
     * A value that indicates that a user deselects a route in the picker.
     */
    @Generated @NInt public static final long Deactivate = 0x0000000000000001L;
    /**
     * A value that indicates to reactivate a route a user authorized previously.
     */
    @Generated @NInt public static final long Reactivate = 0x0000000000000002L;
}