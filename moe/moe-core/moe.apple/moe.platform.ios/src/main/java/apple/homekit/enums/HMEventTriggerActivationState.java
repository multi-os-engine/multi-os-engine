package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * @abstract This enumeration describes the current activation state of the event trigger.
 */
@Generated
public final class HMEventTriggerActivationState {
    @Generated
    private HMEventTriggerActivationState() {
    }

    /**
     * Trigger is not active because it is disabled
     */
    @Generated @NUInt public static final long Disabled = 0x0000000000000000L;
    /**
     * Trigger is not active because there is no HomeHub
     */
    @Generated @NUInt public static final long DisabledNoHomeHub = 0x0000000000000001L;
    /**
     * Trigger is not active because there is no compatible HomeHub
     */
    @Generated @NUInt public static final long DisabledNoCompatibleHomeHub = 0x0000000000000002L;
    /**
     * Trigger is not active because Location Authorization has been turned off by user
     */
    @Generated @NUInt public static final long DisabledNoLocationServicesAuthorization = 0x0000000000000003L;
    /**
     * Trigger is currently active
     */
    @Generated @NUInt public static final long Enabled = 0x0000000000000004L;
}