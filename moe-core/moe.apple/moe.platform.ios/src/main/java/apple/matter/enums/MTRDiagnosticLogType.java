package apple.matter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This enum is used to specify the type of log requested from this device.
 * 
 * The log types are : End User Support, Network Diagnostics and Crash logs.
 * 
 * API-Since: 17.6
 */
@Generated
public final class MTRDiagnosticLogType {
    @Generated
    private MTRDiagnosticLogType() {
    }

    /**
     * End user support log is requested
     * 
     * API-Since: 17.6
     */
    @Generated @NInt public static final long EndUserSupport = 0x0000000000000000L;
    /**
     * Network Diagnostics log is requested
     * 
     * API-Since: 17.6
     */
    @Generated @NInt public static final long NetworkDiagnostics = 0x0000000000000001L;
    /**
     * Crash log is requested
     * 
     * API-Since: 17.6
     */
    @Generated @NInt public static final long Crash = 0x0000000000000002L;
}