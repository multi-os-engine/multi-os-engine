package apple.corelocationui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Constants that specify the text of the button label.
 */
@Generated
public final class CLLocationButtonLabel {
    @Generated
    private CLLocationButtonLabel() {
    }

    /**
     * A style that doesn’t display a text label.
     * 
     * Use a different label style if ``CLLocationButton/icon`` is ``CLLocationButtonIcon/none``.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * A button label with the text _Current Location_.
     */
    @Generated @NInt public static final long CurrentLocation = 0x0000000000000001L;
    /**
     * A button label with the text _Send Current Location_.
     */
    @Generated @NInt public static final long SendCurrentLocation = 0x0000000000000002L;
    /**
     * A button label with the text _Send My Current Location_.
     */
    @Generated @NInt public static final long SendMyCurrentLocation = 0x0000000000000003L;
    /**
     * A button label with the text _Share Current Location_.
     */
    @Generated @NInt public static final long ShareCurrentLocation = 0x0000000000000004L;
    /**
     * A button label with the text _Share My Current Location_.
     */
    @Generated @NInt public static final long ShareMyCurrentLocation = 0x0000000000000005L;
}
