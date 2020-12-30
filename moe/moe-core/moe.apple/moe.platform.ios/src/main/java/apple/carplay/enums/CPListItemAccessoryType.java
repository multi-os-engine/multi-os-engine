package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class CPListItemAccessoryType {
    @Generated
    private CPListItemAccessoryType() {
    }

    /**
     * The list item will render without a trailing accessory, or using your custom image.
     */
    @Generated @NInt public static final long None = 0x0000000000000000L;
    /**
     * The list item will display a disclosure indicator on its trailing side.
     */
    @Generated @NInt public static final long DisclosureIndicator = 0x0000000000000001L;
    /**
     * The list item will display a cloud image on its trailing side, perhaps indicating remotely-available content.
     */
    @Generated @NInt public static final long Cloud = 0x0000000000000002L;
}