package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRIdentifyType {
    @Generated
    private MTRIdentifyType() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte None = 0;
    /**
     * API-Since: 17.0
     */
    @Generated public static final byte LightOutput = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRIdentifyTypeLightOutput
     */
    @Generated @Deprecated public static final byte VisibleLight = 1;
    /**
     * API-Since: 17.0
     */
    @Generated public static final byte VisibleIndicator = 2;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRIdentifyTypeVisibleIndicator
     */
    @Generated @Deprecated public static final byte VisibleLED = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte AudibleBeep = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Display = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Actuator = 5;
}