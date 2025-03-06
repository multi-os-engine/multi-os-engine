package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRColorControlColorMode {
    @Generated
    private MTRColorControlColorMode() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte CurrentHueAndCurrentSaturation = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte CurrentXAndCurrentY = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlColorModeColorTemperatureMireds
     */
    @Deprecated @Generated public static final byte ColorTemperature = 2;
    /**
     * API-Since: 18.2
     */
    @Generated public static final byte ColorTemperatureMireds = 2;
}