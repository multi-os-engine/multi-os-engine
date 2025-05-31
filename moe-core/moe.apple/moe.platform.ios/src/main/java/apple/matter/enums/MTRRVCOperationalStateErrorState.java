package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 17.4
 */
@Generated
public final class MTRRVCOperationalStateErrorState {
    @Generated
    private MTRRVCOperationalStateErrorState() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated public static final byte FailedToFindChargingDock = 64;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte Stuck = 65;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte DustBinMissing = 66;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte DustBinFull = 67;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte WaterTankEmpty = 68;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte WaterTankMissing = 69;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte WaterTankLidOpen = 70;
    /**
     * API-Since: 17.4
     */
    @Generated public static final byte MopCleaningPadMissing = 71;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte NoError = 0;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte UnableToStartOrResume = 1;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte UnableToCompleteOperation = 2;
    /**
     * API-Since: 18.4
     */
    @Generated public static final byte CommandInvalidInState = 3;
}