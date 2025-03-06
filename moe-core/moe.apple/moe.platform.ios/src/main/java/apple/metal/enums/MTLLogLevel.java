package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] MTLLogLevel
 * 
 * The level of the log entry.
 * 
 * API-Since: 18.0
 */
@Generated
public final class MTLLogLevel {
    @Generated
    private MTLLogLevel() {
    }

    /**
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    /**
     * A log level that captures diagnostic information.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Debug = 0x0000000000000001L;
    /**
     * The log level that captures additional information.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Info = 0x0000000000000002L;
    /**
     * The log level that captures notifications.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Notice = 0x0000000000000003L;
    /**
     * The log level that captures errors.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Error = 0x0000000000000004L;
    /**
     * The log level that captures fault information.
     * 
     * API-Since: 18.0
     */
    @Generated @NInt public static final long Fault = 0x0000000000000005L;
}