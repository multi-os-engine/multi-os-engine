package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Reasons why your navigation alert was dismissed.
 * 
 * API-Since: 12.0
 */
@Generated
public final class CPNavigationAlertDismissalContext {
    @Generated
    private CPNavigationAlertDismissalContext() {
    }

    /**
     * The banner was visible long enough to reach its timeout.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Timeout = 0x0000000000000000L;
    /**
     * The banner was dismissed in response to a user button press.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long UserDismissed = 0x0000000000000001L;
    /**
     * The banner was dismissed because of a request by the app.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long SystemDismissed = 0x0000000000000002L;
}