package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSRelativeDateTimeFormatterStyle {
    @Generated
    private NSRelativeDateTimeFormatterStyle() {
    }

    /**
     * "1 day ago", "2 days ago", "1 week ago", "in 1 week"
     */
    @Generated @NInt public static final long Numeric = 0x0000000000000000L;
    /**
     * “yesterday”, "2 days ago", "last week", "next week"; falls back to the numeric style if no name is available
     */
    @Generated @NInt public static final long Named = 0x0000000000000001L;
}