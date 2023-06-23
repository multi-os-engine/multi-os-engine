package apple.avrouting.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@constant] AVCustomRoutingEventReasonActivate
 * Represents an activation event, e.g. a user selected a route in the picker.
 * [@constant] AVCustomRoutingEventReasonDeactivate
 * Represents a deactivation event, e.g. a user deselected a route in the picker.
 * [@constant] AVCustomRoutingEventReasonReactivate
 * Represents a reactivation event, e.g. a route that is already authorized is selected by the user.
 */
@Generated
public final class AVCustomRoutingEventReason {
    @Generated
    private AVCustomRoutingEventReason() {
    }

    @Generated @NInt public static final long Activate = 0x0000000000000000L;
    @Generated @NInt public static final long Deactivate = 0x0000000000000001L;
    @Generated @NInt public static final long Reactivate = 0x0000000000000002L;
}