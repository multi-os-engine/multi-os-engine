package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRGeneralCommissioningCommissioningError {
    @Generated
    private MTRGeneralCommissioningCommissioningError() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte OK = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRGeneralCommissioningCommissioningErrorOK
     */
    @Generated @Deprecated public static final byte Ok = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte ValueOutsideRange = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte InvalidAuthentication = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte NoFailSafe = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte BusyWithOtherAdmin = 4;
}