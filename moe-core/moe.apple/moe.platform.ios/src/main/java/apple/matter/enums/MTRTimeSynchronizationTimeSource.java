package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRTimeSynchronizationTimeSource {
    @Generated
    private MTRTimeSynchronizationTimeSource() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte None = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Unknown = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Admin = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NodeTimeCluster = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NonFabricSntp = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NonFabricNtp = 5;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte FabricSntp = 6;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte FabricNtp = 7;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte MixedNtp = 8;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NonFabricSntpNts = 9;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NonFabricNtpNts = 10;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte FabricSntpNts = 11;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte FabricNtpNts = 12;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte MixedNtpNts = 13;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte CloudSource = 14;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Ptp = 15;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Gnss = 16;
}