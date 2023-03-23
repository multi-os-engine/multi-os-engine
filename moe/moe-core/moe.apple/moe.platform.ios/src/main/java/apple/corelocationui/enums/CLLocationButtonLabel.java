package apple.corelocationui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CLLocationButtonLabel
 * 
 * Discussion:
 * Specifies the text of the label on the button. Button must not be CLLocationButtonLabelNone if CLLocationButtonIcon
 * is CLLocationButtonIconNone.
 */
@Generated
public final class CLLocationButtonLabel {
    @Generated
    private CLLocationButtonLabel() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long CurrentLocation = 0x0000000000000001L;
    @Generated @NInt public static final long SendCurrentLocation = 0x0000000000000002L;
    @Generated @NInt public static final long SendMyCurrentLocation = 0x0000000000000003L;
    @Generated @NInt public static final long ShareCurrentLocation = 0x0000000000000004L;
    @Generated @NInt public static final long ShareMyCurrentLocation = 0x0000000000000005L;
}
