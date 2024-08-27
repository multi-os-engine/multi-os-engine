package apple.corenfc.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Request code parameter for the polling command
 * 
 * API-Since: 14.0
 */
@Generated
public final class NFCFeliCaPollingRequestCode {
    @Generated
    private NFCFeliCaPollingRequestCode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCFeliCaPollingRequestCodeNoRequest = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCFeliCaPollingRequestCodeSystemCode = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long NFCFeliCaPollingRequestCodeCommunicationPerformance = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long PollingRequestCodeNoRequest = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long PollingRequestCodeSystemCode = 0x0000000000000001L;
    /**
     * API-Since: 13.0
     * Deprecated-Since: 14.0
     */
    @Deprecated @Generated @NInt public static final long PollingRequestCodeCommunicationPerformance = 0x0000000000000002L;
}