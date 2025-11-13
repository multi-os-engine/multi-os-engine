package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class UIHDRHeadroomUsageLimit {
    @Generated
    private UIHDRHeadroomUsageLimit() {
    }

    /**
     * Headroom usage limits are not defined
     */
    @Generated @NInt public static final long Unspecified = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Headroom usage limits are in effect, HDR headroom usage should be restricted
     */
    @Generated @NInt public static final long Active = 0x0000000000000000L;
    /**
     * Headroom usage limits are disabled, HDR headroom usage is unrestricted.
     */
    @Generated @NInt public static final long Inactive = 0x0000000000000001L;
}