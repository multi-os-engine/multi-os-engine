package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 13.0
 */
@Generated
public final class NSRelativeDateTimeFormatterUnitsStyle {
    @Generated
    private NSRelativeDateTimeFormatterUnitsStyle() {
    }

    /**
     * "2 months ago"
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Full = 0x0000000000000000L;
    /**
     * "two months ago"
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long SpellOut = 0x0000000000000001L;
    /**
     * "2 mo. ago"
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Short = 0x0000000000000002L;
    /**
     * "2 mo. ago"; might give different results in languages other than English
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long Abbreviated = 0x0000000000000003L;
}