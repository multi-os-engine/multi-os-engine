package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRAudioOutputOutputType {
    @Generated
    private MTRAudioOutputOutputType() {
    }

    /**
     * API-Since: 16.4
     */
    @Generated public static final byte HDMI = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAudioOutputOutputTypeHDMI
     */
    @Generated @Deprecated public static final byte Hdmi = 0;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte BT = 1;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRAudioOutputOutputTypeBT
     */
    @Generated @Deprecated public static final byte Bt = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Optical = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Headphone = 3;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Internal = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Other = 5;
}