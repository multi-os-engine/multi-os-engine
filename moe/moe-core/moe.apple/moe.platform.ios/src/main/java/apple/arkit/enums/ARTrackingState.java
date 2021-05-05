package apple.arkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * A value describing the camera’s tracking state.
 */
@Generated
public final class ARTrackingState {
    @Generated
    private ARTrackingState() {
    }

    /**
     * Tracking is not available.
     */
    @Generated @NInt public static final long NotAvailable = 0x0000000000000000L;
    /**
     * Tracking is limited. See tracking reason for details.
     */
    @Generated @NInt public static final long Limited = 0x0000000000000001L;
    /**
     * Tracking is Normal.
     */
    @Generated @NInt public static final long Normal = 0x0000000000000002L;
}