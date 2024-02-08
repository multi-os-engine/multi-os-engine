package apple.corelocationui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants that specify styles for the location arrow icon on the button.
 */
@Generated
public final class CLLocationButtonIcon {
    @Generated
    private CLLocationButtonIcon() {
    }

    /**
     * A style that doesn't display an icon.
     * 
     * Use a different icon style if ``CLLocationButton/label`` is ``CLLocationButtonLabel/none``.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * A style that displays a filled arrow icon.
     */
    @Generated @NInt public static final long ArrowFilled = 0x0000000000000001L;
    /**
     * A style that displays an unfilled, outline arrow icon.
     */
    @Generated @NInt public static final long ArrowOutline = 0x0000000000000002L;
}
