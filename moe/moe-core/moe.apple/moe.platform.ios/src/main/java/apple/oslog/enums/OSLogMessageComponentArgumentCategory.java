package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogMessageComponentArgumentCategory
 * 
 * The kind of data corresponding to an argument in a message
 * payload, like the number associated with a "%d" placeholder.
 * This value can be undefined if the argument data cannot be
 * decoded; for example, it may be redacted.
 * 
 * API-Since: 15.0
 */
@Generated
public final class OSLogMessageComponentArgumentCategory {
    @Generated
    private OSLogMessageComponentArgumentCategory() {
    }

    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Data = 0x0000000000000001L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Double = 0x0000000000000002L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Int64 = 0x0000000000000003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long String = 0x0000000000000004L;
    /**
     * API-Since: 15.0
     */
    @Generated @NInt public static final long UInt64 = 0x0000000000000005L;
}
