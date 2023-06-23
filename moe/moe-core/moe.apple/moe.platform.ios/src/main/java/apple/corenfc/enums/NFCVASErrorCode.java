package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] NFCVASErrorCode
 * 
 * Response APDU status word.
 * 
 * API-Since: 13.0
 */
@Generated
public final class NFCVASErrorCode {
    @Generated
    private NFCVASErrorCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeSuccess = 0x0000000000009000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeDataNotFound = 0x0000000000006A83L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeDataNotActivated = 0x0000000000006287L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeWrongParameters = 0x0000000000006B00L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeWrongLCField = 0x0000000000006700L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeUserIntervention = 0x0000000000006984L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeIncorrectData = 0x0000000000006A80L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCVASErrorCodeUnsupportedApplicationVersion = 0x0000000000006340L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeSuccess = 0x0000000000009000L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeDataNotFound = 0x0000000000006A83L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeDataNotActivated = 0x0000000000006287L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeWrongParameters = 0x0000000000006B00L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeWrongLCField = 0x0000000000006700L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeUserIntervention = 0x0000000000006984L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeIncorrectData = 0x0000000000006A80L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long VASErrorCodeUnsupportedApplicationVersion = 0x0000000000006340L;
}
