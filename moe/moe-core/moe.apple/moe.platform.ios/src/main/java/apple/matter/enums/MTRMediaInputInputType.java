package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRMediaInputInputType {
    @Generated
    private MTRMediaInputInputType() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Internal = 0;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Aux = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Coax = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Composite = 3;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte HDMI = 4;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRMediaInputInputTypeHDMI
     */
    @Generated @Deprecated public static final byte Hdmi = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Input = 5;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Line = 6;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Optical = 7;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Video = 8;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte SCART = 9;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRMediaInputInputTypeSCART
     */
    @Generated @Deprecated public static final byte Scart = 9;
    /**
     * API-Since: 16.4
     */
    @Generated public static final byte USB = 10;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use MTRMediaInputInputTypeUSB
     */
    @Generated @Deprecated public static final byte Usb = 10;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Other = 11;
}