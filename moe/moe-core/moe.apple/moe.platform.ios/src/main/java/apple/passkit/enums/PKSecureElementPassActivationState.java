package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.4
 */
@Generated
public final class PKSecureElementPassActivationState {
    @Generated
    private PKSecureElementPassActivationState() {
    }

    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Activated = 0x0000000000000000L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long RequiresActivation = 0x0000000000000001L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Activating = 0x0000000000000002L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Suspended = 0x0000000000000003L;
    /**
     * API-Since: 13.4
     */
    @Generated @NInt public static final long Deactivated = 0x0000000000000004L;
}