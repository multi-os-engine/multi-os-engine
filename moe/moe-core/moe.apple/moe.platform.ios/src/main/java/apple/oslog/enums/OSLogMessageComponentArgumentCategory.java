package apple.oslog.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] OSLogMessageComponentArgumentCategory
 * <p>
 * The kind of data corresponding to an argument in a message
 * payload, like the number associated with a "%d" placeholder.
 * This value can be undefined if the argument data cannot be
 * decoded; for example, it may be redacted.
 */
@Generated
public final class OSLogMessageComponentArgumentCategory {
    @Generated
    private OSLogMessageComponentArgumentCategory() {
    }

    @Generated @NInt public static final long Undefined = 0x0000000000000000L;
    @Generated @NInt public static final long Data = 0x0000000000000001L;
    @Generated @NInt public static final long Double = 0x0000000000000002L;
    @Generated @NInt public static final long Int64 = 0x0000000000000003L;
    @Generated @NInt public static final long String = 0x0000000000000004L;
    @Generated @NInt public static final long UInt64 = 0x0000000000000005L;
}
