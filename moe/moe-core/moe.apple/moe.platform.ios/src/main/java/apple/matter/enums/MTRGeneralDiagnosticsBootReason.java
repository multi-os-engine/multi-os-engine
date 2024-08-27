package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.4
 */
@Generated
public final class MTRGeneralDiagnosticsBootReason {
    @Generated
    private MTRGeneralDiagnosticsBootReason() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte Unspecified = 0;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte PowerOnReboot = 1;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte BrownOutReset = 2;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte SoftwareWatchdogReset = 3;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte HardwareWatchdogReset = 4;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte SoftwareUpdateCompleted = 5;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte SoftwareReset = 6;
}