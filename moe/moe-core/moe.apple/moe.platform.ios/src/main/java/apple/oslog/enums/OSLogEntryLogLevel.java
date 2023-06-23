package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogEntryLogLevel
 * 
 * The level that this entry was generated at.
 * 
 * API-Since: 15.0
 */
@Generated
public final class OSLogEntryLogLevel {
    @Generated
    private OSLogEntryLogLevel() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Debug = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Info = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Notice = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Error = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Fault = 0x0000000000000005L;
}
