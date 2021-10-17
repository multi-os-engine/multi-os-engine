package apple.coremotion.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Fall Detection Event Resolution
 * [@sa] CMFallDetectionEvent
 * <p>
 * This enumeration defines the different states in which a Fall Detection event can be resolved
 */
@Generated
public final class CMFallDetectionEventUserResolution {
    @Generated
    private CMFallDetectionEventUserResolution() {
    }

    /**
     * < the user confirmed the fall alert
     */
    @Generated @NInt public static final long Confirmed = 0x0000000000000000L;
    /**
     * < the user dismissed the fall alert either immediately or after a sequence of haptics and chimes
     */
    @Generated @NInt public static final long Dismissed = 0x0000000000000001L;
    /**
     * < the user rejected the fall alert, indicating that they didn't fall
     */
    @Generated @NInt public static final long Rejected = 0x0000000000000002L;
    /**
     * < the user did not respond to the fall alert and no recovery motion was detected
     */
    @Generated @NInt public static final long Unresponsive = 0x0000000000000003L;
}
