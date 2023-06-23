package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Specifies the style used to display a @c CPBarButton.
 * 
 * API-Since: 14.0
 */
@Generated
public final class CPBarButtonStyle {
    @Generated
    private CPBarButtonStyle() {
    }

    /**
     * The button will be displayed with no additional styling.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The button will be displayed with a rounded background.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Rounded = 0x0000000000000001L;
}