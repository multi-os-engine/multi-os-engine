package apple.corelocationui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CLLocationButtonIcon
 * <p>
 * Discussion:
 * Specifies the type of arrow icon on the button. Button must not be CLLocationButtonIconNone if CLLocationButtonLabel
 * is CLLocationButtonLabelNone.
 */
@Generated
public final class CLLocationButtonIcon {
    @Generated
    private CLLocationButtonIcon() {
    }

    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ArrowFilled = 0x0000000000000001L;
    @Generated @NInt public static final long ArrowOutline = 0x0000000000000002L;
}
