package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIFindSessionSearchResultDisplayStyle {
    @Generated
    private UIFindSessionSearchResultDisplayStyle() {
    }

    /**
     * Displays the total number of reported results, and which result index is currently highlighted (i.e., "1 of 5").
     */
    @Generated @NInt public static final long CurrentAndTotal = 0x0000000000000000L;
    /**
     * Displays only the total number of reported results (i.e., "5 results").
     */
    @Generated @NInt public static final long Total = 0x0000000000000001L;
    /**
     * Do not display number of reported results.
     */
    @Generated @NInt public static final long None = 0x0000000000000002L;
}