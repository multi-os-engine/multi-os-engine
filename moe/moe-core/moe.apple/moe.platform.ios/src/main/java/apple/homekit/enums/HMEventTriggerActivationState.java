package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class HMEventTriggerActivationState {
    @Generated
    private HMEventTriggerActivationState() {
    }

    @Generated @NUInt public static final long Disabled = 0x0000000000000000L;
    @Generated @NUInt public static final long DisabledNoHomeHub = 0x0000000000000001L;
    @Generated @NUInt public static final long DisabledNoCompatibleHomeHub = 0x0000000000000002L;
    @Generated @NUInt public static final long DisabledNoLocationServicesAuthorization = 0x0000000000000003L;
    @Generated @NUInt public static final long Enabled = 0x0000000000000004L;
}