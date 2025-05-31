package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRApplicationLauncherStatus {
    @Generated
    private MTRApplicationLauncherStatus() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Success = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AppNotAvailable = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte SystemBusy = 2;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte PendingUserApproval = 3;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte Downloading = 4;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte Installing = 5;
}