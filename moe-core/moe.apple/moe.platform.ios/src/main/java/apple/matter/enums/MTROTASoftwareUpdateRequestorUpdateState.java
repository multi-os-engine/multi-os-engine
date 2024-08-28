package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.2
 */
@Generated
public final class MTROTASoftwareUpdateRequestorUpdateState {
    @Generated
    private MTROTASoftwareUpdateRequestorUpdateState() {
    }

    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Unknown = 0;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Idle = 1;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Querying = 2;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte DelayedOnQuery = 3;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Downloading = 4;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte Applying = 5;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte DelayedOnApply = 6;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte RollingBack = 7;
    /**
     * API-Since: 17.2
     */
    @Generated public static final byte DelayedOnUserConsent = 8;
}