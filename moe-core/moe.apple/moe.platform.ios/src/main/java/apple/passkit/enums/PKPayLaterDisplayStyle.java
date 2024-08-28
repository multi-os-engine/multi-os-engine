package apple.passkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.0
 */
@Generated
public final class PKPayLaterDisplayStyle {
    @Generated
    private PKPayLaterDisplayStyle() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000000L;
    /**
     * The Standard Merchandising Widget
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Badge = 0x0000000000000001L;
    /**
     * Displays a simple Pay badge with the pay later info graphic
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Checkout = 0x0000000000000002L;
    /**
     * To be displayed inside of a toggleable checkout view
     * 
     * API-Since: 17.0
     */
    @Generated @NInt public static final long Price = 0x0000000000000003L;
}